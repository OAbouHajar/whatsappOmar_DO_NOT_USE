package com.facebook.redex;

import X.AnonymousClass04o;
import X.AnonymousClass2AS;
import X.AnonymousClass2YU;
import X.C003401n;
import X.C013806q;
import X.C013906r;
import X.C13700nu;
import X.C15830rv;
import X.C16050sL;
import X.C16150sX;
import X.C17790ve;
import X.C19430yQ;
import X.C50112Ya;
import X.C50122Yb;
import X.C50132Yc;
import X.C50152Ye;
import X.C50162Yf;
import X.C50172Yg;
import X.C50182Yh;
import X.C50202Yj;
import X.C50222Yl;
import android.content.Context;

public class IDxFactoryShape55S0200000_2_I0 implements AnonymousClass04o {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFactoryShape55S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public C003401n A6s(Class cls) {
        switch (this.A02) {
            case 0:
                return new C50152Ye((C16050sL) this.A01, (C17790ve) ((C50132Yc) this.A00).A00.A04.AGX.get());
            case 1:
                AnonymousClass2AS A002 = ((C50162Yf) this.A00).A00((C16050sL) this.A01);
                A002.A03 = new C50182Yh(new C50172Yg());
                A002.A06();
                return A002;
            case 2:
                return new C50222Yl((C15830rv) this.A01, (C19430yQ) ((C50202Yj) this.A00).A00.A03.ADa.get());
            default:
                return new C50112Ya(new AnonymousClass2YU(new C50122Yb(((C16150sX) C13700nu.A0A((Context) this.A01)).ARe).A00));
        }
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
