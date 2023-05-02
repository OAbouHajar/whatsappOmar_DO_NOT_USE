package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Ko  reason: invalid class name and case insensitive filesystem */
public class C25641Ko {
    public Long A00;
    public final C25511Kb A01;
    public final C16440t3 A02;

    public C25641Ko(C25511Kb r1, C16440t3 r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public AnonymousClass26B A00() {
        try {
            C25511Kb r3 = this.A01;
            String string = r3.A02.A00().getString("current_search_location", "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            String A002 = AnonymousClass2RB.A00(r3.A01, r3.A00, string);
            if (TextUtils.isEmpty(A002)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(A002);
                Double valueOf = Double.valueOf(jSONObject.optDouble("radius"));
                Double valueOf2 = Double.valueOf(jSONObject.optDouble("latitude"));
                Double valueOf3 = Double.valueOf(jSONObject.optDouble("longitude"));
                double optDouble = jSONObject.optDouble("imprecise_latitude", -1.0d);
                double optDouble2 = jSONObject.optDouble("imprecise_longitude", -1.0d);
                String string2 = jSONObject.getString("location_description");
                String string3 = jSONObject.getString("provider");
                return new AnonymousClass26B(valueOf, valueOf2, valueOf3, optDouble == -1.0d ? null : Double.valueOf(optDouble), optDouble2 == -1.0d ? null : Double.valueOf(optDouble2), Double.valueOf(jSONObject.optDouble("accuracy")), string2, jSONObject.optString("country_code"), string3);
            } catch (JSONException e2) {
                Log.i("SearchLocation/fromJsonString Invalid search location string", e2);
                return null;
            }
        } catch (Exception e3) {
            Log.e("SearchLocationRepository/readSearchLocation: Failed to fetch the search location", e3);
            return null;
        }
    }

    public AnonymousClass26B A01() {
        AnonymousClass26B A002 = A00();
        if (A002 != null) {
            if (!"device".equals(A002.A08)) {
                return A002;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l2 = this.A00;
            if (l2 == null || 86400000 < currentTimeMillis - l2.longValue()) {
                return null;
            }
            return A002;
        }
        return null;
    }

    public Integer A02() {
        AnonymousClass26B A002 = A00();
        if (A002 != null) {
            return Integer.valueOf(A002.A00());
        }
        return null;
    }
}
