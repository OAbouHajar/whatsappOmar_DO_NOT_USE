package X;

/* renamed from: X.1W6  reason: invalid class name */
public final class AnonymousClass1W6 extends C16470t7 {
    public Long A00;

    public AnonymousClass1W6() {
        super(2602, new AnonymousClass00F(1, 20, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdAppStateOfflineNotifications {");
        C16470t7.appendFieldToStringBuilder(sb, "redundantCount", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
