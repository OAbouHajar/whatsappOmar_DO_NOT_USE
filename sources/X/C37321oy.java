package X;

/* renamed from: X.1oy  reason: invalid class name and case insensitive filesystem */
public final class C37321oy extends C16470t7 {
    public Boolean A00;
    public Long A01;

    public C37321oy() {
        super(2506, new AnonymousClass00F(1, 20, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdAppStateRegistrationDirtyState {");
        C16470t7.appendFieldToStringBuilder(sb, "dataDeletionResult", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "timeBetweenDataDeletionAndFirstCompanionRegistration", this.A01);
        sb.append("}");
        return sb.toString();
    }
}
