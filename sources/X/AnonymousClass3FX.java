package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: X.3FX  reason: invalid class name */
public final class AnonymousClass3FX implements C440622p {
    public final /* synthetic */ AnonymousClass1JD A00;
    public final /* synthetic */ C35001lD A01;
    public final /* synthetic */ C118755vC A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public AnonymousClass3FX(AnonymousClass1JD r1, C35001lD r2, C118755vC r3, String str, String str2) {
        this.A00 = r1;
        this.A04 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str2;
    }

    public static /* synthetic */ void A00(AnonymousClass1JD r8, C35001lD r9, C118755vC r10, String str, String str2) {
        AnonymousClass1JC r3 = r8.A02;
        String str3 = r3.A00;
        if (str3 == null) {
            throw C18450wi.A03("appId");
        }
        String A06 = C18450wi.A06(str3, "_layout.json");
        StringBuilder A0r = AnonymousClass000.A0r("phoenix_bloks_layout");
        A0r.append(File.separator);
        File A002 = r3.A00(AnonymousClass000.A0h(A06, A0r));
        if (A002 != null) {
            try {
                byte[] A003 = C29301aP.A00(A002);
                C18450wi.A0B(A003);
                try {
                    String string = C13700nu.A0K(new String(A003, AnonymousClass4BJ.A05)).getJSONObject("data").getJSONObject("whatsapp_pmtd_bloks_getprivatelayout").getString("payload");
                    if (string != null) {
                        r8.A05.A01(C25421Js.A09(new C25401Jq("size", String.valueOf(string.length()))), str, "bloksPayloadResponse");
                        r10.A01(string);
                        if (r9 != null) {
                            C20140zZ r32 = r8.A04;
                            String str4 = r9.A01;
                            StringBuilder A0q = AnonymousClass000.A0q(str2);
                            A0q.append(":046877784a36a1a3e5fbca72104f0172b903681b904c7b907b2e2fab4cad66cf:");
                            r32.A03(string, str4, AnonymousClass000.A0f(C13690nt.A0m(r8.A01), A0q), r9.A00, r9.A02);
                            return;
                        }
                        return;
                    }
                } catch (JSONException e2) {
                    Log.e("PhoenixCustomBloksRequest/processRawJsonString", e2);
                }
            } catch (IOException e3) {
                Log.e("PhoenixBloksAssetDownloader/loadBloksLayoutJsonString", e3);
            }
        }
        r10.A00(AnonymousClass000.A0V("Failed to load a Phoenix Bloks layout"));
    }

    public void ALw() {
        this.A02.A00(AnonymousClass000.A0V("Failed to load a Phoenix Bloks layout"));
    }

    public void AQQ() {
        this.A02.A00(AnonymousClass000.A0V("Failed to load a Phoenix Bloks layout"));
    }

    public void AYu() {
        this.A02.A00(AnonymousClass000.A0V("Failed to load a Phoenix Bloks layout"));
    }

    public void onSuccess() {
        AnonymousClass1JD r2 = this.A00;
        C16320sq r0 = r2.A03;
        String str = this.A04;
        r0.Acl(new AnonymousClass56B(r2, this.A01, this.A02, str, this.A03));
    }
}
