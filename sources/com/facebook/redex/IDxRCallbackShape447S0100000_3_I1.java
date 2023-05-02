package com.facebook.redex;

import X.AnonymousClass29T;
import X.AnonymousClass2HJ;
import X.AnonymousClass5Q3;
import X.C110645ea;
import X.C114475np;
import X.C117705tQ;
import X.C1200260a;
import X.C1208263d;
import X.C1212064p;
import X.C13680ns;
import X.C14870pt;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class IDxRCallbackShape447S0100000_3_I1 implements AnonymousClass5Q3 {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape447S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AVy(AnonymousClass2HJ r6) {
        int i2;
        if (this.A01 != 0) {
            C110645ea r4 = (C110645ea) this.A00;
            if (r6 != null) {
                C14870pt r3 = r4.A0C;
                r3.A05();
                int i3 = r6.A00;
                int i4 = R.string.str1438;
                if (i3 == 443) {
                    i4 = R.string.str1168;
                }
                r3.A09(i4, 0);
                r4.A0A.A09(new C117705tQ(1));
                return;
            }
            r4.A0M.Acl(new C1212064p(r4));
            return;
        }
        C114475np r32 = (C114475np) this.A00;
        if (r6 == null || (i2 = r6.A00) != 11495) {
            AnonymousClass5Q3 r0 = r32.A02;
            if (r0 != null) {
                r0.AVy(r6);
                return;
            }
            return;
        }
        Log.i(C13680ns.A0c(i2, "PAY: reject collect; error code: "));
        C1200260a r2 = r32.A03;
        r2.A0D.Acl(new C1208263d(r32));
        r2.A00.A05();
        AnonymousClass29T.A01(r32.A00, 100);
    }
}
