package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5tz  reason: invalid class name and case insensitive filesystem */
public class C118055tz {
    public JSONObject A00;
    public final C14710pd A01;

    public C118055tz(C14710pd r2) {
        this.A01 = r2;
        if (r2.A0C(1955)) {
            this.A00 = r2.A07(2019);
        }
    }

    public String A00(String str, String str2, boolean z2) {
        C14710pd r1 = this.A01;
        if (!r1.A0C(1955)) {
            return null;
        }
        int A02 = r1.A02(1956);
        Integer valueOf = Integer.valueOf(A02);
        String str3 = "";
        String str4 = str3;
        if (r1.A0C(1955)) {
            if (str != null) {
                if (str2 != null) {
                    Object[] A1a = C110105dW.A1a(str);
                    A1a[1] = str2;
                    str3 = String.format("%s,%s", A1a);
                } else {
                    str3 = str;
                }
            }
            try {
                JSONObject jSONObject = this.A00;
                str3 = (jSONObject == null || jSONObject.get(str3) == null) ? str4 : jSONObject.get(str3).toString();
            } catch (JSONException unused) {
                str3 = null;
            }
            if (AnonymousClass1ZW.A0E(str3)) {
                try {
                    JSONObject jSONObject2 = this.A00;
                    str3 = (jSONObject2 == null || jSONObject2.get(str) == null) ? str4 : jSONObject2.get(str).toString();
                } catch (JSONException unused2) {
                    str3 = null;
                }
            }
        }
        if (!AnonymousClass1ZW.A0E(str3)) {
            return str3;
        }
        if (!z2 || A02 == 0) {
            return null;
        }
        return valueOf.toString();
    }
}
