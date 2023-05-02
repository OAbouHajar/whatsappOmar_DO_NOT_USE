package X;

import android.content.Intent;
import com.obwhatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.55x  reason: invalid class name */
public final /* synthetic */ class AnonymousClass55x implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ VerifyPhoneNumber A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass55x(VerifyPhoneNumber verifyPhoneNumber, long j2, long j3, boolean z2) {
        this.A02 = verifyPhoneNumber;
        this.A03 = z2;
        this.A00 = j2;
        this.A01 = j3;
    }

    public final void run() {
        VerifyPhoneNumber verifyPhoneNumber = this.A02;
        boolean z2 = this.A03;
        long j2 = this.A00;
        long j3 = this.A01;
        AnonymousClass29T.A00(verifyPhoneNumber, 44);
        boolean z3 = verifyPhoneNumber.A1F;
        Intent A0E = z2 ? C14750ph.A0E(verifyPhoneNumber, j2, j3, z3, verifyPhoneNumber.A1P) : C14750ph.A0A(verifyPhoneNumber, 1, j2, j3, 0, z3, verifyPhoneNumber.A1P, false);
        verifyPhoneNumber.finish();
        verifyPhoneNumber.startActivity(A0E);
        verifyPhoneNumber.overridePendingTransition(0, 0);
    }
}
