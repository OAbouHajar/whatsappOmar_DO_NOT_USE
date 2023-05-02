package okio;

/* compiled from: XFMFile */
public abstract class ForwardingSource implements Source {

    /* renamed from: a  reason: collision with root package name */
    public final Source f2334a;

    public ForwardingSource(Source source) {
        if (source != null) {
            this.f2334a = source;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() {
        this.f2334a.close();
    }

    public final Source delegate() {
        return this.f2334a;
    }

    public long read(Buffer buffer, long j2) {
        return this.f2334a.read(buffer, j2);
    }

    public Timeout timeout() {
        return this.f2334a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f2334a.toString() + ")";
    }
}
