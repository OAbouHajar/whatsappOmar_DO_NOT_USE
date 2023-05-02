package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.3tj  reason: invalid class name and case insensitive filesystem */
public class C76323tj extends AnonymousClass14O {
    public void A00(JSONObject jSONObject, long j2) {
        C83834If r4;
        JSONObject jSONObject2 = jSONObject.getJSONObject("whatsapp_biz_integrity_p2b_report");
        String optString = jSONObject2.optString("status");
        if (!TextUtils.isEmpty(optString) && !"INVALID".equals(optString) && !"NOT_FOUND".equals(optString)) {
            if ("PENDING".equals(optString)) {
                r4 = new C83834If((AnonymousClass4OK) null, "PENDING");
            } else {
                JSONObject optJSONObject = jSONObject2.optJSONObject("detail");
                if (optJSONObject != null) {
                    String optString2 = optJSONObject.optString("report_url");
                    String optString3 = optJSONObject.optString("file_name");
                    String optString4 = optJSONObject.optString("media_key");
                    String optString5 = optJSONObject.optString("file_sha256");
                    String optString6 = optJSONObject.optString("encrypted_file_sha256");
                    String optString7 = optJSONObject.optString("direct_path");
                    int optInt = optJSONObject.optInt("file_size_bytes");
                    if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString4) && !TextUtils.isEmpty(optString5) && !TextUtils.isEmpty(optString6) && !TextUtils.isEmpty(optString7)) {
                        r4 = new C83834If(new AnonymousClass4OK(optString2, optString3, optString4, optInt, optString5, optString6, optString7), "AVAILABLE");
                    }
                }
            }
            this.A00 = r4;
        }
        r4 = new C83834If((AnonymousClass4OK) null, "INVALID");
        this.A00 = r4;
    }
}
