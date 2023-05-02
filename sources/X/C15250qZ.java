package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0qZ  reason: invalid class name and case insensitive filesystem */
public class C15250qZ {
    public final SharedPreferences A00;
    public final String A01;

    public C15250qZ(SharedPreferences sharedPreferences, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        this.A01 = sb.toString();
        this.A00 = sharedPreferences;
    }

    public Map A00() {
        JSONObject jSONObject;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.A00.getAll().entrySet()) {
            if (((String) next.getKey()).startsWith(this.A01)) {
                try {
                    jSONObject = new JSONObject((String) next.getValue());
                } catch (JSONException unused) {
                    jSONObject = new JSONObject();
                }
                if (jSONObject.length() > 0) {
                    String optString = jSONObject.optString("path", "");
                    if (!optString.isEmpty()) {
                        hashMap.put(optString, jSONObject);
                    }
                }
            }
        }
        return hashMap;
    }

    public JSONObject A01(String str) {
        String str2 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str.hashCode());
        String string = this.A00.getString(sb.toString(), (String) null);
        if (string == null) {
            string = "{}";
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public void A02(String str) {
        String str2 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str.hashCode());
        this.A00.edit().remove(sb.toString()).apply();
    }

    public void A03(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("path", str);
        } catch (JSONException unused) {
        }
        String str2 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str.hashCode());
        this.A00.edit().putString(sb.toString(), jSONObject.toString()).apply();
    }
}
