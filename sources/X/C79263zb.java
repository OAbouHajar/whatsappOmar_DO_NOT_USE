package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.3zb  reason: invalid class name and case insensitive filesystem */
public class C79263zb extends C111975hj {
    public C79263zb(C17130ua r1, C15860rz r2, C14710pd r3, AnonymousClass168 r4, C17660vR r5, AnonymousClass01D r6, String str, String str2, String str3, Map map, AnonymousClass01J r11, AnonymousClass01J r12, long j2) {
        super(r1, r2, r3, r4, r5, r6, str, str2, str3, map, r11, r12, j2);
    }

    public String A07() {
        return "version";
    }

    public void A08(JSONObject jSONObject) {
        super.A08(jSONObject);
        jSONObject.put("tos_version", C13680ns.A0B(this.A03).getInt("shops_privacy_notice", -1));
    }
}
