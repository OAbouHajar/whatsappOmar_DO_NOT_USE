package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1Hi  reason: invalid class name and case insensitive filesystem */
public class C24801Hi {
    public static final long A04;
    public static final long A05;
    public final C16440t3 A00;
    public final C14710pd A01;
    public final C19070xi A02;
    public final C24791Hh A03;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        A05 = timeUnit.convert(15, TimeUnit.MINUTES);
        A04 = timeUnit.convert(10, TimeUnit.SECONDS);
    }

    public C24801Hi(C16440t3 r1, C14710pd r2, C19070xi r3, C24791Hh r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public boolean A00() {
        return Math.abs(this.A00.A00() - this.A02.A00()) < Math.max(TimeUnit.MILLISECONDS.convert((long) this.A01.A03(C16620tM.A02, 200), TimeUnit.MINUTES), A05);
    }
}
