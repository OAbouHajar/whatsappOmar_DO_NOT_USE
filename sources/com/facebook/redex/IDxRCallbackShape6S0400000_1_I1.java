package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01D;
import X.AnonymousClass3BT;
import X.C13680ns;
import X.C16050sL;
import X.C16300so;
import X.C17240ul;
import X.C17780vd;
import X.C19550yc;
import X.C28371Vv;
import X.C34451kH;
import X.C40821uk;
import X.C40841um;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.HashMap;

public class IDxRCallbackShape6S0400000_1_I1 implements C19550yc {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxRCallbackShape6S0400000_1_I1(C40821uk r1, C17780vd r2, C40841um r3, Runnable runnable, int i2) {
        this.A04 = i2;
        this.A00 = r2;
        if (i2 != 0) {
            this.A01 = r1;
            this.A02 = r3;
            this.A03 = runnable;
        } else {
            this.A01 = r3;
            this.A02 = runnable;
            this.A03 = r1;
        }
    }

    public void APb(String str) {
        StringBuilder A0r;
        Object obj;
        if (this.A04 != 0) {
            A0r = AnonymousClass000.A0r("GroupIqResponseUtil/add-admin/delivery fail; groupId=");
            obj = this.A01;
        } else {
            A0r = AnonymousClass000.A0r("GroupIqResponseUtil/remove-participants/delivery fail; groupId=");
            obj = this.A03;
        }
        A0r.append(((C40821uk) obj).A01);
        C13680ns.A1V(A0r);
    }

    public void AQe(C28371Vv r3, String str) {
        ((C40841um) (this.A04 != 0 ? this.A02 : this.A01)).Ach(C34451kH.A00(r3));
    }

    public void AYG(C28371Vv r9, String str) {
        Object obj;
        Object obj2;
        if (this.A04 != 0) {
            C17780vd r3 = (C17780vd) this.A00;
            AnonymousClass01D r7 = r3.A04;
            boolean A0m = ((C17240ul) r7.get()).A0m(((C40821uk) this.A01).A01);
            C16300so r1 = r3.A00;
            C16050sL r5 = (C16050sL) r9.A0F(r1, C16050sL.class, "from");
            if (r5 == null) {
                obj2 = this.A02;
            } else {
                HashMap A0x = AnonymousClass000.A0x();
                HashMap A0x2 = AnonymousClass000.A0x();
                AnonymousClass3BT.A01(r1, r9, A0m ? "admin" : "promote", A0x, A0x2);
                C17240ul r2 = (C17240ul) r7.get();
                StringBuilder A0r = AnonymousClass000.A0r("groupmgr/onPromoteGroupParticipants/");
                A0r.append(r5);
                Log.i(AnonymousClass000.A0h(C13680ns.A0k(A0r, A0x, A0x2), A0r));
                if (A0x2.size() > 0) {
                    int i2 = 3003;
                    if (r2.A0m(r5)) {
                        i2 = 3019;
                    }
                    C17240ul.A01(i2, A0x2);
                }
                obj = this.A03;
                ((Runnable) obj).run();
                return;
            }
        } else {
            C17780vd r52 = (C17780vd) this.A00;
            C16300so r12 = r52.A00;
            Jid A0F = r9.A0F(r12, C16050sL.class, "from");
            if (A0F == null) {
                obj2 = this.A01;
            } else {
                HashMap A0x3 = AnonymousClass000.A0x();
                HashMap A0x4 = AnonymousClass000.A0x();
                AnonymousClass3BT.A01(r12, r9, "remove", A0x3, A0x4);
                r52.A04.get();
                StringBuilder A0r2 = AnonymousClass000.A0r("groupmgr/onRemoveGroupParticipants/");
                A0r2.append(A0F);
                Log.i(AnonymousClass000.A0h(C13680ns.A0k(A0r2, A0x3, A0x4), A0r2));
                if (A0x4.size() > 0) {
                    C17240ul.A01(3002, A0x4);
                }
                obj = this.A02;
                ((Runnable) obj).run();
                return;
            }
        }
        ((C40841um) obj2).Ach(800);
    }
}
