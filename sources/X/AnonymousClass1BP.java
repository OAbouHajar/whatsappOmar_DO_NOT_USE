package X;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1BP  reason: invalid class name */
public abstract class AnonymousClass1BP {
    public C78963yy A00;
    public boolean A01;
    public final C18260wP A02;
    public final C16440t3 A03;
    public final AnonymousClass013 A04;
    public final AnonymousClass1BT A05;
    public final AnonymousClass1BS A06;
    public final C16490t9 A07;
    public final C207111h A08;
    public final C18520wp A09;
    public final C16320sq A0A;

    public AnonymousClass1BP(C18260wP r1, C16440t3 r2, AnonymousClass013 r3, AnonymousClass1BT r4, AnonymousClass1BS r5, C16490t9 r6, C207111h r7, C18520wp r8, C16320sq r9) {
        this.A03 = r2;
        this.A0A = r9;
        this.A07 = r6;
        this.A04 = r3;
        this.A08 = r7;
        this.A02 = r1;
        this.A06 = r5;
        this.A05 = r4;
        this.A09 = r8;
    }

    public C88304aH A00() {
        String string = ((SharedPreferences) this.A06.A00.A01.get()).getString("emoji_dictionary_info", (String) null);
        if (string == null) {
            return new C88304aH();
        }
        try {
            C88304aH r6 = new C88304aH();
            JSONObject jSONObject = new JSONObject(string);
            r6.A04 = jSONObject.optString("request_etag", (String) null);
            r6.A00 = jSONObject.optLong("cache_fetch_time", 0);
            r6.A03 = jSONObject.optString("language", (String) null);
            r6.A01 = jSONObject.optLong("last_fetch_attempt_time", 0);
            r6.A05 = jSONObject.optString("language_attempted_to_fetch", (String) null);
            return r6;
        } catch (JSONException unused) {
            return new C88304aH();
        }
    }

    public boolean A01(C88304aH r5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_etag", r5.A04);
            jSONObject.put("language", r5.A03);
            jSONObject.put("cache_fetch_time", r5.A00);
            jSONObject.put("last_fetch_attempt_time", r5.A01);
            jSONObject.put("language_attempted_to_fetch", r5.A05);
            this.A06.A00.A0K().putString("emoji_dictionary_info", jSONObject.toString()).apply();
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
