package X;

import com.mod2.fblibs.Facebook;
import org.json.JSONObject;

/* renamed from: X.13r  reason: invalid class name and case insensitive filesystem */
public class C213313r {
    public static AnonymousClass28T A00(AnonymousClass144 r11, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
        long j2 = jSONObject2.getLong("fbid");
        String string = jSONObject2.getString(Facebook.TOKEN);
        long j3 = jSONObject2.getLong("timestamp");
        String str2 = null;
        Long valueOf = jSONObject2.has("ttl") ? Long.valueOf(jSONObject2.optLong("ttl")) : null;
        if (jSONObject2.has("analytics_claim")) {
            str2 = jSONObject2.optString("analytics_claim");
        }
        return new AnonymousClass28T(r11, valueOf, str, string, str2, j2, j3);
    }
}
