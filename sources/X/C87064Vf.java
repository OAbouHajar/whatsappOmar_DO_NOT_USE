package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4Vf  reason: invalid class name and case insensitive filesystem */
public final class C87064Vf {
    public final UserJid A00;
    public final String A01;

    public C87064Vf(UserJid userJid, String str) {
        this.A00 = userJid;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87064Vf) {
                C87064Vf r5 = (C87064Vf) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.A01, AnonymousClass3K3.A0H(this.A00));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CatalogSearchPageRequest(bizJid=");
        A0r.append(this.A00);
        A0r.append(", searchQuery=");
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
