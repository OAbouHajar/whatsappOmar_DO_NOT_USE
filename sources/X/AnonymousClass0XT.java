package X;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* renamed from: X.0XT  reason: invalid class name */
public class AnonymousClass0XT implements TimeInterpolator {
    public final Interpolator A00 = C04240Lt.A00(0.5f, 0.0f, 0.5f, 1.0f);

    public float getInterpolation(float f2) {
        return f2 < 0.5f ? this.A00.getInterpolation(f2 * 2.0f) : 1.0f - this.A00.getInterpolation((f2 - 0.5f) * 2.0f);
    }
}
