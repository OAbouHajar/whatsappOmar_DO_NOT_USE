package X;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Gv  reason: invalid class name and case insensitive filesystem */
public class C24671Gv {
    public AnonymousClass2KW A00;
    public Boolean A01;
    public final C002801g A02;
    public final C16490t9 A03;
    public final C24661Gu A04;
    public final C19500yX A05;

    public C24671Gv(C002801g r1, C16490t9 r2, C24661Gu r3, C19500yX r4) {
        this.A05 = r4;
        this.A03 = r2;
        this.A02 = r1;
        this.A04 = r3;
    }

    public void A00() {
        AnonymousClass2KW r10;
        if ((A03() || this.A05.AJC(689639794)) && (r10 = this.A00) != null) {
            AnonymousClass04u r8 = r10.A03;
            if (r8.A03) {
                r8.A03 = false;
                C010004v r0 = r8.A05;
                r0.A03 = false;
                r0.A05.removeFrameCallback(r0.A04);
                double min = Math.min(r8.A01, 3600.0d);
                double min2 = Math.min(r8.A00, 1000.0d);
                long millis = TimeUnit.NANOSECONDS.toMillis(Math.min(r8.A02, AnonymousClass04u.A07));
                C010104w r02 = r8.A06;
                C010204x r14 = new C010204x(min, min2, millis);
                AnonymousClass2KW r9 = ((AnonymousClass2KX) r02).A00;
                Integer num = r9.A00;
                if (num != null) {
                    if (r9.A02) {
                        Map map = r9.A06;
                        if (!map.containsKey(num)) {
                            map.put(r9.A00, new AnonymousClass2KY());
                        }
                        AnonymousClass2KY r4 = (AnonymousClass2KY) map.get(r9.A00);
                        r4.A02++;
                        r4.A00 += r14.A00;
                        r4.A01 += r14.A01;
                        r4.A03 += r14.A02;
                    }
                    if (r9.A01) {
                        double d2 = r14.A00;
                        if (!Double.isNaN(d2)) {
                            C19500yX r13 = r9.A05;
                            long j2 = r14.A02;
                            r13.AKh(689639794, "timeSpent", j2);
                            double d3 = (double) j2;
                            r13.AKs("smallFrames", (r14.A01 * 60000.0d) / d3, 689639794);
                            r13.AKs("largeFrames", (d2 * 60000.0d) / d3, 689639794);
                            Integer num2 = r9.A00;
                            if (num2 != null) {
                                r13.AKg(689639794, "scrollSurface", num2.intValue());
                            }
                        }
                    }
                }
                r8.A01 = 0.0d;
                r8.A00 = 0.0d;
                r8.A02 = 0;
            }
            r10.A00 = null;
            C19500yX r2 = this.A05;
            if (r2.AJC(689639794)) {
                r2.AKz(689639794, 2);
            }
        }
    }

    public void A01(int i2) {
        if (this.A00 != null) {
            C19500yX r2 = this.A05;
            r2.ALE(689639794);
            AnonymousClass2KW r4 = this.A00;
            boolean A032 = A03();
            boolean AJC = r2.AJC(689639794);
            r4.A01 = AJC;
            r4.A02 = A032;
            if (AJC || A032) {
                AnonymousClass04u r1 = r4.A03;
                if (!r1.A03) {
                    r1.A03 = true;
                    C010004v r3 = r1.A05;
                    if (!r3.A03) {
                        r3.A00 = -1;
                    }
                    r3.A03 = true;
                    r3.A05.postFrameCallback(r3.A04);
                }
                r4.A00 = Integer.valueOf(i2);
            }
        }
    }

    public void A02(Context context) {
        if ((A03() || this.A05.AL4(689639794)) && this.A00 == null) {
            this.A00 = new AnonymousClass2KW(context, this.A02, this.A03, this.A05);
        }
    }

    public final boolean A03() {
        Boolean bool = this.A01;
        if (bool == null) {
            bool = Boolean.valueOf(new AnonymousClass00F(1, 1, 1).A00());
            this.A01 = bool;
        }
        return bool.booleanValue();
    }
}
