package X;

/* renamed from: X.3rZ  reason: invalid class name and case insensitive filesystem */
public final class C75073rZ extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;

    public C75073rZ() {
        super(3176, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamE2eeSystemMessage {");
        C16470t7.appendFieldToStringBuilder(A0r, "chatCategory", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "e2eeDialogInteraction", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "e2eeSystemMessageGroupSizeBucket", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "e2eeSystemMessageType", C13690nt.A0d(this.A03));
        return AnonymousClass000.A0h("}", A0r);
    }
}
