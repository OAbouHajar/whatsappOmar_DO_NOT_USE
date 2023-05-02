package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5vp  reason: invalid class name and case insensitive filesystem */
public class C119045vp {
    public static boolean A00(C52352df r12, String str, String str2) {
        try {
            JSONObject A0K = C13700nu.A0K(str2);
            JSONArray jSONArray = A0K.getJSONArray("url");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString("regex");
                HashMap A0x = AnonymousClass000.A0x();
                Matcher matcher = Pattern.compile(string, 2).matcher(str);
                if (matcher.find()) {
                    int groupCount = matcher.groupCount();
                    if (groupCount >= 1) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("param");
                        int i3 = 0;
                        while (true) {
                            i3++;
                            A0x.put(jSONArray2.getJSONObject(i3).getString(FacebookFacade.RequestParameter.NAME), matcher.group(i3));
                            if (i3 >= groupCount) {
                                break;
                            }
                        }
                    }
                    JSONObject jSONObject2 = A0K.has("opts") ? A0K.getJSONObject("opts") : C13700nu.A0J();
                    if (jSONObject.has("opts")) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("opts");
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String A0m = AnonymousClass000.A0m(keys);
                            jSONObject2.put(A0m, jSONObject3.get(A0m));
                        }
                    }
                    r12.A00 = new JSONObject(A0x);
                    return true;
                }
            }
        } catch (JSONException e2) {
            Log.e((Throwable) e2);
        }
        return false;
    }
}
