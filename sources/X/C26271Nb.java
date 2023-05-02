package X;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1Nb  reason: invalid class name and case insensitive filesystem */
public class C26271Nb extends AnonymousClass14O {
    public final AnonymousClass4VS A01(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2.has("posts")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("posts");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                String optString = jSONObject3.optString("title");
                if (TextUtils.isEmpty(optString) || optString.equalsIgnoreCase("null")) {
                    optString = null;
                }
                String string = jSONObject3.getString("id");
                long parseLong = Long.parseLong(jSONObject3.getString("creation_time_ms"));
                ArrayList arrayList2 = new ArrayList();
                if (jSONObject3.has("images")) {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("images");
                    for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("original_dimensions");
                        String string2 = jSONObject4.getString("id");
                        String string3 = jSONObject4.getString("original_image_url");
                        String optString2 = jSONObject4.optString("request_image_url");
                        if (TextUtils.isEmpty(optString2) || optString2.equalsIgnoreCase("null")) {
                            optString2 = null;
                        }
                        arrayList2.add(new C35691mL(string2, string3, optString2, jSONObject5.getInt("height"), jSONObject5.getInt("width")));
                    }
                }
                arrayList.add(new AnonymousClass4WG(string, optString, arrayList2, parseLong));
            }
        }
        return new AnonymousClass4VS(arrayList);
    }
}
