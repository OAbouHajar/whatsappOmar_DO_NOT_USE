package X;

/* renamed from: X.1Nv  reason: invalid class name and case insensitive filesystem */
public class C26471Nv implements C23541Cj {
    public final AnonymousClass15R A00;
    public final C14710pd A01;
    public final C16490t9 A02;

    public C26471Nv(AnonymousClass15R r1, C14710pd r2, C16490t9 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void APJ() {
        if (this.A01.A0E(C16620tM.A02, 1352)) {
            AnonymousClass15R r5 = this.A00;
            long A002 = r5.A00("kic_notifications");
            long A003 = r5.A00("kic_group_notifications");
            if (A002 + A003 > 0) {
                C75083ra r2 = new C75083ra();
                r2.A03 = Long.valueOf(A002);
                r2.A02 = Long.valueOf(r5.A00("kic_notification_taps"));
                r2.A01 = Long.valueOf(A003);
                r2.A00 = Long.valueOf(r5.A00("kic_group_notification_taps"));
                this.A02.A04(r2);
            }
        }
        this.A00.A01().edit().clear().apply();
    }

    public /* synthetic */ void APK() {
    }
}
