package X;

import org.json.JSONObject;

/* renamed from: X.50y  reason: invalid class name and case insensitive filesystem */
public final class C1033250y implements C109395Ry {
    public C109735Tj A7Z(JSONObject jSONObject) {
        C18450wi.A0H(jSONObject, 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("not");
        C18450wi.A0B(jSONObject2);
        C109735Tj A00 = AnonymousClass47B.A00(jSONObject2);
        if (A00 != null) {
            return new AnonymousClass50M(A00);
        }
        throw AnonymousClass3K3.A0f();
    }

    public String ACh() {
        return "not";
    }
}
