package X;

import com.whatsapp.util.Log;

/* renamed from: X.60L  reason: invalid class name */
public class AnonymousClass60L implements AnonymousClass69M {
    public void ARm() {
        C110105dW.A1O("IndiaUpiDeviceBindActivity", "onGetChallengeFailure");
    }

    public void ARs(AnonymousClass2HJ r3, boolean z2) {
        StringBuilder A0r = AnonymousClass000.A0r("onToken success: ");
        A0r.append(z2);
        Log.i(AnonymousClass1Vo.A01("IndiaUpiDeviceBindActivity", AnonymousClass000.A0e(r3, " error: ", A0r)));
    }

    public void AVv(boolean z2) {
        StringBuilder A0r = AnonymousClass000.A0r("/onRegisterApp registered: ");
        A0r.append(z2);
        Log.i(AnonymousClass1Vo.A01("IndiaUpiDeviceBindActivity", A0r.toString()));
    }
}
