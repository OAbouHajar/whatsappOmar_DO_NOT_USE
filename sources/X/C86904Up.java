package X;

/* renamed from: X.4Up  reason: invalid class name and case insensitive filesystem */
public final class C86904Up {
    public final C28371Vv A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C86904Up(C28371Vv r14) {
        Class<String> cls = String.class;
        Long A0a = AnonymousClass3K2.A0a();
        C28371Vv r6 = r14;
        this.A03 = (String) C32271fx.A01((C16300so) null, r6, cls, A0a, 100L, (Object) null, new String[]{"money", "value"}, false);
        this.A02 = (String) C32271fx.A01((C16300so) null, r6, cls, A0a, 100L, (Object) null, new String[]{"money", "offset"}, false);
        this.A01 = (String) C32271fx.A01((C16300so) null, r6, cls, A0a, 100L, (Object) null, new String[]{"money", "currency"}, false);
        this.A00 = r14;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C86904Up.class != obj.getClass()) {
                return false;
            }
            C86904Up r5 = (C86904Up) obj;
            if (!this.A03.equals(r5.A03) || !this.A02.equals(r5.A02) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A03;
        objArr[1] = this.A02;
        return AnonymousClass000.A0F(this.A01, objArr, 2);
    }
}
