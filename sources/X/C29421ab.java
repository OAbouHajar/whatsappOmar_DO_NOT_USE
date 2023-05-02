package X;

import android.content.Context;
import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1ab  reason: invalid class name and case insensitive filesystem */
public abstract class C29421ab extends SSLSocketFactory {
    public SSLSocketFactory A00;
    public final SSLSessionCache A01;
    public final C219716d A02;
    public final SSLContext A03;
    public volatile String[] A04;

    public C29421ab(Context context, C219716d r6) {
        SSLContext A002 = AnonymousClass47U.A00();
        this.A03 = A002;
        this.A02 = r6;
        A002.getClientSessionContext().setSessionTimeout(86400);
        A002.getClientSessionContext().setSessionCacheSize(24);
        File cacheDir = context.getCacheDir();
        SSLSessionCache sSLSessionCache = null;
        if (cacheDir != null && cacheDir.exists()) {
            try {
                sSLSessionCache = new SSLSessionCache(new File(cacheDir, "SSLSessionCache"));
            } catch (IOException unused) {
            }
        }
        this.A01 = sSLSessionCache;
    }

    public final synchronized SSLSocketFactory A00() {
        SSLSocketFactory sSLSocketFactory;
        sSLSocketFactory = this.A00;
        if (sSLSocketFactory == null) {
            sSLSocketFactory = A01(this.A01, this.A03);
            this.A00 = sSLSocketFactory;
        }
        return sSLSocketFactory;
    }

    public SSLSocketFactory A01(SSLSessionCache sSLSessionCache, SSLContext sSLContext) {
        if (this instanceof C29441ad) {
            C29441ad r2 = (C29441ad) this;
            try {
                sSLContext.init((KeyManager[]) null, C29441ad.A02, (SecureRandom) null);
                if (sSLSessionCache != null) {
                    AnonymousClass3B0.A01(sSLSessionCache, sSLContext);
                }
                return new C106085Cl(sSLSessionCache, r2, sSLContext, sSLContext.getSocketFactory());
            } catch (KeyManagementException e2) {
                Log.e((Throwable) e2);
                throw new RuntimeException(e2);
            }
        } else if (this instanceof C53992gd) {
            try {
                sSLContext.init((KeyManager[]) null, C53992gd.A00, (SecureRandom) null);
                return sSLContext.getSocketFactory();
            } catch (KeyManagementException e3) {
                Log.e((Throwable) e3);
                throw new RuntimeException(e3);
            }
        } else {
            try {
                sSLContext.init((KeyManager[]) null, C29411aa.A02, (SecureRandom) null);
                if (sSLSessionCache != null) {
                    AnonymousClass3B0.A01(sSLSessionCache, sSLContext);
                }
                return sSLContext.getSocketFactory();
            } catch (KeyManagementException e4) {
                Log.e((Throwable) e4);
                throw new RuntimeException(e4);
            }
        }
    }

    public void A02(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] strArr = this.A04;
            if (strArr == null) {
                String[] supportedProtocols = sSLSocket.getSupportedProtocols();
                ArrayList arrayList = new ArrayList();
                if (supportedProtocols != null) {
                    for (String str : supportedProtocols) {
                        if (str != null && str.startsWith("TLS")) {
                            arrayList.add(str);
                        }
                    }
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
                this.A04 = strArr;
            }
            if (strArr.length > 0) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
    }

    public Socket createSocket() {
        Socket createSocket = A00().createSocket();
        A02(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i2) {
        Socket createSocket = A00().createSocket(str, i2);
        A02(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(str, createSocket);
        }
        return createSocket;
    }

    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        Socket createSocket = A00().createSocket(str, i2, inetAddress, i3);
        A02(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(str, createSocket);
        }
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i2) {
        Socket createSocket = A00().createSocket(inetAddress, i2);
        A02(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(inetAddress.getHostName(), createSocket);
        }
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        Socket createSocket = A00().createSocket(inetAddress, i2, inetAddress2, i3);
        A02(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(inetAddress.getHostName(), createSocket);
        }
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i2, boolean z2) {
        Socket createSocket = A00().createSocket(socket, str, i2, z2);
        A02(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(str, createSocket);
        }
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return A00().getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return A00().getSupportedCipherSuites();
    }
}
