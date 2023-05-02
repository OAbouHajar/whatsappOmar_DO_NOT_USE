package com.obwhatsapp.mediacomposer.doodle.shapes;

import X.AnonymousClass330;
import X.AnonymousClass331;
import X.AnonymousClass4TY;
import X.C605132q;

public class IDxAListenerShape88S0100000_2_I1 extends AnonymousClass4TY {
    public Object A00;
    public final int A01;

    public IDxAListenerShape88S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A01() {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                AnonymousClass330 r1 = (AnonymousClass330) obj;
                r1.A0A = Boolean.valueOf(!r1.A0A.booleanValue());
                break;
            case 1:
                C605132q r12 = (C605132q) obj;
                r12.A01 = Boolean.valueOf(!r12.A01.booleanValue());
                break;
            default:
                AnonymousClass331 r13 = (AnonymousClass331) obj;
                r13.A07 = !r13.A07;
                break;
        }
        super.A01();
    }
}
