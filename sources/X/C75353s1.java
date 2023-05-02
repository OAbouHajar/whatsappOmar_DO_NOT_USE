package X;

/* renamed from: X.3s1  reason: invalid class name and case insensitive filesystem */
public final class C75353s1 extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;

    public C75353s1() {
        super(3246, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A04);
        r3.AdT(8, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamUserActionsOnBusinessProfile {");
        C16470t7.appendFieldToStringBuilder(A0r, "businessProfileDirectorySessionId", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "businessProfileViewEntryPoint", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "businessProfileViewEventType", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "businessRootCategory", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "isAddedInContacts", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
