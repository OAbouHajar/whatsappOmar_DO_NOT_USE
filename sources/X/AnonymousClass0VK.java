package X;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: X.0VK  reason: invalid class name */
public class AnonymousClass0VK {
    public static int A00(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static Object A01(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    public static String A02(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
