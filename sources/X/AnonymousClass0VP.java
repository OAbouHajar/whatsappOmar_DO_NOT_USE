package X;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: X.0VP  reason: invalid class name */
public class AnonymousClass0VP {
    public static ULocale A00(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    public static ULocale A01(Locale locale) {
        return ULocale.forLocale(locale);
    }

    public static String A02(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
