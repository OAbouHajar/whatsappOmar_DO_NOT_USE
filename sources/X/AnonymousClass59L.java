package X;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: X.59L  reason: invalid class name */
public class AnonymousClass59L implements LayeredSocketFactory {
    public final SSLSocketFactory A00 = AnonymousClass47V.A00();

    public Socket connectSocket(Socket socket, String str, int i2, InetAddress inetAddress, int i3, HttpParams httpParams) {
        if (socket == null) {
            socket = createSocket();
        }
        socket.bind(new InetSocketAddress(inetAddress, i3));
        socket.connect(new InetSocketAddress(str, i2), HttpConnectionParams.getConnectionTimeout(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        return this.A00.createSocket(socket, str, i2, true);
    }

    public Socket createSocket() {
        return this.A00.createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i2, boolean z2) {
        return this.A00.createSocket(socket, str, i2, z2);
    }

    public boolean isSecure(Socket socket) {
        return socket instanceof SSLSocket;
    }
}
