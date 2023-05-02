package X;

/* renamed from: X.3tv  reason: invalid class name and case insensitive filesystem */
public class C76443tv extends AnonymousClass2BZ {
    public final /* synthetic */ AnonymousClass378 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76443tv(C16040sK r2, C16080sP r3, AnonymousClass378 r4) {
        super(r2, r3, true);
        this.A00 = r4;
    }

    public int A00(C16010sH r2, C16010sH r3) {
        if (r2.A09() == null && r3.A09() != null) {
            return 1;
        }
        if (r2.A09() == null || r3.A09() != null) {
            return super.compare(r2, r3);
        }
        return -1;
    }
}
