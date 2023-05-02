package X;

/* renamed from: X.53f  reason: invalid class name and case insensitive filesystem */
public final class C1039153f implements C109045Qm {
    public final C28371Vv A00;
    public final Long A01;
    public final String A02;

    /* JADX WARNING: type inference failed for: r10v0, types: [boolean] */
    public C1039153f(C28371Vv r12) {
        C28371Vv r4 = r12;
        C28371Vv.A06(r12, "error");
        String[] strArr = new String[1];
        ? A1B = AnonymousClass3K4.A1B(strArr);
        this.A02 = (String) C32271fx.A01((C16300so) null, r4, String.class, AnonymousClass3K2.A0a(), 40L, (Object) null, strArr, A1B);
        String[] strArr2 = new String[1];
        strArr2[A1B] = "code";
        this.A01 = (Long) C32271fx.A01((C16300so) null, r4, Long.class, 500L, 599L, (Object) null, strArr2, A1B);
        this.A00 = r12;
    }

    public void A4L(AnonymousClass4HZ r3) {
        r3.A00 = String.valueOf(this.A01.longValue());
        String str = this.A02;
        C18450wi.A0B(str);
        r3.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1039153f.class != obj.getClass()) {
                return false;
            }
            C1039153f r5 = (C1039153f) obj;
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
