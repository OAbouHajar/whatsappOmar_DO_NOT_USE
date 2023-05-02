package X;

/* renamed from: X.3r3  reason: invalid class name and case insensitive filesystem */
public final class C74753r3 extends C16470t7 {
    public Boolean A00;
    public String A01;

    public C74753r3() {
        super(1846, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStickerPackDelete {");
        C16470t7.appendFieldToStringBuilder(A0r, "stickerPackIsAvatar", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "waAvatarSessionId", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
