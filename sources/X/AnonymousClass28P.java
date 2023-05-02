package X;

/* renamed from: X.28P  reason: invalid class name */
public final class AnonymousClass28P extends C16470t7 {
    public Long A00;

    public AnonymousClass28P() {
        super(3490, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamContactConvertedForDocs {");
        C16470t7.appendFieldToStringBuilder(sb, "convertedContactsCount", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
