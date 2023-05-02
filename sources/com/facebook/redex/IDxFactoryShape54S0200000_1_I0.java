package com.facebook.redex;

import X.AnonymousClass04o;
import X.AnonymousClass121;
import X.AnonymousClass12A;
import X.AnonymousClass2AM;
import X.AnonymousClass2aE;
import X.C003401n;
import X.C013806q;
import X.C013906r;
import X.C13700nu;
import X.C15830rv;
import X.C16010sH;
import X.C16150sX;
import X.C16300so;
import X.C16320sq;
import X.C17240ul;
import X.C216114t;
import X.C217915l;
import X.C50662aF;
import X.C57292qf;
import java.util.Collection;
import java.util.Iterator;

public class IDxFactoryShape54S0200000_1_I0 implements AnonymousClass04o {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFactoryShape54S0200000_1_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public C003401n A6s(Class cls) {
        if (this.A02 != 0) {
            C16150sX r3 = ((C50662aF) this.A01).A00.A03;
            AnonymousClass2AM r5 = new AnonymousClass2AM(C16150sX.A0N(r3), (C216114t) r3.A5O.get(), (C16010sH) this.A00, (C217915l) r3.AOG.get());
            C16010sH A012 = r5.A03.A01(C15830rv.A00(r5.A00.A0E));
            r5.A00 = A012;
            r5.A05.A09(Boolean.valueOf(r5.A04.A00(A012)));
            return r5;
        }
        C16150sX r1 = ((AnonymousClass2aE) this.A00).A00.A03;
        C16300so A002 = C16150sX.A00(r1);
        C16320sq A1B = C16150sX.A1B(r1);
        AnonymousClass12A r7 = (AnonymousClass12A) r1.A50.get();
        C17240ul A0o = C16150sX.A0o(r1);
        AnonymousClass121 r10 = (AnonymousClass121) r1.AJY.get();
        C57292qf r52 = new C57292qf(A002, r7, (C216114t) r1.A5O.get(), A0o, r10, A1B, (Collection) this.A01);
        Iterator it = r52.A0B.iterator();
        while (it.hasNext()) {
            r52.A01.add(r52.A04.A01(C13700nu.A0B(it)));
        }
        r52.A08.A0B(r52.A01);
        r52.A05();
        return r52;
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
