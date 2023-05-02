package X;

/* renamed from: X.1ot  reason: invalid class name and case insensitive filesystem */
public final class C37271ot extends AnonymousClass1WJ {
    public final String A00;
    public final String A01;

    public C37271ot(AnonymousClass1WK r10, String str, String str2, String str3, long j2) {
        super(C28481Wg.A03, r10, str3, "regular_low", 7, j2, false);
        this.A01 = str;
        this.A00 = str2;
    }

    public C48232Mj A01() {
        C28581Wr A0U = C37171oj.A02.A0U();
        String str = this.A00;
        A0U.A03();
        C37171oj r1 = (C37171oj) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = str;
        C48232Mj A012 = super.A01();
        if (A012 == null) {
            return null;
        }
        A012.A03();
        C28531Wl r2 = (C28531Wl) A012.A00;
        r2.A0L = (C37171oj) A0U.A02();
        r2.A00 |= 67108864;
        return A012;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PrimaryVersionMutation{");
        StringBuilder sb2 = new StringBuilder("rowId=");
        sb2.append(this.A07);
        sb2.append(", ");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("versionType=");
        sb3.append(this.A01);
        sb3.append(", ");
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("appVersion=");
        sb4.append(this.A00);
        sb4.append(", ");
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder("timestamp=");
        sb5.append(this.A04);
        sb5.append(", ");
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder("operation=");
        sb6.append(this.A05);
        sb6.append(", ");
        sb.append(sb6.toString());
        StringBuilder sb7 = new StringBuilder("collectionName=");
        sb7.append(this.A06);
        sb7.append(", ");
        sb.append(sb7.toString());
        sb.append(C18450wi.A06("keyId=", this.A00));
        sb.append("}");
        String obj = sb.toString();
        C18450wi.A0B(obj);
        return obj;
    }
}
