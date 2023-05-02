package X;

/* renamed from: X.1oc  reason: invalid class name and case insensitive filesystem */
public class C37101oc extends AnonymousClass1WJ implements C36861oE, C37021oU {
    public final C15830rv A00;
    public final C28381Vw A01;
    public final boolean A02;

    public C37101oc(AnonymousClass1WK r11, C15830rv r12, C28381Vw r13, String str, long j2, boolean z2, boolean z3) {
        super(C28481Wg.A03, r11, str, "regular_high", 2, j2, z3);
        this.A01 = r13;
        this.A00 = r12;
        this.A02 = z2;
    }

    public C48232Mj A01() {
        C48232Mj A012 = super.A01();
        AnonymousClass00B.A06(A012);
        C28581Wr A0U = C37091ob.A02.A0U();
        boolean z2 = this.A02;
        A0U.A03();
        C37091ob r1 = (C37091ob) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = z2;
        A012.A03();
        C28531Wl r12 = (C28531Wl) A012.A00;
        r12.A0R = (C37091ob) A0U.A02();
        r12.A00 |= 2;
        return A012;
    }

    public /* synthetic */ C15830rv AAV() {
        C15830rv r0 = this.A01.A00;
        AnonymousClass00B.A06(r0);
        return r0;
    }

    public C28381Vw ADY() {
        return this.A01;
    }

    public boolean AJo() {
        return !this.A02;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StarMessageMutation{rowId=");
        sb.append(this.A07);
        sb.append(", key=");
        sb.append(this.A01);
        sb.append(", participant=");
        sb.append(this.A00);
        sb.append(", starred=");
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
