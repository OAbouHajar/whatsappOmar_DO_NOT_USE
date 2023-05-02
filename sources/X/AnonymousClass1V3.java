package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1V3  reason: invalid class name */
public abstract class AnonymousClass1V3 {
    public void A00() {
        if (this instanceof C46802Gh) {
            C46802Gh r2 = (C46802Gh) this;
            C46812Gi r1 = new C46812Gi("authorization_revoked", (JSONObject) null);
            try {
                AnonymousClass115 r3 = r2.A01;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "authorization_revoked");
                jSONObject.putOpt("payload", r1.A01);
                r3.A00(jSONObject.toString(), false);
            } catch (JSONException unused) {
                Log.e("StellaEventHandler/failed to create event");
            }
        }
    }
}
