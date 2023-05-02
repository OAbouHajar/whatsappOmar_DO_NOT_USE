package kotlin.jvm.internal;

import X.AnonymousClass000;
import X.AnonymousClass1DR;
import X.AnonymousClass1ZX;
import X.AnonymousClass22J;
import X.C18450wi;
import X.C54482hb;

public class IDxLambdaShape57S0000000_2_I0 extends AnonymousClass1DR implements AnonymousClass22J {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape57S0000000_2_I0(int i2) {
        super(1);
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        boolean z2;
        switch (this.A00) {
            case 0:
                z2 = obj instanceof AnonymousClass1ZX;
                break;
            case 1:
                C18450wi.A0H(obj, 0);
                z2 = obj instanceof C54482hb;
                break;
            default:
                return Boolean.valueOf(AnonymousClass000.A1W(obj));
        }
        if (!z2) {
            return null;
        }
        return obj;
    }
}
