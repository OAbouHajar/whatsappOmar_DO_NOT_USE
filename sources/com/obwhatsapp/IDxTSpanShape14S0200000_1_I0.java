package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass4E1;
import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C16740tZ;
import X.C17100uX;
import X.C23071Aj;
import X.C30011bb;
import X.C59142uk;
import X.C609536t;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.whatsapp.util.Log;

public class IDxTSpanShape14S0200000_1_I0 extends C59142uk {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxTSpanShape14S0200000_1_I0(Context context, C17100uX r8, C14870pt r9, AnonymousClass01V r10, Object obj, Object obj2, String str, int i2) {
        super(context, r8, r9, r10, str);
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onClick(View view) {
        Pair pair;
        if (this.A02 != 0) {
            String str = this.A09;
            String schemeSpecificPart = Uri.parse(str).getSchemeSpecificPart();
            C30011bb r2 = (C30011bb) this.A00;
            if (r2.A0j.A00.get(schemeSpecificPart) != null) {
                pair = (Pair) r2.A0j.A00.get(schemeSpecificPart);
            } else if (r2.A0o != null) {
                return;
            } else {
                if (!r2.A0Z.A0A()) {
                    pair = null;
                } else {
                    C609536t r3 = new C609536t(r2.A0J, r2.A0f, new AnonymousClass4E1(this), r2.A1F, str, schemeSpecificPart);
                    r2.A0o = r3;
                    C13680ns.A1U(r3, r2.A1e);
                    return;
                }
            }
            C30011bb.A0H(pair, r2, schemeSpecificPart, str, ((C16740tZ) this.A01).A11.A02);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("wa-link-factory/click-link ");
        String str2 = this.A09;
        Log.i(AnonymousClass000.A0h(str2, A0r));
        String A0e = C13690nt.A0e(str2, C23071Aj.A05);
        if (A0e != null) {
            Uri parse = Uri.parse(A0e);
            if (parse.getAuthority().contains("whatsapp")) {
                Uri.Builder buildUpon = parse.buildUpon();
                AnonymousClass013 r22 = ((C23071Aj) this.A00).A03;
                buildUpon.appendQueryParameter("lg", r22.A06());
                buildUpon.appendQueryParameter("lc", r22.A05());
                buildUpon.appendQueryParameter("eea", "1");
                parse = buildUpon.build();
            }
            Log.i(AnonymousClass000.A0g("wa-link-factory/open-link ", parse));
            ((C23071Aj) this.A00).A00.Act((Context) this.A01, parse);
        }
    }
}
