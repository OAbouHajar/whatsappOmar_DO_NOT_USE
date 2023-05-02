package com.facebook.redex;

import android.view.View;

public class ViewOnClickCListenerShape11S0100000_I0_4 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape11S0100000_I0_4(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0746, code lost:
        if (r1 == false) goto L_0x0748;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x001e;
                case 2: goto L_0x0052;
                case 3: goto L_0x008a;
                case 4: goto L_0x00c6;
                case 5: goto L_0x0118;
                case 6: goto L_0x01a0;
                case 7: goto L_0x01e3;
                case 8: goto L_0x031f;
                case 9: goto L_0x032b;
                case 10: goto L_0x0345;
                case 11: goto L_0x034d;
                case 12: goto L_0x035a;
                case 13: goto L_0x036c;
                case 14: goto L_0x0374;
                case 15: goto L_0x01f7;
                case 16: goto L_0x0249;
                case 17: goto L_0x0384;
                case 18: goto L_0x029a;
                case 19: goto L_0x03d1;
                case 20: goto L_0x03dd;
                case 21: goto L_0x02bf;
                case 22: goto L_0x042b;
                case 23: goto L_0x0456;
                case 24: goto L_0x0474;
                case 25: goto L_0x0482;
                case 26: goto L_0x04a1;
                case 27: goto L_0x04a9;
                case 28: goto L_0x04b7;
                case 29: goto L_0x0007;
                case 30: goto L_0x0518;
                case 31: goto L_0x0007;
                case 32: goto L_0x05b3;
                case 33: goto L_0x05bb;
                case 34: goto L_0x0652;
                case 35: goto L_0x065a;
                case 36: goto L_0x0662;
                case 37: goto L_0x069f;
                case 38: goto L_0x06c9;
                case 39: goto L_0x06e4;
                case 40: goto L_0x02ee;
                case 41: goto L_0x0701;
                case 42: goto L_0x071f;
                case 43: goto L_0x084d;
                case 44: goto L_0x086a;
                case 45: goto L_0x0877;
                case 46: goto L_0x0886;
                case 47: goto L_0x088e;
                case 48: goto L_0x0896;
                case 49: goto L_0x08ad;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.qrcode.contactqr.ScannedCodeDialogFragment r0 = (com.obwhatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r0
            X.00l r2 = r0.A0C()
            X.0ph r1 = new X.0ph
            r1.<init>()
            X.0sH r0 = r0.A0I
            android.content.Intent r0 = r1.A0u(r2, r0)
            r2.startActivity(r0)
        L_0x001d:
            return
        L_0x001e:
            java.lang.Object r2 = r1.A00
            X.2Rc r2 = (X.C49112Rc) r2
            android.animation.AnimatorSet r0 = r2.A03
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001d
        L_0x002c:
            boolean r0 = r2.A09
            r1 = 0
            if (r0 == 0) goto L_0x0042
            android.animation.AnimatorSet r0 = r2.A03
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x0042
            android.animation.AnimatorSet r0 = r2.A03
            r0.start()
            r2.A07 = r1
        L_0x0042:
            com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r2.A0H
            android.content.Context r0 = r0.getContext()
            android.app.Activity r0 = X.C19980zJ.A00(r0)
            r0.onBackPressed()
            r2.A09 = r1
            return
        L_0x0052:
            java.lang.Object r3 = r1.A00
            X.2Rc r3 = (X.C49112Rc) r3
            android.animation.AnimatorSet r0 = r3.A03
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001d
        L_0x0060:
            android.animation.ValueAnimator r0 = r3.A0C
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001d
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x001d
            X.29P r2 = r3.A0F
            int r1 = r3.A00()
            r0 = 3
            if (r1 != r0) goto L_0x0076
            r0 = 0
        L_0x0076:
            r2.A05(r0)
            X.2Ra r1 = r3.A05
            if (r1 == 0) goto L_0x001d
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r1.A0H
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x001d
            r0 = 0
            r1.A07(r0)
            return
        L_0x008a:
            java.lang.Object r2 = r1.A00
            X.2Rc r2 = (X.C49112Rc) r2
            android.animation.AnimatorSet r0 = r2.A03
            if (r0 == 0) goto L_0x0098
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001d
        L_0x0098:
            android.animation.ValueAnimator r0 = r2.A0C
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001d
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x001d
            r1 = 1
            int r0 = r2.A00()
            if (r0 != r1) goto L_0x00b9
            X.29P r1 = r2.A0F
            r0 = 0
            r1.A05(r0)
            X.2Ra r0 = r2.A05
            if (r0 == 0) goto L_0x001d
            r0.A01()
            return
        L_0x00b9:
            X.29P r0 = r2.A0F
            r0.A05(r1)
            X.2Ra r0 = r2.A05
            if (r0 == 0) goto L_0x001d
            r0.A00()
            return
        L_0x00c6:
            java.lang.Object r4 = r1.A00
            X.2Rc r4 = (X.C49112Rc) r4
            X.2Ra r5 = r4.A05
            if (r5 == 0) goto L_0x001d
            X.4XG r0 = r4.A04
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x001d
            X.4XG r0 = r5.A03
            r0.A05()
            X.4Qt r0 = r5.A0L
            r0.A00()
            com.obwhatsapp.mediacomposer.doodle.DoodleView r1 = r5.A0H
            X.29k r0 = r1.A0J
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x00f6
            android.os.Handler r3 = r1.A0F
            java.lang.Runnable r2 = r1.A0K
            r3.removeCallbacks(r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L_0x00f6:
            X.2Rc r2 = r5.A0Q
            X.29k r0 = r5.A0O
            X.393 r0 = r0.A03
            java.util.LinkedList r0 = r0.A00
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r1 = 4
            if (r0 == 0) goto L_0x0108
            r1 = 0
        L_0x0108:
            com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r2.A0H
            r0.setUndoButtonVisibility(r1)
            X.4XG r0 = r4.A04
            r0.A04()
            X.2Ra r0 = r4.A05
            r0.A04()
            return
        L_0x0118:
            java.lang.Object r3 = r1.A00
            X.2Rc r3 = (X.C49112Rc) r3
            android.animation.AnimatorSet r0 = r3.A03
            if (r0 == 0) goto L_0x0126
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001d
        L_0x0126:
            android.animation.ValueAnimator r0 = r3.A0C
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001d
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x001d
            int r0 = r3.A00()
            r2 = 5
            if (r0 == r2) goto L_0x001d
            int r1 = r3.A00()
            r0 = 2
            if (r1 == r0) goto L_0x001d
            X.29P r0 = r3.A0F
            r0.A05(r2)
            X.2Ra r5 = r3.A05
            if (r5 == 0) goto L_0x001d
            com.obwhatsapp.mediacomposer.doodle.DoodleView r2 = r5.A0H
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x001d
            X.2Yn r1 = r5.A0F
            int r0 = r1.A00
            r2.A03 = r0
            X.4XG r4 = r5.A03
            r4.A05()
            X.01T r0 = r5.A0T
            java.lang.Object r7 = r0.get()
            X.2Ur r7 = (X.AnonymousClass2Ur) r7
            int r1 = r1.A00
            com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent r6 = r5.A0E
            com.obwhatsapp.mediacomposer.doodle.ColorPickerView r0 = r6.A05
            int r0 = r0.A06
            float r0 = (float) r0
            r7.A01 = r1
            r7.A00 = r0
            X.2VF r0 = r7.A0J
            r0.A01()
            X.2Ut r0 = r7.A0N
            com.obwhatsapp.ClearableEditText r1 = r0.A0A
            java.lang.String r0 = ""
            r1.setText(r0)
            android.graphics.Rect r0 = r5.A09
            com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r12 = r7.A0R
            int r3 = r0.left
            int r2 = r0.top
            int r1 = r0.right
            int r0 = r0.bottom
            r12.setPadding(r3, r2, r1, r0)
            X.29m r11 = r5.A0G
            X.39P r10 = r5.A0I
            r0 = 0
            r12.setVisibility(r0)
            com.obwhatsapp.mediacomposer.MediaComposerFragment r1 = r7.A0E
            boolean r0 = r1.A1I()
            r7.A04 = r0
            goto L_0x08bb
        L_0x01a0:
            java.lang.Object r2 = r1.A00
            X.2Rc r2 = (X.C49112Rc) r2
            android.animation.AnimatorSet r0 = r2.A03
            if (r0 == 0) goto L_0x01ae
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001d
        L_0x01ae:
            X.2Ra r0 = r2.A05
            if (r0 == 0) goto L_0x001d
            android.animation.ValueAnimator r0 = r2.A0C
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001d
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x001d
            X.29P r0 = r2.A0F
            r1 = 0
            r0.A05(r1)
            X.2Ra r2 = r2.A05
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r2.A0H
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x001d
            X.4XG r0 = r2.A03
            r0.A02()
            r2.A02()
            X.2Rb r0 = r2.A0J
            r0.A02 = r1
            X.29k r1 = r2.A0O
            r0 = 0
            r1.A01 = r0
            r2.A04()
            return
        L_0x01e3:
            java.lang.Object r0 = r1.A00
            X.2Rc r0 = (X.C49112Rc) r0
            X.4ES r0 = r0.A0G
            com.obwhatsapp.mediacomposer.MediaComposerActivity r1 = r0.A00
            X.29P r0 = r1.A0l
            android.net.Uri r0 = r0.A02()
            if (r0 == 0) goto L_0x001d
            r1.A3J(r0)
            return
        L_0x01f7:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.notification.PopupNotification r3 = (com.obwhatsapp.notification.PopupNotification) r3
            boolean r0 = r3.A2w()
            if (r0 != 0) goto L_0x001d
            X.0xw r0 = r3.A15
            r4 = 1
            r0.A01(r4)
            X.0tZ r0 = r3.A18
            if (r0 == 0) goto L_0x0212
            java.util.HashSet r1 = r3.A1N
            X.1Vw r0 = r0.A11
            r1.add(r0)
        L_0x0212:
            X.0sH r2 = r3.A0q
            if (r2 == 0) goto L_0x0221
            java.util.HashSet r1 = r3.A1L
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r2.A08(r0)
            r1.add(r0)
        L_0x0221:
            r3.A1R = r4
            java.util.List r0 = r3.A1O
            int r0 = r0.size()
            if (r0 <= r4) goto L_0x001d
            com.obwhatsapp.notification.PopupNotificationViewPager r1 = r3.A12
            int r0 = r1.getCurrentItem()
            int r0 = r0 + 1
            r1.A0F(r0, r4)
            com.obwhatsapp.notification.PopupNotificationViewPager r0 = r3.A12
            int r1 = r0.getCurrentItem()
            java.util.List r0 = r3.A1O
            int r0 = r0.size()
            if (r1 < r0) goto L_0x0245
            r1 = 0
        L_0x0245:
            r3.A2s(r1)
            return
        L_0x0249:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.notification.PopupNotification r4 = (com.obwhatsapp.notification.PopupNotification) r4
            boolean r0 = r4.A2w()
            if (r0 != 0) goto L_0x001d
            X.0xw r0 = r4.A15
            r3 = 1
            r0.A01(r3)
            X.0tZ r0 = r4.A18
            if (r0 == 0) goto L_0x0264
            java.util.HashSet r1 = r4.A1N
            X.1Vw r0 = r0.A11
            r1.add(r0)
        L_0x0264:
            X.0sH r2 = r4.A0q
            if (r2 == 0) goto L_0x0273
            java.util.HashSet r1 = r4.A1L
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r2.A08(r0)
            r1.add(r0)
        L_0x0273:
            r4.A1R = r3
            java.util.List r0 = r4.A1O
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x001d
            com.obwhatsapp.notification.PopupNotificationViewPager r1 = r4.A12
            int r0 = r1.getCurrentItem()
            int r0 = r0 - r3
            r1.A0F(r0, r3)
            com.obwhatsapp.notification.PopupNotificationViewPager r0 = r4.A12
            int r0 = r0.getCurrentItem()
            if (r0 >= 0) goto L_0x0296
            java.util.List r0 = r4.A1O
            int r0 = r0.size()
            int r0 = r0 - r3
        L_0x0296:
            r4.A2s(r0)
            return
        L_0x029a:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.notification.PopupNotification r3 = (com.obwhatsapp.notification.PopupNotification) r3
            X.0xw r1 = r3.A15
            r0 = 1
            r1.A01(r0)
            X.0tZ r0 = r3.A18
            if (r0 == 0) goto L_0x02af
            java.util.HashSet r1 = r3.A1N
            X.1Vw r0 = r0.A11
            r1.add(r0)
        L_0x02af:
            X.0sH r2 = r3.A0q
            if (r2 == 0) goto L_0x001d
            java.util.HashSet r1 = r3.A1L
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r2.A08(r0)
            r1.add(r0)
            return
        L_0x02bf:
            java.lang.Object r3 = r1.A00
            X.1VX r3 = (X.AnonymousClass1VX) r3
            X.0pd r2 = r3.A0G
            r1 = 1948(0x79c, float:2.73E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x001d
            android.view.View r0 = r3.A02
            android.content.Context r4 = r0.getContext()
            X.1s2 r3 = r3.A01
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.polls.PollResultsActivity"
            r2.setClassName(r1, r0)
            X.1Vw r0 = r3.A11
            X.AnonymousClass1yL.A00(r2, r0)
            r4.startActivity(r2)
            return
        L_0x02ee:
            java.lang.Object r0 = r1.A00
            X.2Aq r0 = (X.AnonymousClass2Aq) r0
            com.obwhatsapp.quickcontact.QuickContactActivity r3 = r0.A00
            X.0sL r0 = r3.A0X
            if (r0 == 0) goto L_0x001d
            X.0zJ r2 = r3.A00
            X.0ph r1 = new X.0ph
            r1.<init>()
            X.0sH r0 = r3.A0R
            android.content.Intent r0 = r1.A0v(r3, r0)
            r2.A07(r3, r0)
            X.0sG r4 = r3.A0F
            X.0sL r5 = r3.A0X
            X.0sO r1 = r3.A0P
            X.0sK r0 = r3.A01
            java.util.List r6 = X.C30341cC.A0D(r0, r1, r5)
            r7 = 0
            r9 = 1
            r8 = 7
            X.C30341cC.A0E(r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r3.A37(r0)
            return
        L_0x031f:
            java.lang.Object r1 = r1.A00
            X.1bp r1 = (X.C30151bp) r1
            r0 = 1
            r1.A0E(r0)
            r1.A01()
            return
        L_0x032b:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.mediaview.MediaViewBaseFragment r1 = (com.obwhatsapp.mediaview.MediaViewBaseFragment) r1
            boolean r0 = r1 instanceof com.obwhatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x0341
            com.obwhatsapp.mediaview.MediaViewFragment r1 = (com.obwhatsapp.mediaview.MediaViewFragment) r1
            X.0tY r0 = r1.A1M
            if (r0 == 0) goto L_0x033d
            r1.A1E()
            return
        L_0x033d:
            r1.A1F()
            return
        L_0x0341:
            r1.A1H()
            return
        L_0x0345:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.mediaview.MediaViewBaseFragment r0 = (com.obwhatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A1I()
            return
        L_0x034d:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.mediaview.MediaViewBaseFragment r2 = (com.obwhatsapp.mediaview.MediaViewBaseFragment) r2
            boolean r0 = r2.A0G
            r1 = r0 ^ 1
            r0 = 1
            r2.A1P(r1, r0)
            return
        L_0x035a:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "ExportMigrationDataExportedActivity/dataExportReadyFinishActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 100
            r1.setResult(r0)
            r1.finish()
            return
        L_0x036c:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.notification.PopupNotification r0 = (com.obwhatsapp.notification.PopupNotification) r0
            r0.A2q()
            return
        L_0x0374:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.notification.PopupNotification r1 = (com.obwhatsapp.notification.PopupNotification) r1
            X.15O r0 = r1.A1F
            r0.A00()
            r1.A2p()
            r1.finish()
            return
        L_0x0384:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.notification.PopupNotification r4 = (com.obwhatsapp.notification.PopupNotification) r4
            X.15O r0 = r4.A1F
            r0.A00()
            X.2Cp r0 = r4.A0d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r0.trim()
            X.0sH r2 = r4.A0q
            if (r2 == 0) goto L_0x03b0
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x03b0
            java.util.HashMap r1 = X.AnonymousClass4B0.A02
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r2.A08(r0)
            r1.put(r0, r3)
        L_0x03b0:
            X.0zJ r3 = r4.A0G
            X.0ph r2 = new X.0ph
            r2.<init>()
            X.14t r1 = r4.A0m
            X.0tZ r0 = r4.A18
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            X.0sH r0 = r1.A01(r0)
            android.content.Intent r0 = r2.A0v(r4, r0)
            r3.A07(r4, r0)
            r4.A2p()
            r4.finish()
            return
        L_0x03d1:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.permissions.NotificationPermissionBottomSheet r1 = (com.obwhatsapp.permissions.NotificationPermissionBottomSheet) r1
            r0 = 1
            r1.A1N(r0)
            r1.A1D()
            return
        L_0x03dd:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.permissions.NotificationPermissionBottomSheet r4 = (com.obwhatsapp.permissions.NotificationPermissionBottomSheet) r4
            r3 = 0
            android.content.Context r0 = r17.getContext()
            X.C18450wi.A0B(r0)
            boolean r0 = X.C16260sj.A01(r0)
            if (r0 == 0) goto L_0x0413
            X.0rz r0 = r4.A01
            java.lang.String r2 = "android.permission.POST_NOTIFICATIONS"
            X.01D r0 = r0.A01
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 != 0) goto L_0x0413
            r0 = 2
            r4.A1N(r0)
            X.0rz r1 = r4.A01
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r3] = r2
            com.obwhatsapp.RequestPermissionActivity.A0P(r4, r1, r0)
        L_0x040f:
            r4.A1D()
            return
        L_0x0413:
            r0 = 3
            r4.A1N(r0)
            boolean r1 = X.C15450qv.A06()
            X.00l r0 = r4.A0C()
            if (r1 == 0) goto L_0x0427
            if (r0 == 0) goto L_0x040f
            X.AnonymousClass1yL.A06(r0)
            goto L_0x040f
        L_0x0427:
            X.AnonymousClass1yL.A05(r0)
            goto L_0x040f
        L_0x042b:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r4 = (com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r4
            X.13G r3 = r4.A0C
            X.2Dr r0 = r4.A0E
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = r0 ^ 1
            X.13F r0 = r3.A01
            X.2Dw r1 = r0.A01()
            r0 = 9
            if (r2 == 0) goto L_0x0446
            r0 = 6
        L_0x0446:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A00(r1, r0)
            X.0xx r0 = r4.A0D
            r0.A02()
            r4.A1C()
            return
        L_0x0456:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r2 = (com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r2
            X.13G r1 = r2.A0C
            X.2Dr r0 = r2.A0E
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0470
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r0)
        L_0x0470:
            r2.A1C()
            return
        L_0x0474:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.profile.ProfileInfoActivity r3 = (com.obwhatsapp.profile.ProfileInfoActivity) r3
            X.121 r2 = r3.A0C
            X.0sH r1 = r3.A08
            r0 = 12
            r2.A06(r3, r1, r0)
            return
        L_0x0482:
            java.lang.Object r1 = r1.A00
            X.0pL r1 = (X.C14530pL) r1
            r4 = 0
            r5 = 2131891524(0x7f121544, float:1.941777E38)
            r6 = 2131889645(0x7f120ded, float:1.941396E38)
            X.0sK r0 = r1.A01
            java.lang.String r2 = r0.A07()
            r7 = 25
            java.lang.String[] r3 = X.C81954Al.A01
            r8 = 8193(0x2001, float:1.1481E-41)
            com.obwhatsapp.emoji.EmojiEditTextBottomSheetDialogFragment r0 = com.obwhatsapp.emoji.EmojiEditTextBottomSheetDialogFragment.A01(r2, r3, r4, r5, r6, r7, r8)
            r1.Afc(r0)
            return
        L_0x04a1:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.profile.ProfileInfoActivity r0 = (com.obwhatsapp.profile.ProfileInfoActivity) r0
            com.obwhatsapp.profile.ProfileInfoActivity.A03(r0)
            return
        L_0x04a9:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.profile.ProfilePhotoReminder r3 = (com.obwhatsapp.profile.ProfilePhotoReminder) r3
            X.121 r2 = r3.A0G
            X.0sH r1 = r3.A09
            r0 = 12
            r2.A06(r3, r1, r0)
            return
        L_0x04b7:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.profile.ProfilePhotoReminder r3 = (com.obwhatsapp.profile.ProfilePhotoReminder) r3
            com.obwhatsapp.WaEditText r0 = r3.A05
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r0.trim()
            java.lang.String[] r4 = X.C81954Al.A01
            int r2 = r4.length
            r1 = 0
        L_0x04cd:
            if (r1 >= r2) goto L_0x04ea
            r0 = r4[r1]
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x04e7
            java.lang.String r0 = "registername/checkmarks in pushname"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.obwhatsapp.PushnameEmojiBlacklistDialogFragment r0 = com.obwhatsapp.PushnameEmojiBlacklistDialogFragment.A01(r5)
            r3.Afc(r0)
        L_0x04e3:
            r3.finish()
            return
        L_0x04e7:
            int r1 = r1 + 1
            goto L_0x04cd
        L_0x04ea:
            int r0 = r5.length()
            if (r0 != 0) goto L_0x04ff
            java.lang.String r0 = "registername/no-pushname"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0pt r2 = r3.A05
            r1 = 2131891066(0x7f12137a, float:1.9416842E38)
            r0 = 0
            r2.A09(r1, r0)
            goto L_0x04e3
        L_0x04ff:
            X.0sK r0 = r3.A01
            java.lang.String r0 = r0.A07()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x04e3
            X.0sq r2 = r3.A05
            r1 = 36
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r0.<init>(r1, r5, r3)
            r2.Acl(r0)
            return
        L_0x0518:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.qrcode.contactqr.ScannedCodeDialogFragment r4 = (com.obwhatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r4
            int r1 = r4.A00
            r5 = 1
            if (r1 == 0) goto L_0x055d
            if (r1 == r5) goto L_0x0551
            r0 = 2
            if (r1 != r0) goto L_0x0587
            android.content.Context r3 = r4.A02()
            java.lang.String r0 = r4.A0S
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.0ph r2 = new X.0ph
            r2.<init>()
            com.whatsapp.jid.UserJid r1 = r4.A0L
            if (r0 != 0) goto L_0x0555
            java.lang.String r0 = r4.A0S
            android.content.Intent r0 = r2.A0z(r3, r1, r0)
            r4.A0r(r0)
        L_0x0542:
            X.0sq r2 = r4.A0Q
            r1 = 49
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.Acl(r0)
            r4.A1C()
        L_0x0551:
            r4.A1C()
            return
        L_0x0555:
            android.content.Intent r0 = r2.A0x(r3, r1)
            X.C54472hZ.A00(r0, r4)
            goto L_0x0542
        L_0x055d:
            X.0sH r0 = r4.A0I
            X.1ko r0 = r0.A0D
            if (r0 == 0) goto L_0x058f
            X.00l r0 = r4.A0D()
            android.content.Intent r1 = X.C14750ph.A02(r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            android.content.Intent r0 = r1.addFlags(r0)
            r4.A0r(r0)
            X.0ph r2 = new X.0ph
            r2.<init>()
            android.content.Context r1 = r4.A02()
            com.whatsapp.jid.UserJid r0 = r4.A0L
            android.content.Intent r0 = r2.A0x(r1, r0)
            X.C54472hZ.A00(r0, r4)
            goto L_0x0551
        L_0x0587:
            java.lang.String r0 = "Unhandled type"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x058f:
            X.1Kt r3 = r4.A0P
            com.whatsapp.jid.UserJid r0 = r4.A0L
            java.lang.String r2 = X.C24561Gk.A04(r0)
            X.AnonymousClass00B.A06(r2)
            X.0sH r0 = r4.A0I
            java.lang.String r1 = r0.A0W
            r0 = 0
            android.content.Intent r1 = r3.A01(r2, r1, r5, r0)
            java.lang.String r0 = "finishActivityOnSaveCompleted"
            r1.putExtra(r0, r5)
            r4.startActivityForResult(r1, r5)
            X.1Ks r1 = r4.A0O
            r0 = 11
            r1.A02(r5, r0)
            return
        L_0x05b3:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1C()
            return
        L_0x05bb:
            java.lang.Object r9 = r1.A00
            com.obwhatsapp.quickcontact.QuickContactActivity r9 = (com.obwhatsapp.quickcontact.QuickContactActivity) r9
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "location_latitude"
            r2 = 0
            double r12 = r1.getDoubleExtra(r0, r2)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "location_longitude"
            double r14 = r1.getDoubleExtra(r0, r2)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0637
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0637
            X.0yQ r8 = r9.A0Y
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "gjid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.0rv r4 = X.C15830rv.A02(r0)
            X.AnonymousClass00B.A06(r4)
            X.0sH r1 = r9.A0R
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r7 = r1.A08(r0)
            X.AnonymousClass00B.A06(r7)
            java.lang.Object r6 = r8.A0R
            monitor-enter(r6)
            java.util.Map r0 = r8.A09()     // Catch:{ all -> 0x062e }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x062e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x062e }
            X.0t3 r0 = r8.A0G     // Catch:{ all -> 0x062e }
            long r4 = r0.A00()     // Catch:{ all -> 0x062e }
            if (r1 == 0) goto L_0x062c
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x062e }
            X.28x r7 = (X.AnonymousClass28x) r7     // Catch:{ all -> 0x062e }
            if (r7 == 0) goto L_0x062c
            long r0 = r7.A00     // Catch:{ all -> 0x062e }
            boolean r0 = X.C19430yQ.A01(r0, r4)     // Catch:{ all -> 0x062e }
            if (r0 == 0) goto L_0x062c
            java.util.Map r1 = r8.A0c     // Catch:{ all -> 0x062e }
            com.whatsapp.jid.UserJid r0 = r7.A01     // Catch:{ all -> 0x062e }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x062e }
            X.1sx r0 = (X.C39721sx) r0     // Catch:{ all -> 0x062e }
        L_0x062a:
            monitor-exit(r6)     // Catch:{ all -> 0x062e }
            goto L_0x0631
        L_0x062c:
            r0 = 0
            goto L_0x062a
        L_0x062e:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x062e }
            throw r1
        L_0x0631:
            if (r0 == 0) goto L_0x0637
            double r12 = r0.A00
            double r14 = r0.A01
        L_0x0637:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x064d
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x064d
            X.0sP r1 = r9.A0I
            X.0sH r0 = r9.A0R
            java.lang.String r10 = r1.A08(r0)
            X.1P7 r8 = r9.A0Z
            r11 = 0
            r8.A08(r9, r10, r11, r12, r14)
        L_0x064d:
            r0 = 0
            r9.A37(r0)
            return
        L_0x0652:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.quickcontact.QuickContactActivity r0 = (com.obwhatsapp.quickcontact.QuickContactActivity) r0
            com.obwhatsapp.quickcontact.QuickContactActivity.A0A(r0)
            return
        L_0x065a:
            java.lang.Object r0 = r1.A00
            X.2Aq r0 = (X.AnonymousClass2Aq) r0
            r0.A01()
            return
        L_0x0662:
            java.lang.Object r0 = r1.A00
            X.2jZ r0 = (X.C55412jZ) r0
            com.obwhatsapp.quickcontact.QuickContactActivity r4 = r0.A04
            X.0sH r3 = r4.A0R
            if (r3 != 0) goto L_0x0679
            X.0pt r2 = r4.A05
            r1 = 2131888681(0x7f120a29, float:1.9412004E38)
            r0 = 0
            r2.A09(r1, r0)
        L_0x0675:
            r4.finish()
            return
        L_0x0679:
            X.1Kt r1 = r4.A0i
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r3.A08(r0)
            X.AnonymousClass00B.A06(r0)
            X.0rv r0 = (X.C15830rv) r0
            r2 = 1
            android.content.Intent r1 = r1.A00(r3, r0, r2)
            r0 = 524288(0x80000, float:7.34684E-40)
            r1.setFlags(r0)
            r4.startActivityForResult(r1, r2)     // Catch:{ ActivityNotFoundException -> 0x069b }
            X.1Ks r1 = r4.A0h     // Catch:{ ActivityNotFoundException -> 0x069b }
            r0 = 9
            r1.A02(r2, r0)     // Catch:{ ActivityNotFoundException -> 0x069b }
            goto L_0x0675
        L_0x069b:
            X.AnonymousClass29T.A01(r4, r2)
            goto L_0x0675
        L_0x069f:
            java.lang.Object r0 = r1.A00
            X.2Aq r0 = (X.AnonymousClass2Aq) r0
            com.obwhatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.0zJ r3 = r4.A00
            X.0ph r1 = new X.0ph
            r1.<init>()
            X.0sH r0 = r4.A0R
            android.content.Intent r1 = r1.A0v(r4, r0)
            java.lang.String r0 = "args_conversation_screen_entry_point"
            r2 = 1
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "extra_show_search_on_create"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "QuickContactActivity"
            r3.A08(r4, r1, r0)
            r0 = 0
            r4.A37(r0)
            return
        L_0x06c9:
            java.lang.Object r0 = r1.A00
            X.2Aq r0 = (X.AnonymousClass2Aq) r0
            com.obwhatsapp.quickcontact.QuickContactActivity r3 = r0.A00
            X.0zJ r2 = r3.A00
            X.0ph r1 = new X.0ph
            r1.<init>()
            X.0sH r0 = r3.A0R
            android.content.Intent r0 = r1.A0v(r3, r0)
            r2.A07(r3, r0)
            r0 = 0
            r3.A37(r0)
            return
        L_0x06e4:
            java.lang.Object r0 = r1.A00
            X.2Aq r0 = (X.AnonymousClass2Aq) r0
            com.obwhatsapp.quickcontact.QuickContactActivity r3 = r0.A00
            X.1po r2 = r3.A0k
            if (r2 == 0) goto L_0x06f6
            X.10c r1 = r3.A0C
            r0 = 10
            r1.A06(r3, r2, r0)
            return
        L_0x06f6:
            X.0so r3 = r3.A03
            r2 = 0
            java.lang.String r1 = "LinkedCallLogPrefetchNotCompletedOnTime"
            java.lang.String r0 = "quickContactDialog "
            r3.AcB(r1, r0, r2)
            return
        L_0x0701:
            java.lang.Object r3 = r1.A00
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r0 = "changenumberoverview/next"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.registration.ChangeNumber"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            r3.finish()
            return
        L_0x071f:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.registration.EULA r4 = (com.obwhatsapp.registration.EULA) r4
            X.01V r0 = r4.A08
            android.telephony.TelephonyManager r1 = r0.A0N()
            r7 = 2
            if (r1 != 0) goto L_0x0735
            java.lang.String r0 = "eula/cellular-network null"
        L_0x072e:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.AnonymousClass29T.A01(r4, r7)
            return
        L_0x0735:
            X.0sj r0 = r4.A08
            int r2 = X.AnonymousClass1U8.A01(r1, r0)
            X.0wP r0 = r4.A07
            X.1UW r0 = r0.A06()
            if (r0 == 0) goto L_0x0748
            boolean r1 = r0.A03
            r0 = 1
            if (r1 != 0) goto L_0x0749
        L_0x0748:
            r0 = 0
        L_0x0749:
            if (r2 != 0) goto L_0x0750
            if (r0 != 0) goto L_0x0750
            java.lang.String r0 = "eula/cellular-network unknown"
            goto L_0x072e
        L_0x0750:
            X.0sC r0 = r4.A09
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0788
            X.1ST r3 = r4.A0E
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = r3.A00
            long r5 = r8 - r0
            long r1 = X.AnonymousClass1ST.A09
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0788
            r3.A00 = r8
            java.util.List r2 = r3.A08
            java.util.List r1 = r3.A07
            r2.addAll(r1)
            java.util.List r0 = r3.A06
            r2.addAll(r0)
            r1.clear()
            r0.clear()
            X.0sq r2 = r3.A05
            r1 = 40
            com.facebook.redex.RunnableRunnableShape9S0100000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape9S0100000_I0_8
            r0.<init>(r3, r1)
            r2.Acl(r0)
        L_0x0788:
            java.lang.String r0 = "register/eula/accept"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xx r0 = r4.A0I
            r0.A03()
            X.0rz r0 = r4.A09
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "eula_accepted_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            X.0yg r3 = r4.A06
            X.11R r0 = r3.A07
            android.content.SharedPreferences r2 = r0.A00()
            java.lang.String r1 = "previously_logged_out_from_primary"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x080b
            X.1RE r6 = r3.A04
            boolean r0 = r6.A01()
            if (r0 != 0) goto L_0x080b
            X.1SS r0 = r3.A06
            X.2Hs r5 = r0.A00()
            X.2Hs r0 = X.C47132Hs.PHONE
            if (r5 == r0) goto L_0x080b
            X.0tz r0 = r6.A03
            android.content.Context r3 = r0.A00
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            android.content.ComponentName r1 = r6.A02
            if (r1 != 0) goto L_0x07dd
            java.lang.Class<com.obwhatsapp.companionmode.CompanionStateHolder$CompanionPreferenceStateReceiver> r0 = com.obwhatsapp.companionmode.CompanionStateHolder$CompanionPreferenceStateReceiver.class
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r3, r0)
            r6.A02 = r1
        L_0x07dd:
            int r1 = r2.getComponentEnabledSetting(r1)
            r0 = 1
            if (r1 == r0) goto L_0x080b
            if (r1 == r7) goto L_0x07ea
            X.2Hs r0 = X.C47132Hs.TABLET
            if (r5 != r0) goto L_0x080b
        L_0x07ea:
            java.lang.String r0 = "eula/show companion registration flow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = "entry_eula"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.companionmode.registration.RegisterAsCompanionActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
        L_0x0807:
            r4.finish()
            return
        L_0x080b:
            X.0yl r0 = r4.A0O
            r0.A00()
            X.0yx r0 = r4.A0L
            r10 = 1
            r0.A0A(r10)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r9 = "com.obwhatsapp.registration.RegisterPhone.phone_number"
            java.lang.String r8 = r0.getStringExtra(r9)
            java.lang.String r7 = "com.obwhatsapp.registration.RegisterPhone.country_code"
            java.lang.String r6 = r0.getStringExtra(r7)
            java.lang.String r5 = "com.obwhatsapp.registration.RegisterPhone.clear_phone_number"
            boolean r3 = r0.getBooleanExtra(r5, r10)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.registration.RegisterPhone"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            r1.putExtra(r9, r8)
            r1.putExtra(r7, r6)
            java.lang.String r0 = "com.obwhatsapp.registration.RegisterPhone.resetstate"
            r1.putExtra(r0, r10)
            r1.putExtra(r5, r3)
            r4.startActivity(r1)
            goto L_0x0807
        L_0x084d:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.registration.RegisterName r3 = (com.obwhatsapp.registration.RegisterName) r3
            r6 = 1
            r3.A1T = r6
            X.1BN r2 = r3.A1D
            java.lang.String r1 = "profile_photo"
            java.lang.String r0 = "tapped"
            r2.A04(r1, r0)
            X.121 r2 = r3.A0y
            X.0sH r4 = r3.A0d
            r5 = 12
            r7 = 1
            r8 = 1
            r2.A07(r3, r4, r5, r6, r7, r8)
            return
        L_0x086a:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.registration.RegisterName r1 = (com.obwhatsapp.registration.RegisterName) r1
            java.lang.String r0 = "RegisterName/clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A3A()
            return
        L_0x0877:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 130(0x82, float:1.82E-43)
            X.AnonymousClass29T.A00(r1, r0)
            r0 = 126(0x7e, float:1.77E-43)
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x0886:
            java.lang.Object r0 = r1.A00
            X.0pN r0 = (X.C14550pN) r0
            r0.onBackPressed()
            return
        L_0x088e:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1D()
            return
        L_0x0896:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.registration.VerifyPhoneNumber r1 = (com.obwhatsapp.registration.VerifyPhoneNumber) r1
            int r0 = r1.A35()
            boolean r0 = X.AnonymousClass3AS.A00(r0)
            if (r0 == 0) goto L_0x08a8
            r0 = 2
            r1.A3R(r0)
        L_0x08a8:
            r0 = 1
            r1.A42(r0)
            return
        L_0x08ad:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.registration.VerifyPhoneNumber r1 = (com.obwhatsapp.registration.VerifyPhoneNumber) r1
            java.lang.String r0 = "VerifyPhoneNumber/clicked wa old code button"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r1.A43(r0)
            return
        L_0x08bb:
            boolean r0 = r1 instanceof com.obwhatsapp.mediacomposer.VideoComposerFragment     // Catch:{ OutOfMemoryError -> 0x09d3 }
            if (r0 == 0) goto L_0x08d0
            com.obwhatsapp.mediacomposer.VideoComposerFragment r1 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r1     // Catch:{ OutOfMemoryError -> 0x09d3 }
            X.29D r0 = r1.A0M     // Catch:{ OutOfMemoryError -> 0x09d3 }
            android.graphics.Bitmap r9 = r0.A05()     // Catch:{ OutOfMemoryError -> 0x09d3 }
            if (r9 != 0) goto L_0x08f4
            java.io.File r0 = r1.A0N     // Catch:{ OutOfMemoryError -> 0x09d3 }
            android.graphics.Bitmap r9 = X.C18830xK.A01(r0)     // Catch:{ OutOfMemoryError -> 0x09d3 }
            goto L_0x08f4
        L_0x08d0:
            boolean r0 = r1 instanceof com.obwhatsapp.mediacomposer.ImageComposerFragment     // Catch:{ OutOfMemoryError -> 0x09d3 }
            if (r0 == 0) goto L_0x08ec
            com.obwhatsapp.mediacomposer.ImageComposerFragment r1 = (com.obwhatsapp.mediacomposer.ImageComposerFragment) r1     // Catch:{ OutOfMemoryError -> 0x09d3 }
            com.obwhatsapp.mediaview.PhotoView r0 = r1.A08     // Catch:{ OutOfMemoryError -> 0x09d3 }
            android.graphics.Bitmap r2 = r0.getPhoto()     // Catch:{ OutOfMemoryError -> 0x09d3 }
            if (r2 == 0) goto L_0x09e1
            android.graphics.Bitmap$Config r1 = r2.getConfig()     // Catch:{ OutOfMemoryError -> 0x09d3 }
            if (r1 != 0) goto L_0x08e6
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x09d3 }
        L_0x08e6:
            r0 = 1
            android.graphics.Bitmap r9 = r2.copy(r1, r0)     // Catch:{ OutOfMemoryError -> 0x09d3 }
            goto L_0x08f4
        L_0x08ec:
            com.obwhatsapp.mediacomposer.GifComposerFragment r1 = (com.obwhatsapp.mediacomposer.GifComposerFragment) r1     // Catch:{ OutOfMemoryError -> 0x09d3 }
            X.29D r0 = r1.A00     // Catch:{ OutOfMemoryError -> 0x09d3 }
            android.graphics.Bitmap r9 = r0.A05()     // Catch:{ OutOfMemoryError -> 0x09d3 }
        L_0x08f4:
            if (r9 == 0) goto L_0x09e1
            android.graphics.Bitmap$Config r1 = r9.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r1 != r0) goto L_0x0904
            boolean r0 = r9.isMutable()
            if (r0 != 0) goto L_0x090b
        L_0x0904:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x09d7 }
            r0 = 1
            android.graphics.Bitmap r9 = r9.copy(r1, r0)     // Catch:{ OutOfMemoryError -> 0x09d7 }
        L_0x090b:
            X.39P r3 = r11.A0G
            android.graphics.RectF r0 = r3.A07
            if (r0 == 0) goto L_0x09de
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r9)
            int r0 = r3.A02
            int r1 = r0 % 180
            r2 = 90
            android.graphics.RectF r0 = r3.A07
            if (r1 != r2) goto L_0x09cd
            float r7 = r0.height()
        L_0x0924:
            int r0 = r3.A02
            int r1 = r0 % 180
            android.graphics.RectF r0 = r3.A07
            if (r1 != r2) goto L_0x09c7
            float r2 = r0.width()
        L_0x0930:
            int r0 = r9.getWidth()
            float r1 = (float) r0
            float r1 = r1 / r7
            int r0 = r9.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r2
            r8.scale(r1, r0)
            android.graphics.Matrix r0 = r3.A09
            r8.concat(r0)
            android.graphics.RectF r2 = r3.A07
            float r0 = r2.left
            float r1 = -r0
            float r0 = r2.top
            float r0 = -r0
            r8.translate(r1, r0)
            X.29k r0 = r11.A0H
            java.util.List r7 = r0.A05
            android.graphics.Bitmap r0 = r11.A06
            if (r0 != 0) goto L_0x0987
            android.graphics.Bitmap r0 = r11.A05
            if (r0 != 0) goto L_0x0987
        L_0x095b:
            java.util.Iterator r2 = r7.iterator()
        L_0x095f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x09de
            java.lang.Object r1 = r2.next()
            X.29l r1 = (X.C455829l) r1
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x0972
            android.os.SystemClock.elapsedRealtime()
        L_0x0972:
            boolean r0 = r1 instanceof X.C605232r
            if (r0 == 0) goto L_0x0983
            X.32r r1 = (X.C605232r) r1
            android.graphics.drawable.Drawable r0 = r1.A01
            if (r0 == 0) goto L_0x095f
            X.C605232r.A02(r8, r1)
            r8.restore()
            goto L_0x095f
        L_0x0983:
            r1.A0P(r8)
            goto L_0x095f
        L_0x0987:
            java.util.Iterator r1 = r7.iterator()
        L_0x098b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x095b
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.AnonymousClass32x
            if (r0 == 0) goto L_0x098b
            r8.save()
            int r0 = r11.A00
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r1
            r8.scale(r0, r0)
            android.graphics.Bitmap r3 = r11.A05
            if (r3 == 0) goto L_0x09b4
            android.graphics.PointF r0 = r11.A0D
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.Paint r0 = r11.A0C
            r8.drawBitmap(r3, r2, r1, r0)
        L_0x09b4:
            android.graphics.Bitmap r3 = r11.A06
            if (r3 == 0) goto L_0x09c3
            android.graphics.PointF r0 = r11.A0D
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.Paint r0 = r11.A0C
            r8.drawBitmap(r3, r2, r1, r0)
        L_0x09c3:
            r8.restore()
            goto L_0x095b
        L_0x09c7:
            float r2 = r0.height()
            goto L_0x0930
        L_0x09cd:
            float r7 = r0.width()
            goto L_0x0924
        L_0x09d3:
            r1 = move-exception
            java.lang.String r0 = "ShapePicker/blurBackground getting bitmap from preview container"
            goto L_0x09da
        L_0x09d7:
            r1 = move-exception
            java.lang.String r0 = "ShapePicker/blurBackground copying bitmap"
        L_0x09da:
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x09e1
        L_0x09de:
            r12.A01(r9, r10)
        L_0x09e1:
            X.2Rc r0 = r5.A0Q
            r1 = 0
            com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0H
            r0.setToolbarExtraVisibility(r1)
            r0 = 1
            r6.A05(r0)
            X.2Rb r0 = r5.A0J
            r0.A02 = r1
            r5.A04()
            r5.A03()
            r4.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4.onClick(android.view.View):void");
    }
}
