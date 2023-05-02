package X;

import android.util.Base64;
import java.util.Properties;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* renamed from: X.5u9  reason: invalid class name and case insensitive filesystem */
public class C118105u9 {
    public final String A00;
    public final C117525t8 A01;

    public C118105u9(C117525t8 r8) {
        this.A01 = r8;
        StringBuilder A0o = AnonymousClass000.A0o();
        for (String str : new String(Base64.decode("MS03LTItNA==", -1)).split("-")) {
            Properties properties = this.A01.A03;
            A0o.append(properties != null ? properties.getProperty(str) : null);
        }
        this.A00 = new String(Base64.decode(A0o.toString(), -1));
    }

    public String A00(JSONObject jSONObject) {
        String str = this.A00;
        if (str.isEmpty()) {
            return null;
        }
        Matcher A0k = C110115dX.A0k(str, "\\[([^\\]]*)\\]");
        StringBuffer stringBuffer = new StringBuffer(1000);
        while (A0k.find()) {
            String group = A0k.group();
            A0k.appendReplacement(stringBuffer, Matcher.quoteReplacement(jSONObject.optString(group.substring(1, group.length() - 1))));
        }
        A0k.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
