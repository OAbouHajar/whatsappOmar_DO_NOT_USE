package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4wc  reason: invalid class name and case insensitive filesystem */
public class C101044wc implements C109275Rk {
    public C616739v A00;

    public C101044wc(C616739v r1) {
        this.A00 = r1;
    }

    public int ACu() {
        return 2;
    }

    public UserJid ACy() {
        C16010sH A03 = this.A00.A03();
        if (A03 == null) {
            return null;
        }
        return (UserJid) A03.A08(UserJid.class);
    }
}
