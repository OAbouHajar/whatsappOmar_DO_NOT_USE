package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NX  reason: invalid class name */
public class AnonymousClass3NX extends Animation {
    public final int A00;
    public final int A01;
    public final View A02;
    public final /* synthetic */ AnonymousClass291 A03;

    public AnonymousClass3NX(View view, AnonymousClass291 r3, int i2) {
        this.A03 = r3;
        this.A02 = view;
        this.A01 = i2;
        this.A00 = view.getHeight();
    }

    public void applyTransformation(float f2, Transformation transformation) {
        int A06 = AnonymousClass000.A06(f2, this.A01, this.A00);
        View view = this.A02;
        view.getLayoutParams().height = A06;
        view.requestLayout();
        AnonymousClass291 r2 = this.A03;
        AnonymousClass291.A02(r2, (float) (A06 + r2.A0S.getHeight()), false);
    }

    public boolean willChangeBounds() {
        return true;
    }
}
