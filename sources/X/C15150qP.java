package X;

/* renamed from: X.0qP  reason: invalid class name and case insensitive filesystem */
public abstract class C15150qP extends C15160qQ implements C15190qT, C15200qU, C15180qS {
    public C96124np A00;

    public C15240qY A6h(C15270qb r4) {
        C15140qO r2 = (C15140qO) this;
        C18450wi.A0H(r4, 0);
        String A002 = r4.A00();
        switch (A002.hashCode()) {
            case 101264299:
                if (A002.equals("eviction.v2")) {
                    return (C15230qX) r2.A01.A00.getValue();
                }
                return null;
            case 351608024:
                if (A002.equals("version")) {
                    return (C96114no) r2.A01.A03.getValue();
                }
                return null;
            case 408072700:
                if (A002.equals("max_size")) {
                    return (C15310qf) r2.A01.A01.getValue();
                }
                return null;
            case 1738660166:
                if (A002.equals("stale_removal")) {
                    return (C15400qo) r2.A01.A02.getValue();
                }
                return null;
            default:
                return null;
        }
    }
}
