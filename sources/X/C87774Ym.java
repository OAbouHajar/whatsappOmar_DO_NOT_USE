package X;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.4Ym  reason: invalid class name and case insensitive filesystem */
public final class C87774Ym {
    public static final Method A00;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        A00 = method;
    }

    public static final void A00(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        try {
            if ((executor instanceof ScheduledThreadPoolExecutor) && (scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor) != null && (method = A00) != null) {
                Object[] A1b = C13680ns.A1b();
                A1b[0] = Boolean.TRUE;
                method.invoke(scheduledThreadPoolExecutor, A1b);
            }
        } catch (Throwable unused) {
        }
    }
}
