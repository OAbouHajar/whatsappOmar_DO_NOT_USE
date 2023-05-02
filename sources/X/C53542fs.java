package X;

import org.json.JSONObject;

/* renamed from: X.2fs  reason: invalid class name and case insensitive filesystem */
public class C53542fs {
    public C35431lv A00;

    public C53542fs(AnonymousClass173 r6, C86904Up r7) {
        C28411Vz A01 = r6.A01(r7.A01);
        long parseLong = Long.parseLong(r7.A03);
        int parseInt = Integer.parseInt(r7.A02);
        this.A00 = new C35431lv(A01, parseInt <= 0 ? 1 : parseInt, parseLong);
    }

    public C53542fs(String str) {
        C35431lv r0;
        JSONObject jSONObject = new JSONObject(str);
        C28411Vz r6 = C35481m0.A06;
        new C35431lv(r6, 1, 0);
        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("min_amount"));
        long optLong = jSONObject2.optLong("value", -1);
        int optInt = jSONObject2.optInt("offset", -1);
        int optInt2 = jSONObject2.optInt("currencyType", -1);
        JSONObject optJSONObject = jSONObject2.optJSONObject("currency");
        r6 = optJSONObject != null ? optInt2 != 1 ? new C35481m0(optJSONObject) : new C35531m5(optJSONObject) : r6;
        if (optInt > 0) {
            r0 = new C35431lv(r6, optInt, optLong);
        }
        this.A00 = r0;
    }
}
