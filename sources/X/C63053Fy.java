package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Fy  reason: invalid class name and case insensitive filesystem */
public class C63053Fy implements C29541an {
    public C87264Wb A00;
    public final C17690vU A01;
    public final C17680vT A02;
    public final AnonymousClass4MS A03;
    public final String A04;

    public C63053Fy(C17690vU r1, C17680vT r2, AnonymousClass4MS r3, String str) {
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = str;
        this.A03 = r3;
    }

    public /* synthetic */ void AP3(String str) {
    }

    public /* synthetic */ void APP(long j2) {
    }

    public void AQb(String str) {
        Log.e(C13680ns.A0h("httpresumecheck/error = ", str));
    }

    public void AWH(String str, Map map) {
        try {
            JSONObject A0K = C13700nu.A0K(str);
            if (!A0K.has("resume")) {
                return;
            }
            if ("complete".equals(A0K.optString("resume"))) {
                this.A00.A05 = A0K.optString("url");
                this.A00.A03 = A0K.optString("direct_path");
                this.A00.A02 = C798841s.COMPLETE;
                return;
            }
            this.A00.A01 = A0K.optInt("resume");
            this.A00.A02 = C798841s.RESUME;
        } catch (JSONException e2) {
            Log.w("mediaupload/MMS upload resume form post failed to parse JSON response; ", e2);
            this.A00.A02 = C798841s.FAILURE;
        }
    }
}
