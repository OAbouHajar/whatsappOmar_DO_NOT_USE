package X;

/* renamed from: X.53a  reason: invalid class name and case insensitive filesystem */
public final class C1038653a implements AnonymousClass5NA {
    public final C28371Vv A00;
    public final AnonymousClass4V4 A01;

    public C1038653a(C16300so r9, C28371Vv r10) {
        String[] A1b = AnonymousClass3K3.A1b(r10, "state");
        boolean A1C = AnonymousClass3K4.A1C(A1b);
        C32271fx.A01((C16300so) null, r10, String.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), "succeed", A1b, A1C);
        this.A01 = (AnonymousClass4V4) AnonymousClass3K2.A0d(r9, r10, 44, A1C ? 1 : 0);
        this.A00 = r10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1038653a.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C1038653a) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
