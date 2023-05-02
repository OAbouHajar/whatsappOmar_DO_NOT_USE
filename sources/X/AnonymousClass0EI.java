package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.0EI  reason: invalid class name */
public class AnonymousClass0EI extends AnonymousClass05M {
    public final AnonymousClass0EK A00;

    public AnonymousClass0EI(AnonymousClass0EK r1) {
        this.A00 = r1;
    }

    public boolean A03(View view, int i2, Bundle bundle) {
        if (super.A03(view, i2, bundle)) {
            return true;
        }
        this.A00.A08();
        return false;
    }

    public void A06(View view, AnonymousClass031 r4) {
        AnonymousClass02W layoutManager;
        super.A06(view, r4);
        AnonymousClass0EK r1 = this.A00;
        if (!r1.A08() && (layoutManager = r1.A01.getLayoutManager()) != null) {
            layoutManager.A0J(view, r4);
        }
    }
}
