package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NJ  reason: invalid class name */
public class AnonymousClass3NJ extends Animation {
    public final /* synthetic */ AnonymousClass39Z A00;

    public AnonymousClass3NJ(AnonymousClass39Z r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        AnonymousClass39Z r1 = this.A00;
        r1.A00 = 1.0f - f2;
        r1.A0B.invalidate();
    }
}
