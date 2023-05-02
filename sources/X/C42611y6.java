package X;

/* renamed from: X.1y6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42611y6 implements C39541se {
    public final /* synthetic */ C15830rv A00;
    public final /* synthetic */ Long A01;

    public /* synthetic */ C42611y6(C15830rv r1, Long l2) {
        this.A00 = r1;
        this.A01 = l2;
    }

    public final void AhJ(C16740tZ r6) {
        C15830rv r2 = this.A00;
        Long l2 = this.A01;
        if (r2 != null) {
            C15830rv r0 = r6.A11.A00;
            AnonymousClass00B.A06(r0);
            if (!r0.equals(r2)) {
                return;
            }
        }
        if (l2 == null || r6.A14 <= l2.longValue()) {
            r6.A0x = false;
        }
    }
}
