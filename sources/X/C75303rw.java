package X;

/* renamed from: X.3rw  reason: invalid class name and case insensitive filesystem */
public final class C75303rw extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C75303rw() {
        super(3522, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A03);
        r3.AdT(3, this.A04);
        r3.AdT(4, this.A00);
        r3.AdT(5, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamPrivacyHighlightDaily {");
        C16470t7.appendFieldToStringBuilder(A0r, "dialogAppearCount", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "dialogSelectCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "narrativeAppearCount", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "privacyHighlightCategory", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "privacyHighlightSurface", C13690nt.A0d(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}
