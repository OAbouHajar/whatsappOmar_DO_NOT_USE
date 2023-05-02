package X;

/* renamed from: X.4UM  reason: invalid class name */
public final class AnonymousClass4UM {
    public final C28371Vv A00;
    public final String A01;
    public final String A02;

    public AnonymousClass4UM(C28371Vv r9) {
        C28371Vv.A06(r9, "fds");
        this.A02 = (String) C32271fx.A00((C16300so) null, r9, String.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, new String[]{"state"}, false);
        this.A01 = AnonymousClass3K2.A0j(r9, false);
        this.A00 = r9;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UM.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UM r5 = (AnonymousClass4UM) obj;
            if (!C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A01, r5.A01)) {
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
