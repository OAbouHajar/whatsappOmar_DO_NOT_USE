package X;

/* renamed from: X.4To  reason: invalid class name and case insensitive filesystem */
public final class C86634To {
    public final C28371Vv A00;
    public final String A01;

    public C86634To(C28371Vv r10) {
        String[] A1b = AnonymousClass3K3.A1b(r10, "screen_data");
        A1b[0] = "parameters";
        this.A01 = (String) C32271fx.A00((C16300so) null, r10, String.class, AnonymousClass3K2.A0Z(), 10000L, (Object) null, A1b, false);
        this.A00 = r10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86634To.class != obj.getClass()) {
            return false;
        }
        return C34901l3.A00(this.A01, ((C86634To) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
