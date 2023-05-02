package X;

import java.util.List;

/* renamed from: X.0Dt  reason: invalid class name */
public class AnonymousClass0Dt extends C07250ar {
    public AnonymousClass0Dt(AnonymousClass0SN r1) {
        super(r1);
    }

    public void A0B() {
        C07240aq r0;
        AnonymousClass0SN r6 = this.A03;
        if (r6 instanceof AnonymousClass0Dn) {
            C07240aq r2 = this.A05;
            r2.A09 = true;
            AnonymousClass0Dn r62 = (AnonymousClass0Dn) r6;
            int i2 = r62.A00;
            boolean z2 = r62.A02;
            int i3 = 0;
            if (i2 == 0) {
                r2.A04 = AnonymousClass0KE.LEFT;
                while (i3 < r62.A00) {
                    AnonymousClass0SN r1 = r62.A01[i3];
                    if (z2 || r1.A0N != 8) {
                        C07240aq r12 = r1.A0c.A05;
                        C07250ar.A08(r2, r12, r12.A07);
                    }
                    i3++;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    r2.A04 = AnonymousClass0KE.TOP;
                    while (i3 < r62.A00) {
                        AnonymousClass0SN r13 = r62.A01[i3];
                        if (z2 || r13.A0N != 8) {
                            C07240aq r14 = r13.A0d.A05;
                            C07250ar.A08(r2, r14, r14.A07);
                        }
                        i3++;
                    }
                } else if (i2 == 3) {
                    r2.A04 = AnonymousClass0KE.BOTTOM;
                    while (i3 < r62.A00) {
                        AnonymousClass0SN r15 = r62.A01[i3];
                        if (z2 || r15.A0N != 8) {
                            C07240aq r16 = r15.A0d.A04;
                            C07250ar.A08(r2, r16, r16.A07);
                        }
                        i3++;
                    }
                } else {
                    return;
                }
                C07240aq r02 = this.A03.A0d.A05;
                List list = r2.A07;
                C07250ar.A08(r02, r2, list);
                r0 = this.A03.A0d.A04;
                list.add(r0);
                r0.A08.add(r2);
            } else {
                r2.A04 = AnonymousClass0KE.RIGHT;
                while (i3 < r62.A00) {
                    AnonymousClass0SN r17 = r62.A01[i3];
                    if (z2 || r17.A0N != 8) {
                        C07240aq r18 = r17.A0c.A04;
                        C07250ar.A08(r2, r18, r18.A07);
                    }
                    i3++;
                }
            }
            C07240aq r03 = this.A03.A0c.A05;
            List list2 = r2.A07;
            C07250ar.A08(r03, r2, list2);
            r0 = this.A03.A0c.A04;
            list2.add(r0);
            r0.A08.add(r2);
        }
    }

    public void A0C() {
        AnonymousClass0SN r2 = this.A03;
        if (r2 instanceof AnonymousClass0Dn) {
            int i2 = ((AnonymousClass0Dn) r2).A00;
            if (i2 == 0 || i2 == 1) {
                r2.A0P = this.A05.A02;
            } else {
                r2.A0Q = this.A05.A02;
            }
        }
    }

    public void A0D() {
        this.A07 = null;
        this.A05.A01();
    }

    public boolean A0G() {
        return false;
    }

    public void AhI(C12360kG r9) {
        AnonymousClass0Dn r7 = (AnonymousClass0Dn) this.A03;
        int i2 = r7.A00;
        C07240aq r5 = this.A05;
        int i3 = 0;
        int i4 = -1;
        for (C07240aq r0 : r5.A08) {
            int i5 = r0.A02;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            r5.A02(i4 + r7.A01);
        } else {
            r5.A02(i3 + r7.A01);
        }
    }
}
