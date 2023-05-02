package z;

import a.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.Okio;
import okio.Pipe;
import okio.Source;
import okio.Timeout;

/* compiled from: XFMFile */
public final class b implements Source {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2828a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2829b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2830c;

    public b(InputStream inputStream, Timeout timeout) {
        this.f2829b = timeout;
        this.f2830c = inputStream;
    }

    public b(AsyncTimeout asyncTimeout, Source source) {
        this.f2830c = asyncTimeout;
        this.f2829b = source;
    }

    public b(Pipe pipe) {
        this.f2830c = pipe;
        this.f2829b = new Timeout();
    }

    public final void close() {
        switch (this.f2828a) {
            case 0:
                Object obj = this.f2830c;
                try {
                    ((Source) this.f2829b).close();
                    ((AsyncTimeout) obj).c(true);
                    return;
                } catch (IOException e2) {
                    throw ((AsyncTimeout) obj).b(e2);
                } catch (Throwable th) {
                    ((AsyncTimeout) obj).c(false);
                    throw th;
                }
            case 1:
                ((InputStream) this.f2830c).close();
                return;
            default:
                synchronized (((Pipe) this.f2830c).f2357b) {
                    Object obj2 = this.f2830c;
                    ((Pipe) obj2).f2359d = true;
                    ((Pipe) obj2).f2357b.notifyAll();
                }
                return;
        }
    }

    public final long read(Buffer buffer, long j2) {
        boolean z2 = false;
        long j3 = -1;
        switch (this.f2828a) {
            case 0:
                Object obj = this.f2830c;
                AsyncTimeout asyncTimeout = (AsyncTimeout) obj;
                asyncTimeout.enter();
                try {
                    long read = ((Source) this.f2829b).read(buffer, j2);
                    asyncTimeout.c(true);
                    return read;
                } catch (IOException e2) {
                    throw ((AsyncTimeout) obj).b(e2);
                } catch (Throwable th) {
                    asyncTimeout.c(false);
                    throw th;
                }
            case 1:
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.e("byteCount < 0: ", j2));
                } else if (i2 == 0) {
                    return 0;
                } else {
                    try {
                        ((Timeout) this.f2829b).throwIfReached();
                        i f2 = buffer.f(1);
                        int read2 = ((InputStream) this.f2830c).read(f2.f2841a, f2.f2843c, (int) Math.min(j2, (long) (8192 - f2.f2843c)));
                        if (read2 == -1) {
                            return -1;
                        }
                        f2.f2843c += read2;
                        long j4 = (long) read2;
                        buffer.f2324b += j4;
                        return j4;
                    } catch (AssertionError e3) {
                        Logger logger = Okio.f2354a;
                        if (!(e3.getCause() == null || e3.getMessage() == null || !e3.getMessage().contains("getsockname failed"))) {
                            z2 = true;
                        }
                        if (z2) {
                            throw new IOException(e3);
                        }
                        throw e3;
                    }
                }
            default:
                synchronized (((Pipe) this.f2830c).f2357b) {
                    if (!((Pipe) this.f2830c).f2359d) {
                        while (true) {
                            if (((Pipe) this.f2830c).f2357b.size() == 0) {
                                Object obj2 = this.f2830c;
                                if (!((Pipe) obj2).f2358c) {
                                    ((Timeout) this.f2829b).waitUntilNotified(((Pipe) obj2).f2357b);
                                }
                            } else {
                                j3 = ((Pipe) this.f2830c).f2357b.read(buffer, j2);
                                ((Pipe) this.f2830c).f2357b.notifyAll();
                            }
                        }
                    } else {
                        throw new IllegalStateException("closed");
                    }
                }
                return j3;
        }
    }

    public final Timeout timeout() {
        int i2 = this.f2828a;
        Object obj = this.f2829b;
        switch (i2) {
            case 0:
                return (AsyncTimeout) this.f2830c;
            case 1:
                return (Timeout) obj;
            default:
                return (Timeout) obj;
        }
    }

    public final String toString() {
        switch (this.f2828a) {
            case 0:
                return "AsyncTimeout.source(" + ((Source) this.f2829b) + ")";
            case 1:
                return "source(" + ((InputStream) this.f2830c) + ")";
            default:
                return super.toString();
        }
    }
}
