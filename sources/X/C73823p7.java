package X;

import android.graphics.RectF;
import android.util.Pair;

/* renamed from: X.3p7  reason: invalid class name and case insensitive filesystem */
public class C73823p7 extends AnonymousClass3BL {
    public static final AnonymousClass4RB A00 = new AnonymousClass4RB(72, 191.0f, 100.0f);

    public C73823p7(int i2) {
        super(i2);
    }

    public int A04() {
        return 72;
    }

    public RectF A05(int i2, int i3) {
        return A06(A00, i2, i3);
    }

    public Pair A07(int i2, int i3) {
        float A01 = AnonymousClass3BL.A01(i2, (((float) this.A01) * ((float) 72)) / 100.0f);
        return AnonymousClass3BL.A02(A01, AnonymousClass3BL.A01(i3, (A01 * 100.0f) / 191.0f));
    }
}
