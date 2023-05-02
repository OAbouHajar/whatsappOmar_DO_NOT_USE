package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.0Co  reason: invalid class name and case insensitive filesystem */
public class C02540Co extends AnonymousClass0Cm {
    public AnonymousClass03G A00;
    public AnonymousClass07U A01;

    public C02540Co(Resources resources, C02540Co r3, AnonymousClass0Cp r4) {
        super(resources, r3, r4);
        AnonymousClass07U r0;
        if (r3 != null) {
            this.A00 = r3.A00;
            r0 = r3.A01;
        } else {
            this.A00 = new AnonymousClass03G();
            r0 = new AnonymousClass07U();
        }
        this.A01 = r0;
    }

    public void A04() {
        this.A00 = this.A00.clone();
        this.A01 = this.A01.clone();
    }

    public int A09(int[] iArr) {
        int A08 = super.A08(iArr);
        return A08 < 0 ? super.A08(StateSet.WILD_CARD) : A08;
    }

    public Drawable newDrawable() {
        return new AnonymousClass0Cp((Resources) null, this);
    }

    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass0Cp(resources, this);
    }
}
