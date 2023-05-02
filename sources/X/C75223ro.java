package X;

/* renamed from: X.3ro  reason: invalid class name and case insensitive filesystem */
public final class C75223ro extends C16470t7 {
    public Boolean A00;
    public Long A01;
    public String A02;
    public String A03;
    public String A04;

    public C75223ro() {
        super(3912, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A02);
        r3.AdT(6, this.A03);
        r3.AdT(3, this.A04);
        r3.AdT(4, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamDragAndDropStatus {");
        C16470t7.appendFieldToStringBuilder(A0r, "dragAndDropSuccess", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "dragFailureReason", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "dragMediaTypes", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "dragSessionId", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaCount", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
