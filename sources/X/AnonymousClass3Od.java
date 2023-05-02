package X;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: X.3Od  reason: invalid class name */
public class AnonymousClass3Od extends Scroller {
    public float A00;

    public AnonymousClass3Od(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public void startScroll(int i2, int i3, int i4, int i5, int i6) {
        float f2 = this.A00;
        if (f2 != 0.0f) {
            i6 = (int) (f2 * ((float) i6));
        }
        super.startScroll(i2, i3, i4, i5, i6);
    }
}
