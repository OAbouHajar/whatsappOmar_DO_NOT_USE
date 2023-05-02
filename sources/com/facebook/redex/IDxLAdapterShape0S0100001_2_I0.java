package com.facebook.redex;

import X.AnonymousClass2PE;
import X.AnonymousClass2Tr;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

public class IDxLAdapterShape0S0100001_2_I0 extends AnimatorListenerAdapter {
    public float A00;
    public Object A01;
    public final int A02;

    public IDxLAdapterShape0S0100001_2_I0(Object obj, float f2, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = f2;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A02 != 0) {
            ((AnonymousClass2Tr) this.A01).A0C.setAlpha(this.A00);
            onAnimationEnd(animator);
            return;
        }
        ((View) this.A01).setX(this.A00);
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A02 == 0) {
            ((View) this.A01).setX(this.A00);
        } else if (this.A00 == 0.0f) {
            AnonymousClass2Tr r3 = (AnonymousClass2Tr) this.A01;
            r3.A0C.setVisibility(8);
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r3.A0G;
            AnonymousClass2PE r0 = voipCallControlBottomSheetV2.A0Z;
            if (r0 != null) {
                r0.A00(false);
            }
            voipCallControlBottomSheetV2.A1P(0.0f);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A02 != 0) {
            super.onAnimationStart(animator);
        } else if (this.A00 == 1.0f) {
            AnonymousClass2Tr r3 = (AnonymousClass2Tr) this.A01;
            r3.A0C.setVisibility(0);
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r3.A0G;
            AnonymousClass2PE r0 = voipCallControlBottomSheetV2.A0Z;
            if (r0 != null) {
                r0.A00(true);
            }
            voipCallControlBottomSheetV2.A1P(1.0f);
        }
    }
}
