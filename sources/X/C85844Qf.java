package X;

import java.util.Map;

/* renamed from: X.4Qf  reason: invalid class name and case insensitive filesystem */
public class C85844Qf {
    public final Object A00 = C13690nt.A0Y();
    public final Map A01 = AnonymousClass000.A0x();

    public int A00(C31201dg r6, C31201dg r7, String str) {
        int incrementAndGet;
        AnonymousClass4UG r4 = new AnonymousClass4UG(r7.A00, str, r6.A00);
        synchronized (this.A00) {
            Map map = this.A01;
            Integer num = (Integer) map.get(r4);
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = AnonymousClass494.A00.incrementAndGet();
                map.put(r4, Integer.valueOf(incrementAndGet));
            }
        }
        return incrementAndGet;
    }
}
