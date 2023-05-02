package X;

/* renamed from: X.3ry  reason: invalid class name and case insensitive filesystem */
public final class C75323ry extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;

    public C75323ry() {
        super(3628, new AnonymousClass00F(1, 20, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(6, this.A01);
        r3.AdT(2, this.A03);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamSnackbarDeleteUndo {");
        C16470t7.appendFieldToStringBuilder(A0r, "isAGroup", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaType", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "messagesUndeleted", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "snackbarActionType", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "threadId", this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
