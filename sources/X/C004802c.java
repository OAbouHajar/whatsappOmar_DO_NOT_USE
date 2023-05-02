package X;

import java.nio.CharBuffer;

/* renamed from: X.02c  reason: invalid class name and case insensitive filesystem */
public class C004802c extends C004902d {
    public final ThreadLocal A00 = new ThreadLocal();
    public final ThreadLocal A01 = new ThreadLocal();

    public static long A00(C005202g r2) {
        r2.A07(CharBuffer.allocate(32));
        r2.A04();
        long A002 = r2.A00();
        r2.A03();
        return A002;
    }

    public /* bridge */ /* synthetic */ C005102f A01() {
        return new C005002e();
    }

    public /* bridge */ /* synthetic */ boolean A02(C005102f r5) {
        C005002e r52 = (C005002e) r5;
        if (r52 != null) {
            try {
                ThreadLocal threadLocal = this.A00;
                C005202g r2 = (C005202g) threadLocal.get();
                if (r2 == null) {
                    r2 = new C005202g("/proc/self/io");
                    threadLocal.set(r2);
                }
                r2.A02();
                if (!r2.A05) {
                    return false;
                }
                r52.rcharBytes = A00(r2);
                r52.wcharBytes = A00(r2);
                r52.syscrCount = A00(r2);
                r52.syscwCount = A00(r2);
                r52.readBytes = A00(r2);
                r52.writeBytes = A00(r2);
                r52.cancelledWriteBytes = A00(r2);
                ThreadLocal threadLocal2 = this.A01;
                C005202g r3 = (C005202g) threadLocal2.get();
                if (r3 == null) {
                    r3 = new C005202g("/proc/self/stat");
                    threadLocal2.set(r3);
                }
                r3.A02();
                if (!r3.A05) {
                    return false;
                }
                int i2 = 0;
                do {
                    r3.A04();
                    i2++;
                } while (i2 < 11);
                r52.majorFaults = r3.A00();
                while (i2 < 41) {
                    r3.A04();
                    i2++;
                }
                r52.blkIoTicks = r3.A00();
                return true;
            } catch (C11110iD unused) {
                return false;
            }
        } else {
            throw new IllegalArgumentException("Null value passed to getSnapshot!");
        }
    }
}
