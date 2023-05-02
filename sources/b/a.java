package b;

import java.lang.Thread;

public final /* synthetic */ class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f175a;

    public /* synthetic */ a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f175a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0433, code lost:
        r1 = "۬ۤ۟ۚۗۤۥۧۡۘۡۥۚۖ۫ۥۢۜۛ۟";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0437, code lost:
        r1 = "ۘۦۖۘ۬ۨ۫ۘۡۥ۠ۛۖۨ۫۫۫۠۟ۡ۫";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x043b, code lost:
        r0.finish();
        com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f210b.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0443, code lost:
        android.os.Process.killProcess(android.os.Process.myPid());
        java.lang.System.exit(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        r0 = (android.app.Activity) com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f210b.get();
        r1 = "ۖۡۘۡۥۛ۟ۗۢ۟ۛ۠ۤۨۦۘۘۤۛۧ۠۠۟ۗۖۖ۫۟";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        switch((r1.hashCode() ^ 963061791)) {
            case -1537732127: goto L_0x0097;
            case -1198599602: goto L_0x0443;
            case 478834651: goto L_0x0437;
            case 549674933: goto L_0x043b;
            default: goto L_0x0096;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (r0 == null) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        r1 = "ۧ۬ۖۘۜ۟۟ۤۢۜۘۧۢ۠ۢۦۦۜۛ۬ۤۘۙ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x01db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0214 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x01d2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x029d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x02b7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0294 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x02c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x02d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x02be A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0381 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x02da A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x03b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x03bb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x03af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r13, java.lang.Throwable r14) {
        /*
            r12 = this;
            android.app.Application r0 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f209a
            java.lang.String r1 = "custom_activity_on_crash"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "last_crash_timestamp"
            r2 = -1
            long r4 = r0.getLong(r1, r2)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r6 = r0.getTime()
            r3 = 1
            r1 = -1335488573(0xffffffffb0660fc3, float:-8.369591E-10)
            java.lang.String r0 = "ۢۡۖۘۤ۠ۨۛۤۙ۠ۨۧۦۥۘ"
        L_0x0020:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1924098153: goto L_0x0036;
                case -1228589999: goto L_0x0044;
                case -831734229: goto L_0x0033;
                case -342952868: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0020
        L_0x0029:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0030
            java.lang.String r0 = "ۢۨۙ۟ۛ۟ۖۖۨۡۙۦۘۘۧ۬۠۫ۚ۬ۨۘ"
            goto L_0x0020
        L_0x0030:
            java.lang.String r0 = "ۦۤۡۘ۬۠۫ۤۜۨ۟ۖۧۙۤۘۘۘۗۥۦۖۘۗۖۥۘۧۘ"
            goto L_0x0020
        L_0x0033:
            java.lang.String r0 = "ۗۦۛۢۡۜۘۛ۠ۨۘ۬۬ۛ۠ۙۦۘۚۘ۟۟ۗۖۚۗۨۘ"
            goto L_0x0020
        L_0x0036:
            r1 = -1598717030(0xffffffffa0b5839a, float:-3.074968E-19)
            java.lang.String r0 = "ۥۚۖۢ۟ۖۘۦۤۖۨۧۡۖۖۡۘۖۘۘۘ۟ۖ"
        L_0x003b:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1513502985: goto L_0x0066;
                case -838232963: goto L_0x0069;
                case -735962152: goto L_0x0044;
                case -560650976: goto L_0x005b;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x003b
        L_0x0044:
            r0 = 0
        L_0x0045:
            java.lang.Thread$UncaughtExceptionHandler r5 = r12.f175a
            r2 = -1370777082(0xffffffffae4b9a06, float:-4.6293656E-11)
            java.lang.String r1 = "۠ۥۤۚۙۨۘۗۙۢ۠۟ۥۧۦۛۢۘۘۨۘۘ۫۫۟"
        L_0x004c:
            int r4 = r1.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -790171840: goto L_0x0073;
                case -626870467: goto L_0x0055;
                case 241037992: goto L_0x00a7;
                case 2115349143: goto L_0x006e;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            java.lang.String r1 = "ۢۛۛۘۜ۠۠۟ۗۧۛۨۘ۫ۗۨۘ۟۠ۥ"
            goto L_0x004c
        L_0x0058:
            java.lang.String r0 = "۟ۡۧۡۥ۠۟ۤۧۡۥۖ۟ۨۖۘۗۧ"
            goto L_0x003b
        L_0x005b:
            long r8 = r6 - r4
            r10 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            java.lang.String r0 = "ۦۥۨۘۧۚ۠۫ۡ۟ۡۚ۫ۖ۫ۤۛۨۢ"
            goto L_0x003b
        L_0x0066:
            java.lang.String r0 = "ۥۥۖۘ۟ۗۚۤۤۙۘ۟ۙۚۥۛۧ۫ۢ"
            goto L_0x003b
        L_0x0069:
            r0 = 1
            goto L_0x0045
        L_0x006b:
            java.lang.String r1 = "ۜۗۜۘۥۤۢۧۧۗۛۗۛۙۢۦۙۚۜۤۙۛۦ۬ۨ"
            goto L_0x004c
        L_0x006e:
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = "ۥۜۘۙ۫ۦۚۤ۠ۗۜۧۜ۬ۙ۠ۜۤۜۘ۠ۥۚۘۘ"
            goto L_0x004c
        L_0x0073:
            r1 = -945826295(0xffffffffc79fd609, float:-81836.07)
            java.lang.String r0 = "ۢۛۜۘ۟ۥۤۚۤ۟ۨۨۖۧۤۥ۟ۙۨۜ۬ۤۧۘۥۘۦۦۧ"
        L_0x0078:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -995819595: goto L_0x0248;
                case -680027245: goto L_0x0081;
                case 471183206: goto L_0x00a4;
                case 1360167190: goto L_0x009f;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x0078
        L_0x0081:
            java.lang.ref.WeakReference r0 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f210b
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            r2 = 963061791(0x3967281f, float:2.2044823E-4)
            java.lang.String r1 = "ۖۡۘۡۥۛ۟ۗۢ۟ۛ۠ۤۨۦۘۘۤۛۧ۠۠۟ۗۖۖ۫۟"
        L_0x008e:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1537732127: goto L_0x0097;
                case -1198599602: goto L_0x0443;
                case 478834651: goto L_0x0437;
                case 549674933: goto L_0x043b;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x008e
        L_0x0097:
            if (r0 == 0) goto L_0x0433
            java.lang.String r1 = "ۧ۬ۖۘۜ۟۟ۤۢۜۘۧۢ۠ۢۦۦۜۛ۬ۤۘۙ"
            goto L_0x008e
        L_0x009c:
            java.lang.String r0 = "ۨۚ۬ۘ۟ۨ۠ۧۜۘ۫ۜۧۘۡۜۡۗۗ"
            goto L_0x0078
        L_0x009f:
            if (r5 == 0) goto L_0x009c
            java.lang.String r0 = "ۥۨ۟ۙۥۚۤۘ۬ۖۨۨۚۦۡۘۙۦۖۥ۫ۢ۫ۡ۫"
            goto L_0x0078
        L_0x00a4:
            java.lang.String r0 = "ۦۥۢ۟ۛۥ۠ۖۢۨۖ۫ۛۥۨ۫۬۟ۖۛ۠۟۟۠"
            goto L_0x0078
        L_0x00a7:
            android.app.Application r0 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f209a
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r6 = r1.getTime()
            java.lang.String r1 = "custom_activity_on_crash"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "last_crash_timestamp"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r6)
            r0.commit()
            java.lang.Class r1 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f216h
            r4 = 0
            r2 = 668204745(0x27d3fec9, float:5.8840503E-15)
            java.lang.String r0 = "ۖۡۜۚۥ۠ۖۘ۬ۙۜۘۘۘۛۙ۬ۥۘ۬۠ۧ"
        L_0x00ce:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -1904509445: goto L_0x00e2;
                case -1384295352: goto L_0x00d7;
                case -1242759973: goto L_0x0163;
                case -1242418833: goto L_0x00df;
                default: goto L_0x00d6;
            }
        L_0x00d6:
            goto L_0x00ce
        L_0x00d7:
            if (r1 != 0) goto L_0x00dc
            java.lang.String r0 = "۫۫ۗ۬۫ۘۘۙ۬ۚۚۙۡۘۤ۬ۜۘۥ۬ۤ۬ۘۤ"
            goto L_0x00ce
        L_0x00dc:
            java.lang.String r0 = "ۘۜ۠ۘ۟ۤۘ۬۫۠ۧۧۦ۫ۜۘۧۤۧۛ۬ۖۘ"
            goto L_0x00ce
        L_0x00df:
            java.lang.String r0 = "ۦۢۚ۫ۚ۟ۗۛ۬ۨۢۙۛۡۥۢ۟ۦۘۜۥ۠"
            goto L_0x00ce
        L_0x00e2:
            android.app.Application r0 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f209a
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.cat.ereza.customactivityoncrash.ERROR"
            android.content.Intent r1 = r1.setAction(r2)
            java.lang.String r2 = com.obwhatsapp.yo.yo.mpack
            android.content.Intent r1 = r1.setPackage(r2)
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = 64
            java.util.List r1 = r0.queryIntentActivities(r1, r2)
            r2 = 1481269892(0x584a6284, float:8.9009788E14)
            java.lang.String r0 = "ۛۘۦۢ۫ۢۙۜۡۖۢۧۨۚۧۨ۬ۥۘ۟۠ۡ۫ۤۨۘۙۖۡ"
        L_0x0104:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -2078285986: goto L_0x0130;
                case 19012519: goto L_0x0135;
                case 1623168543: goto L_0x010d;
                case 1721889627: goto L_0x011b;
                default: goto L_0x010c;
            }
        L_0x010c:
            goto L_0x0104
        L_0x010d:
            r2 = 253478626(0xf1bc6e2, float:7.6803935E-30)
            java.lang.String r0 = "ۙ۠ۗۥۦۥۘۖ۫۠ۘۨ۟ۡۛۘۘ"
        L_0x0112:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -807532874: goto L_0x0147;
                case -176274857: goto L_0x0144;
                case 1728856552: goto L_0x011b;
                case 1743479936: goto L_0x013b;
                default: goto L_0x011a;
            }
        L_0x011a:
            goto L_0x0112
        L_0x011b:
            r0 = 0
        L_0x011c:
            r2 = -1997847328(0xffffffff88eb44e0, float:-1.41597405E-33)
            java.lang.String r1 = "۠ۗۥۘ۟ۘۨۘ۟ۙۥۘۤۡۧۘ۫ۨۨۘۦ۟ۦۘ۟۟۠"
        L_0x0121:
            int r6 = r1.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -1888152561: goto L_0x012a;
                case -1488187871: goto L_0x0161;
                case -396142711: goto L_0x015f;
                case -328512422: goto L_0x015a;
                default: goto L_0x0129;
            }
        L_0x0129:
            goto L_0x0121
        L_0x012a:
            java.lang.String r1 = "ۦۜۥۘۚۢۘۘۙۜۨۚۧۛۖ۫۬۟۫"
            goto L_0x0121
        L_0x012d:
            java.lang.String r0 = "ۙۢۘۛۖ۠ۗۗۜۨۢۥۘۢۨۘ"
            goto L_0x0104
        L_0x0130:
            if (r1 == 0) goto L_0x012d
            java.lang.String r0 = "ۛۢۥ۬ۜۥۙۥۥۘ۟ۦۦۗ۟ۢ۫ۚۤۤ۬ۗۢ۬ۘ"
            goto L_0x0104
        L_0x0135:
            java.lang.String r0 = "ۤۡۡۘۥ۬ۡ۬ۗۖۦۨ۫ۜ۠ۗۖۨۨ۟ۖ۬ۤ۠ۥ۬ۢ۬"
            goto L_0x0104
        L_0x0138:
            java.lang.String r0 = "ۨۙۚۛۤۘۘ۠ۦ۬ۗۙۘۘۦۤۤ۬ۡ۟ۜ۬"
            goto L_0x0112
        L_0x013b:
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0138
            java.lang.String r0 = "ۨۖۨ۟ۖۡ۬ۙۜۘ۟ۧۘۘۗۦۛۗۨۥۚۘۜ"
            goto L_0x0112
        L_0x0144:
            java.lang.String r0 = "ۛۚ۫ۚ۬ۦۡ۠ۤۥۨۦۙ۫۫ۖۧۨۤۙۘۘۤ۟ۘۘ"
            goto L_0x0112
        L_0x0147:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ ClassNotFoundException -> 0x0458 }
            java.lang.String r0 = r0.name     // Catch:{ ClassNotFoundException -> 0x0458 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0458 }
            goto L_0x011c
        L_0x0157:
            java.lang.String r1 = "ۙۛۤ۠ۜۚ۬ۤۗۜ۠۟۟۟ۙ"
            goto L_0x0121
        L_0x015a:
            if (r0 != 0) goto L_0x0157
            java.lang.String r1 = "ۚۚۨۘ۠۟ۖۥۜۧۨ۠۫۟ۤۤ۟ۤۨۚۛ"
            goto L_0x0121
        L_0x015f:
            java.lang.Class<com.cat.ereza.customactivityoncrash.activity.DefaultErrorActivity> r0 = com.cat.ereza.customactivityoncrash.activity.DefaultErrorActivity.class
        L_0x0161:
            com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f216h = r0
        L_0x0163:
            java.lang.Class r6 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f216h
            r0 = r14
        L_0x0166:
            java.lang.StackTraceElement[] r7 = r0.getStackTrace()
            int r8 = r7.length
            r1 = 0
        L_0x016c:
            r9 = -1801512533(0xffffffff949f19ab, float:-1.6065021E-26)
            java.lang.String r2 = "ۙۖۦۘۛۤۢۚۗۘۘۤۜۧۤۖۨۘۘۗۤ"
        L_0x0171:
            int r10 = r2.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1764911600: goto L_0x0218;
                case -1216272392: goto L_0x017a;
                case 339150695: goto L_0x01af;
                case 1634639760: goto L_0x01aa;
                default: goto L_0x0179;
            }
        L_0x0179:
            goto L_0x0171
        L_0x017a:
            r9 = r7[r1]
            r10 = 1599343662(0x5f540c2e, float:1.5279638E19)
            java.lang.String r2 = "ۖۥ۫ۗۖۜۘۧ۟ۘۘ۫ۨۘ۠۟۫"
        L_0x0181:
            int r11 = r2.hashCode()
            r11 = r11 ^ r10
            switch(r11) {
                case -2071689205: goto L_0x018a;
                case -1225996194: goto L_0x01c4;
                case 936354222: goto L_0x01b5;
                case 1621669139: goto L_0x01cd;
                default: goto L_0x0189;
            }
        L_0x0189:
            goto L_0x0181
        L_0x018a:
            r10 = -1288819918(0xffffffffb32e2b32, float:-4.0551818E-8)
            java.lang.String r2 = "ۗۖۗۖۘۘ۫ۥۙۖۖۛ۠ۚۖۨۥۜۘۦۧۘۨ۠ۨ۫ۗۥۘ"
        L_0x018f:
            int r11 = r2.hashCode()
            r11 = r11 ^ r10
            switch(r11) {
                case -1525240543: goto L_0x0198;
                case -247438739: goto L_0x045e;
                case 985253033: goto L_0x01cd;
                case 1947605324: goto L_0x01ca;
                default: goto L_0x0197;
            }
        L_0x0197:
            goto L_0x018f
        L_0x0198:
            java.lang.String r2 = r9.getMethodName()
            java.lang.String r11 = "handleBindApplication"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x01c7
            java.lang.String r2 = "ۜۥۦۡۥ۬ۙۖۦۨۜۤۤۘۘۘۗۛۡۗ۫ۥۘ"
            goto L_0x018f
        L_0x01a7:
            java.lang.String r2 = "ۥۢۨۘۡۦۘۤۨ۠ۘۤۡۘۦۖ۠ۘۜۖ"
            goto L_0x0171
        L_0x01aa:
            if (r1 >= r8) goto L_0x01a7
            java.lang.String r2 = "ۨۙۚۖۦۖۘۜۧۜۗ۟ۜۘۜۖۤۗۘۦ۟ۨۖ۠ۖۦۘۛۨۙ"
            goto L_0x0171
        L_0x01af:
            java.lang.String r2 = "ۛۖۗۖۤۨۥ۟ۗ۫۫ۖۘۨۖۡ۬۟ۘ"
            goto L_0x0171
        L_0x01b2:
            java.lang.String r2 = "ۙۙۦۘۧۦ۠ۚۜ۬ۦۥۜۙۛ۠ۖ۬ۦۡۘۨ"
            goto L_0x0181
        L_0x01b5:
            java.lang.String r2 = r9.getClassName()
            java.lang.String r11 = "android.app.ActivityThread"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x01b2
            java.lang.String r2 = "۬ۢۥۘۛۚ۟ۖ۫ۦۘۘۘ۠۠ۢ۠ۧۙ۟۟ۖۡۨ۫۬"
            goto L_0x0181
        L_0x01c4:
            java.lang.String r2 = "ۢۢۨۘ۠۟۬ۗۥۥۥ۟ۙ۬ۙۙۦۖۜ"
            goto L_0x0181
        L_0x01c7:
            java.lang.String r2 = "ۖ۬ۘۗۜ۬ۙۥۖۘۡۜۘۚ۠ۘۘۘۡۘ۫ۨ۠ۖۤۡۛۙ۬"
            goto L_0x018f
        L_0x01ca:
            java.lang.String r2 = "ۤۖۢ۟ۥۨۛۨۢۘۚۢ۠۟۟ۥۜ۫ۛۚۗۜۛۡۘۘ"
            goto L_0x018f
        L_0x01cd:
            r10 = 1391701291(0x52f3ad2b, float:5.23291165E11)
            java.lang.String r2 = "ۜۢOۙۜ۟ۡۖ۫ۘۚۡۚ"
        L_0x01d2:
            int r11 = r2.hashCode()
            r11 = r11 ^ r10
            switch(r11) {
                case -1237605125: goto L_0x0211;
                case -195367299: goto L_0x0214;
                case 120425045: goto L_0x01db;
                case 734919317: goto L_0x0200;
                default: goto L_0x01da;
            }
        L_0x01da:
            goto L_0x01d2
        L_0x01db:
            r0 = r3
        L_0x01dc:
            r2 = 477818270(0x1c7aed9e, float:8.3025174E-22)
            java.lang.String r1 = "ۖ۬ۛ۫۬ۢۨۛۡۘۘۖۜ۟ۧۦۘ"
        L_0x01e1:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -676959654: goto L_0x01ea;
                case -54122196: goto L_0x023f;
                case 941709469: goto L_0x024c;
                case 1005821164: goto L_0x023a;
                default: goto L_0x01e9;
            }
        L_0x01e9:
            goto L_0x01e1
        L_0x01ea:
            r1 = -237117440(0xfffffffff1dde000, float:-2.1973436E30)
            java.lang.String r0 = "۟۬ۚۙۜۜۦۛۘۜ۠۬ۨۛ۟ۗۤۢۜۧۡۘۧۘۗ"
        L_0x01ef:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1235989626: goto L_0x0245;
                case 580449802: goto L_0x01f8;
                case 745063973: goto L_0x0248;
                case 1781336341: goto L_0x0081;
                default: goto L_0x01f7;
            }
        L_0x01f7:
            goto L_0x01ef
        L_0x01f8:
            if (r5 == 0) goto L_0x0242
            java.lang.String r0 = "ۜۨۥۤۧۜۘۖۗۛۖۜۙۨۤۜۗۡۛۦۙۢۙۘۨۘ۬ۚۜۘ"
            goto L_0x01ef
        L_0x01fd:
            java.lang.String r2 = "ۙۡۦۦۘۡۨۜۧۛۤۤۧۖۙ۟ۨۙۤۛ"
            goto L_0x01d2
        L_0x0200:
            java.lang.String r2 = r9.getClassName()
            java.lang.String r11 = r6.getName()
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x01fd
            java.lang.String r2 = "ۗۥۦۘۡ۬ۜۦۜۧۜۨۡۘ۟ۘۖۘۖۡۙ"
            goto L_0x01d2
        L_0x0211:
            java.lang.String r2 = "۬ۗۢۜۙۜۘۢۥۧۘۧۥ۟۫ۜ۟ۛۖۦۘ"
            goto L_0x01d2
        L_0x0214:
            int r1 = r1 + 1
            goto L_0x016c
        L_0x0218:
            java.lang.Throwable r0 = r0.getCause()
            r2 = -1861924075(0xffffffff91054b15, float:-1.0514986E-28)
            java.lang.String r1 = "۬ۦۡۘۖ۠ۤۥۡۡۜۚۗۜۚۜ"
        L_0x0221:
            int r7 = r1.hashCode()
            r7 = r7 ^ r2
            switch(r7) {
                case -1347028988: goto L_0x0235;
                case 57608840: goto L_0x0166;
                case 103772148: goto L_0x0230;
                case 653251633: goto L_0x022a;
                default: goto L_0x0229;
            }
        L_0x0229:
            goto L_0x0221
        L_0x022a:
            java.lang.String r1 = "ۖۤۘ۟ۦۧۘۢ۬۬ۤۡۦۘۢ۟ۧ۟ۘۜۙۢۘۘ"
            goto L_0x0221
        L_0x022d:
            java.lang.String r1 = "۟ۥۛۥۗ۬ۨۧ۟ۤۗ۫۠ۢۚۖۧۚۢۘۡۢۖۦۘۦ۠"
            goto L_0x0221
        L_0x0230:
            if (r0 != 0) goto L_0x022d
            java.lang.String r1 = "ۜ۫ۦ۫۟ۤۚۗ۬ۦۦۖ۟ۦۡۙۖۜۖۚۙۤ۫۠ۨ۠ۥ"
            goto L_0x0221
        L_0x0235:
            r0 = 0
            goto L_0x01dc
        L_0x0237:
            java.lang.String r1 = "ۗ۫ۚۘ۠ۙ۠ۘۦۘ۫ۘۨۙۢۨۘۦۥۥۖۘۡۨۥۘ"
            goto L_0x01e1
        L_0x023a:
            if (r0 == 0) goto L_0x0237
            java.lang.String r1 = "ۧۚۨۜ۠ۖۙۗۥۘۥۥۖۖۚ۬ۗۦۡ"
            goto L_0x01e1
        L_0x023f:
            java.lang.String r1 = "ۗۖۨ۬ۖۢۡۡۜۘۖۥ۟ۨ۠۫ۦۨۨۤ۬ۤ"
            goto L_0x01e1
        L_0x0242:
            java.lang.String r0 = "ۦۥۛۡ۠ۡۡ۠ۦۘۗ۠ۗۡ۫ۡۘ۠۟۬"
            goto L_0x01ef
        L_0x0245:
            java.lang.String r0 = "ۥۨ۫ۚۘۗۚۡۖ۬ۢ۫ۡۗۗۨۚۡ"
            goto L_0x01ef
        L_0x0248:
            r5.uncaughtException(r13, r14)
        L_0x024b:
            return
        L_0x024c:
            r1 = -1096089247(0xffffffffbeab0161, float:-0.3339949)
            java.lang.String r0 = "ۥۢۘۘۧۤۜۖۖۨۗۛۖ۬ۚۧۤۛۦۧۘۙۨ۬۫ۙۚۢ"
        L_0x0251:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1421710014: goto L_0x0267;
                case -1383284512: goto L_0x0275;
                case -749942463: goto L_0x0260;
                case -178492490: goto L_0x025a;
                default: goto L_0x0259;
            }
        L_0x0259:
            goto L_0x0251
        L_0x025a:
            java.lang.String r0 = "ۨ۫ۘۘۖۛ۬ۢۦۥۘۚۨۚ۟ۦ۠ۥ۠ۘۘ"
            goto L_0x0251
        L_0x025d:
            java.lang.String r0 = "ۗۖۘۘ۠۟ۦۘ۠ۧ۠ۗۙ۟ۥۙۨۚۛۨۡ۬ۙ۟ۢۡۘ"
            goto L_0x0251
        L_0x0260:
            boolean r0 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f212d
            if (r0 != 0) goto L_0x025d
            java.lang.String r0 = "ۡۤۘۘۛۡۧۘۖۘۧۘۨ۬ۜ۠ۘۡۢۙۥۘۨۦۧۘ"
            goto L_0x0251
        L_0x0267:
            r1 = 916758292(0x36a49f14, float:4.9061E-6)
            java.lang.String r0 = "ۤۗۗۘ۫ۘ۬ۙۗ۠ۤ۠۫ۙ"
        L_0x026c:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1812208824: goto L_0x0081;
                case -1273024498: goto L_0x0275;
                case 668380886: goto L_0x02f3;
                case 1777533397: goto L_0x02eb;
                default: goto L_0x0274;
            }
        L_0x0274:
            goto L_0x026c
        L_0x0275:
            android.content.Intent r3 = new android.content.Intent
            android.app.Application r0 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f209a
            java.lang.Class r1 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f216h
            r3.<init>(r0, r1)
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r14.printStackTrace(r1)
            java.lang.String r1 = r0.toString()
            r2 = -1232629626(0xffffffffb6879086, float:-4.0401383E-6)
            java.lang.String r0 = "ۜۡ۬ۡۦۘۡۗ۫ۘۧۛۘۙ۠ۙۖۘۘۧۚ۫ۥۖۡ۠ۦۘ"
        L_0x0294:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -2090907662: goto L_0x029d;
                case 907680295: goto L_0x02fa;
                case 1052611831: goto L_0x0306;
                case 1517740975: goto L_0x02b7;
                default: goto L_0x029c;
            }
        L_0x029c:
            goto L_0x0294
        L_0x029d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
            r5 = 131047(0x1ffe7, float:1.83636E-40)
            java.lang.String r1 = r1.substring(r2, r5)
            r0.append(r1)
            java.lang.String r1 = " [stack trace too large]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r0
        L_0x02b7:
            boolean r2 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f214f
            r5 = -274881029(0xffffffffef9da5fb, float:-9.757961E28)
            java.lang.String r0 = "ۚۙۨ۠ۙۦۜۙۘ۠ۨۙۖۘۘۧۗۚۖۦۨۨۨۨۘۦۛۘ"
        L_0x02be:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -492567182: goto L_0x030c;
                case 1105310908: goto L_0x02d5;
                case 1167306934: goto L_0x0311;
                case 1604450861: goto L_0x02c7;
                default: goto L_0x02c6;
            }
        L_0x02c6:
            goto L_0x02be
        L_0x02c7:
            r5 = -1499300782(0xffffffffa6a27c52, float:-1.1274705E-15)
            java.lang.String r0 = "۬ۛۘ۠ۥۜۘۥۡۡ۬ۤ۬ۜ۫ۖۘۖۡۗۜۨ۠ۘ۟ۡۘ"
        L_0x02cc:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1935105920: goto L_0x0321;
                case -882946516: goto L_0x02d5;
                case 601902938: goto L_0x031e;
                case 1564865698: goto L_0x0317;
                default: goto L_0x02d4;
            }
        L_0x02d4:
            goto L_0x02cc
        L_0x02d5:
            r4 = 1822731197(0x6ca4abbd, float:1.5925988E27)
            java.lang.String r0 = "ۚۨۦۡۨۧۘۦۨۘۖ۟ۙ۠ۧۨۘۤ۫ۚۨۧ"
        L_0x02da:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1713556668: goto L_0x0422;
                case -562503284: goto L_0x02e3;
                case 829268560: goto L_0x0381;
                case 1889399651: goto L_0x041e;
                default: goto L_0x02e2;
            }
        L_0x02e2:
            goto L_0x02da
        L_0x02e3:
            if (r2 != 0) goto L_0x041a
            java.lang.String r0 = "ۥۦۖۚۘۘۦۢۦۘ۠ۙۡۘۙۧۡۘۡ۟ۨ۠ۛۛ"
            goto L_0x02da
        L_0x02e8:
            java.lang.String r0 = "ۥۡۗۤۧۚۙۤۥ۫ۚۘۘۙۨۘ"
            goto L_0x026c
        L_0x02eb:
            boolean r0 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f211c
            if (r0 != 0) goto L_0x02e8
            java.lang.String r0 = "۟ۛۦۘ۫۬ۡ۠ۦ۠ۨۨۘۘ۠۬ۦۘۖۨۚ"
            goto L_0x026c
        L_0x02f3:
            java.lang.String r0 = "۬ۨ۫۠ۚۗۛۜۡۡ۬ۗۧۧ"
            goto L_0x026c
        L_0x02f7:
            java.lang.String r0 = "ۗ۠ۦۘۜ۬ۖۢۙۖۧۜۧۙۤ۬۟ۙۥۦۧۘۘ"
            goto L_0x0294
        L_0x02fa:
            int r0 = r1.length()
            r5 = 131071(0x1ffff, float:1.8367E-40)
            if (r0 <= r5) goto L_0x02f7
            java.lang.String r0 = "ۡۡۡۘۡۨۜۘ۬ۢ۫ۖۘۗۘ۫۬۠ۛۦۘ۟ۥۨ۟ۜۡۨۢۙ"
            goto L_0x0294
        L_0x0306:
            java.lang.String r0 = "ۨۥ۫ۦۧۜۘ۠ۧۦ۬ۚۘۨۗ۬ۧۦۘۦ"
            goto L_0x0294
        L_0x0309:
            java.lang.String r0 = "ۢۙۦۘۖ۠۟ۥۖۘۘۤۘۧۘۚۧۖ"
            goto L_0x02be
        L_0x030c:
            if (r2 == 0) goto L_0x0309
            java.lang.String r0 = "ۤ۫ۦۘۗۡۡۘۢۙۙ۬ۤۥۗ۟"
            goto L_0x02be
        L_0x0311:
            java.lang.String r0 = "ۧ۟ۦ۟ۘ۬ۨۖۙۖ۠۫ۘ۫ۤ"
            goto L_0x02be
        L_0x0314:
            java.lang.String r0 = "ۘ۠ۥ۫ۗۜۘۜۛۨۘۗۗ۟ۦۡۜۡ۫ۡۘۡۧۥۖۘۨ"
            goto L_0x02cc
        L_0x0317:
            java.lang.Class r0 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f217i
            if (r0 != 0) goto L_0x0314
            java.lang.String r0 = "ۡۜۧۘ۬ۦ۠ۨۙۦۙۜۘ۫ۤۛ"
            goto L_0x02cc
        L_0x031e:
            java.lang.String r0 = "ۚۙۢۡۛۛۥۨۧ۟ۥۢ۟ۖۘۘ۠ۤ۫ۦۡۧ"
            goto L_0x02cc
        L_0x0321:
            android.app.Application r5 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f209a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "com.cat.ereza.customactivityoncrash.RESTART"
            android.content.Intent r0 = r0.setAction(r2)
            java.lang.String r2 = com.obwhatsapp.yo.yo.mpack
            android.content.Intent r0 = r0.setPackage(r2)
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r6 = 64
            java.util.List r2 = r2.queryIntentActivities(r0, r6)
            r6 = -1859147532(0xffffffff912fa8f4, float:-1.3857129E-28)
            java.lang.String r0 = "ۢۤ۬۟ۧۦ۫۟ۨ۫ۜۢۦۖۥۜۜۨ۬۫ۥۦ۬ۡۘۜۧۨۘ"
        L_0x0343:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1649758151: goto L_0x03d0;
                case -20204861: goto L_0x03cc;
                case 1691492605: goto L_0x034c;
                case 1888705774: goto L_0x03c6;
                default: goto L_0x034b;
            }
        L_0x034b:
            goto L_0x0343
        L_0x034c:
            r0 = 0
        L_0x034d:
            r6 = -1464977397(0xffffffffa8ae380b, float:-1.9342185E-14)
            java.lang.String r2 = "ۦۢۙۦۧۤۘۥۥۘۥ۟ۧۚ۟ۦۘ"
        L_0x0352:
            int r7 = r2.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case 635631407: goto L_0x037f;
                case 987036508: goto L_0x035b;
                case 1361673749: goto L_0x0402;
                case 1439652723: goto L_0x0408;
                default: goto L_0x035a;
            }
        L_0x035a:
            goto L_0x0352
        L_0x035b:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String r2 = com.obwhatsapp.yo.yo.mpack
            android.content.Intent r2 = r0.getLaunchIntentForPackage(r2)
            r5 = -324520469(0xffffffffeca835eb, float:-1.6268333E27)
            java.lang.String r0 = "۟۫ۘۡۗۧۦۥۨۘۢ۠۠ۤ۫ۘۘۤۨۖۡۜۨۡۛۥۘ"
        L_0x036a:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1858031114: goto L_0x0410;
                case -525051689: goto L_0x0416;
                case -344745031: goto L_0x0373;
                case 918281327: goto L_0x045b;
                default: goto L_0x0372;
            }
        L_0x0372:
            goto L_0x036a
        L_0x0373:
            android.content.ComponentName r0 = r2.getComponent()     // Catch:{ ClassNotFoundException -> 0x0451 }
            java.lang.String r0 = r0.getClassName()     // Catch:{ ClassNotFoundException -> 0x0451 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0451 }
        L_0x037f:
            com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f217i = r0
        L_0x0381:
            java.lang.String r0 = "com.cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "com.cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS"
            java.lang.Class r1 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f217i
            r3.putExtra(r0, r1)
            java.lang.String r0 = "com.cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS"
            boolean r1 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f213e
            r3.putExtra(r0, r1)
            java.lang.String r0 = "com.cat.ereza.customactivityoncrash.EXTRA_EVENT_LISTENER"
            com.cat.ereza.customactivityoncrash.CustomActivityOnCrash$EventListener r1 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f218j
            r3.putExtra(r0, r1)
            java.lang.String r0 = "com.cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID"
            int r1 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f215g
            r3.putExtra(r0, r1)
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r3.setFlags(r0)
            com.cat.ereza.customactivityoncrash.CustomActivityOnCrash$EventListener r1 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f218j
            r2 = -999692829(0xffffffffc469e5e3, float:-935.592)
            java.lang.String r0 = "ۧۜۨۘۖۨۘۘۘۨۦۦ۟۬ۗۤۥۘۚۧۘۘۥ۬۠"
        L_0x03af:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1843237542: goto L_0x03b8;
                case -1143105237: goto L_0x03bb;
                case -621145157: goto L_0x042a;
                case 2001715707: goto L_0x042f;
                default: goto L_0x03b7;
            }
        L_0x03b7:
            goto L_0x03af
        L_0x03b8:
            r1.onLaunchErrorActivity()
        L_0x03bb:
            android.app.Application r0 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f209a
            r0.startActivity(r3)
            goto L_0x0081
        L_0x03c2:
            java.lang.String r0 = "ۜۨۡۚۡۚۤۚۤۛۤۨۡۥ۠ۘۗۛۚۜۚ"
            goto L_0x0343
        L_0x03c6:
            if (r2 == 0) goto L_0x03c2
            java.lang.String r0 = "ۢۦۨۛۘۡۘۡۘۨۦ۫ۗۚۤ۠ۧ۠ۚۢ۬ۦۘۤ۟ۜۘ"
            goto L_0x0343
        L_0x03cc:
            java.lang.String r0 = "۬ۜۘۖۚ۟۫ۜۘۦ۫۬ۡۢۖ۬۫ۦۘۧۢۢۧۨۢ"
            goto L_0x0343
        L_0x03d0:
            r6 = -202665278(0xfffffffff3eb92c2, float:-3.7328075E31)
            java.lang.String r0 = "ۜۨۧ۬ۤۦۘ۟ۘۛۧۖۘۨۖۢ"
        L_0x03d5:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1164126422: goto L_0x03de;
                case -58647868: goto L_0x03ea;
                case 962360303: goto L_0x03ed;
                case 1529681992: goto L_0x034c;
                default: goto L_0x03dd;
            }
        L_0x03dd:
            goto L_0x03d5
        L_0x03de:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x03e7
            java.lang.String r0 = "ۡۧ۫ۖۥ۫ۚۛۨۘۧۧۡۚۚ۠ۙۧۘ۫۠۫ۧۢ۟ۙۜۚ"
            goto L_0x03d5
        L_0x03e7:
            java.lang.String r0 = "ۨ۠ۥۘۡۛۤ۬ۗۨۘ۬ۚۡۢ۠ۙۦ۬ۖۘ"
            goto L_0x03d5
        L_0x03ea:
            java.lang.String r0 = "۫ۘۖۘ۫۟ۗۙۤۛۡۦ۬ۧۗ۫۬۫ۚۜۧ۬ۚۢ۫"
            goto L_0x03d5
        L_0x03ed:
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ ClassNotFoundException -> 0x0455 }
            java.lang.String r0 = r0.name     // Catch:{ ClassNotFoundException -> 0x0455 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0455 }
            goto L_0x034d
        L_0x03fe:
            java.lang.String r2 = "ۜۦۜۧۜۢۖ۫۫ۚۙ۬ۖۖۖ"
            goto L_0x0352
        L_0x0402:
            if (r0 != 0) goto L_0x03fe
            java.lang.String r2 = "۟۫ۢۛۙۜ۫ۥ۬ۜۗۜۖۥۡۡۜۖۘ"
            goto L_0x0352
        L_0x0408:
            java.lang.String r2 = "ۡ۫ۢۤۧۨۨۥۛۙ۟ۡۛۥۘۗۜۨ۠ۖ۬"
            goto L_0x0352
        L_0x040c:
            java.lang.String r0 = "ۖ۠ۜۢۘۥۘۘ۠ۦۘ۟ۡۧ۫ۘ۠۟ۢۥۧۘۨۦۘۡ۫ۨۘ"
            goto L_0x036a
        L_0x0410:
            if (r2 == 0) goto L_0x040c
            java.lang.String r0 = "ۨۜۖۘ۠ۡۡۘۚۖۡۘۧۡۥۧۡۖۘۥۧۤۢۢۘ"
            goto L_0x036a
        L_0x0416:
            java.lang.String r0 = "۟۟ۥۘۡۤ۬ۡۚۦ۠ۤۥۢۧۖۘ۟ۘۜۘ۬ۡۡۘ"
            goto L_0x036a
        L_0x041a:
            java.lang.String r0 = "۟ۛۤ۟ۥۥۘۙۥ۫ۢۧۖۖۙۖۘ۟۫۟ۚۚۨ"
            goto L_0x02da
        L_0x041e:
            java.lang.String r0 = "ۥۖۖۙ۫ۦۘۤ۬۬ۛۖۜۨۚۙۛۛۚ"
            goto L_0x02da
        L_0x0422:
            r0 = 0
            com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f217i = r0
            goto L_0x0381
        L_0x0427:
            java.lang.String r0 = "ۦۥۗۧۧۨۘۢ۟ۗۢۗۙۜ۠ۦۘ"
            goto L_0x03af
        L_0x042a:
            if (r1 == 0) goto L_0x0427
            java.lang.String r0 = "۫ۛۢۜۖۧۙۛۨۘۤۧۥۘۙ۫۫ۖ۟ۗ"
            goto L_0x03af
        L_0x042f:
            java.lang.String r0 = "ۢۖۤ۬ۦ۠ۖ۫ۨۖ۫ۘۘۘۡۛۘۜۖ۟ۘۡۘۙۥۘۘۡ۟ۥ"
            goto L_0x03af
        L_0x0433:
            java.lang.String r1 = "۬ۤ۟ۚۗۤۥۧۡۘۡۥۚۖ۫ۥۢۜۛ۟"
            goto L_0x008e
        L_0x0437:
            java.lang.String r1 = "ۘۦۖۘ۬ۨ۫ۘۡۥ۠ۛۖۨ۫۫۫۠۟ۡ۫"
            goto L_0x008e
        L_0x043b:
            r0.finish()
            java.lang.ref.WeakReference r0 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.f210b
            r0.clear()
        L_0x0443:
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            r0 = 10
            java.lang.System.exit(r0)
            goto L_0x024b
        L_0x0451:
            r0 = move-exception
            r0 = r4
            goto L_0x037f
        L_0x0455:
            r0 = move-exception
            goto L_0x034c
        L_0x0458:
            r0 = move-exception
            goto L_0x011b
        L_0x045b:
            r0 = r4
            goto L_0x037f
        L_0x045e:
            r0 = r3
            goto L_0x01dc
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
