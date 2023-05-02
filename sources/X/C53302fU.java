package X;

import com.mod2.fblibs.FacebookFacade;
import org.json.JSONObject;

/* renamed from: X.2fU  reason: invalid class name and case insensitive filesystem */
public class C53302fU {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C35431lv A07;
    public final C53312fV A08;
    public final C53542fs A09;
    public final C53482fm A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public C53302fU(AnonymousClass173 r6, C53312fV r7, AnonymousClass3AZ r8, String str) {
        int i2;
        this.A08 = r7;
        this.A0D = str;
        this.A0F = r8.A0G;
        this.A04 = r8.A05.longValue();
        this.A0E = r8.A0F;
        this.A06 = r8.A08.longValue();
        this.A0B = r8.A0B;
        this.A0C = r8.A0D;
        this.A05 = r8.A07.longValue();
        String str2 = r8.A0E;
        if (str2.equalsIgnoreCase("active")) {
            i2 = 0;
        } else if (str2.equalsIgnoreCase("inactive")) {
            i2 = 1;
        } else if (str2.equalsIgnoreCase("archived")) {
            i2 = 2;
        } else {
            StringBuilder sb = new StringBuilder("invalid state for offer: ");
            sb.append(str2);
            throw new AnonymousClass1W9(sb.toString());
        }
        this.A03 = i2;
        C86904Up r3 = r8.A03;
        C28411Vz A012 = r6.A01(r3.A01);
        long parseLong = Long.parseLong(r3.A03);
        int parseInt = Integer.parseInt(r3.A02);
        this.A07 = new C35431lv(A012, parseInt <= 0 ? 1 : parseInt, parseLong);
        AnonymousClass4Tb r0 = r8.A01;
        AnonymousClass00B.A06(r0);
        this.A09 = new C53542fs(r6, r0.A01);
        this.A0A = new C53482fm(r8.A0C, r8.A04);
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = false;
    }

    public C53302fU(String str) {
        C35431lv r0;
        JSONObject jSONObject = new JSONObject(str);
        this.A03 = jSONObject.getInt("state");
        this.A04 = jSONObject.getLong("end_ts");
        this.A0F = jSONObject.getString("title");
        this.A0D = jSONObject.getString("locale");
        this.A06 = jSONObject.getLong("start_ts");
        this.A0E = jSONObject.getString("terms_url");
        this.A05 = (long) jSONObject.getInt("redeem_limit");
        this.A0B = jSONObject.getString(FacebookFacade.RequestParameter.DESCRIPTION);
        this.A0C = jSONObject.getString("fine_print_url");
        this.A02 = jSONObject.getBoolean("interactive_sync_done");
        this.A00 = jSONObject.getInt("kill_switch_info_viewed");
        this.A01 = jSONObject.getInt("sender_maxed_info_viewed");
        this.A08 = new C53312fV(jSONObject.getString("id"));
        C28411Vz r7 = C35481m0.A06;
        new C35431lv(r7, 1, 0);
        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("offer_amount"));
        long optLong = jSONObject2.optLong("value", -1);
        int optInt = jSONObject2.optInt("offset", -1);
        int optInt2 = jSONObject2.optInt("currencyType", -1);
        JSONObject optJSONObject = jSONObject2.optJSONObject("currency");
        r7 = optJSONObject != null ? optInt2 != 1 ? new C35481m0(optJSONObject) : new C35531m5(optJSONObject) : r7;
        if (optInt > 0) {
            r0 = new C35431lv(r7, optInt, optLong);
        }
        this.A07 = r0;
        this.A09 = new C53542fs(jSONObject.getString("payment"));
        this.A0A = new C53482fm(jSONObject.getString("receiver"));
    }
}
