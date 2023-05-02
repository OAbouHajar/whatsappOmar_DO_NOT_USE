package X;

/* renamed from: X.1Hp  reason: invalid class name and case insensitive filesystem */
public class C24871Hp {
    public final C16300so A00;
    public final C20030zO A01;
    public final AnonymousClass1HU A02;
    public final C24861Ho A03;
    public final C24851Hn A04;
    public final C17020u3 A05;

    public C24871Hp(C16300so r1, C20030zO r2, AnonymousClass1HU r3, C24861Ho r4, C24851Hn r5, C17020u3 r6) {
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }

    public boolean A00() {
        return this.A05.A00("ctwa_logging_v2_migration").getBoolean("ctwa_ads_customer_data_migrated", false);
    }
}
