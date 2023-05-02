package X;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Is  reason: invalid class name and case insensitive filesystem */
public class C47382Is {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Set A0C;
    public Set A0D;
    public Set A0E;
    public final long A0F;
    public final long A0G;

    public C47382Is(long j2, long j3) {
        this.A0F = j2;
        this.A0G = j3;
        this.A0C = new HashSet();
        this.A0E = new HashSet();
        this.A0D = new HashSet();
    }

    public C47382Is(Set set, Set set2, Set set3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.A0G = j2;
        this.A0F = j3;
        this.A02 = j4;
        this.A05 = j5;
        this.A03 = j6;
        this.A04 = j7;
        this.A0B = j8;
        this.A0A = j9;
        this.A08 = j10;
        this.A07 = j11;
        this.A09 = j12;
        this.A06 = j13;
        this.A01 = j14;
        this.A0C = set;
        this.A0E = set2;
        this.A00 = j15;
        this.A0D = set3;
    }

    public static C47382Is A00(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            long optLong = jSONObject.optLong("start_ts");
            long optLong2 = jSONObject.optLong("log_start_date");
            long optLong3 = jSONObject.optLong("total_one_time_mandate_cnt");
            long optLong4 = jSONObject.optLong("total_transaction_sent_cnt");
            long optLong5 = jSONObject.optLong("total_recurring_mandate_cnt");
            long optLong6 = jSONObject.optLong("total_transaction_received_cnt");
            long optLong7 = jSONObject.optLong("transaction_sent_with_sticker_cnt");
            long optLong8 = jSONObject.optLong("transaction_sent_with_background_cnt");
            long optLong9 = jSONObject.optLong("transaction_received_with_sticker_cnt");
            long optLong10 = jSONObject.optLong("transaction_received_with_background_cnt");
            long optLong11 = jSONObject.optLong("transaction_sent_with_background_and_sticker_cnt");
            long optLong12 = jSONObject.optLong("transaction_received_with_background_and_sticker_cnt");
            long optLong13 = jSONObject.optLong("invites_sent_to_user_cnt");
            return new C47382Is(A01(jSONObject.optJSONArray("invited_user_cnt")), A01(jSONObject.optJSONArray("invited_user_registered_cnt")), A01(jSONObject.optJSONArray("inviter_user_cnt")), optLong, optLong2, optLong3, optLong4, optLong5, optLong6, optLong7, optLong8, optLong9, optLong10, optLong11, optLong12, optLong13, jSONObject.optLong("invites_received_to_user_cnt"));
        } catch (JSONException e2) {
            e2.getMessage();
            return null;
        }
    }

    public static Set A01(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    hashSet.add(jSONArray.getString(i2));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return hashSet;
    }
}
