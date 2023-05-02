package X;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.4e2  reason: invalid class name and case insensitive filesystem */
public class C90374e2 {
    public static Set A00 = Collections.singleton("Crypto");
    public static final Set A01;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        A01 = linkedHashSet;
        linkedHashSet.add("GmsCore_OpenSSL");
        linkedHashSet.add("AndroidOpenSSL");
    }

    public static Object A00(Object obj, String str, String str2) {
        if (Build.VERSION.SDK_INT < 28) {
            Iterator it = A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    A00.contains(str2);
                    break;
                }
                String A0m = AnonymousClass000.A0m(it);
                try {
                    if (!A0m.equals(str2)) {
                        if (obj instanceof SecureRandom) {
                            return SecureRandom.getInstance(str, A0m);
                        }
                        if (obj instanceof Cipher) {
                            return Cipher.getInstance(str, A0m);
                        }
                        if (obj instanceof KeyGenerator) {
                            return KeyGenerator.getInstance(str, A0m);
                        }
                        throw AnonymousClass000.A0T("Unknown instance type");
                    }
                } catch (IllegalArgumentException | NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException e2) {
                    e2.getMessage();
                }
            }
        }
        return obj;
    }

    public static SecureRandom A01() {
        if (Build.VERSION.SDK_INT >= 26) {
            return SecureRandom.getInstanceStrong();
        }
        SecureRandom instance = SecureRandom.getInstance("SHA1PRNG");
        return (SecureRandom) A00(instance, "SHA1PRNG", instance.getProvider().getName());
    }
}
