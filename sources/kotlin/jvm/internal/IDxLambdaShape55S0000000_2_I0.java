package kotlin.jvm.internal;

import X.AnonymousClass035;
import X.AnonymousClass1DR;
import X.AnonymousClass1DU;
import X.AnonymousClass1JA;
import X.AnonymousClass2II;
import X.AnonymousClass2IJ;
import X.AnonymousClass2IK;
import X.AnonymousClass2IL;
import X.AnonymousClass2IM;
import X.C13680ns;
import X.C13690nt;
import X.C18450wi;
import X.C30801cy;
import android.graphics.Paint;
import java.util.concurrent.locks.ReentrantLock;

public class IDxLambdaShape55S0000000_2_I0 extends AnonymousClass1DR implements AnonymousClass1DU {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape55S0000000_2_I0(int i2) {
        super(0);
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        switch (this.A00) {
            case 1:
                if (AnonymousClass035.A03 == null) {
                    ReentrantLock reentrantLock = AnonymousClass035.A02;
                    reentrantLock.lock();
                    try {
                        if (AnonymousClass035.A03 == null) {
                            AnonymousClass035.A03 = new AnonymousClass035();
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                AnonymousClass035 r1 = AnonymousClass035.A03;
                C18450wi.A0F(r1);
                return r1;
            case 3:
                return C30801cy.A01();
            case 4:
                Paint A0E = C13680ns.A0E();
                A0E.setStyle(Paint.Style.STROKE);
                return A0E;
            case 5:
                return AnonymousClass1JA.A0S(new AnonymousClass2II(), new AnonymousClass2IJ(), new AnonymousClass2IL(AnonymousClass2IK.A02), new AnonymousClass2IL(AnonymousClass2IK.A01), new AnonymousClass2IM());
            default:
                return C13690nt.A0O();
        }
    }
}
