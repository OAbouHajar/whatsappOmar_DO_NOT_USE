package X;

import java.util.List;

/* renamed from: X.4Tg  reason: invalid class name and case insensitive filesystem */
public final class C86554Tg {
    public final C28371Vv A00;
    public final List A01;

    public C86554Tg(C16300so r10, C28371Vv r11) {
        String[] A1b = AnonymousClass3K3.A1b(r11, "next_screens");
        A1b[0] = "screen";
        this.A01 = C32271fx.A07(r11, AnonymousClass3K3.A0X(r10, 21), A1b, 0, Long.MAX_VALUE);
        this.A00 = r11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86554Tg.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86554Tg) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
