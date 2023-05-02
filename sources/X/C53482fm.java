package X;

import org.json.JSONObject;

/* renamed from: X.2fm  reason: invalid class name and case insensitive filesystem */
public class C53482fm {
    public final int A00;
    public final boolean A01;

    public C53482fm(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.A00 = jSONObject.getInt("max_from_sender");
        this.A01 = jSONObject.getBoolean("usync_pay_eligible_offers_includes_current_offer_id");
    }

    public C53482fm(String str, Long l2) {
        this.A00 = l2 == null ? -1 : l2.intValue();
        this.A01 = "1".equals(str);
    }
}
