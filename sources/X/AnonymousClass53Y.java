package X;

/* renamed from: X.53Y  reason: invalid class name */
public final class AnonymousClass53Y implements AnonymousClass5N9 {
    public final C28371Vv A00;
    public final C89044bV A01;
    public final String A02;

    public AnonymousClass53Y(C16300so r10, C28371Vv r11) {
        String[] A1b = AnonymousClass3K3.A1b(r11, "card");
        A1b[0] = "image";
        this.A02 = (String) C32271fx.A01((C16300so) null, r11, String.class, AnonymousClass3K2.A0a(), Long.valueOf(AnonymousClass1NO.A0L), (Object) null, A1b, false);
        this.A01 = (C89044bV) AnonymousClass3K2.A0d(r10, r11, 45, 0);
        this.A00 = r11;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass53Y.class != obj.getClass()) {
                return false;
            }
            AnonymousClass53Y r5 = (AnonymousClass53Y) obj;
            if (!this.A02.equals(r5.A02) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A02;
        return AnonymousClass3K2.A08(this.A01, A1Z);
    }
}
