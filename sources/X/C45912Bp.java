package X;

import android.net.Uri;
import android.text.TextUtils;

@Deprecated
/* renamed from: X.2Bp  reason: invalid class name and case insensitive filesystem */
public class C45912Bp {
    public static final Uri A00;
    public static final String A01;

    static {
        StringBuilder sb = new StringBuilder("com.obwhatsapp");
        sb.append(".provider.contact");
        String obj = sb.toString();
        A01 = obj;
        StringBuilder sb2 = new StringBuilder("content://");
        sb2.append(obj);
        sb2.append("/contacts");
        A00 = Uri.parse(sb2.toString());
    }

    public static boolean A00(Uri uri) {
        return uri != null && TextUtils.equals(uri.getScheme(), "content") && TextUtils.equals(uri.getAuthority(), A01);
    }
}
