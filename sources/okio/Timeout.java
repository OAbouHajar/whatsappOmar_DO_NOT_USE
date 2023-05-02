package okio;

import a.a;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import z.l;

/* compiled from: XFMFile */
public class Timeout {
    public static final Timeout NONE = new l();

    /* renamed from: a  reason: collision with root package name */
    public boolean f2362a;

    /* renamed from: b  reason: collision with root package name */
    public long f2363b;

    /* renamed from: c  reason: collision with root package name */
    public long f2364c;

    public Timeout clearDeadline() {
        this.f2362a = false;
        return this;
    }

    public Timeout clearTimeout() {
        this.f2364c = 0;
        return this;
    }

    public final Timeout deadline(long j2, TimeUnit timeUnit) {
        if (j2 <= 0) {
            throw new IllegalArgumentException(a.e("duration <= 0: ", j2));
        } else if (timeUnit != null) {
            return deadlineNanoTime(timeUnit.toNanos(j2) + System.nanoTime());
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long deadlineNanoTime() {
        if (this.f2362a) {
            return this.f2363b;
        }
        throw new IllegalStateException("No deadline");
    }

    public Timeout deadlineNanoTime(long j2) {
        this.f2362a = true;
        this.f2363b = j2;
        return this;
    }

    public boolean hasDeadline() {
        return this.f2362a;
    }

    public void throwIfReached() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f2362a && this.f2363b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Timeout timeout(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException(a.e("timeout < 0: ", j2));
        } else if (timeUnit != null) {
            this.f2364c = timeUnit.toNanos(j2);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long timeoutNanos() {
        return this.f2364c;
    }

    public final void waitUntilNotified(Object obj) {
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j2 = 0;
            if (hasDeadline || timeoutNanos != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline && timeoutNanos != 0) {
                    timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline) {
                    timeoutNanos = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos > 0) {
                    long j3 = timeoutNanos / SearchActionVerificationClientService.MS_TO_NS;
                    Long.signum(j3);
                    obj.wait(j3, (int) (timeoutNanos - (SearchActionVerificationClientService.MS_TO_NS * j3)));
                    j2 = System.nanoTime() - nanoTime;
                }
                if (j2 >= timeoutNanos) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException("interrupted");
        }
    }
}
