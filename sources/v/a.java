package v;

import java.io.IOException;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http1.Http1Codec;
import okio.Buffer;
import okio.ForwardingTimeout;
import okio.Source;
import okio.Timeout;

/* compiled from: XFMFile */
public abstract class a implements Source {

    /* renamed from: a  reason: collision with root package name */
    public final ForwardingTimeout f2672a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2673b;

    /* renamed from: c  reason: collision with root package name */
    public long f2674c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Http1Codec f2675d;

    public a(Http1Codec http1Codec) {
        this.f2675d = http1Codec;
        this.f2672a = new ForwardingTimeout(http1Codec.f2222c.timeout());
    }

    public final void a(IOException iOException, boolean z2) {
        Http1Codec http1Codec = this.f2675d;
        int i2 = http1Codec.f2224e;
        if (i2 != 6) {
            if (i2 == 5) {
                ForwardingTimeout forwardingTimeout = this.f2672a;
                Timeout delegate = forwardingTimeout.delegate();
                forwardingTimeout.setDelegate(Timeout.NONE);
                delegate.clearDeadline();
                delegate.clearTimeout();
                http1Codec.f2224e = 6;
                StreamAllocation streamAllocation = http1Codec.f2221b;
                if (streamAllocation != null) {
                    streamAllocation.streamFinished(!z2, http1Codec, this.f2674c, iOException);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + http1Codec.f2224e);
        }
    }

    public long read(Buffer buffer, long j2) {
        try {
            long read = this.f2675d.f2222c.read(buffer, j2);
            if (read > 0) {
                this.f2674c += read;
            }
            return read;
        } catch (IOException e2) {
            a(e2, false);
            throw e2;
        }
    }

    public final Timeout timeout() {
        return this.f2672a;
    }
}
