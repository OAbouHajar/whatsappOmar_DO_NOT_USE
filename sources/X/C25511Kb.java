package X;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: X.1Kb  reason: invalid class name and case insensitive filesystem */
public class C25511Kb {
    public AnonymousClass14A A00;
    public final C16300so A01;
    public final AnonymousClass1I2 A02;
    public final AnonymousClass149 A03;

    public C25511Kb(C16300so r1, AnonymousClass1I2 r2, AnonymousClass149 r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    public void A00() {
        this.A02.A00().edit().remove("current_search_location").apply();
    }

    public void A01() {
        this.A02.A00().edit().putBoolean("show_request_permission_dialog", false).apply();
    }

    public void A02(AnonymousClass26B r5) {
        SharedPreferences.Editor edit = this.A02.A00().edit();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("radius", r5.A05);
        jSONObject.put("latitude", r5.A03);
        jSONObject.put("longitude", r5.A04);
        jSONObject.put("imprecise_latitude", r5.A01);
        jSONObject.put("imprecise_longitude", r5.A02);
        jSONObject.put("location_description", r5.A07);
        jSONObject.put("provider", r5.A08);
        jSONObject.put("accuracy", r5.A00);
        jSONObject.put("country_code", (Object) null);
        String obj = jSONObject.toString();
        edit.putString("current_search_location", AnonymousClass2RB.A01(this.A01, this.A00, obj)).apply();
    }

    public void A03(boolean z2) {
        this.A02.A00().edit().putBoolean("location_access_granted", z2).apply();
    }
}
