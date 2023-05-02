package X;

import com.mod2.fblibs.Facebook;
import com.obwhatsapp.fbusers.IDxVResponseShape2S0400000_2_I0;
import com.obwhatsapp.fbusers.IDxVResponseShape5S0300000_2_I0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.14L  reason: invalid class name */
public class AnonymousClass14L {
    public final AnonymousClass01D A00;
    public final AnonymousClass01D A01;
    public final AnonymousClass01D A02;

    public AnonymousClass14L(AnonymousClass01D r1, AnonymousClass01D r2, AnonymousClass01D r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }

    public AnonymousClass28T A00(AnonymousClass144 r15) {
        String str;
        Map A03 = ((AnonymousClass14K) this.A00.get()).A03();
        if (!A03.isEmpty() && (str = (String) A03.get(r15.A00)) != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                long j2 = jSONObject.getLong("fbid");
                String string = jSONObject.getString("password");
                String string2 = jSONObject.getString(Facebook.TOKEN);
                long j3 = jSONObject.getLong("timestamp");
                String str2 = null;
                Long valueOf = jSONObject.has("ttl") ? Long.valueOf(jSONObject.optLong("ttl")) : null;
                if (jSONObject.has("analytics_claim")) {
                    str2 = jSONObject.optString("analytics_claim");
                }
                return new AnonymousClass28T(new AnonymousClass144(jSONObject.getString("usertype")), valueOf, string, string2, str2, j2, j3);
            } catch (JSONException e2) {
                AnonymousClass00B.A0E(e2);
            }
        }
        return null;
    }

    public void A01(AnonymousClass28T r10, AnonymousClass2HW r11, AnonymousClass4UI r12) {
        AnonymousClass2HW r3 = r11;
        ((AnonymousClass14J) this.A02.get()).A01(r10.A01, new IDxVResponseShape2S0400000_2_I0(r3, r10, r11, this, r12, 0));
    }

    public void A02(AnonymousClass2HW r8, AnonymousClass144 r9) {
        ((AnonymousClass14J) this.A02.get()).A01(r9, new IDxVResponseShape5S0300000_2_I0(r8, r8, this, r9, 0));
    }

    public void A03(AnonymousClass2HW r8, AnonymousClass144 r9) {
        ((AnonymousClass14J) this.A02.get()).A01(r9, new IDxVResponseShape5S0300000_2_I0(r8, r8, this, r9, 1));
    }
}
