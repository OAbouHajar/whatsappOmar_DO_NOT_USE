package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass21B;
import X.C16730tY;
import X.C16750ta;
import X.C27711Sv;
import X.C30771cv;
import X.C31761ez;
import X.C42051x9;
import X.C47512Jh;
import X.C87644Xx;
import android.util.Pair;

public class IDxMModifierShape234S0100000_2_I0 implements C47512Jh {
    public Object A00;
    public final int A01;

    public IDxMModifierShape234S0100000_2_I0(C27711Sv r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final boolean A56(C16750ta r5, C16730tY r6, Object obj) {
        switch (this.A01) {
            case 0:
                C42051x9 r7 = (C42051x9) obj;
                if (r6.A0U == null) {
                    r6.A0h(new C30771cv());
                }
                C30771cv r2 = r6.A0U;
                r2.A0A = r7.A02;
                Pair pair = r7.A01;
                if (pair == null) {
                    return true;
                }
                r2.A01 = AnonymousClass000.A0D(pair.first);
                r2.A00 = AnonymousClass000.A0D(pair.second);
                return true;
            case 1:
                C27711Sv r1 = (C27711Sv) this.A00;
                AnonymousClass21B r72 = (AnonymousClass21B) obj;
                C31761ez r3 = r72.A02;
                r1.A02(r5, r3, r6);
                int i2 = r72.A00;
                if (i2 == 0) {
                    if (r3.A06() != null) {
                        r6.A08 = r3.A06();
                    }
                    if (r3.A03() != null) {
                        r5.A0G = r1.A03.A00(r3.A03());
                    }
                } else if (i2 == 12 && r6.A12() != null) {
                    r6.A12().A01();
                }
                if (C87644Xx.A01(i2)) {
                    return true;
                }
                r5.A0L = false;
                return true;
            default:
                int A0D = AnonymousClass000.A0D(obj);
                r5.A0Z = false;
                if (A0D != 0) {
                    return true;
                }
                r5.A0P = true;
                return true;
        }
    }
}
