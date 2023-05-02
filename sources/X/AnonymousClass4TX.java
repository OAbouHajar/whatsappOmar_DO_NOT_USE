package X;

import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.4TX  reason: invalid class name */
public class AnonymousClass4TX {
    public final /* synthetic */ C16650tP A00;
    public final /* synthetic */ C84384Ki A01;

    public AnonymousClass4TX(C16650tP r1, C84384Ki r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(C83744Hw r5) {
        C84384Ki r1;
        int i2;
        try {
            C16650tP r0 = this.A00;
            r1 = this.A01;
            C16650tP.A00(r0, r1, r5);
        } catch (JSONException e2) {
            this.A00.A02.AcB("GraphApiACSNetworkRequest/createResponseCallback/onResponseReceived: Error while parsing the JSON: ", e2.getMessage(), true);
            r1 = this.A01;
            i2 = 2;
        } catch (Exception e3) {
            Log.e("GraphApiACSNetworkRequest/createResponseCallback/onResponseReceived: generic error - ", e3);
            r1 = this.A01;
            i2 = 3;
        }
        this.A00.A07(r1);
        r1.A00 = i2;
        this.A00.A07(r1);
    }
}
