package X;

import com.whatsapp.util.Log;

/* renamed from: X.2db  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52332db implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass1CH A02;

    public /* synthetic */ C52332db(AnonymousClass1CH r1, int i2, long j2) {
        this.A02 = r1;
        this.A00 = i2;
        this.A01 = j2;
    }

    public final void run() {
        AnonymousClass1CH r4 = this.A02;
        int i2 = this.A00;
        long j2 = this.A01;
        C75263rs r7 = new C75263rs();
        r7.A00 = Integer.valueOf(i2);
        r7.A04 = r4.A01;
        long A002 = r4.A03.A00() / 1000;
        r7.A03 = Long.valueOf(A002);
        r7.A01 = Long.valueOf(A002 - r4.A00);
        r7.A02 = Long.valueOf(j2);
        r4.A04.A06(r7);
        if (r4.A01 == null) {
            Log.w("CompanionRegistrationLogger/logEvent MD session ID is null");
        }
        r4.A01 = null;
        r4.A00 = 0;
    }
}
