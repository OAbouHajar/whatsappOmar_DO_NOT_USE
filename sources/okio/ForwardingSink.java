package okio;

/* compiled from: XFMFile */
public abstract class ForwardingSink implements Sink {

    /* renamed from: a  reason: collision with root package name */
    public final Sink f2333a;

    public ForwardingSink(Sink sink) {
        if (sink != null) {
            this.f2333a = sink;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() {
        this.f2333a.close();
    }

    public final Sink delegate() {
        return this.f2333a;
    }

    public void flush() {
        this.f2333a.flush();
    }

    public Timeout timeout() {
        return this.f2333a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f2333a.toString() + ")";
    }

    public void write(Buffer buffer, long j2) {
        this.f2333a.write(buffer, j2);
    }
}
