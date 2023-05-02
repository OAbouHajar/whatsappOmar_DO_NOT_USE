package com.whatsapp.util;

import X.C34331k5;

public class ViewOnClickCListenerShape0S0200000_I0 extends C34331k5 {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape0S0200000_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = obj2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:192:0x0617 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r16) {
        /*
            r15 = this;
            r2 = r16
            int r0 = r15.A02
            switch(r0) {
                case 0: goto L_0x0609;
                case 1: goto L_0x0601;
                case 2: goto L_0x0062;
                case 3: goto L_0x05bd;
                case 4: goto L_0x0591;
                case 5: goto L_0x0577;
                case 6: goto L_0x0541;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x051c;
                case 10: goto L_0x0513;
                case 11: goto L_0x02b4;
                case 12: goto L_0x04f5;
                case 13: goto L_0x04c6;
                case 14: goto L_0x048e;
                case 15: goto L_0x022a;
                case 16: goto L_0x01e5;
                case 17: goto L_0x0473;
                case 18: goto L_0x03ed;
                case 19: goto L_0x03e5;
                case 20: goto L_0x03dd;
                case 21: goto L_0x03d5;
                case 22: goto L_0x03bf;
                case 23: goto L_0x03a0;
                case 24: goto L_0x0386;
                case 25: goto L_0x01bd;
                case 26: goto L_0x0125;
                case 27: goto L_0x02ec;
                case 28: goto L_0x02d3;
                case 29: goto L_0x010d;
                case 30: goto L_0x00e9;
                case 31: goto L_0x0069;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r15.A00
            X.2Xz r5 = (X.AnonymousClass2Xz) r5
            java.lang.Object r6 = r15.A01
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            r0 = 9
            r5.A04(r0)
            r3 = 1
            X.0sH r0 = r5.A0L
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0024
            X.1KR r1 = r5.A0Z
            X.1mI r0 = r5.A0J
            r1.A01(r0, r3)
        L_0x0024:
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = r5.A0d
            r0 = 0
            android.content.Intent r2 = X.C14750ph.A08(r4, r0)
            java.lang.String r1 = r6.getRawString()
            java.lang.String r0 = "jid"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            java.lang.String r0 = "args_conversation_screen_entry_point"
            android.content.Intent r3 = r1.putExtra(r0, r3)
            java.lang.Integer r0 = r5.A12
            if (r0 == 0) goto L_0x0066
            int r1 = r0.intValue()
            r0 = 19
            if (r1 == r0) goto L_0x0063
            r0 = 20
            if (r1 != r0) goto L_0x0066
            java.lang.String r1 = "custom_qr_code_link"
        L_0x004d:
            java.lang.String r0 = "entry_point_conversion_source"
            android.content.Intent r2 = r3.putExtra(r0, r1)
            java.lang.String r1 = "entry_point_conversion_app"
            java.lang.String r0 = "whatsapp"
            r2.putExtra(r1, r0)
            X.0zJ r1 = r5.A0R
            java.lang.String r0 = "ContactInfoActivity"
            r1.A08(r4, r3, r0)
        L_0x0062:
            return
        L_0x0063:
            java.lang.String r1 = "custom_link"
            goto L_0x004d
        L_0x0066:
            java.lang.String r1 = "biz_profile"
            goto L_0x004d
        L_0x0069:
            java.lang.Object r3 = r15.A01
            X.2k3 r3 = (X.C55622k3) r3
            X.0rv r2 = r3.A00
            if (r2 != 0) goto L_0x00ad
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r3.A03
            X.0t6 r9 = r0.A0C
            long r4 = r3.A01
            X.0tq r0 = r9.A0v
            X.0tf r8 = r0.get()
            X.0tg r7 = r8.A02     // Catch:{ all -> 0x0618 }
            java.lang.String r6 = "SELECT chat_row_id FROM message_view WHERE _id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0618 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0618 }
            r2[r1] = r0     // Catch:{ all -> 0x0618 }
            android.database.Cursor r1 = r7.A08(r6, r2)     // Catch:{ all -> 0x0618 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0611 }
            if (r0 == 0) goto L_0x00a2
            X.0ts r0 = r9.A0N     // Catch:{ all -> 0x0611 }
            X.0rv r2 = r0.A06(r1)     // Catch:{ all -> 0x0611 }
            r1.close()     // Catch:{ all -> 0x0618 }
            r8.close()
            goto L_0x00a9
        L_0x00a2:
            r1.close()     // Catch:{ all -> 0x0618 }
            r8.close()
            r2 = 0
        L_0x00a9:
            r3.A00 = r2
            if (r2 == 0) goto L_0x0062
        L_0x00ad:
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r3.A03
            X.0sG r0 = r0.A03
            X.0sH r2 = r0.A08(r2)
            if (r2 == 0) goto L_0x0062
            X.0ph r1 = new X.0ph
            r1.<init>()
            java.lang.Object r0 = r15.A00
            X.2k4 r0 = (X.C55632k4) r0
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r5 = r0.A01
            android.content.Intent r4 = r1.A0v(r5, r2)
            long r1 = r3.A01
            java.lang.String r0 = "row_id"
            r4.putExtra(r0, r1)
            X.0t6 r0 = r5.A0C
            X.0th r0 = r0.A0K
            X.0tZ r3 = r0.A00(r1)
            long r1 = r3.A14
            java.lang.String r0 = "sort_id"
            r4.putExtra(r0, r1)
            X.1Vw r0 = r3.A11
            X.AnonymousClass1yL.A00(r4, r0)
            X.0zJ r0 = r5.A00
            r0.A07(r5, r4)
            return
        L_0x00e9:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            X.1ZR r0 = r2.A0J
            if (r0 == 0) goto L_0x0062
            X.2k5 r1 = r0.A09
            if (r1 == 0) goto L_0x0062
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = r1.A01
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x061d
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x061d
            return
        L_0x010d:
            java.lang.Object r1 = r15.A01
            X.1pi r1 = (X.C37771pi) r1
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0062
            java.lang.Object r0 = r15.A00
            X.2jm r0 = (X.C55522jm) r0
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r0.A01
            X.14f r0 = r0.A0G
            r2 = 0
            r4 = 2
            r5 = 1
            r3 = r2
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x0125:
            java.lang.Object r0 = r15.A01
            X.02k r0 = (X.C005602k) r0
            int r1 = r0.A00()
            java.lang.Object r0 = r15.A00
            X.2k6 r0 = (X.C55652k6) r0
            X.2k7 r2 = r0.A05
            java.util.List r0 = r0.A08
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            com.obwhatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity r4 = r2.A00
            boolean r5 = r2.A01
            r6 = 1
            if (r1 == 0) goto L_0x0195
            if (r1 == r6) goto L_0x0195
            r0 = 2
            if (r1 == r0) goto L_0x0187
            r0 = 3
            if (r1 == r0) goto L_0x0179
            r0 = 4
            if (r1 == r0) goto L_0x064a
            r0 = 5
            if (r1 != r0) goto L_0x0062
            X.0rv r3 = r4.A05
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.settings.chat.wallpaper.DefaultWallpaperPreview"
        L_0x0161:
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r1 = X.C16030sJ.A03(r3)
            java.lang.String r0 = "chat_jid"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "is_using_global_wallpaper"
            r2.putExtra(r0, r5)
        L_0x0173:
            r0 = 17
            r4.startActivityForResult(r2, r0)
            return
        L_0x0179:
            X.0rv r3 = r4.A05
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.gallerypicker.GalleryPickerLauncher"
            goto L_0x0161
        L_0x0187:
            X.0rv r3 = r4.A05
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.settings.chat.wallpaper.SolidColorWallpaper"
            goto L_0x0161
        L_0x0195:
            X.0rv r3 = r4.A05
            if (r1 == 0) goto L_0x019a
            r6 = 0
        L_0x019a:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r1 = X.C16030sJ.A03(r3)
            java.lang.String r0 = "chat_jid"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "is_using_global_wallpaper"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "IS_BRIGHT_KEY"
            r2.putExtra(r0, r6)
            goto L_0x0173
        L_0x01bd:
            java.lang.Object r1 = r15.A00
            X.2k8 r1 = (X.AnonymousClass2k8) r1
            android.content.Context r0 = r1.getContext()
            android.app.Activity r4 = X.C19980zJ.A00(r0)
            boolean r0 = r4 instanceof X.C14550pN
            if (r0 == 0) goto L_0x0062
            java.lang.Object r8 = r15.A01
            X.1rA r8 = (X.C38631rA) r8
            X.1PD r9 = r1.A07
            X.0pt r5 = r1.A04
            X.0so r3 = r1.A03
            X.0sq r10 = r1.A08
            X.0zJ r2 = r1.A02
            X.0tA r7 = r1.A06
            X.0pN r4 = (X.C14550pN) r4
            X.0sj r6 = r1.A05
            X.C55702kC.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x01e5:
            boolean r0 = r2 instanceof X.C30031bd
            if (r0 == 0) goto L_0x0062
            X.1bd r2 = (X.C30031bd) r2
            X.0tZ r6 = r2.getFMessage()
            if (r6 == 0) goto L_0x0227
            long r3 = r6.A13
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0227
            long r4 = r6.A13
        L_0x01fb:
            long r2 = X.C38621r6.A07(r6)
            X.0ph r1 = new X.0ph
            r1.<init>()
            java.lang.Object r7 = r15.A01
            android.content.Context r7 = (android.content.Context) r7
            X.1Vw r6 = r6.A11
            X.0rv r0 = r6.A00
            android.content.Intent r1 = r1.A0x(r7, r0)
            java.lang.String r0 = "row_id"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "sort_id"
            r1.putExtra(r0, r2)
            X.AnonymousClass1yL.A00(r1, r6)
            java.lang.Object r0 = r15.A00
            X.0zJ r0 = (X.C19980zJ) r0
            r0.A07(r7, r1)
            return
        L_0x0227:
            r4 = 1
            goto L_0x01fb
        L_0x022a:
            java.lang.Object r8 = r15.A00
            X.2Y2 r8 = (X.AnonymousClass2Y2) r8
            java.lang.Object r1 = r15.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r5 = X.AnonymousClass22N.A01(r1, r0)
            X.0pN r5 = (X.C14550pN) r5
            X.0tZ r7 = r8.A0O
            X.1rn r7 = (X.C39021rn) r7
            if (r5 == 0) goto L_0x0062
            com.whatsapp.jid.UserJid r0 = r7.A03
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r7.A06
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r7.A08
            if (r0 == 0) goto L_0x0062
            X.0ue r1 = r8.A0T
            r0 = 8
            r1.A02(r0)
            X.1TS r9 = r8.A04
            java.lang.String r6 = "received_cart"
            java.lang.String r4 = "from_cart"
            r3 = 1
            X.0pd r2 = r9.A02
            r1 = 1345(0x541, float:1.885E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x0299
            java.lang.String r0 = "OrderDetailsMessageLogging/logFieldstatEvent :: Not logging any events. Please turn on the abprop value"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x026b:
            X.1ME r0 = r8.A01
            r0.A00()
            X.1Vw r6 = r7.A11
            com.whatsapp.jid.UserJid r4 = r7.A03
            X.0rv r0 = r6.A00
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.of(r0)
            X.AnonymousClass00B.A06(r3)
            java.lang.String r2 = r7.A06
            java.lang.String r1 = r7.A08
            r0 = 1
            X.C18450wi.A0H(r4, r0)
            r0 = 2
            X.C18450wi.A0H(r3, r0)
            r0 = 3
            X.C18450wi.A0H(r2, r0)
            r0 = 4
            X.C18450wi.A0H(r1, r0)
            com.obwhatsapp.biz.order.view.fragment.OrderDetailFragment r0 = com.obwhatsapp.biz.order.view.fragment.OrderDetailFragment.A01(r4, r3, r6, r2, r1)
            r5.Afc(r0)
            return
        L_0x0299:
            X.2kD r1 = new X.2kD
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A00 = r0
            r1.A01 = r6
            boolean r0 = X.AnonymousClass1ZW.A0E(r4)
            if (r0 != 0) goto L_0x02ae
            r1.A02 = r4
        L_0x02ae:
            X.0t9 r0 = r9.A03
            r0.A06(r1)
            goto L_0x026b
        L_0x02b4:
            com.whatsapp.jid.UserJid r2 = com.whatsapp.voipcalling.Voip.getPeerJid()
            if (r2 == 0) goto L_0x0062
            X.0ph r1 = new X.0ph
            r1.<init>()
            java.lang.Object r3 = r15.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.content.Intent r2 = r1.A10(r3, r2, r0)
            r1 = 7
            java.lang.String r0 = "lobbyEntryPoint"
            r2.putExtra(r0, r1)
            r3.startActivity(r2)
            return
        L_0x02d3:
            java.lang.Object r2 = r15.A01
            X.2kE r2 = (X.C55722kE) r2
            android.view.View r1 = r2.A06
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r2.A06
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            java.lang.Object r0 = r15.A00
            X.2kF r0 = (X.C55732kF) r0
            r0.A0Q()
            return
        L_0x02ec:
            java.lang.Object r0 = r15.A01
            X.02k r0 = (X.C005602k) r0
            int r9 = r0.A00()
            java.lang.Object r2 = r15.A00
            X.2kG r2 = (X.C55742kG) r2
            int r1 = r2.getItemViewType(r9)
            r0 = 1
            if (r1 != r0) goto L_0x0301
            int r9 = r9 + -1
        L_0x0301:
            X.2kH r0 = r2.A01
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.obwhatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r5 = r0.A00
            java.util.List r0 = r5.A07
            X.AnonymousClass00B.A06(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0313:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0327
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r8.add(r0)
            goto L_0x0313
        L_0x0327:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.01Q r0 = r5.A02
            if (r0 == 0) goto L_0x034b
            java.lang.Object r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.addAll(r0)
            X.01Q r0 = r5.A02
            java.lang.Object r0 = r0.A01
            X.AnonymousClass00B.A06(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r6.addAll(r0)
        L_0x034b:
            X.0rv r4 = r5.A00
            boolean r3 = r5.A01
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r0 = "STARTING_POSITION_KEY"
            r2.putExtra(r0, r9)
            java.lang.String r0 = "THUMBNAIL_URIS_KEY"
            r2.putExtra(r0, r8)
            java.lang.String r0 = "WHATSAPP_THUMBNAIL_RES_KEY"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "WHATSAPP_FULL_RES_KEY"
            r2.putExtra(r0, r6)
            java.lang.String r1 = X.C16030sJ.A03(r4)
            java.lang.String r0 = "chat_jid"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "is_using_global_wallpaper"
            r2.putExtra(r0, r3)
            r0 = 111(0x6f, float:1.56E-43)
            r5.startActivityForResult(r2, r0)
            return
        L_0x0386:
            java.lang.Object r0 = r15.A00
            X.2kL r0 = (X.C55772kL) r0
            X.1P7 r1 = r0.A0B
            android.content.Context r2 = r0.getContext()
            java.lang.Object r0 = r15.A01
            X.1rM r0 = (X.C38751rM) r0
            double r5 = r0.A00
            double r7 = r0.A01
            java.lang.String r3 = r0.A01
            java.lang.String r4 = r0.A00
            r1.A08(r2, r3, r4, r5, r7)
            return
        L_0x03a0:
            com.obwhatsapp.languageselector.LanguageSelectorBottomSheet r2 = new com.obwhatsapp.languageselector.LanguageSelectorBottomSheet
            r2.<init>()
            java.lang.Object r1 = r15.A01
            com.obwhatsapp.WaTextView r1 = (com.obwhatsapp.WaTextView) r1
            X.4zE r0 = new X.4zE
            r0.<init>(r1, r15)
            r2.A04 = r0
            X.4zF r0 = new X.4zF
            r0.<init>(r15)
            r2.A05 = r0
            java.lang.Object r0 = r15.A00
            X.0pN r0 = (X.C14550pN) r0
            r0.Afc(r2)
            return
        L_0x03bf:
            java.lang.Object r0 = r15.A00
            X.2Wu r0 = (X.C49952Wu) r0
            X.2kM r1 = r0.A09
            java.lang.Object r0 = r15.A01
            X.2kN r0 = (X.C55792kN) r0
            long r2 = r0.A00
            X.1cy r1 = r1.A06
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A0B(r0)
            return
        L_0x03d5:
            java.lang.Object r0 = r15.A01
            X.29L r0 = (X.AnonymousClass29L) r0
            r0.AM7()
            return
        L_0x03dd:
            java.lang.Object r0 = r15.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass1yL.A05(r0)
            return
        L_0x03e5:
            java.lang.Object r0 = r15.A01
            X.29I r0 = (X.AnonymousClass29I) r0
            r0.A02()
            return
        L_0x03ed:
            java.lang.Object r0 = r15.A01
            X.2Qb r0 = (X.AnonymousClass2Qb) r0
            boolean r0 = r0.A0B
            java.lang.Object r4 = r15.A00
            X.1yj r4 = (X.C42821yj) r4
            if (r0 == 0) goto L_0x0434
            X.0rv r0 = r4.A33
            java.lang.String r10 = "group-suspend-appeal"
            X.0sL r1 = X.C16050sL.A03(r0)
            if (r1 == 0) goto L_0x0432
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.suspendedEntityJid"
            r7.putParcelable(r0, r1)
        L_0x040d:
            X.1yV r1 = r4.A22
            X.1KO r5 = r4.A12
            r6 = r1
            android.app.Activity r6 = (android.app.Activity) r6
            r0 = r1
            X.1yR r0 = (X.AnonymousClass1yR) r0
            X.2DF r0 = r0.A00
            X.15W r0 = r0.A0Z
            boolean r14 = r0.A00()
            r8 = 0
            r11 = r8
            r12 = r8
            r13 = r8
            r9 = r8
            android.content.Intent r0 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.startActivity(r0)
        L_0x042b:
            X.1yV r1 = r4.A22
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x0432:
            r7 = 0
            goto L_0x040d
        L_0x0434:
            X.0zl r1 = r4.A2t
            X.0rv r0 = r4.A33
            boolean r0 = X.C40561uK.A01(r1, r0)
            if (r0 != 0) goto L_0x042b
            X.1yV r0 = r4.A22
            X.0pN r0 = (X.C14550pN) r0
            X.0pd r1 = r0.A0C
            X.0rv r0 = r4.A33
            boolean r0 = X.C40571uL.A00(r1, r0)
            if (r0 != 0) goto L_0x042b
            X.1yV r1 = r4.A22
            android.content.Context r1 = (android.content.Context) r1
            X.0sH r0 = r4.A2l
            X.0rv r3 = r0.A0E
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.group.GroupAdminPickerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = X.C16030sJ.A03(r3)
            java.lang.String r0 = "gid"
            r2.putExtra(r0, r1)
            X.1yV r1 = r4.A22
            r0 = 42
            r1.startActivityForResult(r2, r0)
            goto L_0x042b
        L_0x0473:
            java.lang.Object r0 = r15.A00
            X.1yj r0 = (X.C42821yj) r0
            X.1L3 r3 = r0.A1X
            X.1yV r2 = r0.A22
            X.00k r2 = (X.C000900k) r2
            java.lang.Object r0 = r15.A01
            X.2Qb r0 = (X.AnonymousClass2Qb) r0
            X.0sL r1 = r0.A05
            r0 = 2131363738(0x7f0a079a, float:1.8347293E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r2, r0)
            r3.A01(r0, r2, r1)
            return
        L_0x048e:
            java.lang.Object r0 = r15.A01
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r2 = r0.A11
            X.0rv r3 = r2.A00
            X.AnonymousClass00B.A06(r3)
            boolean r1 = r2.A02
            java.lang.Object r0 = r15.A00
            X.1bd r0 = (X.C30031bd) r0
            if (r1 == 0) goto L_0x04b5
            android.content.Context r0 = r0.getContext()
            android.app.Activity r1 = X.C19980zJ.A00(r0)
            X.0pN r1 = (X.C14550pN) r1
            java.lang.String r0 = r2.A01
            com.obwhatsapp.location.StopLiveLocationDialogFragment r0 = com.obwhatsapp.location.StopLiveLocationDialogFragment.A01(r3, r0)
            r1.Afc(r0)
            return
        L_0x04b5:
            X.1P7 r2 = r0.A0N
            X.AnonymousClass00B.A06(r2)
            android.content.Context r1 = r0.getContext()
            X.AnonymousClass00B.A06(r3)
            r0 = 0
            r2.A07(r1, r3, r0)
            return
        L_0x04c6:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r3
            r0 = 1
            r3.A3a(r0)
            android.content.Context r1 = r3.getApplicationContext()
            r0 = 0
            android.content.Intent r2 = X.C14750ph.A08(r1, r0)
            java.lang.Object r0 = r15.A01
            X.2kQ r0 = (X.C55802kQ) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            java.lang.String r1 = X.C16030sJ.A03(r0)
            java.lang.String r0 = "jid"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r2 = r1.addFlags(r0)
            X.0zJ r1 = r3.A00
            java.lang.String r0 = "ContactInfoActivity"
            r1.A08(r3, r2, r0)
            return
        L_0x04f5:
            java.lang.Object r2 = r15.A01
            X.1aI r2 = (X.C29251aI) r2
            X.1aJ r0 = r2.A0D
            java.util.Set r0 = r0.A07
            int r0 = r0.size()
            if (r0 != 0) goto L_0x050a
            X.2V5 r1 = r2.A0F
            r0 = 0
            r1.A09(r0, r0)
            return
        L_0x050a:
            X.1aJ r0 = r2.A0D
            java.util.Set r1 = r0.A07
            r0 = 0
            r2.A0R(r0, r1)
            return
        L_0x0513:
            java.lang.Object r1 = r15.A01
            X.0rI r1 = (X.C15540rI) r1
            r0 = 3
            r1.A04(r0)
            return
        L_0x051c:
            java.lang.Object r1 = r15.A00
            X.2Xz r1 = (X.AnonymousClass2Xz) r1
            r0 = 13
            r1.A04(r0)
            r0 = 4
            X.AnonymousClass2Xz.A01(r1, r0)
            X.1KW r0 = r1.A0w
            r0.A00()
            X.0zJ r4 = r1.A0R
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r1.A0d
            r2 = 0
            java.lang.Object r1 = r15.A01
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            r0 = 9
            android.content.Intent r0 = X.C14750ph.A0T(r3, r1, r2, r0)
            r4.A06(r3, r0)
            return
        L_0x0541:
            java.lang.Object r6 = r15.A00
            X.2Xz r6 = (X.AnonymousClass2Xz) r6
            com.obwhatsapp.chatinfo.ContactInfoActivity r5 = r6.A0d
            java.lang.Object r0 = r15.A01
            X.0sH r0 = (X.C16010sH) r0
            X.0rv r4 = r0.A0E
            java.lang.Integer r3 = r6.A12
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.biz.BusinessProfileExtraFieldsActivity"
            r2.setClassName(r1, r0)
            X.AnonymousClass00B.A06(r4)
            java.lang.String r1 = r4.getRawString()
            java.lang.String r0 = "jid"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "profile_entry_point"
            r2.putExtra(r0, r3)
            r5.startActivity(r2)
            r0 = 8
            r6.A04(r0)
            return
        L_0x0577:
            java.lang.Object r1 = r15.A00
            X.2kR r1 = (X.C55812kR) r1
            java.lang.Runnable r0 = r1.A02
            if (r0 == 0) goto L_0x0582
            r0.run()
        L_0x0582:
            X.2kS r0 = r1.A01
            if (r0 == 0) goto L_0x0589
            r0.AKG()
        L_0x0589:
            java.lang.Object r0 = r15.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r2)
            return
        L_0x0591:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.RequestPermissionActivity r3 = (com.obwhatsapp.RequestPermissionActivity) r3
            java.lang.String r2 = r3.A07
            if (r2 == 0) goto L_0x05a0
            X.1BN r1 = r3.A06
            java.lang.String r0 = "continue"
            r1.A04(r2, r0)
        L_0x05a0:
            java.lang.Object r2 = r15.A01
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0 = 1
            r3.A0A = r0
            X.0rz r1 = r3.A03
            r0 = 0
            com.obwhatsapp.RequestPermissionActivity.A0Q(r1, r2)
            X.AnonymousClass00T.A0F(r3, r2, r0)
            r0 = 2131365287(0x7f0a0da7, float:1.8350435E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r3, r0)
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x05bd:
            java.lang.Object r5 = r15.A00
            X.0pl r5 = (X.C14790pl) r5
            java.lang.Object r4 = r15.A01
            X.0pm r4 = (X.C14800pm) r4
            X.07m r3 = new X.07m
            r3.<init>()
            android.widget.TextView r2 = r5.A05
            r3.A06(r2)
            r0 = 300(0x12c, double:1.48E-321)
            r3.A04(r0)
            X.2kT r0 = new X.2kT
            r0.<init>(r4, r5)
            r3.A08(r0)
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C015807o.A02(r0, r3)
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167077(0x7f070765, float:1.7948417E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setPadding(r0, r0, r0, r0)
            r0 = 0
            r2.setCompoundDrawablePadding(r0)
            java.lang.String r0 = ""
            r2.setText(r0)
            return
        L_0x0601:
            java.lang.Object r0 = r15.A01
            X.0pm r0 = (X.C14800pm) r0
            r0.AWq()
            return
        L_0x0609:
            java.lang.Object r0 = r15.A01
            X.0pm r0 = (X.C14800pm) r0
            r0.ATF()
            return
        L_0x0611:
            r0 = move-exception
            if (r1 == 0) goto L_0x0617
            r1.close()     // Catch:{ all -> 0x0617 }
        L_0x0617:
            throw r0     // Catch:{ all -> 0x0618 }
        L_0x0618:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x061c }
        L_0x061c:
            throw r0
        L_0x061d:
            com.obwhatsapp.webpagepreview.WebPagePreviewView r1 = r2.A0f
            r0 = 1
            r1.setImageProgressBarVisibility(r0)
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            X.0sq r5 = r2.A05
            X.0sb r4 = r2.A04
            X.1ZR r0 = r2.A0J
            X.2k5 r0 = r0.A09
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            r1 = 2
            com.facebook.redex.IDxFCallbackShape339S0100000_1_I1 r0 = new com.facebook.redex.IDxFCallbackShape339S0100000_1_I1
            r0.<init>(r15, r1)
            X.2kW r1 = new X.2kW
            r1.<init>(r4, r0, r3, r2)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r5.Ack(r1, r0)
            return
        L_0x064a:
            r0 = 112(0x70, float:1.57E-43)
            X.2kX r1 = new X.2kX
            r1.<init>(r0)
            r0 = 2131893088(0x7f121b60, float:1.9420943E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A02(r0)
            r0 = 2131893087(0x7f121b5f, float:1.942094E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A05(r0)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A03(r0)
            com.obwhatsapp.backup.google.PromptDialogFragment r0 = r1.A00()
            r4.Afc(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0.A06(android.view.View):void");
    }
}
