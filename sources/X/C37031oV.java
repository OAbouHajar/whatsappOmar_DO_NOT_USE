package X;

/* renamed from: X.1oV  reason: invalid class name and case insensitive filesystem */
public final class C37031oV extends AnonymousClass1WJ {
    public static final C28481Wg A02 = C28481Wg.A03;
    public final AnonymousClass1ZX A00;
    public final AnonymousClass1ZT A01;

    public C37031oV(AnonymousClass1WK r10, AnonymousClass1ZX r11, AnonymousClass1ZT r12, String str, long j2) {
        super(A02, r10, str, "regular", 7, j2, false);
        this.A00 = r11;
        this.A01 = r12;
    }

    public C48232Mj A01() {
        C48232Mj A012 = super.A01();
        if (A012 == null) {
            throw new NullPointerException("Super returned null builder");
        }
        C28581Wr A0U = C37041oW.A02.A0U();
        String rawString = this.A01.getRawString();
        A0U.A03();
        C37041oW r1 = (C37041oW) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = rawString;
        A012.A03();
        C28531Wl r2 = (C28531Wl) A012.A00;
        r2.A0J = (C37041oW) A0U.A02();
        r2.A00 |= Integer.MIN_VALUE;
        return A012;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PnForLidChatMutation(lidUserJid=");
        sb.append(this.A00);
        sb.append(", phoneUserJid=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
