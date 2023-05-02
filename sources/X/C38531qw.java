package X;

import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: X.1qw  reason: invalid class name and case insensitive filesystem */
public class C38531qw {
    public int A00;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public C42491xt A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final C16010sH A0J;
    public final UserJid A0K;
    public final String A0L;

    public C38531qw(C16010sH r3) {
        this.A0K = (UserJid) r3.A08(UserJid.class);
        this.A0J = r3;
        C34751ko r0 = r3.A0D;
        this.A0L = r0 != null ? r0.A01 : null;
        if (r3.A0i) {
            this.A03 = r3.A0B;
        }
    }

    public C38531qw(UserJid userJid, String str) {
        this.A0K = userJid;
        this.A0L = str;
        this.A0J = null;
    }

    public static void A00(C42481xs r1, C38531qw r2, Object obj, Map map) {
        r2.A05 = (String) map.get(obj);
        r2.A07 = (String) r1.A0O.get(obj);
    }

    public static void A01(C38531qw r0, AbstractCollection abstractCollection) {
        abstractCollection.add(r0.A02());
    }

    public C451427f A02() {
        UserJid userJid = this.A0K;
        if (userJid instanceof AnonymousClass1ZX) {
            this.A0D = true;
        }
        this.A0E = (!C16030sJ.A0M(userJid)) & this.A0E;
        return new C451427f(this);
    }
}
