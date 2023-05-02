package com.obwhatsapp.yo;

public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f773a;

    /* renamed from: b  reason: collision with root package name */
    public final int f774b;

    public /* synthetic */ g0(int i2, int i3) {
        this.f773a = i2;
        this.f774b = i3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6 A[SYNTHETIC, Splitter:B:41:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00bd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            r3 = 1
            r1 = 0
            int r5 = r14.f773a
            int r6 = r14.f774b
            java.util.ArrayList r0 = com.obwhatsapp.yo.SS.f556c
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x010a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010a }
            r0.<init>()     // Catch:{ Exception -> 0x010a }
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()     // Catch:{ Exception -> 0x010a }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ Exception -> 0x010a }
            java.lang.String r2 = r2.getParent()     // Catch:{ Exception -> 0x010a }
            r0.append(r2)     // Catch:{ Exception -> 0x010a }
            r8 = -12921902300609(0xfffff43f629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r8)     // Catch:{ Exception -> 0x010a }
            r0.append(r2)     // Catch:{ Exception -> 0x010a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x010a }
            r7.<init>(r0)     // Catch:{ Exception -> 0x010a }
            com.obwhatsapp.yo.h0 r0 = new com.obwhatsapp.yo.h0     // Catch:{ Exception -> 0x010a }
            r2 = 0
            r0.<init>(r2)     // Catch:{ Exception -> 0x010a }
            java.lang.String[] r8 = r7.list(r0)     // Catch:{ Exception -> 0x010a }
            int r9 = r8.length     // Catch:{ Exception -> 0x010a }
            r0 = r1
        L_0x003d:
            r4 = 110095027(0x68feab3, float:5.413548E-35)
            java.lang.String r2 = "ۧۚۙۙ۠ۧۤۥۘ۟ۥۗ۫ۦۜۘۚۚۨۘۗۦۘۥۗۘۘ"
        L_0x0042:
            int r10 = r2.hashCode()
            r10 = r10 ^ r4
            switch(r10) {
                case -607695733: goto L_0x0053;
                case -338832685: goto L_0x004b;
                case 347224146: goto L_0x00f2;
                case 1916616798: goto L_0x0056;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0042
        L_0x004b:
            if (r0 >= r9) goto L_0x0050
            java.lang.String r2 = "ۙۘۨۛۗۛۡۥۥۨۧ۟ۚۧ۠۟ۥۡۛۤۧۥۦۚ"
            goto L_0x0042
        L_0x0050:
            java.lang.String r2 = "ۡۢۥ۟۬ۘۥۚۙۛۧۡۘۤۡۜۘۥۥۚۥ۫ۨ"
            goto L_0x0042
        L_0x0053:
            java.lang.String r2 = "ۙۦۖ۟ۛ۬۬ۘۤ۟ۤۗۦۦ۟ۡۜۘ۬"
            goto L_0x0042
        L_0x0056:
            r10 = r8[r0]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010a }
            r4.<init>()     // Catch:{ Exception -> 0x010a }
            java.lang.String r11 = com.obwhatsapp.yo.SS.f562i     // Catch:{ Exception -> 0x010a }
            r4.append(r11)     // Catch:{ Exception -> 0x010a }
            r4.append(r5)     // Catch:{ Exception -> 0x010a }
            r12 = -12986326810049(0xfffff430629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)     // Catch:{ Exception -> 0x010a }
            r4.append(r2)     // Catch:{ Exception -> 0x010a }
            r12 = 1998652504(0x77210458, float:3.265812E33)
            java.lang.String r2 = "ۙۦۡۘۜۢۨۦۗۦ۬ۗۗ۫ۦۜۘۛۤۨۘۗۘۚۛۙ"
        L_0x0076:
            int r13 = r2.hashCode()     // Catch:{ Exception -> 0x010a }
            r13 = r13 ^ r12
            switch(r13) {
                case -1933356095: goto L_0x007f;
                case -1850841800: goto L_0x0092;
                case -987811846: goto L_0x010c;
                case 187247466: goto L_0x0085;
                default: goto L_0x007e;
            }     // Catch:{ Exception -> 0x010a }
        L_0x007e:
            goto L_0x0076
        L_0x007f:
            java.lang.String r2 = "ۡۚۘۧۧ۫۬۠۠ۖۗۗۜۚۡۘۚۡۧۘۜۧۚۖۗۥۘ"
            goto L_0x0076
        L_0x0082:
            java.lang.String r2 = "ۢۥۥۤۜۡ۠ۧۘۘۗۜ۟۟ۨۗ"
            goto L_0x0076
        L_0x0085:
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x010a }
            boolean r2 = r10.equals(r2)     // Catch:{ Exception -> 0x010a }
            if (r2 != 0) goto L_0x0082
            java.lang.String r2 = "۟ۡ۟ۦ۟ۜۘۙۛۡۘۜۧۗۚۤۥۘۦۤۥۘۢۥۨۘۙۚۜ"
            goto L_0x0076
        L_0x0092:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010a }
            r4.<init>()     // Catch:{ Exception -> 0x010a }
            r4.append(r11)     // Catch:{ Exception -> 0x010a }
            r4.append(r6)     // Catch:{ Exception -> 0x010a }
            r12 = -13007801646529(0xfffff42b629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)     // Catch:{ Exception -> 0x010a }
            r4.append(r2)     // Catch:{ Exception -> 0x010a }
            r11 = 570592724(0x22028dd4, float:1.7693368E-18)
            java.lang.String r2 = "ۧۙ۫ۜۤۨ۫ۧۜۘۦۦ۬ۘۨۙ۬ۡ۫"
        L_0x00ae:
            int r12 = r2.hashCode()     // Catch:{ Exception -> 0x010a }
            r12 = r12 ^ r11
            switch(r12) {
                case -1708464293: goto L_0x00de;
                case -980901842: goto L_0x00ce;
                case -378572861: goto L_0x00b7;
                case 1391583894: goto L_0x00db;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            goto L_0x00ae
        L_0x00b7:
            r2 = r1
        L_0x00b8:
            r11 = -813148585(0xffffffffcf885657, float:-4.5747195E9)
            java.lang.String r4 = "۬ۢۧۡۦۨۘۛۨۗۢ۠ۡۘۛۦۚۛۨۘۚۦۘ"
        L_0x00bd:
            int r12 = r4.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -500087456: goto L_0x00c6;
                case 521077990: goto L_0x00ee;
                case 914797633: goto L_0x00e6;
                case 1709214985: goto L_0x00e3;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            goto L_0x00bd
        L_0x00c6:
            if (r2 != 0) goto L_0x00e0
            java.lang.String r4 = "۠ۘۧۜۗۛۛۧۨۨ۬ۖ۟ۙ۬ۜۘۢۧۘۦۘ"
            goto L_0x00bd
        L_0x00cb:
            java.lang.String r2 = "۬ۥۦۘۨۖۧۢۡۘۛۗ۠ۨۦ"
            goto L_0x00ae
        L_0x00ce:
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x010a }
            boolean r2 = r10.equals(r2)     // Catch:{ Exception -> 0x010a }
            if (r2 == 0) goto L_0x00cb
            java.lang.String r2 = "ۛۚۚۡۜۖۘ۟۫۟ۚۙۨۥۙ"
            goto L_0x00ae
        L_0x00db:
            java.lang.String r2 = "ۛۢۥۤۜۖۡۦۤۥۥ۫ۙ۠۬ۘۨۥۤۢۛۘۦ"
            goto L_0x00ae
        L_0x00de:
            r2 = r3
            goto L_0x00b8
        L_0x00e0:
            java.lang.String r4 = "ۜۛ۠ۗۘۨۖۖۨۘۤۨۗۤۡۘۤ۫ۖ"
            goto L_0x00bd
        L_0x00e3:
            java.lang.String r4 = "ۡ۫ۨۘۙ۬۟ۗۘۧۘۘۚۛۧۘۜ"
            goto L_0x00bd
        L_0x00e6:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x010a }
            r2.<init>(r7, r10)     // Catch:{ Exception -> 0x010a }
            r2.delete()     // Catch:{ Exception -> 0x010a }
        L_0x00ee:
            int r0 = r0 + 1
            goto L_0x003d
        L_0x00f2:
            android.content.SharedPreferences r0 = com.obwhatsapp.yo.SS.f558e     // Catch:{ Exception -> 0x010a }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x010a }
            r2 = -13029276483009(0xfffff426629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)     // Catch:{ Exception -> 0x010a }
            r2 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)     // Catch:{ Exception -> 0x010a }
            r0.apply()     // Catch:{ Exception -> 0x010a }
        L_0x0109:
            return
        L_0x010a:
            r0 = move-exception
            goto L_0x0109
        L_0x010c:
            r2 = r3
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.g0.run():void");
    }
}
