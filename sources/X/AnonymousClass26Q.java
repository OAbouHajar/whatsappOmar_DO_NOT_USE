package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.26Q  reason: invalid class name */
public abstract class AnonymousClass26Q extends AnonymousClass1KC {
    public final C17150uc A00;

    public AnonymousClass26Q(C17130ua r14, C17150uc r15, C15860rz r16, C14710pd r17, AnonymousClass168 r18, AnonymousClass01D r19, AnonymousClass01J r20, AnonymousClass01J r21, long j2) {
        super(r14, r16, r17, r18, r19, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", (Map) null, r21, r20, j2);
        this.A00 = r15;
        A04("/catalog");
    }

    public void A07(UserJid userJid, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String A01 = this.A00.A07.A01(userJid);
        if (!TextUtils.isEmpty(A01)) {
            jSONObject2.put("direct_connection_encrypted_info", A01);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(str, jSONObject2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("request", jSONObject3);
        jSONObject.put("variables", jSONObject4);
    }
}
