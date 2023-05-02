package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.0IV  reason: invalid class name */
public class AnonymousClass0IV extends AnonymousClass0VB {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public Bitmap A08;
    public final float A09;

    public AnonymousClass0IV(AnonymousClass074 r16) {
        super(r16);
        float f2 = this.A05;
        float f3 = f2 * 12.0f;
        this.A05 = f3;
        this.A00 = 0.4f * f2;
        float f4 = 16.0f * f2;
        this.A03 = f4;
        this.A06 = f3;
        this.A07 = 4.8f * f2;
        this.A04 = 1.6f * f2;
        this.A09 = f2 * 44.0f;
        this.A03 = 5;
        this.A02 = 1.0f;
        int ceil = (int) Math.ceil((double) (f4 * 1.08f * 2.0f));
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
        this.A08 = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        float f5 = ((float) ceil) / 2.0f;
        float f6 = this.A04;
        float f7 = f5 - f6;
        float f8 = f6 + f5;
        RectF rectF = new RectF(f7, f7, f8, f8);
        float f9 = 1.08f * this.A03;
        RadialGradient radialGradient = new RadialGradient(f5, f5, f9, new int[]{570425344, 570425344, 0}, new float[]{0.9259259f, 0.9259259f, 1.0f}, Shader.TileMode.CLAMP);
        Path A0I = AnonymousClass000.A0I();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setShader(radialGradient);
        canvas.drawCircle(f5, f5, f9, paint);
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(style);
        paint.setColor(-2046820353);
        canvas.drawCircle(f5, f5, this.A03, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-6118750);
        paint.setStrokeWidth(this.A00);
        canvas.drawCircle(f5, f5, this.A03, paint);
        paint.setFlags(1);
        paint.setStyle(style);
        paint.setColor(-1365724);
        A0I.reset();
        A0I.moveTo(f5 - this.A07, f5);
        A0I.lineTo(f5 - this.A04, f5);
        A0I.addArc(rectF, 180.0f, 90.0f);
        A0I.lineTo(f5, f5 - this.A06);
        AnonymousClass000.A11(canvas, paint, A0I, f5 - this.A07, f5);
        paint.setStyle(style);
        paint.setColor(-2811114);
        A0I.reset();
        A0I.moveTo(this.A07 + f5, f5);
        A0I.lineTo(this.A04 + f5, f5);
        A0I.addArc(rectF, 0.0f, -90.0f);
        A0I.lineTo(f5, f5 - this.A06);
        AnonymousClass000.A11(canvas, paint, A0I, this.A07 + f5, f5);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-4013374);
        A0I.reset();
        A0I.moveTo(f5 - this.A07, f5);
        A0I.lineTo(f5 - this.A04, f5);
        A0I.addArc(rectF, 180.0f, -90.0f);
        A0I.lineTo(f5, this.A06 + f5);
        AnonymousClass000.A11(canvas, paint, A0I, f5 - this.A07, f5);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-2434342);
        A0I.reset();
        A0I.moveTo(this.A07 + f5, f5);
        A0I.lineTo(this.A04 + f5, f5);
        A0I.addArc(rectF, 0.0f, 90.0f);
        A0I.lineTo(f5, this.A06 + f5);
        AnonymousClass000.A11(canvas, paint, A0I, this.A07 + f5, f5);
    }

    public int A00(float f2, float f3) {
        float f4 = this.A01;
        float f5 = this.A03;
        if (f2 >= f4 - f5 && f2 <= f4 + f5) {
            float f6 = this.A02;
            if (f3 >= f6 - f5 && f3 <= f6 + f5) {
                return 2;
            }
        }
        float f7 = this.A09;
        if (f2 < f4 - f7 || f2 > f4 + f7) {
            return 0;
        }
        float f8 = this.A02;
        return (f3 < f8 - f7 || f3 > f8 + f7) ? 0 : 1;
    }

    public void A03() {
        float f2 = this.A05;
        float f3 = ((float) 0) + f2;
        float f4 = f2 + ((float) this.A09.A06);
        float f5 = this.A03;
        this.A01 = f3 + f5;
        this.A02 = f4 + f5;
    }

    public boolean A0B(float f2, float f3) {
        AnonymousClass074 r2 = this.A09;
        AnonymousClass076 r0 = new AnonymousClass076();
        r0.A00 = 0.0f;
        r2.A08(r0);
        return true;
    }

    public void A0D(Canvas canvas) {
        canvas.save();
        float f2 = this.A09.A0S.A00.A0R.A0A;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        }
        canvas.rotate(f2, this.A01, this.A02);
        Bitmap bitmap = this.A08;
        float f3 = this.A01;
        float f4 = this.A03;
        canvas.drawBitmap(bitmap, f3 - f4, this.A02 - f4, (Paint) null);
        canvas.restore();
    }
}
