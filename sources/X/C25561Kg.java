package X;

import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.HashSet;
import org.chromium.net.CronetEngine;

/* renamed from: X.1Kg  reason: invalid class name and case insensitive filesystem */
public final class C25561Kg {
    public final C16980tz A00;

    public C25561Kg(C16980tz r1) {
        this.A00 = r1;
    }

    public synchronized void A00() {
        synchronized (C25561Kg.class) {
            try {
                CronetEngine.Builder builder = new CronetEngine.Builder(this.A00.A00);
                String str = AnonymousClass021.A0J;
                HashSet hashSet = new HashSet();
                for (X509Certificate publicKey : C29411aa.A01) {
                    try {
                        hashSet.add(MessageDigest.getInstance("SHA-256").digest(publicKey.getPublicKey().getEncoded()));
                    } catch (NoSuchAlgorithmException unused) {
                        Log.e("FacebookSslSocketFactory/getSHA256EncodedPublicKeys certificate encoding failed");
                    }
                }
                Calendar instance = Calendar.getInstance();
                instance.add(13, Integer.MAX_VALUE);
                builder.addPublicKeyPins(str, hashSet, true, instance.getTime());
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } catch (Exception e2) {
                Log.e("CronetEngineProvider/buildCronetEngine cronet engine building failed", e2);
            }
        }
    }
}
