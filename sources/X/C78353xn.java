package X;

import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: X.3xn  reason: invalid class name and case insensitive filesystem */
public class C78353xn extends C29421ab {
    public final C87914Zd A00;
    public final TrustManager[] A01 = {new C1050858d(this)};

    public C78353xn(C16980tz r4, C87914Zd r5, C219716d r6) {
        super(r4.A00, r6);
        this.A00 = r5;
    }

    public SSLSocketFactory A01(SSLSessionCache sSLSessionCache, SSLContext sSLContext) {
        try {
            sSLContext.init((KeyManager[]) null, this.A01, (SecureRandom) null);
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException e2) {
            Log.e("fpm/HashCheckingSSLSocketFactory/", e2);
            throw new RuntimeException(e2);
        }
    }
}
