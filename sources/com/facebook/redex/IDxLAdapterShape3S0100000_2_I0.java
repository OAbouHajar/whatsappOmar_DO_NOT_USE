package com.facebook.redex;

import X.AnonymousClass266;
import X.AnonymousClass2P3;
import X.AnonymousClass2Ut;
import X.AnonymousClass2V7;
import X.C15540rI;
import X.C30031bd;
import X.C53802gK;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.ClearableEditText;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.view.PipViewContainer;
import com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner;
import com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.obwhatsapp.components.CircularRevealView;
import com.obwhatsapp.components.RoundCornerProgressBar;
import com.whatsapp.util.Log;
import java.util.List;

public class IDxLAdapterShape3S0100000_2_I0 extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public IDxLAdapterShape3S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A01) {
            case 7:
                Log.i("PipViewContainer/animatePiPView onAnimationCancel");
                PipViewContainer pipViewContainer = (PipViewContainer) this.A00;
                pipViewContainer.A03();
                PipViewContainer.A00(pipViewContainer, false);
                return;
            case 13:
                ((CircularRevealView) this.A00).A0C = true;
                return;
            case 16:
            case 17:
            case 18:
                C30031bd r2 = (C30031bd) this.A00;
                if (r2.A06 == 2) {
                    r2.A06 = 0;
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                ((AnonymousClass2P3) this.A00).A0c = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (r2.A02 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        r2.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c9, code lost:
        r1.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0091;
                case 1: goto L_0x01e5;
                case 2: goto L_0x0076;
                case 3: goto L_0x01ce;
                case 4: goto L_0x01bb;
                case 5: goto L_0x01ae;
                case 6: goto L_0x0194;
                case 7: goto L_0x0183;
                case 8: goto L_0x0170;
                case 9: goto L_0x015f;
                case 10: goto L_0x0068;
                case 11: goto L_0x005a;
                case 12: goto L_0x014d;
                case 13: goto L_0x0145;
                case 14: goto L_0x0138;
                case 15: goto L_0x0005;
                case 16: goto L_0x004d;
                case 17: goto L_0x0005;
                case 18: goto L_0x004d;
                case 19: goto L_0x0005;
                case 20: goto L_0x011c;
                case 21: goto L_0x010b;
                case 22: goto L_0x00fb;
                case 23: goto L_0x0013;
                case 24: goto L_0x0009;
                case 25: goto L_0x00d0;
                case 26: goto L_0x00c5;
                case 27: goto L_0x00b6;
                case 28: goto L_0x00ae;
                case 29: goto L_0x009d;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r5)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r0 = r4.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0008
            r0.run()
            return
        L_0x0013:
            java.lang.Object r0 = r4.A00
            X.2Rc r0 = (X.C49112Rc) r0
            X.2Ra r3 = r0.A05
            X.2Rc r2 = r3.A0Q
            int r1 = r2.A00()
            r0 = 1
            if (r1 != r0) goto L_0x0034
            X.2gD r0 = r3.A05
            if (r0 == 0) goto L_0x0034
            android.app.Activity r0 = r3.A01
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0034
            X.2gD r0 = r3.A05
            r0.show()
            return
        L_0x0034:
            int r1 = r2.A00()
            r0 = 3
            if (r1 != r0) goto L_0x0008
            X.2gE r0 = r3.A06
            if (r0 == 0) goto L_0x0008
            android.app.Activity r0 = r3.A01
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0008
            X.2gE r0 = r3.A06
            r0.show()
            return
        L_0x004d:
            java.lang.Object r2 = r4.A00
            X.1bd r2 = (X.C30031bd) r2
            int r1 = r2.A06
            r0 = 2
            if (r1 != r0) goto L_0x0008
            r0 = 0
            r2.A06 = r0
            return
        L_0x005a:
            java.lang.Object r2 = r4.A00
            X.2V7 r2 = (X.AnonymousClass2V7) r2
            androidx.recyclerview.widget.RecyclerView r1 = r2.A0A
            r0 = 4
            r1.setVisibility(r0)
            com.obwhatsapp.camera.CameraBottomSheetBehavior r2 = r2.A0B
            r1 = 0
            goto L_0x006f
        L_0x0068:
            java.lang.Object r0 = r4.A00
            X.2V7 r0 = (X.AnonymousClass2V7) r0
            com.obwhatsapp.camera.CameraBottomSheetBehavior r2 = r0.A0B
            r1 = 1
        L_0x006f:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0008
            r2.A00 = r1
            return
        L_0x0076:
            super.onAnimationEnd(r5)
            java.lang.Object r0 = r4.A00
            X.2cB r0 = (X.C51732cB) r0
            com.obwhatsapp.HomeActivity r2 = r0.A00
            android.view.ViewGroup r1 = r2.A0G
            if (r1 == 0) goto L_0x0008
            android.view.View$OnLayoutChangeListener r0 = r2.A1x
            r1.removeOnLayoutChangeListener(r0)
            android.animation.AnimatorSet r0 = r2.A07
            r0.removeAllListeners()
            r0 = 0
            r2.A07 = r0
            return
        L_0x0091:
            java.lang.Object r1 = r4.A00
            X.2fw r1 = (X.C53582fw) r1
            android.animation.ValueAnimator r0 = r1.A00
            if (r0 != r5) goto L_0x0008
            r0 = 0
            r1.A00 = r0
            return
        L_0x009d:
            java.lang.Object r1 = r4.A00
            X.2P3 r1 = (X.AnonymousClass2P3) r1
            r0 = 4
            r1.setVisibility(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            r1.A05()
            return
        L_0x00ae:
            java.lang.Object r1 = r4.A00
            X.2P3 r1 = (X.AnonymousClass2P3) r1
            r0 = 0
            r1.A0c = r0
            return
        L_0x00b6:
            super.onAnimationEnd(r5)
            java.lang.Object r1 = r4.A00
            X.34v r1 = (X.C606734v) r1
            r0 = 0
            r1.A0M(r0)
            r1.A0H(r0)
            return
        L_0x00c5:
            super.onAnimationEnd(r5)
            java.lang.Object r0 = r4.A00
            com.whatsapp.util.FloatingChildLayout r0 = (com.whatsapp.util.FloatingChildLayout) r0
            android.view.View r1 = r0.A09
            goto L_0x01c9
        L_0x00d0:
            java.lang.Object r2 = r4.A00
            X.2gG r2 = (X.C53772gG) r2
            r0 = 0
            r2.A02 = r0
            boolean r0 = r2.A03
            com.obwhatsapp.WaImageView r1 = r2.A09
            if (r0 == 0) goto L_0x00f1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
        L_0x00e2:
            com.obwhatsapp.WaTextView r1 = r2.A0A
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x00ee
            int r0 = r2.A04
        L_0x00ea:
            r1.setTextColor(r0)
            return
        L_0x00ee:
            int r0 = r2.A05
            goto L_0x00ea
        L_0x00f1:
            r0 = 0
            r1.setAlpha(r0)
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00e2
        L_0x00fb:
            super.onAnimationEnd(r5)
            java.lang.Object r0 = r4.A00
            X.2Rc r0 = (X.C49112Rc) r0
            android.animation.ValueAnimator r0 = r0.A0C
            r0.removeAllUpdateListeners()
            r0.removeAllListeners()
            return
        L_0x010b:
            java.lang.Object r2 = r4.A00
            X.2Ut r2 = (X.AnonymousClass2Ut) r2
            android.view.View r1 = r2.A04
            r0 = 1
            r1.setClickable(r0)
            r1 = 0
            android.view.View r0 = r2.A06
            r0.setVisibility(r1)
            return
        L_0x011c:
            java.lang.Object r3 = r4.A00
            X.2Ut r3 = (X.AnonymousClass2Ut) r3
            android.view.View r1 = r3.A04
            r0 = 4
            r1.setVisibility(r0)
            com.obwhatsapp.ClearableEditText r2 = r3.A0A
            r0 = 0
            r2.setVisibility(r0)
            android.widget.ImageView r1 = r3.A07
            r0 = 2131231897(0x7f080499, float:1.8079888E38)
            r1.setImageResource(r0)
            r2.requestFocus()
            return
        L_0x0138:
            super.onAnimationEnd(r5)
            java.lang.Object r1 = r4.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0145:
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.components.CircularRevealView r1 = (com.obwhatsapp.components.CircularRevealView) r1
            r0 = 0
            r1.A0C = r0
            return
        L_0x014d:
            java.lang.Object r1 = r4.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r0 = 0
            r1.setListener(r0)
            return
        L_0x015f:
            super.onAnimationEnd(r5)
            java.lang.Object r1 = r4.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r1.setTranslationY(r0)
            return
        L_0x0170:
            super.onAnimationEnd(r5)
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner r0 = (com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner) r0
            android.os.Handler r3 = r0.A0D
            r2 = 0
            r3.removeMessages(r2)
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        L_0x0183:
            java.lang.String r0 = "PipViewContainer/animatePiPView onAnimationEnd"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.calling.callgrid.view.PipViewContainer r1 = (com.obwhatsapp.calling.callgrid.view.PipViewContainer) r1
            r1.A03()
            r0 = 0
            com.obwhatsapp.calling.callgrid.view.PipViewContainer.A00(r1, r0)
            return
        L_0x0194:
            super.onAnimationEnd(r5)
            java.lang.Object r2 = r4.A00
            X.266 r2 = (X.AnonymousClass266) r2
            androidx.appcompat.widget.SearchView r1 = r2.A06
            java.lang.String r0 = X.AnonymousClass266.A0H
            r1.setQueryHint(r0)
            android.widget.TextView r0 = r2.A04
            X.C13700nu.A0T(r0)
            android.widget.TextView r1 = r2.A04
            r0 = 0
            r1.setAlpha(r0)
            return
        L_0x01ae:
            super.onAnimationEnd(r5)
            java.lang.Object r0 = r4.A00
            X.266 r0 = (X.AnonymousClass266) r0
            android.widget.TextView r0 = r0.A05
            X.C13700nu.A0T(r0)
            return
        L_0x01bb:
            super.onAnimationEnd(r5)
            java.lang.Object r1 = r4.A00
            X.267 r1 = (X.AnonymousClass267) r1
            androidx.appcompat.widget.SearchView r0 = r1.A02
            r0.A07()
            android.view.View r1 = r1.A06
        L_0x01c9:
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x01ce:
            super.onAnimationEnd(r5)
            java.lang.Object r2 = r4.A00
            X.267 r2 = (X.AnonymousClass267) r2
            androidx.appcompat.widget.SearchView r1 = r2.A02
            r0 = 0
            r1.setIconified(r0)
            androidx.appcompat.widget.Toolbar r1 = r2.A08
            r0 = 4
            r1.setVisibility(r0)
            r2.A01()
            return
        L_0x01e5:
            java.lang.Object r0 = r4.A00
            X.0rI r0 = (X.C15540rI) r0
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxLAdapterShape3S0100000_2_I0.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationRepeat(Animator animator) {
        if (7 - this.A01 != 0) {
            super.onAnimationRepeat(animator);
        } else {
            Log.i("PipViewContainer/animatePiPView onAnimationRepeat");
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A01) {
            case 1:
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) ((C15540rI) this.A00).A06;
                snackbarContentLayout.A03.setAlpha(0.0f);
                long j2 = (long) 180;
                long j3 = (long) 70;
                snackbarContentLayout.A03.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
                if (snackbarContentLayout.A02.getVisibility() == 0) {
                    snackbarContentLayout.A02.setAlpha(0.0f);
                    snackbarContentLayout.A02.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
                    return;
                }
                return;
            case 5:
                super.onAnimationStart(animator);
                AnonymousClass266 r2 = (AnonymousClass266) this.A00;
                r2.A05.setAlpha(1.0f);
                r2.A05.setText(AnonymousClass266.A0F);
                r2.A06.setQueryHint("");
                return;
            case 6:
                super.onAnimationStart(animator);
                ((AnonymousClass266) this.A00).A04.setText(AnonymousClass266.A0H);
                return;
            case 7:
                Log.i("PipViewContainer/animatePiPView onAnimationStart");
                PipViewContainer.A00((PipViewContainer) this.A00, true);
                return;
            case 8:
                super.onAnimationStart(animator);
                InCallBannerViewModel inCallBannerViewModel = ((VoipInCallNotifBanner) this.A00).A04;
                if (inCallBannerViewModel != null) {
                    inCallBannerViewModel.A09.A0B(true);
                    return;
                }
                return;
            case 9:
                super.onAnimationStart(animator);
                InCallBannerViewModel inCallBannerViewModel2 = ((VoipInCallNotifBanner) this.A00).A04;
                if (inCallBannerViewModel2 != null) {
                    inCallBannerViewModel2.A09.A0B(false);
                    List list = inCallBannerViewModel2.A0A;
                    if (list.size() <= 1) {
                        list.clear();
                        return;
                    }
                    list.remove(0);
                    inCallBannerViewModel2.A08.A0B(list.get(0));
                    return;
                }
                return;
            case 10:
                ((AnonymousClass2V7) this.A00).A0A.setVisibility(0);
                return;
            case 13:
                ((CircularRevealView) this.A00).A0C = true;
                return;
            case 15:
                ((RoundCornerProgressBar) this.A00).A06 = false;
                return;
            case 19:
                C53802gK r3 = (C53802gK) this.A00;
                r3.setAlpha(0.0f);
                for (int i2 = 0; i2 < r3.getChildCount(); i2++) {
                    r3.A0A[i2] = r3.getChildAt(i2).getMeasuredWidth();
                }
                r3.setChildrenVisibility(8);
                return;
            case 20:
                AnonymousClass2Ut r22 = (AnonymousClass2Ut) this.A00;
                r22.A04.setClickable(false);
                r22.A06.setVisibility(4);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                AnonymousClass2Ut r32 = (AnonymousClass2Ut) this.A00;
                ClearableEditText clearableEditText = r32.A0A;
                clearableEditText.clearFocus();
                r32.A07.setImageResource(R.drawable.ic_shape_picker_search);
                r32.A04.setVisibility(0);
                clearableEditText.setVisibility(4);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                ((AnonymousClass2P3) this.A00).A0c = true;
                return;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                super.onAnimationStart(animator);
                ((AnonymousClass2P3) this.A00).A0d = false;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
