package X;

/* renamed from: X.0p3  reason: invalid class name and case insensitive filesystem */
public class C14370p3 {
    public final C14210on A00 = new C14210on();

    public void A00(Exception exc) {
        C14210on r2 = this.A00;
        C13710nw.A02(exc, "Exception must not be null");
        synchronized (r2.A04) {
            if (!r2.A02) {
                r2.A02 = true;
                r2.A00 = exc;
                r2.A03.A01(r2);
            }
        }
    }

    public void A01(Object obj) {
        this.A00.A08(obj);
    }
}
