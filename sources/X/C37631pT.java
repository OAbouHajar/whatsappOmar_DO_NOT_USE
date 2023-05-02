package X;

/* renamed from: X.1pT  reason: invalid class name and case insensitive filesystem */
public final class C37631pT extends C16470t7 {
    public Integer A00;

    public C37631pT() {
        super(2518, new AnonymousClass00F(1, 20, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdAppStateKeyRotation {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mdAppStateKeyRotationReason", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}
