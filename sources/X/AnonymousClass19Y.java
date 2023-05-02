package X;

/* renamed from: X.19Y  reason: invalid class name */
public class AnonymousClass19Y {
    public final C16040sK A00;
    public final C16260sj A01;

    public AnonymousClass19Y(C16040sK r1, C16260sj r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean A00() {
        C16260sj r1 = this.A01;
        return (r1.A03("android.permission.READ_CONTACTS") == 0 && r1.A03("android.permission.WRITE_CONTACTS") == 0) || this.A00.A0G();
    }
}
