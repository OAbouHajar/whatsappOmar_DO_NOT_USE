package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.1qO  reason: invalid class name and case insensitive filesystem */
public abstract class C38191qO implements C38101qF {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C38191qO(String str, String str2, String str3) {
        this.A03 = !TextUtils.isEmpty(str) ? AnonymousClass1ZW.A0C(str) : null;
        this.A01 = str2;
        this.A00 = str3 == null ? "mms" : str3;
        this.A02 = str;
    }

    public static Uri.Builder A00(Uri.Builder builder, String str, String str2) {
        Uri build = builder.build();
        if (build.getQueryParameter(str) == null) {
            return builder.appendQueryParameter(str, str2);
        }
        builder.clearQuery();
        for (String next : build.getQueryParameterNames()) {
            if (str.equals(next)) {
                builder.appendQueryParameter(next, str2);
            } else {
                builder.appendQueryParameter(next, build.getQueryParameter(next));
            }
        }
        return builder;
    }

    public Uri.Builder A01(C29561ap r5) {
        String str = this.A03;
        AnonymousClass00B.A06(str);
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendEncodedPath = builder.scheme("https").encodedAuthority(r5.A02).appendPath(this.A00).appendPath(this.A01).appendEncodedPath(AnonymousClass1ZW.A0C(str));
        int i2 = 1;
        if (r5.A00 == 0) {
            i2 = 0;
        }
        appendEncodedPath.appendQueryParameter("direct_ip", String.valueOf(i2));
        return builder;
    }
}
