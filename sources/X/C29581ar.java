package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1ar  reason: invalid class name and case insensitive filesystem */
public class C29581ar implements C29541an {
    public final /* synthetic */ C29571aq A00;
    public final /* synthetic */ C23401Bv A01;

    public C29581ar(C29571aq r1, C23401Bv r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* synthetic */ void AP3(String str) {
    }

    public void APP(long j2) {
    }

    public void AQb(String str) {
        StringBuilder sb = new StringBuilder("app/CrashLogs/uploadServerOkay/error received: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void AWH(String str, Map map) {
        try {
            if ("only_exception".equals(new JSONObject(str).optString("upload", ""))) {
                this.A00.A00 = "exception_only";
            } else {
                this.A00.A00 = "exception_and_logs";
            }
        } catch (JSONException unused) {
            this.A00.A00 = "exception_and_logs";
        }
    }
}
