package X;

/* renamed from: X.2BY  reason: invalid class name */
public class AnonymousClass2BY extends AnonymousClass2BZ {
    public final /* synthetic */ C17240ul A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2BY(C16040sK r2, C16080sP r3, C17240ul r4) {
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
