package v;

import java.net.ProtocolException;
import okhttp3.internal.Util;
import okhttp3.internal.http1.Http1Codec;
import okio.Buffer;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Timeout;

/* compiled from: XFMFile */
public final class d implements Sink {

    /* renamed from: a  reason: collision with root package name */
    public final ForwardingTimeout f2683a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2684b;

    /* renamed from: c  reason: collision with root package name */
    public long f2685c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Http1Codec f2686d;

    public d(Http1Codec http1Codec, long j2) {
        this.f2686d = http1Codec;
        this.f2683a = new ForwardingTimeout(http1Codec.f2223d.timeout());
        this.f2685c = j2;
    }

    public final void close() {
        if (!this.f2684b) {
            this.f2684b = true;
            if (this.f2685c <= 0) {
                Http1Codec http1Codec = this.f2686d;
                http1Codec.getClass();
                ForwardingTimeout forwardingTimeout = this.f2683a;
                Timeout delegate = forwardingTimeout.delegate();
                forwardingTimeout.setDelegate(Timeout.NONE);
                delegate.clearDeadline();
                delegate.clearTimeout();
                http1Codec.f2224e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }
    }

    public final void flush() {
        if (!this.f2684b) {
            this.f2686d.f2223d.flush();
        }
    }

    public final Timeout timeout() {
        return this.f2683a;
    }

    public final void write(Buffer buffer, long j2) {
        if (!this.f2684b) {
            Util.checkOffsetAndCount(buffer.size(), 0, j2);
            if (j2 <= this.f2685c) {
                this.f2686d.f2223d.write(buffer, j2);
                this.f2685c -= j2;
                return;
            }
            throw new ProtocolException("expected " + this.f2685c + " bytes but received " + j2);
        }
        throw new IllegalStateException("closed");
    }
}
