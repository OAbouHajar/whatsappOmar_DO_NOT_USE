package X;

/* renamed from: X.5tg  reason: invalid class name and case insensitive filesystem */
public class C117865tg {
    public final /* synthetic */ AnonymousClass5zI A00;

    public C117865tg(AnonymousClass5zI r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass5wG r5) {
        AnonymousClass5vT r0;
        if (r5.A04 == null && r5.A01 == null) {
            AnonymousClass5zI r2 = this.A00;
            r2.A08 = Boolean.FALSE;
            r2.A06 = new AnonymousClass67O("Could not retrieve data from photo processor.");
            r0 = r2.A03;
        } else {
            AnonymousClass5zI r3 = this.A00;
            r3.A08 = Boolean.TRUE;
            r3.A07 = r5;
            if (r3.A05) {
                C118665v3 r22 = r3.A01;
                if (r22.A01[((r22.A00 + 3) - 1) % 3] == null) {
                    return;
                }
            }
            r0 = r3.A03;
        }
        r0.A01();
    }
}
