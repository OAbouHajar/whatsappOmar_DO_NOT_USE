package com.facebook.redex;

import X.AnonymousClass35C;
import X.AnonymousClass35D;
import X.AnonymousClass5QQ;
import X.C34151jm;
import java.util.Iterator;
import java.util.List;

public class IDxRListenerShape462S0100000_2_I1 implements AnonymousClass5QQ {
    public Object A00;
    public final int A01;

    public IDxRListenerShape462S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AXm(List list) {
        List list2;
        List list3;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            AnonymousClass35C r3 = (AnonymousClass35C) obj;
            if (r3.A08 && (list3 = r3.A03) != null && !list3.isEmpty()) {
                Iterator it = r3.A03.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("loading-hash".equals(((C34151jm) it.next()).A0D)) {
                        List list4 = r3.A03;
                        if (list4 != null) {
                            r3.A05(list4);
                            return;
                        }
                    }
                }
            }
            r3.A05(list);
            return;
        }
        AnonymousClass35D r32 = (AnonymousClass35D) obj;
        if (r32.A0D && (list2 = r32.A06) != null && !list2.isEmpty()) {
            Iterator it2 = r32.A06.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if ("loading-hash".equals(((C34151jm) it2.next()).A0D)) {
                    List list5 = r32.A06;
                    if (list5 != null) {
                        r32.A05(list5);
                        return;
                    }
                }
            }
        }
        r32.A05(list);
    }
}
