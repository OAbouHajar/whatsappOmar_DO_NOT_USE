package X;

/* renamed from: X.4Te  reason: invalid class name and case insensitive filesystem */
public final class C86534Te {
    public final C28371Vv A00;
    public final String A01;

    public C86534Te(C28371Vv r9) {
        String[] A1b = AnonymousClass3K3.A1b(r9, "choice");
        A1b[0] = "choice";
        this.A01 = (String) C32271fx.A01((C16300so) null, r9, String.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, A1b, false);
        this.A00 = r9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86534Te.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86534Te) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
