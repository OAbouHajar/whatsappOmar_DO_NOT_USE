package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.3L3  reason: invalid class name */
public class AnonymousClass3L3 extends Drawable {
    public final Paint A00;

    public AnonymousClass3L3() {
        Paint A0E = C13680ns.A0E();
        this.A00 = A0E;
        C13690nt.A0n(285212672, A0E);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (bounds.width() >> 1), this.A00);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
