package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.0AZ  reason: invalid class name */
public class AnonymousClass0AZ extends Drawable {
    public boolean A00;
    public final Paint A01;
    public final Path A02 = AnonymousClass000.A0I();
    public final RectF A03;
    public final float[] A04;

    public AnonymousClass0AZ() {
        Paint paint = new Paint();
        this.A01 = paint;
        this.A03 = AnonymousClass000.A0K();
        this.A04 = new float[8];
        this.A00 = true;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public void draw(Canvas canvas) {
        if (this.A00) {
            RectF rectF = this.A03;
            float f2 = this.A04[0];
            canvas.drawRoundRect(rectF, f2, f2, this.A01);
            return;
        }
        canvas.drawPath(this.A02, this.A01);
    }

    public int getOpacity() {
        float[] fArr = this.A04;
        int length = fArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (Float.compare(fArr[i2], 0.0f) == 0) {
                    break;
                }
                i2++;
            } else {
                return this.A01.getAlpha() != 255 ? -3 : -1;
            }
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A03;
        rectF.set(rect);
        if (!this.A00) {
            Path path = this.A02;
            path.reset();
            path.addRoundRect(rectF, this.A04, Path.Direction.CW);
        }
    }

    public void setAlpha(int i2) {
        Paint paint = this.A01;
        if (i2 != paint.getAlpha()) {
            paint.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
