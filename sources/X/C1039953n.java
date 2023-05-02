package X;

/* renamed from: X.53n  reason: invalid class name and case insensitive filesystem */
public final class C1039953n implements AnonymousClass5NB {
    public final C28371Vv A00;
    public final String A01;

    public C1039953n(C28371Vv r9) {
        Long A0Z = AnonymousClass3K2.A0Z();
        C28371Vv r1 = r9;
        this.A01 = (String) C32271fx.A00((C16300so) null, r1, String.class, A0Z, A0Z, (Object) null, new String[]{"subject"}, false);
        this.A00 = r9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1039953n.class != obj.getClass()) {
            return false;
        }
        return C34901l3.A00(this.A01, ((C1039953n) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
