package com.facebook.redex;

import X.AnonymousClass0Q5;
import X.AnonymousClass3K2;
import X.C31301dt;
import X.C72243ln;

public class IDxICallbackShape3S0000000_2_I0 extends AnonymousClass0Q5 {
    public final int A00;

    public IDxICallbackShape3S0000000_2_I0(int i2) {
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ boolean A00(Object obj, Object obj2) {
        if (2 - this.A00 == 0) {
            AnonymousClass3K2.A1H(obj, obj2);
        }
        return obj.equals(obj2);
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                break;
            case 1:
                obj = (C31301dt) obj;
                obj2 = (C31301dt) obj2;
                if ((obj instanceof C72243ln) && (obj2 instanceof C72243ln)) {
                    return ((C72243ln) obj).A08.A0B.equals(((C72243ln) obj2).A08.A0B);
                }
            default:
                AnonymousClass3K2.A1H(obj, obj2);
                break;
        }
        return obj.equals(obj2);
    }
}
