package X;

/* renamed from: X.3qi  reason: invalid class name and case insensitive filesystem */
public final class C74543qi extends C16470t7 {
    public Integer A00;

    public C74543qi() {
        super(2908, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, (Object) null);
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamWaShopsManagement {");
        String str = null;
        C16470t7.appendFieldToStringBuilder(A0r, "isShopsProductPreviewVisible", (Object) null);
        Integer num = this.A00;
        if (num != null) {
            str = num.toString();
        }
        C16470t7.appendFieldToStringBuilder(A0r, "shopsManagementAction", str);
        return AnonymousClass000.A0h("}", A0r);
    }
}
