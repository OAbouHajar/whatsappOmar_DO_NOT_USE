package X;

/* renamed from: X.1k7  reason: invalid class name and case insensitive filesystem */
public final class C34351k7 extends C16470t7 {
    public Boolean A00;

    public C34351k7() {
        super(2788, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamArchiveSettings {");
        C16470t7.appendFieldToStringBuilder(sb, "keepChatsArchived", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
