package X;

/* renamed from: X.4Vg  reason: invalid class name and case insensitive filesystem */
public final class C87074Vg {
    public final String A00;
    public final String A01;

    public C87074Vg(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87074Vg) {
                C87074Vg r5 = (C87074Vg) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.A00, AnonymousClass000.A0G(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("SharePnDialogData(myMaskedNumber=");
        A0r.append(this.A01);
        A0r.append(", learnMoreLink=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
