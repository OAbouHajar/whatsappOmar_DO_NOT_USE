package X;

/* renamed from: X.05A  reason: invalid class name */
public class AnonymousClass05A extends C004902d {
    public final ThreadLocal A00 = new ThreadLocal();
    public final ThreadLocal A01 = new ThreadLocal();

    public static double A00(C005202g r6) {
        double A002 = (((double) r6.A00()) * 1.0d) / ((double) AnonymousClass0TQ.A00);
        r6.A04();
        return A002;
    }

    public /* bridge */ /* synthetic */ C005102f A01() {
        return new AnonymousClass04Y();
    }

    public /* bridge */ /* synthetic */ boolean A02(C005102f r6) {
        AnonymousClass04Y r62 = (AnonymousClass04Y) r6;
        if (r62 != null) {
            try {
                ThreadLocal threadLocal = this.A01;
                C005202g r2 = (C005202g) threadLocal.get();
                if (r2 == null) {
                    r2 = new C005202g("/proc/self/stat");
                    threadLocal.set(r2);
                }
                r2.A02();
                if (!r2.A05) {
                    return false;
                }
                int i2 = 0;
                do {
                    r2.A04();
                    i2++;
                } while (i2 < 13);
                r62.userTimeS = A00(r2);
                r62.systemTimeS = A00(r2);
                r62.childUserTimeS = A00(r2);
                r62.childSystemTimeS = A00(r2);
                ThreadLocal threadLocal2 = this.A00;
                if (threadLocal2.get() == null) {
                    threadLocal2.set(new AnonymousClass04Y());
                }
                AnonymousClass04Y r4 = (AnonymousClass04Y) threadLocal2.get();
                if (Double.compare(r62.userTimeS, r4.userTimeS) < 0 || Double.compare(r62.systemTimeS, r4.systemTimeS) < 0 || Double.compare(r62.childUserTimeS, r4.childUserTimeS) < 0 || Double.compare(r62.childSystemTimeS, r4.childSystemTimeS) < 0) {
                    return false;
                }
                r4.A03(r62);
                return true;
            } catch (C11110iD unused) {
                return false;
            }
        } else {
            throw new IllegalArgumentException("Null value passed to getSnapshot!");
        }
    }
}
