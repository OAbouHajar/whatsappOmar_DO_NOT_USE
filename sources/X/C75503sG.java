package X;

/* renamed from: X.3sG  reason: invalid class name and case insensitive filesystem */
public final class C75503sG extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;

    public C75503sG() {
        super(3762, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A05);
        r3.AdT(2, this.A03);
        r3.AdT(3, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A02);
        r3.AdT(7, this.A04);
        r3.AdT(6, this.A06);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamBusinessTemplateMessageIncomingStats {");
        C16470t7.appendFieldToStringBuilder(A0r, "businessPhoneNumber", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "chatsFolderType", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "isKeepChatsArchivedEnabled", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isMuted", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "isNotificationEnabled", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "qbmFlag", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "templateId", this.A06);
        return AnonymousClass000.A0h("}", A0r);
    }
}
