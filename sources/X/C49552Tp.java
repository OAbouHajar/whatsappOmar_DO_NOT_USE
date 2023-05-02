package X;

/* renamed from: X.2Tp  reason: invalid class name and case insensitive filesystem */
public final class C49552Tp extends C16470t7 {
    public Long A00;
    public String A01;

    public C49552Tp() {
        super(2578, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidDatabaseRollbackEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "migrationName", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "rollbackT", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
