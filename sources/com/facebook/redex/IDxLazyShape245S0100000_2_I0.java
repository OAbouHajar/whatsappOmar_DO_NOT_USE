package com.facebook.redex;

import X.AnonymousClass01D;
import X.AnonymousClass01J;
import X.AnonymousClass01S;
import X.C17020u3;
import X.C26091Mh;
import X.C27941Ts;
import X.C29251aI;
import X.C29271aK;
import com.obwhatsapp.dependencybridge.di.DependencyBridgeModule;

public class IDxLazyShape245S0100000_2_I0 implements AnonymousClass01D {
    public Object A00;
    public final int A01;

    public IDxLazyShape245S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object get() {
        C17020u3 r1;
        String str;
        switch (this.A01) {
            case 0:
            case 6:
                r1 = (C17020u3) this.A00;
                str = AnonymousClass01S.A07;
                break;
            case 1:
                r1 = (C17020u3) this.A00;
                str = "server_prop_preferences";
                break;
            case 2:
                return Boolean.valueOf(((C29251aI) this.A00).A0D.A04);
            case 3:
                return Boolean.valueOf(((C26091Mh) this.A00).A01.A0C(1823));
            case 4:
                return new C29271aK((DependencyBridgeModule) this.A00);
            case 5:
                return C27941Ts.A00();
            case 7:
                r1 = (C17020u3) this.A00;
                str = "ab-props";
                break;
            default:
                return ((AnonymousClass01J) this.A00).get();
        }
        return r1.A00(str);
    }
}
