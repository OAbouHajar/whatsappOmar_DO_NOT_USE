package X;

import org.json.JSONObject;

/* renamed from: X.1Lp  reason: invalid class name and case insensitive filesystem */
public class C25911Lp extends C111955hh {
    public int A00;

    public void A00(JSONObject jSONObject, long j2) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("whatsapp_galaxy_forward_flow_data_response");
        int i2 = 1;
        if (jSONObject2.optInt("status_code") == 200) {
            i2 = 0;
        }
        this.A00 = i2;
        this.A00 = jSONObject2.getString("payload");
    }

    public String A01(long j2) {
        return "whatsapp_galaxy_forward_flow_data_response";
    }
}
