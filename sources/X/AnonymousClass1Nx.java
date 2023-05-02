package X;

import android.content.SharedPreferences;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Nx  reason: invalid class name */
public class AnonymousClass1Nx {
    public SharedPreferences A00;
    public final C16440t3 A01;
    public final C17020u3 A02;

    public AnonymousClass1Nx(C16440t3 r1, C17020u3 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        r0 = X.C47382Is.A00(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C47382Is A00() {
        /*
            r6 = this;
            X.0t3 r5 = r6.A01
            long r3 = r5.A00()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r3 % r0
            long r3 = r3 - r0
            android.content.SharedPreferences r2 = r6.A00
            if (r2 != 0) goto L_0x001a
            X.0u3 r1 = r6.A02
            java.lang.String r0 = "payment_daily_usage_preferences"
            android.content.SharedPreferences r2 = r1.A00(r0)
            r6.A00 = r2
        L_0x001a:
            java.lang.String r1 = java.lang.Long.toString(r3)
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002f
            X.2Is r0 = X.C47382Is.A00(r1)
            if (r0 != 0) goto L_0x0038
        L_0x002f:
            long r1 = r5.A00()
            X.2Is r0 = new X.2Is
            r0.<init>(r3, r1)
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Nx.A00():X.2Is");
    }

    public void A01(C47382Is r6) {
        long A002 = this.A01.A00();
        String l2 = Long.toString(A002 - (A002 % 86400000));
        try {
            JSONObject put = new JSONObject().put("start_ts", r6.A0G).put("log_start_date", r6.A0F).put("total_one_time_mandate_cnt", r6.A02).put("total_transaction_sent_cnt", r6.A05).put("total_recurring_mandate_cnt", r6.A03).put("total_transaction_received_cnt", r6.A04).put("transaction_sent_with_sticker_cnt", r6.A0B).put("transaction_sent_with_background_cnt", r6.A0A).put("transaction_received_with_sticker_cnt", r6.A08).put("transaction_received_with_background_cnt", r6.A07).put("transaction_sent_with_background_and_sticker_cnt", r6.A09).put("transaction_received_with_background_and_sticker_cnt", r6.A06).put("invites_sent_to_user_cnt", r6.A01);
            Set<Object> set = r6.A0C;
            JSONArray jSONArray = new JSONArray();
            for (Object put2 : set) {
                jSONArray.put(put2);
            }
            JSONObject put3 = put.put("invited_user_cnt", jSONArray);
            Set<Object> set2 = r6.A0E;
            JSONArray jSONArray2 = new JSONArray();
            for (Object put4 : set2) {
                jSONArray2.put(put4);
            }
            JSONObject put5 = put3.put("invited_user_registered_cnt", jSONArray2).put("invites_received_to_user_cnt", r6.A00);
            Set<Object> set3 = r6.A0D;
            JSONArray jSONArray3 = new JSONArray();
            for (Object put6 : set3) {
                jSONArray3.put(put6);
            }
            String obj = put5.put("inviter_user_cnt", jSONArray3).toString();
            SharedPreferences sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A02.A00("payment_daily_usage_preferences");
                this.A00 = sharedPreferences;
            }
            sharedPreferences.edit().putString(l2, obj).apply();
        } catch (JSONException e2) {
            e2.getMessage();
        }
    }
}
