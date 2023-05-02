package com.facebook.redex;

import X.AnonymousClass2JN;
import X.AnonymousClass5S5;
import X.C13680ns;
import X.C14270ot;
import X.C15860rz;
import X.C56252nA;
import com.whatsapp.util.Log;

public class IDxFListenerShape313S0100000_2_I1 implements C14270ot {
    public Object A00;
    public final int A01;

    public IDxFListenerShape313S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQu(Exception exc) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            Log.e("registerphone/smsretriever/onfailure/ ", exc);
            ((AnonymousClass5S5) obj).Aao();
            return;
        }
        Log.e("verifysms/smsretriever/failure registering sms retriever client/ ", exc);
        C15860rz r1 = ((C56252nA) obj).A01;
        AnonymousClass2JN.A0K(r1, "timeout-waiting-for-sms");
        C13680ns.A0w(r1.A0K(), "sms_retriever_retry_count", 0);
    }
}
