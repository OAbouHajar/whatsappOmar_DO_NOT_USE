package X;

/* renamed from: X.1oe  reason: invalid class name and case insensitive filesystem */
public class C37121oe extends AnonymousClass1WJ implements C36821oA, C37021oU {
    public final long A00;
    public final C15830rv A01;
    public final boolean A02;

    public C37121oe(AnonymousClass1WK r11, C15830rv r12, String str, long j2, long j3, boolean z2, boolean z3) {
        super(C28481Wg.A03, r11, str, "regular_high", 2, j3, z3);
        this.A01 = r12;
        this.A02 = z2;
        this.A00 = j2;
    }

    public C48232Mj A01() {
        C28581Wr A0U = C37111od.A04.A0U();
        boolean z2 = this.A02;
        A0U.A03();
        C37111od r1 = (C37111od) A0U.A00;
        r1.A00 |= 1;
        r1.A03 = z2;
        if (z2) {
            long j2 = this.A00;
            A0U.A03();
            C37111od r12 = (C37111od) A0U.A00;
            r12.A00 |= 2;
            r12.A01 = j2;
        }
        C48232Mj A012 = super.A01();
        AnonymousClass00B.A06(A012);
        A012.A03();
        C28531Wl r13 = (C28531Wl) A012.A00;
        r13.A0G = (C37111od) A0U.A02();
        r13.A00 |= 8;
        return A012;
    }

    public C15830rv AAV() {
        return this.A01;
    }

    public boolean AJo() {
        return !this.A02;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MuteChatMutation{rowId=");
        sb.append(this.A07);
        sb.append(", chatJid=");
        sb.append(this.A01);
        sb.append(", muteEndTimestamp=");
        sb.append(this.A00);
        sb.append(", isMuted=");
        sb.append(this.A02);
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
