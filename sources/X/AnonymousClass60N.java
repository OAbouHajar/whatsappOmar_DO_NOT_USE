package X;

import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;

/* renamed from: X.60N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass60N implements AnonymousClass5Q2 {
    public final /* synthetic */ IndiaUpiVpaContactInfoActivity A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass60N(IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity, boolean z2) {
        this.A00 = indiaUpiVpaContactInfoActivity;
        this.A01 = z2;
    }

    public final void AWL(AnonymousClass2HJ r3) {
        IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity = this.A00;
        boolean z2 = this.A01;
        if (r3 == null) {
            indiaUpiVpaContactInfoActivity.A2n(z2);
        } else if (z2) {
            indiaUpiVpaContactInfoActivity.Afg(R.string.str023c);
        } else {
            C110105dW.A1C(indiaUpiVpaContactInfoActivity, R.string.str187e);
        }
    }
}
