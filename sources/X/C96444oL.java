package X;

/* renamed from: X.4oL  reason: invalid class name and case insensitive filesystem */
public final class C96444oL implements AnonymousClass5R9 {
    public final C90504eH A00 = new C90504eH();
    public final AnonymousClass4X5 A01;

    public C96444oL(AnonymousClass4X5 r2) {
        this.A01 = r2;
    }

    public void AWs() {
        C90504eH r2 = this.A00;
        byte[] bArr = AnonymousClass3C1.A0A;
        r2.A0U(bArr, bArr.length);
    }

    public C88084Zv Ad7(C55142iu r22, long j2) {
        int A012;
        int A0C;
        long j3;
        C55142iu r5 = r22;
        long AF7 = r5.AF7();
        int min = (int) Math.min(20000, r5.getLength() - AF7);
        C90504eH r4 = this.A00;
        r4.A0Q(min);
        r5.AaL(r4.A02, 0, min);
        int i2 = -1;
        long j4 = -9223372036854775807L;
        int i3 = -1;
        while (true) {
            int i4 = r4.A00;
            int i5 = r4.A01;
            if (i4 - i5 < 4) {
                return j4 != -9223372036854775807L ? new C88084Zv(-2, j4, AF7 + ((long) i2)) : C88084Zv.A03;
            }
            if (AnonymousClass3K2.A0C(r4.A02, i5) != 442) {
                r4.A0T(1);
            } else {
                r4.A0T(4);
                long A002 = C88374aO.A00(r4);
                if (A002 != -9223372036854775807L) {
                    long A02 = this.A01.A02(A002);
                    if (A02 > j2) {
                        if (j4 == -9223372036854775807L) {
                            return new C88084Zv(-1, A02, AF7);
                        }
                        j3 = (long) i3;
                    } else if (100000 + A02 > j2) {
                        j3 = (long) r4.A01;
                        break;
                    } else {
                        i3 = r4.A01;
                        j4 = A02;
                    }
                }
                int i6 = r4.A00;
                if (i6 - r4.A01 >= 10 && C90504eH.A00(r4) >= (A012 = C90504eH.A01(r4, 9) & 7)) {
                    r4.A0T(A012);
                    int i7 = r4.A00;
                    int i8 = r4.A01;
                    if (i7 - i8 >= 4) {
                        if (AnonymousClass3K2.A0C(r4.A02, i8) == 443) {
                            r4.A0T(4);
                            int A0F = r4.A0F();
                            if (C90504eH.A00(r4) >= A0F) {
                                r4.A0T(A0F);
                            }
                        }
                        while (true) {
                            int i9 = r4.A00;
                            int i10 = r4.A01;
                            if (i9 - i10 < 4 || (A0C = AnonymousClass3K2.A0C(r4.A02, i10)) == 442 || A0C == 441 || (A0C >>> 8) != 1) {
                                break;
                            }
                            r4.A0T(4);
                            int i11 = r4.A00;
                            if (i11 - r4.A01 < 2) {
                                break;
                            }
                            r4.A0S(Math.min(i11, r4.A01 + r4.A0F()));
                        }
                        i2 = r4.A01;
                    }
                }
                r4.A0S(i6);
                i2 = r4.A01;
            }
        }
        return new C88084Zv(0, -9223372036854775807L, AF7 + j3);
    }
}
