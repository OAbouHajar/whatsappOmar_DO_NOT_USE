package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NQ  reason: invalid class name */
public class AnonymousClass3NQ extends Animation {
    public final int A00;
    public final ViewGroup A01;

    public AnonymousClass3NQ(ViewGroup viewGroup, int i2) {
        this.A01 = viewGroup;
        this.A00 = i2;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        int i2 = (int) (((float) this.A00) * f2);
        Drawable background = this.A01.getBackground();
        if (background instanceof AnonymousClass3LG) {
            AnonymousClass3LG r1 = (AnonymousClass3LG) background;
            r1.A00 = i2;
            r1.invalidateSelf();
        }
    }

    public boolean willChangeBounds() {
        return false;
    }
}
