package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1ME;
import X.AnonymousClass1Vt;
import X.AnonymousClass1W2;
import X.AnonymousClass3AW;
import X.AnonymousClass5vR;
import X.C004601z;
import X.C110105dW;
import X.C110115dX;
import X.C110315ds;
import X.C110755em;
import X.C111855hW;
import X.C117395sv;
import X.C117725tS;
import X.C15830rv;
import X.C16010sH;
import X.C16830ti;
import X.C227319b;
import X.C228919r;
import X.C28391Vx;
import X.C29501aj;
import X.C30801cy;
import X.C35421lu;
import X.C35611mD;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class IDxCListenerShape27S0300000_3_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape27S0300000_3_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onClick(View view) {
        C110755em r3;
        AnonymousClass1W2 r2;
        AnonymousClass1Vt r1;
        int i2;
        C117725tS A002;
        C30801cy r0;
        String str;
        int AB9;
        switch (this.A03) {
            case 0:
                ((View) this.A00).getRootView().setVisibility(8);
                ((AnonymousClass5vR) this.A01).A01.APu(((AnonymousClass5vR) this.A02).A02);
                return;
            case 1:
                AnonymousClass3AW r12 = new AnonymousClass3AW(view, (C15830rv) ((C16010sH) this.A01).A08(C15830rv.class), (Integer) null);
                r12.A04 = C004601z.A0L(((C117395sv) this.A02).A00);
                r12.A02(((C110315ds) this.A00).A02);
                return;
            case 2:
                r3 = (C110755em) this.A00;
                r2 = (AnonymousClass1W2) this.A01;
                r1 = (AnonymousClass1Vt) this.A02;
                i2 = 27;
                break;
            case 3:
                C110755em r6 = (C110755em) this.A00;
                AnonymousClass1Vt r32 = (AnonymousClass1Vt) this.A01;
                C111855hW r22 = (C111855hW) this.A02;
                C28391Vx A022 = r6.A0c.A02(r32.A0G);
                C228919r AEp = A022 != null ? A022.AEp(r32.A0I) : null;
                Context context = view.getContext();
                String str2 = r22.A0G;
                int i3 = r6.A00;
                if (AEp != null) {
                    Intent A04 = C110105dW.A04(context, AEp.AEv());
                    A04.putExtra("extra_transaction_id", str2);
                    C110115dX.A0r(A04, "payment_transaction_details");
                    A04.putExtra("extra_payment_flow_entry_point", i3);
                    context.startActivity(A04);
                    return;
                }
                return;
            case 4:
                r3 = (C110755em) this.A00;
                r2 = (AnonymousClass1W2) this.A01;
                r1 = (AnonymousClass1Vt) this.A02;
                i2 = 21;
                break;
            default:
                C110755em r8 = (C110755em) this.A00;
                AnonymousClass1Vt r7 = (AnonymousClass1Vt) this.A01;
                C227319b r62 = (C227319b) this.A02;
                AnonymousClass1ME r5 = r8.A0K;
                C35611mD r4 = r8.A03;
                if (r62 != null && (str = r7.A0J) != null) {
                    int A003 = C29501aj.A00(str, -1);
                    int i4 = r7.A02;
                    if ((i4 == 105 || i4 == 108) && (AB9 = r62.AB9(r5, r4, A003)) != -1) {
                        A002 = C117725tS.A00(AB9);
                        A002.A05 = r7;
                        r0 = r8.A09;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
        A002 = C117725tS.A00(i2);
        C35421lu r02 = r2.A02;
        AnonymousClass00B.A06(r02);
        A002.A0D = r02.A01;
        A002.A05 = r1;
        C16830ti r03 = r3.A07.A03;
        if (r03 != null) {
            A002.A08 = r03;
        }
        A002.A01 = r3.A00;
        r0 = r3.A09;
        r0.A0B(A002);
    }
}
