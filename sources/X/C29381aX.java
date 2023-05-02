package X;

import javax.net.ssl.SSLException;

/* renamed from: X.1aX  reason: invalid class name and case insensitive filesystem */
public class C29381aX implements C29371aW {
    public C1055259y A00;
    public byte[] A01;
    public byte[] A02;

    public static byte[] A00(byte[] bArr, long j2) {
        byte[] bArr2 = {(byte) ((int) (j2 >> 56)), (byte) ((int) (j2 >> 48)), (byte) ((int) (j2 >> 40)), (byte) ((int) (j2 >> 32)), (byte) ((int) (j2 >> 24)), (byte) ((int) (j2 >> 16)), (byte) ((int) (j2 >> 8)), (byte) ((int) j2)};
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i2 = length - 8;
        System.arraycopy(bArr, 0, bArr3, 0, i2);
        for (int i3 = i2; i3 < length; i3++) {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3 - i2]);
        }
        return bArr3;
    }

    public final byte[] A01(byte[] bArr, int i2) {
        C1055259y r3 = this.A00;
        int AE9 = r3.AE9(i2);
        byte[] bArr2 = new byte[AE9];
        int Aar = r3.Aar(bArr, 0, i2, bArr2, 0);
        int A8A = Aar + this.A00.A8A(bArr2, Aar);
        if (A8A >= AE9) {
            return bArr2;
        }
        byte[] bArr3 = new byte[A8A];
        System.arraycopy(bArr2, 0, bArr3, 0, A8A);
        return bArr3;
    }

    public byte[] A7k(byte[] bArr, byte[] bArr2, int i2, int i3, long j2) {
        byte[] A002 = A00(this.A01, j2);
        C1055259y r3 = this.A00;
        byte[] bArr3 = this.A02;
        r3.AI1(new C1054259l(new C46922Gu(bArr3, bArr3.length), A002), false);
        this.A00.Aap(bArr, 0, bArr.length);
        try {
            return A01(bArr2, i3);
        } catch (AnonymousClass5JC e2) {
            throw new C29351aU(new SSLException(e2), (byte) 51, true);
        }
    }

    public byte[] A8Q(byte[] bArr, byte[] bArr2, int i2, int i3, long j2) {
        byte[] A002 = A00(this.A01, j2);
        C1055259y r3 = this.A00;
        byte[] bArr3 = this.A02;
        r3.AI1(new C1054259l(new C46922Gu(bArr3, bArr3.length), A002), true);
        this.A00.Aap(bArr, 0, bArr.length);
        try {
            return A01(bArr2, i3);
        } catch (AnonymousClass5JC e2) {
            throw new C29351aU(new SSLException(e2), (byte) 80);
        }
    }

    public void AI0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 16) {
            throw new C29351aU(new SSLException("Invalid key length."), (byte) 80);
        } else if (bArr2 == null || bArr2.length != 12) {
            throw new C29351aU(new SSLException("Invalid iv length."), (byte) 80);
        } else {
            this.A00 = new C1055259y(new C1053259b());
            this.A02 = bArr;
            this.A01 = bArr2;
        }
    }
}
