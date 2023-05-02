package X;

/* renamed from: X.3A3  reason: invalid class name */
public final class AnonymousClass3A3 {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r7.A06(r8) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.AnonymousClass1HE r7, X.C16730tY r8, X.C33741j5 r9) {
        /*
            X.0ta r1 = X.C16730tY.A00(r8)
            boolean r0 = r1.A0Z
            r3 = 0
            if (r0 == 0) goto L_0x0060
            boolean r0 = r1.A0X
            if (r0 != 0) goto L_0x0060
            android.view.View r6 = r9.A02()
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            r6.setVisibility(r3)
            long r0 = r1.A0C
            int r5 = (int) r0
            X.1XP r0 = r7.A01(r8)
            if (r0 == 0) goto L_0x003b
            X.210 r0 = r0.A01()
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x003b
            boolean r0 = r7.A05(r8)
            if (r0 == 0) goto L_0x0034
            boolean r1 = r7.A06(r8)
            r0 = 1
            if (r1 == 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            int r5 = r5 >> 1
            if (r0 != 0) goto L_0x003b
            int r5 = r5 + 50
        L_0x003b:
            long r3 = (long) r5
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            boolean r0 = r7.A05(r8)
            if (r0 == 0) goto L_0x004e
            boolean r0 = r7.A06(r8)
            if (r0 == 0) goto L_0x005e
        L_0x004e:
            r1 = 1
        L_0x004f:
            if (r5 <= 0) goto L_0x005d
            r0 = 100
            if (r5 < r0) goto L_0x0057
            if (r1 == 0) goto L_0x005d
        L_0x0057:
            r6.setProgress(r5)
            r6.setIndeterminate(r1)
        L_0x005d:
            return r5
        L_0x005e:
            r1 = 0
            goto L_0x004f
        L_0x0060:
            java.lang.String r0 = "ConversationRowMediaUtils"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = "#updateProgress"
            java.lang.String r2 = X.AnonymousClass000.A0h(r0, r1)
            r1 = 4
            com.facebook.redex.IDxIListenerShape29S0000000_2_I1 r0 = new com.facebook.redex.IDxIListenerShape29S0000000_2_I1
            r0.<init>(r1)
            r9.A06(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3A3.A00(X.1HE, X.0tY, X.1j5):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (r0 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ca, code lost:
        if (r8 < 0) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r3.A06(r2) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.view.ViewGroup r15, android.widget.TextView r16, X.C52822eV r17, X.AnonymousClass013 r18, X.AnonymousClass1HE r19, X.C209212c r20, X.C16730tY r21) {
        /*
            r2 = r21
            X.0ta r8 = X.C16730tY.A00(r2)
            long r0 = r8.A0C
            int r4 = (int) r0
            r3 = r19
            X.1XP r0 = r3.A01(r2)
            if (r0 == 0) goto L_0x002d
            X.210 r0 = r0.A01()
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x002d
            boolean r0 = r3.A05(r2)
            if (r0 == 0) goto L_0x0026
            boolean r1 = r3.A06(r2)
            r0 = 1
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            int r4 = r4 >> 1
            if (r0 != 0) goto L_0x002d
            int r4 = r4 + 50
        L_0x002d:
            long r6 = (long) r4
            r4 = 100
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r21 = r15
            r15 = r16
            r11 = r17
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.A05(r2)
            if (r0 == 0) goto L_0x0046
            boolean r0 = r3.A06(r2)
            if (r0 == 0) goto L_0x0066
        L_0x0046:
            r1 = 0
            r11.A01 = r1
            r11.A02 = r1
            r11.A00 = r1
            r0 = 8
            r15.setVisibility(r0)
            if (r21 == 0) goto L_0x0059
            r0 = r21
            r0.setVisibility(r1)
        L_0x0059:
            X.2eT r2 = r11.A03
            r0 = -9223372036854775808
            r2.A02 = r0
            r2.A01 = r0
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r2.A00 = r0
        L_0x0065:
            return
        L_0x0066:
            boolean r0 = r8.A0Z
            if (r0 == 0) goto L_0x0046
            boolean r0 = r8.A0X
            if (r0 != 0) goto L_0x0046
            X.1XP r1 = r3.A01(r2)
            r0 = r20
            X.1co r0 = r0.A03(r2)
            long r8 = android.os.SystemClock.elapsedRealtime()
            if (r1 == 0) goto L_0x01a8
            long r4 = r2.A01
            X.1zh r0 = r1.A0K
            X.AnonymousClass00B.A06(r0)
            X.21E r1 = r0.A05
            if (r1 == 0) goto L_0x01a4
            java.lang.Long r0 = r1.A08
            if (r0 == 0) goto L_0x01a4
            long r12 = r0.longValue()
            X.21K r0 = r1.A01
            if (r0 == 0) goto L_0x009e
            java.lang.Long r0 = r0.A02
            if (r0 == 0) goto L_0x009e
            long r0 = r0.longValue()
            long r12 = r12 - r0
        L_0x009e:
            long r4 = r4 - r12
        L_0x009f:
            boolean r0 = r3.A05(r2)
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r3.A06(r2)
            r3 = 1
            if (r0 == 0) goto L_0x00ad
        L_0x00ac:
            r3 = 0
        L_0x00ad:
            r10 = r18
            if (r18 == 0) goto L_0x01a0
            long r0 = r2.A01
            java.lang.String r20 = X.AnonymousClass2GQ.A03(r10, r0)
        L_0x00b7:
            r18 = 0
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x00cc
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cc
            r1 = 100
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cc
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L_0x00cd
        L_0x00cc:
            r1 = 1
        L_0x00cd:
            boolean r14 = r11.A01
            r0 = 8
            if (r14 != 0) goto L_0x00e1
            if (r1 == 0) goto L_0x00e1
            r15.setVisibility(r0)
            if (r21 == 0) goto L_0x0065
            r1 = 0
        L_0x00db:
            r0 = r21
            r0.setVisibility(r1)
            return
        L_0x00e1:
            r1 = 1
            if (r3 == 0) goto L_0x0188
            r11.A02 = r1
            r4 = 100
            long r4 = r4 - r6
        L_0x00e9:
            X.2eT r10 = r11.A03
            long r0 = r10.A02
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 >= 0) goto L_0x00fc
            long r2 = r10.A01
            int r12 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r12 >= 0) goto L_0x00fc
            r10.A02 = r8
            r0 = r8
            r10.A01 = r4
        L_0x00fc:
            long r12 = r8 - r0
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0065
            int r2 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x0065
            r16 = 100
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0065
            int r2 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0065
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0065
            long r0 = r10.A01
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0065
            r16 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x0065
            long r0 = r0 - r4
            double r2 = (double) r0
            double r0 = (double) r12
            double r2 = r2 / r0
            double r0 = r10.A00
            r16 = 0
            int r12 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r12 < 0) goto L_0x0139
            r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r2 = r2 * r12
            r12 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            double r0 = r0 * r12
            double r2 = r2 + r0
        L_0x0139:
            r10.A00 = r2
            double r12 = (double) r4
            double r12 = r12 / r2
            long r0 = (long) r12
            r10.A02 = r8
            r10.A01 = r4
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 < 0) goto L_0x0065
            r3 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            boolean r2 = X.C13700nu.A0f(r2)
            r14 = r14 | r2
            r11.A01 = r14
            if (r14 == 0) goto L_0x0065
            X.2eU r2 = r11.A04
            android.text.Spanned r0 = r2.A00(r6, r0)
            r15.setText(r0)
            if (r20 == 0) goto L_0x017e
            java.lang.String r3 = " "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r3)
            android.content.Context r1 = r15.getContext()
            r0 = 2131893310(0x7f121c3e, float:1.9421393E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r2)
            r15.append(r0)
            r0 = r20
            r15.append(r0)
        L_0x017e:
            r0 = 0
            r15.setVisibility(r0)
            if (r21 == 0) goto L_0x0065
            r1 = 8
            goto L_0x00db
        L_0x0188:
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x00e9
            r11.A00 = r1
            X.2eT r2 = r11.A03
            r0 = -9223372036854775808
            r2.A02 = r0
            r2.A01 = r0
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r2.A00 = r0
            goto L_0x00e9
        L_0x01a0:
            r20 = 0
            goto L_0x00b7
        L_0x01a4:
            r12 = 0
            goto L_0x009e
        L_0x01a8:
            if (r0 == 0) goto L_0x01b5
            long r4 = r2.A01
            X.1cs r0 = r0.A0c
            long r0 = r0.A03()
            long r4 = r4 - r0
            goto L_0x009f
        L_0x01b5:
            r4 = -9223372036854775808
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3A3.A01(android.view.ViewGroup, android.widget.TextView, X.2eV, X.013, X.1HE, X.12c, X.0tY):void");
    }
}
