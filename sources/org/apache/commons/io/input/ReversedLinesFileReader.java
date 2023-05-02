package org.apache.commons.io.input;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class ReversedLinesFileReader implements Closeable {
    /* access modifiers changed from: private */
    public final int avoidNewlineSplitBufferSize;
    /* access modifiers changed from: private */
    public final int blockSize;
    /* access modifiers changed from: private */
    public final int byteDecrement;
    private FilePart currentFilePart;
    /* access modifiers changed from: private */
    public final Charset encoding;
    /* access modifiers changed from: private */
    public final byte[][] newLineSequences;
    /* access modifiers changed from: private */
    public final RandomAccessFile randomAccessFile;
    private final long totalBlockCount;
    private final long totalByteLength;
    private boolean trailingNewlineOfFileSkipped;

    private class FilePart {
        private int currentLastBytePos;
        private final byte[] data;
        private byte[] leftOver;
        private final long no;

        private FilePart(long j2, int i2, byte[] bArr) throws IOException {
            this.no = j2;
            byte[] bArr2 = new byte[((bArr != null ? bArr.length : 0) + i2)];
            this.data = bArr2;
            long access$300 = (j2 - 1) * ((long) ReversedLinesFileReader.this.blockSize);
            if (j2 > 0) {
                ReversedLinesFileReader.this.randomAccessFile.seek(access$300);
                if (ReversedLinesFileReader.this.randomAccessFile.read(bArr2, 0, i2) != i2) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i2, bArr.length);
            }
            this.currentLastBytePos = bArr2.length - 1;
            this.leftOver = null;
        }

        private void createLeftOver() {
            int i2 = this.currentLastBytePos + 1;
            if (i2 > 0) {
                byte[] bArr = new byte[i2];
                this.leftOver = bArr;
                System.arraycopy(this.data, 0, bArr, 0, i2);
            } else {
                this.leftOver = null;
            }
            this.currentLastBytePos = -1;
        }

        private int getNewLineMatchByteCount(byte[] bArr, int i2) {
            for (byte[] bArr2 : ReversedLinesFileReader.this.newLineSequences) {
                boolean z2 = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i2 + length) - (bArr2.length - 1);
                    z2 &= length2 >= 0 && bArr[length2] == bArr2[length];
                }
                if (z2) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        /* access modifiers changed from: private */
        public String readLine() throws IOException {
            String str = null;
            boolean z2 = this.no == 1;
            int i2 = this.currentLastBytePos;
            while (true) {
                if (i2 > -1) {
                    if (!z2 && i2 < ReversedLinesFileReader.this.avoidNewlineSplitBufferSize) {
                        createLeftOver();
                        break;
                    }
                    int newLineMatchByteCount = getNewLineMatchByteCount(this.data, i2);
                    int i3 = newLineMatchByteCount;
                    if (newLineMatchByteCount <= 0) {
                        i2 -= ReversedLinesFileReader.this.byteDecrement;
                        if (i2 < 0) {
                            createLeftOver();
                            break;
                        }
                    } else {
                        int i4 = i2 + 1;
                        int i5 = (this.currentLastBytePos - i4) + 1;
                        if (i5 >= 0) {
                            byte[] bArr = new byte[i5];
                            System.arraycopy(this.data, i4, bArr, 0, i5);
                            str = new String(bArr, ReversedLinesFileReader.this.encoding);
                            this.currentLastBytePos = i2 - i3;
                        } else {
                            throw new IllegalStateException("Unexpected negative line length=" + i5);
                        }
                    }
                } else {
                    break;
                }
            }
            if (!z2 || this.leftOver == null) {
                return str;
            }
            String str2 = new String(this.leftOver, ReversedLinesFileReader.this.encoding);
            this.leftOver = null;
            return str2;
        }

        /* access modifiers changed from: private */
        public FilePart rollOver() throws IOException {
            if (this.currentLastBytePos <= -1) {
                long j2 = this.no;
                if (j2 > 1) {
                    ReversedLinesFileReader reversedLinesFileReader = ReversedLinesFileReader.this;
                    return new FilePart(j2 - 1, reversedLinesFileReader.blockSize, this.leftOver);
                } else if (this.leftOver == null) {
                    return null;
                } else {
                    throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.leftOver, ReversedLinesFileReader.this.encoding));
                }
            } else {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.currentLastBytePos);
            }
        }
    }

    public ReversedLinesFileReader(File file) throws IOException {
        this(file, 4096, Charset.defaultCharset().toString());
    }

    public ReversedLinesFileReader(File file, int i2, String str) throws IOException {
        this(file, i2, Charsets.toCharset(str));
    }

    public ReversedLinesFileReader(File file, int i2, Charset charset) throws IOException {
        this.trailingNewlineOfFileSkipped = false;
        this.blockSize = i2;
        this.encoding = charset;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
        this.randomAccessFile = randomAccessFile2;
        long length = randomAccessFile2.length();
        this.totalByteLength = length;
        int i3 = (int) (length % ((long) i2));
        if (i3 > 0) {
            this.totalBlockCount = (length / ((long) i2)) + 1;
        } else {
            this.totalBlockCount = length / ((long) i2);
            if (length > 0) {
                i3 = i2;
            }
        }
        this.currentFilePart = new FilePart(this.totalBlockCount, i3, (byte[]) null);
        Charset charset2 = Charsets.toCharset(charset);
        if (charset2.newEncoder().maxBytesPerChar() == 1.0f) {
            this.byteDecrement = 1;
        } else if (charset2 == Charset.forName(DefaultCrypto.UTF_8)) {
            this.byteDecrement = 1;
        } else if (charset2 == Charset.forName("Shift_JIS")) {
            this.byteDecrement = 1;
        } else if (charset2 == Charset.forName("UTF-16BE") || charset2 == Charset.forName("UTF-16LE")) {
            this.byteDecrement = 2;
        } else if (charset2 == Charset.forName("UTF-16")) {
            throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
        } else {
            throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
        }
        byte[][] bArr = {IOUtils.LINE_SEPARATOR_WINDOWS.getBytes(charset), IOUtils.LINE_SEPARATOR_UNIX.getBytes(charset), "\r".getBytes(charset)};
        this.newLineSequences = bArr;
        this.avoidNewlineSplitBufferSize = bArr[0].length;
    }

    public void close() throws IOException {
        this.randomAccessFile.close();
    }

    public String readLine() throws IOException {
        String access$100 = this.currentFilePart.readLine();
        while (access$100 == null) {
            FilePart access$200 = this.currentFilePart.rollOver();
            this.currentFilePart = access$200;
            if (access$200 == null) {
                break;
            }
            access$100 = access$200.readLine();
        }
        if (!"".equals(access$100) || this.trailingNewlineOfFileSkipped) {
            return access$100;
        }
        this.trailingNewlineOfFileSkipped = true;
        return readLine();
    }
}
