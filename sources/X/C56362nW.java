package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: X.2nW  reason: invalid class name and case insensitive filesystem */
public class C56362nW extends GradientDrawable {
    public int A00;
    public final Paint A01;
    public final RectF A02 = AnonymousClass000.A0K();

    public C56362nW() {
        Paint A0E = C13680ns.A0E();
        this.A01 = A0E;
        A0E.setStyle(Paint.Style.FILL_AND_STROKE);
        A0E.setColor(-1);
        A0E.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public void A00(float f2, float f3, float f4, float f5) {
        RectF rectF = this.A02;
        if (f2 != rectF.left || f3 != rectF.top || f4 != rectF.right || f5 != rectF.bottom) {
            rectF.set(f2, f3, f4, f5);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        Canvas canvas2 = canvas;
        if (callback instanceof View) {
            ((View) callback).setLayerType(2, (Paint) null);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            float width = (float) canvas.getWidth();
            float height = (float) canvas.getHeight();
            this.A00 = i2 >= 21 ? canvas2.saveLayer(0.0f, 0.0f, width, height, (Paint) null) : canvas2.saveLayer(0.0f, 0.0f, width, height, (Paint) null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.A02, this.A01);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.A00);
        }
    }
}
