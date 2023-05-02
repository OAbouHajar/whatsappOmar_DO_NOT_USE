package X;

/* renamed from: X.1qt  reason: invalid class name and case insensitive filesystem */
public final class C38501qt extends C16470t7 {
    public Boolean A00;

    public C38501qt() {
        super(1842, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStickerAddToFavorite {");
        C16470t7.appendFieldToStringBuilder(sb, "stickerIsAvatar", this.A00);
        sb.append("}");
        return sb.toString();
    }
}
