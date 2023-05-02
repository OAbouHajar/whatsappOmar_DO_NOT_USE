package X;

/* renamed from: X.27X  reason: invalid class name */
public final class AnonymousClass27X extends C16470t7 {
    public Long A00;
    public Long A01;

    public AnonymousClass27X() {
        super(3030, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAdvTimestampMismatch {");
        C16470t7.appendFieldToStringBuilder(sb, "advProtobufTimestampInHours", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "advStanzaTimestampInHours", this.A01);
        sb.append("}");
        return sb.toString();
    }
}
