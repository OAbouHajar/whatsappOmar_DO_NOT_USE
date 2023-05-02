package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2Fq  reason: invalid class name and case insensitive filesystem */
public class C46702Fq {
    public static final HashMap A00 = new HashMap();
    public static final HashMap A01 = new HashMap();

    public static JSONObject A00(HashMap hashMap) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONObject.put(Integer.toString(((Number) entry.getKey()).intValue()), Long.toString(((Number) entry.getValue()).longValue()));
        }
        return jSONObject;
    }
}
