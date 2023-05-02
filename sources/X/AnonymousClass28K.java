package X;

/* renamed from: X.28K  reason: invalid class name */
public final class AnonymousClass28K extends C16470t7 {
    public Integer A00;
    public Long A01;

    public AnonymousClass28K() {
        super(2510, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdAppStateDataDeletion {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "syncdDataDeletionReason", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "syncdDataDeletionRetryCount", this.A01);
        sb.append("}");
        return sb.toString();
    }
}
