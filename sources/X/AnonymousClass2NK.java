package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2NK  reason: invalid class name */
public class AnonymousClass2NK {
    public static String A00(C16440t3 r8, C38091qE r9) {
        if (r9 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("auth_token", r9.A08);
            jSONObject.put("conn_ttl", r9.A05);
            jSONObject.put("auth_ttl", r9.A03);
            jSONObject.put("max_buckets", r9.A06);
            List<C38211qQ> list = r9.A0A;
            JSONArray jSONArray = new JSONArray();
            for (C38211qQ r5 : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("hostname", r5.A04);
                jSONObject2.put("ip4", r5.A05);
                jSONObject2.put("ip6", r5.A06);
                jSONObject2.put("class", r5.A07);
                jSONObject2.put("fallback_hostname", r5.A00);
                jSONObject2.put("fallback_ip4", r5.A01);
                jSONObject2.put("fallback_ip6", r5.A02);
                jSONObject2.put("fallback_class", r5.A03);
                jSONObject2.put("upload", A01(r5.A0B));
                jSONObject2.put("download", A01(r5.A09));
                jSONObject2.put("download_buckets", A01(r5.A0A));
                jSONObject2.put("type", r5.A08);
                jSONObject2.put("force_ip", r5.A0C);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("hosts", jSONArray);
            jSONObject.put("send_time_abs_ms", (r9.A07 - SystemClock.elapsedRealtime()) + r8.A00());
            jSONObject.put("last_id", r9.A09);
            jSONObject.put("is_new", r9.A0B);
            jSONObject.put("max_autodownload_retry", r9.A00);
            jSONObject.put("max_manual_retry", r9.A01);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.e("routingresponse/can't serialize json", e2);
            return null;
        }
    }

    public static JSONArray A01(Set set) {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object put : set) {
            jSONArray.put(put);
        }
        return jSONArray;
    }
}
