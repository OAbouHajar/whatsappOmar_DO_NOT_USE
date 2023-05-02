package r;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

/* compiled from: XFMFile */
public final class k implements Call {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f2432a;

    /* renamed from: b  reason: collision with root package name */
    public final RetryAndFollowUpInterceptor f2433b;

    /* renamed from: c  reason: collision with root package name */
    public EventListener f2434c;

    /* renamed from: d  reason: collision with root package name */
    public final Request f2435d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2436e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2437f;

    public k(OkHttpClient okHttpClient, Request request, boolean z2) {
        this.f2432a = okHttpClient;
        this.f2435d = request;
        this.f2436e = z2;
        this.f2433b = new RetryAndFollowUpInterceptor(okHttpClient, z2);
    }

    public final Response a() {
        ArrayList arrayList = new ArrayList();
        OkHttpClient okHttpClient = this.f2432a;
        arrayList.addAll(okHttpClient.interceptors());
        arrayList.add(this.f2433b);
        arrayList.add(new BridgeInterceptor(okHttpClient.cookieJar()));
        Cache cache = okHttpClient.f2014j;
        arrayList.add(new CacheInterceptor(cache != null ? cache.f1875a : okHttpClient.f2015k));
        arrayList.add(new ConnectInterceptor(okHttpClient));
        boolean z2 = this.f2436e;
        if (!z2) {
            arrayList.addAll(okHttpClient.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(z2));
        return new RealInterceptorChain(arrayList, (StreamAllocation) null, (HttpCodec) null, (RealConnection) null, 0, this.f2435d, this, this.f2434c, okHttpClient.connectTimeoutMillis(), okHttpClient.readTimeoutMillis(), okHttpClient.writeTimeoutMillis()).proceed(this.f2435d);
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f2436e ? "web socket" : "call");
        sb.append(" to ");
        sb.append(this.f2435d.url().redact());
        return sb.toString();
    }

    public final void cancel() {
        this.f2433b.cancel();
    }

    public final Object clone() {
        Request request = this.f2435d;
        boolean z2 = this.f2436e;
        OkHttpClient okHttpClient = this.f2432a;
        k kVar = new k(okHttpClient, request, z2);
        kVar.f2434c = okHttpClient.eventListenerFactory().create(kVar);
        return kVar;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final Call m17clone() {
        Request request = this.f2435d;
        boolean z2 = this.f2436e;
        OkHttpClient okHttpClient = this.f2432a;
        k kVar = new k(okHttpClient, request, z2);
        kVar.f2434c = okHttpClient.eventListenerFactory().create(kVar);
        return kVar;
    }

    public final void enqueue(Callback callback) {
        synchronized (this) {
            if (!this.f2437f) {
                this.f2437f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f2433b.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
        this.f2434c.callStart(this);
        this.f2432a.dispatcher().a(new j(this, callback));
    }

    public final Response execute() {
        synchronized (this) {
            if (!this.f2437f) {
                this.f2437f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f2433b.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
        this.f2434c.callStart(this);
        try {
            this.f2432a.dispatcher().b(this);
            Response a2 = a();
            if (a2 != null) {
                Dispatcher dispatcher = this.f2432a.dispatcher();
                dispatcher.c(dispatcher.f1955g, this, false);
                return a2;
            }
            throw new IOException("Canceled");
        } catch (IOException e2) {
            this.f2434c.callFailed(this, e2);
            throw e2;
        } catch (Throwable th) {
            Dispatcher dispatcher2 = this.f2432a.dispatcher();
            dispatcher2.c(dispatcher2.f1955g, this, false);
            throw th;
        }
    }

    public final boolean isCanceled() {
        return this.f2433b.isCanceled();
    }

    public final synchronized boolean isExecuted() {
        return this.f2437f;
    }

    public final Request request() {
        return this.f2435d;
    }
}
