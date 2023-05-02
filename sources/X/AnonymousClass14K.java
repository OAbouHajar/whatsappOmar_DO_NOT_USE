package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mod2.fblibs.Facebook;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.14K  reason: invalid class name */
public class AnonymousClass14K {
    public final C16300so A00;
    public final C15860rz A01;
    public final AnonymousClass149 A02;
    public final AnonymousClass14A A03;
    public final C213313r A04;
    public final AnonymousClass01D A05;

    public AnonymousClass14K(C16300so r1, C15860rz r2, AnonymousClass149 r3, AnonymousClass14A r4, C213313r r5, AnonymousClass01D r6) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static JSONObject A00(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public String A01(String str) {
        String A002;
        C35811mX A003 = this.A03.A00(AnonymousClass021.A0N, str.getBytes(AnonymousClass01S.A0A));
        if (A003 != null && (A002 = A003.A00()) != null && str.equals(A02(A002))) {
            return A002;
        }
        this.A00.AcB("FBCredentialsStore/encryptFbUsers", "Failed to encrypt fb users", true);
        throw new IllegalStateException("Failed to encrypt fb users");
    }

    public final String A02(String str) {
        try {
            C35811mX A002 = AnonymousClass149.A00(new JSONArray(str));
            byte[] A012 = A002 == null ? null : this.A03.A01(A002, AnonymousClass021.A0N);
            if (A012 != null) {
                return new String(A012, AnonymousClass01S.A0A);
            }
            this.A00.AcB("FBCredentialsStore/decryptFbUsers", "Failed to decrypt fb users", true);
            throw new IllegalStateException("Failed to decrypt fb users");
        } catch (JSONException e2) {
            this.A00.AcB("FBCredentialsStore/decryptFbUsers", e2.getMessage(), true);
            throw new IllegalStateException("Failed to decrypt fb users", e2);
        }
    }

    public final Map A03() {
        String A022;
        AnonymousClass01D r7 = this.A05;
        String string = ((AnonymousClass14B) r7.get()).A00().getString("pref_fb_user_credentials_encrypted", (String) null);
        if (string == null) {
            C15860rz r4 = this.A01;
            A022 = ((SharedPreferences) r4.A01.get()).getString("pref_fb_user_credentials", (String) null);
            if (A022 != null) {
                ((AnonymousClass14B) r7.get()).A01(A01(A022));
                r4.A0K().remove("pref_fb_user_credentials").apply();
            }
        } else {
            A022 = A02(string);
        }
        if (A022 == null) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(A022);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            boolean z2 = false;
            for (Object next2 : hashMap.keySet()) {
                JSONObject jSONObject2 = new JSONObject((String) hashMap.get(next2));
                if (jSONObject2.has("accessToken")) {
                    String string2 = jSONObject2.getString("accessToken");
                    jSONObject2.remove("accessToken");
                    jSONObject2.put(Facebook.TOKEN, string2);
                    hashMap.put(next2, jSONObject2.toString());
                    z2 = true;
                }
            }
            if (!z2) {
                return hashMap;
            }
            ((AnonymousClass14B) r7.get()).A01(A01(A00(hashMap).toString()));
            return hashMap;
        } catch (JSONException e2) {
            throw new IllegalStateException("FBCredentialsStore : Failed to parse data from store", e2);
        }
    }

    public void A04(AnonymousClass144 r5) {
        Map A032 = A03();
        String str = r5.A00;
        if (!TextUtils.isEmpty((String) A032.get(str))) {
            A032.remove(str);
            ((AnonymousClass14B) this.A05.get()).A01(A01(new JSONObject(A032).toString()));
        }
    }
}
