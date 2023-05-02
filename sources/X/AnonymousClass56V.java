package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.56V  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56V implements Runnable {
    public final /* synthetic */ int A00 = 19;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass4TX A02;
    public final /* synthetic */ C16650tP A03;
    public final /* synthetic */ C25551Kf A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ JSONObject A08;

    public /* synthetic */ AnonymousClass56V(AnonymousClass4TX r3, C16650tP r4, C25551Kf r5, String str, String str2, String str3, JSONObject jSONObject) {
        this.A04 = r5;
        this.A02 = r3;
        this.A08 = jSONObject;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A01 = 19;
        this.A03 = r4;
    }

    public final void run() {
        C84384Ki r1;
        int i2;
        C25551Kf r3 = this.A04;
        AnonymousClass4TX r2 = this.A02;
        JSONObject jSONObject = this.A08;
        try {
            r2.A00(r3.A00(this.A03, this.A05, this.A06, this.A07, jSONObject, 19, 19));
        } catch (Exception e2) {
            if (e2 instanceof JSONException) {
                r2.A00.A02.AcB("GraphApiACSNetworkRequest/createResponseCallback/onError: Error while parsing the JSON: ", e2.getMessage(), true);
                r1 = r2.A01;
                i2 = 2;
            } else if (e2 instanceof IOException) {
                Log.e("GraphApiACSNetworkRequest/createResponseCallback/onError", e2);
                r1 = r2.A01;
                r1.A00 = 1;
                r2.A00.A07(r1);
            } else {
                Log.e("GraphApiACSNetworkRequest/createResponseCallback/onError: generic error - ", e2);
                r1 = r2.A01;
                i2 = 3;
            }
            r1.A00 = i2;
            r2.A00.A07(r1);
        }
    }
}
