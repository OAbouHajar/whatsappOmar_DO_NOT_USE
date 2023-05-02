package X;

import android.animation.TimeInterpolator;

/* renamed from: X.4fE  reason: invalid class name and case insensitive filesystem */
public class C91014fE implements TimeInterpolator {
    public final AnonymousClass44E A00;

    public C91014fE(AnonymousClass44E r1) {
        this.A00 = r1;
    }

    public float getInterpolation(float f2) {
        if (((double) f2) > 0.5d) {
            return Math.min(f2, (float) AnonymousClass44E.A00(this.A00));
        }
        return 0.0f;
    }
}
