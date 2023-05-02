package X;

/* renamed from: X.5Gu  reason: invalid class name and case insensitive filesystem */
public final class C107195Gu extends AnonymousClass55A {
    public final Runnable A00;

    public C107195Gu(Runnable runnable, C83184Fr r2, long j2) {
        super(r2, j2);
        this.A00 = runnable;
    }

    public void run() {
        this.A00.run();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Task[");
        A0r.append(AnonymousClass3K2.A0l(this.A00, A0r));
        A0r.append(", ");
        A0r.append(this.A00);
        A0r.append(", ");
        A0r.append(this.A01);
        return AnonymousClass3K2.A0m(A0r);
    }
}
