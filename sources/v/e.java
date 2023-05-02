package v;

import a.a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.http1.Http1Codec;
import okio.Buffer;

/* compiled from: XFMFile */
public final class e extends a {

    /* renamed from: e  reason: collision with root package name */
    public long f2687e;

    public e(Http1Codec http1Codec, long j2) {
        super(http1Codec);
        this.f2687e = j2;
        if (j2 == 0) {
            a((IOException) null, true);
        }
    }

    public final void close() {
        if (!this.f2673b) {
            if (this.f2687e != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                a((IOException) null, false);
            }
            this.f2673b = true;
        }
    }

    public final long read(Buffer buffer, long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(a.e("byteCount < 0: ", j2));
        } else if (!this.f2673b) {
            long j3 = this.f2687e;
            if (j3 == 0) {
                return -1;
            }
            long read = super.read(buffer, Math.min(j3, j2));
            if (read != -1) {
                long j4 = this.f2687e - read;
                this.f2687e = j4;
                if (j4 == 0) {
                    a((IOException) null, true);
                }
                return read;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(protocolException, false);
            throw protocolException;
        } else {
            throw new IllegalStateException("closed");
        }
    }
}
