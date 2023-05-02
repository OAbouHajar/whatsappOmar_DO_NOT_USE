package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: X.0Am  reason: invalid class name and case insensitive filesystem */
public class C02230Am extends OvalShape {
    public Paint A00 = new Paint();
    public RadialGradient A01;
    public final /* synthetic */ AnonymousClass0CL A02;

    public C02230Am(AnonymousClass0CL r2, int i2) {
        this.A02 = r2;
        r2.A00 = i2;
        A00((int) rect().width());
    }

    public final void A00(int i2) {
        float f2 = (float) (i2 / 2);
        RadialGradient radialGradient = new RadialGradient(f2, f2, (float) this.A02.A00, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
        this.A01 = radialGradient;
        this.A00.setShader(radialGradient);
    }

    public void draw(Canvas canvas, Paint paint) {
        AnonymousClass0CL r4 = this.A02;
        int width = r4.getWidth() >> 1;
        float f2 = (float) width;
        float height = (float) (r4.getHeight() >> 1);
        canvas.drawCircle(f2, height, f2, this.A00);
        canvas.drawCircle(f2, height, (float) (width - r4.A00), paint);
    }

    public void onResize(float f2, float f3) {
        super.onResize(f2, f3);
        A00((int) f2);
    }
}
