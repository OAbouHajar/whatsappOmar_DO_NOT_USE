package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;
import com.obwhatsapp.R;

/* renamed from: X.3L5  reason: invalid class name */
public class AnonymousClass3L5 extends Drawable {
    public final Paint A00 = C13680ns.A0E();
    public final /* synthetic */ AnonymousClass39Z A01;

    public AnonymousClass3L5(AnonymousClass39Z r2) {
        this.A01 = r2;
    }

    public void draw(Canvas canvas) {
        AnonymousClass39Z r3 = this.A01;
        if (r3.A00 > 0.0f) {
            int A002 = AnonymousClass00T.A00(r3.A0C.getContext(), R.color.color0189);
            int i2 = (A002 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (((float) (A002 >> 24)) * r3.A00)) << 24);
            Paint paint = this.A00;
            paint.setColor(i2);
            canvas.drawRect(getBounds(), paint);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
