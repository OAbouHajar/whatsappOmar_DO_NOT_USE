package X;

import android.graphics.RectF;

/* renamed from: X.3uq  reason: invalid class name and case insensitive filesystem */
public abstract class C76883uq extends C455829l {
    public void A0Q(RectF rectF, float f2, float f3, float f4, float f5) {
        float A0R = A0R();
        RectF rectF2 = rectF;
        float f6 = f4;
        float f7 = f5;
        if (A0R != 0.0f) {
            float f8 = f4 - f2;
            float f9 = f5 - f3;
            if (f8 / f9 < A0R) {
                f9 = f8 / A0R;
            } else {
                f8 = f9 * A0R;
            }
            float f10 = (f2 + f4) / 2.0f;
            float f11 = (f3 + f5) / 2.0f;
            float f12 = f8 / 2.0f;
            float f13 = f9 / 2.0f;
            super.A0Q(rectF2, f10 - f12, f11 - f13, f10 + f12, f11 + f13);
            return;
        }
        super.A0Q(rectF, f2, f3, f6, f7);
    }

    public float A0R() {
        return 0.0f;
    }
}
