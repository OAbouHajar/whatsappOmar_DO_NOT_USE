package X;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.2s2  reason: invalid class name */
public final class AnonymousClass2s2 extends AnonymousClass3E3 {
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public AnonymousClass2s2() {
        super(false);
    }

    public Uri AGo() {
        return this.A01;
    }

    public long AZr(AnonymousClass3AL r8) {
        Uri uri;
        AnonymousClass40I r0;
        try {
            uri = r8.A04;
            this.A01 = uri;
            A01();
            RandomAccessFile randomAccessFile = new RandomAccessFile(uri.getPath(), "r");
            this.A02 = randomAccessFile;
            long j2 = r8.A03;
            randomAccessFile.seek(j2);
            long j3 = r8.A02;
            if (j3 == -1) {
                j3 = this.A02.length() - j2;
            }
            this.A00 = j3;
            if (j3 >= 0) {
                this.A03 = true;
                A03(r8);
                return this.A00;
            }
            throw new EOFException();
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                r0 = new AnonymousClass40I(e2, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}));
            } else {
                r0 = new AnonymousClass40I(e2);
            }
            throw r0;
        } catch (IOException e3) {
            throw new AnonymousClass40I(e3);
        }
    }

    public void close() {
        this.A01 = null;
        try {
            RandomAccessFile randomAccessFile = this.A02;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
        } catch (IOException e2) {
            throw new AnonymousClass40I(e2);
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
            throw th;
        }
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.A00;
        if (j2 == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i2, (int) Math.min(j2, (long) i3));
            if (read <= 0) {
                return read;
            }
            this.A00 -= (long) read;
            A02(read);
            return read;
        } catch (IOException e2) {
            throw new AnonymousClass40I(e2);
        }
    }
}
