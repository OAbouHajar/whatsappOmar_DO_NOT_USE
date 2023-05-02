package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;

/* renamed from: X.3p6  reason: invalid class name and case insensitive filesystem */
public class C73813p6 extends AnonymousClass3BL {
    public static final Matrix A00 = new Matrix();

    public C73813p6(int i2) {
        super(i2);
    }

    public int A04() {
        return 100;
    }

    public RectF A05(int i2, int i3) {
        C16750ta r1 = this.A00;
        if (r1 == null) {
            return null;
        }
        int i4 = r1.A08;
        int i5 = r1.A06;
        int i6 = i4 * i3;
        float f2 = (float) i2;
        float f3 = (float) i4;
        float f4 = f3;
        if (i6 > i5 * i2) {
            f2 = (float) i3;
            f3 = (float) i5;
        }
        return new RectF(0.0f, 0.0f, f4, ((float) i3) / (f2 / f3));
    }

    public Pair A07(int i2, int i3) {
        return AnonymousClass3BL.A02((float) View.MeasureSpec.getSize(i2), (float) View.MeasureSpec.getSize(i3));
    }
}
