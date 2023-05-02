package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.45D  reason: invalid class name */
public class AnonymousClass45D {
    public static void A00(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        Iterator A0e = AnonymousClass3K4.A0e(hashMap);
        boolean z2 = true;
        while (A0e.hasNext()) {
            String A0m = AnonymousClass000.A0m(A0e);
            if (!z2) {
                sb.append(",");
            }
            String str = (String) hashMap.get(A0m);
            sb.append("\"");
            sb.append(A0m);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
            z2 = false;
        }
        sb.append("}");
    }
}
