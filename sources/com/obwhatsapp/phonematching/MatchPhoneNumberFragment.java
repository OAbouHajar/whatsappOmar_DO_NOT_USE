package com.obwhatsapp.phonematching;

import X.AnonymousClass00B;
import X.AnonymousClass124;
import X.AnonymousClass51Z;
import X.C108135Mu;
import X.C14530pL;
import X.C16040sK;
import X.C19760yx;
import X.C19980zJ;
import X.C53912gV;
import X.C56462ng;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class MatchPhoneNumberFragment extends Hilt_MatchPhoneNumberFragment {
    public C16040sK A00;
    public C14530pL A01;
    public AnonymousClass124 A02;
    public C56462ng A03;
    public C19760yx A04;
    public final C53912gV A05 = new AnonymousClass51Z(this);

    public static void A01(C14530pL r1) {
        DialogFragment dialogFragment = (DialogFragment) r1.AGM().A0B("PROGRESS");
        if (dialogFragment != null) {
            dialogFragment.A1D();
        }
    }

    public void A12() {
        C19760yx r0 = this.A04;
        r0.A0v.remove(this.A05);
        this.A03.removeMessages(4);
        this.A0C = null;
        super.A12();
    }

    public void A16(Context context) {
        super.A16(context);
        C14530pL r0 = (C14530pL) C19980zJ.A01(context, C14530pL.class);
        this.A01 = r0;
        AnonymousClass00B.A0B("activity needs to implement PhoneNumberMatchingCallback", r0 instanceof C108135Mu);
        C14530pL r2 = this.A01;
        C108135Mu r1 = (C108135Mu) r2;
        if (this.A03 == null) {
            this.A03 = new C56462ng(r2, r1);
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        C19760yx r0 = this.A04;
        r0.A0v.add(this.A05);
        this.A0C = this;
    }
}
