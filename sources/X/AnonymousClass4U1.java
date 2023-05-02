package X;

/* renamed from: X.4U1  reason: invalid class name */
public final class AnonymousClass4U1 {
    public final C16050sL A00;
    public final C28371Vv A01;

    public AnonymousClass4U1(C16300so r9, C28371Vv r10) {
        C16300so r0 = r9;
        C28371Vv r1 = r10;
        this.A00 = (C16050sL) C32271fx.A01(r0, r1, C16050sL.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, new String[]{"parent_group_jid"}, false);
        this.A01 = r10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass4U1.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass4U1) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A00, C13680ns.A1b());
    }
}
