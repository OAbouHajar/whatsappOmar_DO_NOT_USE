package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.5pS  reason: invalid class name and case insensitive filesystem */
public class C115255pS {
    public static final Map A00(String str) {
        HashMap A0x = AnonymousClass000.A0x();
        if (str != null) {
            try {
                JSONArray jSONArray = C13700nu.A0K(str).getJSONArray("payment_options");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    C119505ya r1 = new C119505ya(jSONArray.getJSONObject(i2));
                    A0x.put(r1.A07, r1);
                }
            } catch (JSONException e2) {
                Log.e(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("OrderDetailsPaymentOptions/parseOptions failed to parse payment options json: ")));
            }
        }
        return A0x;
    }
}
