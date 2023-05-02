package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass15W;
import X.AnonymousClass1K6;
import X.AnonymousClass1KO;
import X.AnonymousClass1M1;
import X.AnonymousClass1Y3;
import X.AnonymousClass29T;
import X.AnonymousClass3K4;
import X.AnonymousClass5PJ;
import X.C14600pS;
import X.C14960q4;
import X.C14990q7;
import X.C16010sH;
import X.C16320sq;
import X.C31201dg;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.Me;
import java.util.ArrayList;

public class IDxCListenerShape4S0400000_2_I0 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxCListenerShape4S0400000_2_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass1M1 r4;
        Activity activity;
        C14600pS r2;
        C16010sH r1;
        boolean z2;
        String A0h;
        switch (this.A04) {
            case 0:
                Activity activity2 = (Activity) this.A00;
                AnonymousClass1KO r42 = (AnonymousClass1KO) this.A01;
                Me me = (Me) this.A03;
                boolean A002 = ((AnonymousClass15W) this.A02).A00();
                StringBuilder A0r = AnonymousClass000.A0r("catalog not available");
                if (me == null) {
                    A0h = "";
                } else {
                    StringBuilder A0r2 = AnonymousClass000.A0r(" +");
                    A0r2.append(me.cc);
                    A0h = AnonymousClass000.A0h(me.number, A0r2);
                }
                activity2.startActivity(r42.A00(activity2, (Bundle) null, (AnonymousClass1Y3) null, (Integer) null, AnonymousClass000.A0h(A0h, A0r), (String) null, (ArrayList) null, (ArrayList) null, A002));
                return;
            case 4:
                r4 = (AnonymousClass1M1) this.A00;
                activity = (Activity) this.A01;
                r2 = (C14600pS) this.A02;
                r1 = (C16010sH) this.A03;
                AnonymousClass29T.A00(activity, 10);
                z2 = true;
                break;
            case 5:
                r4 = (AnonymousClass1M1) this.A00;
                activity = (Activity) this.A01;
                r2 = (C14600pS) this.A02;
                r1 = (C16010sH) this.A03;
                AnonymousClass29T.A00(activity, 10);
                z2 = false;
                break;
            case 6:
                AnonymousClass3K4.A0u((C16320sq) this.A00, this.A01, this.A02, 18);
                dialogInterface.dismiss();
                ((AnonymousClass5PJ) this.A03).A6E();
                return;
            default:
                AnonymousClass1K6.A09((C14990q7) this.A02, (C14960q4) this.A03, (C31201dg) this.A01);
                return;
        }
        r4.A01(activity, r2, r1, z2);
    }
}
