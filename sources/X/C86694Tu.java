package X;

/* renamed from: X.4Tu  reason: invalid class name and case insensitive filesystem */
public final class C86694Tu {
    public final C28371Vv A00;
    public final Long A01;

    /* JADX WARNING: type inference failed for: r10v0, types: [boolean] */
    public C86694Tu(C28371Vv r12) {
        C28371Vv r4 = r12;
        C28371Vv.A06(r12, "growth_locked");
        String[] strArr = new String[1];
        ? A1C = AnonymousClass3K4.A1C(strArr);
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        C32271fx.A01((C16300so) null, r4, String.class, A0X, A0Y, "invite", strArr, A1C);
        String[] strArr2 = new String[1];
        strArr2[A1C] = "expiration";
        this.A01 = (Long) C32271fx.A01((C16300so) null, r4, Long.class, AnonymousClass3K2.A0Z(), A0Y, (Object) null, strArr2, A1C);
        this.A00 = r12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86694Tu.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86694Tu) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
