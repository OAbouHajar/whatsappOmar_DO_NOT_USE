package X;

/* renamed from: X.0fx  reason: invalid class name and case insensitive filesystem */
public class C09710fx implements Runnable {
    public final /* synthetic */ AnonymousClass0Aj A00;

    public C09710fx(AnonymousClass0Aj r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0Aj r1 = this.A00;
        r1.unscheduleSelf(r1.A0B);
        r1.invalidateSelf();
    }
}
