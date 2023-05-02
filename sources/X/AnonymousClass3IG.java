package X;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: X.3IG  reason: invalid class name */
public final class AnonymousClass3IG implements Runnable {
    public static final AnonymousClass4RN A02 = new AnonymousClass4RN("RevokeAccessOperation", new String[0]);
    public final AnonymousClass3Wa A00 = new AnonymousClass3Wa((C437121f) null);
    public final String A01;

    public AnonymousClass3IG(String str) {
        C13710nw.A05(str);
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass4RN r3;
        String str;
        String str2;
        Status status = Status.A07;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C13680ns.A0g(String.valueOf(this.A01), "https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.A09;
            } else {
                Log.e("RevokeAccessOperation", A02.A03.concat("Unable to revoke access!"));
            }
            A02.A00(C13680ns.A0i("Response Code: ", C13690nt.A0g(26), responseCode), new Object[0]);
        } catch (IOException e2) {
            r3 = A02;
            str = String.valueOf(e2.toString());
            str2 = "IOException when revoking access: ";
            Log.e("RevokeAccessOperation", r3.A03.concat(C13680ns.A0g(str, str2)));
            this.A00.setResult(status);
        } catch (Exception e3) {
            r3 = A02;
            str = String.valueOf(e3.toString());
            str2 = "Exception when revoking access: ";
            Log.e("RevokeAccessOperation", r3.A03.concat(C13680ns.A0g(str, str2)));
            this.A00.setResult(status);
        }
        this.A00.setResult(status);
    }
}
