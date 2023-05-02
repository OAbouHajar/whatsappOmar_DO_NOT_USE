package com.facebook.redex;

import X.C16250si;

public class RunnableRunnableShape0S0110000_I0 implements Runnable {
    public Object A00;
    public boolean A01;
    public final int A02;

    public RunnableRunnableShape0S0110000_I0(C16250si r2) {
        this.A02 = 13;
        this.A00 = r2;
        this.A01 = true;
    }

    public RunnableRunnableShape0S0110000_I0(Object obj, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04f3, code lost:
        if (r1 != false) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04fc, code lost:
        if (r9.A01 != false) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04fe, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04ff, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0502, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0503, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0139, code lost:
        r1.AdM(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.A02
            switch(r0) {
                case 0: goto L_0x0632;
                case 1: goto L_0x02cc;
                case 2: goto L_0x061e;
                case 3: goto L_0x0188;
                case 4: goto L_0x05f8;
                case 5: goto L_0x05ca;
                case 6: goto L_0x05c0;
                case 7: goto L_0x05a2;
                case 8: goto L_0x0592;
                case 9: goto L_0x0575;
                case 10: goto L_0x0564;
                case 11: goto L_0x013d;
                case 12: goto L_0x0529;
                case 13: goto L_0x0506;
                case 14: goto L_0x04f6;
                case 15: goto L_0x0129;
                case 16: goto L_0x00f8;
                case 17: goto L_0x04e6;
                case 18: goto L_0x04d4;
                case 19: goto L_0x04ad;
                case 20: goto L_0x0479;
                case 21: goto L_0x046f;
                case 22: goto L_0x0463;
                case 23: goto L_0x00c8;
                case 24: goto L_0x0097;
                case 25: goto L_0x040b;
                case 26: goto L_0x0367;
                case 27: goto L_0x02f7;
                case 28: goto L_0x02ed;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r9.A00
            com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity r4 = (com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity) r4
            boolean r3 = r9.A01
            boolean r0 = r4.AIm()
            if (r0 != 0) goto L_0x0092
            r1 = 2131166961(0x7f0706f1, float:1.7948182E38)
            if (r3 == 0) goto L_0x0019
            r1 = 2131166962(0x7f0706f2, float:1.7948184E38)
        L_0x0019:
            android.widget.ImageView r0 = r4.A04
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r5 = r6.leftMargin
            android.content.res.Resources r0 = r4.getResources()
            int r2 = r0.getDimensionPixelSize(r1)
            int r1 = r6.rightMargin
            int r0 = r6.bottomMargin
            r6.setMargins(r5, r2, r1, r0)
            android.widget.ImageView r2 = r4.A04
            if (r3 == 0) goto L_0x0093
            X.013 r0 = r4.A01
            boolean r1 = r0.A0T()
            r0 = 2131232431(0x7f0806af, float:1.8080971E38)
            if (r1 == 0) goto L_0x0044
            r0 = 2131232432(0x7f0806b0, float:1.8080973E38)
        L_0x0044:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r4, r0)
            r2.setImageDrawable(r0)
            android.view.View r1 = r4.A03
            r2 = 8
            r0 = 0
            if (r3 == 0) goto L_0x0054
            r0 = 8
        L_0x0054:
            r1.setVisibility(r0)
            android.view.View r1 = r4.A02
            r0 = 8
            if (r3 == 0) goto L_0x005e
            r0 = 0
        L_0x005e:
            r1.setVisibility(r0)
            android.view.View r0 = r4.A01
            if (r3 == 0) goto L_0x0066
            r2 = 0
        L_0x0066:
            r0.setVisibility(r2)
            android.widget.TextView r1 = r4.A07
            r0 = 2131891679(0x7f1215df, float:1.9418085E38)
            if (r3 == 0) goto L_0x0073
            r0 = 2131891680(0x7f1215e0, float:1.9418087E38)
        L_0x0073:
            r1.setText(r0)
            android.widget.TextView r3 = r4.A06
            X.0ps r0 = r4.A08
            android.content.SharedPreferences r2 = r0.A00()
            java.lang.String r1 = "two_factor_auth_email_set"
            r0 = 0
            int r2 = r2.getInt(r1, r0)
            r1 = 1
            r0 = 2131891673(0x7f1215d9, float:1.9418073E38)
            if (r2 != r1) goto L_0x008f
            r0 = 2131891675(0x7f1215db, float:1.9418077E38)
        L_0x008f:
            r3.setText(r0)
        L_0x0092:
            return
        L_0x0093:
            r0 = 2131232430(0x7f0806ae, float:1.808097E38)
            goto L_0x0044
        L_0x0097:
            java.lang.Object r5 = r9.A00
            X.1Sk r5 = (X.C27601Sk) r5
            boolean r3 = r9.A01
            X.126 r2 = r5.A0O
            r0 = 39
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r1 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r1.<init>((java.lang.Object) r5, (int) r0)
            r0 = 14
            r2.A01(r1, r0)
            X.0pt r4 = r5.A02
            X.0tK r2 = r5.A0A
            r1 = 38
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r2, (int) r1)
            r4.A0K(r0)
            if (r3 == 0) goto L_0x0092
            r2 = 2000(0x7d0, double:9.88E-321)
            r1 = 41
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r5, (int) r1)
            r4.A0L(r0, r2)
            return
        L_0x00c8:
            java.lang.Object r2 = r9.A00
            com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel r2 = (com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel) r2
            boolean r3 = r9.A01
            X.0qW r0 = r2.A09
            java.lang.Object r1 = r0.getValue()
            X.028 r1 = (X.AnonymousClass028) r1
            X.1TR r2 = r2.A07
            X.2Ta r0 = r2.A00()
            r1.A09(r0)
            if (r3 == 0) goto L_0x0092
            r1 = 0
            X.17O r0 = r2.A00
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0092
            X.0wT r0 = r2.A01
            boolean r0 = r0.A0Q()
            if (r0 == 0) goto L_0x0092
            X.0wU r0 = r2.A02
            r0.A08(r1)
            return
        L_0x00f8:
            java.lang.Object r3 = r9.A00
            X.0t9 r3 = (X.C16490t9) r3
            boolean r4 = r9.A01
            if (r4 == 0) goto L_0x0111
            X.0rz r0 = r3.A0D
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "wam_is_current_buffer_real_time"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
        L_0x0111:
            boolean r0 = r3.A0J()
            if (r0 == 0) goto L_0x011e
            X.0xp r1 = r3.A08
            X.1a9 r0 = r3.A03
            r1.AdM(r0, r4)
        L_0x011e:
            boolean r0 = r3.A0H()
            if (r0 == 0) goto L_0x0092
            X.0xp r1 = r3.A08
            X.1a9 r0 = r3.A01
            goto L_0x0139
        L_0x0129:
            java.lang.Object r2 = r9.A00
            X.0t9 r2 = (X.C16490t9) r2
            boolean r4 = r9.A01
            boolean r0 = r2.A0I()
            if (r0 == 0) goto L_0x0092
            X.0xp r1 = r2.A07
            X.1a9 r0 = r2.A02
        L_0x0139:
            r1.AdM(r0, r4)
            return
        L_0x013d:
            java.lang.Object r2 = r9.A00
            X.1CB r2 = (X.AnonymousClass1CB) r2
            boolean r1 = r9.A01
            X.0xc r0 = r2.A0F
            r0.A07(r1)
            X.0tz r0 = r2.A0P
            android.content.Context r5 = r0.A00
            X.01V r0 = r2.A0O
            android.app.ActivityManager r0 = r0.A03()
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0092
            java.lang.String r4 = r5.getPackageName()
            java.util.Iterator r3 = r0.iterator()
        L_0x0160:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0655
            java.lang.Object r2 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r1 = r2.importance
            r0 = 100
            if (r1 != r0) goto L_0x0160
            java.lang.String r0 = r2.processName
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0160
            android.content.Intent r1 = X.C14750ph.A04(r5)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r1.setFlags(r0)
            r5.startActivity(r0)
            goto L_0x0160
        L_0x0188:
            java.lang.Object r5 = r9.A00
            com.obwhatsapp.avatar.home.AvatarHomeActivity r5 = (com.obwhatsapp.avatar.home.AvatarHomeActivity) r5
            boolean r6 = r9.A01
            com.obwhatsapp.components.MainChildCoordinatorLayout r0 = r5.A0I
            if (r0 != 0) goto L_0x019f
            java.lang.String r0 = "coordinatorLayout"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x019f:
            int r3 = r0.getHeight()
            float r1 = (float) r3
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r4 = (int) r1
            android.widget.LinearLayout r2 = r5.A06
            if (r2 != 0) goto L_0x01b9
            java.lang.String r0 = "containerNewUser"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01b9:
            r1 = 0
            int r0 = r2.getMeasuredHeight()
            if (r0 != 0) goto L_0x01c7
            r2.measure(r1, r1)
            int r0 = r2.getMeasuredHeight()
        L_0x01c7:
            if (r6 == 0) goto L_0x01cc
            if (r0 <= 0) goto L_0x01cc
            r4 = r0
        L_0x01cc:
            int r1 = r3 - r4
            com.obwhatsapp.bottomsheet.LockableBottomSheetBehavior r0 = r5.A0G
            if (r0 == 0) goto L_0x01d5
            r0.A0L(r1)
        L_0x01d5:
            android.widget.LinearLayout r0 = r5.A05
            if (r0 != 0) goto L_0x01e6
            java.lang.String r0 = "containerAvatarSheet"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01e6:
            int r0 = r0.getHeight()
            int r3 = r3 - r0
            android.view.View r0 = r5.A03
            java.lang.String r8 = "sheetPaddingView"
            if (r0 != 0) goto L_0x01fd
            X.C18450wi.A0O(r8)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01fd:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L_0x0236
            r6 = 0
        L_0x0204:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 16843499(0x10102eb, float:2.3695652E-38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r7, r0)
            if (r0 == 0) goto L_0x0255
            int r1 = r7.data
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = android.util.TypedValue.complexToDimensionPixelSize(r1, r0)
            android.widget.LinearLayout r0 = r5.A05
            if (r0 != 0) goto L_0x0239
            java.lang.String r0 = "containerAvatarSheet"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0236:
            int r6 = r0.height
            goto L_0x0204
        L_0x0239:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            com.obwhatsapp.components.MainChildCoordinatorLayout r0 = r5.A0I
            if (r0 != 0) goto L_0x024e
            java.lang.String r0 = "coordinatorLayout"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x024e:
            int r0 = r0.getHeight()
            int r0 = r0 - r2
            r1.height = r0
        L_0x0255:
            if (r3 <= r6) goto L_0x026e
            android.view.View r0 = r5.A03
            if (r0 != 0) goto L_0x0266
            X.C18450wi.A0O(r8)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0266:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x026e
            r0.height = r3
        L_0x026e:
            com.obwhatsapp.CircularProgressBar r0 = r5.A08
            java.lang.String r3 = "avatarLoadingProgressBar"
            if (r0 != 0) goto L_0x027f
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x027f:
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x0298
            com.obwhatsapp.CircularProgressBar r1 = r5.A08
            if (r1 != 0) goto L_0x0294
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0294:
            r0 = 0
            r1.measure(r0, r0)
        L_0x0298:
            com.obwhatsapp.CircularProgressBar r0 = r5.A08
            if (r0 != 0) goto L_0x02a7
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02a7:
            int r2 = r0.getMeasuredHeight()
            com.obwhatsapp.CircularProgressBar r0 = r5.A08
            if (r0 != 0) goto L_0x02ba
            X.C18450wi.A0O(r3)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02ba:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x0092
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            if (r1 == 0) goto L_0x0092
            int r0 = r4 >> 1
            int r0 = r0 - r2
            r1.topMargin = r0
            return
        L_0x02cc:
            java.lang.Object r3 = r9.A00
            com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r3 = (com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r3
            boolean r1 = r9.A01
            X.00l r0 = r3.A0C()
            if (r0 == 0) goto L_0x0092
            boolean r0 = X.AnonymousClass29T.A03(r0)
            if (r0 != 0) goto L_0x0092
            r2 = 1
            if (r1 == 0) goto L_0x065a
            r0 = 2
            r3.A00 = r0
            X.0ps r0 = r3.A06
            r0.A05(r2)
            r3.A1O()
            return
        L_0x02ed:
            java.lang.Object r1 = r9.A00
            X.1w2 r1 = (X.C41501w2) r1
            boolean r0 = r9.A01
            r1.A01(r0)
            return
        L_0x02f7:
            java.lang.Object r0 = r9.A00
            com.obwhatsapp.settings.SettingsUserProxyActivity r0 = (com.obwhatsapp.settings.SettingsUserProxyActivity) r0
            boolean r4 = r9.A01
            com.obwhatsapp.settings.SettingsUserProxyViewModel r2 = r0.A06
            monitor-enter(r2)
            X.0rz r0 = r2.A0B     // Catch:{ all -> 0x0364 }
            android.content.SharedPreferences$Editor r1 = r0.A0K()     // Catch:{ all -> 0x0364 }
            java.lang.String r0 = "proxy_enabled"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r4)     // Catch:{ all -> 0x0364 }
            r0.apply()     // Catch:{ all -> 0x0364 }
            r3 = 0
            if (r4 == 0) goto L_0x032e
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0364 }
            if (r0 == 0) goto L_0x0357
            X.1S6 r0 = r2.A0F     // Catch:{ all -> 0x0364 }
            java.util.List r0 = r0.A00()     // Catch:{ all -> 0x0364 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0364 }
            if (r0 == 0) goto L_0x0329
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0364 }
            if (r0 == 0) goto L_0x0329
            r2.A07(r0)     // Catch:{ all -> 0x0364 }
        L_0x0329:
            r0 = 1
            r2.A06(r0, r3)     // Catch:{ all -> 0x0364 }
            goto L_0x0354
        L_0x032e:
            boolean r0 = r2.A02     // Catch:{ all -> 0x0364 }
            if (r0 != 0) goto L_0x0357
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0364 }
            if (r0 != 0) goto L_0x0338
            r1 = 0
            goto L_0x0342
        L_0x0338:
            X.0yE r0 = r2.A09     // Catch:{ all -> 0x0364 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0364 }
            r1 = 5
            if (r0 == 0) goto L_0x0342
            r1 = 4
        L_0x0342:
            r2.A06(r1, r3)     // Catch:{ all -> 0x0364 }
            X.1S6 r1 = r2.A0F     // Catch:{ all -> 0x0364 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0364 }
            r0.<init>()     // Catch:{ all -> 0x0364 }
            r1.A01(r0)     // Catch:{ all -> 0x0364 }
            X.4Qu r0 = r2.A0E     // Catch:{ all -> 0x0364 }
            r0.A00(r3)     // Catch:{ all -> 0x0364 }
        L_0x0354:
            r2.A05()     // Catch:{ all -> 0x0364 }
        L_0x0357:
            X.027 r1 = r2.A06     // Catch:{ all -> 0x0364 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0364 }
            r1.A09(r0)     // Catch:{ all -> 0x0364 }
            r2.A02 = r3     // Catch:{ all -> 0x0364 }
            monitor-exit(r2)
            return
        L_0x0364:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0367:
            java.lang.Object r5 = r9.A00
            com.obwhatsapp.settings.SettingsChatHistoryFragment r5 = (com.obwhatsapp.settings.SettingsChatHistoryFragment) r5
            boolean r7 = r9.A01
            X.0tb r8 = r5.A03
            X.0xS r6 = r8.A0a
            java.lang.String r1 = "msgstore/archiveall "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A06(r7)
            X.0rt r0 = r6.A0A
            java.util.Collection r4 = r0.A0A()
            java.util.Iterator r1 = r4.iterator()
        L_0x038f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x039e
            java.lang.Object r0 = r1.next()
            X.0rx r0 = (X.C15840rx) r0
            r0.A0e = r7
            goto L_0x038f
        L_0x039e:
            X.17E r0 = r6.A0C
            android.os.Handler r3 = r0.A02
            X.17Z r2 = r6.A03
            r1 = 34
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r0.<init>(r2, r1)
            r3.post(r0)
            X.126 r2 = r6.A07
            r0 = 8
            com.facebook.redex.RunnableRunnableShape0S0210000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0210000_I0
            r1.<init>(r6, r4, r0, r7)
            r0 = 4
            r2.A01(r1, r0)
            X.0pt r3 = r8.A03
            X.0pj r2 = r8.A1I
            r1 = 16
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r0.<init>(r2, r1)
            r3.A0K(r0)
            X.0sf r7 = r8.A1R
            java.util.Set r0 = r7.A0A()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x03d8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03f4
            java.lang.Object r3 = r4.next()
            X.0rv r3 = (X.C15830rv) r3
            X.0xU r0 = r8.A0I
            r2 = 0
            java.util.Set r0 = r0.A0D(r3, r2)
            r6.addAll(r0)
            r0 = 0
            r7.A08(r3, r0, r2)
            goto L_0x03d8
        L_0x03f4:
            X.0xU r0 = r8.A0I
            r0.A0V(r6)
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
            X.0pt r2 = r5.A00
            r1 = 27
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r0 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.A0K(r0)
            return
        L_0x040b:
            java.lang.Object r3 = r9.A00
            X.00k r3 = (X.C000900k) r3
            boolean r2 = r9.A01
            r0 = 2131362699(0x7f0a038b, float:1.8345186E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r2 == 0) goto L_0x0441
            r0 = 2131887137(0x7f120421, float:1.9408873E38)
            r1.setText(r0)
            r0 = 2131362701(0x7f0a038d, float:1.834519E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887140(0x7f120424, float:1.9408879E38)
            r1.setText(r0)
            r0 = 2131362700(0x7f0a038c, float:1.8345188E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887138(0x7f120422, float:1.9408875E38)
        L_0x043d:
            r1.setText(r0)
            return
        L_0x0441:
            r0 = 2131887132(0x7f12041c, float:1.9408862E38)
            r1.setText(r0)
            r0 = 2131362701(0x7f0a038d, float:1.834519E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887142(0x7f120426, float:1.9408883E38)
            r1.setText(r0)
            r0 = 2131362700(0x7f0a038c, float:1.8345188E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887141(0x7f120425, float:1.940888E38)
            goto L_0x043d
        L_0x0463:
            java.lang.Object r0 = r9.A00
            X.1P4 r0 = (X.AnonymousClass1P4) r0
            boolean r1 = r9.A01
            X.1GO r0 = r0.A03
            r0.A0A(r1)
            return
        L_0x046f:
            java.lang.Object r1 = r9.A00
            X.0pi r1 = (X.C14760pi) r1
            boolean r0 = r9.A01
            X.C14760pi.A00(r1, r0)
            return
        L_0x0479:
            java.lang.Object r4 = r9.A00
            X.0pj r4 = (X.C14770pj) r4
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x04a5
            java.lang.String r0 = "updating dismissed notification hash"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r3 = r4.A0E
            X.01D r0 = r3.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "last_notification_hash"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            android.content.SharedPreferences$Editor r1 = r3.A0K()
            java.lang.String r0 = "notification_hash"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
        L_0x04a5:
            X.0yL r2 = r4.A0D
            r1 = 1
            r0 = 0
            r2.A03(r1, r0)
            return
        L_0x04ad:
            java.lang.Object r1 = r9.A00
            X.19Z r1 = (X.AnonymousClass19Z) r1
            boolean r3 = r9.A01
            X.0z8 r2 = r1.A02
            r2.A00()
            java.lang.Iterable r0 = r1.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x04c0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04d0
            java.lang.Object r0 = r1.next()
            X.0vn r0 = (X.C17880vn) r0
            r0.AZG(r3)
            goto L_0x04c0
        L_0x04d0:
            r2.A00()
            return
        L_0x04d4:
            java.lang.Object r0 = r9.A00
            X.2Ut r0 = (X.AnonymousClass2Ut) r0
            boolean r2 = r9.A01
            X.2X3 r0 = r0.A0C
            X.2OJ r1 = r0.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A0B(r0)
            return
        L_0x04e6:
            java.lang.Object r2 = r9.A00
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r1 = r9.A01
            r0 = 2131365724(0x7f0a0f5c, float:1.8351321E38)
            android.view.View r2 = X.AnonymousClass00T.A05(r2, r0)
            if (r1 == 0) goto L_0x0503
            goto L_0x04fe
        L_0x04f6:
            java.lang.Object r2 = r9.A00
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x0503
        L_0x04fe:
            r0 = 0
        L_0x04ff:
            r2.setVisibility(r0)
            return
        L_0x0503:
            r0 = 8
            goto L_0x04ff
        L_0x0506:
            java.lang.Object r1 = r9.A00
            X.0si r1 = (X.C16250si) r1
            java.lang.String r0 = "MessageStoreBackup/backupdb/sb unlocker"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tq r0 = r1.A0Q     // Catch:{ SQLiteException -> 0x0522 }
            r0.A04()     // Catch:{ SQLiteException -> 0x0522 }
            X.1jC r0 = r0.A04     // Catch:{ SQLiteException -> 0x0522 }
            r0.AHC()     // Catch:{ SQLiteException -> 0x0522 }
            X.17C r0 = r1.A0S     // Catch:{ SQLiteException -> 0x0522 }
            r0.A01()     // Catch:{ SQLiteException -> 0x0522 }
            r1.A0I()     // Catch:{ SQLiteException -> 0x0522 }
            return
        L_0x0522:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backupdb/failed-to-get-database/cannot-generate-fts-or-links"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0529:
            java.lang.Object r0 = r9.A00
            X.2JE r0 = (X.AnonymousClass2JE) r0
            boolean r1 = r9.A01
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = r0.A04
            android.widget.ImageView r0 = r0.A08
            android.view.animation.Animation r2 = r0.getAnimation()
            boolean r0 = r2 instanceof X.AnonymousClass3NY
            if (r0 != 0) goto L_0x0556
            java.lang.String r0 = "conversations-gdrive-observer/set-message/unexpected-animation-class: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            if (r2 != 0) goto L_0x0551
            java.lang.String r0 = "null"
        L_0x0546:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0551:
            java.lang.Class r0 = r2.getClass()
            goto L_0x0546
        L_0x0556:
            X.3NY r2 = (X.AnonymousClass3NY) r2
            if (r1 == 0) goto L_0x055e
            r0 = 0
        L_0x055b:
            r2.A01 = r0
            return
        L_0x055e:
            r0 = 0
            r2.A00 = r0
            r0 = 1
            goto L_0x055b
        L_0x0564:
            java.lang.Object r2 = r9.A00
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r1 = r9.A01
            r0 = 2131362803(0x7f0a03f3, float:1.8345397E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r2, r0)
            r0.setEnabled(r1)
            return
        L_0x0575:
            java.lang.Object r0 = r9.A00
            X.2V2 r0 = (X.AnonymousClass2V2) r0
            boolean r1 = r9.A01
            X.1aI r0 = r0.A00
            X.2VD r0 = r0.A0I
            com.obwhatsapp.camera.overlays.AutofocusOverlay r3 = r0.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A03 = r0
            r3.invalidate()
            java.lang.Runnable r2 = r3.A07
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0592:
            boolean r1 = r9.A01
            java.lang.Object r0 = r9.A00
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            if (r1 == 0) goto L_0x059e
            com.whatsapp.voipcalling.Voip.notifyDeviceIdentityDeleted(r0)
            return
        L_0x059e:
            com.whatsapp.voipcalling.Voip.notifyDeviceIdentityChanged(r0)
            return
        L_0x05a2:
            java.lang.Object r3 = r9.A00
            X.25g r3 = (X.C447225g) r3
            boolean r2 = r9.A01
            java.lang.String r1 = "VoiceService/actionCreateCallLink isVideoCallLink:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.Voip.createCallLink(r2)
            r3.A0M()
            return
        L_0x05c0:
            java.lang.Object r1 = r9.A00
            X.2jD r1 = (X.C55282jD) r1
            boolean r0 = r9.A01
            X.C55282jD.A05(r1, r0)
            return
        L_0x05ca:
            java.lang.Object r0 = r9.A00
            X.2jJ r0 = (X.C55312jJ) r0
            boolean r3 = r9.A01
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r2 = r0.A01
            boolean r0 = r2.A3V()
            if (r0 != 0) goto L_0x05f1
            android.widget.ProgressBar r1 = r2.A05
            r0 = 100
            r1.setProgress(r0)
            android.widget.ProgressBar r1 = r2.A05
            r0 = 1
            r1.setIndeterminate(r0)
            android.widget.TextView r1 = r2.A08
            r0 = 2131891549(0x7f12155d, float:1.9417821E38)
            r1.setText(r0)
            r2.A3P(r3)
            return
        L_0x05f1:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/observer/activity exited during finishing msgstore download"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x05f8:
            java.lang.Object r0 = r9.A00
            X.1Qm r0 = (X.C27111Qm) r0
            boolean r6 = r9.A01
            X.1Ql r2 = r0.A00
            if (r6 == 0) goto L_0x061b
            java.lang.String r3 = "avatar_creation"
        L_0x0604:
            r1 = 0
            kotlin.jvm.internal.IDxLambdaShape58S0000000_2_I1 r4 = new kotlin.jvm.internal.IDxLambdaShape58S0000000_2_I1
            r4.<init>(r1)
            r5 = 1
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0F
            r0.set(r1)
            X.0sq r0 = r2.A0E
            X.3Hp r1 = new X.3Hp
            r1.<init>(r2, r3, r4, r5, r6)
            r0.Acl(r1)
            return
        L_0x061b:
            java.lang.String r3 = "avatar_update"
            goto L_0x0604
        L_0x061e:
            java.lang.Object r2 = r9.A00
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r1 = r9.A01
            android.view.Window r0 = r2.getWindow()
            X.C434920f.A08(r0, r1)
            r0 = 2131100117(0x7f0601d5, float:1.7812606E38)
            X.C434920f.A03(r2, r0)
            return
        L_0x0632:
            java.lang.Object r0 = r9.A00
            X.0tb r0 = (X.C16760tb) r0
            boolean r3 = r9.A01
            X.0pt r2 = r0.A03
            java.lang.String r0 = "Failed to "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            if (r3 == 0) goto L_0x0651
            java.lang.String r0 = "Keep"
        L_0x0645:
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x0651:
            java.lang.String r0 = "undo Keep"
            goto L_0x0645
        L_0x0655:
            r0 = 0
            java.lang.System.exit(r0)
            return
        L_0x065a:
            X.0ps r1 = r3.A06
            r0 = 0
            r1.A05(r0)
            android.widget.TextView r1 = r3.A02
            r0 = 2131892316(0x7f12185c, float:1.9419377E38)
            r1.setText(r0)
            com.obwhatsapp.CodeInputField r1 = r3.A03
            java.lang.String r0 = ""
            r1.setCode(r0)
            com.obwhatsapp.CodeInputField r0 = r3.A03
            r0.setEnabled(r2)
            android.widget.ProgressBar r1 = r3.A01
            r0 = 100
            r1.setProgress(r0)
            X.0pt r2 = r3.A04
            r1 = 38
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r0.<init>(r3, r1)
            r2.A0K(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0110000_I0.run():void");
    }
}
