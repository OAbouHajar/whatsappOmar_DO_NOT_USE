package X;

import android.view.WindowInsets;

/* renamed from: X.0ES  reason: invalid class name */
public class AnonymousClass0ES extends AnonymousClass0ET {
    public C06510Wk A00 = null;
    public C06510Wk A01 = null;
    public C06510Wk A02 = null;

    public AnonymousClass0ES(AnonymousClass030 r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
    }

    public C06510Wk A00() {
        C06510Wk r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C06510Wk A012 = C06510Wk.A01(this.A03.getMandatorySystemGestureInsets());
        this.A00 = A012;
        return A012;
    }

    public C06510Wk A02() {
        C06510Wk r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C06510Wk A012 = C06510Wk.A01(this.A03.getSystemGestureInsets());
        this.A01 = A012;
        return A012;
    }

    public C06510Wk A03() {
        C06510Wk r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C06510Wk A012 = C06510Wk.A01(this.A03.getTappableElementInsets());
        this.A02 = A012;
        return A012;
    }

    public void A08(C06510Wk r1) {
    }

    public AnonymousClass030 A0D(int i2, int i3, int i4, int i5) {
        return AnonymousClass030.A02(this.A03.inset(i2, i3, i4, i5));
    }
}
