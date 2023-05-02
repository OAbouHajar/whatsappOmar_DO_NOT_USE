package X;

/* renamed from: X.2em  reason: invalid class name and case insensitive filesystem */
public class C52982em extends C30831d2 {
    public long A00;
    public long A01;
    public boolean A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public C52982em(C16300so r14, C16440t3 r15, C16490t9 r16, C207811o r17, Integer num, String str, String str2, String str3, int i2, long j2, long j3) {
        super(r14, r15, r16, r17, num, str, 1, j2, j3);
        this.A05 = str2;
        this.A03 = i2;
        this.A04 = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; type = ");
        sb.append(this.A05);
        sb.append("; messageType = ");
        sb.append(this.A03);
        sb.append("; retryVersion = ");
        sb.append(this.A04);
        sb.append("; hasOrphaned = ");
        sb.append(this.A02);
        sb.append("; totalCount = ");
        sb.append(this.A01);
        sb.append("; processedCount = ");
        sb.append(this.A00);
        return sb.toString();
    }
}
