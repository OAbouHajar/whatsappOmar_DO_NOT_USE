package v;

import okhttp3.internal.http1.Http1Codec;
import okio.Buffer;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Timeout;
import org.apache.commons.io.IOUtils;

/* compiled from: XFMFile */
public final class b implements Sink {

    /* renamed from: a  reason: collision with root package name */
    public final ForwardingTimeout f2676a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2677b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Http1Codec f2678c;

    public b(Http1Codec http1Codec) {
        this.f2678c = http1Codec;
        this.f2676a = new ForwardingTimeout(http1Codec.f2223d.timeout());
    }

    public final synchronized void close() {
        if (!this.f2677b) {
            this.f2677b = true;
            this.f2678c.f2223d.writeUtf8("0\r\n\r\n");
            Http1Codec http1Codec = this.f2678c;
            ForwardingTimeout forwardingTimeout = this.f2676a;
            http1Codec.getClass();
            Timeout delegate = forwardingTimeout.delegate();
            forwardingTimeout.setDelegate(Timeout.NONE);
            delegate.clearDeadline();
            delegate.clearTimeout();
            this.f2678c.f2224e = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.f2677b) {
            this.f2678c.f2223d.flush();
        }
    }

    public final Timeout timeout() {
        return this.f2676a;
    }

    public final void write(Buffer buffer, long j2) {
        if (this.f2677b) {
            throw new IllegalStateException("closed");
        } else if (j2 != 0) {
            Http1Codec http1Codec = this.f2678c;
            http1Codec.f2223d.writeHexadecimalUnsignedLong(j2);
            http1Codec.f2223d.writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
            http1Codec.f2223d.write(buffer, j2);
            http1Codec.f2223d.writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
    }
}
