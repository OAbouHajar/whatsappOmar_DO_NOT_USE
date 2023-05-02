package X;

import com.facebook.redex.RunnableRunnableShape0S0300000_I0;

/* renamed from: X.521  reason: invalid class name */
public final /* synthetic */ class AnonymousClass521 implements AnonymousClass5QS {
    public final /* synthetic */ C27101Ql A00;
    public final /* synthetic */ AnonymousClass22J A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass521(C27101Ql r1, AnonymousClass22J r2, boolean z2) {
        this.A00 = r1;
        this.A02 = z2;
        this.A01 = r2;
    }

    public final void AXk(C84874Mf r7) {
        C27101Ql r4 = this.A00;
        boolean z2 = this.A02;
        AnonymousClass22J r3 = this.A01;
        C37771pi r5 = r7.A00;
        if (!r7.A03) {
            boolean z3 = r4.A0F.get();
            C214013y r1 = r4.A07;
            if (z3) {
                r1.A01("download_stickerpack_canceled");
                r1.A00(AnonymousClass42P.CANCEL);
            } else {
                r1.A01("download_stickerpack_failed");
                r1.A00(AnonymousClass42P.FAIL);
                if (z2) {
                    r4.A02.A00();
                }
            }
        } else if (r5 != null && r5.A0Q) {
            r4.A0E.Aco(new RunnableRunnableShape0S0300000_I0(r4, r5, r3, 14));
            r4.A00.set((Object) null);
        }
        r3.AIU(Boolean.FALSE);
        r4.A00.set((Object) null);
    }
}
