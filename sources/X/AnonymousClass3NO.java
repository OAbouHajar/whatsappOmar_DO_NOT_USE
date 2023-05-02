package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NO  reason: invalid class name */
public final class AnonymousClass3NO extends Animation {
    public final int A00;
    public final int A01;
    public final View A02;

    public AnonymousClass3NO(View view, int i2) {
        this.A00 = i2;
        this.A01 = view.getTop();
        this.A02 = view;
        setDuration(300);
    }

    public void applyTransformation(float f2, Transformation transformation) {
        int i2 = this.A01;
        int i3 = (int) (((float) i2) + (((float) (this.A00 - i2)) * f2));
        View view = this.A02;
        C004601z.A0b(view, i3 - view.getTop());
    }
}
