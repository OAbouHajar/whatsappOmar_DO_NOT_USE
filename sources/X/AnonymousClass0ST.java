package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* renamed from: X.0ST  reason: invalid class name */
public class AnonymousClass0ST {
    public static KeyguardManager A00(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0SS.A00(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    public static boolean A01(Context context) {
        KeyguardManager A00 = A00(context);
        if (A00 != null) {
            return Build.VERSION.SDK_INT >= 23 ? AnonymousClass0SS.A01(A00) : A00.isKeyguardSecure();
        }
        return false;
    }
}
