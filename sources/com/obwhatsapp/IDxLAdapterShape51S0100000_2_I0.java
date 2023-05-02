package com.obwhatsapp;

import X.AnonymousClass00B;
import X.AnonymousClass1ZL;
import X.AnonymousClass267;
import X.AnonymousClass26G;
import X.AnonymousClass291;
import X.AnonymousClass29S;
import X.AnonymousClass4RF;
import X.C30511cT;
import X.C30551cZ;
import X.C33741j5;
import X.C46202Cw;
import X.C49682Va;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageButton;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.obwhatsapp.identity.IdentityVerificationActivity;
import com.obwhatsapp.registration.RegisterPhone;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;

public class IDxLAdapterShape51S0100000_2_I0 extends C30551cZ {
    public Object A00;
    public final int A01;

    public IDxLAdapterShape51S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static void A01(Animation animation, IDxLAdapterShape51S0100000_2_I0 iDxLAdapterShape51S0100000_2_I0) {
        C46202Cw r2 = (C46202Cw) iDxLAdapterShape51S0100000_2_I0.A00;
        r2.A0b.clearAnimation();
        super.onAnimationEnd(animation);
        r2.removeCallbacks(r2.A16);
        r2.A0M = false;
        if (r2.A0N) {
            r2.A0d.setVisibility(8);
            r2.A0u.setVisibility(8);
            r2.A0r.setVisibility(8);
            return;
        }
        r2.A0v.setVisibility(8);
    }

    public void onAnimationEnd(Animation animation) {
        switch (this.A01) {
            case 0:
                ((HomeActivity) this.A00).A0I.setIconified(false);
                return;
            case 1:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                homeActivity.A0I.A07();
                homeActivity.A0E.setVisibility(4);
                return;
            case 2:
                ((AnonymousClass267) this.A00).A02.setIconified(false);
                return;
            case 3:
                AnonymousClass267 r1 = (AnonymousClass267) this.A00;
                r1.A02.A07();
                r1.A06.setVisibility(4);
                return;
            case 5:
                ((View) this.A00).setVisibility(8);
                return;
            case 6:
                ((ContactPickerFragment) this.A00).A0B.setVisibility(8);
                return;
            case 7:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) this.A00;
                sharedTextPreviewDialogFragment.A0F.setVisibility(8);
                sharedTextPreviewDialogFragment.A02.setVisibility(8);
                sharedTextPreviewDialogFragment.A01.setVisibility(8);
                sharedTextPreviewDialogFragment.A0F = null;
                sharedTextPreviewDialogFragment.A1N();
                sharedTextPreviewDialogFragment.A1O();
                sharedTextPreviewDialogFragment.A0O = false;
                return;
            case 9:
                C30511cT r2 = (C30511cT) this.A00;
                ViewGroup.LayoutParams layoutParams = r2.A09.getLayoutParams();
                layoutParams.width = -2;
                r2.A09.setLayoutParams(layoutParams);
                r2.A09.clearAnimation();
                return;
            case 11:
                ((IdentityVerificationActivity) this.A00).A03.setVisibility(8);
                return;
            case 12:
                ((AnonymousClass291) this.A00).A0T.setVisibility(8);
                return;
            case 13:
                AnonymousClass4RF r22 = (AnonymousClass4RF) this.A00;
                r22.A01.setVisibility(8);
                r22.A00(0.0f);
                return;
            case 14:
                AnonymousClass29S r23 = (AnonymousClass29S) this.A00;
                r23.A0J.setVisibility(8);
                r23.A0H(0);
                return;
            case 15:
                AnonymousClass29S r0 = (AnonymousClass29S) this.A00;
                r0.A0L(r0.A02(), (String) null, r0.A00(), false, true);
                return;
            case 16:
                AnonymousClass29S r24 = (AnonymousClass29S) this.A00;
                r24.A0H(r24.A0J.getHeight());
                r24.A0R((Float) null, true);
                return;
            case 17:
                RegisterPhone registerPhone = (RegisterPhone) this.A00;
                if (!registerPhone.A0V) {
                    registerPhone.A07.setVisibility(8);
                    return;
                }
                return;
            case 18:
                ExoPlaybackControlView exoPlaybackControlView = (ExoPlaybackControlView) this.A00;
                exoPlaybackControlView.setAlpha(1.0f);
                exoPlaybackControlView.removeCallbacks(exoPlaybackControlView.A0P);
                exoPlaybackControlView.removeCallbacks(exoPlaybackControlView.A0O);
                exoPlaybackControlView.A00 = null;
                return;
            case 19:
                A01(animation, this);
                return;
            case 20:
                ((AnonymousClass1ZL) this.A00).A0C.clearAnimation();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                ((AnonymousClass1ZL) this.A00).A0D.clearAnimation();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                AnonymousClass1ZL r12 = (AnonymousClass1ZL) this.A00;
                r12.A08.clearAnimation();
                View view = r12.A07;
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                view.setFocusableInTouchMode(false);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                ImageButton imageButton = ((AnonymousClass1ZL) this.A00).A0D;
                imageButton.setClickable(true);
                imageButton.clearAnimation();
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                ViewGroup viewGroup = ((AnonymousClass1ZL) this.A00).A0A;
                viewGroup.setVisibility(4);
                viewGroup.clearAnimation();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                View view2 = ((AnonymousClass1ZL) this.A00).A0H.A01;
                if (view2 != null) {
                    view2.clearAnimation();
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                AnonymousClass1ZL r3 = (AnonymousClass1ZL) this.A00;
                C33741j5 r25 = r3.A0H;
                r25.A03(8);
                r3.A0A.setVisibility(0);
                r3.A0F.setVisibility(0);
                r3.A04.setProgress(0);
                r25.A02().clearAnimation();
                return;
            default:
                super.onAnimationEnd(animation);
                return;
        }
    }

    public void onAnimationRepeat(Animation animation) {
        switch (this.A01) {
            case 4:
                onAnimationStart(animation);
                return;
            case 10:
                animation.setStartOffset(300);
                return;
            default:
                super.onAnimationRepeat(animation);
                return;
        }
    }

    public void onAnimationStart(Animation animation) {
        switch (this.A01) {
            case 4:
                AnonymousClass26G r3 = (AnonymousClass26G) this.A00;
                AnonymousClass26G.A00(r3.A01, 0.2f, 0.5f);
                AnonymousClass26G.A00(r3.A02, 0.25f, 0.75f);
                return;
            case 8:
                View view = ((C49682Va) this.A00).A00;
                AnonymousClass00B.A04(view);
                view.setVisibility(0);
                return;
            case 15:
                AnonymousClass29S r4 = (AnonymousClass29S) this.A00;
                r4.A0K(r4.A06, Float.valueOf(-0.5f), r4.A0A.getHeight(), true);
                return;
            case 16:
                AnonymousClass29S r1 = (AnonymousClass29S) this.A00;
                r1.A0I(r1.A0J.getHeight());
                r1.A0W(true);
                return;
            case 20:
                ((AnonymousClass1ZL) this.A00).A0C.setVisibility(0);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                ((AnonymousClass1ZL) this.A00).A0D.setVisibility(0);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                ((AnonymousClass1ZL) this.A00).A08.setVisibility(0);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                ((AnonymousClass1ZL) this.A00).A0H.A03(0);
                return;
            default:
                super.onAnimationStart(animation);
                return;
        }
    }
}
