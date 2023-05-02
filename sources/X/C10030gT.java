package X;

/* renamed from: X.0gT  reason: invalid class name and case insensitive filesystem */
public class C10030gT implements Runnable {
    public final C10880hq A00;
    public final Runnable A01;

    public C10030gT(C10880hq r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public void run() {
        try {
            this.A01.run();
            C10880hq r0 = this.A00;
            synchronized (r0.A01) {
                r0.A00();
            }
            return;
        } catch (Throwable th) {
            th = th;
        }
        throw th;
    }
}
