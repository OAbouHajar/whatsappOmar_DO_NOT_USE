package X;

import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.2PK  reason: invalid class name */
public class AnonymousClass2PK {
    public static byte[] A06 = {87, 65, 77, 5, 1, 0, 0, 2};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public final AnonymousClass1CK A04;
    public final RandomAccessFile A05;

    public AnonymousClass2PK(AnonymousClass1CK r5, RandomAccessFile randomAccessFile, int i2, int i3, int i4) {
        this.A05 = randomAccessFile;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A04 = r5;
        long j2 = 256;
        if (i2 != 0) {
            try {
                randomAccessFile.seek(60);
                j2 = 256 + ((long) randomAccessFile.readInt());
            } catch (Exception unused) {
            }
        }
        this.A03 = j2;
    }

    public final int A00(byte[] bArr, int i2) {
        int i3 = this.A00;
        int i4 = this.A02;
        if (i2 > i3 - i4) {
            return 0;
        }
        try {
            RandomAccessFile randomAccessFile = this.A05;
            randomAccessFile.seek(this.A03 + ((long) i4));
            randomAccessFile.write(bArr, 0, i2);
            this.A02 += i2;
            return i2;
        } catch (IOException unused) {
            AnonymousClass1CK r0 = this.A04;
            r0.A07();
            r0.A09();
            return 0;
        }
    }
}
