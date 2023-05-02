package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Gg  reason: invalid class name and case insensitive filesystem */
public final class C63133Gg implements C19550yc {
    public final C55222j6 A00;
    public final C18260wP A01;
    public final C18720x9 A02;
    public final C17190ug A03;
    public final C86104Rf A04;

    public C63133Gg(C55222j6 r1, C18260wP r2, C18720x9 r3, C17190ug r4, C86104Rf r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final Map A00(C28371Vv r9) {
        C25401Jq r1;
        C28371Vv[] r7 = r9.A03;
        if (r7 == null) {
            r1 = new C25401Jq(r9.A00, r9.A0L());
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C35081lL[] A0Q = r9.A0Q();
            int i2 = 0;
            if (A0Q != null) {
                int length = A0Q.length;
                int i3 = 0;
                while (i3 < length) {
                    C35081lL r0 = A0Q[i3];
                    i3++;
                    String str = r0.A02;
                    C18450wi.A0B(str);
                    linkedHashMap.put(str, r0.A03);
                }
            }
            int length2 = r7.length;
            while (i2 < length2) {
                C28371Vv r02 = r7[i2];
                i2++;
                if (r02 == null) {
                    C18450wi.A0N("ARRAY_ELEMENT");
                    throw AnonymousClass000.A0Z();
                }
                linkedHashMap.putAll(A00(r02));
            }
            r1 = new C25401Jq(r9.A00, linkedHashMap);
        }
        return C25421Js.A09(r1);
    }

    public void APb(String str) {
        Log.e("SKURequestProtocolHelper/onDeliveryFailure");
        this.A04.A00();
    }

    public void AQe(C28371Vv r2, String str) {
        Log.e("SKURequestProtocolHelper/onSuccess/error: empty response");
        this.A04.A00();
    }

    public void AYG(C28371Vv r8, String str) {
        C28371Vv[] r6;
        C18450wi.A0H(r8, 1);
        C28371Vv A0J = r8.A0J("product_list");
        if (A0J != null && (r6 = A0J.A03) != null) {
            ArrayList A0u = AnonymousClass000.A0u();
            int i2 = 0;
            int length = r6.length;
            while (i2 < length) {
                C28371Vv r2 = r6[i2];
                i2++;
                if (C18450wi.A0R(r2.A00, "product")) {
                    Object obj = A00(r2).get("product");
                    if (obj != null) {
                        A0u.add(obj);
                    } else {
                        throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                    }
                }
            }
            C86104Rf r22 = this.A04;
            Map A09 = C25421Js.A09(new C25401Jq("products", A0u));
            r22.A02.A00(r22.A00, r22.A01, "success", A09, r22.A03);
        }
    }
}
