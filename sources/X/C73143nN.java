package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3nN  reason: invalid class name and case insensitive filesystem */
public final class C73143nN extends C82584Dj {
    public final AnonymousClass4N4 A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73143nN(AnonymousClass4N4 r2, UserJid userJid) {
        super(0);
        C18450wi.A0J(r2, userJid);
        this.A00 = r2;
        this.A01 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73143nN) {
                C73143nN r5 = (C73143nN) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A01, AnonymousClass3K3.A0H(this.A00));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("StandardCategoryListDisplayItem(categoryData=");
        A0r.append(this.A00);
        A0r.append(", bizJid=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
