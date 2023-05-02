package com.facebook.redex;

import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass2Sv;
import X.AnonymousClass2VN;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C26701Ou;
import X.C30011bb;
import X.C39461sW;
import X.C86954Uu;
import android.content.Context;
import android.net.Uri;
import com.obwhatsapp.community.CommunityMembersActivity;
import com.obwhatsapp.community.ManageGroupsInCommunityActivity;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;

public class IDxCListenerShape72S0200000_2_I1 implements AnonymousClass2Sv {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape72S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void AOW() {
        C001000l A0C;
        switch (this.A02) {
            case 0:
                ((CommunityMembersActivity) this.A00).A04.A05.A00(((C86954Uu) this.A01).A03, C13680ns.A0Z());
                return;
            case 1:
                ((ManageGroupsInCommunityActivity) this.A00).A35((C39461sW) this.A01);
                return;
            case 2:
                C26701Ou r4 = ((C30011bb) ((ViewOnClickCListenerShape1S0100000_I0_1) this.A00).A00).A1I;
                Uri.Builder buildUpon = Uri.parse("https://faq.whatsapp.com/general/verification/about-autofilling-security-codes-on-whatsapp").buildUpon();
                AnonymousClass013 r2 = r4.A00;
                buildUpon.appendQueryParameter("lg", r2.A06());
                buildUpon.appendQueryParameter("lc", r2.A05());
                buildUpon.appendQueryParameter("eea", r4.A01.A04() ? "1" : "0");
                ((Context) this.A01).startActivity(C13690nt.A0B(buildUpon.build()));
                return;
            default:
                AnonymousClass01A r1 = (AnonymousClass01A) this.A01;
                if (((AnonymousClass2VN) this.A00).A01 && (A0C = r1.A0C()) != null) {
                    A0C.finish();
                    return;
                }
                return;
        }
    }
}
