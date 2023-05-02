package X;

/* renamed from: X.54D  reason: invalid class name */
public final class AnonymousClass54D implements AnonymousClass5NH {
    public final C28371Vv A00;

    /* JADX WARNING: type inference failed for: r8v0, types: [boolean] */
    public AnonymousClass54D(C28371Vv r10) {
        C28371Vv r2 = r10;
        C28371Vv.A06(r10, "error");
        String[] strArr = new String[1];
        ? A1B = AnonymousClass3K4.A1B(strArr);
        Class<String> cls = String.class;
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        C32271fx.A01((C16300so) null, r2, cls, A0X, A0Y, "feature-not-implemented", strArr, A1B);
        String[] strArr2 = new String[1];
        strArr2[A1B] = "code";
        C32271fx.A01((C16300so) null, r2, cls, A0X, A0Y, "501", strArr2, A1B);
        this.A00 = r10;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && AnonymousClass54D.class == obj.getClass());
    }

    public int hashCode() {
        return AnonymousClass3K2.A03();
    }
}
