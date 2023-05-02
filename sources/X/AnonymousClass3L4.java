package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.3L4  reason: invalid class name */
public class AnonymousClass3L4 extends Drawable {
    public final C455829l A00;

    public AnonymousClass3L4(C455829l r1) {
        this.A00 = r1;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        C455829l r3 = this.A00;
        float A02 = r3.A02() / 2.0f;
        r3.A0Q(new RectF(), ((float) bounds.left) + A02, ((float) bounds.top) + A02, ((float) bounds.right) - A02, ((float) bounds.bottom) - A02);
        r3.A0P(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
