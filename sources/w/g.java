package w;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: XFMFile */
public final class g extends NamedRunnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2717a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f2718b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2719c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f2720d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Http2Connection http2Connection, Object[] objArr, int i2, ArrayList arrayList, boolean z2) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f2720d = http2Connection;
        this.f2717a = i2;
        this.f2718b = arrayList;
        this.f2719c = z2;
    }

    public final void execute() {
        boolean onHeaders = this.f2720d.f2249j.onHeaders(this.f2717a, this.f2718b, this.f2719c);
        if (onHeaders) {
            try {
                this.f2720d.f2257r.h(this.f2717a, ErrorCode.CANCEL);
            } catch (IOException unused) {
                return;
            }
        }
        if (onHeaders || this.f2719c) {
            synchronized (this.f2720d) {
                this.f2720d.f2259t.remove(Integer.valueOf(this.f2717a));
            }
        }
    }
}
