package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2VI;
import X.C49112Rc;
import android.animation.ValueAnimator;
import com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView;

public class IDxUListenerShape0S0101001_2_I0 implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public int A01;
    public Object A02;
    public final int A03;

    public IDxUListenerShape0S0101001_2_I0(C49112Rc r1, float f2, int i2, int i3) {
        this.A03 = i3;
        this.A02 = r1;
        this.A00 = f2;
        this.A01 = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass2VI r0;
        int i2 = this.A03;
        float f2 = this.A00;
        int i3 = this.A01;
        TitleBarView titleBarView = ((C49112Rc) this.A02).A0H;
        float A032 = AnonymousClass000.A03(valueAnimator);
        switch (i2) {
            case 0:
                r0 = titleBarView.A0B;
                break;
            case 1:
                r0 = titleBarView.A0D;
                break;
            default:
                r0 = titleBarView.A0C;
                break;
        }
        r0.A02 = f2;
        r0.A03 = i3;
        r0.A01 = A032;
        r0.invalidateSelf();
    }
}
