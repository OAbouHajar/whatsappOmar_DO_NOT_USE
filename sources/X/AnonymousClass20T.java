package X;

import com.mod2.fblibs.FacebookFacade;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.20T  reason: invalid class name */
public class AnonymousClass20T {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public AnonymousClass20T(String str, String str2, String str3, String str4, Map map) {
        this.A01 = str;
        this.A00 = str3;
        this.A02 = str4;
        map = map == null ? new HashMap() : map;
        this.A03 = map;
        map.put(Integer.toString(-1), str2);
    }

    public static AnonymousClass20T A00(String str) {
        JSONObject jSONObject = new JSONObject(str);
        Map A012 = A01(jSONObject);
        String str2 = A012 == null ? "" : A012.get(Integer.toString(-1));
        String string = jSONObject.getString(FacebookFacade.RequestParameter.NAME);
        AnonymousClass00B.A06(str2);
        return new AnonymousClass20T(string, (String) str2, jSONObject.optString("locale_lang", (String) null), jSONObject.optString("url", (String) null), A012);
    }

    public static Map A01(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("bundles");
        if (optJSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, optJSONObject.getString(next));
        }
        return hashMap;
    }

    public String A02() {
        Object obj = this.A03.get(Integer.toString(-1));
        AnonymousClass00B.A06(obj);
        return (String) obj;
    }

    public String A03() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookFacade.RequestParameter.NAME, this.A01);
        jSONObject.put("locale_lang", this.A00);
        jSONObject.put("url", this.A02);
        jSONObject.put("bundles", new JSONObject(this.A03));
        return jSONObject.toString();
    }

    public String A04(int i2) {
        String str = (String) this.A03.get(Integer.toString(i2));
        return str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass20T)) {
            return false;
        }
        AnonymousClass20T r4 = (AnonymousClass20T) obj;
        return C34901l3.A00(this.A01, r4.A01) && C34901l3.A00(this.A00, r4.A00) && C34901l3.A00(this.A02, r4.A02) && C34901l3.A00(this.A03, r4.A03);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, this.A02, this.A03});
    }
}
