package com.facebook.redex;

import X.AnonymousClass13O;
import X.AnonymousClass1HE;
import X.AnonymousClass1WE;
import X.C101884y2;
import X.C13680ns;
import X.C16730tY;
import X.C16740tZ;
import X.C209212c;
import X.C27711Sv;
import X.C28371Vv;
import X.C30671cl;
import X.C43241zg;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IDxNConsumerShape17S0300000_2_I0 implements AnonymousClass1WE {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxNConsumerShape17S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void accept(Object obj) {
        AnonymousClass1HE r5;
        C43241zg r4;
        CopyOnWriteArrayList copyOnWriteArrayList;
        C27711Sv r2;
        int i2;
        switch (this.A03) {
            case 0:
                AnonymousClass1HE r7 = (AnonymousClass1HE) this.A00;
                Runnable runnable = (Runnable) this.A02;
                for (C16730tY r42 : (List) this.A01) {
                    if (C27711Sv.A01(r42, true)) {
                        r7.A07.A08(r42, -1);
                        r7.A0O.Acl(new RunnableRunnableShape0S0211000_I0(r7, r42, 7, false));
                    }
                }
                runnable.run();
                return;
            case 1:
                AnonymousClass1HE r43 = (AnonymousClass1HE) this.A00;
                C43241zg r3 = (C43241zg) this.A01;
                r3.A01.size();
                C27711Sv.A00(r3, new IDxMModifierShape233S0100000_1_I1(r43.A0E, 0), obj);
                r43.A01.A0K(new RunnableRunnableShape8S0200000_I0_6(r43, 22, r3));
                return;
            case 2:
                r5 = (AnonymousClass1HE) this.A00;
                r4 = (C43241zg) this.A01;
                copyOnWriteArrayList = r4.A01;
                copyOnWriteArrayList.size();
                r2 = r5.A0E;
                i2 = 2;
                break;
            case 3:
                AnonymousClass1HE r52 = (AnonymousClass1HE) this.A00;
                C43241zg r44 = (C43241zg) this.A01;
                CopyOnWriteArrayList copyOnWriteArrayList2 = r44.A01;
                copyOnWriteArrayList2.size();
                C27711Sv.A00(r44, new IDxMModifierShape233S0100000_1_I1(r52.A0E, 1), obj);
                Iterator it = Collections.unmodifiableList(copyOnWriteArrayList2).iterator();
                while (it.hasNext()) {
                    r52.A06.A0e(C13680ns.A0V(it), -1);
                }
                return;
            case 4:
                r5 = (AnonymousClass1HE) this.A00;
                r4 = (C43241zg) this.A01;
                copyOnWriteArrayList = r4.A01;
                copyOnWriteArrayList.size();
                r2 = r5.A0E;
                i2 = 3;
                break;
            case 5:
                r5 = (AnonymousClass1HE) this.A00;
                r4 = (C43241zg) this.A01;
                copyOnWriteArrayList = r4.A01;
                copyOnWriteArrayList.size();
                r2 = r5.A0E;
                i2 = 1;
                break;
            case 6:
                C209212c r6 = (C209212c) this.A00;
                C16740tZ r53 = (C16740tZ) this.A01;
                Object obj2 = this.A02;
                if (!(r53.A0F() == null || obj == null)) {
                    r6.A0e.A02(r53.A0F(), new RunnableRunnableShape1S0300000_I0_1(r53, obj, obj2, 23));
                }
                r6.A05.A0K(new RunnableRunnableShape0S0201000_I0((Object) r6.A0J, 12, (Object) r53, 28));
                return;
            default:
                AnonymousClass13O r45 = (AnonymousClass13O) this.A00;
                r45.A0F.A01().A02(new C101884y2(r45, (C28371Vv) this.A01), (C30671cl) this.A02);
                return;
        }
        C27711Sv.A00(r4, new IDxMModifierShape235S0100000_2_I1(r2, i2), obj);
        r5.A07.A09(copyOnWriteArrayList, -1);
    }
}
