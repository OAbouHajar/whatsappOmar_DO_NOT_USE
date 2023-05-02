package X;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: X.0TU  reason: invalid class name */
public final class AnonymousClass0TU {
    public static Method A00;
    public static Method A01;

    static {
        Class<String> cls = String.class;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                A01 = AnonymousClass000.A0s(cls2, cls, "getScript", new Class[1], 0);
                A00 = AnonymousClass000.A0s(cls2, cls, "addLikelySubtags", new Class[1], 0);
            } catch (Exception e2) {
                A01 = null;
                A00 = null;
                Log.w("ICUCompat", e2);
            }
        } else if (i2 < 24) {
            try {
                A00 = AnonymousClass000.A0s(Class.forName("libcore.icu.ICU"), Locale.class, "addLikelySubtags", new Class[1], 0);
            } catch (Exception e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    public static String A00(Locale locale) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return AnonymousClass0VP.A02(AnonymousClass0VP.A00(AnonymousClass0VP.A01(locale)));
        }
        if (i2 >= 21) {
            try {
                return C04120Lg.A00((Locale) A00.invoke((Object) null, new Object[]{locale}));
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return C04120Lg.A00(locale);
            }
        } else {
            Object obj = locale.toString();
            try {
                Method method = A00;
                if (method != null) {
                    obj = method.invoke((Object) null, AnonymousClass000.A1a(obj));
                }
            } catch (IllegalAccessException | InvocationTargetException e3) {
                Log.w("ICUCompat", e3);
            }
            if (obj == null) {
                return null;
            }
            try {
                Method method2 = A01;
                if (method2 != null) {
                    return (String) method2.invoke((Object) null, AnonymousClass000.A1a(obj));
                }
            } catch (IllegalAccessException | InvocationTargetException e4) {
                Log.w("ICUCompat", e4);
            }
            return null;
        }
    }
}
