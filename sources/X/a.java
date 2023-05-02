package x;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.tls.CertificateChainCleaner;

/* compiled from: XFMFile */
public final class a extends CertificateChainCleaner {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2771a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f2772b;

    public a(Object obj, Method method) {
        this.f2771a = obj;
        this.f2772b = method;
    }

    public final List clean(List list, String str) {
        try {
            return (List) this.f2772b.invoke(this.f2771a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return 0;
    }
}
