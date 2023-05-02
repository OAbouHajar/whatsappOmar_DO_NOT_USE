package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.461  reason: invalid class name */
public final class AnonymousClass461 {
    public static final List A00(JSONObject jSONObject) {
        ArrayList A0u = AnonymousClass000.A0u();
        JSONArray jSONArray = jSONObject.getJSONArray("businesses");
        C18450wi.A0B(jSONArray);
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            A0u.add(AnonymousClass1US.A00(jSONArray.getJSONObject(i2)));
        }
        return A0u;
    }
}
