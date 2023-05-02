package X;

/* renamed from: X.3rA  reason: invalid class name and case insensitive filesystem */
public final class C74823rA extends C16470t7 {
    public Boolean A00;
    public Long A01;
    public String A02;

    public C74823rA() {
        super(2808, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A02);
        r3.AdT(3, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamChatFolderOpen {");
        C16470t7.appendFieldToStringBuilder(A0r, "activityIndicatorCount", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "folderType", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "hasImportantMessages", this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
