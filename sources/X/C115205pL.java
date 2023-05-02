package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.5pL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C115205pL {
    public static boolean A00(Uri uri, C227419c r3) {
        String queryParameter = uri.getQueryParameter(r3.AAR());
        String AA8 = r3.AA8();
        return !TextUtils.isEmpty(AA8) && !TextUtils.isEmpty(queryParameter) && AA8.contains(queryParameter);
    }
}
