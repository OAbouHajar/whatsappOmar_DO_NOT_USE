package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.location.Location;

/* renamed from: X.0IY  reason: invalid class name */
public class AnonymousClass0IY extends AnonymousClass0VB implements AnonymousClass075 {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final Paint A0B = new Paint(1);
    public final Path A0C = AnonymousClass000.A0I();
    public final C05150Pm A0D = new C05150Pm();
    public final AnonymousClass0WR A0E;

    public AnonymousClass0IY(AnonymousClass074 r5) {
        super(r5);
        this.A03 = 3;
        this.A02 = 0.0f;
        float f2 = this.A05;
        this.A08 = 8.0f * f2;
        float f3 = 11.0f * f2;
        this.A0A = f3;
        this.A09 = f3 + 1.5f;
        this.A07 = 12.0f * f2;
        this.A06 = 10.0f * f2;
        float f4 = f2 * 24.0f;
        this.A05 = f4;
        this.A04 = f4 * 2.0f;
        AnonymousClass0WR A002 = AnonymousClass0WR.A00(0.0f, 1.0f);
        this.A0E = A002;
        A002.A05 = -1;
        A002.A07(this);
        A002.A07 = 2100;
    }

    public void A0D(Canvas canvas) {
        Location location = this.A09.A0V.A00;
        if (location != null) {
            float A022 = AnonymousClass000.A02(this.A04, location.getAccuracy(), this.A05);
            Paint paint = this.A0B;
            paint.setColor(-12888163);
            paint.setAlpha((int) ((1.0f - this.A01) * 255.0f));
            C06540Wn r11 = this.A0A;
            C05150Pm r7 = this.A0D;
            r11.A07(r7);
            double A012 = C06540Wn.A01(location.getLongitude());
            double A002 = C06540Wn.A00(location.getLatitude());
            float[] fArr = this.A0C;
            r11.A09(fArr, A012 + ((double) ((int) Math.ceil(r7.A01 - A012))), A002);
            float f2 = fArr[0];
            float f3 = fArr[1];
            Canvas canvas2 = canvas;
            canvas2.drawCircle(f2, f3, A022 * this.A01, paint);
            paint.setColor(-3355444);
            float f4 = this.A09;
            canvas2.drawCircle(f2, f3, f4, paint);
            paint.setColor(-1);
            canvas2.drawCircle(f2, f3, this.A0A, paint);
            paint.setColor(-12888163);
            paint.setAlpha((int) (this.A00 * 255.0f));
            canvas2.drawCircle(f2, f3, this.A00 * this.A08, paint);
            if (location.hasBearing()) {
                canvas2.save();
                float f5 = r11.A00.A0R.A0A;
                if (f5 < 0.0f) {
                    f5 += 360.0f;
                }
                canvas2.rotate(f5 + location.getBearing(), f2, f3);
                float f6 = this.A07;
                float f7 = f6 / 2.0f;
                float f8 = f2 - f7;
                float f9 = f3 - f4;
                Path path = this.A0C;
                path.reset();
                path.moveTo(f8, f9);
                float f10 = this.A06;
                path.lineTo(f7 + f8, f9 - f10);
                path.lineTo(f6 + f8, f9);
                path.lineTo((f6 * 0.5f) + f8, f9 - (f10 * 0.25f));
                AnonymousClass000.A11(canvas2, paint, path, f8, f9);
                canvas2.restore();
            }
        }
    }

    public void AMU(AnonymousClass0WR r5) {
        float f2 = r5.A00;
        this.A01 = f2;
        if (f2 < this.A02) {
            this.A03 = !this.A03;
        }
        this.A00 = this.A03 ? 1.0f - ((1.0f - f2) * 0.25f) : 1.0f - (0.25f * f2);
        this.A02 = f2;
        A02();
    }
}
