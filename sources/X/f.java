package x;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* compiled from: XFMFile */
public final class f extends Platform {

    /* renamed from: c  reason: collision with root package name */
    public final Method f2786c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f2787d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f2788e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f2789f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f2790g;

    public f(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f2786c = method;
        this.f2787d = method2;
        this.f2788e = method3;
        this.f2789f = cls;
        this.f2790g = cls2;
    }

    public final void afterHandshake(SSLSocket sSLSocket) {
        try {
            this.f2788e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Util.assertionError("unable to remove alpn", e2);
        }
    }

    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        List<String> alpnProtocolNames = Platform.alpnProtocolNames(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f2789f, this.f2790g}, new e(alpnProtocolNames));
            this.f2786c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Util.assertionError("unable to set alpn", e2);
        }
    }

    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        try {
            e eVar = (e) Proxy.getInvocationHandler(this.f2787d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z2 = eVar.f2784b;
            if (!z2 && eVar.f2785c == null) {
                Platform.get().log(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z2) {
                return null;
            } else {
                return eVar.f2785c;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Util.assertionError("unable to get selected protocol", e2);
        }
    }
}
