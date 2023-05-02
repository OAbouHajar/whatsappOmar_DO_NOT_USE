package X;

/* renamed from: X.27V  reason: invalid class name */
public final class AnonymousClass27V extends C16470t7 {
    public Integer A00;

    public AnonymousClass27V() {
        super(3044, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAdvPrimaryIdentityMissing {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "primaryIdentityMissingProtoType", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}
