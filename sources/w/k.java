package w;

import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: XFMFile */
public final class k extends NamedRunnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2730a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2731b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2732c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Http2Connection http2Connection, n nVar) {
        super("OkHttp %s", http2Connection.f2243d);
        this.f2730a = 2;
        this.f2731b = http2Connection;
        this.f2732c = nVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(k kVar, String str, Object[] objArr, Object obj, int i2) {
        super(str, objArr);
        this.f2730a = i2;
        this.f2731b = kVar;
        this.f2732c = obj;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:30|31|32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        ((okhttp3.internal.http2.Http2Connection) r1).a(r0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute() {
        /*
            r6 = this;
            int r0 = r6.f2730a
            java.lang.Object r1 = r6.f2731b
            java.lang.Object r2 = r6.f2732c
            switch(r0) {
                case 0: goto L_0x0025;
                case 1: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x005c
        L_0x000a:
            r0 = r1
            w.k r0 = (w.k) r0     // Catch:{ IOException -> 0x0019 }
            java.lang.Object r0 = r0.f2731b     // Catch:{ IOException -> 0x0019 }
            okhttp3.internal.http2.Http2Connection r0 = (okhttp3.internal.http2.Http2Connection) r0     // Catch:{ IOException -> 0x0019 }
            w.r r0 = r0.f2257r     // Catch:{ IOException -> 0x0019 }
            okhttp3.internal.http2.Settings r2 = (okhttp3.internal.http2.Settings) r2     // Catch:{ IOException -> 0x0019 }
            r0.a(r2)     // Catch:{ IOException -> 0x0019 }
            goto L_0x0024
        L_0x0019:
            w.k r1 = (w.k) r1
            java.lang.Object r0 = r1.f2731b
            okhttp3.internal.http2.Http2Connection r0 = (okhttp3.internal.http2.Http2Connection) r0
            java.util.concurrent.ThreadPoolExecutor r1 = okhttp3.internal.http2.Http2Connection.f2239u
            r0.b()
        L_0x0024:
            return
        L_0x0025:
            r0 = r1
            w.k r0 = (w.k) r0     // Catch:{ IOException -> 0x0035 }
            java.lang.Object r0 = r0.f2731b     // Catch:{ IOException -> 0x0035 }
            okhttp3.internal.http2.Http2Connection r0 = (okhttp3.internal.http2.Http2Connection) r0     // Catch:{ IOException -> 0x0035 }
            okhttp3.internal.http2.Http2Connection$Listener r0 = r0.f2241b     // Catch:{ IOException -> 0x0035 }
            r3 = r2
            okhttp3.internal.http2.Http2Stream r3 = (okhttp3.internal.http2.Http2Stream) r3     // Catch:{ IOException -> 0x0035 }
            r0.onStream(r3)     // Catch:{ IOException -> 0x0035 }
            goto L_0x005b
        L_0x0035:
            r0 = move-exception
            okhttp3.internal.platform.Platform r3 = okhttp3.internal.platform.Platform.get()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Http2Connection.Listener failure for "
            r4.<init>(r5)
            w.k r1 = (w.k) r1
            java.lang.Object r1 = r1.f2731b
            okhttp3.internal.http2.Http2Connection r1 = (okhttp3.internal.http2.Http2Connection) r1
            java.lang.String r1 = r1.f2243d
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 4
            r3.log(r4, r1, r0)
            okhttp3.internal.http2.Http2Stream r2 = (okhttp3.internal.http2.Http2Stream) r2     // Catch:{ IOException -> 0x005b }
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ IOException -> 0x005b }
            r2.close(r0)     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            return
        L_0x005c:
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
            r3 = r2
            w.n r3 = (w.n) r3     // Catch:{ IOException -> 0x007d, all -> 0x0079 }
            r3.c(r6)     // Catch:{ IOException -> 0x007d, all -> 0x0079 }
        L_0x0064:
            r3 = r2
            w.n r3 = (w.n) r3     // Catch:{ IOException -> 0x007d, all -> 0x0079 }
            r4 = 0
            boolean r3 = r3.b(r4, r6)     // Catch:{ IOException -> 0x007d, all -> 0x0079 }
            if (r3 == 0) goto L_0x006f
            goto L_0x0064
        L_0x006f:
            okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x007d, all -> 0x0079 }
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x007e }
            okhttp3.internal.http2.Http2Connection r1 = (okhttp3.internal.http2.Http2Connection) r1     // Catch:{ IOException -> 0x0085 }
            r1.a(r3, r0)     // Catch:{ IOException -> 0x0085 }
            goto L_0x0085
        L_0x0079:
            r3 = move-exception
            r4 = r3
            r3 = r0
            goto L_0x008c
        L_0x007d:
            r3 = r0
        L_0x007e:
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x008b }
            okhttp3.internal.http2.Http2Connection r1 = (okhttp3.internal.http2.Http2Connection) r1     // Catch:{ IOException -> 0x0085 }
            r1.a(r0, r0)     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            w.n r2 = (w.n) r2
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
            return
        L_0x008b:
            r4 = move-exception
        L_0x008c:
            okhttp3.internal.http2.Http2Connection r1 = (okhttp3.internal.http2.Http2Connection) r1     // Catch:{ IOException -> 0x0091 }
            r1.a(r3, r0)     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            w.n r2 = (w.n) r2
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w.k.execute():void");
    }
}
