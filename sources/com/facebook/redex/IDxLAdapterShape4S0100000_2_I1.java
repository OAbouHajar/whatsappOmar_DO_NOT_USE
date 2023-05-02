package com.facebook.redex;

import X.AnonymousClass33A;
import X.AnonymousClass5MY;
import X.C101144wn;
import X.C41571wB;
import X.C41581wC;
import X.C41611wF;
import X.C49892Wl;
import X.C56192n1;
import X.C59882zE;
import X.C609836w;
import X.C63313Gy;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.obwhatsapp.RollingCounterView;
import com.obwhatsapp.calling.callgrid.view.FocusViewContainer;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout;
import com.obwhatsapp.components.AnimatingArrowsLayout;
import com.obwhatsapp.phonematching.CountryPicker;
import com.obwhatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipActivityV2;

public class IDxLAdapterShape4S0100000_2_I1 extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public IDxLAdapterShape4S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A01) {
            case 3:
                super.onAnimationCancel(animator);
                FocusViewContainer.A00((FocusViewContainer) ((IDxCListenerShape83S0200000_1_I0) this.A00).A00);
                return;
            case 5:
                Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationCancel");
                AnonymousClass5MY r0 = ((VideoCallParticipantViewLayout) this.A00).A0F;
                if (r0 != null) {
                    VoipActivityV2 voipActivityV2 = ((C101144wn) r0).A00;
                    voipActivityV2.A22 = false;
                    voipActivityV2.A3a();
                    return;
                }
                return;
            case 9:
                super.onAnimationCancel(animator);
                SolidColorWallpaperPreview solidColorWallpaperPreview = ((C56192n1) this.A00).A03.A04;
                solidColorWallpaperPreview.A0C = false;
                solidColorWallpaperPreview.A09.setScrollEnabled(true);
                return;
            case 10:
                super.onAnimationCancel(animator);
                ((SolidColorWallpaperPreview) this.A00).finish();
                return;
            case 11:
                super.onAnimationCancel(animator);
                ((C609836w) this.A00).A05.setImageDrawable((Drawable) null);
                return;
            case 13:
                animator.removeListener(this);
                return;
            case 16:
                super.onAnimationCancel(animator);
                ((VoipActivityV2) this.A00).A3b();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A01) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.A00).A02 = null;
                return;
            case 1:
                ((ExpandableTransformationBehavior) this.A00).A00 = null;
                return;
            case 2:
                ((RollingCounterView) this.A00).A02();
                return;
            case 3:
                super.onAnimationEnd(animator);
                FocusViewContainer.A00((FocusViewContainer) ((IDxCListenerShape83S0200000_1_I0) this.A00).A00);
                return;
            case 5:
                Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationEnd");
                AnonymousClass5MY r0 = ((VideoCallParticipantViewLayout) this.A00).A0F;
                if (r0 != null) {
                    VoipActivityV2 voipActivityV2 = ((C101144wn) r0).A00;
                    voipActivityV2.A22 = false;
                    voipActivityV2.A3a();
                    return;
                }
                return;
            case 6:
                AnimatingArrowsLayout animatingArrowsLayout = (AnimatingArrowsLayout) this.A00;
                animatingArrowsLayout.post(new RunnableRunnableShape17S0100000_I1((Object) animatingArrowsLayout.A03, 47));
                return;
            case 7:
                ((AnonymousClass33A) this.A00).A06.A1F();
                return;
            case 8:
                super.onAnimationEnd(animator);
                CountryPicker countryPicker = (CountryPicker) this.A00;
                countryPicker.A01.A07();
                countryPicker.A00.setVisibility(8);
                countryPicker.A02.setVisibility(0);
                return;
            case 9:
                super.onAnimationEnd(animator);
                SolidColorWallpaperPreview solidColorWallpaperPreview = ((C56192n1) this.A00).A03.A04;
                solidColorWallpaperPreview.A0C = false;
                solidColorWallpaperPreview.A09.setScrollEnabled(true);
                return;
            case 10:
                super.onAnimationEnd(animator);
                ((SolidColorWallpaperPreview) this.A00).finish();
                return;
            case 11:
                super.onAnimationEnd(animator);
                ((C609836w) this.A00).A05.setImageDrawable((Drawable) null);
                return;
            case 12:
                ((StatusesFragment) ((IDxDListenerShape191S0100000_2_I1) this.A00).A00).A00 = null;
                return;
            case 13:
                StatusesFragment statusesFragment = (StatusesFragment) this.A00;
                statusesFragment.A12.removeAll(statusesFragment.A13);
                statusesFragment.A0i.notifyDataSetChanged();
                statusesFragment.A00 = null;
                return;
            case 14:
                C49892Wl r2 = ((C63313Gy) this.A00).A02.A0k;
                r2.A04.A01 = false;
                r2.A00();
                return;
            case 15:
                CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) this.A00;
                creationModeBottomBar.A0A.setAlpha(1.0f);
                creationModeBottomBar.A0A.setVisibility(4);
                C41581wC r1 = creationModeBottomBar.A0E;
                if (r1 != null) {
                    C41571wB r12 = (C41571wB) r1;
                    r12.A06 = new C41611wF(r12);
                    r12.A0A = false;
                    return;
                }
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((VoipActivityV2) this.A00).A3b();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationRepeat(Animator animator) {
        switch (this.A01) {
            case 4:
                super.onAnimationRepeat(animator);
                C59882zE r1 = (C59882zE) this.A00;
                if (!r1.A06.A0B) {
                    r1.A0H();
                    return;
                }
                return;
            case 5:
                Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationRepeat");
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A01) {
            case 2:
                ((View) this.A00).invalidate();
                return;
            case 5:
                Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationStart");
                AnonymousClass5MY r0 = ((VideoCallParticipantViewLayout) this.A00).A0F;
                if (r0 != null) {
                    VoipActivityV2 voipActivityV2 = ((C101144wn) r0).A00;
                    voipActivityV2.A22 = true;
                    if (voipActivityV2.A1d != null) {
                        voipActivityV2.A3S();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
