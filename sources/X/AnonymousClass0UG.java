package X;

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* renamed from: X.0UG  reason: invalid class name */
public class AnonymousClass0UG {
    public float A00;
    public float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;

    public AnonymousClass0UG(float f2, float f3, int i2, float f4, int i3, float f5) {
        this.A06 = i2;
        this.A04 = f4;
        this.A05 = f5;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f2;
        this.A01 = f3;
        this.A07 = A00(0.3f, f4, f5, i3);
        this.A08 = A00(0.5f, f4 * 1.5f, 1.5f * f5, i3);
        this.A09 = A00(0.8f, f4 * 2.0f, f5 * 2.0f, i3);
    }

    public static Paint A00(float f2, float f3, float f4, int i2) {
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        float max = Math.max(f3, f4);
        int[] iArr = new int[2];
        iArr[0] = AnonymousClass0MU.A00(i2, f2);
        AnonymousClass0MU.A01(iArr, 0.0f, i2, 1);
        paint.setShader(new RadialGradient(0.0f, 0.0f, max, iArr, (float[]) null, Shader.TileMode.CLAMP));
        return paint;
    }
}
