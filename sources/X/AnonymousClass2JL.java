package X;

/* renamed from: X.2JL  reason: invalid class name */
public final class AnonymousClass2JL extends C16470t7 {
    public Long A00;

    public AnonymousClass2JL() {
        super(3036, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAdvStoredTimestampExpired {");
        C16470t7.appendFieldToStringBuilder(sb, "advExpireTimeInHours", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
