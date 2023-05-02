package X;

import android.text.TextUtils;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2fS  reason: invalid class name and case insensitive filesystem */
public class C53282fS {
    public final C16440t3 A00;
    public final C18300wT A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();

    public C53282fS(C16440t3 r2, C18300wT r3) {
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A00() {
        C18300wT r7 = this.A01;
        String string = r7.A01().getString("payment_incentive_offer_details", (String) null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                ConcurrentHashMap concurrentHashMap = this.A02;
                concurrentHashMap.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    long A012 = C29501aj.A01(next, 0);
                    if (A012 > 0) {
                        concurrentHashMap.put(Long.valueOf(A012), new C53302fU(jSONObject.getString(next)));
                    }
                }
            } catch (JSONException unused) {
                Log.e("PAY: PaymentIncentiveOfferMap/loadFromSharedPref failed to load the current offer details");
                this.A02.clear();
                r7.A01().edit().putString("payment_incentive_offer_details", (String) null).apply();
            }
        }
    }

    public final void A01() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.A02.entrySet()) {
                String l2 = Long.toString(((Number) entry.getKey()).longValue());
                C53302fU r2 = (C53302fU) entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                C53312fV r3 = r2.A08;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("update_count", r3.A00);
                jSONObject3.put("id", r3.A01);
                jSONObject2.put("id", jSONObject3.toString());
                jSONObject2.put("state", r2.A03);
                jSONObject2.put("title", r2.A0F);
                jSONObject2.put("end_ts", r2.A04);
                jSONObject2.put("locale", r2.A0D);
                jSONObject2.put("start_ts", r2.A06);
                jSONObject2.put("terms_url", r2.A0E);
                jSONObject2.put(FacebookFacade.RequestParameter.DESCRIPTION, r2.A0B);
                jSONObject2.put("redeem_limit", r2.A05);
                jSONObject2.put("fine_print_url", r2.A0C);
                jSONObject2.put("interactive_sync_done", r2.A02);
                jSONObject2.put("kill_switch_info_viewed", r2.A00);
                jSONObject2.put("sender_maxed_info_viewed", r2.A01);
                jSONObject2.put("offer_amount", r2.A07.A01().toString());
                C53542fs r0 = r2.A09;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("min_amount", r0.A00.A01().toString());
                jSONObject2.put("payment", jSONObject4.toString());
                C53482fm r32 = r2.A0A;
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("max_from_sender", r32.A00);
                jSONObject5.put("usync_pay_eligible_offers_includes_current_offer_id", r32.A01);
                jSONObject2.put("receiver", jSONObject5.toString());
                jSONObject.put(l2, jSONObject2.toString());
            }
            C18300wT r02 = this.A01;
            r02.A01().edit().putString("payment_incentive_offer_details", jSONObject.toString()).apply();
        } catch (JSONException unused) {
            this.A02.clear();
            this.A01.A01().edit().putString("payment_incentive_offer_details", (String) null).apply();
        }
    }

    public void A02(C53302fU r12, long j2) {
        A00();
        ConcurrentHashMap concurrentHashMap = this.A02;
        concurrentHashMap.put(Long.valueOf(j2), r12);
        for (int size = concurrentHashMap.size() - 2; size > 0; size--) {
            long j3 = 0;
            long j4 = Long.MAX_VALUE;
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((Number) entry.getKey()).longValue() != j2 && ((C53302fU) entry.getValue()).A04 < j4) {
                    j3 = ((Number) entry.getKey()).longValue();
                    j4 = ((C53302fU) entry.getValue()).A04;
                }
            }
            concurrentHashMap.remove(Long.valueOf(j3));
        }
        A01();
    }
}
