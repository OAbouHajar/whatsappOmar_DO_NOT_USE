package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.3tp  reason: invalid class name and case insensitive filesystem */
public class C76383tp extends AnonymousClass1KC {
    public final String A00;

    public C76383tp(C17130ua r14, C15860rz r15, C14710pd r16, AnonymousClass168 r17, AnonymousClass01D r18, String str, AnonymousClass01J r20, AnonymousClass01J r21) {
        super(r14, r15, r16, r17, r18, (String) null, (Map) null, r20, r21, 4276154569100535L);
        this.A00 = str;
    }

    public void A05(JSONObject jSONObject) {
        JSONObject A0J = C13700nu.A0J();
        A0J.put("app_id", "dev.app.id");
        A0J.put("request_token", this.A00);
        jSONObject.put("variables", A0J.toString());
    }
}
