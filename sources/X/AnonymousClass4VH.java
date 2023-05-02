package X;

import org.apache.commons.io.FileUtils;

/* renamed from: X.4VH  reason: invalid class name */
public class AnonymousClass4VH {
    public byte A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public static long A00(long j2, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return (((j2 - 1) / FileUtils.ONE_KB) + 1) * FileUtils.ONE_KB;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r0 = r6.A0B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C75853sp A01() {
        /*
            r6 = this;
            X.3sp r5 = new X.3sp
            r5.<init>()
            java.lang.Integer r0 = X.C13680ns.A0a()
            r5.A01 = r0
            byte r1 = r6.A00
            r0 = 0
            int r0 = X.C42141xI.A00(r1, r0, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A00 = r0
            java.lang.Long r1 = r6.A0C
            if (r1 == 0) goto L_0x00a1
            java.lang.Long r0 = r6.A0B
            if (r0 == 0) goto L_0x00a1
            long r2 = r0.longValue()
            long r0 = r1.longValue()
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L_0x002d:
            r5.A0B = r0
            java.lang.Long r1 = r6.A0A
            if (r1 == 0) goto L_0x009f
            java.lang.Long r0 = r6.A09
            if (r0 == 0) goto L_0x009f
            long r2 = r0.longValue()
            long r0 = r1.longValue()
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L_0x0044:
            r5.A02 = r0
            long r0 = r6.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A09 = r0
            long r0 = r6.A08
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0A = r0
            long r0 = r6.A04
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A06 = r0
            long r3 = r6.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            long r0 = A00(r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A03 = r0
            long r0 = r6.A05
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A07 = r0
            long r3 = r6.A02
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            long r0 = A00(r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A04 = r0
            long r0 = r6.A06
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A08 = r0
            long r3 = r6.A03
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            long r0 = A00(r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A05 = r0
            return r5
        L_0x009f:
            r0 = 0
            goto L_0x0044
        L_0x00a1:
            r0 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VH.A01():X.3sp");
    }

    public String toString() {
        return A01().toString();
    }
}
