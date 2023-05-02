package X;

import android.text.TextUtils;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1t5  reason: invalid class name and case insensitive filesystem */
public final class C39801t5 {
    public static C35221lZ A00(JSONObject jSONObject) {
        C35241lb r7;
        JSONObject jSONObject2 = jSONObject;
        String string = jSONObject2.getString("status");
        String optString = jSONObject2.optString(FacebookFacade.RequestParameter.DESCRIPTION);
        C35211lY A01 = A01(jSONObject2.optJSONObject("subtotal"));
        C35211lY A012 = A01(jSONObject2.optJSONObject("tax"));
        JSONObject optJSONObject = jSONObject2.optJSONObject("discount");
        C35211lY A013 = A01(optJSONObject);
        String optString2 = optJSONObject != null ? optJSONObject.optString("discount_program_name") : null;
        C35211lY A014 = A01(jSONObject2.optJSONObject("shipping"));
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject2.optJSONArray("items");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject jSONObject3 = (JSONObject) optJSONArray.get(i2);
                JSONObject jSONObject4 = jSONObject3.getJSONObject("amount");
                JSONObject optJSONObject2 = jSONObject3.optJSONObject("sale_amount");
                String optString3 = jSONObject3.optString("product_id");
                if (TextUtils.isEmpty(optString3)) {
                    optString3 = null;
                }
                arrayList.add(new C93554jO(A01(jSONObject4), A01(optJSONObject2), jSONObject3.getString("retailer_id"), optString3, jSONObject3.getString(FacebookFacade.RequestParameter.NAME), jSONObject3.getInt("quantity")));
            }
        }
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("expiration");
        if (optJSONObject3 != null) {
            long j2 = optJSONObject3.getLong("timestamp");
            String optString4 = optJSONObject3.optString(FacebookFacade.RequestParameter.DESCRIPTION);
            if (TextUtils.isEmpty(optString4)) {
                optString4 = null;
            }
            r7 = new C35241lb(optString4, j2);
        } else {
            r7 = null;
        }
        if (TextUtils.isEmpty(optString2)) {
            optString2 = null;
        }
        return new C35221lZ(r7, A01, A012, A013, A014, string, optString, optString2, arrayList);
    }

    public static C35211lY A01(JSONObject jSONObject) {
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        long j2 = jSONObject.getLong("value");
        int i2 = jSONObject.getInt("offset");
        String optString = jSONObject.optString(FacebookFacade.RequestParameter.DESCRIPTION);
        if (!TextUtils.isEmpty(optString)) {
            str = optString;
        }
        return new C35211lY(i2, str, j2);
    }

    public static C35251lc A02(AnonymousClass173 r16, String str, byte[] bArr, boolean z2) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            Log.e("CheckoutInfoContentParser/parseE2ECheckoutInfo/invalid native flow message does not have parameters json");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("reference_id");
            String optString = jSONObject.optString("type");
            C28411Vz A01 = r16.A01(jSONObject.optString("currency"));
            C35211lY A012 = A01(jSONObject.optJSONObject("total_amount"));
            String optString2 = jSONObject.optString("payment_configuration");
            String optString3 = jSONObject.optString("payment_type");
            C35221lZ A00 = A00(jSONObject.getJSONObject("order"));
            List A04 = A04(jSONObject.optJSONArray("external_payment_configurations"));
            String optString4 = jSONObject.optString("payment_method");
            return new C35251lc(A01, A00, A012, A00.A00(), string, optString, optString2, optString3, (String) null, jSONObject.optString("payment_status", (String) null), optString4, A04, bArr, jSONObject.optLong("payment_timestamp"), z2);
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("CheckoutInfoContentParser/parseE2ECheckoutInfo/invalid paramsJson=");
            sb.append(str2);
            Log.e(sb.toString());
            return null;
        }
    }

    public static String A03(C33211iD r3) {
        int i2 = r3.A01;
        if ((i2 & 1) == 1) {
            C58852uG r0 = r3.A03;
            if (r0 == null) {
                r0 = C58852uG.A08;
            }
            C58382tP r02 = ((AnonymousClass2u3) r0.A03.get(0)).A03;
            if (r02 == null) {
                r02 = C58382tP.A03;
            }
            return r02.A02;
        } else if ((i2 & 8) != 8) {
            return null;
        } else {
            AnonymousClass220 r03 = r3.A0O;
            AnonymousClass220 r2 = r03;
            if (r03 == null) {
                r03 = AnonymousClass220.A07;
            }
            if (r03.A01 != 6) {
                return null;
            }
            if (r2 == null) {
                r2 = AnonymousClass220.A07;
            }
            return ((AnonymousClass222) r2.A0d().A02.get(0)).A01;
        }
    }

    public static List A04(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                arrayList.add(new C35231la(jSONObject.optString("uri"), jSONObject.optString("type"), jSONObject.optString("payment_instruction")));
            }
        }
        return arrayList;
    }
}
