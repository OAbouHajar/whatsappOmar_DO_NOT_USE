package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.32v  reason: invalid class name */
public class AnonymousClass32v extends C455829l {
    public final Matrix A00;
    public final Paint A01;
    public final Path A02;
    public final Path A03;

    public AnonymousClass32v() {
        Path A0I = AnonymousClass000.A0I();
        this.A02 = A0I;
        this.A01 = C13680ns.A0E();
        this.A00 = AnonymousClass000.A0H();
        this.A03 = AnonymousClass000.A0I();
        double radians = Math.toRadians(35.0d);
        float cos = (float) (Math.cos(radians) * 1000.0d);
        float sin = (float) (Math.sin(radians) * 1000.0d);
        double radians2 = Math.toRadians(55.0d);
        A0I.addArc(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), 55.0f, 340.0f);
        A0I.moveTo(cos, sin);
        A0I.lineTo(1200.0f, 1200.0f);
        A0I.lineTo((float) (Math.cos(radians2) * 1000.0d), (float) (Math.sin(radians2) * 1000.0d));
    }

    public AnonymousClass32v(JSONObject jSONObject) {
        this();
        super.A0A(jSONObject);
    }

    public void A0O(float f2) {
        super.A0O((f2 * 2.0f) / 3.0f);
    }

    public void A0Q(RectF rectF, float f2, float f3, float f4, float f5) {
        float f6 = (f3 + f5) / 2.0f;
        float f7 = (((f4 - f2) * 2.0f) / 3.0f) / 2.0f;
        float f8 = f6 - f7;
        float f9 = f6 + f7;
        super.A0Q(rectF, f2, f8, f4, f9);
    }
}
