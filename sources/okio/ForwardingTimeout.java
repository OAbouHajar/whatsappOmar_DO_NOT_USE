package okio;

import java.util.concurrent.TimeUnit;

/* compiled from: XFMFile */
public class ForwardingTimeout extends Timeout {

    /* renamed from: d  reason: collision with root package name */
    public Timeout f2335d;

    public ForwardingTimeout(Timeout timeout) {
        if (timeout != null) {
            this.f2335d = timeout;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public Timeout clearDeadline() {
        return this.f2335d.clearDeadline();
    }

    public Timeout clearTimeout() {
        return this.f2335d.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.f2335d.deadlineNanoTime();
    }

    public Timeout deadlineNanoTime(long j2) {
        return this.f2335d.deadlineNanoTime(j2);
    }

    public final Timeout delegate() {
        return this.f2335d;
    }

    public boolean hasDeadline() {
        return this.f2335d.hasDeadline();
    }

    public final ForwardingTimeout setDelegate(Timeout timeout) {
        if (timeout != null) {
            this.f2335d = timeout;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void throwIfReached() {
        this.f2335d.throwIfReached();
    }

    public Timeout timeout(long j2, TimeUnit timeUnit) {
        return this.f2335d.timeout(j2, timeUnit);
    }

    public long timeoutNanos() {
        return this.f2335d.timeoutNanos();
    }
}
