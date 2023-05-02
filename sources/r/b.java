package r;

import okhttp3.internal.cache.DiskLruCache;
import okio.ForwardingSink;
import okio.Sink;

/* compiled from: XFMFile */
public final class b extends ForwardingSink {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache.Editor f2402b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f2403c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar, Sink sink, DiskLruCache.Editor editor) {
        super(sink);
        this.f2403c = cVar;
        this.f2402b = editor;
    }

    public final void close() {
        synchronized (this.f2403c.f2408e) {
            c cVar = this.f2403c;
            if (!cVar.f2407d) {
                cVar.f2407d = true;
                cVar.f2408e.f1877c++;
                super.close();
                this.f2402b.commit();
            }
        }
    }
}
