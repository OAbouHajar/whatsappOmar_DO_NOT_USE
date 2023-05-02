package X;

/* renamed from: X.3qE  reason: invalid class name and case insensitive filesystem */
public final class C74283qE extends C16470t7 {
    public Integer A00;

    public C74283qE() {
        super(3850, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamBugReportSession {");
        C16470t7.appendFieldToStringBuilder(A0r, "bugReportFlowAction", C13690nt.A0d(this.A00));
        return AnonymousClass000.A0h("}", A0r);
    }
}
