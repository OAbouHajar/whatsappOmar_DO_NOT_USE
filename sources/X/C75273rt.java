package X;

/* renamed from: X.3rt  reason: invalid class name and case insensitive filesystem */
public final class C75273rt extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;

    public C75273rt() {
        super(3694, new AnonymousClass00F(1, 10, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMessageContextMenuActions {");
        C16470t7.appendFieldToStringBuilder(A0r, "isAGroup", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isMultiAction", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "isOriginalSender", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "messageContextMenuAction", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "messageContextMenuOption", C13690nt.A0d(this.A04));
        return AnonymousClass000.A0h("}", A0r);
    }
}
