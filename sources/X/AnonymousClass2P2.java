package X;

import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;

/* renamed from: X.2P2  reason: invalid class name */
public class AnonymousClass2P2 implements Runnable {
    public final /* synthetic */ AnonymousClass1ZK A00;

    public AnonymousClass2P2(AnonymousClass1ZK r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass2P3 r3;
        AnonymousClass1ZK r1 = this.A00;
        if (r1.A0S) {
            r1.A0Z.postDelayed(this, 1000);
        } else if (r1.A0P != null && (r3 = r1.A0O) != null) {
            r3.A07(new RunnableRunnableShape16S0100000_I0_15(this, 24), 300);
        }
    }
}
