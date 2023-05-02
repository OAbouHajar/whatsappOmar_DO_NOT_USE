package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.2d7  reason: invalid class name and case insensitive filesystem */
public class C52092d7 extends Drawable {
    public int A00;
    public final Paint A01 = new Paint(1);
    public final Path A02 = new Path();
    public final Rect A03 = new Rect();
    public final RectF A04 = new RectF();

    public C52092d7(int i2) {
        this.A00 = i2;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        Rect rect = this.A03;
        int max = Math.max(0, (width - rect.left) - rect.right);
        int max2 = Math.max(0, (bounds.height() - rect.top) - rect.bottom);
        Path path = this.A02;
        path.rewind();
        if (max > max2) {
            int i2 = max2 >> 1;
            float f2 = (float) i2;
            path.moveTo(f2, 0.0f);
            path.lineTo((float) (max - i2), 0.0f);
            RectF rectF = this.A04;
            float f3 = (float) max2;
            rectF.set((float) (max - max2), 0.0f, (float) max, f3);
            path.arcTo(rectF, -90.0f, 180.0f);
            path.lineTo(f2, f3);
            rectF.set(0.0f, 0.0f, f3, f3);
            path.arcTo(rectF, 90.0f, 180.0f);
        } else if (max < max2) {
            int i3 = max >> 1;
            float f4 = (float) i3;
            path.moveTo(0.0f, f4);
            path.lineTo(0.0f, (float) (max2 - i3));
            RectF rectF2 = this.A04;
            float f5 = (float) max;
            rectF2.set(0.0f, (float) (max2 - max), f5, (float) max2);
            path.arcTo(rectF2, -180.0f, -180.0f);
            path.lineTo(f5, f4);
            rectF2.set(0.0f, 0.0f, f5, f5);
            path.arcTo(rectF2, 0.0f, -180.0f);
        } else {
            RectF rectF3 = this.A04;
            rectF3.set(0.0f, 0.0f, (float) max, (float) max2);
            path.addOval(rectF3, Path.Direction.CW);
        }
        path.close();
        path.setFillType(Path.FillType.WINDING);
        Paint paint = this.A01;
        paint.setColor(this.A00);
        paint.setStyle(Paint.Style.FILL);
        canvas.translate((float) (bounds.left + rect.left), (float) (bounds.top + rect.top));
        canvas.drawPath(path, paint);
        canvas.translate((float) (-(bounds.left + rect.left)), (float) (-(bounds.top + rect.top)));
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return super.isStateful();
    }

    public boolean onStateChange(int[] iArr) {
        return false;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
