package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4X6  reason: invalid class name */
public class AnonymousClass4X6 {
    public static int A0C;
    public double A00;
    public double A01;
    public double A02 = 0.0d;
    public AnonymousClass4Zg A03;
    public CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public boolean A05;
    public boolean A06 = true;
    public final C83264Fz A07 = new C83264Fz();
    public final C83264Fz A08 = new C83264Fz();
    public final C83264Fz A09 = new C83264Fz();
    public final C88974bO A0A;
    public final String A0B;

    public AnonymousClass4X6(C88974bO r4) {
        this.A0A = r4;
        StringBuilder A0r = AnonymousClass000.A0r("spring:");
        int i2 = A0C;
        A0C = i2 + 1;
        this.A0B = AnonymousClass000.A0l(A0r, i2);
        this.A03 = AnonymousClass4Zg.A02;
    }

    public double A00() {
        return this.A07.A00;
    }

    public void A01(double d2) {
        this.A01 = d2;
        C83264Fz r3 = this.A07;
        r3.A00 = d2;
        this.A0A.A02(this.A0B);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((AnonymousClass5R7) it.next()).AXO(this);
        }
        double d3 = r3.A00;
        this.A00 = d3;
        this.A09.A00 = d3;
        r3.A01 = 0.0d;
    }

    public void A02(double d2) {
        if (this.A00 != d2 || !A04()) {
            this.A01 = this.A07.A00;
            this.A00 = d2;
            this.A0A.A02(this.A0B);
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void A03(AnonymousClass5R7 r2) {
        if (r2 != null) {
            this.A04.add(r2);
            return;
        }
        throw AnonymousClass000.A0T("newListener is required");
    }

    public boolean A04() {
        C83264Fz r6 = this.A07;
        if (Math.abs(r6.A01) <= 0.005d) {
            return Math.abs(this.A00 - r6.A00) <= 0.005d || this.A03.A01 == 0.0d;
        }
        return false;
    }
}
