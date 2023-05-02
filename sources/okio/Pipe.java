package okio;

import z.a;
import z.b;

/* compiled from: XFMFile */
public final class Pipe {

    /* renamed from: a  reason: collision with root package name */
    public final long f2356a;

    /* renamed from: b  reason: collision with root package name */
    public final Buffer f2357b = new Buffer();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2358c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2359d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2360e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    public final b f2361f = new b(this);

    public Pipe(long j2) {
        if (j2 >= 1) {
            this.f2356a = j2;
            return;
        }
        throw new IllegalArgumentException(a.a.e("maxBufferSize < 1: ", j2));
    }

    public Sink sink() {
        return this.f2360e;
    }

    public Source source() {
        return this.f2361f;
    }
}
