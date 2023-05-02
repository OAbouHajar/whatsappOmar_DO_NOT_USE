package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.13H  reason: invalid class name */
public class AnonymousClass13H {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass13H(C17020u3 r1) {
        this.A01 = r1;
    }

    public final synchronized SharedPreferences.Editor A00() {
        return A01().edit();
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("user_notice_cms_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public List A02() {
        ArrayList arrayList = new ArrayList();
        String string = A01().getString("user_notices_content", (String) null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String obj = jSONObject.get(keys.next()).toString();
                    C18450wi.A0H(obj, 0);
                    JSONObject jSONObject2 = new JSONObject(obj);
                    int i2 = jSONObject2.getInt("notice_id");
                    int i3 = jSONObject2.getInt("policyVersion");
                    String string2 = jSONObject2.getString("channel");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("banner");
                    AnonymousClass2Do r11 = null;
                    AnonymousClass2Dp r8 = optJSONObject == null ? null : new AnonymousClass2Dp(C46312Dn.A00(optJSONObject.getJSONObject("timing")), optJSONObject.getString("text"), optJSONObject.getString("light"), optJSONObject.getString("dark"), optJSONObject.getString("iconDescription"), optJSONObject.getString("action"));
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("modal");
                    C46322Dr A012 = optJSONObject2 == null ? null : C46322Dr.A01(optJSONObject2);
                    JSONObject optJSONObject3 = jSONObject2.optJSONObject("blocking-modal");
                    C46322Dr A013 = optJSONObject3 == null ? null : C46322Dr.A01(optJSONObject3);
                    JSONObject optJSONObject4 = jSONObject2.optJSONObject("badged-notice");
                    if (optJSONObject4 != null) {
                        String string3 = optJSONObject4.getString("text");
                        String string4 = optJSONObject4.getString("action");
                        C46312Dn A002 = C46312Dn.A00(optJSONObject4.getJSONObject("timing"));
                        C18450wi.A0B(string3);
                        C18450wi.A0B(string4);
                        r11 = new AnonymousClass2Do(A002, string3, string4);
                    }
                    C18450wi.A0B(string2);
                    arrayList.add(new C34171jo(r8, A012, A013, r11, string2, i2, i3));
                }
            } catch (JSONException e2) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e2);
            }
        }
        return arrayList;
    }
}
