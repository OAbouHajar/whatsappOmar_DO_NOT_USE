package X;

import android.os.Build;
import java.util.Arrays;

/* renamed from: X.08I  reason: invalid class name */
public class AnonymousClass08I {
    public static int A00(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? AnonymousClass08J.A00(objArr) : Arrays.hashCode(objArr);
    }

    public static boolean A01(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return AnonymousClass08J.A01(obj, obj2);
        }
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
