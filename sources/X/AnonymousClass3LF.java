package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.3LF  reason: invalid class name */
public class AnonymousClass3LF extends InsetDrawable {
    public int A00 = -1;
    public final Drawable A01;
    public final boolean A02;

    public AnonymousClass3LF(Drawable drawable, boolean z2) {
        super(drawable, 0);
        this.A01 = drawable;
        this.A02 = z2;
    }

    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect bounds = getBounds();
        int i4 = this.A00;
        if (i4 >= 0) {
            int width = (i4 - bounds.width()) >> 1;
            boolean z2 = this.A02;
            Drawable drawable = this.A01;
            int i5 = bounds.left;
            if (z2) {
                i2 = bounds.top;
                i3 = bounds.right;
                width <<= 1;
            } else {
                i5 -= width;
                i2 = bounds.top;
                i3 = bounds.right;
            }
            drawable.setBounds(i5, i2, i3 + width, bounds.bottom);
            drawable.draw(canvas);
            return;
        }
        this.A01.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
        super.draw(canvas);
    }
}
