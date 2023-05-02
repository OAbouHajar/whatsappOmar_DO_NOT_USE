package s;

import okhttp3.internal.cache.DiskLruCache;
import okio.Sink;

/* compiled from: XFMFile */
public final class b extends f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f2655c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(DiskLruCache diskLruCache, Sink sink) {
        super(sink);
        this.f2655c = diskLruCache;
    }

    public final void a() {
        this.f2655c.f2140m = true;
    }
}
