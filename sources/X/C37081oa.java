package X;

/* renamed from: X.1oa  reason: invalid class name and case insensitive filesystem */
public class C37081oa extends AnonymousClass1WJ {
    public final String A00;

    public C37081oa(AnonymousClass1WK r10, String str, String str2, long j2) {
        super(C28481Wg.A03, r10, str, "critical_block", 1, j2, false);
        this.A00 = str2;
    }

    public C48232Mj A01() {
        C28581Wr A0U = C37071oZ.A02.A0U();
        String str = this.A00;
        A0U.A03();
        C37071oZ r1 = (C37071oZ) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = str;
        C48232Mj A01 = super.A01();
        AnonymousClass00B.A06(A01);
        A01.A03();
        C28531Wl r12 = (C28531Wl) A01.A00;
        r12.A0M = (C37071oZ) A0U.A02();
        r12.A00 |= 64;
        return A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushNameSettingMutation{rowId=");
        sb.append(this.A07);
        sb.append(", pushName=");
        sb.append(this.A00);
        sb.append(", timestamp=");
        sb.append(this.A04);
        sb.append(", areDependenciesMissing=");
        sb.append(A06());
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
