package okio;

import a.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import z.i;

/* compiled from: XFMFile */
public final class GzipSource implements Source {

    /* renamed from: a  reason: collision with root package name */
    public int f2341a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final BufferedSource f2342b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f2343c;

    /* renamed from: d  reason: collision with root package name */
    public final InflaterSource f2344d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f2345e = new CRC32();

    public GzipSource(Source source) {
        if (source != null) {
            Inflater inflater = new Inflater(true);
            this.f2343c = inflater;
            BufferedSource buffer = Okio.buffer(source);
            this.f2342b = buffer;
            this.f2344d = new InflaterSource(buffer, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public static void a(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}));
        }
    }

    public final void b(Buffer buffer, long j2, long j3) {
        i iVar = buffer.f2323a;
        while (true) {
            int i2 = iVar.f2843c;
            int i3 = iVar.f2842b;
            if (j2 < ((long) (i2 - i3))) {
                break;
            }
            j2 -= (long) (i2 - i3);
            iVar = iVar.f2846f;
        }
        while (j3 > 0) {
            int i4 = (int) (((long) iVar.f2842b) + j2);
            int min = (int) Math.min((long) (iVar.f2843c - i4), j3);
            this.f2345e.update(iVar.f2841a, i4, min);
            j3 -= (long) min;
            iVar = iVar.f2846f;
            j2 = 0;
        }
    }

    public void close() {
        this.f2344d.close();
    }

    public long read(Buffer buffer, long j2) {
        byte b2;
        long j3;
        Buffer buffer2 = buffer;
        long j4 = j2;
        int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException(a.e("byteCount < 0: ", j4));
        } else if (i2 == 0) {
            return 0;
        } else {
            int i3 = this.f2341a;
            CRC32 crc32 = this.f2345e;
            BufferedSource bufferedSource = this.f2342b;
            if (i3 == 0) {
                bufferedSource.require(10);
                byte b3 = bufferedSource.buffer().getByte(3);
                boolean z2 = ((b3 >> 1) & 1) == 1;
                if (z2) {
                    b2 = 0;
                    b(bufferedSource.buffer(), 0, 10);
                } else {
                    b2 = 0;
                }
                a("ID1ID2", 8075, bufferedSource.readShort());
                bufferedSource.skip(8);
                if (((b3 >> 2) & 1) == 1) {
                    bufferedSource.require(2);
                    if (z2) {
                        b(bufferedSource.buffer(), 0, 2);
                    }
                    long readShortLe = (long) bufferedSource.buffer().readShortLe();
                    bufferedSource.require(readShortLe);
                    if (z2) {
                        b(bufferedSource.buffer(), 0, readShortLe);
                        j3 = readShortLe;
                    } else {
                        j3 = readShortLe;
                    }
                    bufferedSource.skip(j3);
                }
                if (((b3 >> 3) & 1) == 1) {
                    long indexOf = bufferedSource.indexOf(b2);
                    if (indexOf != -1) {
                        if (z2) {
                            b(bufferedSource.buffer(), 0, indexOf + 1);
                        }
                        bufferedSource.skip(indexOf + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((b3 >> 4) & 1) == 1) {
                    long indexOf2 = bufferedSource.indexOf(b2);
                    if (indexOf2 != -1) {
                        if (z2) {
                            b(bufferedSource.buffer(), 0, indexOf2 + 1);
                        }
                        bufferedSource.skip(indexOf2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    a("FHCRC", bufferedSource.readShortLe(), (short) ((int) crc32.getValue()));
                    crc32.reset();
                }
                this.f2341a = 1;
            }
            if (this.f2341a == 1) {
                long j5 = buffer2.f2324b;
                long read = this.f2344d.read(buffer2, j4);
                if (read != -1) {
                    b(buffer, j5, read);
                    return read;
                }
                this.f2341a = 2;
            }
            if (this.f2341a != 2) {
                return -1;
            }
            a("CRC", bufferedSource.readIntLe(), (int) crc32.getValue());
            a("ISIZE", bufferedSource.readIntLe(), (int) this.f2343c.getBytesWritten());
            this.f2341a = 3;
            if (bufferedSource.exhausted()) {
                return -1;
            }
            throw new IOException("gzip finished without exhausting source");
        }
    }

    public Timeout timeout() {
        return this.f2342b.timeout();
    }
}
