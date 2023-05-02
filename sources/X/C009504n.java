package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.04n  reason: invalid class name and case insensitive filesystem */
public class C009504n {
    public static FingerprintManager.CryptoObject A00(AnonymousClass04m r2) {
        if (r2 == null) {
            return null;
        }
        Cipher cipher = r2.A01;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        Signature signature = r2.A00;
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        Mac mac = r2.A02;
        if (mac != null) {
            return new FingerprintManager.CryptoObject(mac);
        }
        return null;
    }

    public static FingerprintManager.CryptoObject A01(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    public static FingerprintManager A02(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 23 || (i2 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static AnonymousClass04m A03(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new AnonymousClass04m(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new AnonymousClass04m(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new AnonymousClass04m(cryptoObject.getMac());
        }
        return null;
    }

    public static void A04(CancellationSignal cancellationSignal, Handler handler, Object obj, Object obj2, Object obj3, int i2) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i2, (FingerprintManager.AuthenticationCallback) obj3, handler);
    }

    public static boolean A05(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean A06(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }
}
