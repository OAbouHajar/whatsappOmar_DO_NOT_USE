package X;

import android.net.Uri;

/* renamed from: X.2cH  reason: invalid class name and case insensitive filesystem */
public class C51792cH {
    public static String A00(Uri uri) {
        if (uri == null) {
            return null;
        }
        if ("whatsapp".equals(uri.getScheme())) {
            if (!"chat".equals(uri.getHost())) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("code");
            if (queryParameter != null) {
                return queryParameter;
            }
        } else if (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme())) {
            return null;
        } else {
            if (!"chat.whatsapp.com".equals(uri.getHost())) {
                if (!"whatsapp.com".equals(uri.getHost()) || !"chat".equals(uri.getLastPathSegment())) {
                    return null;
                }
                return uri.getQueryParameter("code");
            }
        }
        return uri.getLastPathSegment();
    }
}
