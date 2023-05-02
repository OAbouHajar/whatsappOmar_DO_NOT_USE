package X;

import java.util.Arrays;

/* renamed from: X.1WK  reason: invalid class name */
public class AnonymousClass1WK {
    public final byte[] A00;

    public AnonymousClass1WK(int i2, int i3) {
        byte[] bArr = new byte[6];
        this.A00 = bArr;
        bArr[1] = (byte) i2;
        bArr[0] = (byte) (i2 >> 8);
        bArr[5] = (byte) i3;
        bArr[4] = (byte) (i3 >> 8);
        bArr[3] = (byte) (i3 >> 16);
        bArr[2] = (byte) (i3 >> 24);
    }

    public AnonymousClass1WK(byte[] bArr) {
        this.A00 = bArr;
    }

    public int A00() {
        byte[] bArr = this.A00;
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public int A01() {
        byte[] bArr = this.A00;
        return (bArr[5] & 255) | ((bArr[2] & 255) << 24) | ((bArr[3] & 255) << 16) | ((bArr[4] & 255) << 8);
    }

    public C37611pR A02() {
        C28581Wr A0U = C37611pR.A02.A0U();
        byte[] bArr = this.A00;
        C28631Ww A01 = C28631Ww.A01(bArr, 0, bArr.length);
        A0U.A03();
        C37611pR r1 = (C37611pR) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = A01;
        return (C37611pR) A0U.A02();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1WK)) {
            return false;
        }
        return Arrays.equals(this.A00, ((AnonymousClass1WK) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncdKeyId{deviceId=");
        sb.append(A00());
        sb.append(", epoch=");
        sb.append(A01());
        sb.append("}");
        return sb.toString();
    }
}
