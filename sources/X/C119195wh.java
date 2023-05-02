package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5wh  reason: invalid class name and case insensitive filesystem */
public class C119195wh {
    public static List A02 = Arrays.asList(new String[]{"urn:xmpp:whatsapp:account", "w:pay"});
    public final C14870pt A00;
    public final C17190ug A01;

    public C119195wh(C14870pt r1, C17190ug r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final C28371Vv A00(C116615rf r6, String str, Map map) {
        Map map2 = (Map) map.get("properties");
        Map map3 = (Map) map.get("children");
        if ("accept_pay".equals(str) && map2 != null && map2.containsKey("merchant")) {
            map2.containsKey("merchant-fees");
        }
        ArrayList A0u = AnonymousClass000.A0u();
        if (map2 != null && map2.size() > 0) {
            Iterator A0y = AnonymousClass000.A0y(map2);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                C110105dW.A1P(C13690nt.A0f(A0z), (String) A0z.getValue(), A0u);
            }
        }
        return new C28371Vv(str, C110115dX.A1F(A0u, 0), A02(r6, map3));
    }

    public final Map A01(C28371Vv r8) {
        HashMap A0x = AnonymousClass000.A0x();
        if (r8 != null) {
            HashMap A0x2 = AnonymousClass000.A0x();
            C35081lL[] A0Q = r8.A0Q();
            if (A0Q != null) {
                for (C35081lL r0 : A0Q) {
                    A0x2.put(r0.A02, r0.A03);
                }
            }
            A0x.put("properties", C87604Xq.A01(A0x2));
            HashMap A0x3 = AnonymousClass000.A0x();
            C28371Vv[] r2 = r8.A03;
            if (r2 != null) {
                for (C28371Vv r02 : r2) {
                    A0x3.put(r02.A00, A01(r02));
                }
            }
            HashMap A0x4 = AnonymousClass000.A0x();
            Iterator A0j = C13690nt.A0j(A0x3);
            while (A0j.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0j);
                A0x4.put(A0z.getKey(), A0z.getValue());
            }
            A0x.put("children", A0x4);
        }
        HashMap A0x5 = AnonymousClass000.A0x();
        Iterator A0j2 = C13690nt.A0j(A0x);
        while (A0j2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass000.A0z(A0j2);
            A0x5.put(A0z2.getKey(), A0z2.getValue());
        }
        return A0x5;
    }

    public final C28371Vv[] A02(C116615rf r5, Map map) {
        ArrayList A0u = AnonymousClass000.A0u();
        if (map != null && map.size() > 0) {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                A0u.add(A00(r5, C13690nt.A0f(A0z), (Map) A0z.getValue()));
            }
        }
        return (C28371Vv[]) A0u.toArray(new C28371Vv[0]);
    }
}
