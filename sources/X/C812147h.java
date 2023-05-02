package X;

import org.json.JSONObject;

/* renamed from: X.47h  reason: invalid class name and case insensitive filesystem */
public class C812147h {
    public static String A00(String str, JSONObject jSONObject) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }
}
