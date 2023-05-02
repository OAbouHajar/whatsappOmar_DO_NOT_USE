package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.5wK  reason: invalid class name */
public class AnonymousClass5wK {
    public final AnonymousClass67J A00 = new AnonymousClass67J(new AnonymousClass67H(this));

    public static /* synthetic */ C118075u1 A00() {
        KeyStore keyStore;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 18) {
            z2 = true;
        }
        if (!z2) {
            return null;
        }
        try {
            keyStore = KeyStore.getInstance("AndroidKeyStore");
            try {
                keyStore.load((KeyStore.LoadStoreParameter) null);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            keyStore = null;
            Log.w(AnonymousClass000.A0g("PAY: TrustedDeviceKeyStore keystore load threw: ", e));
            if (keyStore == null) {
                return null;
            }
            return new C118075u1(keyStore);
        }
        return new C118075u1(keyStore);
    }

    public AnonymousClass01Q A01() {
        KeyPair generateKeyPair;
        Boolean bool;
        C118075u1 r2 = (C118075u1) this.A00.get();
        if (Build.VERSION.SDK_INT < 23 || r2 == null || (generateKeyPair = r2.A00()) == null) {
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            generateKeyPair = instance.generateKeyPair();
            bool = Boolean.FALSE;
        } else {
            bool = Boolean.TRUE;
        }
        return new AnonymousClass01Q(generateKeyPair, bool);
    }
}
