package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass01Y;
import X.AnonymousClass1ZI;
import X.AnonymousClass3K3;
import X.C108605Oq;
import X.C16010sH;
import X.C16740tZ;
import X.C19980zJ;
import X.C30011bb;
import X.C32501gU;
import X.C601130c;
import android.app.Activity;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;

public class IDxUnblockerShape77S0200000_2_I1 implements C108605Oq {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxUnblockerShape77S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void AhA() {
        switch (this.A02) {
            case 0:
                C32501gU r2 = (C32501gU) this.A00;
                AnonymousClass3K3.A0z(r2, r2.A06, (C16010sH) this.A01);
                return;
            case 1:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                AnonymousClass01Y r1 = contactPickerFragment.A0a;
                AnonymousClass3K3.A0z(contactPickerFragment.A0C(), r1, (C16010sH) this.A01);
                return;
            case 2:
                C30011bb r12 = (C30011bb) this.A00;
                AnonymousClass01Y r22 = r12.A0V;
                Activity A022 = C19980zJ.A02(r12);
                UserJid userJid = ((C16740tZ) this.A01).A0L.A0D;
                AnonymousClass00B.A06(userJid);
                r22.A0K(A022, UserJid.of(userJid));
                return;
            default:
                C601130c r0 = (C601130c) this.A00;
                AnonymousClass01Y r23 = r0.A0V;
                AnonymousClass1ZI r13 = r0.A03;
                UserJid of = UserJid.of(r0.A05);
                AnonymousClass00B.A06(of);
                r23.A0H((Activity) this.A01, r13, of);
                return;
        }
    }
}
