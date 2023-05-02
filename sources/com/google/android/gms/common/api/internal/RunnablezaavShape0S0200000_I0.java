package com.google.android.gms.common.api.internal;

import X.AnonymousClass3EC;
import X.AnonymousClass4O1;
import X.AnonymousClass56Z;
import X.AnonymousClass5UT;
import X.C108415Nw;
import X.C15020qC;
import X.C15700rh;
import X.C15750rn;
import X.C15770rp;
import X.C437721l;
import X.C57912sB;
import X.C65693Wf;
import X.C65703Wg;
import X.C66313Yw;
import X.C88594al;
import X.C98014qx;
import X.C98024qy;
import android.app.PendingIntent;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RunnablezaavShape0S0200000_I0 extends AnonymousClass56Z {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunnablezaavShape0S0200000_I0(C15020qC r2, ArrayList arrayList) {
        super(r2);
        this.A00 = r2;
        this.A01 = arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunnablezaavShape0S0200000_I0(C15020qC r2, Map map) {
        super(r2);
        this.A00 = r2;
        this.A01 = map;
    }

    public final void A00() {
        AnonymousClass5UT r1;
        Set hashSet;
        if (this.A02 != 0) {
            C15020qC r6 = (C15020qC) this.A00;
            AnonymousClass3EC r8 = r6.A0F;
            C57912sB r5 = r8.A05;
            AnonymousClass4O1 r12 = r6.A0G;
            if (r12 == null) {
                hashSet = Collections.emptySet();
            } else {
                hashSet = new HashSet(r12.A05);
                Map map = r12.A04;
                for (C437721l r2 : map.keySet()) {
                    if (!r8.A0A.containsKey(r2.A01)) {
                        map.get(r2);
                        throw new NullPointerException("zaa");
                    }
                }
            }
            r5.A03 = hashSet;
            AbstractList abstractList = (AbstractList) this.A01;
            int size = abstractList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C15750rn) abstractList.get(i2)).AFQ(r6.A04, r5.A03);
            }
            return;
        }
        C15020qC r3 = (C15020qC) this.A00;
        C88594al r52 = new C88594al(r3.A0D);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map2 = (Map) this.A01;
        for (C15750rn r13 : map2.keySet()) {
            if (!r13.AcL() || ((C98024qy) map2.get(r13)).A02) {
                arrayList2.add(r13);
            } else {
                arrayList.add(r13);
            }
        }
        int i3 = -1;
        int i4 = 0;
        if (arrayList.isEmpty()) {
            int size2 = arrayList2.size();
            while (i4 < size2) {
                i3 = r52.A00(r3.A0B, (C15750rn) arrayList2.get(i4));
                i4++;
                if (i3 == 0) {
                }
            }
            C15700rh r14 = new C15700rh(i3, (PendingIntent) null);
            AnonymousClass3EC r0 = r3.A0F;
            C65703Wg r22 = new C65703Wg(r14, this, r3);
            C66313Yw r15 = r0.A06;
            r15.sendMessage(r15.obtainMessage(1, r22));
            return;
        }
        int size3 = arrayList.size();
        while (true) {
            if (i4 < size3) {
                i3 = r52.A00(r3.A0B, (C15750rn) arrayList.get(i4));
                i4++;
                if (i3 != 0) {
                    break;
                }
            } else if (i3 == 0) {
            }
        }
        C15700rh r142 = new C15700rh(i3, (PendingIntent) null);
        AnonymousClass3EC r02 = r3.A0F;
        C65703Wg r222 = new C65703Wg(r142, this, r3);
        C66313Yw r152 = r02.A06;
        r152.sendMessage(r152.obtainMessage(1, r222));
        return;
        if (r3.A07 && (r1 = r3.A05) != null) {
            C15770rp r16 = (C15770rp) r1;
            r16.A6Y(new C98014qx(r16));
        }
        for (C15750rn r23 : map2.keySet()) {
            C108415Nw r17 = (C108415Nw) map2.get(r23);
            if (!r23.AcL() || r52.A00(r3.A0B, r23) == 0) {
                r23.A6Y(r17);
            } else {
                AnonymousClass3EC r03 = r3.A0F;
                C65693Wf r24 = new C65693Wf(r3, r17);
                C66313Yw r18 = r03.A06;
                r18.sendMessage(r18.obtainMessage(1, r24));
            }
        }
    }
}
