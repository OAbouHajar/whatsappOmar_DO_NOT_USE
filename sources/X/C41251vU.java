package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1vU  reason: invalid class name and case insensitive filesystem */
public class C41251vU {
    public final C17020u3 A00;
    public final String A01;

    public C41251vU(C17020u3 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public static final C41261vV A00(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C41271vW r4 = new C41271vW(UserJid.get(jSONObject.getString("uj")), jSONObject.getString("s"), jSONObject.has("a") ? jSONObject.getString("a") : null, jSONObject.getLong("ct"), jSONObject.getLong("lit"));
            r4.A02 = jSONObject.getBoolean("hcslm");
            r4.A00 = jSONObject.optInt("brc", -1);
            r4.A01 = jSONObject.optLong("fmts", -1);
            return new C41261vV(r4);
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder("CTWA: EntryPointConversionStore/getConversion/json error");
            sb.append(e2);
            Log.e(sb.toString());
            return null;
        } catch (AnonymousClass1W4 e3) {
            StringBuilder sb2 = new StringBuilder("CTWA: EntryPointConversionStore/getConversion/invalid jid error");
            sb2.append(e3);
            Log.e(sb2.toString());
            return null;
        }
    }
}
