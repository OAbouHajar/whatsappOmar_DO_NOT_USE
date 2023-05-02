package X;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: X.0L1  reason: invalid class name */
public class AnonymousClass0L1 {
    public static void A00(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }
}
