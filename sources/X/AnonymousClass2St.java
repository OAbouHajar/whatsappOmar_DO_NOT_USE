package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2St  reason: invalid class name */
public class AnonymousClass2St {
    public final String A00;
    public final JSONObject A01;

    public AnonymousClass2St(String str, AnonymousClass2St... r5) {
        this.A01 = new JSONObject();
        this.A00 = str;
        for (AnonymousClass2St A002 : r5) {
            A00(A002);
        }
    }

    public AnonymousClass2St(AnonymousClass2St... r2) {
        this((String) null, r2);
    }

    public void A00(AnonymousClass2St r6) {
        try {
            String str = r6.A00;
            if (str == null) {
                JSONObject jSONObject = r6.A01;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.A01.put(next, jSONObject.get(next));
                }
                return;
            }
            this.A01.put(str, r6.A01);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void A01(String str, String str2) {
        try {
            this.A01.put(str, str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void A02(String str, boolean z2) {
        try {
            this.A01.put(str, z2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.A00;
            if (str != null) {
                jSONObject.put(str, this.A01);
            } else {
                jSONObject = this.A01;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }
}
