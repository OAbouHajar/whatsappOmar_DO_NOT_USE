package X;

/* renamed from: X.256  reason: invalid class name */
public final class AnonymousClass256 extends C16470t7 {
    public Long A00;

    public AnonymousClass256() {
        super(2508, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdAppStateCompanionsRemoval {");
        C16470t7.appendFieldToStringBuilder(sb, "syncdCompanionsRemovalRetryCount", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
