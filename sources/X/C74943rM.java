package X;

/* renamed from: X.3rM  reason: invalid class name and case insensitive filesystem */
public final class C74943rM extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;

    public C74943rM() {
        super(2794, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStickerSendFromContextualSuggestion {");
        C16470t7.appendFieldToStringBuilder(A0r, "stickerPickerTab", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "stickerPosition", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "suggestedStickersCount", this.A02);
        return AnonymousClass000.A0h("}", A0r);
    }
}
