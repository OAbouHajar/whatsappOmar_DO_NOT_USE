package s;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: XFMFile */
public final class c implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator f2656a;

    /* renamed from: b  reason: collision with root package name */
    public DiskLruCache.Snapshot f2657b;

    /* renamed from: c  reason: collision with root package name */
    public DiskLruCache.Snapshot f2658c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f2659d;

    public c(DiskLruCache diskLruCache) {
        this.f2659d = diskLruCache;
        this.f2656a = new ArrayList(diskLruCache.f2138k.values()).iterator();
    }

    public final boolean hasNext() {
        if (this.f2657b != null) {
            return true;
        }
        synchronized (this.f2659d) {
            if (this.f2659d.f2142o) {
                return false;
            }
            while (this.f2656a.hasNext()) {
                DiskLruCache.Snapshot a2 = ((e) this.f2656a.next()).a();
                if (a2 != null) {
                    this.f2657b = a2;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            DiskLruCache.Snapshot snapshot = this.f2657b;
            this.f2658c = snapshot;
            this.f2657b = null;
            return snapshot;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        DiskLruCache.Snapshot snapshot = this.f2658c;
        if (snapshot != null) {
            try {
                this.f2659d.remove(snapshot.f2152a);
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f2658c = null;
                throw th;
            }
            this.f2658c = null;
            return;
        }
        throw new IllegalStateException("remove() before next()");
    }
}
