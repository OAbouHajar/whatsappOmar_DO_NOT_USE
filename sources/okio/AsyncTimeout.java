package okio;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import z.a;
import z.b;

/* compiled from: XFMFile */
public class AsyncTimeout extends Timeout {

    /* renamed from: g  reason: collision with root package name */
    public static final long f2316g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f2317h;

    /* renamed from: i  reason: collision with root package name */
    public static AsyncTimeout f2318i;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2319d;

    /* renamed from: e  reason: collision with root package name */
    public AsyncTimeout f2320e;

    /* renamed from: f  reason: collision with root package name */
    public long f2321f;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f2316g = millis;
        f2317h = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static AsyncTimeout a() {
        AsyncTimeout asyncTimeout = f2318i.f2320e;
        Class<AsyncTimeout> cls = AsyncTimeout.class;
        long nanoTime = System.nanoTime();
        if (asyncTimeout == null) {
            cls.wait(f2316g);
            if (f2318i.f2320e != null || System.nanoTime() - nanoTime < f2317h) {
                return null;
            }
            return f2318i;
        }
        long j2 = asyncTimeout.f2321f - nanoTime;
        if (j2 > 0) {
            long j3 = j2 / SearchActionVerificationClientService.MS_TO_NS;
            cls.wait(j3, (int) (j2 - (SearchActionVerificationClientService.MS_TO_NS * j3)));
            return null;
        }
        f2318i.f2320e = asyncTimeout.f2320e;
        asyncTimeout.f2320e = null;
        return asyncTimeout;
    }

    public final IOException b(IOException iOException) {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    public final void c(boolean z2) {
        if (exit() && z2) {
            throw newTimeoutException((IOException) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0061 A[EDGE_INSN: B:40:0x0061->B:27:0x0061 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void enter() {
        /*
            r10 = this;
            boolean r0 = r10.f2319d
            if (r0 != 0) goto L_0x0079
            long r0 = r10.timeoutNanos()
            boolean r2 = r10.hasDeadline()
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0015
            if (r2 != 0) goto L_0x0015
            return
        L_0x0015:
            r3 = 1
            r10.f2319d = r3
            java.lang.Class<okio.AsyncTimeout> r3 = okio.AsyncTimeout.class
            monitor-enter(r3)
            okio.AsyncTimeout r4 = f2318i     // Catch:{ all -> 0x0076 }
            if (r4 != 0) goto L_0x002e
            okio.AsyncTimeout r4 = new okio.AsyncTimeout     // Catch:{ all -> 0x0076 }
            r4.<init>()     // Catch:{ all -> 0x0076 }
            f2318i = r4     // Catch:{ all -> 0x0076 }
            e.m0 r4 = new e.m0     // Catch:{ all -> 0x0076 }
            r4.<init>()     // Catch:{ all -> 0x0076 }
            r4.start()     // Catch:{ all -> 0x0076 }
        L_0x002e:
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0076 }
            if (r5 == 0) goto L_0x0040
            if (r2 == 0) goto L_0x0040
            long r4 = r10.deadlineNanoTime()     // Catch:{ all -> 0x0076 }
            long r4 = r4 - r6
            long r0 = java.lang.Math.min(r0, r4)     // Catch:{ all -> 0x0076 }
            goto L_0x0042
        L_0x0040:
            if (r5 == 0) goto L_0x0046
        L_0x0042:
            long r0 = r0 + r6
            r10.f2321f = r0     // Catch:{ all -> 0x0076 }
            goto L_0x004e
        L_0x0046:
            if (r2 == 0) goto L_0x0070
            long r0 = r10.deadlineNanoTime()     // Catch:{ all -> 0x0076 }
            r10.f2321f = r0     // Catch:{ all -> 0x0076 }
        L_0x004e:
            long r0 = r10.f2321f     // Catch:{ all -> 0x0076 }
            long r0 = r0 - r6
            okio.AsyncTimeout r2 = f2318i     // Catch:{ all -> 0x0076 }
        L_0x0053:
            okio.AsyncTimeout r4 = r2.f2320e     // Catch:{ all -> 0x0076 }
            if (r4 == 0) goto L_0x0061
            long r8 = r4.f2321f     // Catch:{ all -> 0x0076 }
            long r8 = r8 - r6
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r2 = r4
            goto L_0x0053
        L_0x0061:
            r10.f2320e = r4     // Catch:{ all -> 0x0076 }
            r2.f2320e = r10     // Catch:{ all -> 0x0076 }
            okio.AsyncTimeout r0 = f2318i     // Catch:{ all -> 0x0076 }
            if (r2 != r0) goto L_0x006e
            java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
            r0.notify()     // Catch:{ all -> 0x0076 }
        L_0x006e:
            monitor-exit(r3)
            return
        L_0x0070:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0076 }
            r0.<init>()     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0079:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unbalanced enter/exit"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.AsyncTimeout.enter():void");
    }

    public final boolean exit() {
        if (!this.f2319d) {
            return false;
        }
        this.f2319d = false;
        synchronized (AsyncTimeout.class) {
            AsyncTimeout asyncTimeout = f2318i;
            while (asyncTimeout != null) {
                AsyncTimeout asyncTimeout2 = asyncTimeout.f2320e;
                if (asyncTimeout2 == this) {
                    asyncTimeout.f2320e = this.f2320e;
                    this.f2320e = null;
                    return false;
                }
                asyncTimeout = asyncTimeout2;
            }
            return true;
        }
    }

    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Sink sink(Sink sink) {
        return new a(this, sink);
    }

    public final Source source(Source source) {
        return new b(this, source);
    }

    public void timedOut() {
    }
}
