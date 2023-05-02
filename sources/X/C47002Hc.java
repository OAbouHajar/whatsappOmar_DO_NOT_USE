package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Hc  reason: invalid class name and case insensitive filesystem */
public class C47002Hc {
    public int A00;

    public C47002Hc(int i2) {
        this.A00 = i2;
    }

    public JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("attempts", this.A00);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
