package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5wO  reason: invalid class name */
public final class AnonymousClass5wO {
    public C35301lh A00;
    public String A01;

    public AnonymousClass5wO(C28371Vv r6) {
        this.A00 = C110105dW.A0J(C110105dW.A0L(), String.class, r6.A0N("id", (String) null), "upiSequenceNumber");
        this.A01 = r6.A0N("status", (String) null);
    }

    public AnonymousClass5wO(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                this.A00 = C110105dW.A0J(C110105dW.A0L(), String.class, A0K.optString("id"), "upiSequenceNumber");
                this.A01 = A0K.optString("status");
            } catch (JSONException e2) {
                Log.w("PAY: IndiaUpiMandateMetadata:InstanceTransaction threw: ", e2);
            }
        }
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ id: ");
        A0r.append(this.A00);
        A0r.append(" status: ");
        AnonymousClass5x3.A03(A0r, this.A01);
        return AnonymousClass000.A0h("]", A0r);
    }
}
