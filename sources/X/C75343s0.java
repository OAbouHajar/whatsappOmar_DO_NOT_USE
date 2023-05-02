package X;

/* renamed from: X.3s0  reason: invalid class name and case insensitive filesystem */
public final class C75343s0 extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public String A04;

    public C75343s0() {
        super(1844, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A00);
        r3.AdT(1, this.A03);
        r3.AdT(3, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(4, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStickerPackDownload {");
        C16470t7.appendFieldToStringBuilder(A0r, "stickerPackDownloadFailed", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerPackDownloadOrigin", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "stickerPackIsAvatar", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerPackIsFirstParty", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "waAvatarSessionId", this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
