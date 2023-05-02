package X;

/* renamed from: X.52A  reason: invalid class name */
public class AnonymousClass52A implements C48632Og {
    public final /* synthetic */ C30701co A00;

    public AnonymousClass52A(C30701co r1) {
        this.A00 = r1;
    }

    public void ANs(C48642Oh r5, long j2) {
        long j3;
        C30701co r3 = this.A00;
        r3.A0i.A05(1);
        synchronized (r5) {
            j3 = r5.A06;
        }
        r3.A09(j3);
        r3.A0Z.A0B(j3);
        r3.A0c.A0A(j3, j2);
        C31781f1 r0 = r3.A01;
        if (r0 != null) {
            r0.A0A = j3;
        }
    }

    public void AQ5(int i2) {
        if (i2 == 1) {
            this.A00.A0c.A05();
        } else if (i2 == 2) {
            this.A00.A0c.A08();
        } else if (i2 == 3) {
            this.A00.A0c.A09();
        }
    }

    public void AQ6(C48642Oh r3) {
        if (r3.A00() == 4) {
            C30741cs r1 = this.A00.A0c;
            if (r1.A0E == null) {
                r1.A05();
            }
            if (r1.A0L == null) {
                r1.A09();
            }
        }
    }

    public void ARH(C48642Oh r1) {
    }

    public void AWF() {
        this.A00.A08();
    }
}
