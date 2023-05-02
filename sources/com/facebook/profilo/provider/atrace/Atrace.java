package com.facebook.profilo.provider.atrace;

import X.AnonymousClass000;
import X.AnonymousClass4AR;
import X.C32731h5;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Atrace {
    public static boolean sHasHook;
    public static boolean sHookFailed;

    public static void enableSystrace(MultiBufferLogger multiBufferLogger) {
        Method method;
        if (hasHacks(multiBufferLogger)) {
            enableSystraceNative();
            Field field = AnonymousClass4AR.A00;
            if (field != null && (method = AnonymousClass4AR.A01) != null) {
                try {
                    field.set((Object) null, method.invoke((Object) null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    public static native void enableSystraceNative();

    public static synchronized boolean hasHacks(MultiBufferLogger multiBufferLogger) {
        boolean z2;
        synchronized (Atrace.class) {
            z2 = sHasHook;
            if (!z2 && !sHookFailed) {
                z2 = installSystraceHook(multiBufferLogger, C32731h5.A00);
                sHasHook = z2;
                sHookFailed = AnonymousClass000.A1P(z2 ? 1 : 0);
            }
        }
        return z2;
    }

    public static native boolean installSystraceHook(MultiBufferLogger multiBufferLogger, int i2);

    public static native boolean isEnabled();

    public static void restoreSystrace(MultiBufferLogger multiBufferLogger) {
        Method method;
        if (hasHacks(multiBufferLogger)) {
            restoreSystraceNative();
            Field field = AnonymousClass4AR.A00;
            if (field != null && (method = AnonymousClass4AR.A01) != null) {
                try {
                    field.set((Object) null, method.invoke((Object) null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    public static native void restoreSystraceNative();
}
