package X;

import java.util.List;

/* renamed from: X.4UP  reason: invalid class name */
public final class AnonymousClass4UP {
    public final C28371Vv A00;
    public final String A01;
    public final List A02;

    public AnonymousClass4UP(C16300so r11, C28371Vv r12) {
        C28371Vv r3 = r12;
        C28371Vv.A06(r12, "states");
        this.A01 = (String) C32271fx.A01((C16300so) null, r3, String.class, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, new String[]{"start_at"}, false);
        this.A02 = C32271fx.A07(r3, AnonymousClass3K3.A0X(r11, 39), new String[]{"state"}, 1, Long.MAX_VALUE);
        this.A00 = r12;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4UP.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4UP r5 = (AnonymousClass4UP) obj;
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
