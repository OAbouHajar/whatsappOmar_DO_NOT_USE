package okhttp3.internal.platform;

import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* compiled from: XFMFile */
public class Platform {
    public static final int INFO = 4;
    public static final int WARN = 5;

    /* renamed from: a  reason: collision with root package name */
    public static final Platform f2282a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f2283b = Logger.getLogger(OkHttpClient.class.getName());

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (r1 != null) goto L_0x00e5;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    static {
        /*
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.String r5 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x000f }
        L_0x000d:
            r7 = r5
            goto L_0x0016
        L_0x000f:
            java.lang.String r5 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0064 }
            goto L_0x000d
        L_0x0016:
            com.google.gson.internal.f r8 = new com.google.gson.internal.f     // Catch:{ ClassNotFoundException -> 0x0064 }
            java.lang.String r5 = "setUseSessionTickets"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0064 }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0064 }
            r6[r3] = r9     // Catch:{ ClassNotFoundException -> 0x0064 }
            r8.<init>((java.lang.Class) r4, (java.lang.String) r5, (java.lang.Class[]) r6)     // Catch:{ ClassNotFoundException -> 0x0064 }
            com.google.gson.internal.f r9 = new com.google.gson.internal.f     // Catch:{ ClassNotFoundException -> 0x0064 }
            java.lang.String r5 = "setHostname"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0064 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r6[r3] = r10     // Catch:{ ClassNotFoundException -> 0x0064 }
            r9.<init>((java.lang.Class) r4, (java.lang.String) r5, (java.lang.Class[]) r6)     // Catch:{ ClassNotFoundException -> 0x0064 }
            java.lang.String r5 = "GMSCore_OpenSSL"
            java.security.Provider r5 = java.security.Security.getProvider(r5)     // Catch:{ ClassNotFoundException -> 0x0064 }
            if (r5 == 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            java.lang.String r5 = "android.net.Network"
            java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0040 }
        L_0x003e:
            r5 = 1
            goto L_0x0042
        L_0x0040:
            r5 = 0
        L_0x0042:
            if (r5 == 0) goto L_0x005b
            com.google.gson.internal.f r5 = new com.google.gson.internal.f     // Catch:{ ClassNotFoundException -> 0x0064 }
            java.lang.String r6 = "getAlpnSelectedProtocol"
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0064 }
            r5.<init>((java.lang.Class) r1, (java.lang.String) r6, (java.lang.Class[]) r10)     // Catch:{ ClassNotFoundException -> 0x0064 }
            com.google.gson.internal.f r6 = new com.google.gson.internal.f     // Catch:{ ClassNotFoundException -> 0x0064 }
            java.lang.String r10 = "setAlpnProtocols"
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0064 }
            r11[r3] = r1     // Catch:{ ClassNotFoundException -> 0x0064 }
            r6.<init>((java.lang.Class) r4, (java.lang.String) r10, (java.lang.Class[]) r11)     // Catch:{ ClassNotFoundException -> 0x0064 }
            r10 = r5
            r11 = r6
            goto L_0x005d
        L_0x005b:
            r10 = r4
            r11 = r10
        L_0x005d:
            x.c r1 = new x.c     // Catch:{ ClassNotFoundException -> 0x0064 }
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException -> 0x0064 }
            goto L_0x0066
        L_0x0064:
            r1 = r4
        L_0x0066:
            if (r1 == 0) goto L_0x006a
            goto L_0x00e5
        L_0x006a:
            boolean r1 = isConscryptPreferred()
            if (r1 == 0) goto L_0x0078
            okhttp3.internal.platform.Platform r1 = okhttp3.internal.platform.ConscryptPlatform.buildIfSupported()
            if (r1 == 0) goto L_0x0078
            goto L_0x00e5
        L_0x0078:
            java.lang.Class<javax.net.ssl.SSLParameters> r1 = javax.net.ssl.SSLParameters.class
            java.lang.String r5 = "setApplicationProtocols"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0095 }
            java.lang.Class<java.lang.String[]> r7 = java.lang.String[].class
            r6[r3] = r7     // Catch:{ NoSuchMethodException -> 0x0095 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0095 }
            java.lang.String r5 = "getApplicationProtocol"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0095 }
            java.lang.reflect.Method r5 = r0.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0095 }
            x.d r6 = new x.d     // Catch:{ NoSuchMethodException -> 0x0095 }
            r6.<init>(r1, r5)     // Catch:{ NoSuchMethodException -> 0x0095 }
            r1 = r6
            goto L_0x0097
        L_0x0095:
            r1 = r4
        L_0x0097:
            if (r1 == 0) goto L_0x009a
            goto L_0x00e5
        L_0x009a:
            java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r11 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r12 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            java.lang.String r6 = "put"
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            r7[r3] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            r7[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            java.lang.reflect.Method r8 = r1.getMethod(r6, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            java.lang.String r5 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            r6[r3] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            java.lang.reflect.Method r9 = r1.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            java.lang.String r5 = "remove"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            r2[r3] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            java.lang.reflect.Method r10 = r1.getMethod(r5, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            x.f r0 = new x.f     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00db }
            r4 = r0
            goto L_0x00dc
        L_0x00db:
        L_0x00dc:
            if (r4 == 0) goto L_0x00e0
            r1 = r4
            goto L_0x00e5
        L_0x00e0:
            okhttp3.internal.platform.Platform r1 = new okhttp3.internal.platform.Platform
            r1.<init>()
        L_0x00e5:
            f2282a = r1
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f2283b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Platform.<clinit>():void");
    }

    public static Object a(Class cls, Object obj, String str) {
        Object a2;
        Class cls2 = obj.getClass();
        while (true) {
            Class<Object> cls3 = Object.class;
            if (cls2 != cls3) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        if (cls.isInstance(obj2)) {
                            return cls.cast(obj2);
                        }
                    }
                    return null;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                } catch (IllegalAccessException unused2) {
                    throw new AssertionError();
                }
            } else if (str.equals("delegate") || (a2 = a(cls3, obj, "delegate")) == null) {
                return null;
            } else {
                return a(cls, a2, str);
            }
        }
    }

    public static List<String> alpnProtocolNames(List<Protocol> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Protocol protocol = list.get(i2);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    public static Platform get() {
        return f2282a;
    }

    public static boolean isConscryptPreferred() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public CertificateChainCleaner buildCertificateChainCleaner(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager trustManager = trustManager(sSLSocketFactory);
        if (trustManager != null) {
            return buildCertificateChainCleaner(trustManager);
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + get() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(buildTrustRootIndex(x509TrustManager));
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        return new BasicTrustRootIndex(x509TrustManager.getAcceptedIssuers());
    }

    public void configureSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        socket.connect(inetSocketAddress, i2);
    }

    public String getPrefix() {
        return "OkHttp";
    }

    public SSLContext getSSLContext() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Nullable
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return null;
    }

    public Object getStackTraceForCloseable(String str) {
        if (f2283b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String str) {
        return true;
    }

    public void log(int i2, String str, Throwable th) {
        f2283b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void logCloseableLeak(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        log(5, str, (Throwable) obj);
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        try {
            Object a2 = a(Class.forName("sun.security.ssl.SSLContextImpl"), sSLSocketFactory, "context");
            if (a2 == null) {
                return null;
            }
            return (X509TrustManager) a(X509TrustManager.class, a2, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
