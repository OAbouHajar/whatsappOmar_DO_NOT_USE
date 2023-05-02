package w;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: XFMFile */
public final class e extends NamedRunnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2710a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2711b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2712c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f2713d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Http2Connection http2Connection, String str, Object[] objArr, int i2, Object obj, int i3) {
        super(str, objArr);
        this.f2710a = i3;
        this.f2713d = http2Connection;
        this.f2711b = i2;
        this.f2712c = obj;
    }

    private void a() {
        if (this.f2713d.f2249j.onRequest(this.f2711b, (List) this.f2712c)) {
            try {
                this.f2713d.f2257r.h(this.f2711b, ErrorCode.CANCEL);
                synchronized (this.f2713d) {
                    this.f2713d.f2259t.remove(Integer.valueOf(this.f2711b));
                }
            } catch (IOException unused) {
            }
        }
    }

    public final void execute() {
        switch (this.f2710a) {
            case 0:
                Http2Connection http2Connection = this.f2713d;
                try {
                    http2Connection.f2257r.h(this.f2711b, (ErrorCode) this.f2712c);
                    return;
                } catch (IOException unused) {
                    ThreadPoolExecutor threadPoolExecutor = Http2Connection.f2239u;
                    http2Connection.b();
                    return;
                }
            case 1:
                this.f2713d.f2249j.onReset(this.f2711b, (ErrorCode) this.f2712c);
                synchronized (this.f2713d) {
                    this.f2713d.f2259t.remove(Integer.valueOf(this.f2711b));
                }
                return;
            default:
                a();
                return;
        }
    }
}
