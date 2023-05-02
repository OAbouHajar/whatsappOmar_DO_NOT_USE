package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Sz  reason: invalid class name and case insensitive filesystem */
public class C27751Sz {
    public /* bridge */ /* synthetic */ Object A00(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("brj");
            String string2 = jSONObject.getString("ap");
            String string3 = jSONObject.getString("s");
            long j2 = jSONObject.getLong("ct");
            String A00 = C812147h.A00("tb_t", jSONObject);
            int optInt = jSONObject.optInt("tb_a", -1);
            UserJid userJid = UserJid.get(string);
            if (A00 == null) {
                A00 = "";
            }
            return new AnonymousClass21V(userJid, string2, string3, A00, optInt, j2);
        } catch (JSONException e2) {
            throw new C47342Io("CTWA: AdsEntryPointTransformer/fromData/JSONException", e2);
        } catch (AnonymousClass1W4 e3) {
            throw new C47342Io("CTWA: AdsEntryPointTransformer/fromData/InvalidJidException", e3);
        }
    }
}
