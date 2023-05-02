package X;

import android.graphics.PointF;

/* renamed from: X.4Rv  reason: invalid class name and case insensitive filesystem */
public class C86244Rv {
    public long A00;
    public final C86174Rm A01;
    public final C63653Kz A02;
    public final C63653Kz A03 = new C63653Kz();
    public final C63653Kz A04;
    public final C63653Kz A05;

    public C86244Rv(PointF pointF, long j2) {
        C63653Kz r2 = new C63653Kz();
        this.A04 = r2;
        C63653Kz r1 = new C63653Kz();
        this.A05 = r1;
        this.A02 = new C63653Kz();
        this.A01 = new C86174Rm(pointF, j2);
        this.A00 = j2;
        r2.set(pointF);
        r1.set(0.0f, 0.0f);
    }

    public final void A00() {
        C63653Kz r3 = this.A02;
        C63653Kz r2 = this.A03;
        C63653Kz r5 = this.A04;
        float f2 = r2.x - r5.x;
        r3.x = f2;
        float f3 = r2.y - r5.y;
        r3.y = f3;
        float f4 = f2 * 0.05f;
        r3.x = f4;
        float f5 = f3 * 0.05f;
        r3.y = f5;
        C63653Kz r32 = this.A05;
        float f6 = r32.x + f4;
        r32.x = f6;
        float f7 = r32.y + f5;
        r32.y = f7;
        float f8 = f6 * 0.7f;
        r32.x = f8;
        float f9 = f7 * 0.7f;
        r32.y = f9;
        r5.x += f8;
        r5.y += f9;
        long j2 = (long) (((double) this.A00) + 3.0d);
        this.A00 = j2;
        this.A01.A00(r5, j2);
    }
}
