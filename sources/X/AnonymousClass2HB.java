package X;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2HB  reason: invalid class name */
public class AnonymousClass2HB {
    public final C35081lL[] A00;

    public AnonymousClass2HB(C35081lL[] r1) {
        this.A00 = r1;
    }

    public String A00() {
        if (r6 <= 0) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            StringBuilder sb = new StringBuilder();
            for (C35081lL r1 : this.A00) {
                sb.append(r1.A02);
                sb.append(r1.A03);
            }
            return Base64.encodeToString(instance.digest(sb.toString().trim().getBytes()), 0);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
