package X;

/* renamed from: X.1aw  reason: invalid class name and case insensitive filesystem */
public final class C29631aw extends C16470t7 {
    public Integer A00;
    public String A01;

    public C29631aw() {
        super(2490, new AnonymousClass00F(1, 1, 5), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamQplHealth {");
        C16470t7.appendFieldToStringBuilder(sb, "qplHealthEventData", this.A01);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "qplHealthEventType", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}
