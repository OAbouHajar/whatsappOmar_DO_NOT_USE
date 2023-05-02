package X;

import java.util.List;

/* renamed from: X.1OZ  reason: invalid class name */
public class AnonymousClass1OZ implements C23541Cj {
    public final AnonymousClass11G A00;
    public final AnonymousClass1L1 A01;

    public AnonymousClass1OZ(AnonymousClass11G r1, AnonymousClass1L1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* synthetic */ void APJ() {
    }

    public void APK() {
        AnonymousClass1L1 r5 = this.A01;
        List<C30991dI> A07 = this.A00.A07();
        C75133rf r4 = new C75133rf();
        r4.A01 = 0L;
        r4.A03 = 0L;
        r4.A00 = 0L;
        r4.A02 = 0L;
        for (C30991dI r6 : A07) {
            if (!r6.A0B()) {
                r4.A01 = Long.valueOf(r4.A01.longValue() + 1);
                if (r6.A01() != r6.A02()) {
                    r4.A03 = Long.valueOf(r4.A03.longValue() + 1);
                }
                r4.A00 = Long.valueOf(r4.A00.longValue() + ((long) r6.A01()));
                r4.A02 = Long.valueOf(r4.A02.longValue() + ((long) (r6.A01() - r6.A02())));
            }
        }
        r5.A09.A05(r4);
    }
}
