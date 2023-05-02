package s;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

/* compiled from: XFMFile */
public final class a implements Source {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2651a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BufferedSource f2652b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CacheRequest f2653c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BufferedSink f2654d;

    public a(BufferedSource bufferedSource, CacheRequest cacheRequest, BufferedSink bufferedSink) {
        this.f2652b = bufferedSource;
        this.f2653c = cacheRequest;
        this.f2654d = bufferedSink;
    }

    public final void close() {
        if (!this.f2651a && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.f2651a = true;
            this.f2653c.abort();
        }
        this.f2652b.close();
    }

    public final long read(Buffer buffer, long j2) {
        try {
            long read = this.f2652b.read(buffer, j2);
            BufferedSink bufferedSink = this.f2654d;
            if (read == -1) {
                if (!this.f2651a) {
                    this.f2651a = true;
                    bufferedSink.close();
                }
                return -1;
            }
            buffer.copyTo(bufferedSink.buffer(), buffer.size() - read, read);
            bufferedSink.emitCompleteSegments();
            return read;
        } catch (IOException e2) {
            if (!this.f2651a) {
                this.f2651a = true;
                this.f2653c.abort();
            }
            throw e2;
        }
    }

    public final Timeout timeout() {
        return this.f2652b.timeout();
    }
}
