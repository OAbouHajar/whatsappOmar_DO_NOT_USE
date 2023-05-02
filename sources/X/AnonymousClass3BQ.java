package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.HttpEntity;

/* renamed from: X.3BQ  reason: invalid class name */
public final class AnonymousClass3BQ {
    public static void A00(C109915Uf r4, String str, boolean z2) {
        String str2;
        int i2 = -1;
        if (!z2) {
            List AHl = r4.AHl("Retry-After");
            if (AHl == null || AHl.isEmpty()) {
                str2 = "drive-util/getRetryAfter/no retry after header";
            } else {
                if (AHl.size() != 1) {
                    Log.e(AnonymousClass000.A0g("drive-util/getRetryAfter/too many retry after headers: ", AHl));
                }
                String A0n = AnonymousClass000.A0n(AHl, 0);
                i2 = C29501aj.A00(A0n, -1);
                if (i2 < 0) {
                    StringBuilder A0r = AnonymousClass000.A0r("drive-util/getRetryAfter/invalid retry after (");
                    A0r.append(A0n);
                    str2 = AnonymousClass000.A0h(")", A0r);
                }
            }
            Log.e(str2);
        }
        String AC0 = r4.AC0();
        StringBuilder A0r2 = AnonymousClass000.A0r("drive-util/");
        A0r2.append(str);
        A0r2.append("/too-many-requests (");
        A0r2.append(AC0);
        Log.w(C13680ns.A0i(") retry-after=", A0r2, i2));
        throw new C31141da(AC0, i2);
    }

    public static void A01(String str, HttpsURLConnection httpsURLConnection, boolean z2) {
        A00(new C76543uE(httpsURLConnection), str, z2);
        throw AnonymousClass000.A0Z();
    }

    public static void A02(HttpEntity httpEntity) {
        if (httpEntity != null) {
            try {
                httpEntity.consumeContent();
            } catch (IOException e2) {
                Log.e("gdrive-api/consume-entity", e2);
            }
        }
    }
}
