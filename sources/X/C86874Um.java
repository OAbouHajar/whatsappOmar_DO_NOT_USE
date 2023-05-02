package X;

/* renamed from: X.4Um  reason: invalid class name and case insensitive filesystem */
public final class C86874Um {
    public final C28371Vv A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    public C86874Um(C28371Vv r21) {
        C28371Vv r5 = r21;
        C28371Vv.A06(r5, "error");
        this.A01 = (Long) C32271fx.A01((C16300so) null, r5, Long.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, new String[]{"code"}, false);
        C28371Vv r13 = r5;
        this.A03 = (String) C32271fx.A01((C16300so) null, r13, String.class, AnonymousClass3K2.A0a(), 1000L, (Object) null, new String[]{"text"}, false);
        this.A02 = AnonymousClass3K2.A0j(r5, false);
        this.A00 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C86874Um.class != obj.getClass()) {
                return false;
            }
            C86874Um r5 = (C86874Um) obj;
            if (!this.A01.equals(r5.A01) || !this.A03.equals(r5.A03) || !C34901l3.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A01;
        objArr[1] = this.A03;
        return AnonymousClass000.A0F(this.A02, objArr, 2);
    }
}
