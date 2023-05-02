package X;

import org.json.JSONObject;

/* renamed from: X.10W  reason: invalid class name */
public abstract class AnonymousClass10W {
    public static String A00(int i2, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("error_code", i2);
        jSONObject.put("error_message", str);
        return jSONObject.toString();
    }

    public static String A01(Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", true);
        jSONObject.putOpt("result", obj);
        return jSONObject.toString();
    }
}
