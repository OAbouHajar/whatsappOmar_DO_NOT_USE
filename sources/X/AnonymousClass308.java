package X;

import android.view.ViewGroup;

/* renamed from: X.308  reason: invalid class name */
public abstract class AnonymousClass308 extends C49692Vb {
    public final float A00;
    public final ViewGroup A01;

    public AnonymousClass308(ViewGroup viewGroup, AnonymousClass1yP r3, int i2) {
        super(r3, i2);
        this.A01 = viewGroup;
        this.A00 = C13690nt.A0N((C000900k) r3).A00();
    }

    public final void A05(C82724Dx r6) {
        ViewGroup viewGroup = this.A01;
        if (viewGroup.getVisibility() != 8) {
            C005402i A0N = C13690nt.A0N((C000900k) this.A01);
            float A002 = A0N.A00();
            float f2 = this.A00;
            if (A002 != f2) {
                A0N.A08(f2);
                C004601z.A0X(viewGroup, 0.0f);
            }
            viewGroup.setVisibility(8);
            r6.A00.A01 = null;
        }
    }
}
