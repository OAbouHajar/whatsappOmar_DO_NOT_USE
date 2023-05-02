package androidx.activity;

import X.AnonymousClass05T;
import android.app.Activity;
import java.lang.reflect.Field;

public final class ImmLeaksCleaner implements AnonymousClass05T {
    public static int A01;
    public static Field A02;
    public static Field A03;
    public static Field A04;
    public Activity A00;

    public ImmLeaksCleaner(Activity activity) {
        this.A00 = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AXa(X.C011405n r5, X.C001300o r6) {
        /*
            r4 = this;
            X.05n r0 = X.C011405n.ON_DESTROY
            if (r5 != r0) goto L_0x006d
            int r0 = A01
            if (r0 != 0) goto L_0x0031
            r0 = 2
            A01 = r0     // Catch:{ NoSuchFieldException -> 0x0031 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r2 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mServedView"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0031 }
            A04 = r0     // Catch:{ NoSuchFieldException -> 0x0031 }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0031 }
            java.lang.String r0 = "mNextServedView"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0031 }
            A03 = r0     // Catch:{ NoSuchFieldException -> 0x0031 }
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0031 }
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0031 }
            A02 = r0     // Catch:{ NoSuchFieldException -> 0x0031 }
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0031 }
            A01 = r1     // Catch:{ NoSuchFieldException -> 0x0031 }
        L_0x0031:
            int r1 = A01
            r0 = 1
            if (r1 != r0) goto L_0x006c
            android.app.Activity r1 = r4.A00
            java.lang.String r0 = "input_method"
            java.lang.Object r3 = r1.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r0 = A02     // Catch:{ IllegalAccessException -> 0x006c }
            java.lang.Object r2 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x006c }
            if (r2 == 0) goto L_0x006d
            monitor-enter(r2)
            java.lang.reflect.Field r0 = A04     // Catch:{ ClassCastException | IllegalAccessException -> 0x0063 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ ClassCastException | IllegalAccessException -> 0x0063 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ ClassCastException | IllegalAccessException -> 0x0063 }
            if (r0 == 0) goto L_0x0061
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0061
            java.lang.reflect.Field r1 = A03     // Catch:{  }
            r0 = 0
            r1.set(r3, r0)     // Catch:{  }
            monitor-exit(r2)     // Catch:{ all -> 0x0065 }
            goto L_0x0069
        L_0x0061:
            monitor-exit(r2)     // Catch:{ all -> 0x0065 }
            return
        L_0x0063:
            monitor-exit(r2)     // Catch:{ all -> 0x0065 }
            goto L_0x0068
        L_0x0065:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0065 }
            throw r0
        L_0x0068:
            return
        L_0x0069:
            r3.isActive()
        L_0x006c:
            return
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.AXa(X.05n, X.00o):void");
    }
}
