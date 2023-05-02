package X;

import android.os.Process;

/* renamed from: X.0iI  reason: invalid class name and case insensitive filesystem */
public final class C11160iI extends Thread {
    public final /* synthetic */ AnonymousClass0OG A00;

    public C11160iI(AnonymousClass0OG r1) {
        this.A00 = r1;
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                ((C10670hV) this.A00.A00.take()).run();
            } catch (InterruptedException unused) {
            }
        }
    }
}
