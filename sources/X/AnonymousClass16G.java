package X;

import android.content.SharedPreferences;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16G  reason: invalid class name */
public class AnonymousClass16G {
    public C441422y A00 = new C441422y(this);
    public boolean A01;
    public final AnonymousClass16F A02;
    public final C16980tz A03;
    public final C15860rz A04;
    public final AnonymousClass013 A05;
    public final C14710pd A06;
    public final AtomicBoolean A07 = new AtomicBoolean(false);

    public AnonymousClass16G(AnonymousClass16F r3, C16980tz r4, C15860rz r5, AnonymousClass013 r6, C14710pd r7) {
        C18450wi.A0H(r5, 1);
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r7, 4);
        C18450wi.A0H(r4, 5);
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
    }

    public final AnonymousClass234 A00() {
        String string = ((SharedPreferences) this.A04.A01.get()).getString("commerce_metadata_tanslations", (String) null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONArray optJSONArray = jSONObject.optJSONArray("strings");
                int i2 = 0;
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    while (i2 < length) {
                        int i3 = i2 + 1;
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            String string2 = optJSONObject.getString(FacebookFacade.RequestParameter.NAME);
                            C18450wi.A0B(string2);
                            String string3 = optJSONObject.getString("value");
                            C18450wi.A0B(string3);
                            linkedHashMap.put(string2, string3);
                        }
                        i2 = i3;
                    }
                }
                String string4 = jSONObject.getString("locale");
                C18450wi.A0B(string4);
                AnonymousClass234 r2 = new AnonymousClass234(string4, linkedHashMap, jSONObject.getLong("expiresAt"));
                if (C18450wi.A0R(r2.A01, AnonymousClass013.A00(this.A05.A00).getLanguage())) {
                    return r2;
                }
                Log.e("CommerceTranslationsMetadataManager/CommerceMetadataTranslations/translation locale is different than system locale ");
                return null;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void A01() {
        AtomicBoolean atomicBoolean = this.A07;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            AnonymousClass16F r9 = this.A02;
            C441422y r0 = this.A00;
            C18450wi.A0H(r0, 0);
            r9.A00 = r0;
            C17190ug r8 = r9.A02;
            String A022 = r8.A02();
            C18450wi.A0B(A022);
            r8.A0A(r9, new C28371Vv(new C28371Vv(new C28371Vv("translations", new C35081lL[]{new C35081lL("locale", r9.A01.A06())}), "commerce_metadata", new C35081lL[0]), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("xmlns", "fb:thrift_iq"), new C35081lL("type", "get"), new C35081lL("smax_id", "91"), new C35081lL("id", A022)}), A022, 334, 32000);
        }
    }

    public final boolean A02() {
        boolean booleanValue;
        AnonymousClass234 A002 = A00();
        if (A002 == null) {
            booleanValue = true;
        } else {
            int i2 = (A002.A00 > (new Date().getTime() / 1000) ? 1 : (A002.A00 == (new Date().getTime() / 1000) ? 0 : -1));
            boolean z2 = false;
            if (i2 < 0) {
                z2 = true;
            }
            booleanValue = Boolean.valueOf(z2).booleanValue();
        }
        AnonymousClass234 A003 = A00();
        return booleanValue || !(A003 == null ? false : C18450wi.A0R(A003.A01, AnonymousClass013.A00(this.A05.A00).getLanguage()));
    }
}
