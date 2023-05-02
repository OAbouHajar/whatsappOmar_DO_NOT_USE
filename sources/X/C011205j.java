package X;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.05j  reason: invalid class name and case insensitive filesystem */
public final class C011205j {
    public static long A00;
    public static Method A01;

    public static void A00() {
        if (Build.VERSION.SDK_INT >= 18) {
            C05750Sv.A00();
        }
    }

    public static void A01() {
        if (Build.VERSION.SDK_INT >= 18) {
            C05750Sv.A01();
        }
    }

    public static boolean A02() {
        try {
            if (A01 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        if (Build.VERSION.SDK_INT < 18) {
            return false;
        }
        try {
            Method method = A01;
            if (method == null) {
                Class<Trace> cls = Trace.class;
                A00 = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                method = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                A01 = method;
            }
            return ((Boolean) method.invoke((Object) null, new Object[]{Long.valueOf(A00)})).booleanValue();
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw cause;
                }
                throw new RuntimeException(cause);
            }
            StringBuilder sb = new StringBuilder("Unable to call ");
            sb.append("isTagEnabled");
            sb.append(" via reflection");
            Log.v("Trace", sb.toString(), e2);
            return false;
        }
    }
}
