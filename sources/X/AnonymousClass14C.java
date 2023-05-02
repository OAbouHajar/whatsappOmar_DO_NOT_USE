package X;

import android.text.TextUtils;
import android.util.Base64;
import com.AssemMods.fakechat.utils.AppUtils;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.14C  reason: invalid class name */
public class AnonymousClass14C {
    public final C16300so A00;
    public final AnonymousClass149 A01;
    public final AnonymousClass14A A02;
    public final AnonymousClass14B A03;
    public final Set A04;

    public AnonymousClass14C(C16300so r1, AnonymousClass149 r2, AnonymousClass14A r3, AnonymousClass14B r4, Set set) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = set;
    }

    public final Map A00() {
        String string = this.A03.A00().getString("pref_fb_user_certs_encrypted", (String) null);
        if (string != null) {
            C35811mX A002 = AnonymousClass149.A00(new JSONArray(string));
            if (A002 == null) {
                AnonymousClass00B.A08("null key data");
            } else {
                byte[] A012 = this.A02.A01(A002, AnonymousClass021.A0N);
                if (A012 != null) {
                    HashMap hashMap = new HashMap();
                    JSONObject jSONObject = new JSONObject(new String(A012, AnonymousClass01S.A0A));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(new AnonymousClass144(next), new C88294aG(jSONObject.getString(next)));
                    }
                    return hashMap;
                }
            }
            AnonymousClass00B.A08("null decrypt result");
        }
        return new HashMap();
    }

    public void A01(AnonymousClass144 r2) {
        try {
            Map A002 = A00();
            A002.remove(r2);
            A02(A002);
        } catch (CertificateException | JSONException e2) {
            AnonymousClass00B.A0E(e2);
        }
    }

    public final void A02(Map map) {
        byte[] A012;
        String str;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = ((AnonymousClass144) entry.getKey()).A00;
            C88294aG r6 = (C88294aG) entry.getValue();
            hashMap.put(str2, new JSONObject().put("e_cert", Base64.encodeToString(r6.A04.getEncoded(), 3)).put("s_cert", Base64.encodeToString(r6.A05.getEncoded(), 3)).put("ttl", r6.A00).put(AppUtils.HANDLER_TS_KEY, r6.A01).put("ppk", r6.A03).put("ppk_id", r6.A02).toString());
        }
        String obj = new JSONObject(hashMap).toString();
        AnonymousClass14A r4 = this.A02;
        Charset charset = AnonymousClass01S.A0A;
        byte[] bytes = obj.getBytes(charset);
        String str3 = AnonymousClass021.A0N;
        C35811mX A002 = r4.A00(str3, bytes);
        if (A002 == null) {
            str = "null keyData";
        } else {
            String A003 = A002.A00();
            if (TextUtils.isEmpty(A003)) {
                str = "empty result";
            } else {
                C35811mX A004 = AnonymousClass149.A00(new JSONArray(A003));
                if (A004 == null) {
                    AnonymousClass00B.A08("null key data");
                    A012 = null;
                } else {
                    A012 = r4.A01(A004, str3);
                }
                if (!new String(A012, charset).equals(obj)) {
                    AnonymousClass00B.A08("decrypted does not match original");
                    this.A00.AcB("FbUserEntityCertificateCache/encryptAndStoreMap", "Failed to encrypt cert", true);
                    return;
                }
                this.A03.A00().edit().putString("pref_fb_user_certs_encrypted", A003).apply();
                return;
            }
        }
        AnonymousClass00B.A08(str);
    }
}
