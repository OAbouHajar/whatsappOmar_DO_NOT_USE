package X;

/* renamed from: X.3l3  reason: invalid class name and case insensitive filesystem */
public final class C71793l3 extends C86344Sg {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final AnonymousClass22J A03;
    public final AnonymousClass1UJ A04;

    public C71793l3(Integer num, String str, String str2, AnonymousClass22J r5, AnonymousClass1UJ r6) {
        super(4);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = r5;
        this.A04 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C71793l3) {
                C71793l3 r5 = (C71793l3) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A07 = AnonymousClass3K4.A07(this.A01);
        return AnonymousClass3K2.A06(this.A04, AnonymousClass000.A0E(this.A03, (AnonymousClass3K2.A09(this.A02, A07) + AnonymousClass000.A0C(this.A00)) * 31));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BusinessApiCategoryViewItem(displayName=");
        A0r.append(this.A01);
        A0r.append(", imageUrl=");
        A0r.append(this.A02);
        A0r.append(", bizNumber=");
        A0r.append(this.A00);
        A0r.append(", onClick=");
        A0r.append(this.A03);
        A0r.append(", loadImage=");
        return AnonymousClass3K2.A0k(this.A04, A0r);
    }
}
