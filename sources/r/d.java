package r;

import okhttp3.internal.cache.DiskLruCache;
import okio.ForwardingSource;
import okio.Source;

/* compiled from: XFMFile */
public final class d extends ForwardingSource {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache.Snapshot f2409b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Source source, DiskLruCache.Snapshot snapshot) {
        super(source);
        this.f2409b = snapshot;
    }

    public final void close() {
        this.f2409b.close();
        super.close();
    }
}
