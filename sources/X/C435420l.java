package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;

/* renamed from: X.20l  reason: invalid class name and case insensitive filesystem */
public class C435420l extends Drawable {
    public final float A00;
    public final Paint A01 = new Paint();
    public final int[] A02;

    public C435420l(int[] iArr, float f2) {
        this.A02 = iArr;
        this.A00 = f2;
    }

    public void draw(Canvas canvas) {
        int width = getBounds().width();
        int height = getBounds().height();
        Paint paint = this.A01;
        paint.setTextSize(((float) width) * this.A00);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(MotionEventCompat.ACTION_MASK);
        paint.setTextAlign(Paint.Align.CENTER);
        int i2 = width >> 1;
        int descent = (int) (((float) (height >> 1)) - ((paint.descent() + paint.ascent()) / 2.0f));
        int[] iArr = this.A02;
        StringBuilder sb = new StringBuilder();
        for (int appendCodePoint : iArr) {
            sb.appendCodePoint(appendCodePoint);
        }
        String obj = sb.toString();
        if (!AnonymousClass0T6.A00(paint, obj)) {
            obj = "□";
        }
        canvas.drawText(obj, (float) i2, (float) descent, paint);
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i2) {
        this.A01.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }
}
