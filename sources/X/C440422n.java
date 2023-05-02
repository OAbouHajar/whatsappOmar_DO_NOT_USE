package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.22n  reason: invalid class name and case insensitive filesystem */
public final class C440422n {
    public static final String A00(C439922i r8, C18440wh r9) {
        String A06;
        Long l2 = r8.A02;
        if (l2 == null || l2.longValue() == 0) {
            StringBuilder sb = new StringBuilder();
            String str = r8.A03;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) r9.A01.getValue()).entrySet()) {
                if (C18450wi.A0R(((AnonymousClass22D) entry.getValue()).A01, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            sb.append((String) C003101j.A01(linkedHashMap.keySet()));
            sb.append(':');
            sb.append(r8.A06);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l2);
        sb2.append(':');
        sb2.append(r8.A06);
        String str2 = r8.A07;
        String str3 = "";
        if (!(str2 == null || (A06 = C18450wi.A06(":", str2)) == null)) {
            str3 = A06;
        }
        sb2.append(str3);
        return sb2.toString();
    }
}
