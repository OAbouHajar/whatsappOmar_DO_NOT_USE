package X;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.03S  reason: invalid class name */
public final class AnonymousClass03S {
    public static AnonymousClass03X A02;
    public static String A03;
    public static Set A04 = new HashSet();
    public static final Object A05 = new Object();
    public static final Object A06 = new Object();
    public final NotificationManager A00;
    public final Context A01;

    public AnonymousClass03S(Context context) {
        this.A01 = context;
        this.A00 = (NotificationManager) context.getSystemService("notification");
    }

    public final void A00(AnonymousClass03U r4) {
        synchronized (A06) {
            AnonymousClass03X r1 = A02;
            if (r1 == null) {
                r1 = new AnonymousClass03X(this.A01.getApplicationContext());
                A02 = r1;
            }
            r1.A02.obtainMessage(0, r4).sendToTarget();
        }
    }

    public void A01(String str, int i2) {
        this.A00.cancel(str, i2);
        if (Build.VERSION.SDK_INT <= 19) {
            A00(new AnonymousClass03T(this.A01.getPackageName(), str, i2));
        }
    }

    public void A02(String str, int i2, Notification notification) {
        Bundle A002 = AnonymousClass03V.A00(notification);
        if (A002 == null || !A002.getBoolean("android.support.useSideChannel")) {
            this.A00.notify(str, i2, notification);
            return;
        }
        A00(new AnonymousClass03W(notification, this.A01.getPackageName(), str, i2));
        this.A00.cancel(str, i2);
    }

    public boolean A03() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return this.A00.areNotificationsEnabled();
        }
        if (i2 < 19) {
            return true;
        }
        Context context = this.A01;
        Object systemService = context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i3 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(systemService, new Object[]{(Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class), Integer.valueOf(i3), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
