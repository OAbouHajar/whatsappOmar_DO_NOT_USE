package X;

/* renamed from: X.3rO  reason: invalid class name and case insensitive filesystem */
public final class C74963rO extends C16470t7 {
    public Boolean A00;
    public Long A01;
    public String A02;

    public C74963rO() {
        super(2956, AnonymousClass3K3.A0d(), 2, 42196056);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A02);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamTestAnonymousWeeklyId {");
        C16470t7.appendFieldToStringBuilder(A0r, "psTestBooleanField", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "psTestStringField", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "psTimeSinceLastEventInMin", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
