package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass025;
import X.AnonymousClass027;
import X.AnonymousClass1XY;
import X.AnonymousClass1ZR;
import X.AnonymousClass2B6;
import X.AnonymousClass2XQ;
import X.C14600pS;
import X.C16050sL;
import X.C30991dI;
import X.C41681wN;
import X.C42391xi;
import X.C56052ks;
import X.C56062kt;
import com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.obwhatsapp.status.viewmodels.StatusesViewModel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IDxFunctionShape206S0100000_2_I0 implements AnonymousClass025 {
    public Object A00;
    public final int A01;

    public IDxFunctionShape206S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object apply(Object obj) {
        String str;
        switch (this.A01) {
            case 0:
                C56052ks r0 = (C56052ks) this.A00;
                C56062kt r13 = (C56062kt) obj;
                C14600pS r1 = r0.A02;
                r1.Ac1();
                Set singleton = Collections.singleton(r0.A0K);
                int i2 = r13.A00;
                C16050sL r5 = r13.A01;
                int i3 = 0;
                if (r5 != null) {
                    i3 = 2;
                }
                r1.Afb(LeaveGroupsDialogFragment.A01(r5, (String) null, singleton, i2, i3, false, true), (String) null);
                return null;
            case 1:
                C41681wN r02 = (C41681wN) this.A00;
                AnonymousClass1ZR r6 = (AnonymousClass1ZR) obj;
                if (r6 == null || (str = r6.A0W) == null || !str.equals(r02.A05)) {
                    return null;
                }
                return r6;
            case 2:
                AnonymousClass2B6 r12 = (AnonymousClass2B6) this.A00;
                AnonymousClass1XY r132 = (AnonymousClass1XY) obj;
                C42391xi r3 = (C42391xi) r132.A01;
                if (r3.A04 != null) {
                    return AnonymousClass000.A0u();
                }
                AnonymousClass027 r2 = r12.A09;
                r2.A09(Boolean.TRUE);
                List A0I = r12.A0H.A0I(r132.A00, r3);
                r2.A09(Boolean.FALSE);
                return A0I;
            default:
                Set set = ((StatusesViewModel) this.A00).A04;
                HashMap A0x = AnonymousClass000.A0x();
                Iterator A0y = AnonymousClass000.A0y((Map) obj);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass000.A0z(A0y);
                    Object key = A0z.getKey();
                    A0x.put(key, new AnonymousClass2XQ((C30991dI) A0z.getValue(), set.contains(key)));
                }
                return A0x;
        }
    }
}
