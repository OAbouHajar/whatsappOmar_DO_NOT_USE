package X;

import android.util.Base64;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.MessageDigest;

/* renamed from: X.40d  reason: invalid class name */
public class AnonymousClass40d extends RandomAccessFile {
    public long A00;
    public byte[] A01;
    public final MessageDigest A02 = MessageDigest.getInstance("SHA-256");

    public AnonymousClass40d(File file, String str) {
        super(file, str);
    }

    public String A00() {
        byte[] bArr = this.A01;
        if (bArr == null) {
            seek(this.A00);
            do {
            } while (read(new byte[8192], 0, 8192) != -1);
            bArr = this.A02.digest();
            this.A01 = bArr;
        }
        return Base64.encodeToString(bArr, 2);
    }

    public final void A01(long j2, byte[] bArr, int i2, int i3) {
        if (i3 > 0) {
            long j3 = this.A00;
            if (j3 >= j2 && j3 < ((long) i3) + j2) {
                this.A01 = null;
                int i4 = ((int) (j2 - j3)) + i3;
                this.A02.update(bArr, (i2 + i3) - i4, i4);
                this.A00 += (long) i4;
                length();
            }
        }
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = super.read(bArr, i2, i3);
        A01(getFilePointer() - ((long) read), bArr, i2, read);
        return read;
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        super.write(bArr, i2, i3);
        A01(getFilePointer() - ((long) i3), bArr, i2, i3);
    }
}
