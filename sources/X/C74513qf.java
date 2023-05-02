package X;

/* renamed from: X.3qf  reason: invalid class name and case insensitive filesystem */
public final class C74513qf extends C16470t7 {
    public Long A00;

    public C74513qf() {
        super(3004, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamTestAnonymousIdLess {");
        C16470t7.appendFieldToStringBuilder(A0r, "psTimeSinceLastEventInMin", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
