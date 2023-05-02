package X;

/* renamed from: X.3sO  reason: invalid class name and case insensitive filesystem */
public final class C75583sO extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public C75583sO() {
        super(1368, new AnonymousClass00F(1, 1, 5), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A04);
        r3.AdT(6, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A05);
        r3.AdT(9, this.A06);
        r3.AdT(7, this.A02);
        r3.AdT(8, this.A07);
        r3.AdT(3, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidEmojiDictionaryFetch {");
        C16470t7.appendFieldToStringBuilder(A0r, "currentLanguages", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "doNetworkFetch", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isFirstAttempt", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "requestedLanguages", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "result", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "resultHttpCode", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "resultLanguages", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "timeSinceLastRequestMsT", this.A03);
        return AnonymousClass000.A0h("}", A0r);
    }
}
