package X;

/* renamed from: X.322  reason: invalid class name */
public final class AnonymousClass322 extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;

    public AnonymousClass322() {
        super(1038, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(24, this.A00);
        r3.AdT(25, this.A01);
        r3.AdT(16, this.A06);
        r3.AdT(22, this.A02);
        r3.AdT(4, this.A07);
        r3.AdT(10, this.A08);
        r3.AdT(3, this.A09);
        r3.AdT(11, this.A0A);
        r3.AdT(18, this.A0B);
        r3.AdT(26, this.A03);
        r3.AdT(14, this.A04);
        r3.AdT(2, this.A0C);
        r3.AdT(5, this.A0D);
        r3.AdT(12, this.A0E);
        r3.AdT(15, this.A0F);
        r3.AdT(13, this.A0G);
        r3.AdT(1, this.A05);
        r3.AdT(23, this.A0H);
        r3.AdT(17, this.A0I);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMediaPicker {");
        C16470t7.appendFieldToStringBuilder(A0r, "audienceSelectorClicked", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "audienceSelectorUpdated", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "chatRecipients", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "isViewOnce", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerChanged", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerCroppedRotated", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerDeleted", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerDrawing", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerFilter", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerHasLocationSticker", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerOrigin", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerSent", this.A0C);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerSentUnchanged", this.A0D);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerStickers", this.A0E);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerT", this.A0F);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaPickerText", this.A0G);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaType", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "photoGalleryDurationT", this.A0H);
        C16470t7.appendFieldToStringBuilder(A0r, "statusRecipients", this.A0I);
        return AnonymousClass000.A0h("}", A0r);
    }
}
