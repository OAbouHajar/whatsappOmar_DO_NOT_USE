package com.facebook.redex;

import X.AnonymousClass5BZ;
import X.AnonymousClass5R3;
import java.security.Provider;
import java.security.Signature;

public class IDxSCreatorShape118S0200000_2_I1 implements AnonymousClass5R3 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSCreatorShape118S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public Signature A7c(String str) {
        if (this.A02 != 0) {
            Provider provider = (Provider) this.A01;
            return provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
        }
        Provider provider2 = (Provider) this.A01;
        String str2 = ((AnonymousClass5BZ) this.A00).A00;
        return provider2 != null ? Signature.getInstance(str2, provider2) : Signature.getInstance(str2);
    }
}
