package X;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.4Xt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C87624Xt {
    public static String A00(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString) || optString.equalsIgnoreCase("null")) {
            return null;
        }
        return optString;
    }

    public static boolean A01(Set set, JSONObject jSONObject) {
        HashSet A0o = C13680ns.A0o();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            if (!jSONObject.has(A0m)) {
                A0o.add(A0m);
            }
        }
        return A0o.isEmpty();
    }
}
