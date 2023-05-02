package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1tG  reason: invalid class name and case insensitive filesystem */
public abstract class C39911tG extends C39901tF {
    public long A00;
    public C35301lh A01;
    public C35301lh A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public byte[] A09;

    public String A0A() {
        C35301lh r0 = this.A01;
        return (String) (r0 == null ? null : r0.A00);
    }

    public JSONObject A0B() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.A03;
            if (str != null) {
                jSONObject.put("bankImageURL", str);
            }
            String str2 = this.A04;
            if (str2 != null) {
                jSONObject.put("bankPhoneNumber", str2);
                return jSONObject;
            }
        } catch (JSONException e2) {
            Log.w("PAY: PaymentMethodBankAccountCountryData toJSONObject threw: ", e2);
        }
        return jSONObject;
    }
}
