package z;

import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* compiled from: XFMFile */
public final class f implements Sink {
    public final void close() {
    }

    public final void flush() {
    }

    public final Timeout timeout() {
        return Timeout.NONE;
    }

    public final void write(Buffer buffer, long j2) {
        buffer.skip(j2);
    }
}
