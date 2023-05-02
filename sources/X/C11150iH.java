package X;

import android.os.Process;

/* renamed from: X.0iH  reason: invalid class name and case insensitive filesystem */
public class C11150iH extends Thread {
    public final int A00 = 10;

    public C11150iH(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    public void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }
}
