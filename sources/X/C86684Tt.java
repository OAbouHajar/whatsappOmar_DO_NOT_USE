package X;

/* renamed from: X.4Tt  reason: invalid class name and case insensitive filesystem */
public final class C86684Tt {
    public final C28371Vv A00;
    public final Long A01;

    public C86684Tt(C28371Vv r10) {
        String[] A1b = AnonymousClass3K3.A1b(r10, "ephemeral");
        A1b[0] = "expiration";
        this.A01 = (Long) C32271fx.A01((C16300so) null, r10, Long.class, AnonymousClass3K2.A0Z(), 2147483647L, (Object) null, A1b, false);
        this.A00 = r10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86684Tt.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86684Tt) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
