package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;

/* renamed from: X.2VI  reason: invalid class name */
public class AnonymousClass2VI extends Drawable {
    public float A00;
    public float A01 = 1.0f;
    public float A02;
    public int A03;
    public boolean A04;
    public final int A05;
    public final Paint A06;
    public final Drawable A07;

    public AnonymousClass2VI(Context context, int i2) {
        Paint paint = new Paint(1);
        this.A06 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A00 = (context.getResources().getDisplayMetrics().density * 3.0f) / 4.0f;
        this.A05 = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        this.A07 = i2 != 0 ? AnonymousClass00T.A04(context, i2) : null;
    }

    public void A00(float f2, int i2) {
        this.A02 = f2;
        this.A03 = i2;
        this.A01 = 1.0f;
        invalidateSelf();
    }

    public void A01(int i2) {
        this.A03 = i2;
        this.A01 = 1.0f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float min = (float) ((Math.min(bounds.width(), bounds.height()) * 7) >> 4);
        if (this.A04) {
            Paint paint = this.A06;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.A03);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), min, paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-1);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A02 * 1.2f) / 2.0f, paint);
            if (Color.red(this.A03) > 240 && Color.green(this.A03) > 240 && Color.blue(this.A03) > 240) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.A00);
                int min2 = 255 - ((Math.min(Math.min(Color.red(this.A03), Color.green(this.A03)), Color.blue(this.A03)) - 240) * 3);
                paint.setColor(Color.argb(MotionEventCompat.ACTION_MASK, min2, min2, min2));
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A02 * 1.2f) / 2.0f, paint);
                return;
            }
            return;
        }
        if (this.A03 != 0) {
            Paint paint2 = this.A06;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(this.A03);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), this.A01 * min, paint2);
        }
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setBounds(bounds.centerX() - (drawable.getIntrinsicWidth() >> 1), bounds.centerY() - (drawable.getIntrinsicHeight() >> 1), bounds.centerX() + (drawable.getIntrinsicWidth() >> 1), bounds.centerY() + (drawable.getIntrinsicHeight() >> 1));
            drawable.draw(canvas);
        }
    }

    public int getIntrinsicHeight() {
        return this.A05;
    }

    public int getIntrinsicWidth() {
        return this.A05;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
