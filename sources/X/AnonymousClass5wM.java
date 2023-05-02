package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.5wM  reason: invalid class name */
public class AnonymousClass5wM {
    public final C20180zd A00;

    public AnonymousClass5wM(C20180zd r1) {
        this.A00 = r1;
    }

    public static String A00(Integer num) {
        try {
            return C110115dX.A0f(num, "fdsInstanceKey", C13700nu.A0J());
        } catch (JSONException e2) {
            Log.e("PAY: createQplPramsStringFromInstanceKey threw exception ", e2);
            return null;
        }
    }

    public void A01(Map map, String str, String str2) {
        if (str != null) {
            try {
                String string = C13700nu.A0K(str).getString("fdsInstanceKey");
                HashMap A0x = AnonymousClass000.A0x();
                A0x.put("fdsInstanceKey", string);
                A0x.put("event", str2);
                if (map != null) {
                    for (Object next : map.keySet()) {
                        A0x.put(next, map.get(next));
                    }
                }
                this.A00.A00().A01(new C1206762o(A0x));
            } catch (JSONException unused) {
                Log.e("qpl params parsing failure");
            }
        }
    }
}
