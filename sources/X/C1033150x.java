package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.50x  reason: invalid class name and case insensitive filesystem */
public final class C1033150x implements C109395Ry {
    public C109735Tj A7Z(JSONObject jSONObject) {
        C18450wi.A0H(jSONObject, 0);
        JSONArray jSONArray = jSONObject.getJSONArray("and");
        int length = jSONArray.length();
        C109735Tj[] r2 = new C109735Tj[length];
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            C18450wi.A0B(jSONObject2);
            r2[i2] = AnonymousClass47B.A00(jSONObject2);
        }
        List A04 = C11330iZ.A04(r2);
        if (A04.size() > 1) {
            z2 = true;
        }
        AnonymousClass00B.A0B("expected 2 or more rules in input", z2);
        return new AnonymousClass50L(A04);
    }

    public String ACh() {
        return "and";
    }
}
