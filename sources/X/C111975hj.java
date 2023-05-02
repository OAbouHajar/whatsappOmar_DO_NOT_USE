package X;

import android.text.TextUtils;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.5hj  reason: invalid class name and case insensitive filesystem */
public abstract class C111975hj extends AnonymousClass1KC {
    public final C17660vR A00;
    public final String A01;
    public final String A02;

    public C111975hj(C17130ua r14, C15860rz r15, C14710pd r16, AnonymousClass168 r17, C17660vR r18, AnonymousClass01D r19, String str, String str2, String str3, Map map, AnonymousClass01J r24, AnonymousClass01J r25, long j2) {
        super(r14, r15, r16, r17, r19, str, map, r24, r25, j2);
        this.A00 = r18;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String A01() {
        String str;
        if (this instanceof C114675oJ) {
            return "";
        }
        C17660vR r1 = this.A00;
        Map A03 = A03();
        synchronized (r1) {
            str = r1.A03;
            if (str == null) {
                str = r1.A02(A03);
                r1.A03 = str;
            }
        }
        return str;
    }

    public String A02() {
        String obj = Locale.getDefault().toString();
        Map A03 = A03();
        if (!A03.containsKey(obj)) {
            return obj;
        }
        String A0e = C13690nt.A0e(obj, A03);
        return A0e == null ? "en_US" : A0e;
    }

    public void A05(JSONObject jSONObject) {
        JSONObject A0J = C13700nu.A0J();
        A08(A0J);
        jSONObject.put("variables", A0J.toString());
    }

    public String A07() {
        return "version";
    }

    public void A08(JSONObject jSONObject) {
        jSONObject.put("app_id", this.A01);
        jSONObject.put(A07(), "046877784a36a1a3e5fbca72104f0172b903681b904c7b907b2e2fab4cad66cf");
        String str = this.A02;
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        jSONObject.put("params", str);
    }
}
