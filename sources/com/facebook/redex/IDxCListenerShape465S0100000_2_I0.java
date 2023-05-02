package com.facebook.redex;

import X.AnonymousClass1ZK;
import X.C30811cz;
import X.C54242h4;

public class IDxCListenerShape465S0100000_2_I0 implements C54242h4 {
    public Object A00;
    public final int A01;

    public IDxCListenerShape465S0100000_2_I0(AnonymousClass1ZK r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final void AZl() {
        boolean isRecording;
        int i2 = this.A01;
        AnonymousClass1ZK r1 = (AnonymousClass1ZK) this.A00;
        if (i2 != 0) {
            isRecording = r1.A0V();
        } else {
            C30811cz r0 = r1.A0P;
            if (r0 != null) {
                isRecording = r0.A06.isRecording();
            }
            r1.A05();
        }
        if (isRecording) {
            r1.A1K.A00();
            r1.A03();
            return;
        }
        r1.A05();
    }
}
