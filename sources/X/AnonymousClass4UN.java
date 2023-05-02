package X;

import java.util.List;

/* renamed from: X.4UN  reason: invalid class name */
public final class AnonymousClass4UN {
    public final C28371Vv A00;
    public final String A01;
    public final List A02;

    /* JADX WARNING: type inference failed for: r9v0, types: [boolean] */
    public AnonymousClass4UN(C16300so r11, C28371Vv r12) {
        C28371Vv r3 = r12;
        C28371Vv.A06(r12, "data");
        String[] strArr = new String[1];
        ? A1C = AnonymousClass3K4.A1C(strArr);
        this.A01 = (String) C32271fx.A01((C16300so) null, r3, String.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, strArr, A1C);
        String[] strArr2 = new String[1];
        strArr2[A1C] = "pay";
        this.A02 = C32271fx.A07(r3, AnonymousClass3K3.A0X(r11, 24), strArr2, 0, Long.MAX_VALUE);
        this.A00 = r12;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UN.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UN r5 = (AnonymousClass4UN) obj;
            if (!this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A01;
        return AnonymousClass3K2.A08(this.A02, A1Z);
    }
}
