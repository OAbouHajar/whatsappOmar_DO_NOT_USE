package X;

/* renamed from: X.4Xe  reason: invalid class name and case insensitive filesystem */
public final class C87514Xe {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        return r1 << r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        return r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C90504eH r1, int r2) {
        /*
            switch(r2) {
                case 1: goto L_0x0005;
                case 2: goto L_0x0008;
                case 3: goto L_0x0008;
                case 4: goto L_0x0008;
                case 5: goto L_0x0008;
                case 6: goto L_0x000d;
                case 7: goto L_0x0012;
                case 8: goto L_0x0019;
                case 9: goto L_0x0019;
                case 10: goto L_0x0019;
                case 11: goto L_0x0019;
                case 12: goto L_0x0019;
                case 13: goto L_0x0019;
                case 14: goto L_0x0019;
                case 15: goto L_0x0019;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = -1
            return r1
        L_0x0005:
            r1 = 192(0xc0, float:2.69E-43)
            return r1
        L_0x0008:
            r1 = 576(0x240, float:8.07E-43)
            int r0 = r2 + -2
            goto L_0x001d
        L_0x000d:
            int r0 = r1.A0C()
            goto L_0x0016
        L_0x0012:
            int r0 = r1.A0F()
        L_0x0016:
            int r1 = r0 + 1
            return r1
        L_0x0019:
            r1 = 256(0x100, float:3.59E-43)
            int r0 = r2 + -8
        L_0x001d:
            int r1 = r1 << r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87514Xe.A00(X.4eH, int):int");
    }

    public static boolean A01(AnonymousClass4Bs r17, C90654eW r18, C90504eH r19, int i2) {
        int i3;
        int A0F;
        C90504eH r3 = r19;
        long A0I = r3.A0I();
        long j2 = A0I >>> 16;
        if (j2 != ((long) i2)) {
            return false;
        }
        boolean A1P = AnonymousClass000.A1P(((j2 & 1) > 1 ? 1 : ((j2 & 1) == 1 ? 0 : -1)));
        int i4 = (int) ((A0I >> 12) & 15);
        int i5 = (int) ((A0I >> 8) & 15);
        int i6 = (int) (15 & (A0I >> 4));
        int i7 = (int) ((A0I >> 1) & 7);
        boolean A1P2 = AnonymousClass000.A1P(((A0I & 1) > 1 ? 1 : ((A0I & 1) == 1 ? 0 : -1)));
        C90654eW r5 = r18;
        if (i6 <= 7) {
            i3 = r5.A02 - 1;
        } else if (i6 > 10) {
            return false;
        } else {
            i6 = r5.A02;
            i3 = 2;
        }
        if (i6 != i3) {
            return false;
        }
        if ((i7 != 0 && i7 != r5.A01) || A1P2) {
            return false;
        }
        try {
            long A0K = r3.A0K();
            if (!A1P) {
                A0K *= (long) r5.A03;
            }
            r17.A00 = A0K;
            int A00 = A00(r3, i4);
            if (A00 == -1 || A00 > r5.A03) {
                return false;
            }
            int i8 = r5.A07;
            if (i5 != 0) {
                if (i5 > 11) {
                    if (i5 == 12) {
                        A0F = r3.A0C() * 1000;
                    } else if (i5 > 14) {
                        return false;
                    } else {
                        A0F = r3.A0F();
                        if (i5 == 14) {
                            A0F *= 10;
                        }
                    }
                    if (A0F != i8) {
                        return false;
                    }
                } else if (i5 != r5.A08) {
                    return false;
                }
            }
            int A0C = r3.A0C();
            int i9 = r3.A01;
            byte[] bArr = r3.A02;
            int i10 = i9 - 1;
            int i11 = 0;
            for (int i12 = r3.A01; i12 < i10; i12++) {
                i11 = AnonymousClass3C1.A0C[i11 ^ (bArr[i12] & 255)];
            }
            return A0C == i11;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
