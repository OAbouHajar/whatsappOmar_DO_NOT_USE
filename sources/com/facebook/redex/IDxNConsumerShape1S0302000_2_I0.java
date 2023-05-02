package com.facebook.redex;

import X.AnonymousClass1HE;
import X.AnonymousClass1WE;
import X.AnonymousClass1XP;
import X.C27711Sv;
import X.C43241zg;

public class IDxNConsumerShape1S0302000_2_I0 implements AnonymousClass1WE {
    public int A00 = -1;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public IDxNConsumerShape1S0302000_2_I0(C43241zg r2, AnonymousClass1HE r3, AnonymousClass1XP r4, int i2) {
        this.A05 = i2;
        this.A02 = r3;
        this.A04 = r2;
        this.A03 = r4;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        AnonymousClass1HE r4;
        C43241zg r3;
        int i2 = this.A05;
        Number number = (Number) obj;
        int intValue = number.intValue();
        int i3 = this.A00;
        if (i2 != 0) {
            if (intValue != i3) {
                this.A00 = intValue;
                if (intValue >= this.A01 + 5) {
                    this.A01 = intValue;
                    ((C43241zg) this.A04).A01.size();
                }
                r4 = (AnonymousClass1HE) this.A02;
                C27711Sv r2 = r4.A0E;
                r3 = (C43241zg) this.A04;
                C27711Sv.A00(r3, new IDxMModifierShape235S0100000_2_I1(r2, 0), number);
            } else {
                return;
            }
        } else if (intValue != i3) {
            this.A00 = intValue;
            if (intValue >= this.A01 + 5) {
                this.A01 = intValue;
                ((C43241zg) this.A04).A01.size();
            }
            r4 = (AnonymousClass1HE) this.A02;
            C27711Sv r22 = r4.A0E;
            r3 = (C43241zg) this.A04;
            if (!C27711Sv.A00(r3, new IDxMModifierShape235S0100000_2_I1(r22, 5), number)) {
                return;
            }
        } else {
            return;
        }
        r4.A07.A09(r3.A01, 8);
    }
}
