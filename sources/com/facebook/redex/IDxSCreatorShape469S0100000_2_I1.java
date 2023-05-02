package com.facebook.redex;

import X.AnonymousClass5AA;
import X.AnonymousClass5BZ;
import X.AnonymousClass5R3;
import X.C105785Be;
import java.security.Signature;

public class IDxSCreatorShape469S0100000_2_I1 implements AnonymousClass5R3 {
    public Object A00;
    public final int A01;

    public IDxSCreatorShape469S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public Signature A7c(String str) {
        if (this.A01 == 0) {
            return Signature.getInstance(str, ((AnonymousClass5AA) ((AnonymousClass5BZ) this.A00).A02).A00);
        }
        try {
            return Signature.getInstance(str, ((AnonymousClass5AA) ((C105785Be) this.A00).bcHelper).A00);
        } catch (Exception unused) {
            return Signature.getInstance(str);
        }
    }
}
