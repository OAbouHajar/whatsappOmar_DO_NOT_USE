package X;

import android.os.Process;

/* renamed from: X.5At  reason: invalid class name and case insensitive filesystem */
public final class C105685At extends Thread {
    public C105685At(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
