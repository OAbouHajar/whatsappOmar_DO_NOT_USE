package X;

/* renamed from: X.3rh  reason: invalid class name and case insensitive filesystem */
public final class C75153rh extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;

    public C75153rh() {
        super(2588, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
        r3.AdT(4, this.A02);
        r3.AdT(3, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamThirdPartyPackImport {");
        C16470t7.appendFieldToStringBuilder(A0r, "animated", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "importSuccess", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerCount", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "totalSizeIn10Kb", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
