package c;

import android.content.DialogInterface;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f188a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f189b;

    public /* synthetic */ d(Object obj, int i2) {
        this.f188a = i2;
        this.f189b = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r12, int r13) {
        /*
            r11 = this;
            r7 = 777(0x309, float:1.089E-42)
            r6 = 2
            r4 = 0
            r10 = 1
            int r3 = r11.f188a
            java.lang.Object r2 = r11.f189b
            switch(r3) {
                case 0: goto L_0x0349;
                case 1: goto L_0x031e;
                case 2: goto L_0x02d9;
                case 3: goto L_0x02ce;
                case 4: goto L_0x02c5;
                case 5: goto L_0x02b8;
                case 6: goto L_0x029f;
                case 7: goto L_0x0278;
                case 8: goto L_0x022f;
                case 9: goto L_0x0224;
                case 10: goto L_0x020a;
                case 11: goto L_0x01d5;
                case 12: goto L_0x01c9;
                case 13: goto L_0x0178;
                case 14: goto L_0x00d8;
                case 15: goto L_0x005e;
                case 16: goto L_0x0034;
                default: goto L_0x000c;
            }
        L_0x000c:
            com.google.gson.internal.f r2 = (com.google.gson.internal.f) r2
            java.lang.Object r3 = r2.f401d
            q.b r3 = (q.b) r3
            java.lang.String r5 = r3.f2381a
            java.io.File r6 = new java.io.File
            java.lang.Object r3 = r2.f399b
            java.lang.String r3 = (java.lang.String) r3
            r6.<init>(r3)
            boolean r7 = r6.exists()
            java.lang.Object r3 = r2.f400c
            r8 = -2015366793(0xffffffff87dff177, float:-3.369523E-34)
            java.lang.String r2 = "ۦۨۥۜۗۥۘۤۙ۫ۥۦۘۥۖۥ۟۫۠"
        L_0x0028:
            int r9 = r2.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -2087134106: goto L_0x037e;
                case -917064297: goto L_0x037b;
                case -62884475: goto L_0x0375;
                case 991386992: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            java.lang.String r2 = "ۤۘۨۘۦۧ۬ۢ۟ۦۚۢۦۘۛۡۜۙۚۢۢ۫ۨۘ"
            goto L_0x0028
        L_0x0034:
            m.s r2 = (m.s) r2
            int r3 = m.s.f1840h
            r2.cancel(r10)
            android.app.ProgressDialog r3 = r2.f1846f
            r4 = -1693973772(0xffffffff9b0802f4, float:-1.125061E-22)
            java.lang.String r2 = "ۙۨۨۘ۠ۘۖۘۘۚۦۘۧ۬ۡۘ۬ۦۧۥ۟۟"
        L_0x0042:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1949619595: goto L_0x004b;
                case -1869574080: goto L_0x005d;
                case 274092288: goto L_0x0057;
                case 454959510: goto L_0x005a;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0042
        L_0x004b:
            boolean r2 = r3.isShowing()
            if (r2 == 0) goto L_0x0054
            java.lang.String r2 = "ۧۗۘۘ۟ۨۛۨۙۗ۟ۗۜۘۛۘۢۖۨۨۥ۟ۗ"
            goto L_0x0042
        L_0x0054:
            java.lang.String r2 = "ۢۤۤۥۛۨۘۙۥ۟ۙۨۢۙۨۗ۠ۨ۠۬ۦۜۢۜۘ"
            goto L_0x0042
        L_0x0057:
            java.lang.String r2 = "ۖۚۡۙ۫ۜ۠ۤۨۘ۟ۛۡۘ۟ۦۥۘۥۚۥ"
            goto L_0x0042
        L_0x005a:
            r3.dismiss()
        L_0x005d:
            return
        L_0x005e:
            com.obwhatsapp.youbasha.ui.YoSettings.UniversalColors r2 = (com.obwhatsapp.youbasha.ui.YoSettings.UniversalColors) r2
            r4 = 2146344353(0x7fee9da1, float:NaN)
            java.lang.String r3 = "۬۫ۤۚ۫ۧۙۜۖۘ۟ۖ۬ۛ۟ۨۘ۠ۜۢ"
        L_0x0065:
            int r5 = r3.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1837347519: goto L_0x00d2;
                case -528268689: goto L_0x0079;
                case 1487163978: goto L_0x0076;
                case 1540080594: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0065
        L_0x006e:
            if (r13 == 0) goto L_0x0073
            java.lang.String r3 = "ۖۙۥ۬ۗۚ۬۫ۙۥۦ۟ۜ۟ۘۘۨ۟ۛ۬ۢ۫۠۬ۜۗ۬۫"
            goto L_0x0065
        L_0x0073:
            java.lang.String r3 = "۠ۖۥ۬ۘۢ۟ۘۨۨ۠ۧۨۙۜ۬ۗ۫ۤۢۚ"
            goto L_0x0065
        L_0x0076:
            java.lang.String r3 = "ۡۦۨۘۜۙۡ۬ۚۜۚۛۥ۠ۚ۟۟ۧۙۥۗۢۚۗۜۖۤۘۘ"
            goto L_0x0065
        L_0x0079:
            r4 = -1850045372(0xffffffff91ba8c44, float:-2.943207E-28)
            java.lang.String r3 = "۟ۚۚۨۜ۫ۘۙۦۖۢۨۘۛۖۙۜۥۧۚۦۗۦۢۢ"
        L_0x007e:
            int r5 = r3.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1120243742: goto L_0x008f;
                case 223173088: goto L_0x0087;
                case 1682762749: goto L_0x00c5;
                case 1699186776: goto L_0x0092;
                default: goto L_0x0086;
            }
        L_0x0086:
            goto L_0x007e
        L_0x0087:
            if (r13 == r10) goto L_0x008c
            java.lang.String r3 = "ۦۜۘ۠۟ۛۙ۠ۧۗۧۡۧۦۗۘۗۧۛۘ۫ۛۚۥۤۦۧۘ"
            goto L_0x007e
        L_0x008c:
            java.lang.String r3 = "ۦۙ۬ۧ۠ۗۡ۠ۖۧۚۘۘۘ۟ۘۘۢ۫ۥۘۨۦ۟ۗۗۚ۠ۢۜ"
            goto L_0x007e
        L_0x008f:
            java.lang.String r3 = "۫ۨۢۡۜۘ۟ۤۥۘۢۙۧۗ۟ۨۘۧ۫ۘ"
            goto L_0x007e
        L_0x0092:
            int r3 = com.obwhatsapp.youbasha.ui.YoSettings.UniversalColors.f1219f
            r2.getClass()
            r4 = -1875568419(0xffffffff903518dd, float:-3.571511E-29)
            java.lang.String r3 = "ۛۨۖ۫ۥۚۤۖۘۘۙۚۙۚۖۥۤۛۦۘۢۥۢۜۦۚۜۡۜ"
        L_0x009c:
            int r5 = r3.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1660648877: goto L_0x00b0;
                case -1283915674: goto L_0x00ad;
                case 691388805: goto L_0x005d;
                case 1223107294: goto L_0x00a5;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            goto L_0x009c
        L_0x00a5:
            if (r13 == r6) goto L_0x00aa
            java.lang.String r3 = "۬ۙۘۘ۬ۤۖۤ۠ۨۘ۬ۛۜ۫ۤۢۘۜ۠ۡۘۛ۬ۦ"
            goto L_0x009c
        L_0x00aa:
            java.lang.String r3 = "ۥۖۖۘۨ۠۠ۡۛۡۘۖۥۘۘۚ۟ۛۛۗ۫"
            goto L_0x009c
        L_0x00ad:
            java.lang.String r3 = "ۚۡۙۜۖۨۤۚۤۡۗ۬ۥۘۗۥ۬ۘۘۨۚۢۡ۟ۦۘۙۦۦۘ"
            goto L_0x009c
        L_0x00b0:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.PICK"
            r3.<init>(r4)
            java.lang.String r4 = "image/*"
            r3.setType(r4)
            r2.startActivityForResult(r3, r7)
            com.obwhatsapp.yo.ColorPref r2 = r2.f1220e
            r2.clearDot()
            goto L_0x005d
        L_0x00c5:
            com.obwhatsapp.yo.ColorPref r2 = r2.f1220e
            r2.showGradient()
        L_0x00ca:
            java.lang.String r2 = "home_imgBK"
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            com.obwhatsapp.yo.shp.putBoolean(r2, r3)
            goto L_0x005d
        L_0x00d2:
            com.obwhatsapp.yo.ColorPref r2 = r2.f1220e
            r2.showColor()
            goto L_0x00ca
        L_0x00d8:
            com.obwhatsapp.youbasha.ui.YoSettings.Themes r2 = (com.obwhatsapp.youbasha.ui.YoSettings.Themes) r2
            java.lang.String r3 = com.obwhatsapp.youbasha.ui.YoSettings.Themes.newFMThemes_folder
            r2.getClass()
            java.io.File r3 = r2.f1217b     // Catch:{ Exception -> 0x0155 }
            java.io.File[] r6 = r3.listFiles()     // Catch:{ Exception -> 0x0155 }
            int r7 = r6.length     // Catch:{ Exception -> 0x0155 }
            r3 = r4
        L_0x00e7:
            r8 = 1281032959(0x4c5b02ff, float:5.7412604E7)
            java.lang.String r5 = "ۡۦۢۥۡۤۛۢۖۘ۬ۙۗۚۡۛ۟ۙۨ"
        L_0x00ec:
            int r9 = r5.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -1425711665: goto L_0x0100;
                case 1077009362: goto L_0x00f5;
                case 1781069078: goto L_0x0105;
                case 1808893183: goto L_0x0108;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            goto L_0x00ec
        L_0x00f5:
            r5 = r6[r3]     // Catch:{ Exception -> 0x0155 }
            r5.delete()     // Catch:{ Exception -> 0x0155 }
            int r3 = r3 + 1
            goto L_0x00e7
        L_0x00fd:
            java.lang.String r5 = "ۘ۟۬۠۠ۛۨ۬۫ۢۢ۬۫ۤۦۘۧ۫ۘۘۖۚۦۘ"
            goto L_0x00ec
        L_0x0100:
            if (r3 >= r7) goto L_0x00fd
            java.lang.String r5 = "ۨ۠ۨۗ۫ۥۧۡ۠۟ۙ۫ۗۚۘۘۛۢۥۘ"
            goto L_0x00ec
        L_0x0105:
            java.lang.String r5 = "ۡۚۖۘۡۚۖۘۧ۠۫ۥۢۜ۫ۧۢۖۤۘۘۤۜۦۙۘۧۘ"
            goto L_0x00ec
        L_0x0108:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0155 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0155 }
            r5.<init>()     // Catch:{ Exception -> 0x0155 }
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0155 }
            r5.append(r6)     // Catch:{ Exception -> 0x0155 }
            r6 = -33314407022017(0xffffe1b3629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x0155 }
            r7 = 2
            java.lang.String r6 = com.obwhatsapp.youbasha.task.utils.dbsf(r6, r7)     // Catch:{ Exception -> 0x0155 }
            r5.append(r6)     // Catch:{ Exception -> 0x0155 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0155 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0155 }
            java.io.File[] r6 = r3.listFiles()     // Catch:{ Exception -> 0x0155 }
            int r7 = r6.length     // Catch:{ Exception -> 0x0155 }
            r3 = r4
        L_0x0134:
            r8 = 1306939542(0x4de65096, float:4.8300512E8)
            java.lang.String r5 = "ۨۜۘۘ۟ۢۤۛۘ۫ۘۙۡۢۜۥۥۤۥۡۥۤۡۤۖۘ"
        L_0x0139:
            int r9 = r5.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -2117514430: goto L_0x0166;
                case -2079527491: goto L_0x0142;
                case 362253705: goto L_0x014d;
                case 1802250845: goto L_0x0148;
                default: goto L_0x0141;
            }
        L_0x0141:
            goto L_0x0139
        L_0x0142:
            java.lang.String r5 = "ۧۨۜۘ۬ۧۤ۠ۤۦۘ۬۫ۥۘ۬ۤۗۧۨۤۗ۠۠"
            goto L_0x0139
        L_0x0145:
            java.lang.String r5 = "ۤۥۙ۠ۚۗۗۨۘۚۗۚۚ۟ۘۘۘۚۖ"
            goto L_0x0139
        L_0x0148:
            if (r3 >= r7) goto L_0x0145
            java.lang.String r5 = "۫ۗۖۨ۟ۦ۫ۧۧۛۦۘۦۦۡۗ۬ۚ"
            goto L_0x0139
        L_0x014d:
            r5 = r6[r3]     // Catch:{ Exception -> 0x0155 }
            r5.delete()     // Catch:{ Exception -> 0x0155 }
            int r3 = r3 + 1
            goto L_0x0134
        L_0x0155:
            r3 = move-exception
            r6 = -33438961073601(0xffffe196629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
        L_0x0166:
            r6 = -33529155386817(0xffffe181629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r4)
            r2.show()
            goto L_0x005d
        L_0x0178:
            com.obwhatsapp.youbasha.ui.YoSettings.SecPrivacy r2 = (com.obwhatsapp.youbasha.ui.YoSettings.SecPrivacy) r2
            java.lang.CharSequence[] r3 = com.obwhatsapp.youbasha.ui.YoSettings.SecPrivacy.f1199u
            r2.getClass()
            r5 = 93249909(0x58ee175, float:1.3436436E-35)
            java.lang.String r3 = "ۨۥۚۨۤۖۨۦۚ۠ۤ۬ۗۧۚ۟ۦۘۦ۫ۙ"
        L_0x0184:
            int r6 = r3.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1570110335: goto L_0x019f;
                case -1406584167: goto L_0x019c;
                case -560196111: goto L_0x0197;
                case -231570398: goto L_0x018d;
                default: goto L_0x018c;
            }
        L_0x018c:
            goto L_0x0184
        L_0x018d:
            java.lang.String r2 = "customlockwV2"
            com.obwhatsapp.yo.shp.setBooleanPriv(r2, r4)
            goto L_0x005d
        L_0x0194:
            java.lang.String r3 = "ۡۦۛۛۡۖۜۥۜۗ۟ۗۘ۠ۧۤ۠ۜ"
            goto L_0x0184
        L_0x0197:
            if (r13 == 0) goto L_0x0194
            java.lang.String r3 = "ۨۧۥۘۘۧۦۨ۫ۥۤۡۗۧۚۜ"
            goto L_0x0184
        L_0x019c:
            java.lang.String r3 = "ۙۛۛ۬ۚۜۘ۫۟ۦۘۨۘۚ۫ۢ۬"
            goto L_0x0184
        L_0x019f:
            r4 = -305443408(0xffffffffedcb4db0, float:-7.864922E27)
            java.lang.String r3 = "ۜ۠ۡۘۤۛۡۘ۬ۨۛۤۡۗۧۖۘۢۜۘۚ۫ۡ"
        L_0x01a4:
            int r5 = r3.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case 659109735: goto L_0x01c1;
                case 1152893591: goto L_0x005d;
                case 1806702629: goto L_0x01c6;
                case 2029616171: goto L_0x01ad;
                default: goto L_0x01ac;
            }
        L_0x01ac:
            goto L_0x01a4
        L_0x01ad:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.PICK"
            r3.<init>(r4)
            java.lang.String r4 = "image/*"
            r3.setType(r4)
            r2.startActivityForResult(r3, r7)
            goto L_0x005d
        L_0x01be:
            java.lang.String r3 = "ۖۚۗۦۥۖۘۨۜۨۤۚۘۦۦ۫ۜۜۤۗۚۗۤۨۘ"
            goto L_0x01a4
        L_0x01c1:
            if (r13 == r10) goto L_0x01be
            java.lang.String r3 = "ۖۦۦۤۥۛ۠ۨۘۢۙۗۨۨۛۗ۠۫ۥ۟"
            goto L_0x01a4
        L_0x01c6:
            java.lang.String r3 = "ۚ۬۟ۙۗۦۖ۫ۢۨۡۘ۟ۦۛ"
            goto L_0x01a4
        L_0x01c9:
            com.obwhatsapp.youbasha.ui.YoSettings.BackupRestore r2 = (com.obwhatsapp.youbasha.ui.YoSettings.BackupRestore) r2
            int r3 = com.obwhatsapp.youbasha.ui.YoSettings.BackupRestore.f1141c
            r2.getClass()
            com.obwhatsapp.youbasha.backuprestore.Controller.restoreBackup(r2)
            goto L_0x005d
        L_0x01d5:
            com.obwhatsapp.youbasha.ui.YoSettings.AllSettings r2 = (com.obwhatsapp.youbasha.ui.YoSettings.AllSettings) r2
            int r3 = com.obwhatsapp.youbasha.ui.YoSettings.AllSettings.f1138c
            r2.getClass()
            android.content.Intent r3 = new android.content.Intent
            r4 = -30552743050689(0xffffe436629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r6 = -30668707167681(0xffffe41b629a823f, double:NaN)
            java.lang.String r5 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            java.lang.String r5 = "https://t.me/whatsomar"
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r3.<init>(r4, r5)
            r2.startActivity(r3)
            r2 = -30793261219265(0xffffe3fe629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            com.obwhatsapp.yo.shp.setBooleanPriv(r2, r10)
            goto L_0x005d
        L_0x020a:
            com.obwhatsapp.youbasha.task.devMsg r2 = (com.obwhatsapp.youbasha.task.devMsg) r2
            int r3 = com.obwhatsapp.youbasha.task.devMsg.f1107c
            r2.getClass()
            r4 = -22057297739201(0xffffebf0629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r2 = r2.f1108a
            com.obwhatsapp.yo.shp.setIntPriv(r3, r2)
            r12.dismiss()
            goto L_0x005d
        L_0x0224:
            java.lang.String[] r2 = (java.lang.String[]) r2
            r2 = r2[r13]
            com.obwhatsapp.youbasha.task.YTranslate.f1102c = r2
            com.obwhatsapp.youbasha.task.YTranslate.a()
            goto L_0x005d
        L_0x022f:
            com.obwhatsapp.youbasha.filechooser.ChooserDialog r2 = (com.obwhatsapp.youbasha.filechooser.ChooserDialog) r2
            com.obwhatsapp.youbasha.filechooser.ChooserDialog$Result r4 = r2.f1041f
            r5 = 514934215(0x1eb145c7, float:1.8769463E-20)
            java.lang.String r3 = "۫۫ۜ۟۬ۙۨۨۦ۟ۤۥۘۚۛۡۡۡۧۘ"
        L_0x0238:
            int r6 = r3.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1465317468: goto L_0x0241;
                case -678975365: goto L_0x024c;
                case 336935388: goto L_0x0249;
                case 647560031: goto L_0x025a;
                default: goto L_0x0240;
            }
        L_0x0240:
            goto L_0x0238
        L_0x0241:
            if (r4 == 0) goto L_0x0246
            java.lang.String r3 = "ۨۦۖۘۧۜۢۢۘۤۘۘۙۢۙۚۦ"
            goto L_0x0238
        L_0x0246:
            java.lang.String r3 = "۬ۥۙ۠ۦۛۨۥۦۘۖۢۥۘۖۛۖۙۨ۠ۜ۠۟"
            goto L_0x0238
        L_0x0249:
            java.lang.String r3 = "ۡۘۥۙۥۖۦۥۘۖۖۜۘۗۙۘۘۘ۟ۗ۬ۜۧۘۦۤۧۤۜۧۘ"
            goto L_0x0238
        L_0x024c:
            r5 = -1038954884(0xffffffffc212ce7c, float:-36.701645)
            java.lang.String r3 = "ۗۥۨ۫ۚۡ۫ۗۨۛ۟۬ۙۥ۫ۦ۠ۛۡۨۚۡۚۛۨ۠ۖ"
        L_0x0251:
            int r6 = r3.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -996034719: goto L_0x026c;
                case -645743377: goto L_0x0269;
                case 1060453556: goto L_0x025a;
                case 2114067541: goto L_0x0262;
                default: goto L_0x0259;
            }
        L_0x0259:
            goto L_0x0251
        L_0x025a:
            r12.dismiss()
            goto L_0x005d
        L_0x025f:
            java.lang.String r3 = "ۧۚۘۘۢۧۖۘۙۧۧۧۘۙ۫ۢۨۧۧ"
            goto L_0x0251
        L_0x0262:
            boolean r3 = r2.f1042g
            if (r3 == 0) goto L_0x025f
            java.lang.String r3 = "ۗۡۖ۬ۧ۬ۡۨ۫ۤۡۡۘۡۡ"
            goto L_0x0251
        L_0x0269:
            java.lang.String r3 = "ۥۛۡۘۖۦۨۘۜۦۛ۬ۡۛۖۡۥۘۖۦۧۘۚۖۨۘ۫ۡۚۚۧۡ"
            goto L_0x0251
        L_0x026c:
            java.io.File r3 = r2.f1037b
            java.lang.String r3 = r3.getAbsolutePath()
            java.io.File r2 = r2.f1037b
            r4.onChoosePath(r3, r2)
            goto L_0x025a
        L_0x0278:
            com.obwhatsapp.yo.z0 r2 = (com.obwhatsapp.yo.z0) r2
            java.lang.String r3 = com.obwhatsapp.yo.z0.f925i
            r2.getClass()
            android.content.Intent r3 = new android.content.Intent
            r4 = -2618275757505(0xfffffd9e629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r5 = com.obwhatsapp.yo.z0.f925i
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r3.<init>(r4, r5)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r4)
            android.app.Activity r2 = r2.f928a
            r2.startActivity(r3)
            goto L_0x005d
        L_0x029f:
            com.obwhatsapp.yo.autoschedreply.ListMessages r2 = (com.obwhatsapp.yo.autoschedreply.ListMessages) r2
            com.obwhatsapp.yo.autoschedreply.SQLiteAdapter r3 = r2.f669b
            r3.open()
            com.obwhatsapp.yo.autoschedreply.SQLiteAdapter r3 = r2.f669b
            r3.removeAll()
            r2.b()
            r2.a()
            com.obwhatsapp.yo.autoschedreply.SQLiteAdapter r2 = r2.f669b
            r2.close()
            goto L_0x005d
        L_0x02b8:
            com.obwhatsapp.yo.YoFontListPreference r2 = (com.obwhatsapp.yo.YoFontListPreference) r2
            r2.f606b = r13
            r3 = -1
            r2.onClick(r12, r3)
            r12.dismiss()
            goto L_0x005d
        L_0x02c5:
            com.obwhatsapp.yo.w0 r2 = (com.obwhatsapp.yo.w0) r2
            r2.b()
            r2.f900c = r10
            goto L_0x005d
        L_0x02ce:
            com.obwhatsapp.yo.n0 r2 = (com.obwhatsapp.yo.n0) r2
            int r3 = com.obwhatsapp.yo.n0.f826f
            r2.d()
            r2.f827a = r10
            goto L_0x005d
        L_0x02d9:
            com.obwhatsapp.yo.ColorPref r2 = (com.obwhatsapp.yo.ColorPref) r2
            int r3 = com.obwhatsapp.yo.ColorPref.RESETBTN_COLOR_CODE
            r4 = -1540706172(0xffffffffa42ab084, float:-3.701239E-17)
            java.lang.String r3 = "ۛۖۤۧۨ۟ۥۗۡۢۚۤ۠ۦۘۨۥۘۖ۫ۥ۟ۖۛ۟ۧۥۘ"
        L_0x02e2:
            int r5 = r3.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1999978504: goto L_0x0319;
                case -1919602608: goto L_0x02eb;
                case -37307346: goto L_0x0301;
                case 808455631: goto L_0x0306;
                default: goto L_0x02ea;
            }
        L_0x02ea:
            goto L_0x02e2
        L_0x02eb:
            r4 = 396820266(0x17a6ff2a, float:1.0791911E-24)
            java.lang.String r3 = "ۙ۫ۢۦۚۡۜۥۚۧۚ۟ۖۧۤۦ۬ۢۘۢۜۘۛ۠ۡۜۨۥۘ"
        L_0x02f0:
            int r5 = r3.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -660358440: goto L_0x030f;
                case 66276114: goto L_0x030c;
                case 1607476638: goto L_0x02f9;
                case 1698894537: goto L_0x0314;
                default: goto L_0x02f8;
            }
        L_0x02f8:
            goto L_0x02f0
        L_0x02f9:
            if (r13 == r10) goto L_0x0309
            java.lang.String r3 = "۫ۘۧۘۢۙۥۡۡۚۨۧۘۧۖۦۘۢۡ۬ۚۤۡۘ۫ۚۥۢ۠ۖۘ"
            goto L_0x02f0
        L_0x02fe:
            java.lang.String r3 = "ۖۛ۠ۨ۫ۘۖۨ۟ۗ۠ۥۘۖۡۖۘ"
            goto L_0x02e2
        L_0x0301:
            if (r13 == 0) goto L_0x02fe
            java.lang.String r3 = "ۗۙۘۘۜۘ۬ۡ۫۬ۨۦۦۘۡۙۨۘۧۦۘۢۢۘ"
            goto L_0x02e2
        L_0x0306:
            java.lang.String r3 = "ۛ۠ۗۘۦۜۥۙۨۘۢۗۥۡۗۡۘ۬ۚ۟"
            goto L_0x02e2
        L_0x0309:
            java.lang.String r3 = "ۖۨ۫ۤۘ۬ۛۛۥۘۡۤ۫۬ۧۦۘ"
            goto L_0x02f0
        L_0x030c:
            java.lang.String r3 = "ۛۡۥۘۧۙۥۘۚۨۢ۬۫ۜۘۢۧۜۘ"
            goto L_0x02f0
        L_0x030f:
            r2.getClass()
            goto L_0x005d
        L_0x0314:
            r2.showGradient()
            goto L_0x005d
        L_0x0319:
            r2.showColor()
            goto L_0x005d
        L_0x031e:
            com.obwhatsapp.yo.e r2 = (com.obwhatsapp.yo.e) r2
            int r3 = com.obwhatsapp.yo.e.f752c
            r2.cancel(r10)
            android.app.ProgressDialog r3 = r2.f753a
            r4 = -1194261273(0xffffffffb8d104e7, float:-9.96681E-5)
            java.lang.String r2 = "۬ۚۜۢ۫۠ۘۦۧ۫ۙۨۘۜۜۨۘ۟ۛ۬ۡۖۨۘۤۚۘۗۨۧۘ"
        L_0x032c:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1971700118: goto L_0x033b;
                case -506002588: goto L_0x0344;
                case 831477810: goto L_0x0335;
                case 1393128945: goto L_0x005d;
                default: goto L_0x0334;
            }
        L_0x0334:
            goto L_0x032c
        L_0x0335:
            java.lang.String r2 = "ۘۥۢۙۗۖۚۥۥ۟ۙۘۘۖۢۚ۟ۦۙۨۜۙۗۚۨۘ"
            goto L_0x032c
        L_0x0338:
            java.lang.String r2 = "۟ۧۧۥۛۦۘ۬ۖۦۘۨ۠ۢۖۚۖۘۖ۠ۧۜۖ۠"
            goto L_0x032c
        L_0x033b:
            boolean r2 = r3.isShowing()
            if (r2 == 0) goto L_0x0338
            java.lang.String r2 = "ۛۤۖۗ۠ۤ۫ۜۡۚۦۤۡۜۡۧ۫ۚۦۙۜۘ"
            goto L_0x032c
        L_0x0344:
            r3.dismiss()
            goto L_0x005d
        L_0x0349:
            com.cat.ereza.customactivityoncrash.activity.DefaultErrorActivity r2 = (com.cat.ereza.customactivityoncrash.activity.DefaultErrorActivity) r2
            int r3 = com.cat.ereza.customactivityoncrash.activity.DefaultErrorActivity.f219a
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r5 = com.cat.ereza.customactivityoncrash.CustomActivityOnCrash.getAllErrorDetailsFromIntent(r2, r3)
            java.lang.String r3 = "clipboard"
            java.lang.Object r3 = r2.getSystemService(r3)
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
            java.lang.String r6 = "Error Information"
            android.content.ClipData r5 = android.content.ClipData.newPlainText(r6, r5)
            r3.setPrimaryClip(r5)
            java.lang.String r3 = "Error Details copied"
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r4)
            r2.show()
            goto L_0x005d
        L_0x0371:
            java.lang.String r2 = "۟ۥۚۨۡۙۙۖۥۘ۬ۖۧۘۧۨۨۗۜۚۧۖۥ"
            goto L_0x0028
        L_0x0375:
            if (r7 != 0) goto L_0x0371
            java.lang.String r2 = "۟ۡۗۛۜ۠ۛ۠۫۠ۖۛۖ۟ۙ"
            goto L_0x0028
        L_0x037b:
            r6.mkdir()     // Catch:{ SecurityException -> 0x0425 }
        L_0x037e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r2.<init>()     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.lang.String r4 = com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity.f1334d     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r2.append(r4)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r2.append(r5)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r6 = -28040187182529(0xffffe67f629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r2.append(r4)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.lang.String r2 = r2.toString()     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r4.<init>()     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.lang.String r6 = com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity.f1335e     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r4.append(r6)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r4.append(r5)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r6 = -28061662019009(0xffffe67a629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r4.append(r6)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.lang.String r4 = r4.toString()     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r6.<init>()     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.lang.String r7 = com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity.f1335e     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r6.append(r7)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r6.append(r5)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r8 = -28091726790081(0xffffe673629a823f, double:NaN)
            java.lang.String r7 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r8)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r6.append(r7)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.lang.String r6 = r6.toString()     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            com.obwhatsapp.youbasha.task.ThemeDownloadAsync r7 = new com.obwhatsapp.youbasha.task.ThemeDownloadAsync     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r7.<init>(r5, r2, r4, r6)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.util.concurrent.Executor r2 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r4 = 0
            java.lang.Void[] r4 = new java.lang.Void[r4]     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r7.executeOnExecutor(r2, r4)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r0 = r3
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r2 = r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r4.<init>()     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r6 = -28138971430337(0xffffe668629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.lang.String r6 = com.obwhatsapp.yo.yo.getString((java.lang.String) r6)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r4.append(r6)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r4.append(r5)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            java.lang.String r4 = r4.toString()     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r5 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r4, r5)     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            r2.show()     // Catch:{ SecurityException -> 0x040c, Exception -> 0x043f }
            goto L_0x005d
        L_0x040c:
            r2 = move-exception
            android.content.Context r3 = (android.content.Context) r3
            r4 = -28242050645441(0xffffe650629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r2)
            android.widget.Toast r2 = android.widget.Toast.makeText(r3, r2, r10)
            r2.show()
            goto L_0x005d
        L_0x0425:
            r2 = move-exception
            r2 = r3
            android.content.Context r2 = (android.content.Context) r2
            r6 = -27846913654209(0xffffe6ac629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            java.lang.String r6 = com.obwhatsapp.yo.yo.getString((java.lang.String) r6)
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r6, r4)
            r2.show()
            goto L_0x037e
        L_0x043f:
            r2 = move-exception
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.onClick(android.content.DialogInterface, int):void");
    }
}
