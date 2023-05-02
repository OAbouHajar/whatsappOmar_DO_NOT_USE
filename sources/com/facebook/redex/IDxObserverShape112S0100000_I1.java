package com.facebook.redex;

import X.AnonymousClass023;

public class IDxObserverShape112S0100000_I1 implements AnonymousClass023 {
    public Object A00;
    public final int A01;

    public IDxObserverShape112S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r0 = r2.A01;
        r2 = null;
        r1 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r1 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        r1 = new X.AnonymousClass027();
        r0.A08 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        X.AnonymousClass0F6.A01(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012b, code lost:
        X.AnonymousClass0F6.A01(r1, java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0132, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void AOH(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0039;
                case 2: goto L_0x0049;
                case 3: goto L_0x0074;
                case 4: goto L_0x00cd;
                case 5: goto L_0x010c;
                case 6: goto L_0x0133;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.Object r0 = r6.A00
            androidx.biometric.FingerprintDialogFragment r0 = (androidx.biometric.FingerprintDialogFragment) r0
            android.os.Handler r3 = r0.A05
            java.lang.Runnable r2 = r0.A06
            r3.removeCallbacks(r2)
            android.widget.TextView r0 = r0.A03
            if (r0 == 0) goto L_0x0019
            r0.setText(r7)
        L_0x0019:
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
        L_0x001e:
            return
        L_0x001f:
            X.0Nr r7 = (X.C04730Nr) r7
            if (r7 == 0) goto L_0x001e
            java.lang.Object r0 = r6.A00
            androidx.biometric.BiometricFragment r0 = (androidx.biometric.BiometricFragment) r0
            r0.A1I(r7)
            X.0F6 r0 = r0.A01
            r2 = 0
            X.027 r1 = r0.A0A
            if (r1 != 0) goto L_0x0070
            X.027 r1 = new X.027
            r1.<init>()
            r0.A0A = r1
            goto L_0x0070
        L_0x0039:
            X.0QF r7 = (X.AnonymousClass0QF) r7
            if (r7 == 0) goto L_0x001e
            java.lang.Object r2 = r6.A00
            androidx.biometric.BiometricFragment r2 = (androidx.biometric.BiometricFragment) r2
            int r1 = r7.A00
            java.lang.CharSequence r0 = r7.A01
            r2.A1G(r1, r0)
            goto L_0x0062
        L_0x0049:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L_0x001e
            java.lang.Object r2 = r6.A00
            androidx.biometric.BiometricFragment r2 = (androidx.biometric.BiometricFragment) r2
            boolean r0 = r2.A1L()
            if (r0 == 0) goto L_0x0062
            X.0F6 r1 = r2.A01
            r0 = 2
            r1.A06(r0)
            X.0F6 r0 = r2.A01
            r0.A07(r7)
        L_0x0062:
            X.0F6 r0 = r2.A01
            r2 = 0
            X.027 r1 = r0.A08
            if (r1 != 0) goto L_0x0070
            X.027 r1 = new X.027
            r1.<init>()
            r0.A08 = r1
        L_0x0070:
            X.AnonymousClass0F6.A01(r1, r2)
            return
        L_0x0074:
            boolean r0 = X.AnonymousClass000.A1X(r7)
            if (r0 == 0) goto L_0x001e
            java.lang.Object r3 = r6.A00
            androidx.biometric.BiometricFragment r3 = (androidx.biometric.BiometricFragment) r3
            boolean r0 = r3.A1L()
            if (r0 == 0) goto L_0x009f
            r0 = 2131888377(0x7f1208f9, float:1.9411388E38)
            java.lang.String r2 = r3.A0J(r0)
            if (r2 != 0) goto L_0x0094
            r0 = 2131893323(0x7f121c4b, float:1.942142E38)
            java.lang.String r2 = r3.A0J(r0)
        L_0x0094:
            X.0F6 r1 = r3.A01
            r0 = 2
            r1.A06(r0)
            X.0F6 r0 = r3.A01
            r0.A07(r2)
        L_0x009f:
            X.0F6 r1 = r3.A01
            boolean r0 = r1.A0I
            if (r0 != 0) goto L_0x00bb
            java.lang.String r1 = "BiometricFragment"
            java.lang.String r0 = "Failure not sent to client. Client is not awaiting a result."
            android.util.Log.w(r1, r0)
        L_0x00ac:
            X.0F6 r0 = r3.A01
            r2 = 0
            X.027 r1 = r0.A0D
            if (r1 != 0) goto L_0x012b
            X.027 r1 = new X.027
            r1.<init>()
            r0.A0D = r1
            goto L_0x012b
        L_0x00bb:
            java.util.concurrent.Executor r1 = r1.A0H
            if (r1 != 0) goto L_0x00c4
            X.0hm r1 = new X.0hm
            r1.<init>()
        L_0x00c4:
            X.0fO r0 = new X.0fO
            r0.<init>(r3)
            r1.execute(r0)
            goto L_0x00ac
        L_0x00cd:
            boolean r0 = X.AnonymousClass000.A1X(r7)
            if (r0 == 0) goto L_0x001e
            java.lang.Object r2 = r6.A00
            androidx.biometric.BiometricFragment r2 = (androidx.biometric.BiometricFragment) r2
            boolean r0 = r2.A1K()
            if (r0 == 0) goto L_0x00e7
            r2.A1A()
        L_0x00e0:
            X.0F6 r1 = r2.A01
            r0 = 0
            r1.A08(r0)
            return
        L_0x00e7:
            X.0F6 r0 = r2.A01
            java.lang.CharSequence r1 = r0.A0G
            if (r1 != 0) goto L_0x00f7
            X.0Oy r0 = r0.A06
            if (r0 == 0) goto L_0x0104
            java.lang.CharSequence r1 = r0.A01
            if (r1 != 0) goto L_0x00f7
            java.lang.String r1 = ""
        L_0x00f7:
            r0 = 13
            r2.A1H(r0, r1)
            r2.A19()
            r0 = 2
            r2.A1F(r0)
            goto L_0x00e0
        L_0x0104:
            r0 = 2131893323(0x7f121c4b, float:1.942142E38)
            java.lang.String r1 = r2.A0J(r0)
            goto L_0x00f7
        L_0x010c:
            boolean r0 = X.AnonymousClass000.A1X(r7)
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r6.A00
            androidx.biometric.BiometricFragment r1 = (androidx.biometric.BiometricFragment) r1
            r0 = 1
            r1.A1F(r0)
            r1.A19()
            X.0F6 r0 = r1.A01
            r2 = 0
            X.027 r1 = r0.A0E
            if (r1 != 0) goto L_0x012b
            X.027 r1 = new X.027
            r1.<init>()
            r0.A0E = r1
        L_0x012b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.AnonymousClass0F6.A01(r1, r0)
            return
        L_0x0133:
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.Object r5 = r6.A00
            androidx.biometric.FingerprintDialogFragment r5 = (androidx.biometric.FingerprintDialogFragment) r5
            android.os.Handler r4 = r5.A05
            java.lang.Runnable r3 = r5.A06
            r4.removeCallbacks(r3)
            int r2 = r7.intValue()
            r5.A1K(r2)
            android.widget.TextView r1 = r5.A03
            if (r1 == 0) goto L_0x0153
            r0 = 2
            if (r2 != r0) goto L_0x0159
            int r0 = r5.A00
        L_0x0150:
            r1.setTextColor(r0)
        L_0x0153:
            r0 = 2000(0x7d0, double:9.88E-321)
            r4.postDelayed(r3, r0)
            return
        L_0x0159:
            int r0 = r5.A01
            goto L_0x0150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape112S0100000_I1.AOH(java.lang.Object):void");
    }
}
