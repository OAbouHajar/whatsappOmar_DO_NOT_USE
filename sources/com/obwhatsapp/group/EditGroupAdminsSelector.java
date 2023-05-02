package com.obwhatsapp.group;

import X.AnonymousClass00B;
import X.AnonymousClass1V8;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C16150sX;
import X.C28031Ub;
import X.C30661ck;
import X.C49132Rg;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class EditGroupAdminsSelector extends AnonymousClass1V8 {
    public C16070sO A00;
    public boolean A01;

    public EditGroupAdminsSelector() {
        this(0);
    }

    public EditGroupAdminsSelector(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 70);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0g(r1, C14530pL.A0D(r1, this), this);
            this.A00 = C16150sX.A0e(r1);
        }
    }

    public void A3Z(ArrayList arrayList) {
        String stringExtra = getIntent().getStringExtra("gid");
        AnonymousClass00B.A06(stringExtra);
        C16050sL A05 = C16050sL.A05(stringExtra);
        if (A05 != null) {
            C28031Ub it = C16070sO.A00(this.A00, A05).A04().iterator();
            while (it.hasNext()) {
                C30661ck r1 = (C30661ck) it.next();
                C16040sK r0 = this.A01;
                UserJid userJid = r1.A03;
                if (!r0.A0I(userJid) && r1.A01 != 2) {
                    arrayList.add(this.A0J.A0A(userJid));
                }
            }
        }
    }
}
