package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.security.KeyStore;
import java.security.KeyStoreException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.60U  reason: invalid class name */
public class AnonymousClass60U implements C227219a {
    public final AnonymousClass175 A00;
    public final C18300wT A01;
    public final C116675rl A02;
    public final C119255wn A03;

    public AnonymousClass60U(AnonymousClass175 r1, C18300wT r2, C116675rl r3, C119255wn r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void A7m() {
        this.A01.A0H((String) null);
        this.A03.A05("personal");
        C116675rl r3 = this.A02;
        C118075u1 r0 = (C118075u1) r3.A01.A00.get();
        if (r0 != null) {
            try {
                KeyStore keyStore = r0.A01;
                if (keyStore.containsAlias("alias-payments-br-trusted-device-key")) {
                    keyStore.deleteEntry("alias-payments-br-trusted-device-key");
                }
            } catch (KeyStoreException unused) {
                Log.e("PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed");
            }
        }
        try {
            C18300wT r2 = r3.A00;
            String A04 = r2.A04();
            if (!TextUtils.isEmpty(A04)) {
                JSONObject A0K = C13700nu.A0K(A04);
                A0K.remove("td");
                C110105dW.A1J(r2, A0K);
            }
        } catch (JSONException e2) {
            Log.w("PAY: TrustedDeviceKeyStore delete failed", e2);
        }
    }

    public boolean A7n(String str, boolean z2) {
        return false;
    }

    public boolean Af9(AnonymousClass1W2 r3) {
        return !C110115dX.A17(this.A01.A01(), "payments_card_can_receive_payment") || !this.A00.A0E();
    }

    public boolean AhN(long j2, boolean z2) {
        C18300wT r3 = this.A01;
        C13680ns.A0z(C110105dW.A06(r3), "payment_account_recoverable", z2);
        if (!z2) {
            r3.A0F(0);
            return true;
        } else if (j2 > 0) {
            r3.A0F(j2 * 1000);
            return true;
        } else {
            r3.A0A();
            return true;
        }
    }

    public boolean AhX(C39901tF r2) {
        return false;
    }
}
