package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.60M  reason: invalid class name */
public class AnonymousClass60M implements AnonymousClass69M {
    public final /* synthetic */ C112935km A00;

    public AnonymousClass60M(C112935km r1) {
        this.A00 = r1;
    }

    public void ARm() {
        C112935km r3 = this.A00;
        r3.A0I.A0A("onGetChallengeFailure got; showErrorAndFinish", (Throwable) null);
        r3.A3b();
    }

    public void ARs(AnonymousClass2HJ r6, boolean z2) {
        C112935km r3 = this.A00;
        r3.Ac1();
        if (!z2) {
            AnonymousClass1Vo r4 = r3.A0I;
            r4.A0A("onGetToken got; failure", (Throwable) null);
            if (r3.A06.A07("upi-get-token")) {
                r4.A0A("retry get token", (Throwable) null);
                AnonymousClass60V r42 = r3.A0C;
                synchronized (r42) {
                    try {
                        C18300wT r2 = r42.A03;
                        JSONObject A0k = C110105dW.A0k(r2);
                        A0k.remove("token");
                        A0k.remove("tokenTs");
                        C110105dW.A1J(r2, A0k);
                    } catch (JSONException e2) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e2);
                    }
                }
                r3.A3d();
                r3.A3Y();
                return;
            }
            if (r6 != null) {
                r4.A0A(AnonymousClass000.A0g("onGetToken showErrorAndFinish error: ", r6), (Throwable) null);
                if (C1200960h.A02(r3, "upi-get-token", r6.A00, true)) {
                    return;
                }
            } else {
                r4.A0A("onGetToken showErrorAndFinish", (Throwable) null);
            }
            r3.A3b();
            return;
        }
        return;
    }

    public void AVv(boolean z2) {
        C112935km r3 = this.A00;
        if (r3.AIm()) {
            return;
        }
        if (z2) {
            r3.A06.A03("upi-register-app");
            boolean z3 = r3.A0H;
            AnonymousClass1Vo r1 = r3.A0I;
            if (z3) {
                r1.A0A("internal error ShowPinError", (Throwable) null);
                r3.A3e();
                return;
            }
            r1.A06("onRegisterApp registered ShowMainPane");
            r3.A3c();
            return;
        }
        r3.A0I.A0A("onRegisterApp not registered; showErrorAndFinish", (Throwable) null);
        r3.A3b();
    }
}
