package com.facebook.redex;

import X.AnonymousClass2HJ;
import X.AnonymousClass3GH;
import X.AnonymousClass50C;
import X.AnonymousClass5vY;
import X.AnonymousClass692;
import X.C110115dX;
import X.C112165i3;
import X.C118555us;
import com.whatsapp.util.Log;

public class IDxKCallbackShape389S0100000_3_I1 implements AnonymousClass692 {
    public Object A00;
    public final int A01;

    public IDxKCallbackShape389S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AVP(AnonymousClass2HJ r4) {
        switch (this.A01) {
            case 0:
                Log.e("PAY: BrazilDeviceRegistrationAction/getPaymentProviderPublicKey iq returned null");
                ((C118555us) this.A00).A00(C110115dX.A0N(), (AnonymousClass50C) null);
                return;
            case 1:
                Log.e("PAY: BrazilVerifyCardOTPSendAction getProviderEncryptionKeyAsync iq returned null");
                ((AnonymousClass5vY) this.A00).A01(C110115dX.A0N(), (AnonymousClass50C) null);
                return;
            default:
                Log.e("PAY: BrazilVerifyCardOTPSendAction/provider key iq returned null");
                C112165i3 r1 = (C112165i3) this.A00;
                r1.A03(r1.A09);
                return;
        }
    }

    public void AVQ(AnonymousClass50C r5) {
        switch (this.A01) {
            case 0:
                ((C118555us) this.A00).A00((AnonymousClass2HJ) null, r5);
                return;
            case 1:
                ((AnonymousClass5vY) this.A00).A01((AnonymousClass2HJ) null, r5);
                return;
            default:
                C112165i3 r3 = (C112165i3) this.A00;
                r3.A03(r3.A03.A02((AnonymousClass3GH) r5.A00, r3.A09));
                return;
        }
    }
}
