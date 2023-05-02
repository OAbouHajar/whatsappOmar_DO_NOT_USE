package X;

/* renamed from: X.1d3  reason: invalid class name and case insensitive filesystem */
public class C30841d3 extends C30831d2 {
    public int A00 = 1;
    public long A01;
    public boolean A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C30841d3(C16300so r15, C16440t3 r16, C16490t9 r17, C207811o r18, Integer num, String str, int i2, long j2, long j3, boolean z2, boolean z3, boolean z4) {
        super(r15, r16, r17, r18, num, str, 0, j2, j3);
        this.A03 = i2;
        this.A05 = z4;
        this.A04 = z2;
        this.A06 = z3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; messageType = ");
        sb.append(this.A03);
        sb.append("; hasSenderKeyDistributionMessage = ");
        sb.append(this.A05);
        sb.append("; ephemeral = ");
        sb.append(this.A04);
        sb.append("; revoke = ");
        sb.append(this.A06);
        sb.append("; decryptionSuccess = ");
        sb.append(this.A02);
        sb.append("; mediaType = ");
        sb.append(this.A00);
        sb.append("; decryptQueueSize = ");
        sb.append(this.A01);
        return sb.toString();
    }
}
