package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NI  reason: invalid class name */
public class AnonymousClass3NI extends Animation {
    public final /* synthetic */ C30031bd A00;

    public AnonymousClass3NI(C30031bd r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        C30031bd r1 = this.A00;
        r1.A00 = 1.0f - f2;
        r1.invalidate();
    }
}
