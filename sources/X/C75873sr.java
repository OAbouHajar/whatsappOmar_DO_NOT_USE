package X;

/* renamed from: X.3sr  reason: invalid class name and case insensitive filesystem */
public final class C75873sr extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public String A0B;

    public C75873sr() {
        super(1342, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(9, this.A0B);
        r3.AdT(12, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(7, this.A05);
        r3.AdT(10, this.A06);
        r3.AdT(5, this.A02);
        r3.AdT(14, this.A07);
        r3.AdT(6, this.A03);
        r3.AdT(3, this.A04);
        r3.AdT(8, this.A08);
        r3.AdT(1, this.A09);
        r3.AdT(2, this.A0A);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamRegistrationComplete {");
        C16470t7.appendFieldToStringBuilder(A0r, "deviceIdentifier", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "registrationAllowNotifications", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "registrationAttemptSkipWithNoVertical", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "registrationContactsPermissionSource", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "registrationGoogleDriveBackupStatus", C13690nt.A0d(this.A06));
        C16470t7.appendFieldToStringBuilder(A0r, "registrationProfilePictureSet", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "registrationProfilePictureSource", C13690nt.A0d(this.A07));
        C16470t7.appendFieldToStringBuilder(A0r, "registrationProfilePictureTapped", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "registrationRetryFetchingBizProfile", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "registrationStoragePermissionSource", C13690nt.A0d(this.A08));
        C16470t7.appendFieldToStringBuilder(A0r, "registrationT", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "registrationTForFillBusinessInfoScreen", this.A0A);
        return AnonymousClass000.A0h("}", A0r);
    }
}
