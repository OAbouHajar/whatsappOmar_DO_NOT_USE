package X;

import com.AssemMods.fakechat.utils.AppUtils;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Fw  reason: invalid class name and case insensitive filesystem */
public class C63033Fw implements C29541an {
    public final /* synthetic */ AnonymousClass4OX A00;
    public final /* synthetic */ C85374Oe A01;

    public C63033Fw(AnonymousClass4OX r1, C85374Oe r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void AP3(String str) {
        this.A01.A04.A0E.A04(str);
    }

    public void APP(long j2) {
        this.A01.A04.A0A(j2);
    }

    public void AQb(String str) {
        Log.e(C13680ns.A0h("mediaupload/error = ", str));
    }

    public void AWH(String str, Map map) {
        C85374Oe r2 = this.A01;
        r2.A00 = new C85254Ns();
        if (!this.A00.A07) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                r2.A00.A05 = A0K.optString("url");
                r2.A00.A02 = A0K.optString("handle");
                r2.A00.A00 = A0K.optString("direct_path");
                r2.A00.A03 = A0K.optString("meta_hmac");
                r2.A00.A01 = A0K.optString("fbid");
                r2.A00.A04 = A0K.optString(AppUtils.HANDLER_TS_KEY);
            } catch (JSONException e2) {
                Log.e("mediaupload/jsonexception", e2);
            }
        }
        r2.A01 = true;
    }
}
