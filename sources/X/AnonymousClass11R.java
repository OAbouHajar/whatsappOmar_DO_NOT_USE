package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.11R  reason: invalid class name */
public class AnonymousClass11R {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass11R(C17020u3 r1) {
        this.A01 = r1;
    }

    public final synchronized SharedPreferences A00() {
        if (this.A00 == null) {
            SharedPreferences A002 = this.A01.A00("companion_mode_prefs");
            this.A00 = A002;
            if (A002.contains("contacts_except_feature_flag")) {
                this.A00.edit().remove("contacts_except_feature_flag").apply();
            }
        }
        return this.A00;
    }

    public JSONObject A01() {
        String string = A00().getString("history_sync_companion_state", (String) null);
        try {
            if (!TextUtils.isEmpty(string)) {
                return new JSONObject(string);
            }
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("syncd-shared-preferencecs/ Invalid JSON value:");
            sb.append(string);
            Log.e(sb.toString());
        }
        return null;
    }

    public void A02(int i2) {
        A00().edit().putInt("companion_syncd_critical_bootstrap_state", i2).apply();
    }

    public byte[] A03() {
        String string = A00().getString("adv_signed_identity", (String) null);
        if (!TextUtils.isEmpty(string)) {
            return Base64.decode(string, 3);
        }
        return null;
    }
}
