package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1DK  reason: invalid class name */
public class AnonymousClass1DK {
    public SharedPreferences A00;
    public final C16440t3 A01;
    public final C17020u3 A02;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap(4);

    public AnonymousClass1DK(C16440t3 r3, C17020u3 r4) {
        this.A01 = r3;
        this.A02 = r4;
    }

    public final synchronized SharedPreferences.Editor A00() {
        SharedPreferences.Editor edit;
        synchronized (this) {
            SharedPreferences sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A02.A00("privacy_disclosure_store");
                this.A00 = sharedPreferences;
            }
            edit = sharedPreferences.edit();
        }
        return edit;
    }

    public void A01(C85244Nr r17, int i2) {
        ConcurrentHashMap concurrentHashMap = this.A03;
        if (concurrentHashMap.size() == 0) {
            synchronized (this) {
                SharedPreferences sharedPreferences = this.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = this.A02.A00("privacy_disclosure_store");
                    this.A00 = sharedPreferences;
                }
                for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                    try {
                        Integer valueOf = Integer.valueOf((String) next.getKey());
                        try {
                            JSONObject jSONObject = new JSONObject((String) next.getValue());
                            int i3 = jSONObject.getInt("type");
                            int i4 = jSONObject.getInt("stage");
                            long j2 = jSONObject.getLong("activatedTimeInSecond");
                            long j3 = jSONObject.getLong("acceptedTimeInSecond");
                            String string = jSONObject.getString("deepLink");
                            String string2 = jSONObject.getString("content");
                            if (i4 < -1 || i4 > 430) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("privacydisclosurestore/loadFromFile bad stage value for disclosure = ");
                                sb.append(valueOf);
                                Log.e(sb.toString());
                                A00().remove((String) next.getKey()).apply();
                            } else {
                                concurrentHashMap.put(valueOf, new C85244Nr(string, string2, i3, i4, j2, j3));
                            }
                        } catch (JSONException e2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("privacydisclosurestore/loadFromFile bad json ");
                            sb2.append(e2.toString());
                            Log.e(sb2.toString());
                            A00().remove((String) next.getKey()).apply();
                        } catch (NumberFormatException e3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("privacydisclosurestore/loadFromFile corrupted number ");
                            sb3.append(e3.toString());
                            Log.e(sb3.toString());
                            A00().remove((String) next.getKey()).apply();
                        }
                    } catch (NumberFormatException unused) {
                        Log.e("privacydisclosurestore disclosure id key is corrupted");
                        A00().remove((String) next.getKey()).apply();
                    }
                }
            }
        }
        C85244Nr r5 = r17;
        concurrentHashMap.put(Integer.valueOf(i2), r5);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", r5.A01);
            jSONObject2.put("stage", r5.A00);
            jSONObject2.put("activatedTimeInSecond", r5.A03);
            jSONObject2.put("acceptedTimeInSecond", r5.A02);
            jSONObject2.put("deepLink", r5.A05);
            jSONObject2.put("content", r5.A04);
            A00().putString(String.valueOf(i2), jSONObject2.toString()).apply();
        } catch (JSONException e4) {
            StringBuilder sb4 = new StringBuilder("privacydisclosurestore/savedisclosure JEX ");
            sb4.append(e4.toString());
            Log.e(sb4.toString());
        }
    }
}
