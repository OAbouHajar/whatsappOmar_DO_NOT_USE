package com.facebook.redex;

import X.AnonymousClass5R3;
import java.security.Signature;

public class IDxSCreatorShape10S1100000_2_I1 implements AnonymousClass5R3 {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxSCreatorShape10S1100000_2_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public Signature A7c(String str) {
        String str2 = this.A01;
        return str2 != null ? Signature.getInstance(str, str2) : Signature.getInstance(str);
    }
}
