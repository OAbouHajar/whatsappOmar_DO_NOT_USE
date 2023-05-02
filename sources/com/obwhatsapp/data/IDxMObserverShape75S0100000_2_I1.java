package com.obwhatsapp.data;

import X.AnonymousClass028;
import X.AnonymousClass1VA;
import X.C13680ns;
import X.C15830rv;
import X.C16740tZ;
import X.C18450wi;
import X.C18940xV;
import X.C45692Af;
import X.C614238v;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.whatsapp.jid.GroupJid;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class IDxMObserverShape75S0100000_2_I1 extends C18940xV {
    public Object A00;
    public final int A01;

    public IDxMObserverShape75S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C15830rv r2, Collection collection, boolean z2) {
        if (2 - this.A01 != 0) {
            super.A00(r2, collection, z2);
        } else if (collection == null || !collection.isEmpty()) {
            ((C45692Af) this.A00).A36();
        }
    }

    public void A01(C16740tZ r2) {
        if (1 - this.A01 != 0) {
            super.A01(r2);
        } else {
            ((C45692Af) this.A00).A36();
        }
    }

    public void A06(C16740tZ r5, int i2) {
        if (this.A01 != 0) {
            super.A06(r5, i2);
            return;
        }
        C18450wi.A0H(r5, 0);
        C614238v r3 = (C614238v) this.A00;
        AnonymousClass028 r1 = r3.A02;
        Number number = (Number) r1.A01();
        if (number != null && number.intValue() == 0 && r5.A11.A02) {
            C13680ns.A1P(r1, 8);
            GroupJid groupJid = r3.A00;
            if (groupJid != null) {
                r3.A05.A00(groupJid, 6);
                r3.A00();
            }
        }
    }

    public void A07(C16740tZ r5, int i2) {
        switch (this.A01) {
            case 1:
                if (r5 == null) {
                    return;
                }
                if (i2 == 30 || r5.A06() == 1) {
                    C45692Af r3 = (C45692Af) this.A00;
                    r3.ADA().post(new RunnableRunnableShape5S0200000_I0_3(r3, 19, r5));
                    r3.A36();
                    return;
                }
                return;
            case 2:
                if (r5 != null && r5.A0x) {
                    AnonymousClass1VA r32 = (AnonymousClass1VA) this.A00;
                    r32.ADA().post(new RunnableRunnableShape5S0200000_I0_3(r32, 19, r5));
                    return;
                }
                return;
            default:
                super.A07(r5, i2);
                return;
        }
    }

    public void A08(Collection collection, Map map) {
        switch (this.A01) {
            case 1:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (C13680ns.A0V(it).A06() == 1) {
                        break;
                    }
                }
                return;
            case 2:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (C13680ns.A0V(it2).A0x) {
                        break;
                    }
                }
                return;
            default:
                super.A08(collection, map);
                return;
        }
        ((C45692Af) this.A00).A36();
    }
}
