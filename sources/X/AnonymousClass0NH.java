package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0NH  reason: invalid class name */
public class AnonymousClass0NH {
    public static Method A00;
    public static Method A01;
    public static boolean A02;

    public static void A00(Canvas canvas, boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            return;
        }
        if (i2 >= 29) {
            if (z2) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i2 != 28) {
            if (!A02) {
                Class<Canvas> cls = Canvas.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    A01 = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = cls.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    A00 = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                A02 = true;
            }
            if (z2) {
                try {
                    Method method = A01;
                    if (method != null) {
                        method.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            } else {
                Method method2 = A00;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            }
        } else {
            throw AnonymousClass000.A0V("This method doesn't work on Pie!");
        }
    }
}
