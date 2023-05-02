package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NS  reason: invalid class name */
public class AnonymousClass3NS extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C94524l3 A02;

    public AnonymousClass3NS(C94524l3 r1, int i2, int i3) {
        this.A02 = r1;
        this.A01 = i2;
        this.A00 = i3;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        C614739b r3;
        if (f2 == 1.0f) {
            r3 = this.A02.A01;
            r3.A02.getLayoutParams().height = this.A01;
        } else {
            C94524l3 r1 = this.A02;
            r3 = r1.A01;
            r3.A02.getLayoutParams().height = AnonymousClass000.A06(f2, this.A00, r1.A00);
        }
        r3.A02.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
