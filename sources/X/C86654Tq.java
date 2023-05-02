package X;

/* renamed from: X.4Tq  reason: invalid class name and case insensitive filesystem */
public final class C86654Tq {
    public final C28371Vv A00;
    public final String A01;

    public C86654Tq(C28371Vv r9) {
        C28371Vv r1 = r9;
        this.A01 = (String) C32271fx.A01((C16300so) null, r1, String.class, AnonymousClass3K2.A0a(), 128L, (Object) null, new String[]{"display_name"}, false);
        this.A00 = r9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86654Tq.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86654Tq) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
