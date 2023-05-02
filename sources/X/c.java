package x;

import android.os.Build;
import android.util.Log;
import com.google.gson.internal.f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okio.Buffer;

/* compiled from: XFMFile */
public final class c extends Platform {

    /* renamed from: c  reason: collision with root package name */
    public final Class f2775c;

    /* renamed from: d  reason: collision with root package name */
    public final f f2776d;

    /* renamed from: e  reason: collision with root package name */
    public final f f2777e;

    /* renamed from: f  reason: collision with root package name */
    public final f f2778f;

    /* renamed from: g  reason: collision with root package name */
    public final f f2779g;

    /* renamed from: h  reason: collision with root package name */
    public final f f2780h;

    public c(Class cls, f fVar, f fVar2, f fVar3, f fVar4) {
        Method method;
        Method method2;
        Method method3;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            method2 = cls2.getMethod("get", new Class[0]);
            method = cls2.getMethod("open", new Class[]{String.class});
            method3 = cls2.getMethod("warnIfOpen", new Class[0]);
        } catch (Exception unused) {
            method2 = null;
            method3 = null;
            method = null;
        }
        this.f2780h = new f(method2, method, method3);
        this.f2775c = cls;
        this.f2776d = fVar;
        this.f2777e = fVar2;
        this.f2778f = fVar3;
        this.f2779g = fVar4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return super.isCleartextTrafficPermitted(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return ((java.lang.Boolean) r6.getMethod("isCleartextTrafficPermitted", new java.lang.Class[0]).invoke(r7, new java.lang.Object[0])).booleanValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.Class r6, java.lang.Object r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "isCleartextTrafficPermitted"
            r1 = 0
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r1] = r4     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.reflect.Method r3 = r6.getMethod(r0, r3)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            r2[r1] = r8     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object r2 = r3.invoke(r7, r2)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ NoSuchMethodException -> 0x001d }
            boolean r6 = r2.booleanValue()     // Catch:{ NoSuchMethodException -> 0x001d }
            return r6
        L_0x001d:
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0030 }
            java.lang.reflect.Method r6 = r6.getMethod(r0, r2)     // Catch:{ NoSuchMethodException -> 0x0030 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x0030 }
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch:{ NoSuchMethodException -> 0x0030 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ NoSuchMethodException -> 0x0030 }
            boolean r6 = r6.booleanValue()     // Catch:{ NoSuchMethodException -> 0x0030 }
            goto L_0x0034
        L_0x0030:
            boolean r6 = super.isCleartextTrafficPermitted(r8)
        L_0x0034:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.c.b(java.lang.Class, java.lang.Object, java.lang.String):boolean");
    }

    public final CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
    }

    public final TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f2776d.c(sSLSocket, Boolean.TRUE);
            this.f2777e.c(sSLSocket, str);
        }
        f fVar = this.f2779g;
        if (fVar != null) {
            if (fVar.a(sSLSocket.getClass()) != null) {
                Object[] objArr = new Object[1];
                Buffer buffer = new Buffer();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Protocol protocol = (Protocol) list.get(i2);
                    if (protocol != Protocol.HTTP_1_0) {
                        buffer.writeByte(protocol.toString().length());
                        buffer.writeUtf8(protocol.toString());
                    }
                }
                objArr[0] = buffer.readByteArray();
                try {
                    fVar.b(sSLSocket, objArr);
                } catch (InvocationTargetException e2) {
                    Throwable targetException = e2.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            }
        }
    }

    public final void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e2) {
            if (Util.isAndroidGetsocknameError(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e4);
                throw iOException2;
            }
            throw e4;
        }
    }

    public final SSLContext getSSLContext() {
        if (Build.VERSION.SDK_INT < 22) {
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

    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        f fVar = this.f2778f;
        if (fVar == null) {
            return null;
        }
        if (!(fVar.a(sSLSocket.getClass()) != null)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) fVar.b(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Util.UTF_8);
            }
            return null;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object getStackTraceForCloseable(String str) {
        f fVar = this.f2780h;
        Object obj = fVar.f399b;
        if (((Method) obj) == null) {
            return null;
        }
        try {
            Object invoke = ((Method) obj).invoke((Object) null, new Object[0]);
            ((Method) fVar.f400c).invoke(invoke, new Object[]{str});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean isCleartextTrafficPermitted(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return b(cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]), str);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            throw Util.assertionError("unable to determine cleartext support", e2);
        }
    }

    public final void log(int i2, String str, Throwable th) {
        int min;
        int i3 = 5;
        if (i2 != 5) {
            i3 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int indexOf = str.indexOf(10, i4);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i4 + 4000);
                Log.println(i3, "OkHttp", str.substring(i4, min));
                if (min >= indexOf) {
                    break;
                }
                i4 = min;
            }
            i4 = min + 1;
        }
    }

    public final void logCloseableLeak(String str, Object obj) {
        f fVar = this.f2780h;
        fVar.getClass();
        boolean z2 = false;
        if (obj != null) {
            try {
                ((Method) fVar.f401d).invoke(obj, new Object[0]);
                z2 = true;
            } catch (Exception unused) {
            }
        }
        if (!z2) {
            log(5, str, (Throwable) null);
        }
    }

    public final X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object a2 = Platform.a(this.f2775c, sSLSocketFactory, "sslParameters");
        if (a2 == null) {
            try {
                a2 = Platform.a(Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), sSLSocketFactory, "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.trustManager(sSLSocketFactory);
            }
        }
        Class<X509TrustManager> cls = X509TrustManager.class;
        X509TrustManager x509TrustManager = (X509TrustManager) Platform.a(cls, a2, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) Platform.a(cls, a2, "trustManager");
    }
}
