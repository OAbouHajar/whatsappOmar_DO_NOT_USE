package X;

import org.json.JSONObject;

/* renamed from: X.237  reason: invalid class name */
public final class AnonymousClass237 {
    public static final AnonymousClass238 A00(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject = jSONObject.optJSONObject("extensions");
        if (optJSONObject == null || (jSONObject2 = optJSONObject.optJSONObject("metadata")) == null) {
            jSONObject2 = jSONObject;
        }
        String optString = jSONObject.optString("flow_id");
        C18450wi.A0B(optString);
        String optString2 = jSONObject2.optString("flow_message_version");
        C18450wi.A0B(optString2);
        return new AnonymousClass238(optString, optString2, jSONObject2.optString("data_api_version"), jSONObject2.optString("state"), jSONObject2.optString("flow_version_ids"));
    }
}
