package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4p2  reason: invalid class name and case insensitive filesystem */
public final class C96874p2 implements C109595St {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List A04;
    public final C32481gS[] A05;

    public C96874p2(List list) {
        this.A04 = list;
        this.A05 = new C32481gS[list.size()];
    }

    public void A6b(C90504eH r7) {
        boolean z2 = this.A03;
        if (z2) {
            int i2 = this.A00;
            if (i2 == 2) {
                if (C90504eH.A00(r7) != 0) {
                    if (r7.A0C() != 32) {
                        this.A03 = false;
                        z2 = false;
                    }
                    i2 = 1;
                    this.A00 = 1;
                    if (!z2) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (i2 == 1) {
                if (C90504eH.A00(r7) != 0) {
                    if (r7.A0C() != 0) {
                        this.A03 = false;
                        z2 = false;
                    }
                    this.A00 = 0;
                    if (!z2) {
                        return;
                    }
                } else {
                    return;
                }
            }
            int i3 = r7.A01;
            int i4 = r7.A00 - i3;
            for (C32481gS Acw : this.A05) {
                r7.A0S(i3);
                Acw.Acw(r7, i4);
            }
            this.A01 += i4;
        }
    }

    public void A7e(C15060qG r7, AnonymousClass4WV r8) {
        int i2 = 0;
        while (true) {
            C32481gS[] r4 = this.A05;
            if (i2 < r4.length) {
                AnonymousClass4GE r3 = (AnonymousClass4GE) this.A04.get(i2);
                r8.A03();
                C32481gS Ah1 = r7.Ah1(r8.A01(), 3);
                C32471gR A0N = AnonymousClass3K4.A0N();
                A0N.A0O = r8.A02();
                A0N.A0R = "application/dvbsubs";
                A0N.A0S = Collections.singletonList(r3.A01);
                A0N.A0Q = r3.A00;
                AnonymousClass3K3.A19(A0N, Ah1);
                r4[i2] = Ah1;
                i2++;
            } else {
                return;
            }
        }
    }

    public void Aa7() {
        if (this.A03) {
            for (C32481gS Ad0 : this.A05) {
                Ad0.Ad0((C86824Uh) null, 1, this.A01, 0, this.A02);
            }
            this.A03 = false;
        }
    }

    public void Aa8(long j2, int i2) {
        if ((i2 & 4) != 0) {
            this.A03 = true;
            this.A02 = j2;
            this.A01 = 0;
            this.A00 = 2;
        }
    }

    public void AdB() {
        this.A03 = false;
    }
}
