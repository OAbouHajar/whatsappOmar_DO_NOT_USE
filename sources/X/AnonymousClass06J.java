package X;

/* renamed from: X.06J  reason: invalid class name */
public class AnonymousClass06J implements Runnable {
    public final /* synthetic */ AnonymousClass06G A00;

    public AnonymousClass06J(AnonymousClass06G r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass06G r2 = this.A00;
        if ((r2.A00 & 1) != 0) {
            r2.A0Q(0);
        }
        if ((r2.A00 & 4096) != 0) {
            r2.A0Q(AnonymousClass2EA.A03);
        }
        r2.A0Z = false;
        r2.A00 = 0;
    }
}
