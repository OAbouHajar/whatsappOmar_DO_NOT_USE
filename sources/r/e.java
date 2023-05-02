package r;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.cache.DiskLruCache;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* compiled from: XFMFile */
public final class e extends ResponseBody {

    /* renamed from: b  reason: collision with root package name */
    public final DiskLruCache.Snapshot f2410b;

    /* renamed from: c  reason: collision with root package name */
    public final BufferedSource f2411c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2412d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2413e;

    public e(DiskLruCache.Snapshot snapshot, String str, String str2) {
        this.f2410b = snapshot;
        this.f2412d = str;
        this.f2413e = str2;
        this.f2411c = Okio.buffer((Source) new d(snapshot.getSource(1), snapshot));
    }

    public final long contentLength() {
        try {
            String str = this.f2413e;
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final MediaType contentType() {
        String str = this.f2412d;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    public final BufferedSource source() {
        return this.f2411c;
    }
}
