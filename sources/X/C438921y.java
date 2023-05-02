package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.21y  reason: invalid class name and case insensitive filesystem */
public final class C438921y {
    public static List A00(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                obj = A00((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = A02((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        try {
            return A02(new JSONObject(str));
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static Map A02(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = A00((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = A02((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }
}
