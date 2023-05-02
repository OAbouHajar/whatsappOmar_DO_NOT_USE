package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.3L2  reason: invalid class name */
public class AnonymousClass3L2 extends Drawable {
    public final Paint A00;

    public AnonymousClass3L2(int i2) {
        Paint A0E = C13680ns.A0E();
        this.A00 = A0E;
        if (A0E.getColor() != i2) {
            A0E.setColor(i2);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawRect(getBounds(), this.A00);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
