package X;

import java.io.IOException;

/* renamed from: X.4pk  reason: invalid class name and case insensitive filesystem */
public final class C97314pk implements C30241c0, AnonymousClass5LE {
    public AnonymousClass4JT A00;
    public C30231bz A01;
    public final /* synthetic */ AnonymousClass3VO A02;

    public C97314pk(AnonymousClass3VO r5) {
        this.A02 = r5;
        this.A01 = new C30231bz((C30271c3) null, r5.A03.A02, 0);
        this.A00 = new AnonymousClass4JT((C30271c3) null, r5.A02.A02, 0);
    }

    public final C30261c2 A00(C30261c2 r11) {
        long j2 = r11.A04;
        long j3 = r11.A03;
        if (j2 == j2 && j3 == j3) {
            return r11;
        }
        int i2 = r11.A00;
        int i3 = r11.A02;
        return new C30261c2(r11.A05, r11.A06, i2, i3, r11.A01, j2, j3);
    }

    public final boolean A01(C30271c3 r4, int i2) {
        if (r4 != null) {
            AnonymousClass3VO r2 = this.A02;
            if (r2 instanceof AnonymousClass3VN) {
                Object obj = r4.A04;
                Object obj2 = ((AnonymousClass3VN) r2).A01.A00;
                if (obj2 != null && obj2.equals(obj)) {
                    obj = AnonymousClass3VR.A02;
                }
                r4 = r4.A01(obj);
            } else if (r2 instanceof AnonymousClass3VM) {
                AnonymousClass3VM r22 = (AnonymousClass3VM) r2;
                if (r22.A00 != Integer.MAX_VALUE) {
                    r4 = (C30271c3) r22.A02.get(r4);
                }
            }
            if (r4 == null) {
                return false;
            }
        } else {
            r4 = null;
        }
        AnonymousClass3VO r23 = this.A02;
        C30231bz r1 = this.A01;
        if (r1.A00 != i2 || !AnonymousClass3C1.A0F(r1.A01, r4)) {
            this.A01 = new C30231bz(r4, r23.A03.A02, i2);
        }
        AnonymousClass4JT r12 = this.A00;
        if (r12.A00 == i2 && AnonymousClass3C1.A0F(r12.A01, r4)) {
            return true;
        }
        this.A00 = new AnonymousClass4JT(r4, r23.A02.A02, i2);
        return true;
    }

    public void AQ7(C30261c2 r3, C30271c3 r4, int i2) {
        if (A01(r4, i2)) {
            this.A01.A05(A00(r3));
        }
    }

    public void ASk(C30251c1 r3, C30261c2 r4, C30271c3 r5, int i2) {
        if (A01(r5, i2)) {
            this.A01.A01(r3, A00(r4));
        }
    }

    public void ASl(C30251c1 r3, C30261c2 r4, C30271c3 r5, int i2) {
        if (A01(r5, i2)) {
            this.A01.A02(r3, A00(r4));
        }
    }

    public void ASo(C30251c1 r3, C30261c2 r4, C30271c3 r5, IOException iOException, int i2, boolean z2) {
        if (A01(r5, i2)) {
            this.A01.A04(r3, A00(r4), iOException, z2);
        }
    }

    public void ASu(C30251c1 r3, C30261c2 r4, C30271c3 r5, int i2) {
        if (A01(r5, i2)) {
            this.A01.A03(r3, A00(r4));
        }
    }
}
