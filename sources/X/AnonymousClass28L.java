package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.28L  reason: invalid class name */
public class AnonymousClass28L {
    public final C17380uz A00;
    public final C28371Vv A01;
    public final String A02;
    public final Map A03;
    public final Map A04;

    public AnonymousClass28L(C28371Vv r2, String str, Map map, Map map2, Set set) {
        this.A02 = str;
        this.A01 = r2;
        C18390wc r0 = new C18390wc();
        r0.addAll(set);
        this.A00 = r0.build();
        this.A04 = map;
        this.A03 = map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass28L)) {
            return false;
        }
        AnonymousClass28L r4 = (AnonymousClass28L) obj;
        return this.A02.equals(r4.A02) && this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return (this.A02.hashCode() ^ this.A00.hashCode()) ^ this.A01.hashCode();
    }
}
