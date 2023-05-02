package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.47Q  reason: invalid class name */
public class AnonymousClass47Q {
    public static String A00(String str, long j2) {
        return !TextUtils.isEmpty(str) ? C38191qO.A00(Uri.parse(str).buildUpon(), "_nc_hot", String.valueOf(C13690nt.A09(j2))).build().toString() : str;
    }
}
