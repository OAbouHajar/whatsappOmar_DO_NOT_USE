package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.155  reason: invalid class name */
public class AnonymousClass155 {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass155(C17020u3 r1) {
        this.A01 = r1;
    }

    public int A00() {
        return A03().getInt("biz_block_reasons_api_back_off_days", 0);
    }

    public int A01() {
        return A03().getInt("biz_block_reasons_version", 0);
    }

    public long A02() {
        return A03().getLong("biz_block_reasons_api_cooling_timestamp", 0);
    }

    public final synchronized SharedPreferences A03() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("block_reasons_prefs");
            this.A00 = sharedPreferences;
        }
        AnonymousClass00B.A06(sharedPreferences);
        return sharedPreferences;
    }

    public String A04() {
        return A03().getString("biz_block_reasons_country", (String) null);
    }

    public String A05() {
        return A03().getString("biz_block_reasons_language", (String) null);
    }

    public Map A06() {
        String string = A03().getString("biz_block_reasons", (String) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (TextUtils.isEmpty(string)) {
            return linkedHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                linkedHashMap.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
        }
        return linkedHashMap;
    }

    public void A07() {
        A03().edit().remove("biz_block_reasons").remove("biz_block_reasons_version").remove("biz_block_reasons_language").remove("biz_block_reasons_country").apply();
    }

    public void A08(int i2) {
        A03().edit().putInt("biz_block_reasons_api_back_off_days", i2).apply();
    }
}
