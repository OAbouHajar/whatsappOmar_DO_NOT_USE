package X;

import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;
import com.facebook.redex.IDxLAdapterShape1S0200000_2_I1;
import com.facebook.redex.IDxUListenerShape141S0100000_2_I1;

/* renamed from: X.4PW  reason: invalid class name */
public class AnonymousClass4PW {
    public void A00(AnonymousClass4TY r4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(new OvershootInterpolator(1.2f));
        ofFloat.addListener(new IDxLAdapterShape1S0200000_2_I1(this, 3, r4));
        ofFloat.addUpdateListener(new IDxUListenerShape141S0100000_2_I1(r4, 8));
        ofFloat.start();
    }
}
