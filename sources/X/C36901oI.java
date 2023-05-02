package X;

/* renamed from: X.1oI  reason: invalid class name and case insensitive filesystem */
public class C36901oI extends AnonymousClass1WJ {
    public final int A00;

    public C36901oI(AnonymousClass1WK r10, String str, String str2, int i2, long j2, boolean z2) {
        super(C28481Wg.A03, r10, str, str2, 3, j2, z2);
        this.A00 = i2;
    }

    public C48232Mj A01() {
        C48232Mj A01 = super.A01();
        AnonymousClass00B.A06(A01);
        C28581Wr A0U = C36891oH.A02.A0U();
        int i2 = this.A00;
        A0U.A03();
        C36891oH r1 = (C36891oH) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = i2;
        A01.A03();
        C28531Wl r12 = (C28531Wl) A01.A00;
        r12.A0B = (C36891oH) A0U.A02();
        r12.A00 |= 16384;
        return A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SentinelMutation{rowId=");
        sb.append(this.A07);
        sb.append(", expiredKeyEpoch=");
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
