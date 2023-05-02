package X;

import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.58P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass58P implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new AnonymousClass1ZS(new RunnableRunnableShape12S0100000_I0_11((Object) runnable, 37), "DecryptMessageExecutor");
    }
}
