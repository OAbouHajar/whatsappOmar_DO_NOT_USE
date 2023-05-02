package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.Constructor;

/* renamed from: X.0Vs  reason: invalid class name and case insensitive filesystem */
public final class C06420Vs {
    public static final C11530iv A00;
    public static volatile Choreographer choreographer;

    static {
        Object obj;
        C11530iv r2 = null;
        try {
            obj = new C107055Gf(A00(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = A01(th);
        }
        if (!C41201vP.A01(obj)) {
            r2 = obj;
        }
        A00 = r2;
    }

    public static final Handler A00(Looper looper) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (obj == null) {
                throw AnonymousClass000.A0W("null cannot be cast to non-null type android.os.Handler");
            }
        } else {
            Class cls = Handler.class;
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});
                obj = declaredConstructor.newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) obj;
    }

    public static final Object A01(Throwable th) {
        return new C41211vQ(th);
    }
}
