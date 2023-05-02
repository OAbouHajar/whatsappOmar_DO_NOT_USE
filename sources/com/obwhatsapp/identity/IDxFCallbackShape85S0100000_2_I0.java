package com.obwhatsapp.identity;

import X.AnonymousClass2T3;
import X.AnonymousClass4QJ;
import X.C16010sH;
import com.obwhatsapp.R;

public class IDxFCallbackShape85S0100000_2_I0 extends AnonymousClass4QJ {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxFCallbackShape85S0100000_2_I0(IdentityVerificationActivity identityVerificationActivity, int i2) {
        super(identityVerificationActivity);
        this.A01 = i2;
        this.A00 = identityVerificationActivity;
    }

    public void A00() {
        String A08;
        if (this.A01 != 0) {
            IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
            C16010sH r1 = identityVerificationActivity.A0K;
            String str = null;
            if (!(r1 == null || (A08 = identityVerificationActivity.A0F.A08(r1)) == null)) {
                str = identityVerificationActivity.A01.A0G(A08);
            }
            String string = identityVerificationActivity.getResources().getString(R.string.str14b7, new Object[]{str});
            String string2 = identityVerificationActivity.getResources().getString(R.string.str14b6, new Object[]{str});
            AnonymousClass2T3 r12 = new AnonymousClass2T3();
            r12.A08 = string2;
            r12.A09 = string;
            r12.A00 = 101;
            identityVerificationActivity.Afb(r12.A00(), (String) null);
            identityVerificationActivity.A0U = true;
            return;
        }
        ((IdentityVerificationActivity) this.A00).A39();
    }
}
