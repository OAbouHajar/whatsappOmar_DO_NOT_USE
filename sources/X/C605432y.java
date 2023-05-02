package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.32y  reason: invalid class name and case insensitive filesystem */
public class C605432y extends C455829l {
    public static final C85204Nn[] A07 = {new C85204Nn(68.0f, 47.0f, 309.0f, 266.0f, 164.0f, 156.0f), new C85204Nn(246.0f, 17.0f, 419.0f, 142.0f, 196.0f, 124.0f), new C85204Nn(390.0f, 0.0f, 546.0f, 155.0f, 195.0f, 128.0f), new C85204Nn(507.0f, 1.0f, 686.0f, 179.0f, 208.0f, 146.0f), new C85204Nn(575.0f, 64.0f, 750.0f, 235.0f, 284.0f, 122.0f), new C85204Nn(530.0f, 141.0f, 769.0f, 357.0f, 324.0f, 118.0f), new C85204Nn(459.0f, 261.0f, 664.0f, 449.0f, 300.0f, 180.0f), new C85204Nn(275.0f, 316.0f, 510.0f, 512.0f, 0.0f, 164.0f), new C85204Nn(97.0f, 286.0f, 346.0f, 482.0f, 56.0f, 100.0f), new C85204Nn(17.0f, 279.0f, 174.0f, 419.0f, 67.0f, 152.0f), new C85204Nn(0.0f, 171.0f, 157.0f, 311.0f, 91.0f, 170.0f)};
    public final Matrix A00;
    public final Paint A01;
    public final Path A02;
    public final Path A03;
    public final Path A04;
    public final RectF A05;
    public final RectF A06;

    public C605432y() {
        this.A01 = C13700nu.A06(1);
        this.A00 = AnonymousClass000.A0H();
        RectF A0K = AnonymousClass000.A0K();
        this.A05 = A0K;
        this.A04 = AnonymousClass000.A0I();
        this.A06 = AnonymousClass000.A0K();
        Path A0I = AnonymousClass000.A0I();
        C85204Nn[] r11 = A07;
        for (C85204Nn r9 : r11) {
            A0I.addArc(new RectF(r9.A01, r9.A05, r9.A02, r9.A00), r9.A03, r9.A04);
        }
        this.A03 = A0I;
        Path A0I2 = AnonymousClass000.A0I();
        for (C85204Nn r0 : r11) {
            A0I2.addOval(new RectF(r0.A01, r0.A05, r0.A02, r0.A00), Path.Direction.CW);
        }
        A0I2.addRect(120.0f, 80.0f, 580.0f, 430.0f, Path.Direction.CW);
        this.A02 = A0I2;
        A0I.setFillType(Path.FillType.WINDING);
        A0I.computeBounds(A0K, true);
        this.A00 = 120.0f;
    }

    public C605432y(JSONObject jSONObject) {
        this();
        super.A0A(jSONObject);
    }

    public void A0O(float f2) {
        super.A0O((f2 * 3.0f) / 5.0f);
    }

    public void A0Q(RectF rectF, float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        RectF rectF2 = this.A05;
        if (f6 / f7 < rectF2.width() / rectF2.height()) {
            f7 = (rectF2.height() * f6) / rectF2.width();
        } else {
            f6 = (rectF2.width() * f7) / rectF2.height();
        }
        float f8 = (f2 + f4) / 2.0f;
        float f9 = (f3 + f5) / 2.0f;
        float f10 = f6 / 2.0f;
        float f11 = f7 / 2.0f;
        super.A0Q(rectF, f8 - f10, f9 - f11, f8 + f10, f9 + f11);
    }

    public final void A0R(Canvas canvas, float f2, float f3) {
        RectF rectF = this.A02;
        float width = rectF.width() / this.A05.width();
        float f4 = 60.0f * width * f3;
        float f5 = width * 30.0f * f3;
        float centerX = rectF.centerX() + (((float) ((Math.cos(Math.toRadians((double) this.A00)) * ((double) rectF.width())) / 2.0d)) * f2);
        float centerY = rectF.centerY() + (f2 * ((float) ((Math.sin(Math.toRadians((double) this.A00)) * ((double) rectF.height())) / 2.0d)));
        RectF rectF2 = this.A06;
        rectF2.set(centerX - f4, centerY - f5, centerX + f4, centerY + f5);
        canvas.drawOval(rectF2, this.A01);
        canvas.drawOval(rectF2, this.A01);
    }
}
