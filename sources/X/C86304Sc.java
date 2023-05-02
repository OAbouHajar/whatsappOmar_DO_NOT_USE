package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4Sc  reason: invalid class name and case insensitive filesystem */
public class C86304Sc {
    public Map A00 = AnonymousClass000.A0x();

    public final Map A00(String str) {
        HashMap A0x = AnonymousClass000.A0x();
        Iterator A0y = AnonymousClass000.A0y(this.A00);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            A0x.put(C13680ns.A0g(String.valueOf(A0z.getKey()), String.valueOf(str)), A0z.getValue());
        }
        return A0x;
    }

    public String toString() {
        return C32381gG.zzd(this.A00, 1);
    }
}
