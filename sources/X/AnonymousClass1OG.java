package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1OG  reason: invalid class name */
public class AnonymousClass1OG implements C23541Cj {
    public C16440t3 A00;
    public final C222017a A01;

    public AnonymousClass1OG(C222017a r1) {
        this.A01 = r1;
    }

    public void APJ() {
        SharedPreferences sharedPreferences;
        C222017a r9 = this.A01;
        long A002 = this.A00.A00();
        synchronized (r9) {
            sharedPreferences = r9.A01;
            if (sharedPreferences == null) {
                sharedPreferences = r9.A02.A00("triggered_block_prefs_purge_ts");
                r9.A01 = sharedPreferences;
            }
            AnonymousClass00B.A06(sharedPreferences);
        }
        if (A002 >= sharedPreferences.getLong("tb_purge_last_ts", 0) + 86400000) {
            if (!sharedPreferences.edit().putLong("tb_purge_last_ts", A002).commit()) {
                Log.w("triggered-block/purgeIfNeeded unable to commit last purge ts.");
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry next : r9.A00().getAll().entrySet()) {
                    Object key = next.getKey();
                    String str = (String) next.getValue();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (!jSONObject.has("tb_expired_ts") || A002 >= jSONObject.getLong("tb_expired_ts")) {
                            if (jSONObject.has("tb_last_action_ts")) {
                                if (jSONObject.has("tb_cooldown") && A002 < jSONObject.getLong("tb_last_action_ts") + jSONObject.getLong("tb_cooldown")) {
                                }
                            }
                            if (jSONObject.has("tb_last_action_ts") && !jSONObject.has("tb_cooldown") && A002 < jSONObject.getLong("tb_last_action_ts") + 31536000000L) {
                            }
                        }
                    }
                    arrayList.add(key);
                }
                SharedPreferences.Editor edit = r9.A00().edit();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    edit.remove((String) it.next());
                }
                if (!edit.commit()) {
                    Log.w("triggered-block/purge unable to commit after purge.");
                }
                arrayList.size();
            } catch (JSONException unused) {
            }
        }
    }

    public /* synthetic */ void APK() {
    }
}
