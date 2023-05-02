package X;

/* renamed from: X.3rg  reason: invalid class name and case insensitive filesystem */
public final class C75143rg extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public String A03;

    public C75143rg() {
        super(2796, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(4, this.A03);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStickerContextualSuggestionDailyCount {");
        C16470t7.appendFieldToStringBuilder(A0r, "numClicked", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "numStickersSent", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "numStickersSuggestionsArray", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "numTriggered", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
