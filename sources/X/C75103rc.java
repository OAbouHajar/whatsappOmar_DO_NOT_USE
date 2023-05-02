package X;

/* renamed from: X.3rc  reason: invalid class name and case insensitive filesystem */
public final class C75103rc extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Integer A03;

    public C75103rc() {
        super(1734, new AnonymousClass00F(1, 1, 5), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A02);
        r3.AdT(1, this.A03);
        r3.AdT(5, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMessageMediaDownload {");
        C16470t7.appendFieldToStringBuilder(A0r, "mediaSize", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "messageMediaType", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "stickerIsAvatar", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerIsFirstParty", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
