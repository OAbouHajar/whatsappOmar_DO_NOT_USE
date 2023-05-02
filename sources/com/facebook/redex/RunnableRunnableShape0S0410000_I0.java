package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1P8;
import X.C15830rv;
import X.C16060sN;
import X.C16460t6;
import X.C16730tY;
import X.C16750ta;
import X.C17240ul;
import X.C17390v0;
import X.C18020w1;
import X.C19150xq;
import X.C209212c;
import X.C209612g;
import X.C209712h;
import X.C28031Ub;
import X.C28851Ya;
import X.C30641ci;
import X.C30761cu;
import X.C30981dH;
import X.C35361lo;
import X.C47272Ih;
import com.obwhatsapp.data.device.DeviceChangeManager;
import com.whatsapp.jid.DeviceJid;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RunnableRunnableShape0S0410000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public RunnableRunnableShape0S0410000_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2, boolean z2) {
        this.A05 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A04 = z2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public final void run() {
        switch (this.A05) {
            case 0:
                C16460t6 r5 = (C16460t6) this.A00;
                Collection collection = (Collection) this.A01;
                boolean z2 = this.A04;
                HashMap hashMap = (HashMap) this.A02;
                Set<C15830rv> set = (Set) this.A03;
                C19150xq r0 = r5.A0r;
                if (!z2) {
                    hashMap = null;
                }
                r0.A0A(collection, hashMap);
                for (C15830rv A032 : set) {
                    r5.A0C.A03(A032, false);
                }
                return;
            case 1:
                DeviceChangeManager deviceChangeManager = (DeviceChangeManager) this.A00;
                C17390v0 r6 = (C17390v0) this.A02;
                boolean z3 = this.A04;
                C15830rv r4 = (C15830rv) this.A03;
                for (C16060sN r3 : (Set) this.A01) {
                    C28031Ub it = r6.iterator();
                    while (true) {
                        boolean z4 = false;
                        while (true) {
                            if (it.hasNext()) {
                                if (deviceChangeManager.A05.A0g(new C30981dH(C28851Ya.A02((DeviceJid) it.next()), r3.getRawString()), false) || z4) {
                                    z4 = true;
                                }
                            } else if (z4 && !z3) {
                                C18020w1 r2 = deviceChangeManager.A01;
                                int i2 = 8;
                                if (deviceChangeManager.A00.A0I(r4)) {
                                    i2 = 7;
                                }
                                r2.A0H(r3, Integer.valueOf(i2));
                            }
                        }
                    }
                }
                return;
            case 2:
                C17240ul r62 = (C17240ul) this.A00;
                C16060sN r52 = (C16060sN) this.A01;
                boolean z5 = this.A04;
                C30641ci r32 = (C30641ci) this.A03;
                if (r62.A0O.A0g(new C30981dH(C28851Ya.A02((DeviceJid) this.A02), r52.getRawString()), false)) {
                    r62.A09.A0H(r52, 1);
                }
                if (z5) {
                    r62.A0s.A02(r32);
                    return;
                }
                return;
            case 3:
                C209212c r53 = (C209212c) this.A00;
                C30761cu r42 = (C30761cu) this.A01;
                C16730tY r33 = (C16730tY) this.A02;
                boolean z6 = this.A04;
                C209212c.A00(r42, r33, false);
                AnonymousClass1P8 r1 = r53.A0W;
                C16750ta r02 = r33.A02;
                HashMap hashMap2 = r1.A00;
                synchronized (hashMap2) {
                    hashMap2.remove(r02);
                }
                AnonymousClass00B.A06(r42.A01());
                r53.A0A(r33, r42.A01().A01, z6);
                return;
            default:
                C209712h r43 = (C209712h) this.A00;
                C47272Ih r34 = (C47272Ih) this.A01;
                C35361lo r22 = (C35361lo) this.A02;
                File file = (File) this.A03;
                boolean z7 = this.A04;
                if (r34 != null) {
                    r34.AMZ(r22, file);
                }
                if (!z7) {
                    C209612g r03 = r43.A0A;
                    if (file != null) {
                        r03.A04();
                        return;
                    }
                    Iterator it2 = r03.A01().iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    return;
                }
                return;
        }
    }
}
