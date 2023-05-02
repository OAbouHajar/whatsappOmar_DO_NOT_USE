package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.47B  reason: invalid class name */
public final class AnonymousClass47B {
    public static final C109735Tj A00(JSONObject jSONObject) {
        for (C109395Ry r1 : C817249m.A00) {
            if (jSONObject.has(r1.ACh())) {
                try {
                    return r1.A7Z(jSONObject);
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
