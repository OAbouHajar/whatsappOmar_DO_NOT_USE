package X;

import android.graphics.RectF;
import android.util.Pair;
import android.view.View;

/* renamed from: X.3p5  reason: invalid class name and case insensitive filesystem */
public class C73803p5 extends AnonymousClass3BL {
    public final int A00;

    public C73803p5(int i2, int i3) {
        super(i2);
        this.A00 = i3;
    }

    public int A04() {
        return 100;
    }

    public RectF A05(int i2, int i3) {
        return null;
    }

    public Pair A07(int i2, int i3) {
        int i4 = this.A00;
        if (i4 <= 0) {
            return A08(i2, i3, View.MeasureSpec.getSize(i2));
        }
        C16750ta r1 = this.A00;
        float f2 = (float) r1.A08;
        float f3 = (float) r1.A06;
        float size = (float) View.MeasureSpec.getSize(i2);
        return AnonymousClass3BL.A02(size, AnonymousClass3BL.A01(i3, Math.min((float) (i4 << 1), (f3 * size) / f2)));
    }
}
