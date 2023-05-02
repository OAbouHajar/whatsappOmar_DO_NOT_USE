package y;

import java.io.IOException;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* compiled from: XFMFile */
public final class e implements Sink {

    /* renamed from: a  reason: collision with root package name */
    public int f2810a;

    /* renamed from: b  reason: collision with root package name */
    public long f2811b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2812c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2813d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f2814e;

    public e(f fVar) {
        this.f2814e = fVar;
    }

    public final void close() {
        if (!this.f2813d) {
            f fVar = this.f2814e;
            fVar.b(this.f2810a, fVar.f2820f.size(), this.f2812c, true);
            this.f2813d = true;
            this.f2814e.f2822h = false;
            return;
        }
        throw new IOException("closed");
    }

    public final void flush() {
        if (!this.f2813d) {
            f fVar = this.f2814e;
            fVar.b(this.f2810a, fVar.f2820f.size(), this.f2812c, false);
            this.f2812c = false;
            return;
        }
        throw new IOException("closed");
    }

    public final Timeout timeout() {
        return this.f2814e.f2817c.timeout();
    }

    public final void write(Buffer buffer, long j2) {
        if (!this.f2813d) {
            f fVar = this.f2814e;
            fVar.f2820f.write(buffer, j2);
            boolean z2 = this.f2812c && this.f2811b != -1 && fVar.f2820f.size() > this.f2811b - 8192;
            long completeSegmentByteCount = fVar.f2820f.completeSegmentByteCount();
            if (completeSegmentByteCount > 0 && !z2) {
                this.f2814e.b(this.f2810a, completeSegmentByteCount, this.f2812c, false);
                this.f2812c = false;
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
