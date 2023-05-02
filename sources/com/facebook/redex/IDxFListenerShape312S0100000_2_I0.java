package com.facebook.redex;

import X.AnonymousClass2JN;
import X.AnonymousClass43Z;
import X.C14270ot;
import X.C14550pN;
import X.C27761Ta;
import com.whatsapp.util.Log;

public class IDxFListenerShape312S0100000_2_I0 implements C14270ot {
    public Object A00;
    public final int A01;

    public IDxFListenerShape312S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQu(Exception exc) {
        switch (this.A01) {
            case 0:
                Log.e("changenumber/smsretriever/onfailure/ ", exc);
                Log.i("changenumber/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
                AnonymousClass2JN.A0J((C14550pN) this.A00, 2);
                return;
            case 1:
                ((C27761Ta) this.A00).A01.A01((String) null, exc.getMessage(), exc instanceof AnonymousClass43Z ? ((AnonymousClass43Z) exc).mStatus.A01 : 500);
                Log.e("requestAttestation/onError", exc);
                return;
            default:
                C27761Ta r3 = (C27761Ta) this.A00;
                Log.e("requestHarmfulApps/onError", exc);
                r3.A01.A00(exc.getMessage(), exc instanceof AnonymousClass43Z ? ((AnonymousClass43Z) exc).mStatus.A01 : 500);
                return;
        }
    }
}
