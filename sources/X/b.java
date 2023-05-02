package x;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.Util;
import okhttp3.internal.tls.TrustRootIndex;

/* compiled from: XFMFile */
public final class b implements TrustRootIndex {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f2773a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f2774b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f2774b = method;
        this.f2773a = x509TrustManager;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2773a.equals(bVar.f2773a) && this.f2774b.equals(bVar.f2774b);
    }

    public final X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f2774b.invoke(this.f2773a, new Object[]{x509Certificate});
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw Util.assertionError("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return (this.f2774b.hashCode() * 31) + this.f2773a.hashCode();
    }
}
