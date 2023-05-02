package com.obwhatsapp.yo;

import android.view.View;

public final /* synthetic */ class a0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f610a;

    public /* synthetic */ a0(int i2) {
        this.f610a = i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            r4 = 0
            r8 = 1
            r11 = 0
            int r0 = r12.f610a
            switch(r0) {
                case 0: goto L_0x0311;
                case 1: goto L_0x030c;
                case 2: goto L_0x0307;
                case 3: goto L_0x014b;
                case 4: goto L_0x007d;
                case 5: goto L_0x0079;
                case 6: goto L_0x006a;
                case 7: goto L_0x0057;
                case 8: goto L_0x001b;
                default: goto L_0x0008;
            }
        L_0x0008:
            int r0 = com.obwhatsapp.youbasha.ui.views.YoFABView.f1401e
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.Class<com.obwhatsapp.yo.x.rlf> r3 = com.obwhatsapp.yo.x.C12241rlf.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
        L_0x001a:
            return
        L_0x001b:
            int r0 = com.obwhatsapp.youbasha.ui.views.YoFABView.f1401e
            r1 = 696946032(0x298a8d70, float:6.1529666E-14)
            java.lang.String r0 = "ۤۚۜۘ۫۬۠ۙۖۢۦۤۨۘ۟۬ۧۚۛۛۤۢۡۘۦۚۦۜۤۥۘ"
        L_0x0022:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -887157660: goto L_0x0037;
                case -663805120: goto L_0x003a;
                case -190457502: goto L_0x004d;
                case 985919234: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0022
        L_0x002b:
            boolean r0 = com.obwhatsapp.youbasha.task.utils.isReadContactsGranted()
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "ۡۖۡۘۢۤۚۡۨۤۚۦۚۗۨۢۨۘۨۘ"
            goto L_0x0022
        L_0x0034:
            java.lang.String r0 = "۬ۢۗۥۨ۠ۢۡۗۦۜۡ۬ۗۥۘۖۗ۠"
            goto L_0x0022
        L_0x0037:
            java.lang.String r0 = "ۦۦۖۘ۟ۚۢۢۛ۟ۥۘۗ۟ۗ۫"
            goto L_0x0022
        L_0x003a:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.Class<com.obwhatsapp.contact.picker.ContactPicker> r3 = com.obwhatsapp.contact.picker.ContactPicker.class
            r1.<init>(r2, r3)
            r2 = 1283(0x503, float:1.798E-42)
            r0.startActivityForResult(r1, r2)
            goto L_0x001a
        L_0x004d:
            java.lang.String r0 = "permission_contacts_access_request"
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            a.a.i(r0, r1, r11)
            goto L_0x001a
        L_0x0057:
            int r0 = com.obwhatsapp.youbasha.ui.views.YoFABView.f1401e
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.Class<com.obwhatsapp.youbasha.ui.YoSettings.AllSettings> r3 = com.obwhatsapp.youbasha.ui.YoSettings.AllSettings.class
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            goto L_0x001a
        L_0x006a:
            int r0 = com.obwhatsapp.youbasha.ui.views.YoFABView.f1401e
            boolean r0 = com.obwhatsapp.yo.yo.yoHideSeen()
            r0 = r0 ^ 1
            com.obwhatsapp.yo.yo.setHideSeen(r0)
            com.obwhatsapp.yo.yo.rebootYo()
            goto L_0x001a
        L_0x0079:
            com.obwhatsapp.yo.yo.openHiddenChats()
            goto L_0x001a
        L_0x007d:
            java.util.ArrayList r0 = com.obwhatsapp.yo.SS.f556c
            X.0tZ r0 = com.obwhatsapp.yo.p0.b()     // Catch:{ Exception -> 0x012a }
            X.1Vw r0 = r0.A11     // Catch:{ Exception -> 0x012a }
            java.lang.String r8 = r0.A01     // Catch:{ Exception -> 0x012a }
            java.lang.String r0 = com.obwhatsapp.yo.p0.currJID     // Catch:{ Exception -> 0x012a }
            java.lang.String r1 = "status_me"
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x012a }
            r2 = 1581648650(0x5e460b0a, float:3.56762771E18)
            java.lang.String r0 = "۬۠ۗۥۥ۫ۚۜۢ۟ۨۡۧۦۘۗۗۘۘۚۛۗ"
        L_0x0094:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x012a }
            r3 = r3 ^ r2
            switch(r3) {
                case -1896988456: goto L_0x001a;
                case -1680524137: goto L_0x009d;
                case -330217378: goto L_0x00a8;
                case 327670894: goto L_0x00a5;
                default: goto L_0x009c;
            }     // Catch:{ Exception -> 0x012a }
        L_0x009c:
            goto L_0x0094
        L_0x009d:
            if (r1 == 0) goto L_0x00a2
            java.lang.String r0 = "ۧۢ۟۬۬ۥۘۤ۟ۥ۫ۘۡۧۚۘ"
            goto L_0x0094
        L_0x00a2:
            java.lang.String r0 = "ۧ۬ۚ۠ۥ۠۬ۛۦۖۗ۫ۗ۬ۜ۟ۨ۫"
            goto L_0x0094
        L_0x00a5:
            java.lang.String r0 = "ۨۚۗۧۡۗۚ۟ۥۛۘۚۚۚۗۜ۫ۧۢۤۢ۬ۨۘ"
            goto L_0x0094
        L_0x00a8:
            java.util.ArrayList r1 = com.obwhatsapp.yo.SS.f556c     // Catch:{ Exception -> 0x0136 }
            r2 = -903563586(0xffffffffca24b6be, float:-2698671.5)
            java.lang.String r0 = "ۦۚۥۘۚ۟ۥۙ۬ۗۤۨۧۘۥۧۘ"
        L_0x00af:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0136 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1980681426: goto L_0x00b8;
                case -1690072001: goto L_0x00c3;
                case -390440856: goto L_0x00be;
                case 1294463594: goto L_0x0137;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            goto L_0x00af
        L_0x00b8:
            java.lang.String r0 = "ۡۨۜۗۨ۫ۢۜۙۜۥۤۢۥۥ"
            goto L_0x00af
        L_0x00bb:
            java.lang.String r0 = "ۤۜۘۘ۟ۨۡۘۘۖۖۘۡۢۡ۠ۧۨۘ۟ۦ۫ۙۢۢ"
            goto L_0x00af
        L_0x00be:
            if (r1 == 0) goto L_0x00bb
            java.lang.String r0 = "ۢۨۖۘ۫ۥۧۡۜۡۙۦ۟ۨۗۨۘ"
            goto L_0x00af
        L_0x00c3:
            r2 = -1415664352(0xffffffffab9ead20, float:-1.1274627E-12)
            java.lang.String r0 = "ۙۗۥۘۤ۟ۥۘۨۛۜۘۛۗۤۢۨۡۢۚۚۤۙۚۦۤۤۜۘۘ"
        L_0x00c8:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0136 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1754743176: goto L_0x00e0;
                case -555916663: goto L_0x00d1;
                case 1195260858: goto L_0x00d7;
                case 1368532646: goto L_0x0137;
                default: goto L_0x00d0;
            }     // Catch:{ Exception -> 0x0136 }
        L_0x00d0:
            goto L_0x00c8
        L_0x00d1:
            java.lang.String r0 = "۬ۙۛۚ۠ۡۢۤۡۦۙۛ۠ۤۜۜۡۙۧۛ"
            goto L_0x00c8
        L_0x00d4:
            java.lang.String r0 = "ۡۚ۬ۥ۟ۤۙۖۜۘۛۤۥۘۙ۫ۨۘۨۗۢۦۧ۟ۧۚ۠ۜ۠"
            goto L_0x00c8
        L_0x00d7:
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0136 }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "۟۟ۤ۟ۜۖ۠ۨۦۖۗۘۘۛۙۡۘۢۜۖۘۢۥۦۘۨۧۘۤۤ"
            goto L_0x00c8
        L_0x00e0:
            java.util.ArrayList r0 = com.obwhatsapp.yo.SS.f556c     // Catch:{ Exception -> 0x0136 }
            boolean r0 = r0.contains(r8)     // Catch:{ Exception -> 0x0136 }
        L_0x00e6:
            r2 = 1296386091(0x4d45482b, float:2.06865072E8)
            java.lang.String r1 = "ۘۦۥۘۛۘۗۘۡۦۛۨۤ۠ۥۘۙۨۦۘۢۚۖۜۛۡۘۘۧ"
        L_0x00eb:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -393499593: goto L_0x0141;
                case 208079080: goto L_0x0144;
                case 666136361: goto L_0x00f4;
                case 1575542441: goto L_0x013c;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            goto L_0x00eb
        L_0x00f4:
            com.obwhatsapp.jobqueue.job.SendReadReceiptJob r1 = new com.obwhatsapp.jobqueue.job.SendReadReceiptJob     // Catch:{ Exception -> 0x012a }
            java.lang.String r0 = "status@broadcast"
            X.0rv r2 = com.obwhatsapp.yo.dep.gen_b(r0)     // Catch:{ Exception -> 0x012a }
            java.lang.String r0 = com.obwhatsapp.yo.p0.currJID     // Catch:{ Exception -> 0x012a }
            X.0rv r3 = com.obwhatsapp.yo.dep.gen_b(r0)     // Catch:{ Exception -> 0x012a }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x012a }
            r4 = 0
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ Exception -> 0x012a }
            r0 = 0
            r5[r0] = r8     // Catch:{ Exception -> 0x012a }
            r8 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r8, r10)     // Catch:{ Exception -> 0x012a }
            com.obwhatsapp.yo.dep.a(r1)     // Catch:{ Exception -> 0x012a }
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()     // Catch:{ Exception -> 0x012a }
            java.lang.String r0 = "message_seen"
        L_0x011c:
            java.lang.String r0 = com.obwhatsapp.yo.yo.getString((java.lang.String) r0)     // Catch:{ Exception -> 0x012a }
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)     // Catch:{ Exception -> 0x012a }
            r0.show()     // Catch:{ Exception -> 0x012a }
            goto L_0x001a
        L_0x012a:
            r0 = move-exception
            java.lang.String r0 = "sticker_picker_no_stickers_in_pack"
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            a.a.i(r0, r1, r11)
            goto L_0x001a
        L_0x0136:
            r0 = move-exception
        L_0x0137:
            r0 = r11
            goto L_0x00e6
        L_0x0139:
            java.lang.String r1 = "ۖۛۤۛۢ۬۟۠۫ۧۨۨ۫ۛۗۤۖۘ"
            goto L_0x00eb
        L_0x013c:
            if (r0 == 0) goto L_0x0139
            java.lang.String r1 = "ۦۜ۬ۖ۟ۖۘۜۦۖۘۡۡ۟ۜۢۡۛ۫ۜۘۧ۠۠ۚ۫ۜۘۜۨۧ"
            goto L_0x00eb
        L_0x0141:
            java.lang.String r1 = "ۡ۬ۙ۟ۛۙۨ۬ۚۢۜۡۘۧۚۘۘ۠۟ۚۗۤۤۧۘۙۘ۟۫"
            goto L_0x00eb
        L_0x0144:
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()     // Catch:{ Exception -> 0x012a }
            java.lang.String r0 = "status_deleted"
            goto L_0x011c
        L_0x014b:
            r1 = -102803999(0xfffffffff9df55e1, float:-1.44953E35)
            java.lang.String r0 = "۠ۢۗۗ۠ۥۘۢۤۨۘۤۘ۟ۦۡۙۨۦۤ"
        L_0x0150:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1603596143: goto L_0x02e9;
                case -798538991: goto L_0x0159;
                case 1412509161: goto L_0x02f3;
                case 1829446782: goto L_0x02f7;
                default: goto L_0x0158;
            }
        L_0x0158:
            goto L_0x0150
        L_0x0159:
            android.content.Context r0 = com.obwhatsapp.yo.yo.getCtx()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r2 = -10606914928065(0xfffff65a629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r2 = -10688519306689(0xfffff647629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r2)
            android.view.View r1 = r0.inflate(r1, r4)
            X.2pj r2 = new X.2pj
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            r4 = -10718584077761(0xfffff640629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r4 = -10774418652609(0xfffff633629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r3 = com.obwhatsapp.yo.yo.getID(r3, r4)
            r2.<init>(r0, r3)
            r2.setContentView((android.view.View) r1)
            r4 = -10800188456385(0xfffff62d629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r4 = -10834548194753(0xfffff625629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.obwhatsapp.HomeActivity r3 = com.obwhatsapp.yo.yo.Homeac
            r4 = -10847433096641(0xfffff622629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r6 = -10903267671489(0xfffff615629a823f, double:NaN)
            java.lang.String r5 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            int r4 = com.obwhatsapp.yo.yo.getID(r4, r5)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass00T.A04(r3, r4)
            int r4 = com.obwhatsapp.yo.HomeUI.dialog_bg()
            com.obwhatsapp.youbasha.task.utils.updateDrawableColor(r3, r4)
            r0.setBackground(r3)
            r4 = -10941922377153(0xfffff60c629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r4 = -10984872050113(0xfffff602629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r3 = com.obwhatsapp.yo.HomeUI.dialogTextColor()
            r0.setColorFilter(r3)
            r4 = -10997756952001(0xfffff5ff629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r4 = -11027821723073(0xfffff5f8629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r3 = com.obwhatsapp.yo.HomeUI.dialogTextColor()
            r0.setTextColor(r3)
            r4 = -11040706624961(0xfffff5f5629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r4 = -11075066363329(0xfffff5ed629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4 = -11087951265217(0xfffff5ea629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r3 = com.obwhatsapp.yo.yo.getString((java.lang.String) r3)
            r0.setText(r3)
            int r3 = com.obwhatsapp.yo.HomeUI.dialogTextColor()
            r0.setTextColor(r3)
            r4 = -11195325447617(0xfffff5d1629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r4 = -11233980153281(0xfffff5c8629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            int r3 = com.obwhatsapp.yo.HomeUI.dialogTextColor()
            r0.setTextColor(r3)
            r4 = -11246865055169(0xfffff5c5629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r4 = com.obwhatsapp.yo.HomeUI.dialogTextColor()
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r6 = 25
            android.graphics.drawable.Drawable r3 = com.obwhatsapp.youbasha.others.alphaDrawable(r3, r4, r5, r6)
            r0.setBackground(r3)
            com.obwhatsapp.yo.t r3 = new com.obwhatsapp.yo.t
            r3.<init>(r2, r8)
            r0.setOnClickListener(r3)
            r4 = -11298404662721(0xfffff5b9629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r4 = -11332764401089(0xfffff5b1629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            int r1 = com.obwhatsapp.yo.HomeUI.dialogTextColor()
            r0.setTextColor(r1)
            r4 = -11345649302977(0xfffff5ae629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r3 = com.obwhatsapp.yo.HomeUI.dialogTextColor()
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r5 = 35
            android.graphics.drawable.Drawable r1 = com.obwhatsapp.youbasha.others.alphaDrawable(r1, r3, r4, r5)
            r0.setBackground(r1)
            com.obwhatsapp.yo.t r1 = new com.obwhatsapp.yo.t
            r3 = 2
            r1.<init>(r2, r3)
            r0.setOnClickListener(r1)
            r2.create()
            r2.show()
            goto L_0x001a
        L_0x02e5:
            java.lang.String r0 = "ۗۤۗۜۤۗۧۦۡۘۜۚۜۘ۟۫۫۬ۨ۟ۗ۫ۦۘ"
            goto L_0x0150
        L_0x02e9:
            boolean r0 = com.obwhatsapp.yo.yo.getAirplaneMode()
            if (r0 != 0) goto L_0x02e5
            java.lang.String r0 = "ۧ۬ۖۚۘۦۦۢۘۘۙۗۚۜۗۙۘ۟ۙۧۛۚ۫ۨ۫ۧۖۜ"
            goto L_0x0150
        L_0x02f3:
            java.lang.String r0 = "ۦۦ۠ۚۤۧۤۜۚ۠ۥۘۜۧۘۨۙۢۨۖۨۘ"
            goto L_0x0150
        L_0x02f7:
            java.lang.String r0 = "yo_airplanemode"
            boolean r1 = com.obwhatsapp.yo.yo.getAirplaneMode()
            r1 = r1 ^ 1
            com.obwhatsapp.yo.shp.setBooleanPriv(r0, r1)
            com.obwhatsapp.yo.yo.rebootYo()
            goto L_0x001a
        L_0x0307:
            com.obwhatsapp.yo.yo.openHiddenChats()
            goto L_0x001a
        L_0x030c:
            com.obwhatsapp.yo.yo.openHiddenChats()
            goto L_0x001a
        L_0x0311:
            com.obwhatsapp.yo.yo.openHiddenChats()
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.a0.onClick(android.view.View):void");
    }
}
