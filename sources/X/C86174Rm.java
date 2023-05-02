package X;

import android.graphics.PointF;

/* renamed from: X.4Rm  reason: invalid class name and case insensitive filesystem */
public class C86174Rm {
    public C63653Kz A00;
    public C63653Kz A01;
    public final long A02;
    public final C88764b3 A03;
    public final C63653Kz A04;

    public C86174Rm(PointF pointF, long j2) {
        C88764b3 r2 = new C88764b3();
        this.A03 = r2;
        C63653Kz r1 = new C63653Kz();
        this.A04 = r1;
        C63653Kz r0 = new C63653Kz(pointF);
        this.A00 = r0;
        this.A01 = r0;
        this.A02 = j2;
        r2.A00(r0, r1);
    }

    public void A00(PointF pointF, long j2) {
        if (j2 >= this.A02) {
            C63653Kz r5 = this.A00;
            C63653Kz r4 = this.A01;
            if (r5 == r4) {
                this.A00 = new C63653Kz(pointF);
                return;
            }
            C63653Kz r3 = this.A04;
            float f2 = pointF.x - r4.x;
            r3.x = f2;
            float f3 = pointF.y - r4.y;
            r3.y = f3;
            r3.x = f2 * 0.5f;
            r3.y = f3 * 0.5f;
            this.A03.A00(r5, r3);
            this.A01.set(this.A00);
            this.A00.set(pointF);
            return;
        }
        throw AnonymousClass000.A0V("events must deliver in order");
    }
}
