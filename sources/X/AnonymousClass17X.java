package X;

/* renamed from: X.17X  reason: invalid class name */
public class AnonymousClass17X {
    public final AnonymousClass17V A00;
    public final C16440t3 A01;
    public final C16980tz A02;
    public final AnonymousClass17T A03;
    public final AnonymousClass17U A04;
    public final AnonymousClass17W A05;

    public AnonymousClass17X(AnonymousClass17V r1, C16440t3 r2, C16980tz r3, AnonymousClass17T r4, AnonymousClass17U r5, AnonymousClass17W r6) {
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r5 = android.net.Uri.parse(r2.A05);
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C16740tZ r11) {
        /*
            r10 = this;
            X.17V r3 = r10.A00
            X.1sy r2 = r3.A01(r11)
            if (r2 == 0) goto L_0x0060
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 19
            if (r1 < r0) goto L_0x00cf
            X.0pd r0 = r3.A03
            boolean r0 = X.C38621r6.A0b(r0, r2)
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = r2.A05
            android.net.Uri r5 = android.net.Uri.parse(r0)
            java.lang.String r0 = "package_name"
            java.lang.String r3 = r5.getQueryParameter(r0)
            if (r3 == 0) goto L_0x00cf
            X.17W r0 = r10.A05
            java.util.Map r1 = r0.A01
            boolean r0 = r1.containsKey(r3)
            if (r0 != 0) goto L_0x006d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = 0
        L_0x0036:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x003a:
            android.util.Pair r4 = android.util.Pair.create(r1, r0)
        L_0x003e:
            java.lang.Object r0 = r4.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0061
            r1 = 1
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A06
            r0.set(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L_0x0052:
            X.17U r2 = r10.A04
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.A02(r11, r1, r3, r0)
        L_0x0060:
            return
        L_0x0061:
            r1 = 2
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A06
            r0.set(r1)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x0052
        L_0x006d:
            long r8 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r0 = r1.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r8 = r8 - r0
            long r6 = X.C42351xe.A00
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0086
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = 1
            goto L_0x0036
        L_0x0086:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r6.setPackage(r3)
            java.lang.String r0 = "com.obwhatsapp.otp.OTP_RETRIEVED"
            r6.setAction(r0)
            X.0tz r0 = r10.A02
            android.content.Context r0 = r0.A00
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r0 = 0
            java.util.List r0 = r1.queryIntentActivities(r6, r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00ac
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = 3
            goto L_0x0036
        L_0x00ac:
            java.lang.String r0 = "cta_display_name"
            java.lang.String r0 = r5.getQueryParameter(r0)
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = "signature_hash"
            java.lang.String r1 = r5.getQueryParameter(r0)
            if (r1 == 0) goto L_0x00cf
            X.17T r0 = r10.A03
            boolean r0 = r0.A00(r3, r1)
            if (r0 != 0) goto L_0x00ca
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = 2
            goto L_0x0036
        L_0x00ca:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = 0
            goto L_0x003a
        L_0x00cf:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.util.Pair r4 = android.util.Pair.create(r0, r4)
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17X.A00(X.0tZ):void");
    }
}
