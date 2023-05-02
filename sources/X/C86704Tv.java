package X;

/* renamed from: X.4Tv  reason: invalid class name and case insensitive filesystem */
public final class C86704Tv {
    public final C16050sL A00;
    public final C28371Vv A01;

    public C86704Tv(C16300so r9, C28371Vv r10) {
        String[] A1b = AnonymousClass3K3.A1b(r10, "linked_parent");
        A1b[0] = "jid";
        this.A00 = (C16050sL) C32271fx.A01(r9, r10, C16050sL.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, A1b, false);
        this.A01 = r10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86704Tv.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C86704Tv) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A00, C13680ns.A1b());
    }
}
