package org.apache.commons.io.input;

import android.support.v4.view.MotionEventCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.ByteOrderMark;

public class BOMInputStream extends ProxyInputStream {
    private static final Comparator<ByteOrderMark> ByteOrderMarkLengthComparator = new Comparator<ByteOrderMark>() {
        public int compare(ByteOrderMark byteOrderMark, ByteOrderMark byteOrderMark2) {
            int length = byteOrderMark.length();
            int length2 = byteOrderMark2.length();
            if (length > length2) {
                return -1;
            }
            return length2 > length ? 1 : 0;
        }
    };
    private final List<ByteOrderMark> boms;
    private ByteOrderMark byteOrderMark;
    private int fbIndex;
    private int fbLength;
    private int[] firstBytes;
    private final boolean include;
    private int markFbIndex;
    private boolean markedAtStart;

    public BOMInputStream(InputStream inputStream) {
        this(inputStream, false, ByteOrderMark.UTF_8);
    }

    public BOMInputStream(InputStream inputStream, boolean z2) {
        this(inputStream, z2, ByteOrderMark.UTF_8);
    }

    public BOMInputStream(InputStream inputStream, boolean z2, ByteOrderMark... byteOrderMarkArr) {
        super(inputStream);
        if (byteOrderMarkArr == null || byteOrderMarkArr.length == 0) {
            throw new IllegalArgumentException("No BOMs specified");
        }
        this.include = z2;
        Arrays.sort(byteOrderMarkArr, ByteOrderMarkLengthComparator);
        this.boms = Arrays.asList(byteOrderMarkArr);
    }

    public BOMInputStream(InputStream inputStream, ByteOrderMark... byteOrderMarkArr) {
        this(inputStream, false, byteOrderMarkArr);
    }

    private ByteOrderMark find() {
        for (ByteOrderMark next : this.boms) {
            if (matches(next)) {
                return next;
            }
        }
        return null;
    }

    private boolean matches(ByteOrderMark byteOrderMark2) {
        for (int i2 = 0; i2 < byteOrderMark2.length(); i2++) {
            if (byteOrderMark2.get(i2) != this.firstBytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private int readFirstBytes() throws IOException {
        getBOM();
        int i2 = this.fbIndex;
        if (i2 >= this.fbLength) {
            return -1;
        }
        int[] iArr = this.firstBytes;
        this.fbIndex = i2 + 1;
        return iArr[i2];
    }

    public ByteOrderMark getBOM() throws IOException {
        if (this.firstBytes == null) {
            this.fbLength = 0;
            this.firstBytes = new int[this.boms.get(0).length()];
            int i2 = 0;
            while (true) {
                int[] iArr = this.firstBytes;
                if (i2 >= iArr.length) {
                    break;
                }
                iArr[i2] = this.in.read();
                this.fbLength++;
                if (this.firstBytes[i2] < 0) {
                    break;
                }
                i2++;
            }
            ByteOrderMark find = find();
            this.byteOrderMark = find;
            if (find != null && !this.include) {
                if (find.length() < this.firstBytes.length) {
                    this.fbIndex = this.byteOrderMark.length();
                } else {
                    this.fbLength = 0;
                }
            }
        }
        return this.byteOrderMark;
    }

    public String getBOMCharsetName() throws IOException {
        getBOM();
        ByteOrderMark byteOrderMark2 = this.byteOrderMark;
        if (byteOrderMark2 == null) {
            return null;
        }
        return byteOrderMark2.getCharsetName();
    }

    public boolean hasBOM() throws IOException {
        return getBOM() != null;
    }

    public boolean hasBOM(ByteOrderMark byteOrderMark2) throws IOException {
        if (this.boms.contains(byteOrderMark2)) {
            return this.byteOrderMark != null && getBOM().equals(byteOrderMark2);
        }
        throw new IllegalArgumentException("Stream not configure to detect " + byteOrderMark2);
    }

    public synchronized void mark(int i2) {
        this.markFbIndex = this.fbIndex;
        this.markedAtStart = this.firstBytes == null;
        this.in.mark(i2);
    }

    public int read() throws IOException {
        int readFirstBytes = readFirstBytes();
        return readFirstBytes >= 0 ? readFirstBytes : this.in.read();
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        int i5 = 0;
        while (i3 > 0 && i5 >= 0) {
            i5 = readFirstBytes();
            if (i5 >= 0) {
                bArr[i2] = (byte) (i5 & MotionEventCompat.ACTION_MASK);
                i3--;
                i4++;
                i2++;
            }
        }
        int read = this.in.read(bArr, i2, i3);
        if (read >= 0) {
            return i4 + read;
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }

    public synchronized void reset() throws IOException {
        this.fbIndex = this.markFbIndex;
        if (this.markedAtStart) {
            this.firstBytes = null;
        }
        this.in.reset();
    }

    public long skip(long j2) throws IOException {
        while (j2 > 0 && readFirstBytes() >= 0) {
            j2--;
        }
        return this.in.skip(j2);
    }
}
