package com.whatsapp.util;

import X.AnonymousClass000;
import X.AnonymousClass1VJ;
import X.AnonymousClass1WD;
import X.AnonymousClass4P9;
import X.C108495Of;
import X.C13680ns;
import X.C14730pf;
import X.C15830rv;
import X.C15860rz;
import X.C15910s6;
import X.C16590tJ;
import X.C16690tT;
import X.C19410yO;
import X.C209712h;
import X.C25721Kw;
import X.C47302Ik;
import X.C57292qf;
import X.C811547b;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IDxATaskShape26S0200000_2_I0 extends C16690tT {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxATaskShape26S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C19410yO r0;
        switch (this.A02) {
            case 0:
                AnonymousClass4P9 r1 = (AnonymousClass4P9) this.A00;
                C14730pf r02 = r1.A04;
                long A03 = r02.A03();
                long A012 = r02.A01();
                r1.A07.A00.A02(C15910s6.A1M);
                return new AnonymousClass1VJ(new C811547b(), A03, A012);
            case 1:
                HashSet A0o = C13680ns.A0o();
                Iterator it = ((Set) this.A01).iterator();
                while (it.hasNext()) {
                    C15830rv A022 = C15830rv.A02(AnonymousClass000.A0m(it));
                    if (A022 != null) {
                        A0o.add(((C57292qf) this.A00).A04.A01(A022));
                    }
                }
                return A0o;
            case 2:
                r0 = (C19410yO) this.A00;
                break;
            case 3:
                return ((C209712h) this.A00).A07.A00();
            default:
                r0 = ((C25721Kw) this.A00).A04;
                break;
        }
        return Boolean.valueOf(!r0.A07().isEmpty());
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        switch (this.A02) {
            case 0:
                AnonymousClass1VJ r4 = (AnonymousClass1VJ) obj;
                ((AnonymousClass4P9) this.A00).A00 = r4;
                C108495Of r0 = (C108495Of) this.A01;
                if (r4 != null) {
                    r0.APL(r4);
                    return;
                }
                return;
            case 1:
                Set set = (Set) obj;
                C57292qf r2 = (C57292qf) this.A00;
                r2.A01 = set;
                r2.A08.A09(Collections.unmodifiableSet(set));
                r2.A05();
                return;
            case 2:
                ((AnonymousClass1WD) this.A01).A02(obj);
                return;
            case 3:
                Set set2 = (Set) obj;
                C209712h r22 = (C209712h) this.A00;
                if (set2 != null) {
                    C15860rz r1 = r22.A02;
                    r1.A1R(false);
                    r1.A0x("payment_backgrounds_batch_last_fetch_timestamp");
                    r22.A0A.A06(set2);
                } else {
                    Iterator A002 = C16590tJ.A00(r22.A0A);
                    while (A002.hasNext()) {
                        A002.next();
                    }
                }
                C47302Ik r02 = (C47302Ik) this.A01;
                if (r02 != null && set2 != null) {
                    r02.ATm(set2);
                    return;
                }
                return;
            default:
                ((View) this.A01).setVisibility(C13680ns.A02(((Boolean) obj).booleanValue() ? 1 : 0));
                return;
        }
    }
}
