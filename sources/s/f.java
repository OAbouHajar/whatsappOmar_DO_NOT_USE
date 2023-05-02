package s;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* compiled from: XFMFile */
public abstract class f extends ForwardingSink {

    /* renamed from: b  reason: collision with root package name */
    public boolean f2669b;

    public f(Sink sink) {
        super(sink);
    }

    public abstract void a();

    public final void close() {
        if (!this.f2669b) {
            try {
                super.close();
            } catch (IOException unused) {
                this.f2669b = true;
                a();
            }
        }
    }

    public final void flush() {
        if (!this.f2669b) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.f2669b = true;
                a();
            }
        }
    }

    public final void write(Buffer buffer, long j2) {
        if (this.f2669b) {
            buffer.skip(j2);
            return;
        }
        try {
            super.write(buffer, j2);
        } catch (IOException unused) {
            this.f2669b = true;
            a();
        }
    }
}
