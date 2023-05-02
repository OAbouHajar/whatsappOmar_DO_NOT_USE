package X;

/* renamed from: X.1wo  reason: invalid class name and case insensitive filesystem */
public final class C41881wo extends C16470t7 {
    public Integer A00;

    public C41881wo() {
        super(3154, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamGatingReviewInteract {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "gatingReviewActionType", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}
