package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5wj  reason: invalid class name and case insensitive filesystem */
public final class C119215wj {
    public final UserJid A00;
    public final AnonymousClass5yZ A01;
    public final C797441c A02;
    public final C16830ti A03;
    public final Boolean A04;

    public C119215wj() {
        this((UserJid) null, (AnonymousClass5yZ) null, C797441c.NONE, (C16830ti) null, (Boolean) null);
    }

    public C119215wj(UserJid userJid, AnonymousClass5yZ r2, C797441c r3, C16830ti r4, Boolean bool) {
        this.A04 = bool;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = userJid;
        this.A02 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C119215wj) {
                C119215wj r5 = (C119215wj) obj;
                if (!C18450wi.A0R(this.A04, r5.A04) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0C = ((((((AnonymousClass000.A0C(this.A04) * 31) + AnonymousClass000.A0C(this.A01)) * 31) + AnonymousClass000.A0C(this.A03)) * 31) + AnonymousClass000.A0C(this.A00)) * 31;
        C797441c r0 = this.A02;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        return A0C + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CheckoutData(shouldShowShimmer=");
        A0r.append(this.A04);
        A0r.append(", error=");
        A0r.append(this.A01);
        A0r.append(", orderMessage=");
        A0r.append(this.A03);
        A0r.append(", merchantJid=");
        A0r.append(this.A00);
        A0r.append(", merchantPaymentAccountStatus=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }
}
