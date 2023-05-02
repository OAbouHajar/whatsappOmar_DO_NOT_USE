package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.4SJ  reason: invalid class name */
public final class AnonymousClass4SJ {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public boolean A04;
    public final Paint A05 = new Paint(1);
    public final Paint A06 = new Paint(1);
    public final Path A07 = new Path();
    public final Path A08 = new Path();
    public final RectF A09 = new RectF();
    public final RectF A0A = new RectF();
    public final View A0B;
    public final float[] A0C = new float[8];

    public AnonymousClass4SJ(View view) {
        this.A0B = view;
    }

    public void A00(float[] fArr, float f2, float f3, float f4, int i2, int i3, int i4) {
        this.A03 = i4;
        this.A02 = f3;
        Paint paint = this.A06;
        paint.setColor(i2);
        if (i2 == 0) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        int i5 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        Paint paint2 = this.A05;
        if (i5 != 0) {
            paint2.setColor(i3);
        } else {
            paint2.setColor(0);
        }
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f2);
        if (f2 > 0.0f && fArr != null) {
            paint2.setPathEffect(new DashPathEffect(fArr, f4));
        }
        Path path = this.A08;
        path.setFillType(Path.FillType.EVEN_ODD);
        float f5 = f2 / 2.0f;
        this.A00 = f5;
        this.A01 = this.A02 - f5;
        path.reset();
    }
}
