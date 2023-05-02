package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.3LC  reason: invalid class name */
public class AnonymousClass3LC extends Drawable {
    public Rect A00 = new Rect();
    public final int A01;
    public final Paint A02;
    public final Path A03;
    public final Path A04;
    public final Path A05;
    public final Path A06;

    public AnonymousClass3LC(int i2, int i3) {
        this.A01 = i2;
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setColor(i3);
        this.A05 = A00(C796240o.TOP_LEFT, i2);
        this.A06 = A00(C796240o.TOP_RIGHT, i2);
        this.A03 = A00(C796240o.BOTTOM_LEFT, i2);
        this.A04 = A00(C796240o.BOTTOM_RIGHT, i2);
    }

    public static Path A00(C796240o r5, int i2) {
        Region region = new Region(((int) r5.left) * i2, ((int) r5.f153top) * i2, ((int) r5.right) * i2, ((int) r5.bottom) * i2);
        Path path = new Path();
        float f2 = (float) i2;
        path.addCircle(f2, f2, f2, Path.Direction.CW);
        Region region2 = new Region();
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region.getBoundaryPath();
    }

    public void draw(Canvas canvas) {
        int width = getBounds().width();
        int i2 = this.A01 << 1;
        Rect rect = this.A00;
        float f2 = (float) (((width - i2) - rect.left) - rect.right);
        int height = getBounds().height() - i2;
        Rect rect2 = this.A00;
        int i3 = rect2.top;
        canvas.translate((float) rect2.left, (float) i3);
        Path path = this.A05;
        Paint paint = this.A02;
        canvas.drawPath(path, paint);
        path.close();
        canvas.translate(f2, 0.0f);
        Path path2 = this.A06;
        canvas.drawPath(path2, paint);
        path2.close();
        canvas.translate(0.0f, (float) ((height - i3) - rect2.bottom));
        Path path3 = this.A04;
        canvas.drawPath(path3, paint);
        path3.close();
        canvas.translate(-f2, 0.0f);
        Path path4 = this.A03;
        canvas.drawPath(path4, paint);
        path4.close();
    }

    public int getOpacity() {
        return -2;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
