package X;

/* renamed from: X.27E  reason: invalid class name */
public final class AnonymousClass27E extends C16470t7 {
    public Boolean A00;

    public AnonymousClass27E() {
        super(3048, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAdvMetadataCreationFailure {");
        C16470t7.appendFieldToStringBuilder(sb, "advMetadataIsMe", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
