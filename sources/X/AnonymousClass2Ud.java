package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;

/* renamed from: X.2Ud  reason: invalid class name */
public class AnonymousClass2Ud {
    public static ValueAnimator A00(View view, Runnable runnable, int i2) {
        int height = view.getHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{height, i2});
        ofInt.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(view, 22));
        ofInt.setInterpolator(new C018508q());
        ofInt.setDuration((long) (Math.abs(height - i2) >> 3));
        ofInt.addListener(new IDxLAdapterShape3S0100000_2_I0(runnable, 24));
        return ofInt;
    }
}
