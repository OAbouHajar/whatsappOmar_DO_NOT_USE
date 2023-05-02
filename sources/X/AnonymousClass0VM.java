package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: X.0VM  reason: invalid class name */
public final class AnonymousClass0VM {
    public static int A00(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0VK.A00((AppOpsManager) AnonymousClass0VK.A01(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static int A01(Context context, String str, String str2, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return A00(context, str, str2);
        }
        AppOpsManager A01 = AnonymousClass0VL.A01(context);
        int A00 = AnonymousClass0VL.A00(A01, str, str2, Binder.getCallingUid());
        return A00 == 0 ? AnonymousClass0VL.A00(A01, str, AnonymousClass0VL.A02(context), i2) : A00;
    }

    public static String A02(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0VK.A02(str);
        }
        return null;
    }
}
