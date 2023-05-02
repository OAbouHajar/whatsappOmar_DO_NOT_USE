package X;

import android.text.TextUtils;

/* renamed from: X.5x3  reason: invalid class name */
public class AnonymousClass5x3 {
    public static String A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder A0r = AnonymousClass000.A0r("[data localized ");
        A0r.append(str.getBytes().length);
        return AnonymousClass000.A0h(" bytes]", A0r);
    }

    public static String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = (str.length() + 1) >> 1;
        StringBuilder A0r = AnonymousClass000.A0r("[");
        A0r.append(length);
        A0r.append(" char]");
        return AnonymousClass000.A0h(str.substring(length), A0r);
    }

    public static String A02(String str) {
        return (TextUtils.isEmpty(str) || !str.contains("@")) ? "" : "SCRUBBED-VPA";
    }

    public static void A03(StringBuilder sb, String str) {
        sb.append(A00(str));
    }
}
