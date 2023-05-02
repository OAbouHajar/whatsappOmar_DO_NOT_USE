package com.obwhatsapp.yo;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f745a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f746b;

    public /* synthetic */ d(Object obj, int i2) {
        this.f745a = i2;
        this.f746b = obj;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.obwhatsapp.yo.ChatGenSingle$SingleUserMessagesAdapter, X.01X] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0327, code lost:
        r1.setColorFilter(r4, android.graphics.PorterDuff.Mode.SRC_ATOP);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            r2 = -1
            r8 = 1
            r7 = 0
            r6 = 23
            r3 = 0
            int r1 = r9.f745a
            java.lang.Object r0 = r9.f746b
            switch(r1) {
                case 0: goto L_0x0377;
                case 1: goto L_0x01d1;
                case 2: goto L_0x0160;
                case 3: goto L_0x014e;
                case 4: goto L_0x0122;
                case 5: goto L_0x011b;
                case 6: goto L_0x0114;
                case 7: goto L_0x010d;
                case 8: goto L_0x0106;
                case 9: goto L_0x00ff;
                case 10: goto L_0x00f8;
                case 11: goto L_0x00ed;
                case 12: goto L_0x00e6;
                case 13: goto L_0x00c7;
                case 14: goto L_0x00a3;
                case 15: goto L_0x0099;
                case 16: goto L_0x006e;
                case 17: goto L_0x005e;
                case 18: goto L_0x0023;
                default: goto L_0x000d;
            }
        L_0x000d:
            rc.whatsapp.home.RCTABS.OneUiNavigationView r0 = (rc.whatsapp.home.RCTABS.OneUiNavigationView) r0
            int r1 = rc.whatsapp.home.RCTABS.OneUiNavigationView.A
            r0.getClass()
            r2 = 289675609(0x11441959, float:1.5469485E-28)
            java.lang.String r1 = "ۤۧۖۧۗۨ۬۬ۨۦۦۜۤۤۖۢۨۦۘ"
        L_0x0019:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1798623291: goto L_0x0022;
                case -1682633364: goto L_0x03ee;
                case 379507766: goto L_0x03fa;
                case 447815572: goto L_0x03f6;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            return
        L_0x0023:
            rc.whatsapp.home.RCTABS.BasicNavigationView r0 = (rc.whatsapp.home.RCTABS.BasicNavigationView) r0
            int r1 = rc.whatsapp.home.RCTABS.BasicNavigationView.H
            r0.getClass()
            r2 = 866483344(0x33a57c90, float:7.706069E-8)
            java.lang.String r1 = "ۦ۟ۡۘۜۧۥۥۗۡۘ۟۟ۛۚۗۜۘۨ۬۟"
        L_0x002f:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1945303830: goto L_0x0054;
                case -1527107504: goto L_0x0022;
                case -244657570: goto L_0x005b;
                case 443366040: goto L_0x0038;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x002f
        L_0x0038:
            android.widget.ImageView r1 = r0.f2530v
            java.lang.String r2 = "vec_ic_community_tab"
            java.lang.String r3 = "drawable"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r1.setImageResource(r2)
            android.widget.TextView r0 = r0.f2523o
            java.lang.String r1 = "community"
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            r0.setText(r1)
            goto L_0x0022
        L_0x0051:
            java.lang.String r1 = "ۦۥۥۛۘ۠ۘۡۥۘۜۜۖۢۢۡۖۨۧۘۗۖۗۧۛۤۧۨۘۘ"
            goto L_0x002f
        L_0x0054:
            boolean r1 = com.obwhatsapp.yo.yo.isCommunityEnabled
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = "۬۬ۧۥۢ۬ۚۖۧۘۘۜ۠ۗۙۗ"
            goto L_0x002f
        L_0x005b:
            java.lang.String r1 = "ۢ۟ۜۘۥۧۡۘۦۖۘ۠ۚۖۜ۬ۤۜۜۡۘۤۖ۟"
            goto L_0x002f
        L_0x005e:
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            java.lang.String r1 = "network_required"
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r3)
            r0.show()
            goto L_0x0022
        L_0x006e:
            com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow r0 = (com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow) r0
            android.widget.ImageView r3 = r0.f1415j
            r4 = -1404093104(0xffffffffac4f3d50, float:-2.9450505E-12)
            java.lang.String r1 = "ۛۤۘۘ۫۫ۗۥ۟۠ۧ۬ۥۗۚۚ"
        L_0x0077:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -865338917: goto L_0x0094;
                case -479313875: goto L_0x0080;
                case 176985247: goto L_0x008d;
                case 277266658: goto L_0x0097;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0077
        L_0x0080:
            int r0 = com.obwhatsapp.yo.ColorStore.getDefaultHomeRowsUnreadBkColor()
        L_0x0084:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.setColorFilter(r0, r1)
            goto L_0x0022
        L_0x008a:
            java.lang.String r1 = "ۗۙۙۘۛۡۛۗۙۦ۟ۡۘۚۛۤ"
            goto L_0x0077
        L_0x008d:
            boolean r1 = r0.f1417l
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = "ۤ۠ۦ۬ۙۜ۫۠ۢۙۚۢۜ۫ۘ۫ۡۥۘۨۤۦۘۚۚۨۘ۠ۤۨۘ"
            goto L_0x0077
        L_0x0094:
            java.lang.String r1 = "۫ۧۨۢۘۨۘۤۘۘۦ۠ۖۘۙۛۦۘۨۘ"
            goto L_0x0077
        L_0x0097:
            r0 = r2
            goto L_0x0084
        L_0x0099:
            com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView r0 = (com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView) r0
            com.obwhatsapp.youbasha.ui.views.n r1 = r0.f1393a
            int r1 = r1.f1503n
            r0.setPadding(r1, r1, r1, r1)
            goto L_0x0022
        L_0x00a3:
            com.obwhatsapp.youbasha.ui.views.IGStatusesView r0 = (com.obwhatsapp.youbasha.ui.views.IGStatusesView) r0
            r2 = -1934269186(0xffffffff8cb564fe, float:-2.7948248E-31)
            java.lang.String r1 = "۫ۙۡۘ۬۟ۦ۫۫ۡ۟ۦۥۛۛۚ۫ۥۘ"
        L_0x00aa:
            int r4 = r1.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -587320450: goto L_0x040c;
                case 360559153: goto L_0x00bd;
                case 681508390: goto L_0x00c4;
                case 1213925337: goto L_0x00b3;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            goto L_0x00aa
        L_0x00b3:
            r1 = 8
        L_0x00b5:
            r0.setVisibility(r1)
            goto L_0x0022
        L_0x00ba:
            java.lang.String r1 = "ۗۢۜۘ۬ۗۘۘ۠ۖۜۨۢ۟ۜۦۜۘ۟ۦۖۘ"
            goto L_0x00aa
        L_0x00bd:
            boolean r1 = r0.f1381a
            if (r1 == 0) goto L_0x00ba
            java.lang.String r1 = "ۚۥۤۙ۫ۡۘۡۥۘۘۚۧۗۢۦۧۚۤۡ"
            goto L_0x00aa
        L_0x00c4:
            java.lang.String r1 = "ۤۥۤۤۢۨۘۘۗ۠ۨۚۛۖ۬ۡۘۘ۫ۥۘۚۦۤۧۥۥۡۗۘ"
            goto L_0x00aa
        L_0x00c7:
            com.google.gson.internal.i r0 = (com.google.gson.internal.i) r0
            java.lang.Object r0 = r0.f409c
            com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity r0 = (com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity) r0
            r4 = -26214826081729(0xffffe828629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            android.widget.Toast r1 = android.widget.Toast.makeText(r0, r1, r3)
            r1.show()
            r0.finish()
            goto L_0x0022
        L_0x00e6:
            com.obwhatsapp.youbasha.ui.YoSettings.YoWAWidget r0 = (com.obwhatsapp.youbasha.ui.YoSettings.YoWAWidget) r0
            r0.updatePreview()
            goto L_0x0022
        L_0x00ed:
            com.obwhatsapp.youbasha.ui.YoSettings.UniversalStyle r0 = (com.obwhatsapp.youbasha.ui.YoSettings.UniversalStyle) r0
            int r1 = m.s.f1840h
            java.lang.String r1 = com.obwhatsapp.youbasha.ui.YoSettings.UniversalStyle.f1224h
            r0.c()
            goto L_0x0022
        L_0x00f8:
            com.obwhatsapp.youbasha.ui.YoSettings.HomeStatus r0 = (com.obwhatsapp.youbasha.ui.YoSettings.HomeStatus) r0
            r0.updatePreview()
            goto L_0x0022
        L_0x00ff:
            com.obwhatsapp.youbasha.ui.YoSettings.HomeRows r0 = (com.obwhatsapp.youbasha.ui.YoSettings.HomeRows) r0
            r0.updatePreview()
            goto L_0x0022
        L_0x0106:
            com.obwhatsapp.youbasha.ui.YoSettings.HomeFAB r0 = (com.obwhatsapp.youbasha.ui.YoSettings.HomeFAB) r0
            r0.updatePreview()
            goto L_0x0022
        L_0x010d:
            com.obwhatsapp.youbasha.ui.YoSettings.ConvoEntry r0 = (com.obwhatsapp.youbasha.ui.YoSettings.ConvoEntry) r0
            r0.updatePreview()
            goto L_0x0022
        L_0x0114:
            com.obwhatsapp.youbasha.ui.YoSettings.ConvoBubbleTicks r0 = (com.obwhatsapp.youbasha.ui.YoSettings.ConvoBubbleTicks) r0
            r0.updatePreview()
            goto L_0x0022
        L_0x011b:
            com.obwhatsapp.youbasha.ui.YoSettings.ConvoActionBar r0 = (com.obwhatsapp.youbasha.ui.YoSettings.ConvoActionBar) r0
            r0.updatePreview()
            goto L_0x0022
        L_0x0122:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.String r1 = com.obwhatsapp.yo.yo.mpack
            android.view.View r0 = r0.getChildAt(r3)
            r2 = 1791265278(0x6ac489fe, float:1.18800555E26)
            java.lang.String r1 = "ۦۤۗۧۖۗۖۗۛۗۙۖۚ۠ۗۘۦۡۘ"
        L_0x012f:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1723429341: goto L_0x0022;
                case -1432419181: goto L_0x0144;
                case -959129714: goto L_0x0138;
                case 224047862: goto L_0x014b;
                default: goto L_0x0137;
            }
        L_0x0137:
            goto L_0x012f
        L_0x0138:
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.obwhatsapp.yo.yo.homeActionbarTitle = r0
            com.obwhatsapp.yo.yo.H2()
            goto L_0x0022
        L_0x0141:
            java.lang.String r1 = "ۧۙۡۘۗ۬ۘۘۜۙۢۛ۬۠ۖۘۘ۟ۧۗۨۡۘۗۤۨ"
            goto L_0x012f
        L_0x0144:
            boolean r1 = r0 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x0141
            java.lang.String r1 = "ۨۨ۠ۢۢۛۧ۠ۡۖۦۘۧۧۗۤۥ۟ۗۦۛۦۙۥ"
            goto L_0x012f
        L_0x014b:
            java.lang.String r1 = "ۨۘ۫ۧۗۛۗۥ۠ۚ۟۟۬ۨۤ"
            goto L_0x012f
        L_0x014e:
            android.app.ProgressDialog r0 = (android.app.ProgressDialog) r0
            int r1 = com.obwhatsapp.yo.massmsger.MassSender.f807a
            r0.dismiss()
            java.lang.String r0 = "message_sent"
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            a.a.i(r0, r1, r3)
            goto L_0x0022
        L_0x0160:
            java.util.ArrayList r1 = com.obwhatsapp.yo.SS.f556c
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            java.lang.String r1 = r0.A01
            java.util.ArrayList r2 = com.obwhatsapp.yo.SS.f556c     // Catch:{ Exception -> 0x0409 }
            r4 = -1684981214(0xffffffff9b913a22, float:-2.4025805E-22)
            java.lang.String r0 = "ۛۗۖۖ۟ۘ۫۠۬ۚۡۦۘۚ۠ۡۘۖۚۥ۠ۘ۫۠ۦۥۨۦۨ"
        L_0x016f:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x0409 }
            r5 = r5 ^ r4
            switch(r5) {
                case 13452506: goto L_0x0178;
                case 170740151: goto L_0x0192;
                case 1250089555: goto L_0x01a6;
                case 1818736931: goto L_0x0197;
                default: goto L_0x0177;
            }     // Catch:{ Exception -> 0x0409 }
        L_0x0177:
            goto L_0x016f
        L_0x0178:
            r4 = 1698633728(0x653f1800, float:5.640092E22)
            java.lang.String r0 = "ۚ۬ۨۘۢۢ۫۫ۚۖ۫ۛۚ۬ۢۨۚۥ۠ۡۖۗ"
        L_0x017d:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x0409 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1586133805: goto L_0x0186;
                case -1310666402: goto L_0x019d;
                case 1122697246: goto L_0x01a0;
                case 1388457380: goto L_0x01a6;
                default: goto L_0x0185;
            }     // Catch:{ Exception -> 0x0409 }
        L_0x0185:
            goto L_0x017d
        L_0x0186:
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x0409 }
            if (r0 == 0) goto L_0x019a
            java.lang.String r0 = "ۤۘۥۘ۬ۘۤۗۧۤۥۤۨۘۙ۠ۦۖۖۧۘ"
            goto L_0x017d
        L_0x018f:
            java.lang.String r0 = "۠ۡۘۨۛۙۥۘۗۨۚ۠ۨۦۢۗ۫ۦۘ"
            goto L_0x016f
        L_0x0192:
            if (r2 == 0) goto L_0x018f
            java.lang.String r0 = "ۙۢۜۖۜۧ۟ۜ۟۠ۙۦ۠ۖۥۨۖۨۧۘۗۗ۠ۤۘۖۘ"
            goto L_0x016f
        L_0x0197:
            java.lang.String r0 = "ۢۤۦۘۡۤۧ۟ۘۨۛۥۡۤۜۘۤۨ۠ۗۢۗ"
            goto L_0x016f
        L_0x019a:
            java.lang.String r0 = "۟ۨ۫ۥۡۗ۫ۨۥۘ۬ۘۢۛۨۘ"
            goto L_0x017d
        L_0x019d:
            java.lang.String r0 = "۟ۤۥۘۜۘۛۡۥۦ۟ۜۘ۬ۡ۟۠ۥۖ۠ۢ۟ۙ۟۠"
            goto L_0x017d
        L_0x01a0:
            java.util.ArrayList r0 = com.obwhatsapp.yo.SS.f556c     // Catch:{ Exception -> 0x0409 }
            boolean r3 = r0.contains(r1)     // Catch:{ Exception -> 0x0409 }
        L_0x01a6:
            java.lang.ref.WeakReference r0 = com.obwhatsapp.yo.SS.f557d
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = -766076425(0xffffffffd25699f7, float:-2.30426526E11)
            java.lang.String r1 = "ۥ۠ۜۘۡۤۡۘۥۧۦۘۤۙۧۥ۠ۚۧ۫۬"
        L_0x01b3:
            int r4 = r1.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1697717659: goto L_0x01c7;
                case -534201887: goto L_0x01bc;
                case 845442345: goto L_0x01cc;
                case 1343580420: goto L_0x01c4;
                default: goto L_0x01bb;
            }
        L_0x01bb:
            goto L_0x01b3
        L_0x01bc:
            if (r3 == 0) goto L_0x01c1
            java.lang.String r1 = "۬ۖۘۛۦۦۘۙۛۜۖۢۘۘۥ۬۬ۛۢۡۢۗۡۘ۠ۚۜۛۘۖ"
            goto L_0x01b3
        L_0x01c1:
            java.lang.String r1 = "ۘۥۧۘۜۤۥۢۚۦۘۡۢۙۛ۫ۧۚ۬۠ۖ۫ۖۤۢۗ"
            goto L_0x01b3
        L_0x01c4:
            java.lang.String r1 = "ۤۡۖۘ۬ۡۖۘۜۜۡۗۧۨۚۗۥۤۖۡۘۖ۬۬"
            goto L_0x01b3
        L_0x01c7:
            com.obwhatsapp.yo.yo.setDelIcon(r0, r8)
            goto L_0x0022
        L_0x01cc:
            r0.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r7, r7)
            goto L_0x0022
        L_0x01d1:
            android.view.Menu r0 = (android.view.Menu) r0
            int r1 = com.obwhatsapp.yo.Conversation.f512a
            java.lang.String r1 = "div2"
            java.lang.String r2 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r1, r2)
            r4 = 118856410(0x7159ada, float:1.1255021E-34)
            java.lang.String r1 = "ۙۖۧۜ۫ۦۥۙۘۜۘۨۗ۟ۜۘۡ۠ۚ"
        L_0x01e2:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1558522900: goto L_0x0294;
                case -1421416328: goto L_0x0286;
                case -361891538: goto L_0x01eb;
                case 1141370683: goto L_0x0290;
                default: goto L_0x01ea;
            }
        L_0x01ea:
            goto L_0x01e2
        L_0x01eb:
            r1 = 273(0x111, float:3.83E-43)
            java.lang.String r2 = "ddtl_emoji"
            java.lang.String r4 = "string"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r4)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((int) r2)
            android.view.MenuItem r1 = r0.add(r6, r1, r3, r2)
            com.obwhatsapp.yo.w r2 = new com.obwhatsapp.yo.w
            r2.<init>(r8)
            r1.setOnMenuItemClickListener(r2)
            r1 = 546(0x222, float:7.65E-43)
            java.lang.String r2 = "voicechanger"
            java.lang.String r4 = "string"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r4)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((int) r2)
            android.view.MenuItem r1 = r0.add(r6, r1, r3, r2)
            com.obwhatsapp.yo.w r2 = new com.obwhatsapp.yo.w
            r4 = 2
            r2.<init>(r4)
            r1.setOnMenuItemClickListener(r2)
            r1 = 819(0x333, float:1.148E-42)
            java.lang.String r2 = "go_to_first_msg"
            java.lang.String r4 = "string"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r4)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((int) r2)
            android.view.MenuItem r1 = r0.add(r6, r1, r3, r2)
            com.obwhatsapp.yo.w r2 = new com.obwhatsapp.yo.w
            r4 = 3
            r2.<init>(r4)
            r1.setOnMenuItemClickListener(r2)
            r1 = 1092(0x444, float:1.53E-42)
            java.lang.String r2 = "search_web"
            java.lang.String r4 = "string"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r4)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((int) r2)
            android.view.MenuItem r1 = r0.add(r6, r1, r3, r2)
            com.obwhatsapp.yo.w r2 = new com.obwhatsapp.yo.w
            r4 = 4
            r2.<init>(r4)
            r1.setOnMenuItemClickListener(r2)
            r1 = 1365(0x555, float:1.913E-42)
            java.lang.String r2 = "clearemoji"
            java.lang.String r4 = "string"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r4)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((int) r2)
            android.view.MenuItem r1 = r0.add(r6, r1, r3, r2)
            com.obwhatsapp.yo.w r2 = new com.obwhatsapp.yo.w
            r4 = 5
            r2.<init>(r4)
            r1.setOnMenuItemClickListener(r2)
            r2 = -470358483(0xffffffffe3f6e62d, float:-9.10897E21)
            java.lang.String r1 = "ۘۢۡ۠ۘۧۘۧ۫ۦۖۚۦ۫ۚۜۖۦۖۘۛ۫ۡۢۛۖۘۛۛۘۘ"
        L_0x0276:
            int r4 = r1.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1871002816: goto L_0x02b1;
                case -1451558490: goto L_0x02f9;
                case -1186174681: goto L_0x02be;
                case 313649872: goto L_0x027f;
                default: goto L_0x027e;
            }
        L_0x027e:
            goto L_0x0276
        L_0x027f:
            java.lang.String r1 = "ۥۡۙۢۚۡۘۖۥۤۚۜۖۢۦۗۘۡۛ"
            goto L_0x0276
        L_0x0282:
            java.lang.String r1 = "ۜۛۡۗۛۙۧ۫۟ۤۜۧۦۡۦۘ"
            goto L_0x01e2
        L_0x0286:
            boolean r1 = com.obwhatsapp.yo.yo.getGroupBoolean()
            if (r1 != 0) goto L_0x0282
            java.lang.String r1 = "ۗ۫ۥۘۥۖۙۗ۫ۛۚۢۘۤۨۨ۟ۗۢۥۜۧۘۛۘۦۨ۬ۖ"
            goto L_0x01e2
        L_0x0290:
            java.lang.String r1 = "۟ۦۢۗۤۥۗۜۘۤ۫ۗ۟ۛ"
            goto L_0x01e2
        L_0x0294:
            java.lang.String r1 = "create_link_contact"
            java.lang.String r4 = "string"
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r4)
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((int) r1)
            android.view.MenuItem r1 = r0.add(r6, r2, r3, r1)
            com.obwhatsapp.yo.w r2 = new com.obwhatsapp.yo.w
            r2.<init>(r3)
            r1.setOnMenuItemClickListener(r2)
            goto L_0x01eb
        L_0x02ae:
            java.lang.String r1 = "ۥۦۧۘ۟۟ۜۘ۟ۤۤۧۨۥۘ۟ۗۢۧۥۛ۠ۙ۫ۗۖۨۘۧۧۖۘ"
            goto L_0x0276
        L_0x02b1:
            java.lang.String r1 = com.obwhatsapp.yo.yo.getCurr_sJid()
            boolean r1 = com.obwhatsapp.youbasha.ui.lockV2.LockUtils.isJIDLocked(r1)
            if (r1 == 0) goto L_0x02ae
            java.lang.String r1 = "ۜ۟ۗۜۢۦ۠۠ۡۘۜۛۛۧ۫"
            goto L_0x0276
        L_0x02be:
            java.lang.String r1 = "unlock"
        L_0x02c0:
            r2 = 1638(0x666, float:2.295E-42)
            java.lang.String r4 = "string"
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r4)
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((int) r1)
            android.view.MenuItem r1 = r0.add(r6, r2, r3, r1)
            com.obwhatsapp.yo.w r2 = new com.obwhatsapp.yo.w
            r4 = 6
            r2.<init>(r4)
            r1.setOnMenuItemClickListener(r2)
            android.content.SharedPreferences r1 = com.obwhatsapp.yo.shp.prefs     // Catch:{ Exception -> 0x0367 }
            java.lang.String r2 = "HomeBarText"
            r4 = -1
            int r4 = r1.getInt(r2, r4)     // Catch:{ Exception -> 0x0367 }
        L_0x02e2:
            r2 = 743498502(0x2c50e306, float:2.9684601E-12)
            java.lang.String r1 = "ۘ۫ۦۦۢۧۙۜ۠۬ۜۦ۫۬ۥۡۤۤۖۤ۟ۥۤۢ"
        L_0x02e7:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x0367 }
            r5 = r5 ^ r2
            switch(r5) {
                case -1894912868: goto L_0x0302;
                case -1844286446: goto L_0x0022;
                case -94869946: goto L_0x02f0;
                case 1275910753: goto L_0x02ff;
                default: goto L_0x02ef;
            }     // Catch:{ Exception -> 0x0367 }
        L_0x02ef:
            goto L_0x02e7
        L_0x02f0:
            int r1 = r0.size()     // Catch:{ Exception -> 0x0367 }
            if (r3 >= r1) goto L_0x02fc
            java.lang.String r1 = "ۧ۠ۘۙۦ۫ۡۙۜ۟ۘۢۗ۫۟"
            goto L_0x02e7
        L_0x02f9:
            java.lang.String r1 = "lock"
            goto L_0x02c0
        L_0x02fc:
            java.lang.String r1 = "ۘۛۜۘۗۨۘۘۜ۟۫ۛۜۗۗ۬ۧ"
            goto L_0x02e7
        L_0x02ff:
            java.lang.String r1 = "ۙۘ۠ۛۡۨۘۦۘۥ۫ۧۜۙۜۧۘۥۧۥۖۨۖۘۨۥۖ"
            goto L_0x02e7
        L_0x0302:
            android.view.MenuItem r1 = r0.getItem(r3)     // Catch:{ Exception -> 0x0367 }
            android.view.View r1 = r1.getActionView()     // Catch:{ Exception -> 0x0367 }
            r5 = -493405357(0xffffffffe2973b53, float:-1.3948666E21)
            java.lang.String r2 = "ۖۙ۫ۥۘۨۘۧ۬ۦۘ۠ۘ۠ۘۧۥۘۘ۟ۖ۟ۥۖۘۢۨ۟"
        L_0x030f:
            int r6 = r2.hashCode()     // Catch:{ Exception -> 0x0367 }
            r6 = r6 ^ r5
            switch(r6) {
                case -2058677159: goto L_0x031e;
                case -1043337394: goto L_0x0318;
                case 234822264: goto L_0x0325;
                case 1724784219: goto L_0x032f;
                default: goto L_0x0317;
            }     // Catch:{ Exception -> 0x0367 }
        L_0x0317:
            goto L_0x030f
        L_0x0318:
            java.lang.String r2 = "ۦۘۡۘ۬ۦۡۘۖ۫۟ۡۙۡۘۜۨ۠ۧ۠ۘۗۖۖۘ"
            goto L_0x030f
        L_0x031b:
            java.lang.String r2 = "ۤ۫ۖۢۛۤۚۤۨۘۡۢۙۖۤۧۧۖۘۛۚۙ"
            goto L_0x030f
        L_0x031e:
            boolean r2 = r1 instanceof android.widget.ImageButton     // Catch:{ Exception -> 0x0367 }
            if (r2 == 0) goto L_0x031b
            java.lang.String r2 = "۬ۦ۫ۖۘۜۤۦۖۛ۫ۧۘۤۨ۫ۘۥ۟ۨۘ۠ۜۥ۟"
            goto L_0x030f
        L_0x0325:
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1     // Catch:{ Exception -> 0x0367 }
        L_0x0327:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ Exception -> 0x0367 }
            r1.setColorFilter(r4, r2)     // Catch:{ Exception -> 0x0367 }
        L_0x032c:
            int r3 = r3 + 1
            goto L_0x02e2
        L_0x032f:
            r5 = 875522470(0x342f69a6, float:1.633658E-7)
            java.lang.String r2 = "ۖۧۢۛۙۦ۟ۜ۫ۚۢ۟ۢۚ۫۬ۥ۟۫۫۠ۦۡۡۘۛ۠ۢ"
        L_0x0334:
            int r6 = r2.hashCode()     // Catch:{ Exception -> 0x0367 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1301494538: goto L_0x034d;
                case -777501423: goto L_0x0347;
                case 534246651: goto L_0x034a;
                case 1511075704: goto L_0x033d;
                default: goto L_0x033c;
            }     // Catch:{ Exception -> 0x0367 }
        L_0x033c:
            goto L_0x0334
        L_0x033d:
            boolean r2 = r1 instanceof android.widget.ImageView     // Catch:{ Exception -> 0x0367 }
            if (r2 == 0) goto L_0x0344
            java.lang.String r2 = "ۙۜۨ۬ۜۘۥۦۘۨۙۖۨ۬ۤۢۢۦ"
            goto L_0x0334
        L_0x0344:
            java.lang.String r2 = "ۚۗۖۘۙۥۧۡۧۖ۠ۛۥ۠ۡۧۖۚۤ"
            goto L_0x0334
        L_0x0347:
            java.lang.String r2 = "ۗ۟ۡۘ۬ۚۙۗۛۥۘ۫۫ۘۚۜۥۘۡۗ۟ۨۦ"
            goto L_0x0334
        L_0x034a:
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Exception -> 0x0367 }
            goto L_0x0327
        L_0x034d:
            r5 = 588075667(0x230d5293, float:7.661111E-18)
            java.lang.String r2 = "ۥۜۨۘۥۛۙۗۨۧۘ۫ۖ۬ۜۤۢ"
        L_0x0352:
            int r6 = r2.hashCode()     // Catch:{ Exception -> 0x0367 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1708423596: goto L_0x035b;
                case -1247418876: goto L_0x036d;
                case -1178261844: goto L_0x032c;
                case 1712803423: goto L_0x0374;
                default: goto L_0x035a;
            }     // Catch:{ Exception -> 0x0367 }
        L_0x035a:
            goto L_0x0352
        L_0x035b:
            androidx.appcompat.view.menu.ActionMenuItemView r1 = (androidx.appcompat.view.menu.ActionMenuItemView) r1     // Catch:{ Exception -> 0x0367 }
            com.obwhatsapp.yo.n r2 = new com.obwhatsapp.yo.n     // Catch:{ Exception -> 0x0367 }
            r5 = 0
            r2.<init>(r1, r4, r5)     // Catch:{ Exception -> 0x0367 }
            r1.post(r2)     // Catch:{ Exception -> 0x0367 }
            goto L_0x032c
        L_0x0367:
            r0 = move-exception
            goto L_0x0022
        L_0x036a:
            java.lang.String r2 = "ۢۡ۬ۗۧۚۙۚۚۗۙۙۜۙۧۘۗۗۗ۫ۨۘۦۦ۬"
            goto L_0x0352
        L_0x036d:
            boolean r2 = r1 instanceof androidx.appcompat.view.menu.ActionMenuItemView     // Catch:{ Exception -> 0x0367 }
            if (r2 == 0) goto L_0x036a
            java.lang.String r2 = "۠ۜۘ۫ۙۥۘۘۧۜۥۖۛۦ۬۟ۗۢۧۚۦ۟ۚۘۥۢۦۡ"
            goto L_0x0352
        L_0x0374:
            java.lang.String r2 = "ۜۘۦۘۢۜۡۛۢۦۘۡۖۘۘۥۘۛۘ۫۟ۗۥ۬ۢۥۧۘ"
            goto L_0x0352
        L_0x0377:
            com.obwhatsapp.yo.e r0 = (com.obwhatsapp.yo.e) r0
            android.app.ProgressDialog r1 = r0.f753a
            r1.dismiss()
            com.obwhatsapp.yo.ChatGenSingle r1 = r0.f754b
            com.obwhatsapp.yo.ChatGenSingle$SingleUserMessagesAdapter r2 = new com.obwhatsapp.yo.ChatGenSingle$SingleUserMessagesAdapter
            java.util.ArrayList r3 = r1.f476a
            r2.<init>(r1, r3)
            androidx.recyclerview.widget.RecyclerView r3 = r1.f477b
            r3.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r2 = r1.f477b
            java.util.ArrayList r3 = r1.f476a
            int r3 = r3.size()
            int r3 = r3 + -1
            r2.A0Z(r3)
            android.widget.ImageView r2 = r1.f479d
            c.c r3 = new c.c
            r3.<init>(r0, r8)
            r2.setOnClickListener(r3)
            android.widget.TextView r2 = r1.f480e
            r3 = 1526686181(0x5aff61e5, float:3.59418776E16)
            java.lang.String r0 = "ۛۚۖ۠ۢۤۡۛۨ۟ۛۚ۫ۖۘۗۤ۠ۚ۬ۙ۟ۥۖۗۗ"
        L_0x03aa:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1960772680: goto L_0x03be;
                case -245092177: goto L_0x03b9;
                case 401641096: goto L_0x03b3;
                case 1059813669: goto L_0x0022;
                default: goto L_0x03b2;
            }
        L_0x03b2:
            goto L_0x03aa
        L_0x03b3:
            java.lang.String r0 = "ۥۜۜۘۖۢ۫ۧۧۗۥ۟ۙ۟ۗۖۖۨ۫ۨۢ۠ۥۛ۬ۗۖۛ"
            goto L_0x03aa
        L_0x03b6:
            java.lang.String r0 = "ۗۜۨۡۚۥۨۤۜۘۛۙ۠۟ۚۨۘ۟ۗۤ"
            goto L_0x03aa
        L_0x03b9:
            if (r2 == 0) goto L_0x03b6
            java.lang.String r0 = "۟ۙۜۗۦۥۘۤۛۥ۠ۥ۬ۡۡۜ۟ۦۘۗۢۨۘ"
            goto L_0x03aa
        L_0x03be:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.widget.TextView r3 = r1.f480e
            java.lang.CharSequence r3 = r3.getText()
            r0.append(r3)
            r4 = -217389039041(0xffffffcd629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r0.append(r3)
            java.util.ArrayList r1 = r1.f476a
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setText(r0)
            goto L_0x0022
        L_0x03ea:
            java.lang.String r1 = "ۜ۟ۙۛ۫ۘۘ۫ۚ۟ۤۢۡ۫ۦۥۘ۠ۙۜ"
            goto L_0x0019
        L_0x03ee:
            boolean r1 = com.obwhatsapp.yo.yo.isCommunityEnabled
            if (r1 == 0) goto L_0x03ea
            java.lang.String r1 = "۟ۡۧۘۚ۬۬ۥۦۘۘۗۖۥ۠ۗۢ"
            goto L_0x0019
        L_0x03f6:
            java.lang.String r1 = "ۖۡۧۘۦۤ۟۟۬ۥۚۗۤۨ۬۠ۗ"
            goto L_0x0019
        L_0x03fa:
            android.widget.ImageView r0 = r0.f2543i
            java.lang.String r1 = "vec_ic_community_tab"
            java.lang.String r2 = "drawable"
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r2)
            r0.setImageResource(r1)
            goto L_0x0022
        L_0x0409:
            r0 = move-exception
            goto L_0x01a6
        L_0x040c:
            r1 = r3
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.d.run():void");
    }
}
