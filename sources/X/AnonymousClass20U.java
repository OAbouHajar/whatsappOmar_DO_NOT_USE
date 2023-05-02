package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.20U  reason: invalid class name */
public final class AnonymousClass20U {
    public static Uri.Builder A00(C14710pd r4, C213013o r5) {
        Uri.Builder buildUpon;
        if (r4.A0E(C16620tM.A02, 2713)) {
            Uri.Builder scheme = new Uri.Builder().scheme("https");
            r5.A01();
            buildUpon = scheme.encodedAuthority(r5.A00);
        } else {
            buildUpon = Uri.parse("https://static.whatsapp.net").buildUpon();
        }
        return buildUpon.path("wa/static/downloadable");
    }

    public static String A01(C14710pd r2, C213013o r3, Map map) {
        Uri.Builder A00 = A00(r2, r3);
        for (Map.Entry entry : map.entrySet()) {
            A00.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return A00.build().toString();
    }

    public static void A02(String str) {
        StringBuilder sb = new StringBuilder("DownloadableUtils/reportCriticalEventIfBeta");
        sb.append(str);
        Log.e(sb.toString());
    }

    public static boolean A03(String str) {
        for (char c2 : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c2) && c2 != '-' && c2 != '_') {
                return false;
            }
        }
        return true;
    }
}
