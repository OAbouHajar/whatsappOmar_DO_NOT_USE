package X;

/* renamed from: X.0gG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C09900gG implements Runnable {
    public final /* synthetic */ C10870hp A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ C09900gG(C10870hp r1, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = r1;
    }

    public final void run() {
        Runnable runnable = this.A01;
        C10870hp r1 = this.A00;
        try {
            runnable.run();
        } finally {
            r1.A00();
        }
    }
}
