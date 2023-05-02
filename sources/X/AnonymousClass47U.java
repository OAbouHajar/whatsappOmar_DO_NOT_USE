package X;

import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

/* renamed from: X.47U  reason: invalid class name */
public class AnonymousClass47U {
    public static SSLContext A00() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            Log.w(AnonymousClass000.A0h(" algorithm not available for SSLContext: ", AnonymousClass000.A0q("TLS")), e2);
            throw new RuntimeException(e2);
        }
    }
}
