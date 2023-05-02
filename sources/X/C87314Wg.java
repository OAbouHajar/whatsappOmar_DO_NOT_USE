package X;

import java.util.List;

/* renamed from: X.4Wg  reason: invalid class name and case insensitive filesystem */
public final class C87314Wg {
    public final Double A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public C87314Wg(Double d2, String str, String str2, String str3, List list, List list2, List list3, List list4) {
        C18450wi.A0H(list4, 4);
        this.A05 = list;
        this.A04 = list2;
        this.A07 = list3;
        this.A06 = list4;
        this.A01 = str;
        this.A03 = str2;
        this.A00 = d2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87314Wg) {
                C87314Wg r5 = (C87314Wg) obj;
                if (!C18450wi.A0R(this.A05, r5.A05) || !C18450wi.A0R(this.A04, r5.A04) || !C18450wi.A0R(this.A07, r5.A07) || !C18450wi.A0R(this.A06, r5.A06) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0E = (((((AnonymousClass000.A0E(this.A06, AnonymousClass000.A0E(this.A07, AnonymousClass000.A0E(this.A04, AnonymousClass3K3.A0H(this.A05)))) + AnonymousClass000.A0G(this.A01)) * 31) + AnonymousClass000.A0G(this.A03)) * 31) + AnonymousClass000.A0C(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A0E + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BusinessSearchResult(categories=");
        A0r.append(this.A05);
        A0r.append(", apiBusinesses=");
        A0r.append(this.A04);
        A0r.append(", localBusinesses=");
        A0r.append(this.A07);
        A0r.append(", filterCategories=");
        A0r.append(this.A06);
        A0r.append(", pageId=");
        A0r.append(this.A01);
        A0r.append(", requestId=");
        A0r.append(this.A03);
        A0r.append(", proximityWeight=");
        A0r.append(this.A00);
        A0r.append(", rankingLogicVer=");
        return AnonymousClass3K2.A0k(this.A02, A0r);
    }
}
