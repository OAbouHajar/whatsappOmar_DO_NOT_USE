package X;

/* renamed from: X.3rd  reason: invalid class name and case insensitive filesystem */
public final class C75113rd extends C16470t7 {
    public Boolean A00;
    public Double A01;
    public Integer A02;
    public Long A03;

    public C75113rd() {
        super(468, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(9, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(1, this.A02);
        r3.AdT(3, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamProfilePicUpload {");
        C16470t7.appendFieldToStringBuilder(A0r, "profilePicIsAvatar", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "profilePicSize", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "profilePicUploadResult", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "profilePicUploadT", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
