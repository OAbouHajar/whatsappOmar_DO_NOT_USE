package X;

import android.text.TextUtils;
import com.mod2.fblibs.FacebookFacade;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1t6  reason: invalid class name and case insensitive filesystem */
public class C39811t6 {
    public static JSONArray A00(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C35231la r3 = (C35231la) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", r3.A02);
            jSONObject.put("type", r3.A01);
            jSONObject.put("payment_instruction", r3.A00);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject A01(C35221lZ r6) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", r6.A01);
        String str = r6.A00;
        if (str != null) {
            jSONObject.put(FacebookFacade.RequestParameter.DESCRIPTION, str);
        }
        C35211lY r0 = r6.A05;
        if (r0 != null) {
            jSONObject.put("subtotal", A02(r0));
        }
        C35211lY r02 = r6.A06;
        if (r02 != null) {
            jSONObject.put("tax", A02(r02));
        }
        C35211lY r03 = r6.A03;
        if (r03 != null) {
            String str2 = r6.A07;
            JSONObject A02 = A02(r03);
            if (!TextUtils.isEmpty(str2)) {
                A02.put("discount_program_name", str2);
            }
            jSONObject.put("discount", A02);
        }
        C35211lY r04 = r6.A04;
        if (r04 != null) {
            jSONObject.put("shipping", A02(r04));
        }
        C35241lb r1 = r6.A02;
        if (r1 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timestamp", r1.A00);
            String str3 = r1.A01;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put(FacebookFacade.RequestParameter.DESCRIPTION, str3);
            }
            jSONObject.put("expiration", jSONObject2);
        }
        List<C93554jO> list = r6.A08;
        JSONArray jSONArray = new JSONArray();
        for (C93554jO r5 : list) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("retailer_id", r5.A05);
            String str4 = r5.A04;
            if (!TextUtils.isEmpty(str4)) {
                jSONObject3.put("product_id", str4);
            }
            jSONObject3.put(FacebookFacade.RequestParameter.NAME, r5.A03);
            jSONObject3.put("amount", A02(r5.A01));
            jSONObject3.put("quantity", r5.A00);
            C35211lY r05 = r5.A02;
            if (r05 != null) {
                jSONObject3.put("sale_amount", A02(r05));
            }
            jSONArray.put(jSONObject3);
        }
        jSONObject.put("items", jSONArray);
        return jSONObject;
    }

    public static JSONObject A02(C35211lY r4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("value", r4.A01);
        jSONObject.put("offset", r4.A00);
        String str = r4.A02;
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put(FacebookFacade.RequestParameter.DESCRIPTION, str);
        }
        return jSONObject;
    }

    public static JSONObject A03(C35251lc r6, boolean z2) {
        if (r6 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        C28411Vz r0 = r6.A04;
        if (r0 != null) {
            jSONObject.put("currency", ((C35491m1) r0).A04);
        }
        JSONArray A00 = A00(r6.A0C);
        if (A00 != null) {
            jSONObject.put("external_payment_configurations", A00);
        }
        String str = r6.A07;
        if (str != null) {
            jSONObject.put("payment_configuration", str);
        }
        String str2 = r6.A08;
        if (str2 != null) {
            jSONObject.put("payment_type", str2);
        }
        if (!z2) {
            C35211lY r02 = r6.A06;
            if (r02 != null) {
                jSONObject.put("total_amount", A02(r02));
            }
            jSONObject.put("reference_id", r6.A09);
        }
        String str3 = r6.A0B;
        if (str3 != null) {
            jSONObject.put("type", str3);
        }
        String str4 = r6.A01;
        if (str4 != null) {
            jSONObject.put("payment_method", str4);
        }
        String str5 = r6.A02;
        if (str5 != null) {
            jSONObject.put("payment_status", str5);
        }
        long j2 = r6.A00;
        if (j2 > 0) {
            jSONObject.put("payment_timestamp", j2);
        }
        jSONObject.put("order", A01(r6.A05));
        return jSONObject;
    }
}
