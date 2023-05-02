package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass01Y;
import X.AnonymousClass1ZI;
import X.AnonymousClass2X0;
import X.C108605Oq;
import X.C14530pL;
import X.C18450wi;
import android.app.Activity;
import com.obwhatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

public class IDxUnblockerShape35S0300000_2_I1 implements C108605Oq {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxUnblockerShape35S0300000_2_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void AhA() {
        switch (this.A03) {
            case 0:
                ((AnonymousClass01Y) this.A00).A0K((Activity) this.A01, (UserJid) this.A02);
                return;
            case 1:
                SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = (SharePhoneNumberBottomSheet) this.A00;
                Activity activity = (Activity) this.A01;
                AnonymousClass1ZI r2 = (AnonymousClass1ZI) this.A02;
                AnonymousClass01Y r1 = sharePhoneNumberBottomSheet.A00;
                if (r1 != null) {
                    UserJid of = UserJid.of((Jid) sharePhoneNumberBottomSheet.A03.getValue());
                    AnonymousClass00B.A06(of);
                    r1.A0H(activity, r2, of);
                    return;
                }
                throw C18450wi.A03("blockListManager");
            default:
                AnonymousClass2X0 r12 = (AnonymousClass2X0) this.A00;
                AnonymousClass01Y r22 = r12.A02;
                C14530pL r13 = r12.A01;
                UserJid of2 = UserJid.of((Jid) this.A02);
                AnonymousClass00B.A06(of2);
                r22.A0H(r13, (AnonymousClass1ZI) this.A01, of2);
                return;
        }
    }
}
