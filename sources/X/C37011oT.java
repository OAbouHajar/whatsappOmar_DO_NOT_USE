package X;

/* renamed from: X.1oT  reason: invalid class name and case insensitive filesystem */
public class C37011oT extends AnonymousClass1WJ implements C36821oA, C36831oB, C37021oU {
    public final C36801o8 A00;
    public final C15830rv A01;
    public final boolean A02;

    public C37011oT(AnonymousClass1WK r11, C36801o8 r12, C15830rv r13, String str, long j2, boolean z2, boolean z3) {
        super(C28481Wg.A03, r11, str, "regular_low", 3, j2, z3);
        this.A01 = r13;
        this.A02 = z2;
        this.A00 = r12;
    }

    public C48232Mj A01() {
        C28581Wr A0U = C37001oS.A03.A0U();
        boolean z2 = this.A02;
        A0U.A03();
        C37001oS r1 = (C37001oS) A0U.A00;
        r1.A00 |= 1;
        r1.A02 = z2;
        C36791o7 A04 = this.A00.A04();
        A0U.A03();
        C37001oS r12 = (C37001oS) A0U.A00;
        r12.A01 = A04;
        r12.A00 |= 2;
        C48232Mj A012 = super.A01();
        AnonymousClass00B.A06(A012);
        A012.A03();
        C28531Wl r2 = (C28531Wl) A012.A00;
        r2.A0F = (C37001oS) A0U.A02();
        r2.A00 |= 32768;
        return A012;
    }

    public C15830rv AAV() {
        return this.A01;
    }

    public C36801o8 ADZ() {
        return this.A00;
    }

    public boolean AJo() {
        return !this.A02;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MarkChatAsReadMutation{rowId=");
        sb.append(this.A07);
        sb.append(", chatJid=");
        sb.append(this.A01);
        sb.append(", isRead=");
        sb.append(this.A02);
        sb.append(", messageRange=");
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
