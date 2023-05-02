package w;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: XFMFile */
public final class f extends NamedRunnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2714a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f2715b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f2716c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Http2Connection http2Connection, Object[] objArr, int i2, long j2) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f2716c = http2Connection;
        this.f2714a = i2;
        this.f2715b = j2;
    }

    public final void execute() {
        Http2Connection http2Connection = this.f2716c;
        try {
            http2Connection.f2257r.k(this.f2714a, this.f2715b);
        } catch (IOException unused) {
            ThreadPoolExecutor threadPoolExecutor = Http2Connection.f2239u;
            http2Connection.b();
        }
    }
}
