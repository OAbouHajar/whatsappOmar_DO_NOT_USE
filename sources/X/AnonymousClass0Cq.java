package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.0Cq  reason: invalid class name */
public class AnonymousClass0Cq extends C02220Al {
    public AnonymousClass0Cm A00;
    public boolean A01;

    public AnonymousClass0Cq() {
        this((Resources) null, (AnonymousClass0Cm) null);
    }

    public AnonymousClass0Cq(AnonymousClass0Cm r2) {
    }

    public AnonymousClass0Cq(Resources resources, AnonymousClass0Cm r3) {
        A04(new AnonymousClass0Cm(resources, r3, this));
        onStateChange(getState());
    }

    public void A04(AnonymousClass0AX r2) {
        super.A04(r2);
        if (r2 instanceof AnonymousClass0Cm) {
            this.A00 = (AnonymousClass0Cm) r2;
        }
    }

    /* renamed from: A05 */
    public AnonymousClass0Cm A03() {
        return new AnonymousClass0Cm((Resources) null, this.A00, this);
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.A01) {
            super.mutate();
            if (this == this) {
                this.A00.A04();
                this.A01 = true;
            }
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A08 = this.A00.A08(iArr);
        if (A08 < 0) {
            A08 = this.A00.A08(StateSet.WILD_CARD);
        }
        return A02(A08) || onStateChange;
    }
}
