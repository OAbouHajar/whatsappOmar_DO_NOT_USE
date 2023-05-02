package X;

/* renamed from: X.1UX  reason: invalid class name */
public class AnonymousClass1UX {
    public final long A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass1UX(long j2, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = z3;
        this.A04 = z4;
        this.A01 = z2;
        this.A03 = z5;
        this.A00 = j2;
    }

    public static AnonymousClass1UX A00(AnonymousClass1UW r6, long j2) {
        long j3 = j2;
        return r6 != null ? new AnonymousClass1UX(j3, r6.A03, r6.A05, r6.A06, r6.A04) : new AnonymousClass1UX(j3, false, false, false, false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Connectivity{connected=");
        sb.append(this.A01);
        sb.append(", roaming=");
        sb.append(this.A02);
        sb.append(", typeWifi=");
        sb.append(this.A04);
        sb.append(", typeMobile=");
        sb.append(this.A03);
        sb.append(", ntpEventTimeMillis=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
