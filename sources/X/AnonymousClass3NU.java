package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NU  reason: invalid class name */
public class AnonymousClass3NU extends Animation {
    public final int A00;
    public final Drawable A01;
    public final ViewGroup A02;

    public AnonymousClass3NU(Drawable drawable, ViewGroup viewGroup, int i2) {
        this.A02 = viewGroup;
        this.A00 = i2;
        this.A01 = drawable;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        int i2 = this.A00;
        int i3 = i2 - ((int) (((float) i2) * f2));
        ViewGroup viewGroup = this.A02;
        Drawable background = viewGroup.getBackground();
        if (!(background instanceof AnonymousClass3LG)) {
            return;
        }
        if (f2 == 1.0f) {
            AnonymousClass3LG.A00(this.A01, viewGroup);
            return;
        }
        AnonymousClass3LG r1 = (AnonymousClass3LG) background;
        r1.A00 = i3;
        r1.invalidateSelf();
    }

    public boolean willChangeBounds() {
        return false;
    }
}
