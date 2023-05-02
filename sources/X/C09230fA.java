package X;

/* renamed from: X.0fA  reason: invalid class name and case insensitive filesystem */
public class C09230fA implements Runnable {
    public final /* synthetic */ C02220Al A00;

    public C09230fA(C02220Al r1) {
        this.A00 = r1;
    }

    public void run() {
        C02220Al r1 = this.A00;
        r1.A01(true);
        r1.invalidateSelf();
    }
}
