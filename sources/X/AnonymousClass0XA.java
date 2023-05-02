package X;

/* renamed from: X.0XA  reason: invalid class name */
public final class AnonymousClass0XA {
    public static final int A00(C03690Jm r1, AnonymousClass0KQ r2) {
        C18450wi.A0H(r2, 0);
        C18450wi.A0H(r1, 1);
        return 4;
    }

    public static final int A01(AnonymousClass0KQ r1, C03700Jn r2) {
        C18450wi.A0H(r1, 0);
        C18450wi.A0H(r2, 1);
        return 2 - r2.ordinal() == 0 ? 32 : 52;
    }

    public static final int A02(AnonymousClass0KQ r1, AnonymousClass0K0 r2) {
        C18450wi.A0H(r1, 0);
        C18450wi.A0H(r2, 1);
        return 1 - r2.ordinal() == 0 ? 20 : 16;
    }

    public static final AnonymousClass0R8 A03(AnonymousClass0JZ r4, AnonymousClass0KQ r5) {
        C18450wi.A0H(r5, 0);
        C18450wi.A0H(r4, 1);
        return r4.ordinal() != 0 ? new AnonymousClass0R8(new AnonymousClass0R9(-3419431, -5786689), 1) : new AnonymousClass0R8(new AnonymousClass0R9(-14931149, -14931149), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        return new X.AnonymousClass0R9(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        return new X.AnonymousClass0R9(r3, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0R9 A04(X.AnonymousClass0KH r2, X.AnonymousClass0KQ r3) {
        /*
            r0 = 0
            X.C18450wi.A0H(r3, r0)
            r0 = 1
            X.C18450wi.A0H(r2, r0)
            int r0 = r2.ordinal()
            r3 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
            r2 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            r1 = -1
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0016;
                case 2: goto L_0x0016;
                case 3: goto L_0x0016;
                case 4: goto L_0x0026;
                case 5: goto L_0x003c;
                case 6: goto L_0x0020;
                case 7: goto L_0x0039;
                case 8: goto L_0x0016;
                case 9: goto L_0x001c;
                case 10: goto L_0x002d;
                case 11: goto L_0x0042;
                default: goto L_0x0016;
            }
        L_0x0016:
            X.0R9 r0 = new X.0R9
            r0.<init>(r2, r1)
            return r0
        L_0x001c:
            r2 = -12215809(0xffffffffff4599ff, float:-2.626575E38)
            goto L_0x0030
        L_0x0020:
            X.0R9 r0 = new X.0R9
            r0.<init>(r1, r1)
            return r0
        L_0x0026:
            r3 = -12166551(0xffffffffff465a69, float:-2.6365658E38)
            r2 = -2169879(0xffffffffffdee3e9, float:NaN)
            goto L_0x0030
        L_0x002d:
            r3 = -920329(0xfffffffffff1f4f7, float:NaN)
        L_0x0030:
            X.0R9 r0 = new X.0R9
            r0.<init>(r3, r2)
            return r0
        L_0x0036:
            r3 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            goto L_0x003c
        L_0x0039:
            r3 = 16777215(0xffffff, float:2.3509886E-38)
        L_0x003c:
            X.0R9 r0 = new X.0R9
            r0.<init>(r3, r3)
            return r0
        L_0x0042:
            X.0R9 r0 = new X.0R9
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XA.A04(X.0KH, X.0KQ):X.0R9");
    }

    public static final AnonymousClass0RW A05(AnonymousClass0KQ r4, AnonymousClass0K1 r5) {
        float f2;
        int i2;
        float f3;
        String str;
        String str2;
        C18450wi.A0H(r4, 0);
        C18450wi.A0H(r5, 1);
        switch (r5.ordinal()) {
            case 2:
                f2 = 0.32f;
                i2 = 24;
                f3 = 0.96f;
                str = "Header";
                str2 = "Optimistic Display App";
                break;
            case 3:
                f2 = 0.245f;
                i2 = 15;
                f3 = 1.15f;
                str = "Text";
                str2 = "Optimistic Display App Regular";
                break;
            default:
                f2 = 0.3f;
                i2 = 17;
                f3 = 1.05f;
                str = "Text";
                str2 = "Optimistic Display App Medium";
                break;
        }
        return new AnonymousClass0RW(str, str2, f2, f3, i2);
    }

    public static final void A06(AnonymousClass0KQ r1, AnonymousClass0JS r2) {
        C18450wi.A0H(r1, 0);
        AnonymousClass0X9.A00(r2);
    }
}
