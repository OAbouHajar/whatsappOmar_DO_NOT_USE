package kotlinx.coroutines.android;

import X.AnonymousClass1UM;
import X.AnonymousClass5VD;
import X.C1051358i;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class AndroidExceptionPreHandler extends C1051358i implements AnonymousClass5VD {
    public volatile Object _preHandler = this;

    public AndroidExceptionPreHandler() {
        super(AnonymousClass5VD.A00);
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z2 = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z2 = true;
            }
            if (z2) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void handleException(AnonymousClass1UM r5, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        int i2 = Build.VERSION.SDK_INT;
        if (26 <= i2 && i2 < 28) {
            Method preHandler = preHandler();
            Object obj = null;
            if (preHandler != null) {
                obj = preHandler.invoke((Object) null, new Object[0]);
            }
            if ((obj instanceof Thread.UncaughtExceptionHandler) && (uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj) != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
