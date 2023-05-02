package X;

/* renamed from: X.3r7  reason: invalid class name and case insensitive filesystem */
public final class C74793r7 extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;

    public C74793r7() {
        super(3160, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidContactListStartNewChat {");
        C16470t7.appendFieldToStringBuilder(A0r, "androidContactListStartNewChatFrequentlyContacted", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "androidContactListStartNewChatSearch", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "androidContactListStartNewChatType", C13690nt.A0d(this.A02));
        return AnonymousClass000.A0h("}", A0r);
    }
}
