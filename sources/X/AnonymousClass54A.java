package X;

/* renamed from: X.54A  reason: invalid class name */
public final class AnonymousClass54A implements C109095Qr {
    public final C28371Vv A00;

    public AnonymousClass54A(C28371Vv r9) {
        String[] A1b = AnonymousClass3K3.A1b(r9, "participant");
        A1b[0] = "error";
        C32271fx.A01((C16300so) null, r9, String.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), "404", A1b, false);
        this.A00 = r9;
    }

    public void A4M(C83524Ha r4) {
        r4.A01.put(r4.A00, "404");
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && AnonymousClass54A.class == obj.getClass());
    }

    public int hashCode() {
        return AnonymousClass3K2.A03();
    }
}
