package X;

import java.util.Arrays;

/* renamed from: X.3Za  reason: invalid class name and case insensitive filesystem */
public final class C66353Za extends C66383Zd implements Cloneable {
    public byte[] A00 = AnonymousClass4BB.A00;
    public byte[][] A01 = AnonymousClass4BB.A04;

    public C66353Za() {
        this.A00 = null;
        this.A00 = -1;
    }

    public final int A03() {
        int length;
        int A03 = super.A03();
        byte[] bArr = this.A00;
        if (!Arrays.equals(bArr, AnonymousClass4BB.A00)) {
            A03 = C66383Zd.A00(bArr.length, 1, A03);
        }
        byte[][] bArr2 = this.A01;
        if (bArr2 != null && (length = bArr2.length) > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            do {
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    i4++;
                    int length2 = bArr3.length;
                    i3 += C90704ef.A01(length2) + length2;
                }
                i2++;
            } while (i2 < length);
            A03 = A03 + i3 + i4;
        }
        return !"".equals("") ? A03 + C90704ef.A00(4) : A03;
    }

    public final void A05(C90704ef r4) {
        byte[] bArr = this.A00;
        if (!Arrays.equals(bArr, AnonymousClass4BB.A00)) {
            r4.A08(1, bArr);
        }
        byte[][] bArr2 = this.A01;
        if (bArr2 != null && bArr2.length > 0) {
            int i2 = 0;
            while (true) {
                byte[][] bArr3 = this.A01;
                if (i2 >= bArr3.length) {
                    break;
                }
                byte[] bArr4 = bArr3[i2];
                if (bArr4 != null) {
                    r4.A08(2, bArr4);
                }
                i2++;
            }
        }
        if (!"".equals("")) {
            r4.A07(4, "");
        }
        super.A05(r4);
    }

    public final /* synthetic */ Object clone() {
        try {
            C66353Za r2 = (C66353Za) super.A06();
            byte[][] bArr = this.A01;
            if (bArr != null && bArr.length > 0) {
                r2.A01 = (byte[][]) bArr.clone();
            }
            return r2;
        } catch (CloneNotSupportedException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C66353Za) {
                C66353Za r11 = (C66353Za) obj;
                if (Arrays.equals(this.A00, r11.A00) && "".equals("")) {
                    byte[][] bArr = this.A01;
                    byte[][] bArr2 = r11.A01;
                    int length = bArr == null ? 0 : bArr.length;
                    int length2 = bArr2 == null ? 0 : bArr2.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i2 >= length || bArr[i2] != null) {
                            while (i3 < length2 && bArr2[i3] == null) {
                                i3++;
                            }
                            boolean A1P = AnonymousClass3K3.A1P(i2, length);
                            boolean A1P2 = AnonymousClass3K3.A1P(i3, length2);
                            if (!A1P) {
                                if (A1P != A1P2 || !Arrays.equals(bArr[i2], bArr2[i3])) {
                                    break;
                                }
                                i2++;
                                i3++;
                            } else if (A1P2) {
                                C1043154v r1 = this.A00;
                                if (r1 != null && r1.A00 != 0) {
                                    return r1.equals(r11.A00);
                                }
                                C1043154v r0 = r11.A00;
                                if (r0 == null || r0.A00 == 0) {
                                    return true;
                                }
                            }
                        } else {
                            i2++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        int A09 = AnonymousClass3K2.A09("", AnonymousClass3K4.A0B(this.A00, (C66353Za.class.getName().hashCode() + 527) * 31) * 31);
        byte[][] bArr = this.A01;
        int length = bArr == null ? 0 : bArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            byte[] bArr2 = bArr[i4];
            if (bArr2 != null) {
                i3 = AnonymousClass3K4.A0B(bArr2, i3 * 31);
            }
        }
        int i5 = (((A09 + i3) * 31) + 1237) * 31;
        C1043154v r1 = this.A00;
        if (!(r1 == null || r1.A00 == 0)) {
            i2 = r1.hashCode();
        }
        return i5 + i2;
    }
}
