package X;

import org.apache.commons.io.FileUtils;

/* renamed from: X.0vN  reason: invalid class name and case insensitive filesystem */
public class C17620vN {
    public long A00 = -1;
    public final C16900tq A01;
    public final C16490t9 A02;
    public final AnonymousClass00F A03;

    public C17620vN(C16900tq r3, C16490t9 r4) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = new C34081jf().samplingRate;
    }

    public void A00(String str, long j2) {
        boolean A0E;
        AnonymousClass00F r5 = this.A03;
        if (r5.A00()) {
            C34081jf r4 = new C34081jf();
            r4.A05 = str;
            r4.A03 = Long.valueOf(j2);
            r4.A01 = Boolean.valueOf(AnonymousClass01E.A01());
            C16900tq r8 = this.A01;
            r8.A04();
            C33811jC r1 = r8.A04;
            synchronized (r1) {
                A0E = r1.A0E(r1.A00);
            }
            r4.A00 = Boolean.valueOf(A0E);
            long j3 = this.A00;
            if (j3 == -1) {
                r8.A04();
                j3 = r8.A06.length() / FileUtils.ONE_MB;
                this.A00 = j3;
            }
            r4.A04 = Long.valueOf(j3);
            if (Boolean.TRUE.equals(AnonymousClass00B.A01)) {
                r4.A02 = 1;
            }
            this.A02.A07(r4, r5.A03);
        }
    }
}
