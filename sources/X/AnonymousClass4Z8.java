package X;

import com.AssemMods.translator.Language;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.4Z8  reason: invalid class name */
public class AnonymousClass4Z8 {
    public static Long A00 = AnonymousClass3K2.A0Z();
    public static Locale A01;
    public static final Map A02 = AnonymousClass000.A0x();

    static {
        Locale locale;
        if (!Language.ENGLISH.equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            int i2 = 0;
            while (true) {
                if (i2 == availableLocales.length) {
                    break;
                } else if (Language.ENGLISH.equalsIgnoreCase(availableLocales[i2].getLanguage())) {
                    locale = availableLocales[i2];
                    break;
                } else {
                    i2++;
                }
            }
            A01 = locale;
        }
        locale = Locale.getDefault();
        A01 = locale;
    }

    public static Date A00(Date date) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = A02;
        synchronized (map) {
            Long l2 = (Long) map.get(locale);
            if (l2 == null) {
                long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                l2 = time == 0 ? A00 : Long.valueOf(time);
                map.put(locale, l2);
            }
            if (l2 == A00) {
                return date;
            }
            Date date2 = new Date(date.getTime() - l2.longValue());
            return date2;
        }
    }
}
