package v;

import a.a;
import java.io.IOException;
import okhttp3.internal.http1.Http1Codec;
import okio.Buffer;

/* compiled from: XFMFile */
public final class f extends a {

    /* renamed from: e  reason: collision with root package name */
    public boolean f2688e;

    public f(Http1Codec http1Codec) {
        super(http1Codec);
    }

    public final void close() {
        if (!this.f2673b) {
            if (!this.f2688e) {
                a((IOException) null, false);
            }
            this.f2673b = true;
        }
    }

    public final long read(Buffer buffer, long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(a.e("byteCount < 0: ", j2));
        } else if (this.f2673b) {
            throw new IllegalStateException("closed");
        } else if (this.f2688e) {
            return -1;
        } else {
            long read = super.read(buffer, j2);
            if (read != -1) {
                return read;
            }
            this.f2688e = true;
            a((IOException) null, true);
            return -1;
        }
    }
}
