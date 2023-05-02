package X;

import org.json.JSONObject;

/* renamed from: X.3th  reason: invalid class name and case insensitive filesystem */
public final class C76303th extends AnonymousClass14O {
    public void A00(JSONObject jSONObject, long j2) {
        if (jSONObject != null && jSONObject.has("fetch__WAAvatar")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("fetch__WAAvatar");
            if (jSONObject2.has("wa_full_preview")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("wa_full_preview");
                if (jSONObject3.has("url")) {
                    this.A00 = new C93364j4(jSONObject3.getString("url"));
                }
            }
        }
    }
}
