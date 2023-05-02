package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0LF  reason: invalid class name */
public class AnonymousClass0LF {
    public static boolean A00(Context context) {
        return Build.VERSION.SDK_INT >= 23 && context != null && context.getPackageManager() != null && AnonymousClass0LE.A00(context.getPackageManager());
    }
}
