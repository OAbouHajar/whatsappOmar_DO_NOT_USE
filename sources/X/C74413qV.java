package X;

/* renamed from: X.3qV  reason: invalid class name and case insensitive filesystem */
public final class C74413qV extends C16470t7 {
    public Long A00;

    public C74413qV() {
        super(2522, new AnonymousClass00F(1, 20, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamMdAppStateMessageRange {");
        C16470t7.appendFieldToStringBuilder(A0r, "additionalMessagesCount", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
