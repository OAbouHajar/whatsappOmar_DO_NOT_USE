package okio;

import java.io.Closeable;

/* compiled from: XFMFile */
public interface Source extends Closeable {
    void close();

    long read(Buffer buffer, long j2);

    Timeout timeout();
}
