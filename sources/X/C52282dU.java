package X;

/* renamed from: X.2dU  reason: invalid class name and case insensitive filesystem */
public class C52282dU extends C30831d2 {
    public String A00;
    public final String A01;

    public C52282dU(C16300so r14, C16440t3 r15, C16490t9 r16, C207811o r17, Integer num, String str, String str2, long j2, long j3) {
        super(r14, r15, r16, r17, num, str, 2, j2, j3);
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; type = ");
        sb.append(this.A01);
        sb.append("; subType = ");
        sb.append(this.A00);
        return sb.toString();
    }
}
