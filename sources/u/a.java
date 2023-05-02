package u;

import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* compiled from: XFMFile */
public final class a extends ForwardingSink {

    /* renamed from: b  reason: collision with root package name */
    public long f2671b;

    public a(Sink sink) {
        super(sink);
    }

    public final void write(Buffer buffer, long j2) {
        super.write(buffer, j2);
        this.f2671b += j2;
    }
}
