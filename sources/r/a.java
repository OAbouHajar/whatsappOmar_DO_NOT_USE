package r;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.Cache;
import okhttp3.internal.cache.DiskLruCache;
import okio.Okio;

/* compiled from: XFMFile */
public final class a implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator f2399a;

    /* renamed from: b  reason: collision with root package name */
    public String f2400b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2401c;

    public a(Cache cache) {
        this.f2399a = cache.f1876b.snapshots();
    }

    public final boolean hasNext() {
        if (this.f2400b != null) {
            return true;
        }
        this.f2401c = false;
        while (true) {
            Iterator it = this.f2399a;
            if (!it.hasNext()) {
                return false;
            }
            DiskLruCache.Snapshot snapshot = (DiskLruCache.Snapshot) it.next();
            try {
                this.f2400b = Okio.buffer(snapshot.getSource(0)).readUtf8LineStrict();
                return true;
            } catch (IOException unused) {
            } finally {
                snapshot.close();
            }
        }
    }

    public final Object next() {
        if (hasNext()) {
            String str = this.f2400b;
            this.f2400b = null;
            this.f2401c = true;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f2401c) {
            this.f2399a.remove();
            return;
        }
        throw new IllegalStateException("remove() before next()");
    }
}
