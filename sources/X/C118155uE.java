package X;

import com.facebook.redex.IDxKCallbackShape389S0100000_3_I1;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5uE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118155uE {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ Map A02;

    public /* synthetic */ C118155uE(AnonymousClass1Z7 r1, BrazilPayBloksActivity brazilPayBloksActivity, Map map) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = map;
        this.A00 = r1;
    }

    public final void A00(C117575tD r17) {
        String str;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        Map map = this.A02;
        AnonymousClass1Z7 r2 = this.A00;
        C117575tD r5 = r17;
        if (r17 != null) {
            map.put("network_name", C35391lr.A06(r5.A00));
        }
        r2.A01("on_success", map);
        C118585uv r1 = brazilPayBloksActivity.A0F;
        r1.A00 = r5;
        if (r17 == null || r5.A00 != 5 || (str = r5.A04) == null || !str.equals("0")) {
            r1.A0B.A04(r5);
            r1.A03 = false;
            return;
        }
        String str2 = r5.A06;
        if (str2 != null) {
            C18300wT r52 = r1.A0E;
            String A0E = C13700nu.A0E(r52.A01(), "payment_trusted_device_elo_wallet_store");
            JSONObject jSONObject = null;
            if (A0E != null) {
                try {
                    jSONObject = C13700nu.A0K(A0E);
                } catch (JSONException unused) {
                    r52.A02.A06("Failed to updated the wallet_id");
                }
            } else {
                jSONObject = C13700nu.A0J();
            }
            jSONObject.put("wallet_id", str2);
            C13680ns.A0y(C110105dW.A06(r52), "payment_trusted_device_elo_wallet_store", jSONObject.toString());
        }
        C16440t3 r7 = r1.A07;
        C118555us r3 = new C118555us(r1.A08.A00, r1.A04, r1.A05, r7, r1.A0A, r1.A0C, r1.A0D, r1.A0E, r1.A0F, r1.A0G, new C117905tk(r1), r1.A0H);
        C119285wq r9 = r3.A09;
        AnonymousClass50C A0R = C110115dX.A0R(r9, "ELO", "ADD-CARD");
        if (A0R == null) {
            new C118435ug(r3.A00, r3.A01, r3.A06, r3.A08, r9, "ADD-CARD").A00(new IDxKCallbackShape389S0100000_3_I1(r3, 0), "ELO");
            return;
        }
        r3.A00((AnonymousClass2HJ) null, A0R);
    }
}
