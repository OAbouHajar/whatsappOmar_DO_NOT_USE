package w;

import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: XFMFile */
public final class l extends NamedRunnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f2733a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(k kVar, Object... objArr) {
        super("OkHttp %s settings", objArr);
        this.f2733a = kVar;
    }

    public final void execute() {
        Object obj = this.f2733a.f2731b;
        ((Http2Connection) obj).f2241b.onSettings((Http2Connection) obj);
    }
}
