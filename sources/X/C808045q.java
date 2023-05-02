package X;

import android.webkit.URLUtil;

/* renamed from: X.45q  reason: invalid class name and case insensitive filesystem */
public class C808045q {
    public static String A00(String str) {
        return (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) ? str : AnonymousClass000.A0h(str, AnonymousClass000.A0r("https://"));
    }
}
