package X;

import java.util.List;

/* renamed from: X.0Ds  reason: invalid class name */
public class AnonymousClass0Ds extends C07250ar {
    public AnonymousClass0Ds(AnonymousClass0SN r2) {
        super(r2);
        r2.A0c.A0D();
        r2.A0d.A0D();
        this.A01 = ((AnonymousClass0Dl) r2).A01;
    }

    public void A0B() {
        C07240aq r0;
        AnonymousClass0SN r6 = this.A03;
        AnonymousClass0Dl r02 = (AnonymousClass0Dl) r6;
        int i2 = r02.A02;
        int i3 = r02.A03;
        int i4 = r02.A01;
        C07240aq r2 = this.A05;
        if (i4 == 1) {
            if (i2 != -1) {
                r2.A08.add(r6.A0Z.A0c.A05);
                C07240aq.A00(this.A03.A0Z.A0c.A05, r2);
            } else if (i3 != -1) {
                r2.A08.add(r6.A0Z.A0c.A04);
                C07240aq.A00(this.A03.A0Z.A0c.A04, r2);
                i2 = -i3;
            } else {
                r2.A09 = true;
                r2.A08.add(r6.A0Z.A0c.A04);
                C07240aq.A00(this.A03.A0Z.A0c.A04, r2);
                C07240aq r03 = this.A03.A0c.A05;
                List list = r2.A07;
                C07250ar.A08(r03, r2, list);
                r0 = this.A03.A0c.A04;
                list.add(r0);
            }
            r2.A00 = i2;
            C07240aq r032 = this.A03.A0c.A05;
            List list2 = r2.A07;
            C07250ar.A08(r032, r2, list2);
            r0 = this.A03.A0c.A04;
            list2.add(r0);
        } else {
            if (i2 != -1) {
                r2.A08.add(r6.A0Z.A0d.A05);
                C07240aq.A00(this.A03.A0Z.A0d.A05, r2);
            } else if (i3 != -1) {
                r2.A08.add(r6.A0Z.A0d.A04);
                C07240aq.A00(this.A03.A0Z.A0d.A04, r2);
                i2 = -i3;
            } else {
                r2.A09 = true;
                r2.A08.add(r6.A0Z.A0d.A04);
                C07240aq.A00(this.A03.A0Z.A0d.A04, r2);
                C07240aq r04 = this.A03.A0d.A05;
                List list3 = r2.A07;
                C07250ar.A08(r04, r2, list3);
                r0 = this.A03.A0d.A04;
                list3.add(r0);
            }
            r2.A00 = i2;
            C07240aq r042 = this.A03.A0d.A05;
            List list32 = r2.A07;
            C07250ar.A08(r042, r2, list32);
            r0 = this.A03.A0d.A04;
            list32.add(r0);
        }
        r0.A08.add(r2);
    }

    public void A0C() {
        AnonymousClass0SN r3 = this.A03;
        int i2 = ((AnonymousClass0Dl) r3).A01;
        int i3 = this.A05.A02;
        if (i2 == 1) {
            r3.A0P = i3;
        } else {
            r3.A0Q = i3;
        }
    }

    public void A0D() {
        this.A05.A01();
    }

    public boolean A0G() {
        return false;
    }

    public void AhI(C12360kG r6) {
        C07240aq r4 = this.A05;
        if (r4.A0A && !r4.A0B) {
            r4.A02((int) ((((float) ((C07240aq) r4.A08.get(0)).A02) * ((AnonymousClass0Dl) this.A03).A00) + 0.5f));
        }
    }
}
