package X;

import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* renamed from: X.4pj  reason: invalid class name and case insensitive filesystem */
public final class C97304pj implements C30241c0, AnonymousClass5LE {
    public AnonymousClass4JT A00;
    public C30231bz A01;
    public final C96204nx A02;
    public final /* synthetic */ AnonymousClass4XK A03;

    public C97304pj(C96204nx r2, AnonymousClass4XK r3) {
        this.A03 = r3;
        this.A01 = r3.A05;
        this.A00 = r3.A04;
        this.A02 = r2;
    }

    public final boolean A00(C30271c3 r8, int i2) {
        C30271c3 r2;
        if (r8 != null) {
            C96204nx r6 = this.A02;
            int i3 = 0;
            while (true) {
                List list = r6.A04;
                if (i3 >= list.size()) {
                    return false;
                }
                if (((C30281c4) list.get(i3)).A03 == r8.A03) {
                    r2 = r8.A01(Pair.create(r6.A03, r8.A04));
                    break;
                }
                i3++;
            }
        } else {
            r2 = null;
        }
        int i4 = i2 + this.A02.A00;
        C30231bz r1 = this.A01;
        if (r1.A00 != i4 || !AnonymousClass3C1.A0F(r1.A01, r2)) {
            this.A01 = new C30231bz(r2, this.A03.A05.A02, i4);
        }
        AnonymousClass4JT r12 = this.A00;
        if (r12.A00 == i4 && AnonymousClass3C1.A0F(r12.A01, r2)) {
            return true;
        }
        this.A00 = new AnonymousClass4JT(r2, this.A03.A04.A02, i4);
        return true;
    }

    public void AQ7(C30261c2 r2, C30271c3 r3, int i2) {
        if (A00(r3, i2)) {
            this.A01.A05(r2);
        }
    }

    public void ASk(C30251c1 r2, C30261c2 r3, C30271c3 r4, int i2) {
        if (A00(r4, i2)) {
            this.A01.A01(r2, r3);
        }
    }

    public void ASl(C30251c1 r2, C30261c2 r3, C30271c3 r4, int i2) {
        if (A00(r4, i2)) {
            this.A01.A02(r2, r3);
        }
    }

    public void ASo(C30251c1 r2, C30261c2 r3, C30271c3 r4, IOException iOException, int i2, boolean z2) {
        if (A00(r4, i2)) {
            this.A01.A04(r2, r3, iOException, z2);
        }
    }

    public void ASu(C30251c1 r2, C30261c2 r3, C30271c3 r4, int i2) {
        if (A00(r4, i2)) {
            this.A01.A03(r2, r3);
        }
    }
}
