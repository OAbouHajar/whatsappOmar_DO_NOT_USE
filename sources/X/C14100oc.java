package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.0oc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C14100oc implements ThreadFactory {
    public static final ThreadFactory A00 = new C14100oc();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
