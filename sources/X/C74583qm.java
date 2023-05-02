package X;

/* renamed from: X.3qm  reason: invalid class name and case insensitive filesystem */
public final class C74583qm extends C16470t7 {
    public Integer A00;
    public Integer A01;

    public C74583qm() {
        super(1578, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamBannerEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "bannerOperation", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "bannerType", C13690nt.A0d(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}
