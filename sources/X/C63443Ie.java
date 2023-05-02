package X;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Ie  reason: invalid class name and case insensitive filesystem */
public final class C63443Ie extends Thread {
    public final /* synthetic */ Map A00;

    public C63443Ie(Map map) {
        this.A00 = map;
    }

    public final void run() {
        String str;
        StringBuilder sb;
        String str2;
        HttpURLConnection httpURLConnection;
        Map map = this.A00;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Iterator A0I = C13700nu.A0I(map);
        while (A0I.hasNext()) {
            String A0m = AnonymousClass000.A0m(A0I);
            buildUpon.appendQueryParameter(A0m, C13690nt.A0e(A0m, map));
        }
        String A0G = C13700nu.A0G(buildUpon);
        try {
            httpURLConnection = (HttpURLConnection) new URL(A0G).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder A0g = C13690nt.A0g(C13680ns.A06(A0G) + 65);
                A0g.append("Received non-success response code ");
                A0g.append(responseCode);
                A0g.append(" from pinging URL: ");
                Log.w("HttpUrlPinger", AnonymousClass000.A0h(A0G, A0g));
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            str = e.getMessage();
            sb = C13680ns.A0l(str, C13680ns.A06(A0G) + 32);
            str2 = "Error while parsing ping URL: ";
            C13680ns.A1Y(str2, A0G, ". ", sb);
            Log.w("HttpUrlPinger", AnonymousClass000.A0h(str, sb), e);
        } catch (IOException | RuntimeException e3) {
            e = e3;
            str = e.getMessage();
            sb = C13680ns.A0l(str, C13680ns.A06(A0G) + 27);
            str2 = "Error while pinging URL: ";
            C13680ns.A1Y(str2, A0G, ". ", sb);
            Log.w("HttpUrlPinger", AnonymousClass000.A0h(str, sb), e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
