package com.facebook.redex;

import X.AnonymousClass4HD;
import X.C12380kI;
import X.C14990q7;
import X.C31201dg;
import X.C87564Xk;
import java.lang.ref.Reference;

public class IDxSupplierShape104S0200000_2_I1 implements C12380kI {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSupplierShape104S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object get() {
        if (this.A02 != 0) {
            C31201dg r2 = (C31201dg) this.A00;
            C14990q7 r1 = (C14990q7) this.A01;
            if (r2 != null) {
                return Integer.valueOf(C87564Xk.A01(r1, r2, 0));
            }
            return null;
        }
        C14990q7 r12 = (C14990q7) ((Reference) this.A00).get();
        C31201dg r0 = (C31201dg) ((Reference) this.A01).get();
        if (r12 == null || r0 == null) {
            return null;
        }
        return new AnonymousClass4HD(r12, r0);
    }
}
