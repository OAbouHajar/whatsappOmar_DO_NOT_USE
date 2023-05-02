package com.facebook.redex;

import X.C62603Ef;
import android.view.View;

public class ViewOnClickCListenerShape15S0100000_I1 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape15S0100000_I1(C62603Ef r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public ViewOnClickCListenerShape15S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0361, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03a1, code lost:
        r1.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03dd, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03de, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x041d, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0422, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04c0, code lost:
        new X.C75663sW();
        r0 = "source";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04e9, code lost:
        if (r8.size() != 0) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04f5, code lost:
        throw X.AnonymousClass000.A0W(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x054b, code lost:
        if (r10.A00.A01 <= 1) goto L_0x054d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05a7, code lost:
        X.C13680ns.A1P(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x05aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02fa, code lost:
        r3.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x035e, code lost:
        r0.apply();
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x04c9;
                case 1: goto L_0x000d;
                case 2: goto L_0x00f8;
                case 3: goto L_0x0101;
                case 4: goto L_0x0101;
                case 5: goto L_0x010b;
                case 6: goto L_0x010b;
                case 7: goto L_0x0043;
                case 8: goto L_0x0113;
                case 9: goto L_0x012d;
                case 10: goto L_0x0135;
                case 11: goto L_0x004f;
                case 12: goto L_0x0144;
                case 13: goto L_0x0165;
                case 14: goto L_0x01c0;
                case 15: goto L_0x01df;
                case 16: goto L_0x024f;
                case 17: goto L_0x0257;
                case 18: goto L_0x025f;
                case 19: goto L_0x0267;
                case 20: goto L_0x026f;
                case 21: goto L_0x0277;
                case 22: goto L_0x00ac;
                case 23: goto L_0x00db;
                case 24: goto L_0x027f;
                case 25: goto L_0x0299;
                case 26: goto L_0x02ad;
                case 27: goto L_0x02db;
                case 28: goto L_0x02fe;
                case 29: goto L_0x0319;
                case 30: goto L_0x0362;
                case 31: goto L_0x03a5;
                case 32: goto L_0x03b2;
                case 33: goto L_0x03c4;
                case 34: goto L_0x03cc;
                case 35: goto L_0x0498;
                case 36: goto L_0x04a4;
                case 37: goto L_0x03e2;
                case 38: goto L_0x040a;
                case 39: goto L_0x0423;
                case 40: goto L_0x042d;
                case 41: goto L_0x044d;
                case 42: goto L_0x044d;
                case 43: goto L_0x0005;
                case 44: goto L_0x0005;
                case 45: goto L_0x0455;
                case 46: goto L_0x0462;
                case 47: goto L_0x0573;
                case 48: goto L_0x046c;
                case 49: goto L_0x0480;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1C()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r5 = r11.A00
            X.2pj r5 = (X.C57012pj) r5
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x000c
            boolean r0 = r5.isShowing()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x003b
            android.content.Context r4 = r5.getContext()
            r3 = 1
            int[] r2 = new int[r3]
            r1 = 16843611(0x101035b, float:2.3695965E-38)
            r0 = 0
            r2[r0] = r1
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r2)
            boolean r0 = r1.getBoolean(r0, r3)
            r5.A03 = r0
            r1.recycle()
            r5.A04 = r3
        L_0x003b:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x000c
            r5.cancel()
            return
        L_0x0043:
            java.lang.Object r0 = r11.A00
            X.3BH r0 = (X.AnonymousClass3BH) r0
            X.5RN r0 = r0.A02
            if (r0 == 0) goto L_0x000c
            r0.ANC()
            return
        L_0x004f:
            java.lang.Object r7 = r11.A00
            com.obwhatsapp.account.delete.DeleteAccountConfirmation r7 = (com.obwhatsapp.account.delete.DeleteAccountConfirmation) r7
            X.0wP r0 = r7.A07
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "deleteaccountconfirm/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            X.AnonymousClass29T.A01(r7, r0)
            return
        L_0x0065:
            r0 = 1
            X.AnonymousClass29T.A01(r7, r0)
            android.os.Handler r3 = r7.A01
            r2 = 0
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.sendEmptyMessageDelayed(r2, r0)
            X.124 r6 = r7.A08
            X.013 r0 = r7.A01
            java.lang.String r5 = r0.A06()
            X.013 r0 = r7.A01
            java.lang.String r4 = r0.A05()
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "additionalComments"
            java.lang.String r3 = r1.getStringExtra(r0)
            android.content.Intent r2 = r7.getIntent()
            r1 = -1
            java.lang.String r0 = "deleteReason"
            int r1 = r2.getIntExtra(r0, r1)
            X.0tK r0 = r6.A01
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "sendmethods/sendremoveaccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ug r2 = r6.A02
            android.os.Message r1 = X.AnonymousClass294.A01(r5, r4, r3, r1)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x00ac:
            java.lang.Object r0 = r11.A00
            X.2of r0 = (X.C56842of) r0
            X.38v r4 = r0.getViewModel()
            X.028 r1 = r4.A02
            r0 = 8
            X.C13680ns.A1P(r1, r0)
            com.whatsapp.jid.GroupJid r3 = r4.A00
            if (r3 == 0) goto L_0x000c
            X.1DH r1 = r4.A05
            r0 = 7
            r1.A00(r3, r0)
            X.0sq r2 = r4.A07
            r1 = 34
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r0 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            r4.A00()
            X.028 r1 = r4.A01
            r0 = 2131888921(0x7f120b19, float:1.941249E38)
            goto L_0x05a7
        L_0x00db:
            java.lang.Object r0 = r11.A00
            X.2of r0 = (X.C56842of) r0
            X.38v r3 = r0.getViewModel()
            X.028 r1 = r3.A02
            r0 = 8
            X.C13680ns.A1P(r1, r0)
            com.whatsapp.jid.GroupJid r2 = r3.A00
            if (r2 == 0) goto L_0x000c
            X.1DH r1 = r3.A05
            r0 = 5
            r1.A00(r2, r0)
            r3.A00()
            return
        L_0x00f8:
            java.lang.Object r1 = r11.A00
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r0 = 0
            r1.A0F(r0)
            return
        L_0x0101:
            java.lang.Object r1 = r11.A00
            X.0CB r1 = (X.AnonymousClass0CB) r1
            int r0 = r1.A01
            r1.A01(r0)
            return
        L_0x010b:
            java.lang.Object r0 = r11.A00
            X.3BH r0 = (X.AnonymousClass3BH) r0
            android.view.View r1 = r0.A0D
            goto L_0x041d
        L_0x0113:
            java.lang.Object r0 = r11.A00
            X.2S7 r0 = (X.AnonymousClass2S7) r0
            android.app.Activity r1 = r0.A01
            java.lang.String r0 = "android.settings.DATE_SETTINGS"
            android.content.Intent r0 = X.C13700nu.A02(r0)
            r1.startActivity(r0)
            r1.finish()
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        L_0x012d:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.WaInAppBrowsingActivity r0 = (com.obwhatsapp.WaInAppBrowsingActivity) r0
            r0.onBackPressed()
            return
        L_0x0135:
            java.lang.Object r1 = r11.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "delete-account/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.C14750ph.A00(r1)
            goto L_0x03a1
        L_0x0144:
            java.lang.Object r2 = r11.A00
            com.obwhatsapp.account.delete.DeleteAccountFeedback r2 = (com.obwhatsapp.account.delete.DeleteAccountFeedback) r2
            android.widget.EditText r0 = r2.A03
            r0.clearFocus()
            android.view.View r0 = r2.getCurrentFocus()
            if (r0 == 0) goto L_0x015c
            X.1Ai r1 = r2.A0B
            android.view.View r0 = r2.getCurrentFocus()
            r1.A01(r0)
        L_0x015c:
            r0 = 1
            r2.A07 = r0
            X.0Pu r0 = r2.A05
            r0.A00()
            return
        L_0x0165:
            java.lang.Object r5 = r11.A00
            com.obwhatsapp.account.delete.DeleteAccountFeedback r5 = (com.obwhatsapp.account.delete.DeleteAccountFeedback) r5
            android.widget.EditText r0 = r5.A03
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x018c
            android.widget.EditText r0 = r5.A03
            android.text.Editable r0 = r0.getText()
            int r1 = r0.length()
            r0 = 5
            if (r1 >= r0) goto L_0x018c
            X.0pt r2 = r5.A05
            r1 = 2131887815(0x7f1206c7, float:1.9410248E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x018c:
            int r4 = r5.A01
            r1 = 1
            android.widget.EditText r0 = r5.A03
            if (r4 != r1) goto L_0x01a1
            java.lang.String r0 = X.C13680ns.A0f(r0)
            androidx.fragment.app.DialogFragment r0 = com.obwhatsapp.account.delete.DeleteAccountFeedback.ChangeNumberMessageDialogFragment.A01(r0)
            r5.A06 = r0
            X.C13680ns.A1J(r0, r5)
            return
        L_0x01a1:
            java.lang.String r3 = X.C13680ns.A0f(r0)
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.account.delete.DeleteAccountConfirmation"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "deleteReason"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "additionalComments"
            r2.putExtra(r0, r3)
            r5.startActivity(r2)
            return
        L_0x01c0:
            java.lang.Object r2 = r11.A00
            com.obwhatsapp.audiopicker.AudioPickerActivity r2 = (com.obwhatsapp.audiopicker.AudioPickerActivity) r2
            android.widget.RelativeLayout r1 = r2.A05
            r0 = 8
            r1.setVisibility(r0)
            java.util.LinkedHashMap r0 = r2.A0O
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x01d9
            android.widget.ImageButton r0 = r2.A03
            X.AnonymousClass4Y7.A01(r0, r1, r1)
        L_0x01d9:
            X.267 r0 = r2.A08
            r0.A05(r1)
            return
        L_0x01df:
            java.lang.Object r5 = r11.A00
            com.obwhatsapp.audiopicker.AudioPickerActivity r5 = (com.obwhatsapp.audiopicker.AudioPickerActivity) r5
            X.0sP r1 = r5.A0C
            X.0sH r0 = r5.A0H
            java.lang.String r8 = r1.A08(r0)
            java.util.LinkedHashMap r0 = r5.A0O
            int r10 = r0.size()
            r7 = 0
            r9 = 2
            r6 = 1
            if (r10 != r6) goto L_0x0232
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            X.38M r0 = (X.AnonymousClass38M) r0
            java.lang.String r2 = r0.A07
            X.0sH r0 = r5.A0H
            boolean r0 = r0.A0J()
            r1 = 2131887411(0x7f120533, float:1.9409428E38)
            if (r0 == 0) goto L_0x0214
            r1 = 2131888716(0x7f120a4c, float:1.9412075E38)
        L_0x0214:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r7] = r2
            java.lang.String r0 = X.C13680ns.A0d(r5, r8, r0, r6, r1)
        L_0x021c:
            X.1fu r2 = X.C32241fu.A00(r5)
            r2.A06(r0)
            r1 = 2131891430(0x7f1214e6, float:1.941758E38)
            r0 = 14
            X.C13680ns.A1H(r2, r5, r0, r1)
            X.C13690nt.A1E(r2)
            X.C13690nt.A1G(r2)
            return
        L_0x0232:
            X.013 r4 = r5.A01
            X.0sH r0 = r5.A0H
            boolean r0 = r0.A0J()
            r3 = 2131755038(0x7f10001e, float:1.9140944E38)
            if (r0 == 0) goto L_0x0242
            r3 = 2131755174(0x7f1000a6, float:1.914122E38)
        L_0x0242:
            long r1 = (long) r10
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.AnonymousClass000.A1M(r0, r10, r7)
            r0[r6] = r8
            java.lang.String r0 = r4.A0J(r0, r3, r1)
            goto L_0x021c
        L_0x024f:
            java.lang.Object r0 = r11.A00
            X.39l r0 = (X.C615739l) r0
            r0.A02(r12)
            return
        L_0x0257:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.authentication.AppAuthSettingsActivity r0 = (com.obwhatsapp.authentication.AppAuthSettingsActivity) r0
            com.obwhatsapp.authentication.AppAuthSettingsActivity.A02(r0)
            return
        L_0x025f:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.authentication.AppAuthSettingsActivity r0 = (com.obwhatsapp.authentication.AppAuthSettingsActivity) r0
            com.obwhatsapp.authentication.AppAuthSettingsActivity.A03(r0)
            return
        L_0x0267:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.authentication.AppAuthenticationActivity r0 = (com.obwhatsapp.authentication.AppAuthenticationActivity) r0
            com.obwhatsapp.authentication.AppAuthenticationActivity.A03(r0)
            return
        L_0x026f:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.authentication.FingerprintBottomSheet r0 = (com.obwhatsapp.authentication.FingerprintBottomSheet) r0
            com.obwhatsapp.authentication.FingerprintBottomSheet.A03(r0)
            return
        L_0x0277:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.authentication.FingerprintBottomSheet r0 = (com.obwhatsapp.authentication.FingerprintBottomSheet) r0
            r0.A1D()
            return
        L_0x027f:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = (com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity) r0
            X.0qW r0 = r0.A0F
            java.lang.Object r2 = r0.getValue()
            com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r2 = (com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r2
            X.13a r1 = r2.A0A
            r0 = 5
            r1.A02(r0)
            X.1cy r1 = r2.A0C
            X.41F r0 = X.AnonymousClass41F.AVATAR_EDITOR
            r1.A0B(r0)
            return
        L_0x0299:
            java.lang.Object r3 = r11.A00
            X.3Ee r3 = (X.C62593Ee) r3
            X.0rz r0 = r3.A04
            android.content.SharedPreferences$Editor r2 = r0.A0K()
            java.lang.String r1 = "android_tablet_banner_dismissed"
            r0 = 1
            X.C13680ns.A0z(r2, r1, r0)
            r3.AHm()
            return
        L_0x02ad:
            java.lang.Object r4 = r11.A00
            X.3Ec r4 = (X.C62573Ec) r4
            android.content.Context r3 = r12.getContext()
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.businessupsell.BusinessAppEducation"
            android.content.Intent r0 = r2.setClassName(r1, r0)
            r3.startActivity(r0)
            X.2gN r3 = r4.A03
            X.0rz r2 = r3.A00
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r2)
            java.lang.String r1 = "biz_app_cross_sell_banner_click_count"
            int r0 = X.C13690nt.A01(r0, r1)
            int r0 = r0 + 1
            X.C13680ns.A1S(r2, r1, r0)
            r0 = 2
            goto L_0x02fa
        L_0x02db:
            java.lang.Object r2 = r11.A00
            X.3Ec r2 = (X.C62573Ec) r2
            android.view.View r1 = r2.A00
            r0 = 8
            r1.setVisibility(r0)
            X.2gN r3 = r2.A03
            X.0rz r2 = r3.A00
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r2)
            java.lang.String r1 = "biz_app_cross_sell_banner_dismiss_count"
            int r0 = X.C13690nt.A01(r0, r1)
            int r0 = r0 + 1
            X.C13680ns.A1S(r2, r1, r0)
            r0 = 3
        L_0x02fa:
            r3.A00(r0)
            return
        L_0x02fe:
            java.lang.Object r2 = r11.A00
            X.3Ed r2 = (X.C62583Ed) r2
            android.view.View r1 = r2.A00
            r0 = 8
            r1.setVisibility(r0)
            X.4DD r0 = r2.A02
            X.0rz r0 = r0.A00
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "biz_shop_sunset_banner_dismissed"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            goto L_0x035e
        L_0x0319:
            java.lang.Object r3 = r11.A00
            X.3Ei r3 = (X.C62633Ei) r3
            X.0t9 r1 = r3.A05
            X.3py r0 = new X.3py
            r0.<init>()
            r1.A05(r0)
            X.1VI r2 = r3.A01
            r1 = 1
            r0 = 3
            r2.A01(r1, r0)
            X.0rz r5 = r3.A04
            int r2 = X.C62633Ei.A08
            android.content.SharedPreferences$Editor r1 = r5.A0K()
            java.lang.String r0 = "education_banner_count"
            X.C13680ns.A0w(r1, r0, r2)
            r3.AHm()
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r5)
            java.lang.String r4 = "create_group_tip_count"
            int r0 = X.C13690nt.A01(r0, r4)
            int r1 = r0 + 1
            X.0t3 r0 = r3.A03
            long r2 = r0.A00()
            android.content.SharedPreferences$Editor r0 = r5.A0K()
            android.content.SharedPreferences$Editor r1 = r0.putInt(r4, r1)
            java.lang.String r0 = "create_group_tip_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
        L_0x035e:
            r0.apply()
            return
        L_0x0362:
            java.lang.Object r2 = r11.A00
            X.3Ei r2 = (X.C62633Ei) r2
            X.0t9 r1 = r2.A05
            X.3pz r0 = new X.3pz
            r0.<init>()
            r1.A05(r0)
            X.1VI r5 = r2.A01
            r4 = 1
            r0 = 2
            r5.A01(r4, r0)
            X.2Yr r0 = r2.A06
            r0.A00(r4)
            X.0rz r3 = r2.A04
            int r2 = X.C62633Ei.A08
            android.content.SharedPreferences$Editor r1 = r3.A0K()
            java.lang.String r0 = "education_banner_count"
            X.C13680ns.A0w(r1, r0, r2)
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r3)
            java.lang.String r1 = "groups_banner_click_count"
            int r0 = X.C13690nt.A01(r0, r1)
            int r0 = r0 + 1
            X.C13680ns.A1S(r3, r1, r0)
            android.app.Activity r1 = X.C19980zJ.A02(r5)
            r0 = 0
            android.content.Intent r0 = X.C14750ph.A0m(r1, r0, r4)
        L_0x03a1:
            r1.startActivity(r0)
            return
        L_0x03a5:
            java.lang.Object r0 = r11.A00
            X.4ua r0 = (X.C99784ua) r0
            r0.A01()
            X.1VI r2 = r0.A01
            r1 = 23
            r0 = 3
            goto L_0x03de
        L_0x03b2:
            java.lang.Object r2 = r11.A00
            X.4ua r2 = (X.C99784ua) r2
            X.1P3 r1 = r2.A02
            android.content.Context r0 = r12.getContext()
            r1.A03(r0)
            X.1VI r2 = r2.A01
            r1 = 23
            goto L_0x03dd
        L_0x03c4:
            java.lang.Object r0 = r11.A00
            X.4ua r0 = (X.C99784ua) r0
            r0.A01()
            return
        L_0x03cc:
            java.lang.Object r2 = r11.A00
            X.4ua r2 = (X.C99784ua) r2
            X.1P3 r1 = r2.A02
            android.content.Context r0 = r12.getContext()
            r1.A03(r0)
            X.1VI r2 = r2.A01
            r1 = 16
        L_0x03dd:
            r0 = 2
        L_0x03de:
            r2.A01(r1, r0)
            return
        L_0x03e2:
            java.lang.Object r5 = r11.A00
            X.3Eg r5 = (X.C62613Eg) r5
            X.0rz r0 = r5.A04
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "storage_usage_banner_dismissed"
            X.C13680ns.A0z(r1, r0, r2)
            X.0zJ r4 = r5.A02
            X.1VI r0 = r5.A03
            android.content.Context r3 = r0.getContext()
            android.content.Context r2 = r0.getContext()
            java.lang.String r1 = r5.A01
            r0 = 3
            android.content.Intent r0 = X.C14750ph.A0g(r2, r1, r0)
            r4.A06(r3, r0)
            return
        L_0x040a:
            java.lang.Object r3 = r11.A00
            X.3Eg r3 = (X.C62613Eg) r3
            X.0rz r0 = r3.A04
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "storage_usage_banner_dismissed"
            X.C13680ns.A0z(r1, r0, r2)
            android.view.View r1 = r3.A00
        L_0x041d:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0423:
            java.lang.Object r1 = r11.A00
            X.4Ls r1 = (X.C84744Ls) r1
            X.5Ol r0 = r1.A01
            r0.AOg(r12, r1)
            return
        L_0x042d:
            java.lang.Object r2 = r11.A00
            X.2qY r2 = (X.C57242qY) r2
            X.027 r1 = r2.A06
            com.whatsapp.jid.UserJid r3 = r2.A0M
            X.2W4 r0 = new X.2W4
            r0.<init>(r3)
            r1.A0B(r0)
            X.1KV r2 = r2.A0E
            r9 = 2
            r10 = 1
            java.lang.Integer r6 = X.C13680ns.A0X()
            r4 = 0
            r7 = r4
            r8 = r4
            r5 = r4
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x044d:
            java.lang.Object r0 = r11.A00
            X.1DU r0 = (X.AnonymousClass1DU) r0
            r0.AIT()
            return
        L_0x0455:
            java.lang.Object r0 = r11.A00
            X.3l3 r0 = (X.C71793l3) r0
            X.22J r0 = r0.A03
            X.C18450wi.A0C(r12)
            r0.AIU(r12)
            return
        L_0x0462:
            java.lang.Object r1 = r11.A00
            X.3l6 r1 = (X.C71823l6) r1
            X.5Ou r0 = r1.A01
            r0.AWZ(r1)
            return
        L_0x046c:
            java.lang.Object r4 = r11.A00
            X.2yn r4 = (X.C59692yn) r4
            com.whatsapp.jid.UserJid r3 = r4.A0K
            r2 = 0
            r1 = 2
            r0 = 0
            X.C18450wi.A0H(r3, r0)
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r0 = com.obwhatsapp.biz.cart.view.fragment.CartFragment.A01(r3, r2, r1)
            r4.Afc(r0)
            return
        L_0x0480:
            java.lang.Object r2 = r11.A00
            X.4TO r2 = (X.AnonymousClass4TO) r2
            boolean r0 = r2 instanceof X.C71843l8
            if (r0 == 0) goto L_0x0492
            X.5Ra r1 = r2.A00
            X.3l8 r2 = (X.C71843l8) r2
            X.4Vx r0 = r2.A00
            r1.ASQ(r0)
            return
        L_0x0492:
            X.5Ra r0 = r2.A00
            r0.AWd()
            return
        L_0x0498:
            java.lang.Object r0 = r11.A00
            X.3Ef r0 = (X.C62603Ef) r0
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x04c0
        L_0x04a4:
            java.lang.Object r1 = r11.A00
            X.3Ef r1 = (X.C62603Ef) r1
            X.1VI r0 = r1.A02
            android.content.Context r2 = r0.getContext()
            X.1Aj r4 = r1.A03
            X.02C r3 = r1.A01
            X.13U r6 = r1.A05
            X.0t3 r5 = r1.A04
            com.obwhatsapp.softenforcementsmb.SMBSoftEnforcementEducationFragment r1 = new com.obwhatsapp.softenforcementsmb.SMBSoftEnforcementEducationFragment
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r0 = "SMBSoftEnforcementEducation"
            r1.A1G(r3, r0)
        L_0x04c0:
            X.3sW r0 = new X.3sW
            r0.<init>()
            java.lang.String r0 = "source"
            goto L_0x04f1
        L_0x04c9:
            java.lang.Object r10 = r11.A00
            com.google.android.exoplayer2.ui.TrackSelectionView r10 = (com.google.android.exoplayer2.ui.TrackSelectionView) r10
            android.widget.CheckedTextView r9 = r10.A08
            if (r12 != r9) goto L_0x04f6
            r0 = 1
        L_0x04d2:
            r10.A04 = r0
            android.util.SparseArray r8 = r10.A05
            r8.clear()
        L_0x04d9:
            boolean r0 = r10.A04
            r9.setChecked(r0)
            android.widget.CheckedTextView r2 = r10.A07
            boolean r0 = r10.A04
            if (r0 != 0) goto L_0x04eb
            int r1 = r8.size()
            r0 = 1
            if (r1 == 0) goto L_0x04ec
        L_0x04eb:
            r0 = 0
        L_0x04ec:
            r2.setChecked(r0)
            java.lang.String r0 = "array-length"
        L_0x04f1:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x04f6:
            android.widget.CheckedTextView r0 = r10.A07
            if (r12 != r0) goto L_0x04fc
            r0 = 0
            goto L_0x04d2
        L_0x04fc:
            r7 = 0
            r10.A04 = r7
            r12.getTag()
            android.util.SparseArray r8 = r10.A05
            java.lang.Object r0 = r8.get(r7)
            X.4jW r0 = (X.C93634jW) r0
            r3 = 1
            if (r0 != 0) goto L_0x0527
            boolean r0 = r10.A03
            if (r0 != 0) goto L_0x051a
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x051a
            r8.clear()
        L_0x051a:
            int[] r1 = new int[r3]
            r1[r7] = r7
            X.4jW r0 = new X.4jW
            r0.<init>((int[]) r1)
        L_0x0523:
            r8.put(r7, r0)
            goto L_0x04d9
        L_0x0527:
            int r2 = r0.A02
            int[] r6 = r0.A04
            android.widget.CheckedTextView r12 = (android.widget.CheckedTextView) r12
            boolean r4 = r12.isChecked()
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0542
            X.4jT r0 = r10.A00
            X.4jQ[] r0 = r0.A02
            r0 = r0[r7]
            int r0 = r0.A01
            if (r0 <= r3) goto L_0x0542
            java.lang.String r0 = "getAdaptiveSupport"
            goto L_0x04f1
        L_0x0542:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x054d
            X.4jT r0 = r10.A00
            int r1 = r0.A01
            r0 = 1
            if (r1 > r3) goto L_0x054e
        L_0x054d:
            r0 = 0
        L_0x054e:
            if (r4 == 0) goto L_0x051a
            if (r0 == 0) goto L_0x04d9
            if (r2 != r3) goto L_0x0558
            r8.remove(r7)
            goto L_0x04d9
        L_0x0558:
            int r5 = r6.length
            int r0 = r5 + -1
            int[] r4 = new int[r0]
            r3 = 0
            r2 = 0
        L_0x055f:
            if (r3 >= r5) goto L_0x056d
            r1 = r6[r3]
            if (r1 == r7) goto L_0x056a
            int r0 = r2 + 1
            r4[r2] = r1
            r2 = r0
        L_0x056a:
            int r3 = r3 + 1
            goto L_0x055f
        L_0x056d:
            X.4jW r0 = new X.4jW
            r0.<init>((int[]) r4)
            goto L_0x0523
        L_0x0573:
            java.lang.Object r0 = r11.A00
            X.3l7 r0 = (X.C71833l7) r0
            X.4DJ r0 = r0.A00
            X.2qa r4 = r0.A00
            r3 = 0
            r4.A00 = r3
            X.026 r2 = r4.A04
            java.lang.Object r0 = r2.A01()
            if (r0 == 0) goto L_0x05a4
            java.lang.Object r0 = r2.A01()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r1 = X.C13680ns.A0n(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x05a4
            java.lang.Object r0 = r1.get(r3)
            boolean r0 = r0 instanceof X.C71833l7
            if (r0 == 0) goto L_0x05a4
            r1.remove(r3)
            r2.A09(r1)
        L_0x05a4:
            X.1cy r1 = r4.A0C
            r0 = 2
        L_0x05a7:
            X.C13680ns.A1P(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape15S0100000_I1.onClick(android.view.View):void");
    }
}
