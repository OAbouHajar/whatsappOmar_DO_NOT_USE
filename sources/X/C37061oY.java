package X;

/* renamed from: X.1oY  reason: invalid class name and case insensitive filesystem */
public class C37061oY extends AnonymousClass1WJ {
    public final boolean A00;

    public C37061oY(AnonymousClass1WK r10, String str, long j2, boolean z2) {
        super(C28481Wg.A03, r10, str, "regular_low", 7, j2, false);
        this.A00 = z2;
    }

    public C48232Mj A01() {
        C28581Wr A0U = C37051oX.A02.A0U();
        boolean z2 = this.A00;
        A0U.A03();
        C37051oX r1 = (C37051oX) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = z2;
        C48232Mj A01 = super.A01();
        AnonymousClass00B.A06(A01);
        A01.A03();
        C28531Wl r2 = (C28531Wl) A01.A00;
        r2.A0U = (C37051oX) A0U.A02();
        r2.A00 |= 16777216;
        return A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TimeFormatMutation{rowId=");
        sb.append(this.A07);
        sb.append(", is24HourFormat=");
        sb.append(this.A00);
        sb.append(", timestamp=");
        sb.append(this.A04);
        sb.append(", operation=");
        sb.append(this.A05);
        sb.append(", collectionName=");
        sb.append(this.A06);
        sb.append(", keyId=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
