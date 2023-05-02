package X;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: X.22T  reason: invalid class name */
public final class AnonymousClass22T {
    public static final String A00(String str) {
        C18450wi.A0H(str, 0);
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        Charset charset = AnonymousClass01S.A0A;
        C18450wi.A0D(charset);
        byte[] bytes = str.getBytes(charset);
        C18450wi.A0B(bytes);
        instance.update(bytes);
        String encodeToString = Base64.encodeToString(instance.digest(), 2);
        C18450wi.A0B(encodeToString);
        return encodeToString;
    }
}
