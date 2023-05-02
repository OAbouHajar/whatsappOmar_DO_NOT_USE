package X;

/* renamed from: X.53m  reason: invalid class name and case insensitive filesystem */
public final class C1039853m implements AnonymousClass5NB {
    public final C28371Vv A00;
    public final String A01;

    public C1039853m(C28371Vv r9) {
        C28371Vv r1 = r9;
        this.A01 = (String) C32271fx.A01((C16300so) null, r1, String.class, AnonymousClass3K2.A0a(), 65536L, (Object) null, new String[]{"subject"}, false);
        this.A00 = r9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1039853m.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C1039853m) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
