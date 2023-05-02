package com.facebook.redex;

import android.view.View;
import com.mod.bomfab.R$styleable;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;

public class ViewOnClickCListenerShape20S0100000_I1_5 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape20S0100000_I1_5(AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment, int i2) {
        this.A01 = i2;
        switch (i2) {
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                this.A00 = addStickerPackDialogFragment;
                return;
            default:
                this.A00 = addStickerPackDialogFragment;
                return;
        }
    }

    public ViewOnClickCListenerShape20S0100000_I1_5(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02cc, code lost:
        r1 = android.net.Uri.parse(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d0, code lost:
        if (r1 == null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02d2, code lost:
        r4.putExtra("android.intent.extra.ringtone.EXISTING_URI", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02e1, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02e3, code lost:
        r4.putExtra("android.intent.extra.ringtone.TYPE", 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02e7, code lost:
        r3.startActivityForResult(android.content.Intent.createChooser(r4, (java.lang.CharSequence) null), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02f0, code lost:
        r4.putExtra("android.intent.extra.ringtone.TYPE", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0088, code lost:
        r1 = r2.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0304, code lost:
        r0 = com.obwhatsapp.SingleSelectionDialogFragment.A03(r1, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0311, code lost:
        r1 = com.obwhatsapp.R.string.str1da3;
        r0 = com.obwhatsapp.R.array.array001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0317, code lost:
        r0 = com.obwhatsapp.SingleSelectionDialogFragment.A02(r2, r1, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x031b, code lost:
        r4.Afc(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x031e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008e, code lost:
        if (r3 == r1.A0F) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0090, code lost:
        r1.A0F = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0092, code lost:
        r2.A0K(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03d4, code lost:
        r3.setClassName(r2, r1);
        r0.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03ea, code lost:
        r1.A1N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x054c, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x054f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0062, code lost:
        r1 = r2.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0068, code lost:
        if (r3 == r1.A0E) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0209, code lost:
        throw X.C18450wi.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023e, code lost:
        r1 = com.obwhatsapp.R.string.str1d9c;
        r0 = com.obwhatsapp.R.array.array0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006a, code lost:
        r1.A0E = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a4, code lost:
        r5 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a5, code lost:
        r4 = X.C13700nu.A02("android.intent.action.RINGTONE_PICKER");
        r4.putExtra("android.intent.extra.ringtone.TITLE", r1);
        r4.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
        r4.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        r4.putExtra("android.intent.extra.ringtone.DEFAULT_URI", android.provider.Settings.System.DEFAULT_NOTIFICATION_URI);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c2, code lost:
        if (r6 == null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02ca, code lost:
        if (r6.equals("Silent") != false) goto L_0x02d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0109;
                case 1: goto L_0x012c;
                case 2: goto L_0x0158;
                case 3: goto L_0x0168;
                case 4: goto L_0x020a;
                case 5: goto L_0x000f;
                case 6: goto L_0x021e;
                case 7: goto L_0x022d;
                case 8: goto L_0x0236;
                case 9: goto L_0x0246;
                case 10: goto L_0x0261;
                case 11: goto L_0x026b;
                case 12: goto L_0x027d;
                case 13: goto L_0x028d;
                case 14: goto L_0x002b;
                case 15: goto L_0x0047;
                case 16: goto L_0x0296;
                case 17: goto L_0x02f4;
                case 18: goto L_0x0309;
                case 19: goto L_0x006d;
                case 20: goto L_0x031f;
                case 21: goto L_0x032b;
                case 22: goto L_0x0339;
                case 23: goto L_0x0349;
                case 24: goto L_0x039d;
                case 25: goto L_0x03a9;
                case 26: goto L_0x0550;
                case 27: goto L_0x03bc;
                case 28: goto L_0x03c4;
                case 29: goto L_0x03db;
                case 30: goto L_0x03e3;
                case 31: goto L_0x03ee;
                case 32: goto L_0x0096;
                case 33: goto L_0x0404;
                case 34: goto L_0x0548;
                case 35: goto L_0x041c;
                case 36: goto L_0x00a6;
                case 37: goto L_0x0448;
                case 38: goto L_0x0450;
                case 39: goto L_0x046d;
                case 40: goto L_0x04a3;
                case 41: goto L_0x04ab;
                case 42: goto L_0x0548;
                case 43: goto L_0x04d9;
                case 44: goto L_0x00ca;
                case 45: goto L_0x04e8;
                case 46: goto L_0x04f7;
                case 47: goto L_0x052a;
                case 48: goto L_0x00fc;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.5Ql r0 = (X.C109035Ql) r0
            r0.AN9()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r2 = (com.obwhatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0Z
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0Z
            boolean r0 = r0.isChecked()
            boolean r3 = X.C13690nt.A1S(r1, r0)
            r2.A0h = r3
            X.0sf r2 = r2.A0c
            java.lang.String r0 = "group_chat_defaults"
            goto L_0x0088
        L_0x002b:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r2 = (com.obwhatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0a
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0a
            boolean r0 = r0.isChecked()
            boolean r3 = X.C13690nt.A1S(r1, r0)
            r2.A0i = r3
            X.0sf r2 = r2.A0c
            java.lang.String r0 = "individual_chat_defaults"
            goto L_0x0062
        L_0x0047:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r2 = (com.obwhatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0Y
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0Y
            boolean r0 = r0.isChecked()
            boolean r3 = X.C13690nt.A1S(r1, r0)
            r2.A0g = r3
            X.0sf r2 = r2.A0c
            java.lang.String r0 = "group_chat_defaults"
        L_0x0062:
            X.1WS r1 = r2.A07(r0)
            boolean r0 = r1.A0E
            if (r3 == r0) goto L_0x000e
            r1.A0E = r3
            goto L_0x0092
        L_0x006d:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r2 = (com.obwhatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0b
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0b
            boolean r0 = r0.isChecked()
            boolean r3 = X.C13690nt.A1S(r1, r0)
            r2.A0h = r3
            X.0sf r2 = r2.A0c
            java.lang.String r0 = "individual_chat_defaults"
        L_0x0088:
            X.1WS r1 = r2.A07(r0)
            boolean r0 = r1.A0F
            if (r3 == r0) goto L_0x000e
            r1.A0F = r3
        L_0x0092:
            r2.A0K(r1)
            return
        L_0x0096:
            java.lang.Object r0 = r1.A00
            X.35D r0 = (X.AnonymousClass35D) r0
            X.04t r1 = r0.A09
            boolean r0 = r1 instanceof X.AnonymousClass33c
            if (r0 == 0) goto L_0x000e
            X.33c r1 = (X.AnonymousClass33c) r1
            r1.A04()
            return
        L_0x00a6:
            java.lang.Object r0 = r1.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r3 = r0.A0C()
            boolean r0 = r3 instanceof com.whatsapp.stickers.store.StickerStoreActivity
            if (r0 == 0) goto L_0x000e
            com.whatsapp.stickers.store.StickerStoreActivity r3 = (com.whatsapp.stickers.store.StickerStoreActivity) r3
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r1 = r3.A06
            X.3PO r0 = r3.A05
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = r0.A00
            int r2 = r0.indexOf(r1)
            r0 = -1
            if (r2 == r0) goto L_0x000e
            androidx.viewpager.widget.ViewPager r1 = r3.A01
            r0 = 1
            r1.A0F(r2, r0)
            return
        L_0x00ca:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.userban.ui.fragment.BanAppealFormFragment r2 = (com.obwhatsapp.userban.ui.fragment.BanAppealFormFragment) r2
            X.00l r0 = r2.A0C()
            if (r0 == 0) goto L_0x00df
            android.view.View r1 = r0.getCurrentFocus()
            if (r1 == 0) goto L_0x00df
            X.1Ai r0 = r2.A06
            r0.A01(r1)
        L_0x00df:
            com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel r4 = r2.A05
            android.widget.EditText r0 = r2.A00
            java.lang.String r7 = X.C13680ns.A0f(r0)
            X.027 r3 = r4.A02
            java.lang.Object r0 = r3.A01()
            java.lang.Number r0 = (java.lang.Number) r0
            r2 = 1
            if (r0 == 0) goto L_0x055d
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x000e
            r0 = 2
            if (r1 != r0) goto L_0x055d
            return
        L_0x00fc:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.wabloks.commerce.ui.view.WaBkExtensionsScreenFragment r0 = (com.obwhatsapp.wabloks.commerce.ui.view.WaBkExtensionsScreenFragment) r0
            X.1fz r1 = r0.A03
            if (r1 == 0) goto L_0x000e
            r0 = 3
            r1.A04(r0)
            return
        L_0x0109:
            java.lang.Object r3 = r1.A00
            X.0pL r3 = (X.C14530pL) r3
            X.0pd r2 = r3.A0C
            r1 = 1842(0x732, float:2.581E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0129
            java.lang.String r1 = "com.bloks.www.csf.whatsapp.gethelp.user"
        L_0x011b:
            r0 = 0
            android.content.Intent r1 = com.obwhatsapp.wabloks.ui.WaBloksActivity.A09(r3, r1, r0)
            X.C18450wi.A0B(r1)
            X.0zJ r0 = r3.A00
            r0.A06(r3, r1)
            return
        L_0x0129:
            java.lang.String r1 = "com.bloks.www.csf.whatsapp.gethelp"
            goto L_0x011b
        L_0x012c:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.settings.SettingsHelpV2 r4 = (com.obwhatsapp.settings.SettingsHelpV2) r4
            X.1BY r0 = r4.A08
            if (r0 == 0) goto L_0x0154
            android.util.Pair r3 = r0.A00()
            X.0uj r2 = r4.A09
            if (r2 == 0) goto L_0x0150
            java.lang.String r1 = "android"
            r0 = 0
            android.net.Uri r0 = r2.A02(r3, r1, r0, r0)
            X.C18450wi.A0B(r0)
            android.content.Intent r1 = X.C13690nt.A0B(r0)
            X.0zJ r0 = r4.A00
            r0.A06(r4, r1)
            return
        L_0x0150:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x0205
        L_0x0154:
            java.lang.String r0 = "contactSupportManager"
            goto L_0x0205
        L_0x0158:
            java.lang.Object r0 = r1.A00
            android.content.Context r0 = (android.content.Context) r0
            android.content.Intent r3 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.settings.About"
            goto L_0x03d4
        L_0x0168:
            java.lang.Object r6 = r1.A00
            com.obwhatsapp.settings.SettingsHelpV2 r6 = (com.obwhatsapp.settings.SettingsHelpV2) r6
            r15 = 0
            X.0wP r0 = r6.A07
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x01b7
            java.lang.String r0 = "about/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object[] r10 = X.C13680ns.A1b()
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r0 = r6.getString(r0)
            r10[r15] = r0
            java.lang.Object[] r5 = new java.lang.Object[r15]
            r0 = 21
            com.facebook.redex.IDxCListenerShape23S0000000_2_I1 r4 = new com.facebook.redex.IDxCListenerShape23S0000000_2_I1
            r4.<init>(r0)
            com.obwhatsapp.LegacyMessageDialogFragment r3 = new com.obwhatsapp.LegacyMessageDialogFragment
            r3.<init>()
            r11 = -1
            r12 = 2131889656(0x7f120df8, float:1.9413982E38)
            r13 = 2131891080(0x7f121388, float:1.941687E38)
            r14 = 2131889799(0x7f120e87, float:1.9414272E38)
            r16 = -1
            android.os.Bundle r2 = X.C87584Xn.A00(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r1 = "title_params_values"
            java.lang.String r0 = "title_params_types"
            X.C87584Xn.A01(r2, r1, r0, r5)
            r3.A00 = r4
            r3.A0T(r2)
            X.C13680ns.A1J(r3, r6)
            return
        L_0x01b7:
            X.0rz r0 = r6.A09
            android.content.SharedPreferences r1 = X.C13680ns.A0B(r0)
            java.lang.String r0 = "change_number_new_number_banned"
            r5 = 0
            java.lang.String r1 = r1.getString(r0, r5)
            if (r1 != 0) goto L_0x01ef
            java.lang.String r14 = "settings/about"
        L_0x01c9:
            X.0sq r1 = r6.A05
            X.1KO r7 = r6.A00
            if (r7 == 0) goto L_0x01ff
            X.01V r9 = r6.A08
            X.15W r12 = r6.A03
            if (r12 == 0) goto L_0x01fb
            X.0sj r10 = r6.A02
            if (r10 == 0) goto L_0x01f7
            X.1KP r13 = r6.A07
            if (r13 == 0) goto L_0x0203
            X.0wP r8 = r6.A07
            r16 = 1
            r17 = 0
            X.379 r4 = new X.379
            r11 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String[] r0 = new java.lang.String[r15]
            r1.Ack(r4, r0)
            return
        L_0x01ef:
            java.lang.String r0 = "settings/about/chnum "
            java.lang.String r14 = X.C18450wi.A06(r0, r1)
            goto L_0x01c9
        L_0x01f7:
            java.lang.String r0 = "waPermissionsHelper"
            goto L_0x0205
        L_0x01fb:
            java.lang.String r0 = "supportGatingUtils"
            goto L_0x0205
        L_0x01ff:
            java.lang.String r0 = "sendFeedback"
            goto L_0x0205
        L_0x0203:
            java.lang.String r0 = "registrationHttpManager"
        L_0x0205:
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x020a:
            java.lang.Object r2 = r1.A00
            X.0pN r2 = (X.C14550pN) r2
            com.obwhatsapp.settings.SettingsNetworkUsage$ResetUsageConfirmationDialog r1 = new com.obwhatsapp.settings.SettingsNetworkUsage$ResetUsageConfirmationDialog
            r1.<init>()
            android.os.Bundle r0 = X.C13690nt.A0D()
            r1.A0T(r0)
            r2.Afc(r1)
            return
        L_0x021e:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r3 = (com.obwhatsapp.settings.SettingsNotifications) r3
            r0 = 2131893662(0x7f121d9e, float:1.9422107E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0e
            r2 = 2
            goto L_0x02a4
        L_0x022d:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r4 = (com.obwhatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A02
            r2 = 13
            goto L_0x023e
        L_0x0236:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r4 = (com.obwhatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A05
            r2 = 10
        L_0x023e:
            r1 = 2131893660(0x7f121d9c, float:1.9422103E38)
            r0 = 2130903064(0x7f030018, float:1.7412935E38)
            goto L_0x0317
        L_0x0246:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r2 = (com.obwhatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0X
            r0.toggle()
            X.0rz r1 = r2.A09
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0X
            boolean r2 = r0.isChecked()
            android.content.SharedPreferences$Editor r1 = r1.A0K()
            java.lang.String r0 = "conversation_sound"
            X.C13680ns.A0z(r1, r0, r2)
            return
        L_0x0261:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r4 = (com.obwhatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A06
            r2 = 9
            goto L_0x0311
        L_0x026b:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r4 = (com.obwhatsapp.settings.SettingsNotifications) r4
            int r2 = r4.A04
            X.013 r1 = r4.A01
            int[] r0 = com.obwhatsapp.settings.SettingsNotifications.A0q
            java.lang.String[] r1 = r1.A0U(r0)
            r0 = 11
            goto L_0x0304
        L_0x027d:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r3 = (com.obwhatsapp.settings.SettingsNotifications) r3
            r0 = 2131893647(0x7f121d8f, float:1.9422076E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0d
            r2 = 3
            r5 = 1
            goto L_0x02a5
        L_0x028d:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r4 = (com.obwhatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A03
            r2 = 12
            goto L_0x0311
        L_0x0296:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r3 = (com.obwhatsapp.settings.SettingsNotifications) r3
            r0 = 2131893662(0x7f121d9e, float:1.9422107E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0f
            r2 = 1
        L_0x02a4:
            r5 = 7
        L_0x02a5:
            java.lang.String r0 = "android.intent.action.RINGTONE_PICKER"
            android.content.Intent r4 = X.C13700nu.A02(r0)
            java.lang.String r0 = "android.intent.extra.ringtone.TITLE"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.ringtone.SHOW_SILENT"
            r1 = 1
            r4.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.ringtone.SHOW_DEFAULT"
            r4.putExtra(r0, r1)
            android.net.Uri r1 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            java.lang.String r0 = "android.intent.extra.ringtone.DEFAULT_URI"
            r4.putExtra(r0, r1)
            if (r6 == 0) goto L_0x02d7
            java.lang.String r0 = "Silent"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x02d7
            android.net.Uri r1 = android.net.Uri.parse(r6)
            if (r1 == 0) goto L_0x02d7
            java.lang.String r0 = "android.intent.extra.ringtone.EXISTING_URI"
            r4.putExtra(r0, r1)
        L_0x02d7:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r1.equalsIgnoreCase(r0)
            java.lang.String r1 = "android.intent.extra.ringtone.TYPE"
            if (r0 == 0) goto L_0x02f0
            r0 = 2
            r4.putExtra(r1, r0)
        L_0x02e7:
            r0 = 0
            android.content.Intent r0 = android.content.Intent.createChooser(r4, r0)
            r3.startActivityForResult(r0, r2)
            return
        L_0x02f0:
            r4.putExtra(r1, r5)
            goto L_0x02e7
        L_0x02f4:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r4 = (com.obwhatsapp.settings.SettingsNotifications) r4
            int r2 = r4.A01
            X.013 r1 = r4.A01
            int[] r0 = com.obwhatsapp.settings.SettingsNotifications.A0q
            java.lang.String[] r1 = r1.A0U(r0)
            r0 = 14
        L_0x0304:
            com.obwhatsapp.SingleSelectionDialogFragment r0 = com.obwhatsapp.SingleSelectionDialogFragment.A03(r1, r0, r2)
            goto L_0x031b
        L_0x0309:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.settings.SettingsNotifications r4 = (com.obwhatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A00
            r2 = 15
        L_0x0311:
            r1 = 2131893667(0x7f121da3, float:1.9422117E38)
            r0 = 2130903069(0x7f03001d, float:1.7412946E38)
        L_0x0317:
            com.obwhatsapp.SingleSelectionDialogFragment r0 = com.obwhatsapp.SingleSelectionDialogFragment.A02(r2, r1, r3, r0)
        L_0x031b:
            r4.Afc(r0)
            return
        L_0x031f:
            java.lang.Object r1 = r1.A00
            X.0pN r1 = (X.C14550pN) r1
            com.obwhatsapp.dialogs.FAQLearnMoreDialogFragment r0 = com.obwhatsapp.dialogs.FAQLearnMoreDialogFragment.A03()
            r1.Afc(r0)
            return
        L_0x032b:
            java.lang.Object r1 = r1.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x0339:
            java.lang.Object r2 = r1.A00
            X.0pL r2 = (X.C14530pL) r2
            java.lang.String r0 = "https://www.whatsapp.com/security"
            android.content.Intent r1 = X.C13680ns.A0A(r0)
            X.0zJ r0 = r2.A00
            r0.A06(r2, r1)
            return
        L_0x0349:
            java.lang.Object r4 = r1.A00
            X.3xY r4 = (X.C78233xY) r4
            X.0rv r2 = r4.A00
            if (r2 == 0) goto L_0x0399
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0399
            X.0sG r0 = r4.A01
            X.0sP r1 = r4.A02
            r5 = 100
            X.0sH r0 = r0.A08(r2)
            X.AnonymousClass00B.A06(r0)
            java.lang.String r2 = r1.A09(r0)
            r1 = 2131893069(0x7f121b4d, float:1.9420904E38)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            java.lang.String r2 = X.C13680ns.A0d(r4, r2, r0, r3, r1)
            boolean r1 = X.C434920f.A09(r4)
            r0 = 2131893068(0x7f121b4c, float:1.9420902E38)
            if (r1 == 0) goto L_0x037d
            r0 = 2131893066(0x7f121b4a, float:1.9420898E38)
        L_0x037d:
            java.lang.String r1 = r4.getString(r0)
            r0 = 2
            java.lang.String[] r2 = X.C13690nt.A1b(r2, r1, r0)
            com.obwhatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment r1 = new com.obwhatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment
            r1.<init>()
            r0 = 2131893065(0x7f121b49, float:1.9420896E38)
            android.os.Bundle r0 = com.obwhatsapp.SingleSelectionDialogFragment.A01(r2, r5, r3, r0)
            r1.A0T(r0)
            r4.Afc(r1)
            return
        L_0x0399:
            r4.A37(r2)
            return
        L_0x039d:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x03a9:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview r2 = (com.obwhatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview) r2
            r1 = 0
            r0 = 0
            r2.setResult(r1, r0)
            com.obwhatsapp.collections.MarginCorrectedViewPager r0 = r2.A09
            int r0 = r0.getCurrentItem()
            r2.A39(r0)
            return
        L_0x03bc:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1C()
            return
        L_0x03c4:
            java.lang.Object r0 = r1.A00
            X.2rc r0 = (X.C57702rc) r0
            android.content.Context r0 = r0.A03
            android.content.Intent r3 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.status.playback.MyStatusesActivity"
        L_0x03d4:
            r3.setClassName(r2, r1)
            r0.startActivity(r3)
            return
        L_0x03db:
            java.lang.Object r0 = r1.A00
            X.3Gy r0 = (X.C63313Gy) r0
            com.obwhatsapp.status.StatusesFragment r1 = r0.A02
            r0 = 1
            goto L_0x03ea
        L_0x03e3:
            java.lang.Object r0 = r1.A00
            X.3Gy r0 = (X.C63313Gy) r0
            com.obwhatsapp.status.StatusesFragment r1 = r0.A02
            r0 = 0
        L_0x03ea:
            r1.A1N(r0)
            return
        L_0x03ee:
            java.lang.Object r2 = r1.A00
            X.34v r2 = (X.C606734v) r2
            X.2Cw r0 = r2.A0A
            boolean r1 = r0.A0A()
            X.2Cw r0 = r2.A0A
            if (r1 == 0) goto L_0x0400
            r0.A0K()
            return
        L_0x0400:
            r0.A0L()
            return
        L_0x0404:
            java.lang.Object r2 = r1.A00
            X.35B r2 = (X.AnonymousClass35B) r2
            X.1pi r0 = r2.A04
            java.lang.String r0 = r0.A0H
            com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment r1 = com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment.A01(r0)
            android.content.Context r0 = r2.A0A
            android.app.Activity r0 = X.C19980zJ.A00(r0)
            X.0pN r0 = (X.C14550pN) r0
            r0.Afc(r1)
            return
        L_0x041c:
            java.lang.Object r3 = r1.A00
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r3 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r3
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = X.C13700nu.A02(r0)
            java.lang.String r0 = "http://play.google.com/store/search?q=WASticker&c=apps"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.setData(r0)
            java.lang.String r0 = "com.android.vending"
            r2.setPackage(r0)
            X.0zJ r1 = r3.A02
            android.content.Context r0 = r3.A0u()
            r1.A06(r0, r2)
            X.3q6 r1 = new X.3q6
            r1.<init>()
            X.0t9 r0 = r3.A03
            r0.A06(r1)
            return
        L_0x0448:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1D()
            return
        L_0x0450:
            java.lang.Object r4 = r1.A00
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.00l r3 = r4.A0C()
            if (r3 == 0) goto L_0x0469
            android.content.Intent r2 = X.C13680ns.A09()
            r1 = 1
            java.lang.String r0 = "user_cancelled"
            r2.putExtra(r0, r1)
            r0 = 0
            r3.setResult(r0, r2)
        L_0x0469:
            r4.A1D()
            return
        L_0x046d:
            java.lang.Object r6 = r1.A00
            com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity$AddStickerPackDialogFragment r6 = (com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) r6
            r4 = 2131891941(0x7f1216e5, float:1.9418616E38)
            java.lang.Object[] r3 = X.C13690nt.A1Z()
            java.lang.String r0 = r6.A05
            r2 = 0
            r3[r2] = r0
            r0 = 2131893495(0x7f121cf7, float:1.9421768E38)
            java.lang.String r1 = r6.A0J(r0)
            r0 = 1
            java.lang.String r1 = X.C13690nt.A0c(r6, r1, r3, r0, r4)
            r0 = 8
            r6.A1N(r1, r2, r0, r0)
            X.2Yt r0 = r6.A01
            java.lang.String r5 = r6.A02
            java.lang.String r4 = r6.A03
            X.1CX r3 = r0.A02
            X.0sq r2 = r3.A0Y
            r1 = 9
            com.facebook.redex.RunnableRunnableShape0S2100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S2100000_I0
            r0.<init>(r3, r5, r4, r1)
            r2.Acl(r0)
            return
        L_0x04a3:
            java.lang.Object r0 = r1.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x04ab:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.systemstatus.SystemStatusActivity r3 = (com.obwhatsapp.systemstatus.SystemStatusActivity) r3
            X.1KO r2 = r3.A01
            X.15W r0 = r3.A02
            boolean r11 = r0.A00()
            java.lang.String r7 = r3.A03
            java.lang.String r8 = r3.A04
            int r0 = r3.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "com.obwhatsapp.SystemStatusActivity.describeProblemBundle"
            android.os.Bundle r4 = r1.getBundleExtra(r0)
            r5 = 0
            r10 = r5
            r9 = r5
            android.content.Intent r0 = r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3.startActivity(r0)
            r3.finish()
            return
        L_0x04d9:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment r0 = (com.obwhatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment) r0
            com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel r2 = r0.A01
            X.00l r1 = r0.A0D()
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x04e8:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment r0 = (com.obwhatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment) r0
            com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel r2 = r0.A01
            X.00l r1 = r0.A0D()
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x04f7:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.userban.ui.fragment.BanInfoFragment r0 = (com.obwhatsapp.userban.ui.fragment.BanInfoFragment) r0
            com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel r3 = r0.A01
            X.0sC r0 = r3.A07
            int r1 = r0.A00()
            java.lang.String r0 = "BanAppealViewModel/verifyIfPhoneNumberIsVerified reg_state: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 10
            if (r1 != r0) goto L_0x0526
            X.0yw r0 = r3.A09
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "IN_REVIEW"
            boolean r2 = r0.equals(r1)
            X.1cy r1 = r3.A0B
            r0 = 2
            if (r2 == 0) goto L_0x0522
            r0 = 3
        L_0x0522:
            X.C13680ns.A1O(r1, r0)
            return
        L_0x0526:
            X.027 r1 = r3.A01
            r0 = -2
            goto L_0x0522
        L_0x052a:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.wabloks.commerce.ui.view.ExtensionsBottomsheetBaseContainer r2 = (com.obwhatsapp.wabloks.commerce.ui.view.ExtensionsBottomsheetBaseContainer) r2
            com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsNavBarViewModel r0 = r2.A1N()
            X.027 r0 = r0.A02
            java.lang.Object r1 = r0.A01()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r1 = X.C18450wi.A0R(r1, r0)
            X.00l r0 = r2.A0D()
            if (r1 == 0) goto L_0x054c
            r0.onBackPressed()
            return
        L_0x0548:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x054c:
            r0.finish()
            return
        L_0x0550:
            X.3sW r0 = new X.3sW
            r0.<init>()
            java.lang.String r0 = "source"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x055d:
            X.C13680ns.A1O(r3, r2)
            X.0yw r5 = r4.A09
            X.52R r6 = new X.52R
            r6.<init>(r4)
            X.0rz r0 = r5.A04
            android.content.SharedPreferences r1 = X.C13680ns.A0B(r0)
            java.lang.String r0 = "support_ban_appeal_token"
            java.lang.String r8 = X.C13700nu.A0E(r1, r0)
            if (r8 != 0) goto L_0x057e
            java.lang.Integer r0 = X.C13680ns.A0a()
            r6.AQv(r0)
            return
        L_0x057e:
            X.0sq r0 = r5.A06
            r9 = 4
            com.facebook.redex.RunnableRunnableShape0S2200000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S2200000_I0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.Acl(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape20S0100000_I1_5.onClick(android.view.View):void");
    }
}
