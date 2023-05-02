package X;

/* renamed from: X.4a2  reason: invalid class name and case insensitive filesystem */
public class C88154a2 {
    public final int A00;
    public final C34641kb A01;
    public final String A02;
    public final Throwable A03;

    public C88154a2(C34641kb r1, String str, Throwable th, int i2) {
        this.A00 = i2;
        this.A03 = th;
        this.A02 = str;
        this.A01 = r1;
    }

    public static void A00(Throwable th, Throwable th2) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th.getClass() != th2.getClass()) {
            try {
                th.initCause(th2);
            } catch (IllegalStateException unused) {
            }
        }
    }
}
