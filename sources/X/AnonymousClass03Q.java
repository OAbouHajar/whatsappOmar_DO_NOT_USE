package X;

/* renamed from: X.03Q  reason: invalid class name */
public class AnonymousClass03Q implements Runnable {
    public final /* synthetic */ AnonymousClass028 A00;

    public AnonymousClass03Q(AnonymousClass028 r1) {
        this.A00 = r1;
    }

    public void run() {
        Object obj;
        AnonymousClass028 r3 = this.A00;
        synchronized (r3.A06) {
            obj = r3.A09;
            r3.A09 = AnonymousClass028.A0A;
        }
        r3.A0B(obj);
    }
}
