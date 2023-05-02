package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0cw  reason: invalid class name and case insensitive filesystem */
public class C08040cw implements C12040jk {
    public final Handler A00;

    public C08040cw() {
        Handler handler;
        Looper mainLooper = Looper.getMainLooper();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            handler = C04090Ld.A00(mainLooper);
        } else {
            if (i2 >= 17) {
                Class<Handler> cls = Handler.class;
                try {
                    handler = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{mainLooper, null, Boolean.TRUE});
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e2) {
                    Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e2);
                } catch (InvocationTargetException e3) {
                    Throwable cause = e3.getCause();
                    if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                        throw cause;
                    }
                    throw new RuntimeException(cause);
                }
            }
            handler = new Handler(mainLooper);
        }
        this.A00 = handler;
    }
}
