package X;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.PublicKey;

/* renamed from: X.5vr  reason: invalid class name and case insensitive filesystem */
public class C119065vr {
    public static String A00(String str) {
        return Base64.encodeToString(str.getBytes(AnonymousClass01S.A08), 11);
    }

    public static String A01(PublicKey publicKey) {
        Object[] A1b = C13680ns.A1b();
        A1b[0] = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(publicKey.getEncoded()), 11);
        return String.format("fp:%s", A1b);
    }
}
