package X;

/* renamed from: X.27g  reason: invalid class name and case insensitive filesystem */
public class C451527g {
    public final Integer A00;
    public final Long A01;
    public final Long A02;
    public final boolean A03;

    public C451527g(Integer num, Long l2, Long l3, boolean z2) {
        this.A03 = z2;
        this.A02 = l2;
        this.A01 = l3;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[success=");
        sb.append(this.A03);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        Long l2 = this.A02;
        if (l2 != null) {
            sb2.append(" refresh=");
            sb2.append(l2);
        }
        Long l3 = this.A01;
        if (l3 != null) {
            sb2.append(" backoff=");
            sb2.append(l3);
        }
        Integer num = this.A00;
        if (num != null) {
            sb2.append(" errorCode=");
            sb2.append(num);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
