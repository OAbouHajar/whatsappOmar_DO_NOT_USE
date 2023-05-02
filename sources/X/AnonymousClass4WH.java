package X;

import java.util.List;

/* renamed from: X.4WH  reason: invalid class name */
public final class AnonymousClass4WH {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public AnonymousClass4WH(String str, String str2, List list, List list2) {
        this.A01 = str;
        this.A00 = str2;
        this.A03 = list;
        this.A02 = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WH) {
                AnonymousClass4WH r5 = (AnonymousClass4WH) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A02, AnonymousClass000.A0E(this.A03, (AnonymousClass3K4.A07(this.A01) + AnonymousClass000.A0G(this.A00)) * 31));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("MapViewBusinessSearchResult(viewType=");
        A0r.append(this.A01);
        A0r.append(", requestId=");
        A0r.append(this.A00);
        A0r.append(", clusters=");
        A0r.append(this.A03);
        A0r.append(", businesses=");
        return AnonymousClass3K2.A0k(this.A02, A0r);
    }
}
