package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1tI  reason: invalid class name and case insensitive filesystem */
public abstract class C39931tI extends C39901tF {
    public int A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;

    public JSONObject A0A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", this.A00);
            if (!TextUtils.isEmpty(this.A08)) {
                jSONObject.put("merchantId", this.A08);
            }
            if (!TextUtils.isEmpty(this.A0B)) {
                jSONObject.put("supportPhoneNumber", this.A0B);
            }
            if (!TextUtils.isEmpty(this.A02)) {
                jSONObject.put("businessName", this.A02);
            }
            if (!TextUtils.isEmpty(this.A06)) {
                jSONObject.put("displayState", this.A06);
            }
            try {
                jSONObject.put("p2mReceive", this.A09);
                return jSONObject;
            } catch (JSONException e2) {
                StringBuilder sb = new StringBuilder("PAY: PaymentMethodMerchantCountryData/addCapabilitiesToJson threw: ");
                sb.append(e2);
                Log.w(sb.toString());
                return jSONObject;
            }
        } catch (JSONException e3) {
            StringBuilder sb2 = new StringBuilder("PAY: MerchantMethodData toDBJSONObject threw: ");
            sb2.append(e3);
            Log.w(sb2.toString());
            return jSONObject;
        }
    }

    public void A0B(JSONObject jSONObject) {
        this.A00 = jSONObject.optInt("state", 0);
        this.A08 = jSONObject.optString("merchantId", (String) null);
        this.A0B = jSONObject.optString("supportPhoneNumber", (String) null);
        this.A02 = jSONObject.optString("businessName", (String) null);
        String optString = jSONObject.optString("displayState", (String) null);
        if (TextUtils.isEmpty(optString)) {
            optString = "ACTIVE";
        }
        this.A06 = optString;
        this.A09 = jSONObject.optString("p2mReceive", "WAIT_ACTIVE");
    }

    public boolean A0C() {
        String str = this.A06;
        return "PENDING".equals(str) || "INITED".equals(str);
    }
}
