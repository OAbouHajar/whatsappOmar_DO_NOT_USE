package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.location.Location;

/* renamed from: X.0IW  reason: invalid class name */
public class AnonymousClass0IW extends AnonymousClass0VB {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public boolean A0D;
    public final Paint A0E = new Paint(1);

    public AnonymousClass0IW(AnonymousClass074 r6) {
        super(r6);
        float f2 = this.A05;
        this.A08 = 12.0f * f2;
        float f3 = 37.0f * f2;
        this.A05 = f3;
        this.A00 = 0.5f * f2;
        this.A0B = f2 * 2.0f;
        this.A07 = 5.0f * f2;
        this.A09 = 8.0f * f2;
        this.A0A = f2 * 3.0f;
        this.A03 = 5;
        this.A02 = 3.0f;
        this.A03 = ((f2 * 48.0f) - f3) / 2.0f;
    }

    public int A00(float f2, float f3) {
        float f4 = this.A04;
        float f5 = this.A05;
        float f6 = f4 - f5;
        if (f2 >= f6 && f2 <= f4) {
            float f7 = this.A06;
            if (f3 >= f7 && f3 <= f7 + f5) {
                this.A0D = true;
                return 2;
            }
        }
        float f8 = this.A03;
        if (f2 >= f6 - f8 && f2 <= f4 + f8) {
            float f9 = this.A06;
            if (f3 >= f9 - f8 && f3 <= f9 + f5 + f8) {
                this.A0D = true;
                return 1;
            }
        }
        this.A0D = false;
        return 0;
    }

    public void A08(float f2, float f3) {
        A02();
    }

    public void A09(float f2, float f3) {
        this.A0D = false;
        A02();
    }

    public boolean A0B(float f2, float f3) {
        AnonymousClass074 r6 = this.A09;
        Location location = r6.A0V.A00;
        if (location == null) {
            return true;
        }
        r6.A08(AnonymousClass0T2.A01(new AnonymousClass020(location.getLatitude(), location.getLongitude()), 15.0f));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r6 <= (r1 + r2)) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(float r5, float r6, float r7, float r8) {
        /*
            r4 = this;
            boolean r0 = r4.A0D
            r3 = 0
            if (r0 == 0) goto L_0x0025
            float r1 = r4.A04
            float r2 = r4.A05
            float r0 = r1 - r2
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001e
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x001e
            float r1 = r4.A06
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x001e
            float r1 = r1 + r2
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
        L_0x001e:
            r4.A0D = r3
            r4.A02()
            r0 = 1
            return r0
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IW.A0C(float, float, float, float):boolean");
    }

    public void A0D(Canvas canvas) {
        AnonymousClass074 r1 = this.A09;
        float f2 = this.A08;
        float width = (((float) r1.A0R.getWidth()) - f2) - ((float) r1.A05);
        this.A04 = width;
        float f3 = f2 + ((float) r1.A06);
        this.A06 = f3;
        float f4 = this.A05;
        float f5 = f4 / 2.0f;
        this.A01 = width - f5;
        this.A02 = f3 + f5;
        float f6 = this.A09;
        this.A0C = this.A0A + f6;
        Paint paint = this.A0E;
        paint.setStyle(Paint.Style.FILL);
        int i2 = -1;
        if (this.A0D) {
            i2 = -2236963;
        }
        paint.setColor(i2);
        paint.setAlpha(230);
        float f7 = this.A04;
        float f8 = this.A06;
        Canvas canvas2 = canvas;
        canvas2.drawRect(f7 - f4, f8, f7, f8 + f4, paint);
        paint.setColor(-7829368);
        canvas.drawCircle(this.A01, this.A02, this.A07, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.A0B);
        canvas.drawCircle(this.A01, this.A02, f6, paint);
        float f9 = this.A01;
        float f10 = this.A02;
        canvas2.drawLine(f9, f10 - f6, f9, f10 - this.A0C, paint);
        float f11 = this.A01;
        float f12 = this.A02;
        canvas2.drawLine(f11, f12 + f6, f11, f12 + this.A0C, paint);
        float f13 = this.A01;
        float f14 = this.A02;
        canvas2.drawLine(f13 - f6, f14, f13 - this.A0C, f14, paint);
        float f15 = this.A01;
        float f16 = this.A02;
        canvas2.drawLine(f15 + f6, f16, f15 + this.A0C, f16, paint);
        paint.setStrokeWidth(this.A00);
        paint.setColor(-3355444);
        float f17 = this.A04;
        float f18 = this.A06;
        canvas2.drawRect(f17 - f4, f18, f17, f18 + f4, paint);
    }
}
