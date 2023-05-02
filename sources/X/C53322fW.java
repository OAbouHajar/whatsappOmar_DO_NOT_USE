package X;

/* renamed from: X.2fW  reason: invalid class name and case insensitive filesystem */
public class C53322fW {
    public final int A00;
    public final C53302fU A01;
    public final C53292fT A02;

    public C53322fW(C53302fU r2, C53292fT r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = 6;
    }

    public C53322fW(C53302fU r1, C53292fT r2, int i2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i2;
    }

    public int A00(long j2) {
        C53302fU r6 = this.A01;
        if (r6 != null) {
            int i2 = r6.A03;
            if (i2 == 2 || i2 == 1) {
                return (r6.A06 > j2 || j2 >= r6.A04) ? 0 : 4;
            }
            C53292fT r0 = this.A02;
            if (r0 == null || ((long) r0.A01) != r6.A05) {
                return (r6.A06 > j2 || j2 >= r6.A04) ? 3 : 1;
            }
            return 2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncentiveResult{offerInfo=");
        sb.append(this.A01);
        sb.append(", accountIncentiveEligibility=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
