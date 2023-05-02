package X;

import android.text.TextUtils;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1Ms  reason: invalid class name and case insensitive filesystem */
public class C26201Ms {
    public final C14870pt A00;
    public final C17190ug A01;
    public final AnonymousClass1Bc A02;
    public final C16320sq A03;

    public C26201Ms(C14870pt r1, C17190ug r2, AnonymousClass1Bc r3, C16320sq r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00(AnonymousClass1YD r13, String str, String str2, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder("ChatSupportTicketManager/contactSupport called, shouldUploadLogs=");
        boolean z4 = z2;
        sb.append(z4);
        Log.i(sb.toString());
        C48572Ny r6 = new C48572Ny(this.A00, new AnonymousClass2Nz(r13, this, z4), this.A01);
        C17190ug r5 = r6.A02;
        String A022 = r5.A02();
        String str3 = z3 ? "payment" : "general";
        C32461gQ r3 = new C32461gQ("iq");
        r3.A02(new C35081lL("id", A022));
        r3.A02(new C35081lL("type", "set"));
        r3.A02(new C35081lL((Jid) C34791ks.A00, "to"));
        r3.A02(new C35081lL("xmlns", "fb:thrift_iq"));
        r3.A02(new C35081lL("smax_id", "3"));
        C32461gQ r2 = new C32461gQ("additional_attributes");
        r2.A02(new C35081lL("context_flow", str3));
        r3.A03(r2.A01());
        r3.A03(new C28371Vv(FacebookFacade.RequestParameter.DESCRIPTION, str, (C35081lL[]) null));
        if (!TextUtils.isEmpty(str2)) {
            r3.A03(new C28371Vv("debug_information_json", str2, (C35081lL[]) null));
        }
        r5.A0G(r6, r3.A01(), A022, 256, 32000);
    }
}
