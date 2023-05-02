package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5x8  reason: invalid class name */
public final class AnonymousClass5x8 {
    public long A00;
    public long A01;
    public String A02;
    public String A03;

    public AnonymousClass5x8() {
    }

    public AnonymousClass5x8(C28371Vv r9) {
        this.A02 = r9.A0N("action", (String) null);
        this.A03 = r9.A0N("status", (String) null);
        String A0N = r9.A0N("pause-start-ts", (String) null);
        if (A0N != null) {
            this.A01 = C29501aj.A01(A0N, 0) * 1000;
        }
        String A0N2 = r9.A0N("pause-end-ts", (String) null);
        if (A0N2 != null) {
            this.A00 = C29501aj.A01(A0N2, 0) * 1000;
        }
    }

    public AnonymousClass5x8(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                this.A02 = A0K.optString("action");
                this.A03 = A0K.optString("status");
                this.A01 = A0K.optLong("pauseStartTs", -1);
                this.A00 = A0K.optLong("pauseEndTs", -1);
            } catch (JSONException e2) {
                Log.w("PAY: IndiaUpiMandateMetadata:PauseResumeStatusDetails threw: ", e2);
            }
        }
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ action: ");
        AnonymousClass5x3.A03(A0r, this.A02);
        A0r.append(" status: ");
        AnonymousClass5x3.A03(A0r, this.A03);
        A0r.append(" pauseStartDate: ");
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A01);
        AnonymousClass5x3.A03(A0r, A0o.toString());
        A0r.append(" pauseEndDate: ");
        StringBuilder A0o2 = AnonymousClass000.A0o();
        A0o2.append(this.A00);
        AnonymousClass5x3.A03(A0r, AnonymousClass000.A0h("", A0o2));
        return AnonymousClass000.A0h("]", A0r);
    }
}
