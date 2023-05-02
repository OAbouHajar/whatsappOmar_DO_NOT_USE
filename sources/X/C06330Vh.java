package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Vh  reason: invalid class name and case insensitive filesystem */
public final class C06330Vh {
    public static final String A00;

    static {
        String A01 = C06530Wm.A01("ProcessUtils");
        C18450wi.A0B(A01);
        A00 = A01;
    }

    public static final String A00(Context context) {
        T t2;
        Object invoke;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return AnonymousClass0MP.A00();
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, AnonymousClass022.class.getClassLoader());
            if (i2 >= 18) {
                Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                invoke = declaredMethod.invoke((Object) null, new Object[0]);
                C18450wi.A0F(invoke);
            } else {
                Method declaredMethod2 = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("getProcessName", new Class[0]);
                declaredMethod3.setAccessible(true);
                invoke = declaredMethod3.invoke(declaredMethod2.invoke((Object) null, new Object[0]), new Object[0]);
                C18450wi.A0F(invoke);
            }
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            C06530Wm A002 = C06530Wm.A00();
            String str = A00;
            if (A002.A00 <= 3) {
                Log.d(str, "Unable to check ActivityThread for processName", th);
            }
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        C18450wi.A0M(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (AnonymousClass000.A1R(((ActivityManager.RunningAppProcessInfo) t2).pid, myPid)) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) t2;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean A01(Context context, AnonymousClass0Pz r3) {
        C18450wi.A0H(context, 0);
        C18450wi.A0H(r3, 1);
        return C18450wi.A0R(A00(context), context.getApplicationInfo().processName);
    }
}
