package X;

/* renamed from: X.66n  reason: invalid class name and case insensitive filesystem */
public class C1217066n implements Runnable {
    public final /* synthetic */ C118595uw A00;
    public final /* synthetic */ C1218367a A01;
    public final /* synthetic */ Exception A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ boolean A04;

    public C1217066n(C118595uw r1, C1218367a r2, Exception exc, Object obj, boolean z2) {
        this.A01 = r2;
        this.A04 = z2;
        this.A00 = r1;
        this.A03 = obj;
        this.A02 = exc;
    }

    public void run() {
        if (this.A04) {
            this.A00.A03(this.A03);
            return;
        }
        this.A00.A02(this.A02);
    }
}
