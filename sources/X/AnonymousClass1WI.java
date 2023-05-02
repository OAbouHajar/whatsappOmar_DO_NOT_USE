package X;

/* renamed from: X.1WI  reason: invalid class name */
public class AnonymousClass1WI extends AnonymousClass1WJ {
    public final String A00;

    public AnonymousClass1WI(AnonymousClass1WK r10, String str, String str2, long j2) {
        super(C28481Wg.A03, r10, str, "critical_block", 3, j2, false);
        this.A00 = str2;
    }

    public C48232Mj A01() {
        C48232Mj A01 = super.A01();
        AnonymousClass00B.A06(A01);
        C28581Wr A0U = C37261os.A02.A0U();
        String str = this.A00;
        A0U.A03();
        C37261os r1 = (C37261os) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = str;
        A01.A03();
        C28531Wl r12 = (C28531Wl) A01.A00;
        r12.A0E = (C37261os) A0U.A02();
        r12.A00 |= 2048;
        return A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocaleSyncMutation{rowId=");
        sb.append(this.A07);
        sb.append(", locale=");
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
