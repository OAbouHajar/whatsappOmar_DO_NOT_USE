package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NT  reason: invalid class name */
public class AnonymousClass3NT extends Animation {
    public final int A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass4RF A02;

    public AnonymousClass3NT(View view, AnonymousClass4RF r3, int i2) {
        this.A02 = r3;
        this.A01 = i2;
        this.A00 = view.getHeight();
    }

    public void applyTransformation(float f2, Transformation transformation) {
        int A06 = AnonymousClass000.A06(f2, this.A01, this.A00);
        AnonymousClass4RF r2 = this.A02;
        View view = r2.A01;
        view.getLayoutParams().height = A06;
        view.requestLayout();
        r2.A00((float) A06);
    }

    public boolean willChangeBounds() {
        return true;
    }
}
