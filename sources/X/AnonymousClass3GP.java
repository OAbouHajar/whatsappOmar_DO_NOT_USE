package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3GP  reason: invalid class name */
public class AnonymousClass3GP implements C19550yc {
    public final C16300so A00;
    public final C109415Sa A01;

    public AnonymousClass3GP(C16300so r1, C109415Sa r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void APb(String str) {
        this.A01.AYu();
    }

    public void AQe(C28371Vv r3, String str) {
        this.A01.AQR(C34451kH.A00(r3));
    }

    public void AYG(C28371Vv r8, String str) {
        C28371Vv A0J;
        C28371Vv A0J2;
        C16300so r6 = this.A00;
        if (!(r8.A0F(r6, C16050sL.class, "from") == null || (A0J = r8.A0J("links")) == null || (A0J2 = A0J.A0J(FacebookFacade.RequestParameter.LINK)) == null)) {
            List A0O = A0J2.A0O("group");
            if (A0O.size() != 0) {
                HashSet A0o = C13680ns.A0o();
                Iterator it = A0O.iterator();
                while (it.hasNext()) {
                    C28371Vv A0S = C13690nt.A0S(it);
                    Jid A0F = A0S.A0F(r6, GroupJid.class, "jid");
                    if (A0F != null) {
                        A0o.add(C13680ns.A0F(A0F, A0S.A0A("error", -1)));
                    }
                }
                this.A01.ASg(A0o);
                return;
            }
        }
        this.A01.AQR(-1);
    }
}
