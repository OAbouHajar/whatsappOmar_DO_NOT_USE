package com.facebook.redex;

import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass18N;
import X.AnonymousClass18Q;
import X.AnonymousClass18U;
import X.AnonymousClass192;
import X.AnonymousClass1KA;
import X.AnonymousClass1KE;
import X.AnonymousClass1U3;
import X.AnonymousClass2O9;
import X.AnonymousClass2ZO;
import X.C003401n;
import X.C013806q;
import X.C013906r;
import X.C14710pd;
import X.C14870pt;
import X.C15810rt;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16150sX;
import X.C16320sq;
import X.C16440t3;
import X.C16600tK;
import X.C17030uP;
import X.C17110uY;
import X.C17130ua;
import X.C17150uc;
import X.C17190ug;
import X.C18030w2;
import X.C18640x1;
import X.C19000xb;
import X.C24221Fa;
import X.C41681wN;
import X.C47712Kc;
import X.C50212Yk;
import X.C50882ac;
import X.C50962ak;
import android.os.Handler;

public class IDxFactoryShape37S0300000_1_I0 implements AnonymousClass04o {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxFactoryShape37S0300000_1_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public C003401n A6s(Class cls) {
        if (this.A03 != 0) {
            C16150sX r3 = ((C50962ak) this.A00).A00.A03;
            C16440t3 A0U = C16150sX.A0U(r3);
            C14710pd A0k = C16150sX.A0k(r3);
            C17110uY A1A = C16150sX.A1A(r3);
            C16040sK A04 = C16150sX.A04(r3);
            C16320sq A1B = C16150sX.A1B(r3);
            C15810rt A0c = C16150sX.A0c(r3);
            C16070sO A0e = C16150sX.A0e(r3);
            AnonymousClass192 r13 = (AnonymousClass192) r3.AH1.get();
            return new AnonymousClass2O9(A04, C16150sX.A0M(r3), (AnonymousClass18Q) r3.ABS.get(), C16150sX.A0Q(r3), A0U, A0c, (AnonymousClass18U) r3.ABQ.get(), A0e, r13, A0k, (AnonymousClass18N) r3.ABM.get(), (C16050sL) this.A01, (C47712Kc) this.A02, A1A, A1B);
        }
        C50212Yk r1 = ((C50882ac) this.A00).A00;
        C16150sX r0 = r1.A03;
        C16440t3 A0U2 = C16150sX.A0U(r0);
        C14870pt A022 = C16150sX.A02(r0);
        C16320sq A1B2 = C16150sX.A1B(r0);
        C17130ua A05 = C16150sX.A05(r0);
        C19000xb r9 = (C19000xb) r0.AQX.get();
        C17190ug A0t = C16150sX.A0t(r0);
        AnonymousClass1KA r14 = (AnonymousClass1KA) r0.A3a.get();
        AnonymousClass013 A0Z = C16150sX.A0Z(r0);
        C16600tK r10 = (C16600tK) r0.ARd.get();
        C18640x1 r132 = (C18640x1) r0.A3X.get();
        C17030uP A0P = C16150sX.A0P(r0);
        C17150uc A09 = C16150sX.A09(r0);
        AnonymousClass2ZO r32 = new AnonymousClass2ZO(C16150sX.A0k(r1.A01.A1s));
        return new C41681wN(C24221Fa.A00(r0.AS2), (Handler) this.A02, A022, A05, r9, r10, A09, (AnonymousClass1U3) this.A01, r132, r14, (AnonymousClass1KE) r0.AMJ.get(), A0P, r32, A0U2, A0Z, (C18030w2) r0.A6W.get(), A0t, A1B2);
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
