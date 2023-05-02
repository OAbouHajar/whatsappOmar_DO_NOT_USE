package X;

/* renamed from: X.1oi  reason: invalid class name and case insensitive filesystem */
public class C37161oi extends AnonymousClass1WJ {
    public final long A00;
    public final String A01;

    public C37161oi(AnonymousClass1WK r10, String str, String str2, long j2, long j3, boolean z2) {
        super(C28481Wg.A03, r10, str, "regular_low", 7, j2, z2);
        this.A01 = str2;
        this.A00 = j3;
    }

    public C48232Mj A01() {
        C48232Mj A012 = super.A01();
        AnonymousClass00B.A06(A012);
        C28581Wr A0U = C37151oh.A02.A0U();
        long j2 = this.A00;
        A0U.A03();
        C37151oh r1 = (C37151oh) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = j2;
        A012.A03();
        C28531Wl r2 = (C28531Wl) A012.A00;
        r2.A0P = (C37151oh) A0U.A02();
        r2.A00 |= 268435456;
        return A012;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RemoveRecentStickerMutation{fileHash=");
        sb.append(this.A01);
        sb.append("; ts=");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }
}
