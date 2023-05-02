package X;

/* renamed from: X.2Qe  reason: invalid class name and case insensitive filesystem */
public final class C48982Qe {
    public final C28371Vv A00;

    public C48982Qe(Long l2) {
        C32461gQ r4 = new C32461gQ("biz");
        if (C32271fx.A0D("1", 1, 256, false)) {
            r4.A02(new C35081lL("session_id", "1"));
        }
        if (C32271fx.A0B(l2, 1, false)) {
            r4.A02(new C35081lL("t", l2.longValue()));
        }
        this.A00 = r4.A01();
    }
}
