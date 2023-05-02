package X;

/* renamed from: X.4Tk  reason: invalid class name and case insensitive filesystem */
public final class C86594Tk {
    public final C28371Vv A00;
    public final C86554Tg A01;

    public C86594Tk(C16300so r2, C28371Vv r3) {
        C28371Vv.A06(r3, "next_screens");
        this.A01 = (C86554Tg) AnonymousClass3K2.A0c(r2, r3, 34);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86594Tk.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86594Tk) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
