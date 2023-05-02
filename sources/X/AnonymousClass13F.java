package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.13F  reason: invalid class name */
public class AnonymousClass13F {
    public SharedPreferences A00;
    public final C17020u3 A01;
    public final TreeMap A02 = new TreeMap();

    public AnonymousClass13F(C17020u3 r2) {
        this.A01 = r2;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("user_notice_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public C46352Dw A01() {
        SharedPreferences A002 = A00();
        int i2 = A002.getInt("current_user_notice_id", -1);
        if (i2 == -1) {
            return null;
        }
        return new C46352Dw(i2, A002.getInt("current_user_notice_stage", 0), A002.getInt("current_user_notice_version", 0), A002.getLong("current_user_notice_stage_timestamp", 0));
    }

    public TreeMap A02() {
        String string;
        TreeMap treeMap = this.A02;
        if (treeMap.isEmpty() && (string = A00().getString("user_notices", (String) null)) != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    treeMap.put(Integer.valueOf(next), C46352Dw.A00(new JSONObject(jSONObject.get(next).toString())));
                }
            } catch (JSONException e2) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e2);
            }
        }
        return treeMap;
    }

    public void A03(C46352Dw r6) {
        SharedPreferences.Editor edit = A00().edit();
        int i2 = r6.A01;
        edit.putInt("current_user_notice_id", i2).putInt("current_user_notice_stage", r6.A00).putLong("current_user_notice_stage_timestamp", r6.A03).putInt("current_user_notice_version", r6.A02).apply();
        TreeMap A022 = A02();
        A022.put(Integer.valueOf(i2), r6);
        A04(new ArrayList(A022.values()));
    }

    public void A04(List list) {
        HashMap hashMap = new HashMap();
        TreeMap treeMap = this.A02;
        treeMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C46352Dw r3 = (C46352Dw) it.next();
            JSONObject A012 = C46352Dw.A01(r3);
            if (A012 != null) {
                int i2 = r3.A01;
                hashMap.put(String.valueOf(i2), A012.toString());
                treeMap.put(Integer.valueOf(i2), r3);
            }
        }
        A00().edit().putString("user_notices", new JSONObject(hashMap).toString()).apply();
    }
}
