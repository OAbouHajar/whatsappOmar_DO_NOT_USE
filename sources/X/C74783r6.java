package X;

/* renamed from: X.3r6  reason: invalid class name and case insensitive filesystem */
public final class C74783r6 extends C16470t7 {
    public Boolean A00;
    public Boolean A01;

    public C74783r6() {
        super(2980, new AnonymousClass00F(1, 1, 5), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamXplatformMigrationDataReady {");
        C16470t7.appendFieldToStringBuilder(A0r, "completedMigration", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "completedRegistration", this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}
