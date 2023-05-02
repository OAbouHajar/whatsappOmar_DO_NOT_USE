package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Internal;

/* compiled from: XFMFile */
public final class ConnectionSpecSelector {

    /* renamed from: a  reason: collision with root package name */
    public final List f2157a;

    /* renamed from: b  reason: collision with root package name */
    public int f2158b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2159c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2160d;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        this.f2157a = list;
    }

    public ConnectionSpec configureSecureSocket(SSLSocket sSLSocket) {
        boolean z2;
        ConnectionSpec connectionSpec;
        int i2 = this.f2158b;
        List list = this.f2157a;
        int size = list.size();
        while (true) {
            z2 = true;
            if (i2 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = (ConnectionSpec) list.get(i2);
            if (connectionSpec.isCompatible(sSLSocket)) {
                this.f2158b = i2 + 1;
                break;
            }
            i2++;
        }
        if (connectionSpec != null) {
            int i3 = this.f2158b;
            while (true) {
                if (i3 >= list.size()) {
                    z2 = false;
                    break;
                } else if (((ConnectionSpec) list.get(i3)).isCompatible(sSLSocket)) {
                    break;
                } else {
                    i3++;
                }
            }
            this.f2159c = z2;
            Internal.instance.apply(connectionSpec, sSLSocket, this.f2160d);
            return connectionSpec;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f2160d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean connectionFailed(IOException iOException) {
        this.f2160d = true;
        if (!this.f2159c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z2 = iOException instanceof SSLHandshakeException;
        if ((!z2 || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return z2 || (iOException instanceof SSLProtocolException);
        }
        return false;
    }
}
