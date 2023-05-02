package X;

/* renamed from: X.27G  reason: invalid class name */
public final class AnonymousClass27G extends C16470t7 {
    public Boolean A00;
    public Integer A01;

    public AnonymousClass27G() {
        super(3042, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAdvProtoMissing {");
        C16470t7.appendFieldToStringBuilder(sb, "advCompanionIdentityMissing", this.A00);
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "missingProtoType", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}
