package X;

/* renamed from: X.0fw  reason: invalid class name and case insensitive filesystem */
public class C09700fw implements Runnable {
    public final /* synthetic */ C08830eR A00;

    public C09700fw(C08830eR r1) {
        this.A00 = r1;
    }

    public void run() {
        C08830eR r5 = this.A00;
        synchronized (r5) {
            r5.A05 = false;
            if (r5.A06.now() - r5.A00 > 2000) {
                C08840eS r0 = r5.A04;
                if (r0 != null) {
                    r0.A06.clear();
                }
            } else {
                r5.A00();
            }
        }
    }
}
