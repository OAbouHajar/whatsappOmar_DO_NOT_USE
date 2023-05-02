package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1N5  reason: invalid class name */
public final class AnonymousClass1N5 {
    public AnonymousClass60V A00;
    public final C15220qW A01 = new AnonymousClass1DV(new AnonymousClass3Il(this));

    public AnonymousClass1N5(AnonymousClass60V r3) {
        C18450wi.A0H(r3, 1);
        this.A00 = r3;
    }

    public final void A00(Map map) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry value : map.entrySet()) {
                AnonymousClass4WN r3 = (AnonymousClass4WN) value.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("credentialId", r3.A01);
                jSONObject.put("internationalActivationStatus", r3.A00);
                jSONObject.put("startTime", r3.A03);
                jSONObject.put("endTime", r3.A02);
                jSONArray.put(jSONObject);
            }
            this.A00.A0N(jSONArray);
        } catch (JSONException unused) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs saveInternationalState threw: an exception ");
        }
    }
}
