package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;

/* renamed from: X.39P  reason: invalid class name */
public class AnonymousClass39P {
    public float A00;
    public float A01 = 1.0f;
    public int A02;
    public int A03;
    public int A04;
    public Rect A05;
    public RectF A06;
    public RectF A07;
    public DisplayMetrics A08;
    public final Matrix A09 = AnonymousClass000.A0H();
    public final Matrix A0A = AnonymousClass000.A0H();
    public final RectF A0B = AnonymousClass000.A0K();

    public void A00(C62033Bj r4) {
        this.A06 = r4.A04;
        RectF rectF = r4.A03;
        this.A07 = rectF;
        int i2 = r4.A02;
        this.A02 = i2;
        this.A05 = null;
        this.A01 = 1.0f;
        if (rectF != null) {
            AnonymousClass470.A00(this.A09, rectF, (float) i2);
        }
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("DoodleViewState{bitmapRect=");
        A0r.append(this.A06);
        A0r.append(", cropRect=");
        A0r.append(this.A07);
        A0r.append(", rotate=");
        A0r.append(this.A02);
        A0r.append(", rotateMatrix=");
        A0r.append(this.A09);
        A0r.append(", zoomScale=");
        A0r.append(this.A01);
        A0r.append(", zoomRect=");
        A0r.append(this.A05);
        A0r.append(", zoomMatrix=");
        A0r.append(this.A0A);
        A0r.append(", displayRect=");
        A0r.append(this.A0B);
        A0r.append(", screenScale=");
        A0r.append(this.A00);
        A0r.append(", displayMetrics=");
        A0r.append(this.A08);
        A0r.append(", viewWidth=");
        A0r.append(this.A04);
        A0r.append(", viewHeight=");
        A0r.append(this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
