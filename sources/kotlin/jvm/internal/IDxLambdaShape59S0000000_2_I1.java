package kotlin.jvm.internal;

import X.AnonymousClass000;
import X.AnonymousClass1DR;
import X.AnonymousClass1UJ;
import X.AnonymousClass1UL;
import X.AnonymousClass1UM;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.AnonymousClass5VC;
import X.C1051758m;
import X.C1052158q;
import X.C1052258r;

public class IDxLambdaShape59S0000000_2_I1 extends AnonymousClass1DR implements AnonymousClass1UJ {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape59S0000000_2_I1(int i2) {
        super(2);
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object AIV(Object obj, Object obj2) {
        C1052158q r0;
        switch (this.A00) {
            case 0:
                ((Number) obj).doubleValue();
                return Double.valueOf(AnonymousClass3K3.A01(obj2));
            case 1:
                return Double.valueOf(AnonymousClass3K3.A01(obj) * AnonymousClass3K3.A01(obj2));
            case 2:
                String str = (String) obj;
                AnonymousClass3K2.A1H(str, obj2);
                if (str.length() == 0) {
                    return obj2.toString();
                }
                StringBuilder A0q = AnonymousClass000.A0q(str);
                A0q.append(", ");
                return AnonymousClass000.A0f(obj2, A0q);
            case 3:
                AnonymousClass1UM r6 = (AnonymousClass1UM) obj;
                AnonymousClass1UL r7 = (AnonymousClass1UL) obj2;
                AnonymousClass3K2.A1H(r6, r7);
                AnonymousClass1UM minusKey = r6.minusKey(r7.getKey());
                C1052258r r3 = C1052258r.A00;
                if (minusKey == r3) {
                    return r7;
                }
                C1051758m r02 = AnonymousClass5VC.A00;
                AnonymousClass1UL r2 = minusKey.get(r02);
                if (r2 == null) {
                    return new C1052158q(r7, minusKey);
                }
                AnonymousClass1UM minusKey2 = minusKey.minusKey(r02);
                if (minusKey2 == r3) {
                    return r0;
                }
                r0 = new C1052158q(r7, minusKey2);
                return new C1052158q(r2, r0);
            case 4:
                return Integer.valueOf(AnonymousClass000.A0D(obj) + 1);
            case 6:
                return null;
            default:
                return obj;
        }
    }
}
