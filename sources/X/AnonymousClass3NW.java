package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NW  reason: invalid class name */
public class AnonymousClass3NW extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C56752oS A03;

    public AnonymousClass3NW(View view, C56752oS r2, int i2, int i3) {
        this.A03 = r2;
        this.A02 = view;
        this.A00 = i2;
        this.A01 = i3;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        View view = this.A02;
        if (i2 == 0) {
            view.getLayoutParams().height = -2;
        } else {
            view.getLayoutParams().height = AnonymousClass000.A06(f2, this.A01, this.A00);
        }
        view.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
