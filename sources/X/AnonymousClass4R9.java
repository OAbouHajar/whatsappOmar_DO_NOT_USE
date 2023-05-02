package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4R9  reason: invalid class name */
public class AnonymousClass4R9 {
    public final Integer A00;
    public final List A01;
    public final boolean A02;

    public AnonymousClass4R9(Integer num, List list, boolean z2) {
        this.A01 = list;
        this.A00 = num;
        this.A02 = z2;
    }

    public JSONObject A00() {
        JSONObject A0J = C13700nu.A0J();
        if (this.A02) {
            A0J.put("has_catalog", 1);
        }
        Integer num = this.A00;
        if (num != null) {
            A0J.put("opening_hours", num);
        }
        List list = this.A01;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < list.size(); i2++) {
                jSONArray.put(list.get(i2));
            }
            A0J.put("subcategories", jSONArray);
        }
        if (A0J.length() == 0) {
            return null;
        }
        return A0J;
    }
}
