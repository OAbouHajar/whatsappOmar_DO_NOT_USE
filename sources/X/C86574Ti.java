package X;

import java.util.List;

/* renamed from: X.4Ti  reason: invalid class name and case insensitive filesystem */
public final class C86574Ti {
    public final C28371Vv A00;
    public final List A01;

    public C86574Ti(C16300so r10, C28371Vv r11) {
        String[] A1b = AnonymousClass3K3.A1b(r11, "persist_data");
        A1b[0] = "data";
        this.A01 = C32271fx.A07(r11, AnonymousClass3K3.A0X(r10, 23), A1b, 1, Long.MAX_VALUE);
        this.A00 = r11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86574Ti.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86574Ti) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
