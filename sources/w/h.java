package w;

import java.io.IOException;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okio.Buffer;

/* compiled from: XFMFile */
public final class h extends NamedRunnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2721a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Buffer f2722b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2723c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2724d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f2725e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Http2Connection http2Connection, Object[] objArr, int i2, Buffer buffer, int i3, boolean z2) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f2725e = http2Connection;
        this.f2721a = i2;
        this.f2722b = buffer;
        this.f2723c = i3;
        this.f2724d = z2;
    }

    public final void execute() {
        try {
            boolean onData = this.f2725e.f2249j.onData(this.f2721a, this.f2722b, this.f2723c, this.f2724d);
            if (onData) {
                this.f2725e.f2257r.h(this.f2721a, ErrorCode.CANCEL);
            }
            if (onData || this.f2724d) {
                synchronized (this.f2725e) {
                    this.f2725e.f2259t.remove(Integer.valueOf(this.f2721a));
                }
            }
        } catch (IOException unused) {
        }
    }
}
