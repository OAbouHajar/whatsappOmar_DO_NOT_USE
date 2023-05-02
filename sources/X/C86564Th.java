package X;

/* renamed from: X.4Th  reason: invalid class name and case insensitive filesystem */
public final class C86564Th {
    public final C28371Vv A00;
    public final String A01;

    public C86564Th(C28371Vv r9) {
        String[] A1b = AnonymousClass3K3.A1b(r9, "screen");
        A1b[0] = "app_id";
        this.A01 = (String) C32271fx.A01((C16300so) null, r9, String.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, A1b, false);
        this.A00 = r9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86564Th.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86564Th) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
