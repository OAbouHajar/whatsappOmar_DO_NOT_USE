package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;

/* renamed from: X.5dk  reason: invalid class name and case insensitive filesystem */
public class C110245dk extends BulletSpan {
    public static Path A01;
    public final int A00;

    public C110245dk(int i2) {
        super(i2);
        this.A00 = i2;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, boolean z2, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i7) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            if (canvas.isHardwareAccelerated()) {
                if (A01 == null) {
                    Path path = new Path();
                    A01 = path;
                    path.addCircle(0.0f, 0.0f, 7.2000003f, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate((float) (i2 + (i3 * 6) + 6), ((float) (i4 + i6)) / 2.0f);
                canvas.drawPath(A01, paint);
                canvas.restore();
            } else {
                canvas.drawCircle((float) (i2 + (i3 * 6) + 6), ((float) (i4 + i6)) / 2.0f, 6.0f, paint);
            }
            paint.setStyle(style);
        }
    }

    public int getLeadingMargin(boolean z2) {
        return this.A00 + 12;
    }
}
