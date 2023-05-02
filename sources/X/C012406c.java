package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.06c  reason: invalid class name and case insensitive filesystem */
public final class C012406c {
    public static final Locale A00 = new Locale("", "");

    public static int A00(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C012506d.A00(locale);
        }
        if (locale == null || locale.equals(A00)) {
            return 0;
        }
        String A002 = AnonymousClass0TU.A00(locale);
        if (A002 != null) {
            return (A002.equalsIgnoreCase("Arab") || A002.equalsIgnoreCase("Hebr")) ? 1 : 0;
        }
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
