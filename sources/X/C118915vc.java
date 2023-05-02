package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5vc  reason: invalid class name and case insensitive filesystem */
public class C118915vc {
    public final C18300wT A00;
    public final AnonymousClass1Vo A01 = C110105dW.A0Q("PaymentPinSharedPrefs", "infra");

    public C118915vc(C18300wT r3) {
        this.A00 = r3;
    }

    public synchronized long A00() {
        long j2;
        JSONObject optJSONObject;
        j2 = 0;
        try {
            String A04 = this.A00.A04();
            if (!TextUtils.isEmpty(A04) && (optJSONObject = C13700nu.A0K(A04).optJSONObject("pin")) != null) {
                j2 = optJSONObject.optLong("pin_next_retry_ts");
            }
        } catch (JSONException e2) {
            this.A01.A05(AnonymousClass000.A0e(e2, "getNextRetryTs threw: ", AnonymousClass000.A0o()));
        }
        return j2;
    }

    public synchronized void A01() {
        try {
            C18300wT r5 = this.A00;
            JSONObject A0k = C110105dW.A0k(r5);
            JSONObject optJSONObject = A0k.optJSONObject("pin");
            if (optJSONObject == null) {
                optJSONObject = C13700nu.A0J();
            }
            optJSONObject.put("v", "1");
            optJSONObject.put("pinSet", true);
            A0k.put("pin", optJSONObject);
            C110105dW.A1J(r5, A0k);
        } catch (JSONException e2) {
            this.A01.A05(AnonymousClass000.A0e(e2, "setPinSet threw: ", AnonymousClass000.A0o()));
        }
        return;
    }

    public synchronized void A02(long j2) {
        try {
            C18300wT r5 = this.A00;
            JSONObject A0k = C110105dW.A0k(r5);
            JSONObject optJSONObject = A0k.optJSONObject("pin");
            if (optJSONObject == null) {
                optJSONObject = C13700nu.A0J();
            }
            optJSONObject.put("v", "1");
            optJSONObject.put("pin_next_retry_ts", j2);
            A0k.put("pin", optJSONObject);
            C110105dW.A1J(r5, A0k);
        } catch (JSONException e2) {
            this.A01.A05(AnonymousClass000.A0e(e2, "setPinSet threw: ", AnonymousClass000.A0o()));
        }
        return;
    }

    public synchronized boolean A03() {
        boolean z2;
        JSONObject optJSONObject;
        z2 = false;
        try {
            String A04 = this.A00.A04();
            if (!TextUtils.isEmpty(A04) && (optJSONObject = C13700nu.A0K(A04).optJSONObject("pin")) != null) {
                z2 = optJSONObject.optBoolean("pinSet");
            }
        } catch (JSONException e2) {
            this.A01.A05(AnonymousClass000.A0e(e2, "isPinSet threw: ", AnonymousClass000.A0o()));
        }
        return z2;
    }
}
