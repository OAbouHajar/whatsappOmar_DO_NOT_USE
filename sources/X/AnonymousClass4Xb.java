package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.4Xb  reason: invalid class name */
public class AnonymousClass4Xb {
    public static Bundle A00(ContentResolver contentResolver, Uri uri, Bundle bundle, C612538e r5, String str) {
        int i2;
        r5.A00(uri);
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                Bundle call = acquireUnstableContentProviderClient.call(str, (String) null, bundle);
                if (i2 >= 24) {
                    return call;
                }
                acquireUnstableContentProviderClient.release();
                return call;
            } finally {
                if (Build.VERSION.SDK_INT >= 24) {
                    acquireUnstableContentProviderClient.close();
                    throw th;
                }
                acquireUnstableContentProviderClient.release();
            }
        } else {
            throw AnonymousClass000.A0V("Failed to acquire client");
        }
    }

    public static void A01(Bundle bundle, AnonymousClass38T r4, String str) {
        Bundle bundle2 = bundle.getBundle("@exception@");
        if (bundle2 != null) {
            C88154a2 A00 = r4.A00(bundle2);
            AnonymousClass5B8 r2 = new AnonymousClass5B8(A00);
            Throwable th = A00.A03;
            if (th != null) {
                C88154a2.A00(th, r2);
            } else {
                String str2 = A00.A02;
                if (str2 != null) {
                    th = new AnonymousClass5B9(A00, str2);
                    C88154a2.A00(th, r2);
                } else {
                    th = new AnonymousClass5B9(A00, AnonymousClass000.A0l(AnonymousClass000.A0r("Remote error code "), A00.A00));
                    C88154a2.A00(th, r2);
                }
            }
            String message = th.getMessage();
            StringBuilder A0r = AnonymousClass000.A0r("Exception in provider when invoking ");
            A0r.append(str);
            A0r.append("(): ");
            A0r.append(AnonymousClass000.A0c(th));
            throw new AnonymousClass43L(AnonymousClass000.A0h(message != null ? AnonymousClass000.A0h(message, AnonymousClass000.A0r(": ")) : "", A0r), th);
        }
    }
}
