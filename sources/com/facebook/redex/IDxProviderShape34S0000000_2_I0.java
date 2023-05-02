package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01J;
import X.AnonymousClass2HP;
import X.C13680ns;
import X.C37781pj;
import java.util.HashSet;
import java.util.regex.Pattern;

public class IDxProviderShape34S0000000_2_I0 implements AnonymousClass01J {
    public final int A00;

    public IDxProviderShape34S0000000_2_I0(int i2) {
        this.A00 = i2;
    }

    public final Object get() {
        switch (this.A00) {
            case 0:
                HashSet A0o = C13680ns.A0o();
                for (int[] r1 : AnonymousClass2HP.A01) {
                    A0o.add(new C37781pj(r1));
                }
                return A0o;
            case 1:
                return Pattern.compile("\\+12225551[0-9]{3}");
            default:
                return AnonymousClass000.A0L();
        }
    }
}
