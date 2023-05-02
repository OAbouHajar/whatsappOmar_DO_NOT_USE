package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.obwhatsapp.components.CircularRevealView;

/* renamed from: X.3NL  reason: invalid class name */
public class AnonymousClass3NL extends Animation {
    public boolean A00;
    public final /* synthetic */ CircularRevealView A01;

    public AnonymousClass3NL(CircularRevealView circularRevealView, boolean z2) {
        this.A01 = circularRevealView;
        this.A00 = z2;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        CircularRevealView circularRevealView = this.A01;
        if (this.A00) {
            f2 = 1.0f - f2;
        }
        circularRevealView.A00 = f2;
        circularRevealView.invalidate();
    }
}
