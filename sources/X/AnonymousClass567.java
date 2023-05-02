package X;

import com.whatsapp.util.Log;

/* renamed from: X.567  reason: invalid class name */
public final /* synthetic */ class AnonymousClass567 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C101274x0 A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ AnonymousClass567(C101274x0 r1, String str, int i2, long j2, long j3) {
        this.A03 = r1;
        this.A04 = str;
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = j3;
    }

    public final void run() {
        C54732i7 A002;
        AnonymousClass1WM A05;
        C101274x0 r8 = this.A03;
        String str = this.A04;
        int i2 = this.A00;
        long j2 = this.A01;
        long j3 = this.A02;
        if (str == null || (A002 = C54732i7.A00(str)) == null || (A05 = r8.A02.A05(A002.A00, A002.A02)) == null) {
            Log.e("CompanionRegistrationLogger/no session id");
            return;
        }
        C75413s7 r7 = new C75413s7();
        r7.A00 = Integer.valueOf(i2);
        r7.A05 = A05.A01;
        r7.A04 = A05.A00;
        long A09 = C13690nt.A09(r8.A03.A00());
        r7.A03 = Long.valueOf(A09);
        r7.A01 = Long.valueOf(A09 - j2);
        r7.A02 = Long.valueOf(j3);
        r8.A04.A06(r7);
    }
}
