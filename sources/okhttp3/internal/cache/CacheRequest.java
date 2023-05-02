package okhttp3.internal.cache;

import okio.Sink;

/* compiled from: XFMFile */
public interface CacheRequest {
    void abort();

    Sink body();
}
