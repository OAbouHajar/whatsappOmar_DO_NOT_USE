package X;

import android.os.ConditionVariable;

/* renamed from: X.2GW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2GW implements AnonymousClass2GX {
    public final /* synthetic */ C16440t3 A00;
    public final /* synthetic */ C210912t A01;

    public /* synthetic */ AnonymousClass2GW(C16440t3 r1, C210912t r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void AWh(boolean z2) {
        C210912t r4 = this.A01;
        if (r4.A02(z2)) {
            AnonymousClass2GY r3 = new AnonymousClass2GY();
            r3.A04 = Long.valueOf(System.currentTimeMillis());
            r3.A03 = 2;
            r4.A01(new AnonymousClass2GZ((ConditionVariable) null, r4, r3), -1);
        }
    }
}
