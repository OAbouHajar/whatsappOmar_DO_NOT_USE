package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.0HY  reason: invalid class name */
public class AnonymousClass0HY extends C08360dV {
    public AnonymousClass0SI A00;
    public final Paint A01;
    public final Path A02;
    public final RectF A03 = AnonymousClass000.A0K();
    public final C05320Qf A04;
    public final float[] A05;

    public AnonymousClass0HY(AnonymousClass0Ak r3, C05320Qf r4) {
        super(r3, r4);
        AnonymousClass0AR r1 = new AnonymousClass0AR();
        this.A01 = r1;
        this.A05 = new float[8];
        this.A02 = AnonymousClass000.A0I();
        this.A04 = r4;
        r1.setAlpha(0);
        r1.setStyle(Paint.Style.FILL);
        r1.setColor(r4.A04);
    }

    public void A08(Canvas canvas, Matrix matrix, int i2) {
        C05320Qf r2 = this.A04;
        int alpha = Color.alpha(r2.A04);
        if (alpha != 0) {
            AnonymousClass0SI r0 = this.A0L.A02;
            int A0D = (int) ((((float) i2) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (r0 == null ? 100 : AnonymousClass000.A0D(r0.A08())))) / 100.0f) * 255.0f);
            Paint paint = this.A01;
            paint.setAlpha(A0D);
            AnonymousClass000.A13(paint, this.A00);
            if (A0D > 0) {
                float[] fArr = this.A05;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f2 = (float) r2.A06;
                fArr[2] = f2;
                fArr[3] = 0.0f;
                fArr[4] = f2;
                float f3 = (float) r2.A05;
                fArr[5] = f3;
                fArr[6] = 0.0f;
                fArr[7] = f3;
                matrix.mapPoints(fArr);
                Path path = this.A02;
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                AnonymousClass000.A11(canvas, paint, path, fArr[0], fArr[1]);
            }
        }
    }

    public void A4l(AnonymousClass0UV r3, Object obj) {
        super.A4l(r3, obj);
        if (obj == C13480m6.A00) {
            this.A00 = r3 == null ? null : new AnonymousClass0HF(r3, (Object) null);
        }
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        super.AAB(matrix, rectF, z2);
        RectF rectF2 = this.A03;
        C05320Qf r1 = this.A04;
        rectF2.set(0.0f, 0.0f, (float) r1.A06, (float) r1.A05);
        this.A08.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
