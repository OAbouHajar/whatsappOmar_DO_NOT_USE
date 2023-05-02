package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Fx  reason: invalid class name and case insensitive filesystem */
public class C63043Fx implements C29541an {
    public final /* synthetic */ AnonymousClass4NN A00;
    public final /* synthetic */ C456729z A01;
    public final /* synthetic */ C29561ap A02;
    public final /* synthetic */ AnonymousClass2A0 A03;

    public C63043Fx(AnonymousClass4NN r1, C456729z r2, C29561ap r3, AnonymousClass2A0 r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public /* synthetic */ void AP3(String str) {
    }

    public /* synthetic */ void APP(long j2) {
    }

    public void AQb(String str) {
        Log.e(C13680ns.A0h("mediaupload/finalizeupload/error = ", str));
    }

    public void AWH(String str, Map map) {
        String str2 = null;
        try {
            JSONObject A0K = C13700nu.A0K(str);
            str2 = A0K.optString("url");
            this.A00.A02 = A0K.optString("direct_path");
        } catch (JSONException e2) {
            Log.e("mediaupload/jsonexception", e2);
        }
        if (TextUtils.isEmpty(str2)) {
            AnonymousClass2A0 r0 = this.A03;
            str2 = new C38181qN(r0.A02, r0.A01, r0.A00, (String) null, (String) null).A9R(this.A02, true);
        }
        this.A00.A03 = str2;
    }
}
