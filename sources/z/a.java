package z;

import java.io.IOException;
import java.io.OutputStream;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.Pipe;
import okio.Sink;
import okio.Timeout;

/* compiled from: XFMFile */
public final class a implements Sink {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2825a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2826b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2827c;

    public a(OutputStream outputStream, Timeout timeout) {
        this.f2826b = timeout;
        this.f2827c = outputStream;
    }

    public a(AsyncTimeout asyncTimeout, Sink sink) {
        this.f2827c = asyncTimeout;
        this.f2826b = sink;
    }

    public a(Pipe pipe) {
        this.f2827c = pipe;
        this.f2826b = new Timeout();
    }

    public final void close() {
        switch (this.f2825a) {
            case 0:
                Object obj = this.f2827c;
                AsyncTimeout asyncTimeout = (AsyncTimeout) obj;
                asyncTimeout.enter();
                try {
                    ((Sink) this.f2826b).close();
                    asyncTimeout.c(true);
                    return;
                } catch (IOException e2) {
                    throw ((AsyncTimeout) obj).b(e2);
                } catch (Throwable th) {
                    asyncTimeout.c(false);
                    throw th;
                }
            case 1:
                ((OutputStream) this.f2827c).close();
                return;
            default:
                synchronized (((Pipe) this.f2827c).f2357b) {
                    Object obj2 = this.f2827c;
                    if (!((Pipe) obj2).f2358c) {
                        if (((Pipe) obj2).f2359d) {
                            if (((Pipe) obj2).f2357b.size() > 0) {
                                throw new IOException("source is closed");
                            }
                        }
                        Object obj3 = this.f2827c;
                        ((Pipe) obj3).f2358c = true;
                        ((Pipe) obj3).f2357b.notifyAll();
                    }
                }
                return;
        }
    }

    public final void flush() {
        switch (this.f2825a) {
            case 0:
                Object obj = this.f2827c;
                AsyncTimeout asyncTimeout = (AsyncTimeout) obj;
                asyncTimeout.enter();
                try {
                    ((Sink) this.f2826b).flush();
                    asyncTimeout.c(true);
                    return;
                } catch (IOException e2) {
                    throw ((AsyncTimeout) obj).b(e2);
                } catch (Throwable th) {
                    asyncTimeout.c(false);
                    throw th;
                }
            case 1:
                ((OutputStream) this.f2827c).flush();
                return;
            default:
                synchronized (((Pipe) this.f2827c).f2357b) {
                    Object obj2 = this.f2827c;
                    if (((Pipe) obj2).f2358c) {
                        throw new IllegalStateException("closed");
                    } else if (((Pipe) obj2).f2359d) {
                        if (((Pipe) obj2).f2357b.size() > 0) {
                            throw new IOException("source is closed");
                        }
                    }
                }
                return;
        }
    }

    public final Timeout timeout() {
        int i2 = this.f2825a;
        Object obj = this.f2826b;
        switch (i2) {
            case 0:
                return (AsyncTimeout) this.f2827c;
            case 1:
                return (Timeout) obj;
            default:
                return (Timeout) obj;
        }
    }

    public final String toString() {
        switch (this.f2825a) {
            case 0:
                return "AsyncTimeout.sink(" + ((Sink) this.f2826b) + ")";
            case 1:
                return "sink(" + ((OutputStream) this.f2827c) + ")";
            default:
                return super.toString();
        }
    }

    public final void write(Buffer buffer, long j2) {
        switch (this.f2825a) {
            case 0:
                m.b(buffer.f2324b, 0, j2);
                while (j2 > 0) {
                    i iVar = buffer.f2323a;
                    long j3 = 0;
                    while (true) {
                        if (j3 < 65536) {
                            j3 += (long) (iVar.f2843c - iVar.f2842b);
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                iVar = iVar.f2846f;
                            }
                        }
                    }
                    Object obj = this.f2827c;
                    AsyncTimeout asyncTimeout = (AsyncTimeout) obj;
                    asyncTimeout.enter();
                    try {
                        ((Sink) this.f2826b).write(buffer, j3);
                        j2 -= j3;
                        asyncTimeout.c(true);
                    } catch (IOException e2) {
                        throw ((AsyncTimeout) obj).b(e2);
                    } catch (Throwable th) {
                        asyncTimeout.c(false);
                        throw th;
                    }
                }
                return;
            case 1:
                m.b(buffer.f2324b, 0, j2);
                while (j2 > 0) {
                    ((Timeout) this.f2826b).throwIfReached();
                    i iVar2 = buffer.f2323a;
                    int min = (int) Math.min(j2, (long) (iVar2.f2843c - iVar2.f2842b));
                    ((OutputStream) this.f2827c).write(iVar2.f2841a, iVar2.f2842b, min);
                    int i2 = iVar2.f2842b + min;
                    iVar2.f2842b = i2;
                    long j4 = (long) min;
                    j2 -= j4;
                    buffer.f2324b -= j4;
                    if (i2 == iVar2.f2843c) {
                        buffer.f2323a = iVar2.a();
                        j.m(iVar2);
                    }
                }
                return;
            default:
                synchronized (((Pipe) this.f2827c).f2357b) {
                    if (!((Pipe) this.f2827c).f2358c) {
                        while (j2 > 0) {
                            Object obj2 = this.f2827c;
                            if (!((Pipe) obj2).f2359d) {
                                long size = ((Pipe) obj2).f2356a - ((Pipe) obj2).f2357b.size();
                                if (size == 0) {
                                    ((Timeout) this.f2826b).waitUntilNotified(((Pipe) this.f2827c).f2357b);
                                } else {
                                    long min2 = Math.min(size, j2);
                                    ((Pipe) this.f2827c).f2357b.write(buffer, min2);
                                    j2 -= min2;
                                    ((Pipe) this.f2827c).f2357b.notifyAll();
                                }
                            } else {
                                throw new IOException("source is closed");
                            }
                        }
                    } else {
                        throw new IllegalStateException("closed");
                    }
                }
                return;
        }
    }
}
