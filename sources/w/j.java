package w;

import java.io.IOException;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: XFMFile */
public final class j extends NamedRunnable {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2726a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2727b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2728c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f2729d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Http2Connection http2Connection, boolean z2, int i2, int i3) {
        super("OkHttp %s ping %08x%08x", http2Connection.f2243d, Integer.valueOf(i2), Integer.valueOf(i3));
        this.f2729d = http2Connection;
        this.f2726a = z2;
        this.f2727b = i2;
        this.f2728c = i3;
    }

    public final void execute() {
        boolean z2;
        Http2Connection http2Connection = this.f2729d;
        boolean z3 = this.f2726a;
        int i2 = this.f2727b;
        int i3 = this.f2728c;
        if (!z3) {
            synchronized (http2Connection) {
                z2 = http2Connection.f2250k;
                http2Connection.f2250k = true;
            }
            if (z2) {
                http2Connection.b();
                return;
            }
        } else {
            http2Connection.getClass();
        }
        try {
            http2Connection.f2257r.f(i2, i3, z3);
        } catch (IOException unused) {
        }
    }
}
