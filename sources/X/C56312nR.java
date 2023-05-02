package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.2nR  reason: invalid class name and case insensitive filesystem */
public class C56312nR extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public final Paint A04;
    public final Paint A05 = C13700nu.A06(5);
    public final Path A06;
    public final Path A07;
    public final Rect A08;
    public final RectF A09;
    public final RectF A0A;
    public final float[] A0B;

    public C56312nR() {
        Paint A0E = C13680ns.A0E();
        this.A04 = A0E;
        this.A0A = AnonymousClass000.A0K();
        this.A08 = AnonymousClass000.A0J();
        this.A09 = AnonymousClass000.A0K();
        this.A07 = AnonymousClass000.A0I();
        this.A06 = AnonymousClass000.A0I();
        this.A0B = new float[8];
        C13690nt.A0y(A0E);
    }

    public void draw(Canvas canvas) {
        if (C89544cP.A02(this.A03)) {
            RectF rectF = this.A0A;
            float f2 = this.A02;
            canvas.drawRoundRect(rectF, f2, f2, this.A05);
            Paint paint = this.A04;
            if (paint.getStrokeWidth() != 0.0f) {
                RectF rectF2 = this.A09;
                float f3 = this.A01;
                canvas.drawRoundRect(rectF2, f3, f3, paint);
                return;
            }
            return;
        }
        canvas.drawPath(this.A07, this.A05);
        Paint paint2 = this.A04;
        if (paint2.getStrokeWidth() != 0.0f) {
            canvas.drawPath(this.A06, paint2);
        }
    }

    public int getOpacity() {
        return -1;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.A08, this.A02);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A0A;
        rectF.set(rect);
        this.A08.set(rect);
        RectF rectF2 = this.A09;
        float f2 = this.A00;
        rectF2.set(((float) rect.left) + f2, ((float) rect.top) + f2, ((float) rect.right) - f2, ((float) rect.bottom) - f2);
        int i2 = this.A03;
        if (!C89544cP.A02(i2)) {
            Path path = this.A07;
            float f3 = this.A02;
            float[] fArr = this.A0B;
            C89544cP.A01(fArr, f3, i2);
            path.reset();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            if (this.A04.getStrokeWidth() != 0.0f) {
                Path path2 = this.A06;
                C89544cP.A01(fArr, this.A01, this.A03);
                path2.reset();
                path2.addRoundRect(rectF2, fArr, Path.Direction.CW);
            }
        }
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
