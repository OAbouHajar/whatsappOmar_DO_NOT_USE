package X;

/* renamed from: X.3qj  reason: invalid class name and case insensitive filesystem */
public final class C74553qj extends C16470t7 {
    public Long A00;
    public String A01;

    public C74553qj() {
        super(2492, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAndroidDatabaseMigrationLlks {");
        C16470t7.appendFieldToStringBuilder(A0r, "llksLatency", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "llksState", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
