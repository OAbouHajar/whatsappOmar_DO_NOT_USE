package X;

import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5xG  reason: invalid class name */
public class AnonymousClass5xG {
    public final C009304k A00;
    public final C18300wT A01;
    public final AnonymousClass1Vo A02 = C110105dW.A0Q("PaymentFingerprintKeyStore", "payment-settings");

    public AnonymousClass5xG(C16980tz r3, C18300wT r4) {
        this.A01 = r4;
        this.A00 = new C009304k(r3.A00);
    }

    public static AnonymousClass04m A00() {
        Log.i("FingerprintHelper-helper/get-crypto-object");
        try {
            Signature instance = Signature.getInstance("SHA256withECDSA");
            KeyStore instance2 = KeyStore.getInstance("AndroidKeyStore");
            instance2.load((KeyStore.LoadStoreParameter) null);
            instance.initSign((PrivateKey) instance2.getKey("payment_bio_key_alias", (char[]) null));
            return new AnonymousClass04m(instance);
        } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e2) {
            StringBuilder A0r = AnonymousClass000.A0r("FingerprintHelper/getCryptoObject: api=");
            A0r.append(Build.VERSION.SDK_INT);
            A0r.append(" error: ");
            Log.e(AnonymousClass000.A0h(e2.toString(), A0r));
            return null;
        }
    }

    public synchronized int A01() {
        int i2;
        JSONObject optJSONObject;
        i2 = 0;
        try {
            String A04 = this.A01.A04();
            if (!TextUtils.isEmpty(A04) && (optJSONObject = C13700nu.A0K(A04).optJSONObject("bio")) != null && (i2 = optJSONObject.optInt("bioState", 0)) == 1) {
                if (A00() == null) {
                    A03();
                    i2 = 3;
                }
            }
        } catch (JSONException e2) {
            this.A02.A0A("getState threw: ", e2);
        }
        return i2;
    }

    public final synchronized String A02(int i2) {
        String str;
        str = null;
        try {
            C18300wT r7 = this.A01;
            JSONObject A0k = C110105dW.A0k(r7);
            JSONObject optJSONObject = A0k.optJSONObject("bio");
            if (optJSONObject == null) {
                optJSONObject = C13700nu.A0J();
            }
            optJSONObject.put("v", "1");
            if (i2 == 0) {
                optJSONObject.remove("bioId");
                optJSONObject.remove("bioPublicKey");
            } else if (i2 == 2) {
                str = UUID.randomUUID().toString().replace("-", "");
                optJSONObject.put("bioId", str);
            }
            optJSONObject.put("bioState", i2);
            A0k.put("bio", optJSONObject);
            C110105dW.A1J(r7, A0k);
        } catch (JSONException e2) {
            this.A02.A0A("PaymentFingerprintKeyStore setState threw: ", e2);
        }
        return str;
    }

    public void A03() {
        Log.i("FingerprintHelper-helper/remove-key");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry("payment_bio_key_alias");
            A02(0);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            StringBuilder A0r = AnonymousClass000.A0r("FingerprintHelper/removeKey: api=");
            A0r.append(Build.VERSION.SDK_INT);
            A0r.append(" error: ");
            Log.i(AnonymousClass000.A0h(e2.toString(), A0r));
        }
    }

    public void A04(String str) {
        String str2;
        JSONObject optJSONObject;
        if (str != null) {
            synchronized (this) {
                str2 = null;
                try {
                    String A04 = this.A01.A04();
                    if (!TextUtils.isEmpty(A04) && (optJSONObject = C13700nu.A0K(A04).optJSONObject("bio")) != null) {
                        str2 = optJSONObject.optString("bioId", (String) null);
                    }
                } catch (JSONException e2) {
                    this.A02.A0A("getId threw: ", e2);
                }
            }
            if (str.equals(str2)) {
                A02(1);
                return;
            }
        }
        A03();
        return;
    }

    public boolean A05() {
        C009304k r1 = this.A00;
        return r1.A06() && r1.A05();
    }
}
