package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.47V  reason: invalid class name */
public class AnonymousClass47V {
    public static SSLSocketFactory A00() {
        SSLContext sSLContext;
        if (Build.VERSION.SDK_INT < 21) {
            try {
                sSLContext = SSLContext.getInstance("Default");
            } catch (NoSuchAlgorithmException unused) {
                sSLContext = null;
            }
            if (sSLContext != null) {
                return sSLContext.getSocketFactory();
            }
            Log.i("socketfactoryutil/failed to create clean sslcontext for prelollipop devices");
        }
        return (SSLSocketFactory) SSLSocketFactory.getDefault();
    }
}
