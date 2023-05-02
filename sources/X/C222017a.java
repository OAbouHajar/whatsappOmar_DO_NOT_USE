package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.17a  reason: invalid class name and case insensitive filesystem */
public class C222017a {
    public SharedPreferences A00;
    public SharedPreferences A01;
    public final C17020u3 A02;

    public C222017a(C17020u3 r1) {
        this.A02 = r1;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("triggered_block_prefs");
            this.A00 = sharedPreferences;
        }
        AnonymousClass00B.A06(sharedPreferences);
        return sharedPreferences;
    }

    public final JSONObject A01(C15830rv r4) {
        String string = A00().getString(r4.getRawString(), (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new JSONObject(string);
    }

    public final void A02(C15830rv r4, JSONObject jSONObject) {
        A00().edit().putString(r4.getRawString(), jSONObject.toString()).apply();
    }
}
