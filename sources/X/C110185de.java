package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.obwhatsapp.R;

/* renamed from: X.5de  reason: invalid class name and case insensitive filesystem */
public class C110185de extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06 = C13680ns.A0E();

    public C110185de(Context context) {
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.dimen05dd);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.dimen05dc);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.dimen05de);
        this.A01 = context.getResources().getColor(R.color.color05e9);
        this.A04 = context.getResources().getColor(R.color.color05eb);
        this.A03 = context.getResources().getColor(R.color.color05ea);
    }

    public final void A00(Canvas canvas, float f2, float f3) {
        int i2 = 0;
        do {
            int i3 = (this.A00 * i2) + 50;
            Paint paint = this.A06;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) this.A05);
            paint.setColor(this.A01);
            canvas.drawCircle(f2, f3, (float) i3, paint);
            i2++;
        } while (i2 < 62);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{this.A04, this.A03});
        float f2 = (float) this.A02;
        gradientDrawable.setCornerRadius(f2);
        gradientDrawable.setBounds(0, 0, width, height);
        gradientDrawable.draw(canvas);
        RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
        Path path = new Path();
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        canvas.clipPath(path);
        float f3 = (float) (height + 120);
        A00(canvas, 100.0f, f3);
        A00(canvas, (float) (width - 100), f3);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
