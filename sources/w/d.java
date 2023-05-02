package w;

import java.io.IOException;
import okhttp3.internal.http2.Http2Codec;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

/* compiled from: XFMFile */
public final class d extends ForwardingSource {

    /* renamed from: b  reason: collision with root package name */
    public boolean f2707b = false;

    /* renamed from: c  reason: collision with root package name */
    public long f2708c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Http2Codec f2709d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Http2Codec http2Codec, Source source) {
        super(source);
        this.f2709d = http2Codec;
    }

    public final void close() {
        super.close();
        if (!this.f2707b) {
            this.f2707b = true;
            Http2Codec http2Codec = this.f2709d;
            http2Codec.f2235b.streamFinished(false, http2Codec, this.f2708c, (IOException) null);
        }
    }

    public final long read(Buffer buffer, long j2) {
        try {
            long read = delegate().read(buffer, j2);
            if (read > 0) {
                this.f2708c += read;
            }
            return read;
        } catch (IOException e2) {
            if (!this.f2707b) {
                this.f2707b = true;
                Http2Codec http2Codec = this.f2709d;
                http2Codec.f2235b.streamFinished(false, http2Codec, this.f2708c, e2);
            }
            throw e2;
        }
    }
}
