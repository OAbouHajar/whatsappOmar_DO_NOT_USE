package X;

/* renamed from: X.3sN  reason: invalid class name and case insensitive filesystem */
public final class C75573sN extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public C75573sN() {
        super(2350, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(6, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(3, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(4, this.A05);
        r3.AdT(1, this.A06);
        r3.AdT(7, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStorageManagement {");
        C16470t7.appendFieldToStringBuilder(A0r, "storageManagementDeletedNumFiles", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "storageManagementDeletedSize", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "storageManagementEntryPoint", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "storageManagementEventType", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "storageManagementOverallSize", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "storageManagementSessionId", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "storageManagementVersion", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
