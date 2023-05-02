package com.facebook.redex;

import X.C53462fk;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.obwhatsapp.calling.CallDetailsLayout;
import com.obwhatsapp.calling.callgrid.view.FocusViewContainer;
import com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

public class IDxLAdapterShape0S0110000_2_I0 extends AnimatorListenerAdapter {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxLAdapterShape0S0110000_2_I0(FocusViewContainer focusViewContainer) {
        this.A02 = 2;
        this.A00 = focusViewContainer;
    }

    public IDxLAdapterShape0S0110000_2_I0(Object obj, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = z2;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A02) {
            case 1:
                super.onAnimationCancel(animator);
                CallDetailsLayout callDetailsLayout = (CallDetailsLayout) this.A00;
                callDetailsLayout.A00 = 0;
                callDetailsLayout.clearAnimation();
                return;
            case 2:
                super.onAnimationCancel(animator);
                this.A01 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        if (r1 != 5) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r8) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x0053;
                case 1: goto L_0x005e;
                case 2: goto L_0x0015;
                case 3: goto L_0x002e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A00
            com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r0 = (com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r0
            android.view.View r1 = r0.A03
            boolean r0 = r7.A01
            int r0 = X.C13680ns.A02(r0)
            r1.setVisibility(r0)
        L_0x0014:
            return
        L_0x0015:
            super.onAnimationEnd(r8)
            java.lang.Object r1 = r7.A00
            com.obwhatsapp.calling.callgrid.view.FocusViewContainer r1 = (com.obwhatsapp.calling.callgrid.view.FocusViewContainer) r1
            r0 = 0
            r1.A0A = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0014
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x002e:
            super.onAnimationEnd(r8)
            java.lang.Object r5 = r7.A00
            X.2Rc r5 = (X.C49112Rc) r5
            android.animation.AnimatorSet r0 = r5.A03
            if (r0 == 0) goto L_0x0014
            java.util.ArrayList r0 = r0.getChildAnimations()
            java.util.Iterator r1 = r0.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r1.next()
            android.animation.Animator r0 = (android.animation.Animator) r0
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.removeAllUpdateListeners()
            goto L_0x0041
        L_0x0053:
            java.lang.Object r1 = r7.A00
            X.2fk r1 = (X.C53462fk) r1
            r0 = 0
            r1.A05 = r0
            r0 = 0
            r1.A07 = r0
            return
        L_0x005e:
            super.onAnimationEnd(r8)
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.calling.CallDetailsLayout r2 = (com.obwhatsapp.calling.CallDetailsLayout) r2
            r0 = 2
            r2.A00 = r0
            boolean r0 = r7.A01
            r1 = 8
            if (r0 == 0) goto L_0x0075
            r2.setVisibility(r1)
        L_0x0071:
            r2.clearAnimation()
            return
        L_0x0075:
            android.widget.FrameLayout r0 = r2.A03
            r0.setVisibility(r1)
            goto L_0x0071
        L_0x007b:
            android.animation.AnimatorSet r0 = r5.A03
            r0.removeAllListeners()
            boolean r4 = r7.A01
            r3 = 0
            if (r4 == 0) goto L_0x00cd
            android.animation.AnimatorSet r0 = r5.A01(r3)
        L_0x0089:
            r5.A03 = r0
            if (r4 == 0) goto L_0x00af
            com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView r6 = r5.A0H
            int r1 = r5.A00()
            r0 = 1
            r2 = 4
            if (r1 == r0) goto L_0x00bf
            r0 = 2
            if (r1 == r0) goto L_0x00c2
            r0 = 3
            if (r1 == r0) goto L_0x00b4
            r0 = 5
            if (r1 == r0) goto L_0x00c2
        L_0x00a0:
            android.widget.ImageView r0 = r6.A03
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00af
            android.widget.ImageView r0 = r6.A03
            r0.setVisibility(r2)
        L_0x00af:
            r5.A09 = r4
            r5.A07 = r3
            return
        L_0x00b4:
            android.widget.ImageView r0 = r6.A05
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r6.A06
            r0.setVisibility(r2)
            goto L_0x00a0
        L_0x00bf:
            android.widget.ImageView r0 = r6.A06
            goto L_0x00c4
        L_0x00c2:
            android.widget.ImageView r0 = r6.A05
        L_0x00c4:
            r0.setVisibility(r2)
            com.obwhatsapp.WaTextView r0 = r6.A09
            r0.setVisibility(r2)
            goto L_0x00a0
        L_0x00cd:
            r0 = 0
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxLAdapterShape0S0110000_2_I0.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A02) {
            case 0:
                C53462fk r3 = (C53462fk) this.A00;
                r3.A0N.A00(0, this.A01);
                r3.A05 = 2;
                r3.A07 = animator;
                return;
            case 4:
                ((UserNoticeBottomSheetDialogFragment) this.A00).A03.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
