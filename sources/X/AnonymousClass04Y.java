package X;

/* renamed from: X.04Y  reason: invalid class name */
public class AnonymousClass04Y extends C005102f {
    public double childSystemTimeS;
    public double childUserTimeS;
    public double systemTimeS;
    public double userTimeS;

    public /* bridge */ /* synthetic */ C005102f A01(C005102f r1) {
        A03((AnonymousClass04Y) r1);
        return this;
    }

    public /* bridge */ /* synthetic */ C005102f A02(C005102f r5, C005102f r6) {
        AnonymousClass04Y r52 = (AnonymousClass04Y) r5;
        AnonymousClass04Y r62 = (AnonymousClass04Y) r6;
        if (r62 == null) {
            r62 = new AnonymousClass04Y();
        }
        if (r52 == null) {
            r62.A03(this);
            return r62;
        }
        r62.systemTimeS = this.systemTimeS - r52.systemTimeS;
        r62.userTimeS = this.userTimeS - r52.userTimeS;
        r62.childSystemTimeS = this.childSystemTimeS - r52.childSystemTimeS;
        r62.childUserTimeS = this.childUserTimeS - r52.childUserTimeS;
        return r62;
    }

    public void A03(AnonymousClass04Y r3) {
        this.userTimeS = r3.userTimeS;
        this.systemTimeS = r3.systemTimeS;
        this.childUserTimeS = r3.childUserTimeS;
        this.childSystemTimeS = r3.childSystemTimeS;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass04Y r6 = (AnonymousClass04Y) obj;
            if (!(Double.compare(r6.systemTimeS, this.systemTimeS) == 0 && Double.compare(r6.userTimeS, this.userTimeS) == 0 && Double.compare(r6.childSystemTimeS, this.childSystemTimeS) == 0 && Double.compare(r6.childUserTimeS, this.childUserTimeS) == 0)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.systemTimeS);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.userTimeS);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.childSystemTimeS);
        int i4 = (i3 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.childUserTimeS);
        return (i4 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CpuMetrics{userTimeS=");
        sb.append(this.userTimeS);
        sb.append(", systemTimeS=");
        sb.append(this.systemTimeS);
        sb.append(", childUserTimeS=");
        sb.append(this.childUserTimeS);
        sb.append(", childSystemTimeS=");
        sb.append(this.childSystemTimeS);
        sb.append('}');
        return sb.toString();
    }
}
