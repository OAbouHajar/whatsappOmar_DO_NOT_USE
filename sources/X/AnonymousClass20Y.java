package X;

/* renamed from: X.20Y  reason: invalid class name */
public final class AnonymousClass20Y extends C16470t7 {
    public Boolean A00;

    public AnonymousClass20Y() {
        super(3722, new AnonymousClass00F(1, 20, 200), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamDownloadableFrameworkMigration {");
        C16470t7.appendFieldToStringBuilder(sb, "downloadableFrameworkMigrated", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
