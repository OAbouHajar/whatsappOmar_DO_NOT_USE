package X;

/* renamed from: X.53V  reason: invalid class name */
public final class AnonymousClass53V implements AnonymousClass5N8 {
    public final C28371Vv A00;
    public final C89014bS A01;
    public final String A02;

    /* JADX WARNING: type inference failed for: r10v0, types: [int, boolean] */
    public AnonymousClass53V(C16300so r12, C28371Vv r13) {
        C28371Vv r4 = r13;
        C28371Vv.A06(r13, "payout");
        String[] strArr = new String[1];
        ? A1C = AnonymousClass3K4.A1C(strArr);
        Class<String> cls = String.class;
        C32271fx.A01((C16300so) null, r4, cls, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), "prepaid-card", strArr, A1C);
        String[] strArr2 = new String[1];
        strArr2[A1C] = "last4";
        this.A02 = (String) C32271fx.A01((C16300so) null, r4, cls, 4L, 4, (Object) null, strArr2, A1C);
        this.A01 = (C89014bS) AnonymousClass3K2.A0d(r12, r13, 48, A1C);
        this.A00 = r13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass53V.class != obj.getClass()) {
                return false;
            }
            AnonymousClass53V r5 = (AnonymousClass53V) obj;
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
