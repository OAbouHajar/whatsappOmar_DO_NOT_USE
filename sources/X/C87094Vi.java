package X;

import org.json.JSONObject;

/* renamed from: X.4Vi  reason: invalid class name and case insensitive filesystem */
public final class C87094Vi {
    public final C15830rv A00;
    public final JSONObject A01;

    public C87094Vi(C15830rv r2, JSONObject jSONObject) {
        C18450wi.A0H(r2, 2);
        this.A01 = jSONObject;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87094Vi) {
                C87094Vi r5 = (C87094Vi) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A00, AnonymousClass000.A0C(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("TopBannerData(bizInfo=");
        A0r.append(this.A01);
        A0r.append(", jid=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
