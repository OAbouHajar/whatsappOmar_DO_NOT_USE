package X;

import android.view.WindowInsets;

/* renamed from: X.0EU  reason: invalid class name */
public class AnonymousClass0EU extends AnonymousClass0EV {
    public C06510Wk A00 = null;

    public AnonymousClass0EU(AnonymousClass030 r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
    }

    public final C06510Wk A01() {
        C06510Wk r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        WindowInsets windowInsets = this.A03;
        C06510Wk A002 = C06510Wk.A00(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.A00 = A002;
        return A002;
    }

    public AnonymousClass030 A06() {
        return AnonymousClass030.A02(this.A03.consumeStableInsets());
    }

    public AnonymousClass030 A07() {
        return AnonymousClass030.A02(this.A03.consumeSystemWindowInsets());
    }

    public void A08(C06510Wk r1) {
        this.A00 = r1;
    }

    public boolean A09() {
        return this.A03.isConsumed();
    }
}
