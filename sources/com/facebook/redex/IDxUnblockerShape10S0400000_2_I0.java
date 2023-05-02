package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass01Y;
import X.AnonymousClass1ZI;
import X.C103064zy;
import X.C108605Oq;
import X.C13690nt;
import X.C227819g;
import X.C35301lh;
import android.app.Activity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

public class IDxUnblockerShape10S0400000_2_I0 implements C108605Oq {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxUnblockerShape10S0400000_2_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    public final void AhA() {
        switch (this.A04) {
            case 0:
                Activity activity = (Activity) this.A00;
                ((AnonymousClass01Y) this.A01).A0H(activity, new IDxCCallbackShape66S0200000_2_I1(C13690nt.A0h(activity), 1, this.A02), (UserJid) this.A03);
                return;
            case 1:
                AnonymousClass01Y r1 = ((C227819g) this.A00).A00;
                UserJid of = UserJid.of((Jid) this.A03);
                AnonymousClass00B.A06(of);
                r1.A0H((Activity) this.A01, (AnonymousClass1ZI) this.A02, of);
                return;
            default:
                C227819g r3 = (C227819g) this.A00;
                Activity activity2 = (Activity) this.A01;
                C35301lh r2 = (C35301lh) this.A02;
                AnonymousClass1ZI r12 = (AnonymousClass1ZI) this.A03;
                r3.A04.A03().AB4().Ahg(activity2, new C103064zy(r12), r3.A03, (String) (r2 == null ? null : r2.A00), false);
                return;
        }
    }
}
