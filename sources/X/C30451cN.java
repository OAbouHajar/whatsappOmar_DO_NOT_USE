package X;

/* renamed from: X.1cN  reason: invalid class name and case insensitive filesystem */
public class C30451cN {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    public C30451cN(C58542tf r5) {
        Integer num = null;
        int i2 = r5.A00;
        this.A00 = (i2 & 1) == 1 ? Integer.valueOf(r5.A01) : null;
        this.A01 = (i2 & 2) == 2 ? Integer.valueOf(r5.A02) : null;
        this.A02 = (i2 & 4) == 4 ? Integer.valueOf(r5.A03) : num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("fullSyncDaysLimit: ");
        sb.append(this.A00);
        sb.append(", fullSyncSizeMbLimit: ");
        sb.append(this.A01);
        sb.append(", storageQuotaMb: ");
        sb.append(this.A02);
        return sb.toString();
    }
}
