package X;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3NR  reason: invalid class name */
public class AnonymousClass3NR extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ C94454kw A02;

    public AnonymousClass3NR(Drawable drawable, C94454kw r2, int i2) {
        this.A02 = r2;
        this.A00 = i2;
        this.A01 = drawable;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        int i2 = this.A00;
        int i3 = i2 - ((int) (((float) i2) * f2));
        C42821yj r2 = this.A02.A03;
        Drawable background = r2.A08.getBackground();
        if (!(background instanceof AnonymousClass3LG)) {
            return;
        }
        if (f2 == 1.0f) {
            AnonymousClass3LG.A00(this.A01, r2.A08);
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
