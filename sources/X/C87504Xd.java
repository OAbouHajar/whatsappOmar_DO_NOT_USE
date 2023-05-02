package X;

/* renamed from: X.4Xd  reason: invalid class name and case insensitive filesystem */
public final class C87504Xd {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r2 != 3) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C90504eH r9, X.C32481gS[] r10, long r11) {
        /*
        L_0x0000:
            int r5 = r9.A00
            int r0 = r9.A01
            int r0 = r5 - r0
            r4 = 1
            if (r0 <= r4) goto L_0x0084
            r3 = 0
        L_0x000a:
            int r0 = r9.A01
            int r0 = r5 - r0
            if (r0 != 0) goto L_0x007a
            r3 = -1
        L_0x0011:
            r2 = 0
        L_0x0012:
            int r0 = r9.A01
            int r0 = r5 - r0
            if (r0 != 0) goto L_0x0070
            r2 = -1
        L_0x0019:
            int r1 = r9.A01
            int r8 = r1 + r2
            r0 = -1
            if (r2 == r0) goto L_0x0066
            int r5 = r5 - r1
            if (r2 > r5) goto L_0x0066
            r0 = 4
            if (r3 != r0) goto L_0x0060
            r0 = 8
            if (r2 < r0) goto L_0x0060
            int r7 = r9.A0C()
            int r6 = r9.A0F()
            r5 = 49
            if (r6 != r5) goto L_0x0064
            int r3 = r9.A07()
        L_0x003a:
            int r2 = r9.A0C()
            r1 = 47
            if (r6 != r1) goto L_0x0045
            r9.A0T(r4)
        L_0x0045:
            r0 = 181(0xb5, float:2.54E-43)
            if (r7 != r0) goto L_0x0051
            if (r6 == r5) goto L_0x004d
            if (r6 != r1) goto L_0x0051
        L_0x004d:
            r0 = 3
            r1 = 1
            if (r2 == r0) goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r6 != r5) goto L_0x005b
            r0 = 1195456820(0x47413934, float:49465.203)
            if (r3 == r0) goto L_0x005a
            r4 = 0
        L_0x005a:
            r1 = r1 & r4
        L_0x005b:
            if (r1 == 0) goto L_0x0060
            A01(r9, r10, r11)
        L_0x0060:
            r9.A0S(r8)
            goto L_0x0000
        L_0x0064:
            r3 = 0
            goto L_0x003a
        L_0x0066:
            java.lang.String r1 = "CeaUtil"
            java.lang.String r0 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r1, r0)
            int r8 = r9.A00
            goto L_0x0060
        L_0x0070:
            int r1 = r9.A0C()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L_0x0012
            goto L_0x0019
        L_0x007a:
            int r1 = r9.A0C()
            int r3 = r3 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L_0x000a
            goto L_0x0011
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87504Xd.A00(X.4eH, X.1gS[], long):void");
    }

    public static void A01(C90504eH r10, C32481gS[] r11, long j2) {
        int A0C = r10.A0C();
        if ((A0C & 64) != 0) {
            r10.A0T(1);
            int i2 = (A0C & 31) * 3;
            int i3 = r10.A01;
            for (C32481gS r3 : r11) {
                r10.A0S(i3);
                r3.Acw(r10, i2);
                r3.Ad0((C86824Uh) null, 1, i2, 0, j2);
            }
        }
    }
}
