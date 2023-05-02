package e;

import java.util.concurrent.ThreadFactory;

/* compiled from: XFMFile */
public final class n0 implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new m0(runnable);
    }
}
