package X;

/* renamed from: X.5Hb  reason: invalid class name and case insensitive filesystem */
public class C107265Hb extends C107395Ia {
    public C107265Hb(String str) {
        super(str);
    }

    public C107265Hb(byte[] bArr) {
        super(bArr);
    }

    public C32051fZ A05() {
        return this;
    }

    public C32051fZ A06() {
        return this;
    }

    public final byte[] A0H() {
        byte[] bArr;
        byte[] bArr2;
        byte[] A03;
        int i2;
        byte[] bArr3 = this.A00;
        int length = bArr3.length;
        int i3 = length - 1;
        if (bArr3[i3] == 90) {
            if (!A0E()) {
                bArr2 = new byte[(length + 4)];
                System.arraycopy(bArr3, 0, bArr2, 0, i3);
                A03 = C32941ha.A03("0000Z");
                i2 = 5;
            } else if (!A0F()) {
                bArr2 = new byte[(length + 2)];
                System.arraycopy(bArr3, 0, bArr2, 0, i3);
                A03 = C32941ha.A03("00Z");
                i2 = 3;
            } else if (A0D()) {
                int i4 = length - 2;
                while (i4 > 0 && bArr3[i4] == 48) {
                    i4--;
                }
                if (bArr3[i4] == 46) {
                    bArr = new byte[(i4 + 1)];
                } else {
                    bArr = new byte[(i4 + 2)];
                    i4++;
                }
                System.arraycopy(bArr3, 0, bArr, 0, i4);
                bArr[i4] = 90;
                return bArr;
            }
            System.arraycopy(A03, 0, bArr2, i3, i2);
            return bArr2;
        }
        return bArr3;
    }
}
