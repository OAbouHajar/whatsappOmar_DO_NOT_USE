package com.whatsapp.util;

import X.AnonymousClass00B;
import X.AnonymousClass1P7;
import X.AnonymousClass2BW;
import X.C14550pN;
import X.C14750ph;
import X.C15830rv;
import X.C16050sL;
import X.C16070sO;
import X.C16740tZ;
import X.C34331k5;
import X.C64723Rk;
import X.C75893st;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.obwhatsapp.components.InviteViaLinkView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

public class ViewOnClickCListenerShape1S0400000_I1 extends C34331k5 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public ViewOnClickCListenerShape1S0400000_I1(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
    }

    public void A06(View view) {
        Intent A0m;
        switch (this.A04) {
            case 0:
                C75893st r1 = (C75893st) this.A03;
                if (r1 != null) {
                    r1.A0B = Boolean.TRUE;
                }
                AnonymousClass2BW.A00((C14550pN) this.A01, ((InviteViaLinkView) this.A00).A00, (C15830rv) this.A02);
                return;
            case 1:
                C15830rv r12 = ((C16740tZ) this.A02).A11.A00;
                AnonymousClass00B.A06(r12);
                ((AnonymousClass1P7) this.A01).A07((Context) this.A00, r12, (UserJid) this.A03);
                return;
            default:
                Context context = ((View) this.A03).getContext();
                boolean A0A = ((C16070sO) this.A01).A0A((GroupJid) this.A02);
                C64723Rk r0 = (C64723Rk) this.A00;
                if (A0A) {
                    A0m = C14750ph.A0O(context, r0.A00);
                } else {
                    C16050sL r2 = r0.A00;
                    A0m = C14750ph.A0m(context, (Collection) null, 9);
                    A0m.putExtra("parent_group_jid_to_link", r2.getRawString());
                }
                context.startActivity(A0m, (Bundle) null);
                return;
        }
    }
}
