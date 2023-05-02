package s;

import okhttp3.internal.cache.DiskLruCache;
import okio.Sink;

/* compiled from: XFMFile */
public final class d extends f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache.Editor f2660c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(DiskLruCache.Editor editor, Sink sink) {
        super(sink);
        this.f2660c = editor;
    }

    public final void a() {
        synchronized (DiskLruCache.this) {
            this.f2660c.a();
        }
    }
}
