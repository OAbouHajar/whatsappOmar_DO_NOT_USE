package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.4Fm  reason: invalid class name and case insensitive filesystem */
public class C83134Fm {
    public SecureRandom A00;

    public C83134Fm() {
        try {
            this.A00 = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            throw AnonymousClass3K2.A0S("SHA1PRNGalgorithm not found.", (byte) 80);
        }
    }
}
