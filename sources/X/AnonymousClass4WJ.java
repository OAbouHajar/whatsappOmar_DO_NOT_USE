package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4WJ  reason: invalid class name */
public final class AnonymousClass4WJ {
    public final UserJid A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass4WJ(UserJid userJid, String str, String str2, boolean z2) {
        C18450wi.A0H(userJid, 4);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z2;
        this.A00 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WJ) {
                AnonymousClass4WJ r5 = (AnonymousClass4WJ) obj;
                if (!C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A01, r5.A01) || this.A03 != r5.A03 || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A09 = AnonymousClass3K2.A09(this.A01, AnonymousClass3K4.A07(this.A02));
        boolean z2 = this.A03;
        if (z2) {
            z2 = true;
        }
        return AnonymousClass3K2.A06(this.A00, (A09 + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CatalogCategoryTabItem(tabName=");
        A0r.append(this.A02);
        A0r.append(", categoryId=");
        A0r.append(this.A01);
        A0r.append(", isLastLevel=");
        A0r.append(this.A03);
        A0r.append(", bizJid=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
