package X;

import java.util.concurrent.Executor;

/* renamed from: X.0Ki  reason: invalid class name and case insensitive filesystem */
public enum C03900Ki implements Executor {
    ;

    /* access modifiers changed from: public */
    C03900Ki() {
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
