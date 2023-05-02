package X;

import android.net.SSLSessionCache;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.5Cl  reason: invalid class name and case insensitive filesystem */
public class C106085Cl extends SSLSocketFactory {
    public final /* synthetic */ SSLSessionCache A00;
    public final /* synthetic */ C29441ad A01;
    public final /* synthetic */ SSLContext A02;
    public final /* synthetic */ SSLSocketFactory A03;

    public C106085Cl(SSLSessionCache sSLSessionCache, C29441ad r2, SSLContext sSLContext, SSLSocketFactory sSLSocketFactory) {
        this.A01 = r2;
        this.A03 = sSLSocketFactory;
        this.A02 = sSLContext;
        this.A00 = sSLSessionCache;
    }

    public static void A00(C106085Cl r3, String str, Socket socket, int i2) {
        C29441ad r2 = r3.A01;
        r2.A02(socket);
        AnonymousClass3B0.A00(r3.A00, str, r3.A02, i2);
        r2.A00.incrementAndGet();
    }

    public Socket createSocket(String str, int i2) {
        Socket createSocket = this.A03.createSocket(str, i2);
        A00(this, str, createSocket, i2);
        return createSocket;
    }

    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        Socket createSocket = this.A03.createSocket(str, i2, inetAddress, i3);
        A00(this, str, createSocket, i2);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i2) {
        Socket createSocket = this.A03.createSocket(inetAddress, i2);
        C29441ad r3 = this.A01;
        r3.A02(createSocket);
        AnonymousClass3B0.A00(this.A00, inetAddress.getHostName(), this.A02, i2);
        r3.A00.incrementAndGet();
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        Socket createSocket = this.A03.createSocket(inetAddress, i2, inetAddress2, i3);
        C29441ad r3 = this.A01;
        r3.A02(createSocket);
        AnonymousClass3B0.A00(this.A00, inetAddress2.getHostName(), this.A02, i2);
        r3.A00.incrementAndGet();
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i2, boolean z2) {
        Socket createSocket = this.A03.createSocket(socket, str, i2, z2);
        A00(this, str, createSocket, i2);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.A03.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.A03.getSupportedCipherSuites();
    }
}
