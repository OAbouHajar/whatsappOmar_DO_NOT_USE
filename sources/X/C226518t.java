package X;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.18t  reason: invalid class name and case insensitive filesystem */
public class C226518t {
    public final C225418i A00;
    public final C17420v3 A01;

    public C226518t(C225418i r1, C17420v3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static JSONArray A00(Class cls, Object obj) {
        JSONArray jSONArray = new JSONArray();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            Object obj2 = Array.get(obj, i2);
            if (obj2 == null || !(cls == double[].class || cls == Double.class)) {
                jSONArray.put(obj2);
            } else {
                jSONArray.put(new BigDecimal(((Number) obj2).doubleValue(), MathContext.DECIMAL32).doubleValue());
            }
        }
        return jSONArray;
    }

    public static void A01(Class cls, Object obj, String str, JSONObject jSONObject) {
        if (obj == null || !(cls == double[].class || cls == Double.class)) {
            jSONObject.put(str, obj);
        } else {
            jSONObject.put(str, new BigDecimal(((Number) obj).doubleValue(), MathContext.DECIMAL32).doubleValue());
        }
    }
}
