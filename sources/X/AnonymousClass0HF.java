package X;

import java.util.Collections;

/* renamed from: X.0HF  reason: invalid class name */
public class AnonymousClass0HF extends AnonymousClass0SI {
    public final Object A00;

    public AnonymousClass0HF(AnonymousClass0UV r2, Object obj) {
        super(Collections.emptyList());
        A0D(r2);
        this.A00 = obj;
    }

    public float A05() {
        return 1.0f;
    }

    public Object A08() {
        AnonymousClass0UV r2 = this.A03;
        Object obj = this.A00;
        AnonymousClass0OB r0 = r2.A02;
        r0.A01 = obj;
        r0.A00 = obj;
        return r2.A01;
    }

    public Object A09(C06520Wl r2, float f2) {
        return A08();
    }

    public void A0B() {
        if (this.A03 != null) {
            super.A0B();
        }
    }

    public void A0C(float f2) {
        this.A02 = f2;
    }
}
