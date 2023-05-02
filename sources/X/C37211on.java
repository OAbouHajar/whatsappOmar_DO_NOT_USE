package X;

/* renamed from: X.1on  reason: invalid class name and case insensitive filesystem */
public class C37211on extends AnonymousClass1WJ implements C36821oA, C37021oU {
    public final C15830rv A00;
    public final boolean A01;

    public C37211on(C15830rv r9, long j2, boolean z2) {
        this((AnonymousClass1WK) null, r9, (String) null, j2, z2, false);
    }

    public C37211on(AnonymousClass1WK r10, C15830rv r11, String str, long j2, boolean z2, boolean z3) {
        super(C28481Wg.A03, r10, str, "regular_low", 5, j2, z3);
        this.A00 = r11;
        this.A01 = z2;
    }

    public C48232Mj A01() {
        C28581Wr A0U = C37201om.A02.A0U();
        boolean z2 = this.A01;
        A0U.A03();
        C37201om r1 = (C37201om) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = z2;
        C48232Mj A012 = super.A01();
        AnonymousClass00B.A06(A012);
        A012.A03();
        C28531Wl r12 = (C28531Wl) A012.A00;
        r12.A0I = (C37201om) A0U.A02();
        r12.A00 |= 16;
        return A012;
    }

    public C15830rv AAV() {
        return this.A00;
    }

    public boolean AJo() {
        return !this.A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PinChatMutation{rowId=");
        sb.append(this.A07);
        sb.append(", chatJid=");
        sb.append(this.A00);
        sb.append(", isPinned=");
        sb.append(this.A01);
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
