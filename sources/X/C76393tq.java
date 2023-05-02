package X;

import com.mod2.fblibs.FacebookFacade;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.3tq  reason: invalid class name and case insensitive filesystem */
public class C76393tq extends AnonymousClass1KC {
    public final String A00;
    public final String A01;
    public final String A02;

    public C76393tq(C17130ua r14, C15860rz r15, C14710pd r16, AnonymousClass168 r17, AnonymousClass01D r18, String str, String str2, String str3, AnonymousClass01J r22, AnonymousClass01J r23) {
        super(r14, r15, r16, r17, r18, (String) null, (Map) null, r22, r23, 6960707423955525L);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public void A05(JSONObject jSONObject) {
        JSONObject A0J = C13700nu.A0J();
        A0J.put("app_id", "dev.app.id");
        A0J.put("request_token", this.A02);
        JSONObject A0J2 = C13700nu.A0J();
        A0J2.put(FacebookFacade.RequestParameter.DESCRIPTION, this.A01);
        A0J2.put("debug_info", this.A00);
        A0J.put("user_request", A0J2);
        jSONObject.put("variables", A0J.toString());
    }
}
