package X;

/* renamed from: X.1SS  reason: invalid class name */
public final class AnonymousClass1SS {
    public final C16980tz A00;
    public final C15860rz A01;

    public AnonymousClass1SS(C16980tz r2, C15860rz r3) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r1.startsWith("SM-A320") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0108, code lost:
        if (r1 >= 1801) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C47132Hs A00() {
        /*
            r7 = this;
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "oneplus"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = android.os.Build.MODEL
            X.C18450wi.A0D(r1)
            java.lang.String r0 = "GT-I920"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "SM-G965"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "SM-G988"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "SM-A320"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x003b
        L_0x0038:
            X.2Hs r0 = X.C47132Hs.PHONE
            return r0
        L_0x003b:
            java.lang.String r0 = "huawei"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "lya-al00"
            if (r1 == 0) goto L_0x004f
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0038
        L_0x004f:
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "mar-al00"
            if (r1 == 0) goto L_0x005b
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0038
        L_0x005b:
            java.lang.String r0 = "vog-tl00"
            if (r1 == 0) goto L_0x0066
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0038
        L_0x0066:
            java.lang.String r0 = "vog-al00"
            if (r1 == 0) goto L_0x0071
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0038
        L_0x0071:
            java.lang.String r0 = "jsn-al00a"
            if (r1 == 0) goto L_0x007c
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x007c
            goto L_0x0038
        L_0x007c:
            java.lang.String r0 = "moto g(100)"
            if (r1 == 0) goto L_0x0087
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0087
            goto L_0x0038
        L_0x0087:
            java.lang.String r0 = "asus_z01qd"
            if (r1 == 0) goto L_0x0092
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0092
            goto L_0x0038
        L_0x0092:
            X.0rz r0 = r7.A01
            boolean r0 = r0.A1e()
            if (r0 != 0) goto L_0x010d
            X.0tz r0 = r7.A00
            android.content.Context r6 = r0.A00
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            java.lang.String r1 = "android.hardware.telephony"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L_0x010a
            boolean r0 = X.C15450qv.A00()
            if (r0 == 0) goto L_0x0038
            X.2CF r4 = X.C26791Pe.A02(r6)
            if (r4 == 0) goto L_0x010d
            android.content.Context r0 = X.C47142Ht.A00(r6)
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r5 = r0.getConfiguration()
            int r0 = r5.screenLayout
            r3 = r0 & 15
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            boolean r0 = r0.hasSystemFeature(r1)
            r2 = -1
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r6.getSystemService(r0)
            boolean r0 = r1 instanceof android.telephony.TelephonyManager
            if (r0 == 0) goto L_0x00e3
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 == 0) goto L_0x00e3
            int r2 = r1.getSimState()
        L_0x00e3:
            r1 = 1
            if (r2 == r1) goto L_0x00ea
            r0 = -1
            if (r2 == r0) goto L_0x00ea
            r1 = 0
        L_0x00ea:
            r0 = 2
            if (r3 > r0) goto L_0x00f7
            if (r1 != 0) goto L_0x00f7
            int r1 = r4.A00
            r0 = 700(0x2bc, float:9.81E-43)
            if (r1 > r0) goto L_0x00f7
            goto L_0x0038
        L_0x00f7:
            int r1 = r5.smallestScreenWidthDp
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto L_0x010a
            r0 = 3
            if (r3 < r0) goto L_0x010d
            int r1 = r4.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r0 > r1) goto L_0x010d
            r0 = 1801(0x709, float:2.524E-42)
            if (r1 >= r0) goto L_0x010d
        L_0x010a:
            X.2Hs r0 = X.C47132Hs.TABLET
            return r0
        L_0x010d:
            X.2Hs r0 = X.C47132Hs.AMBIGUOUS
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SS.A00():X.2Hs");
    }
}
