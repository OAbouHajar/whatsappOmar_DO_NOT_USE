package X;

/* renamed from: X.2da  reason: invalid class name and case insensitive filesystem */
public final class C52322da extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Double A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public String A0H;

    public C52322da() {
        super(3664, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A07);
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A08);
        r3.AdT(4, this.A0E);
        r3.AdT(5, this.A0H);
        r3.AdT(18, this.A09);
        r3.AdT(6, this.A0A);
        r3.AdT(7, this.A01);
        r3.AdT(16, this.A0F);
        r3.AdT(8, this.A02);
        r3.AdT(17, this.A0B);
        r3.AdT(9, this.A03);
        r3.AdT(10, this.A04);
        r3.AdT(11, this.A0C);
        r3.AdT(12, this.A0D);
        r3.AdT(13, this.A06);
        r3.AdT(14, this.A05);
        r3.AdT(15, this.A0G);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamCameraCaptureFlow {");
        Integer num = this.A07;
        C16470t7.appendFieldToStringBuilder(sb, "cameraCaptureDirection", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "cameraCaptureUserCancelled", this.A00);
        Integer num2 = this.A08;
        C16470t7.appendFieldToStringBuilder(sb, "cameraEntryPoint", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "cameraErrorCode", this.A0E);
        C16470t7.appendFieldToStringBuilder(sb, "cameraErrorDomain", this.A0H);
        Integer num3 = this.A09;
        C16470t7.appendFieldToStringBuilder(sb, "cameraEventName", num3 == null ? null : num3.toString());
        Integer num4 = this.A0A;
        C16470t7.appendFieldToStringBuilder(sb, "cameraFlashMode", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "cameraGalleryBrowserClosed", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "cameraGalleryBrowserMediaItemCount", this.A0F);
        C16470t7.appendFieldToStringBuilder(sb, "cameraGalleryBrowserMediaUsed", this.A02);
        Integer num5 = this.A0B;
        C16470t7.appendFieldToStringBuilder(sb, "cameraGalleryBrowserSelectionType", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "cameraGalleryStripMediaUsed", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "cameraLowLight", this.A04);
        Integer num6 = this.A0C;
        C16470t7.appendFieldToStringBuilder(sb, "cameraMediaType", num6 == null ? null : num6.toString());
        Integer num7 = this.A0D;
        C16470t7.appendFieldToStringBuilder(sb, "cameraOrientation", num7 == null ? null : num7.toString());
        C16470t7.appendFieldToStringBuilder(sb, "cameraVideoCaptureDuration", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "cameraZoomUsed", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "mediaFlowSessionId", this.A0G);
        sb.append("}");
        return sb.toString();
    }
}
