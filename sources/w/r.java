package w;

import android.support.v4.view.MotionEventCompat;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: XFMFile */
public final class r implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f2757g = Logger.getLogger(Http2.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSink f2758a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2759b;

    /* renamed from: c  reason: collision with root package name */
    public final Buffer f2760c;

    /* renamed from: d  reason: collision with root package name */
    public int f2761d = 16384;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2762e;

    /* renamed from: f  reason: collision with root package name */
    public final b f2763f;

    public r(BufferedSink bufferedSink, boolean z2) {
        this.f2758a = bufferedSink;
        this.f2759b = z2;
        Buffer buffer = new Buffer();
        this.f2760c = buffer;
        this.f2763f = new b(buffer);
    }

    public final synchronized void a(Settings settings) {
        if (!this.f2762e) {
            int i2 = this.f2761d;
            int i3 = settings.f2280a;
            if ((i3 & 32) != 0) {
                i2 = settings.f2281b[5];
            }
            this.f2761d = i2;
            if (((i3 & 2) != 0 ? settings.f2281b[1] : -1) != -1) {
                b bVar = this.f2763f;
                int i4 = (i3 & 2) != 0 ? settings.f2281b[1] : -1;
                bVar.getClass();
                int min = Math.min(i4, 16384);
                int i5 = bVar.f2700d;
                if (i5 != min) {
                    if (min < i5) {
                        bVar.f2698b = Math.min(bVar.f2698b, min);
                    }
                    bVar.f2699c = true;
                    bVar.f2700d = min;
                    int i6 = bVar.f2704h;
                    if (min < i6) {
                        if (min == 0) {
                            Arrays.fill(bVar.f2701e, (Object) null);
                            bVar.f2702f = bVar.f2701e.length - 1;
                            bVar.f2703g = 0;
                            bVar.f2704h = 0;
                        } else {
                            bVar.a(i6 - min);
                        }
                    }
                }
            }
            c(0, 0, (byte) 4, (byte) 1);
            this.f2758a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b(boolean z2, int i2, Buffer buffer, int i3) {
        if (!this.f2762e) {
            c(i2, i3, (byte) 0, z2 ? (byte) 1 : 0);
            if (i3 > 0) {
                this.f2758a.write(buffer, (long) i3);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void c(int i2, int i3, byte b2, byte b3) {
        Level level = Level.FINE;
        Logger logger = f2757g;
        if (logger.isLoggable(level)) {
            logger.fine(Http2.a(false, i2, i3, b2, b3));
        }
        int i4 = this.f2761d;
        if (i3 > i4) {
            Object[] objArr = {Integer.valueOf(i4), Integer.valueOf(i3)};
            ByteString byteString = Http2.f2228a;
            throw new IllegalArgumentException(Util.format("FRAME_SIZE_ERROR length > %d: %d", objArr));
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            int i5 = (i3 >>> 16) & MotionEventCompat.ACTION_MASK;
            BufferedSink bufferedSink = this.f2758a;
            bufferedSink.writeByte(i5);
            bufferedSink.writeByte((i3 >>> 8) & MotionEventCompat.ACTION_MASK);
            bufferedSink.writeByte(i3 & MotionEventCompat.ACTION_MASK);
            bufferedSink.writeByte(b2 & 255);
            bufferedSink.writeByte(b3 & 255);
            bufferedSink.writeInt(i2 & Integer.MAX_VALUE);
        } else {
            Object[] objArr2 = {Integer.valueOf(i2)};
            ByteString byteString2 = Http2.f2228a;
            throw new IllegalArgumentException(Util.format("reserved bit set: %s", objArr2));
        }
    }

    public final synchronized void close() {
        this.f2762e = true;
        this.f2758a.close();
    }

    public final synchronized void d(int i2, ErrorCode errorCode, byte[] bArr) {
        if (this.f2762e) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            c(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f2758a.writeInt(i2);
            this.f2758a.writeInt(errorCode.httpCode);
            if (bArr.length > 0) {
                this.f2758a.write(bArr);
            }
            this.f2758a.flush();
        } else {
            ByteString byteString = Http2.f2228a;
            throw new IllegalArgumentException(Util.format("errorCode.httpCode == -1", new Object[0]));
        }
    }

    public final void e(int i2, List list, boolean z2) {
        if (!this.f2762e) {
            this.f2763f.d(list);
            Buffer buffer = this.f2760c;
            long size = buffer.size();
            int min = (int) Math.min((long) this.f2761d, size);
            long j2 = (long) min;
            int i3 = (size > j2 ? 1 : (size == j2 ? 0 : -1));
            byte b2 = i3 == 0 ? (byte) 4 : 0;
            if (z2) {
                b2 = (byte) (b2 | 1);
            }
            c(i2, min, (byte) 1, b2);
            this.f2758a.write(buffer, j2);
            if (i3 > 0) {
                l(i2, size - j2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void f(int i2, int i3, boolean z2) {
        if (!this.f2762e) {
            c(0, 8, (byte) 6, z2 ? (byte) 1 : 0);
            this.f2758a.writeInt(i2);
            this.f2758a.writeInt(i3);
            this.f2758a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.f2762e) {
            this.f2758a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void g(int i2, int i3, List list) {
        if (!this.f2762e) {
            this.f2763f.d(list);
            long size = this.f2760c.size();
            int min = (int) Math.min((long) (this.f2761d - 4), size);
            long j2 = (long) min;
            int i4 = (size > j2 ? 1 : (size == j2 ? 0 : -1));
            c(i2, min + 4, (byte) 5, i4 == 0 ? (byte) 4 : 0);
            this.f2758a.writeInt(i3 & Integer.MAX_VALUE);
            this.f2758a.write(this.f2760c, j2);
            if (i4 > 0) {
                l(i2, size - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void h(int i2, ErrorCode errorCode) {
        if (this.f2762e) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            c(i2, 4, (byte) 3, (byte) 0);
            this.f2758a.writeInt(errorCode.httpCode);
            this.f2758a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void i(Settings settings) {
        if (!this.f2762e) {
            c(0, Integer.bitCount(settings.f2280a) * 6, (byte) 4, (byte) 0);
            int i2 = 0;
            while (i2 < 10) {
                boolean z2 = true;
                if (((1 << i2) & settings.f2280a) == 0) {
                    z2 = false;
                }
                if (z2) {
                    this.f2758a.writeShort(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                    this.f2758a.writeInt(settings.f2281b[i2]);
                }
                i2++;
            }
            this.f2758a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void j(boolean z2, int i2, List list) {
        if (!this.f2762e) {
            e(i2, list, z2);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(int i2, long j2) {
        if (this.f2762e) {
            throw new IOException("closed");
        } else if (j2 == 0 || j2 > 2147483647L) {
            Object[] objArr = {Long.valueOf(j2)};
            ByteString byteString = Http2.f2228a;
            throw new IllegalArgumentException(Util.format("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr));
        } else {
            c(i2, 4, (byte) 8, (byte) 0);
            this.f2758a.writeInt((int) j2);
            this.f2758a.flush();
        }
    }

    public final void l(int i2, long j2) {
        while (j2 > 0) {
            int min = (int) Math.min((long) this.f2761d, j2);
            long j3 = (long) min;
            j2 -= j3;
            c(i2, min, (byte) 9, j2 == 0 ? (byte) 4 : 0);
            this.f2758a.write(this.f2760c, j3);
        }
    }
}
