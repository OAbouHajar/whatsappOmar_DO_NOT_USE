package v;

import a.a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1Codec;
import okio.Buffer;

/* compiled from: XFMFile */
public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    public final HttpUrl f2679e;

    /* renamed from: f  reason: collision with root package name */
    public long f2680f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2681g = true;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Http1Codec f2682h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Http1Codec http1Codec, HttpUrl httpUrl) {
        super(http1Codec);
        this.f2682h = http1Codec;
        this.f2679e = httpUrl;
    }

    public final void close() {
        if (!this.f2673b) {
            if (this.f2681g && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
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
        } else if (!this.f2681g) {
            return -1;
        } else {
            long j3 = this.f2680f;
            if (j3 == 0 || j3 == -1) {
                Http1Codec http1Codec = this.f2682h;
                if (j3 != -1) {
                    http1Codec.f2222c.readUtf8LineStrict();
                }
                try {
                    this.f2680f = http1Codec.f2222c.readHexadecimalUnsignedLong();
                    String trim = http1Codec.f2222c.readUtf8LineStrict().trim();
                    if (this.f2680f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f2680f + trim + "\"");
                    }
                    if (this.f2680f == 0) {
                        this.f2681g = false;
                        HttpHeaders.receiveHeaders(http1Codec.f2220a.cookieJar(), this.f2679e, http1Codec.readHeaders());
                        a((IOException) null, true);
                    }
                    if (!this.f2681g) {
                        return -1;
                    }
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            }
            long read = super.read(buffer, Math.min(j2, this.f2680f));
            if (read != -1) {
                this.f2680f -= read;
                return read;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(protocolException, false);
            throw protocolException;
        }
    }
}
