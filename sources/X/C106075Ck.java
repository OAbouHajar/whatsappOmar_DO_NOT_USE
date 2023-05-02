package X;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.5Ck  reason: invalid class name and case insensitive filesystem */
public class C106075Ck extends SSLSocketFactory {
    public final int A00 = 3;
    public final int A01 = 3;
    public final C17130ua A02;
    public final SSLSocketFactory A03 = AnonymousClass47V.A00();

    public C106075Ck(C17130ua r3) {
        this.A02 = r3;
    }

    public static C106055Ci A00(C106075Ck r4, Object obj) {
        int i2 = r4.A00;
        return new C106055Ci(r4.A02, (SSLSocket) obj, i2, r4.A01);
    }

    public Socket createSocket(String str, int i2) {
        return A00(this, this.A03.createSocket(str, i2));
    }

    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        return A00(this, this.A03.createSocket(str, i2, inetAddress, i3));
    }

    public Socket createSocket(InetAddress inetAddress, int i2) {
        return A00(this, this.A03.createSocket(inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return A00(this, this.A03.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    public Socket createSocket(Socket socket, String str, int i2, boolean z2) {
        return A00(this, this.A03.createSocket(socket, str, i2, z2));
    }

    public String[] getDefaultCipherSuites() {
        return this.A03.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.A03.getSupportedCipherSuites();
    }
}
