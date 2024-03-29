package X;

import android.content.res.Resources;
import java.lang.Thread;

/* renamed from: X.06I  reason: invalid class name */
public class AnonymousClass06I implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ Thread.UncaughtExceptionHandler A00;

    public AnonymousClass06I(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.A00 = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String message;
        if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null || (!message.contains("drawable") && !message.contains("Drawable"))) {
            this.A00.uncaughtException(thread, th);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
        Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
        notFoundException.initCause(th.getCause());
        notFoundException.setStackTrace(th.getStackTrace());
        this.A00.uncaughtException(thread, notFoundException);
    }
}
