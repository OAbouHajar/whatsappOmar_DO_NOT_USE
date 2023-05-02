package X;

/* renamed from: X.4Un  reason: invalid class name and case insensitive filesystem */
public final class C86884Un {
    public final C28371Vv A00;
    public final C88934bK A01;
    public final AnonymousClass4VI A02;
    public final Long A03;

    public C86884Un(C16300so r10, C28371Vv r11) {
        Object obj;
        String[] A1b = AnonymousClass3K3.A1b(r11, "group");
        A1b[0] = "size";
        this.A03 = (Long) C32271fx.A00((C16300so) null, r11, Long.class, AnonymousClass3K2.A0Z(), 19999L, (Object) null, A1b, false);
        this.A02 = (AnonymousClass4VI) AnonymousClass3K2.A0d(r10, r11, 54, 0);
        try {
            obj = C32271fx.A03(r11, AnonymousClass3K3.A0X(r10, 55), new String[0]);
        } catch (AnonymousClass1W9 unused) {
            obj = null;
        }
        this.A01 = (C88934bK) obj;
        this.A00 = r11;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C86884Un.class != obj.getClass()) {
                return false;
            }
            C86884Un r5 = (C86884Un) obj;
            if (!C34901l3.A00(this.A03, r5.A03) || !this.A02.equals(r5.A02) || !C34901l3.A00(this.A01, r5.A01)) {
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
