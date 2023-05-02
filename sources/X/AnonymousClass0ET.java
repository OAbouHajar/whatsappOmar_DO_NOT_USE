package X;

import android.view.WindowInsets;

/* renamed from: X.0ET  reason: invalid class name */
public class AnonymousClass0ET extends AnonymousClass0EU {
    public AnonymousClass0ET(AnonymousClass030 r1, WindowInsets windowInsets) {
        super(r1, windowInsets);
    }

    public AnonymousClass0V6 A04() {
        return AnonymousClass0V6.A00(this.A03.getDisplayCutout());
    }

    public AnonymousClass030 A05() {
        return AnonymousClass030.A02(this.A03.consumeDisplayCutout());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0ET)) {
            return false;
        }
        AnonymousClass0EV r4 = (AnonymousClass0EV) obj;
        return AnonymousClass09S.A00(this.A03, r4.A03) && AnonymousClass09S.A00(this.A00, r4.A00);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }
}
