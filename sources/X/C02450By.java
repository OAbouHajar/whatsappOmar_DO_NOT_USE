package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.0By  reason: invalid class name and case insensitive filesystem */
public class C02450By extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C02420Bv A02;

    public C02450By(C02420Bv r1, int i2, int i3) {
        this.A02 = r1;
        this.A01 = i2;
        this.A00 = i3;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        C02210Ag r3 = this.A02.A0L;
        int i2 = this.A01;
        r3.setAlpha((int) (((float) i2) + (((float) (this.A00 - i2)) * f2)));
    }
}
