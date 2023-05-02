package com.obwhatsapp.businessproductlist.view.adapter;

import X.AnonymousClass013;
import X.AnonymousClass05T;
import X.AnonymousClass2GE;
import X.AnonymousClass2JP;
import X.AnonymousClass2XU;
import X.AnonymousClass4D4;
import X.AnonymousClass4K6;
import X.AnonymousClass5RY;
import X.C001300o;
import X.C005602k;
import X.C011405n;
import X.C108585Oo;
import X.C13680ns;
import X.C16040sK;
import X.C17170ue;
import X.C18450wi;
import X.C32201fo;
import X.C35701mM;
import X.C50072Xv;
import X.C50262Yq;
import X.C59652yh;
import X.C65123Sy;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

public final class BusinessProductListAdapter extends AnonymousClass2XU implements C32201fo, AnonymousClass05T {
    public final C001300o A00;
    public final C108585Oo A01;
    public final AnonymousClass5RY A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BusinessProductListAdapter(X.C001300o r14, X.C19980zJ r15, X.C14870pt r16, X.C16040sK r17, X.C17170ue r18, X.AnonymousClass1KA r19, X.C50262Yq r20, X.C108585Oo r21, X.AnonymousClass5RY r22, X.C16000sG r23, X.C17030uP r24, X.C16080sP r25, X.AnonymousClass013 r26, com.whatsapp.jid.UserJid r27) {
        /*
            r13 = this;
            r0 = 2
            r3 = r16
            X.C18450wi.A0H(r3, r0)
            r0 = 3
            r4 = r17
            X.C18450wi.A0H(r4, r0)
            r0 = 4
            r2 = r15
            X.C18450wi.A0H(r15, r0)
            r0 = 5
            r6 = r19
            X.C18450wi.A0H(r6, r0)
            r0 = 6
            r8 = r23
            X.C18450wi.A0H(r8, r0)
            r0 = 7
            r10 = r25
            X.C18450wi.A0H(r10, r0)
            r0 = 8
            r11 = r26
            X.C18450wi.A0H(r11, r0)
            r0 = 9
            r9 = r24
            X.C18450wi.A0H(r9, r0)
            r0 = 10
            r5 = r18
            X.C18450wi.A0H(r5, r0)
            r1 = r13
            r7 = r20
            r12 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r22
            r13.A02 = r0
            r0 = r21
            r13.A01 = r0
            r13.A00 = r14
            r13.A0J()
            X.04q r0 = r14.getLifecycle()
            r0.A00(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessproductlist.view.adapter.BusinessProductListAdapter.<init>(X.00o, X.0zJ, X.0pt, X.0sK, X.0ue, X.1KA, X.2Yq, X.5Oo, X.5RY, X.0sG, X.0uP, X.0sP, X.013, com.whatsapp.jid.UserJid):void");
    }

    public C65123Sy A0F(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        if (i2 != 5) {
            return super.A0F(viewGroup, i2);
        }
        Context context = viewGroup.getContext();
        UserJid userJid = this.A05;
        C16040sK r2 = this.A02;
        AnonymousClass013 r10 = this.A05;
        C50262Yq r5 = this.A04;
        C17170ue r3 = this.A01;
        AnonymousClass5RY r9 = this.A02;
        C108585Oo r8 = this.A01;
        AnonymousClass4D4 r4 = new AnonymousClass4D4(897460087);
        View A0H = C13680ns.A0H(LayoutInflater.from(context), viewGroup, R.layout.layout00c1);
        AnonymousClass2JP.A02(A0H);
        return new C59652yh(A0H, r2, r3, r4, r5, this, this, r8, r9, r10, userJid);
    }

    public final void A0Q(List list) {
        List list2 = this.A00;
        if (list2.isEmpty()) {
            A0L((AnonymousClass2GE) null, list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C35701mM r4 = (C35701mM) it.next();
            C18450wi.A0H(r4, 0);
            if (r4.A01()) {
                list2.add(list2.size() - 1, new C50072Xv(r4, A0E(r4.A0D)));
                A03(list2.size() - 1);
            }
        }
    }

    public AnonymousClass4K6 AAj(int i2) {
        if (this.A00.get(0) instanceof C50072Xv) {
            return new AnonymousClass4K6((String) null, String.valueOf(i2), (String) null);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return A0F(viewGroup, i2);
    }

    public void AXa(C011405n r3, C001300o r4) {
        C18450wi.A0H(r3, 1);
        if (r3.ordinal() == 5) {
            this.A00.getLifecycle().A01(this);
            this.A04.A00();
        }
    }
}
