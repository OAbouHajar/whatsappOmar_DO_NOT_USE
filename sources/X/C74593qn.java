package X;

/* renamed from: X.3qn  reason: invalid class name and case insensitive filesystem */
public final class C74593qn extends C16470t7 {
    public String A00;
    public String A01;

    public C74593qn() {
        super(3452, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamCallCriticalEvents {");
        C16470t7.appendFieldToStringBuilder(A0r, "criticalEventName", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "debugInfo", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
