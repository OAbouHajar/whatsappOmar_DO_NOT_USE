package X;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: X.0VL  reason: invalid class name */
public class AnonymousClass0VL {
    public static int A00(AppOpsManager appOpsManager, String str, String str2, int i2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i2, str2);
    }

    public static AppOpsManager A01(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static String A02(Context context) {
        return context.getOpPackageName();
    }
}
