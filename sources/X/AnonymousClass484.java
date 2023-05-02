package X;

import java.lang.Thread;

/* renamed from: X.484  reason: invalid class name */
public final class AnonymousClass484 {
    public static final void A00(AnonymousClass1UM r6, Throwable th) {
        Throwable runtimeException;
        try {
            AnonymousClass5VD r0 = (AnonymousClass5VD) r6.get(AnonymousClass5VD.A00);
            if (r0 != null) {
                r0.handleException(r6, th);
                return;
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException2 = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C813647w.A00(runtimeException2, th);
                th = runtimeException2;
            }
        }
        for (AnonymousClass5VD handleException : AnonymousClass4A7.A00) {
            try {
                handleException.handleException(r6, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C813647w.A00(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C813647w.A00(th, new C105635Aj(r6));
        } catch (Throwable unused) {
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
