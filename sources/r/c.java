package r;

import java.io.Closeable;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;
import okio.Sink;

/* compiled from: XFMFile */
public final class c implements CacheRequest {

    /* renamed from: a  reason: collision with root package name */
    public final DiskLruCache.Editor f2404a;

    /* renamed from: b  reason: collision with root package name */
    public final Sink f2405b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2406c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2407d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Cache f2408e;

    public c(Cache cache, DiskLruCache.Editor editor) {
        this.f2408e = cache;
        this.f2404a = editor;
        Sink newSink = editor.newSink(1);
        this.f2405b = newSink;
        this.f2406c = new b(this, newSink, editor);
    }

    public final void abort() {
        synchronized (this.f2408e) {
            if (!this.f2407d) {
                this.f2407d = true;
                this.f2408e.f1878d++;
                Util.closeQuietly((Closeable) this.f2405b);
                try {
                    this.f2404a.abort();
                } catch (IOException unused) {
                }
            }
        }
    }

    public final Sink body() {
        return this.f2406c;
    }
}
