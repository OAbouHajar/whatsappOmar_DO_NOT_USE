package X;

import android.content.SharedPreferences;
import android.net.Uri;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Aw  reason: invalid class name and case insensitive filesystem */
public final class C23201Aw {
    public final C16440t3 A00;
    public final C14710pd A01;
    public final C23191Av A02;

    public C23201Aw(C16440t3 r1, C14710pd r2, C23191Av r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A00(Uri uri, C15830rv r11) {
        C18450wi.A0H(r11, 0);
        C18450wi.A0H(uri, 1);
        String queryParameter = uri.getQueryParameter("utm_source");
        String queryParameter2 = uri.getQueryParameter("utm_campaign");
        if (queryParameter != null && queryParameter2 != null && this.A01.A0E(C16620tM.A02, 2895)) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                SharedPreferences A002 = this.A02.A02.A00.A00("utm_tracking_data");
                C18450wi.A0B(A002);
                SharedPreferences.Editor edit = A002.edit();
                String rawString = r11.getRawString();
                C18450wi.A0B(rawString);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cj", r11.getRawString());
                jSONObject.put("src", queryParameter);
                jSONObject.put("cpg", queryParameter2);
                jSONObject.put("ct", currentTimeMillis);
                String obj = jSONObject.toString();
                C18450wi.A0B(obj);
                edit.putString(rawString, obj).apply();
            } catch (JSONException e2) {
                Log.e(C18450wi.A06("UTM: UtmTrackingDataStore/storeData/json error", e2));
            }
        }
    }
}
