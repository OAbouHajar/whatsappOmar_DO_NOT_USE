package X;

/* renamed from: X.2Gz  reason: invalid class name and case insensitive filesystem */
public class C46972Gz {
    public final byte[] A00;

    public C46972Gz(byte[] bArr) {
        this.A00 = bArr;
    }

    public final C1055259y A00(long j2, boolean z2) {
        C1055259y r4 = new C1055259y(new C1053259b());
        byte[] bArr = new byte[12];
        bArr[11] = (byte) ((int) j2);
        bArr[10] = (byte) ((int) (j2 >> 8));
        bArr[9] = (byte) ((int) (j2 >> 16));
        bArr[8] = (byte) ((int) (j2 >> 24));
        bArr[7] = (byte) ((int) (j2 >> 32));
        bArr[6] = (byte) ((int) (j2 >> 40));
        bArr[5] = (byte) ((int) (j2 >> 48));
        bArr[4] = (byte) ((int) (j2 >> 56));
        byte[] bArr2 = this.A00;
        r4.AI1(new C1054259l(new C46922Gu(bArr2, bArr2.length), bArr), z2);
        return r4;
    }

    public byte[] A01(byte[] bArr, byte[] bArr2, int i2, long j2) {
        try {
            C1055259y A002 = A00(j2, true);
            A002.Aap(bArr, 0, bArr.length);
            int AE9 = A002.AE9(i2);
            byte[] bArr3 = new byte[AE9];
            int Aar = A002.Aar(bArr2, 0, i2, bArr3, 0);
            int A8A = Aar + A002.A8A(bArr3, Aar);
            if (A8A >= AE9) {
                return bArr3;
            }
            byte[] bArr4 = new byte[A8A];
            System.arraycopy(bArr3, 0, bArr4, 0, A8A);
            return bArr4;
        } catch (AnonymousClass5JC e2) {
            throw new AssertionError(e2);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, long j2) {
        try {
            C1055259y A002 = A00(j2, false);
            A002.Aap(bArr, 0, bArr.length);
            int length = bArr2.length;
            int AE9 = A002.AE9(length);
            byte[] bArr3 = new byte[AE9];
            int Aar = A002.Aar(bArr2, 0, length, bArr3, 0);
            int A8A = Aar + A002.A8A(bArr3, Aar);
            if (A8A >= AE9) {
                return bArr3;
            }
            byte[] bArr4 = new byte[A8A];
            System.arraycopy(bArr3, 0, bArr4, 0, A8A);
            return bArr4;
        } catch (AnonymousClass5JC e2) {
            throw new AnonymousClass2H0(e2, this);
        }
    }
}
