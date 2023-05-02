package X;

/* renamed from: X.3ZC  reason: invalid class name */
public class AnonymousClass3ZC extends AnonymousClass3ZD {
    public final byte[] zzfp;

    public AnonymousClass3ZC(byte[] bArr) {
        this.zzfp = bArr;
    }

    public int A03() {
        if (this instanceof AnonymousClass3ZB) {
            return ((AnonymousClass3ZB) this).zzfm;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        int A02;
        AnonymousClass556 r7;
        int A022;
        String str;
        if (obj != this) {
            if ((obj instanceof AnonymousClass556) && (A02 = A02()) == (A022 = r7.A02())) {
                if (A02 != 0) {
                    if (!(obj instanceof AnonymousClass3ZC)) {
                        return obj.equals(this);
                    }
                    int i2 = this.zzfk;
                    int i3 = (r7 = (AnonymousClass556) obj).zzfk;
                    if (i2 == 0 || i3 == 0 || i2 == i3) {
                        if (A02 > A022) {
                            StringBuilder A0g = C13690nt.A0g(40);
                            A0g.append("Length too large: ");
                            A0g.append(A02);
                            str = AnonymousClass000.A0l(A0g, A02);
                        } else if (A02 <= A022) {
                            boolean z2 = r7 instanceof AnonymousClass3ZC;
                            AnonymousClass3ZC r72 = (AnonymousClass3ZC) r7;
                            if (z2) {
                                byte[] bArr = this.zzfp;
                                byte[] bArr2 = r72.zzfp;
                                int A03 = A03();
                                int i4 = A02 + A03;
                                int A032 = r72.A03();
                                while (A03 < i4) {
                                    if (bArr[A03] != bArr2[A032]) {
                                        return false;
                                    }
                                    A03++;
                                    A032++;
                                }
                                return true;
                            }
                            int A00 = AnonymousClass556.A00(0, A02, r72.A02());
                            Object r4 = A00 == 0 ? AnonymousClass556.A00 : new AnonymousClass3ZB(r72.zzfp, r72.A03(), A00);
                            int A002 = AnonymousClass556.A00(0, A02, A02());
                            return r4.equals(A002 == 0 ? AnonymousClass556.A00 : new AnonymousClass3ZB(this.zzfp, A03(), A002));
                        } else {
                            StringBuilder A0g2 = C13690nt.A0g(59);
                            A0g2.append("Ran off end of other: 0, ");
                            A0g2.append(A02);
                            str = C13680ns.A0i(", ", A0g2, A022);
                        }
                        throw AnonymousClass000.A0T(str);
                    }
                }
            }
            return false;
        }
        return true;
    }
}
