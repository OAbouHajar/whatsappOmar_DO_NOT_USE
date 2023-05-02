package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.25n  reason: invalid class name and case insensitive filesystem */
public class C447825n extends InsetDrawable {
    public boolean A00;

    public C447825n(Drawable drawable, boolean z2) {
        super(drawable, 0);
        this.A00 = z2;
    }

    public void draw(Canvas canvas) {
        if (!this.A00) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(-1.0f, 1.0f, getBounds().exactCenterX(), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        boolean padding = super.getPadding(rect);
        if (this.A00) {
            int i2 = rect.right;
            rect.right = rect.left;
            rect.left = i2;
        }
        return padding;
    }
}
