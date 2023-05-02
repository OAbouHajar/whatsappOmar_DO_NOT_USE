package X;

import android.content.res.Resources;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Tc  reason: invalid class name and case insensitive filesystem */
public class C05810Tc {
    public static Method A00;
    public static boolean A01;
    public static final Object A02 = new Object();

    public static void A00(Resources.Theme theme) {
        synchronized (A02) {
            if (!A01) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                    A00 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                }
                A01 = true;
            }
            Method method = A00;
            if (method != null) {
                try {
                    method.invoke(theme, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                    A00 = null;
                }
            }
        }
    }
}
