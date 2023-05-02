package X;

import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* renamed from: X.47i  reason: invalid class name and case insensitive filesystem */
public class C812247i {
    public static String A00(String str) {
        try {
            String host = new URL(str).getHost();
            int indexOf = str.indexOf(host);
            if (indexOf < 0) {
                StringBuilder A0r = AnonymousClass000.A0r("cannot find host ");
                A0r.append(host);
                A0r.append(" in ");
                Log.e(AnonymousClass000.A0h(str, A0r));
                return str.substring(0, Math.min(34, str.length()));
            }
            String substring = str.substring(indexOf + host.length());
            if (host.toLowerCase(Locale.US).startsWith("www.")) {
                host = host.substring(4);
            }
            int length = substring.length();
            int i2 = 0;
            if (length > 12 || host.length() + length > 34) {
                int min = Math.min(length, Math.max(length - 12, (host.length() + length) - 34));
                substring = substring.substring(0, length - min);
                i2 = min;
            }
            if (substring.length() == 1) {
                substring = "";
            }
            String A0h = AnonymousClass000.A0h(substring, AnonymousClass000.A0q(host));
            int length2 = A0h.length();
            if (length2 > 34) {
                A0h = AnonymousClass000.A0h(A0h.substring(length2 - 34), AnonymousClass000.A0q("…"));
            }
            return i2 > 0 ? AnonymousClass000.A0h("…", AnonymousClass000.A0q(A0h)) : A0h;
        } catch (MalformedURLException e2) {
            Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("unvalid url ")), e2);
            return str.substring(0, Math.min(34, str.length()));
        }
    }
}
