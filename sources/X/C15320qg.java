package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.0qg  reason: invalid class name and case insensitive filesystem */
public class C15320qg extends C15270qb implements C15280qc {
    public final C15270qb A00;
    public final String A01;

    public C15320qg(C15270qb r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public JSONObject Agp() {
        JSONObject Agp = ((C15280qc) this.A00).Agp();
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            Agp.put("feature_name", str);
        }
        return Agp;
    }
}
