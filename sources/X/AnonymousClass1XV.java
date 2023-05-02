package X;

/* renamed from: X.1XV  reason: invalid class name */
public final class AnonymousClass1XV extends C16470t7 {
    public Long A00;

    public AnonymousClass1XV() {
        super(2514, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdAppStateLastCompanionDeregistration {");
        C16470t7.appendFieldToStringBuilder(sb, "timeBetweenFirstCompanionRegistrationAndLastCompanionDeregistration", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
