package okio;

import a.a;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import z.c;
import z.d;
import z.i;
import z.j;
import z.k;
import z.m;

/* compiled from: XFMFile */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f2322c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a  reason: collision with root package name */
    public i f2323a;

    /* renamed from: b  reason: collision with root package name */
    public long f2324b;

    /* compiled from: XFMFile */
    public final class UnsafeCursor implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public i f2325a;
        public Buffer buffer;
        public byte[] data;
        public int end = -1;
        public long offset = -1;
        public boolean readWrite;
        public int start = -1;

        public void close() {
            if (this.buffer != null) {
                this.buffer = null;
                this.f2325a = null;
                this.offset = -1;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public long expandBuffer(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException(a.d("minByteCount <= 0: ", i2));
            } else if (i2 <= 8192) {
                Buffer buffer2 = this.buffer;
                if (buffer2 == null) {
                    throw new IllegalStateException("not attached to a buffer");
                } else if (this.readWrite) {
                    long j2 = buffer2.f2324b;
                    i f2 = buffer2.f(i2);
                    int i3 = 8192 - f2.f2843c;
                    f2.f2843c = 8192;
                    long j3 = (long) i3;
                    this.buffer.f2324b = j2 + j3;
                    this.f2325a = f2;
                    this.offset = j2;
                    this.data = f2.f2841a;
                    this.start = 8192 - i3;
                    this.end = 8192;
                    return j3;
                } else {
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                }
            } else {
                throw new IllegalArgumentException(a.d("minByteCount > Segment.SIZE: ", i2));
            }
        }

        public int next() {
            long j2 = this.offset;
            if (j2 != this.buffer.f2324b) {
                return seek(j2 == -1 ? 0 : j2 + ((long) (this.end - this.start)));
            }
            throw new IllegalStateException();
        }

        public long resizeBuffer(long j2) {
            Buffer buffer2 = this.buffer;
            if (buffer2 == null) {
                throw new IllegalStateException("not attached to a buffer");
            } else if (this.readWrite) {
                long j3 = buffer2.f2324b;
                int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                if (i2 <= 0) {
                    if (j2 >= 0) {
                        long j4 = j3 - j2;
                        while (true) {
                            if (j4 <= 0) {
                                break;
                            }
                            Buffer buffer3 = this.buffer;
                            i iVar = buffer3.f2323a.f2847g;
                            int i3 = iVar.f2843c;
                            long j5 = (long) (i3 - iVar.f2842b);
                            if (j5 > j4) {
                                iVar.f2843c = (int) (((long) i3) - j4);
                                break;
                            }
                            buffer3.f2323a = iVar.a();
                            j.m(iVar);
                            j4 -= j5;
                        }
                        this.f2325a = null;
                        this.offset = j2;
                        this.data = null;
                        this.start = -1;
                        this.end = -1;
                    } else {
                        throw new IllegalArgumentException(a.e("newSize < 0: ", j2));
                    }
                } else if (i2 > 0) {
                    long j6 = j2 - j3;
                    boolean z2 = true;
                    while (j6 > 0) {
                        i f2 = this.buffer.f(1);
                        int min = (int) Math.min(j6, (long) (8192 - f2.f2843c));
                        int i4 = f2.f2843c + min;
                        f2.f2843c = i4;
                        j6 -= (long) min;
                        if (z2) {
                            this.f2325a = f2;
                            this.offset = j3;
                            this.data = f2.f2841a;
                            this.start = i4 - min;
                            this.end = i4;
                            z2 = false;
                        }
                    }
                }
                this.buffer.f2324b = j2;
                return j3;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r3 = r0.buffer;
            r6 = r3.f2324b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int seek(long r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r3 = -1
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L_0x00ae
                okio.Buffer r3 = r0.buffer
                long r6 = r3.f2324b
                int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r4 > 0) goto L_0x00ae
                if (r5 == 0) goto L_0x00a1
                if (r4 != 0) goto L_0x0018
                goto L_0x00a1
            L_0x0018:
                z.i r3 = r3.f2323a
                z.i r4 = r0.f2325a
                r8 = 0
                if (r4 == 0) goto L_0x0036
                long r10 = r0.offset
                int r5 = r0.start
                int r12 = r4.f2842b
                int r5 = r5 - r12
                long r12 = (long) r5
                long r10 = r10 - r12
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 <= 0) goto L_0x002f
                r6 = r10
                goto L_0x0037
            L_0x002f:
                r8 = r10
                r16 = r4
                r4 = r3
                r3 = r16
                goto L_0x0037
            L_0x0036:
                r4 = r3
            L_0x0037:
                long r10 = r6 - r1
                long r12 = r1 - r8
                int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r5 <= 0) goto L_0x004e
            L_0x003f:
                int r4 = r3.f2843c
                int r5 = r3.f2842b
                int r4 = r4 - r5
                long r4 = (long) r4
                long r4 = r4 + r8
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x005e
                z.i r3 = r3.f2846f
                r8 = r4
                goto L_0x003f
            L_0x004e:
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r3 <= 0) goto L_0x005c
                z.i r4 = r4.f2847g
                int r3 = r4.f2843c
                int r5 = r4.f2842b
                int r3 = r3 - r5
                long r8 = (long) r3
                long r6 = r6 - r8
                goto L_0x004e
            L_0x005c:
                r3 = r4
                r8 = r6
            L_0x005e:
                boolean r4 = r0.readWrite
                if (r4 == 0) goto L_0x008c
                boolean r4 = r3.f2844d
                if (r4 == 0) goto L_0x008c
                z.i r4 = new z.i
                byte[] r5 = r3.f2841a
                java.lang.Object r5 = r5.clone()
                r11 = r5
                byte[] r11 = (byte[]) r11
                int r12 = r3.f2842b
                int r13 = r3.f2843c
                r14 = 0
                r15 = 1
                r10 = r4
                r10.<init>(r11, r12, r13, r14, r15)
                okio.Buffer r5 = r0.buffer
                z.i r6 = r5.f2323a
                if (r6 != r3) goto L_0x0083
                r5.f2323a = r4
            L_0x0083:
                r3.b(r4)
                z.i r3 = r4.f2847g
                r3.a()
                r3 = r4
            L_0x008c:
                r0.f2325a = r3
                r0.offset = r1
                byte[] r4 = r3.f2841a
                r0.data = r4
                int r4 = r3.f2842b
                long r1 = r1 - r8
                int r2 = (int) r1
                int r4 = r4 + r2
                r0.start = r4
                int r1 = r3.f2843c
                r0.end = r1
                int r1 = r1 - r4
                return r1
            L_0x00a1:
                r3 = 0
                r0.f2325a = r3
                r0.offset = r1
                r0.data = r3
                r1 = -1
                r0.start = r1
                r0.end = r1
                return r1
            L_0x00ae:
                java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                java.lang.Long r1 = java.lang.Long.valueOf(r18)
                r4[r5] = r1
                okio.Buffer r1 = r0.buffer
                long r1 = r1.f2324b
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 1
                r4[r2] = r1
                java.lang.String r1 = "offset=%s > size=%s"
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r3.<init>(r1)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.UnsafeCursor.seek(long):int");
        }
    }

    public static boolean c(i iVar, int i2, ByteString byteString, int i3, int i4) {
        int i5 = iVar.f2843c;
        byte[] bArr = iVar.f2841a;
        while (i3 < i4) {
            if (i2 == i5) {
                iVar = iVar.f2846f;
                byte[] bArr2 = iVar.f2841a;
                int i6 = iVar.f2842b;
                bArr = bArr2;
                i2 = i6;
                i5 = iVar.f2843c;
            }
            if (bArr[i2] != byteString.getByte(i3)) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    public final ByteString a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            i iVar = this.f2323a;
            if (iVar != null) {
                byte[] bArr = iVar.f2841a;
                int i2 = iVar.f2842b;
                instance.update(bArr, i2, iVar.f2843c - i2);
                i iVar2 = this.f2323a;
                while (true) {
                    iVar2 = iVar2.f2846f;
                    if (iVar2 == this.f2323a) {
                        break;
                    }
                    byte[] bArr2 = iVar2.f2841a;
                    int i3 = iVar2.f2842b;
                    instance.update(bArr2, i3, iVar2.f2843c - i3);
                }
            }
            return ByteString.of(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public final ByteString b(ByteString byteString, String str) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            i iVar = this.f2323a;
            if (iVar != null) {
                byte[] bArr = iVar.f2841a;
                int i2 = iVar.f2842b;
                instance.update(bArr, i2, iVar.f2843c - i2);
                i iVar2 = this.f2323a;
                while (true) {
                    iVar2 = iVar2.f2846f;
                    if (iVar2 == this.f2323a) {
                        break;
                    }
                    byte[] bArr2 = iVar2.f2841a;
                    int i3 = iVar2.f2842b;
                    instance.update(bArr2, i3, iVar2.f2843c - i3);
                }
            }
            return ByteString.of(instance.doFinal());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public Buffer buffer() {
        return this;
    }

    public void clear() {
        try {
            skip(this.f2324b);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public Buffer clone() {
        Buffer buffer = new Buffer();
        if (this.f2324b == 0) {
            return buffer;
        }
        i c2 = this.f2323a.c();
        buffer.f2323a = c2;
        c2.f2847g = c2;
        c2.f2846f = c2;
        i iVar = this.f2323a;
        while (true) {
            iVar = iVar.f2846f;
            if (iVar != this.f2323a) {
                buffer.f2323a.f2847g.b(iVar.c());
            } else {
                buffer.f2324b = this.f2324b;
                return buffer;
            }
        }
    }

    public void close() {
    }

    public long completeSegmentByteCount() {
        long j2 = this.f2324b;
        if (j2 == 0) {
            return 0;
        }
        i iVar = this.f2323a.f2847g;
        int i2 = iVar.f2843c;
        return (i2 >= 8192 || !iVar.f2845e) ? j2 : j2 - ((long) (i2 - iVar.f2842b));
    }

    public Buffer copyTo(OutputStream outputStream) {
        return copyTo(outputStream, 0, this.f2324b);
    }

    public Buffer copyTo(OutputStream outputStream, long j2, long j3) {
        if (outputStream != null) {
            m.b(this.f2324b, j2, j3);
            if (j3 == 0) {
                return this;
            }
            i iVar = this.f2323a;
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
                outputStream.write(iVar.f2841a, i4, min);
                j3 -= (long) min;
                iVar = iVar.f2846f;
                j2 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public Buffer copyTo(Buffer buffer, long j2, long j3) {
        if (buffer != null) {
            m.b(this.f2324b, j2, j3);
            if (j3 == 0) {
                return this;
            }
            buffer.f2324b += j3;
            i iVar = this.f2323a;
            while (true) {
                long j4 = (long) (iVar.f2843c - iVar.f2842b);
                if (j2 < j4) {
                    break;
                }
                j2 -= j4;
                iVar = iVar.f2846f;
            }
            while (j3 > 0) {
                i c2 = iVar.c();
                int i2 = (int) (((long) c2.f2842b) + j2);
                c2.f2842b = i2;
                c2.f2843c = Math.min(i2 + ((int) j3), c2.f2843c);
                i iVar2 = buffer.f2323a;
                if (iVar2 == null) {
                    c2.f2847g = c2;
                    c2.f2846f = c2;
                    buffer.f2323a = c2;
                } else {
                    iVar2.f2847g.b(c2);
                }
                j3 -= (long) (c2.f2843c - c2.f2842b);
                iVar = iVar.f2846f;
                j2 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final void d(InputStream inputStream, long j2, boolean z2) {
        if (inputStream != null) {
            while (true) {
                if (j2 > 0 || z2) {
                    i f2 = f(1);
                    int read = inputStream.read(f2.f2841a, f2.f2843c, (int) Math.min(j2, (long) (8192 - f2.f2843c)));
                    if (read != -1) {
                        f2.f2843c += read;
                        long j3 = (long) read;
                        this.f2324b += j3;
                        j2 -= j3;
                    } else if (!z2) {
                        throw new EOFException();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("in == null");
        }
    }

    public final String e(long j2) {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (getByte(j3) == 13) {
                String readUtf8 = readUtf8(j3);
                skip(2);
                return readUtf8;
            }
        }
        String readUtf82 = readUtf8(j2);
        skip(1);
        return readUtf82;
    }

    public BufferedSink emit() {
        return this;
    }

    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        long j2 = this.f2324b;
        if (j2 != buffer.f2324b) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        i iVar = this.f2323a;
        i iVar2 = buffer.f2323a;
        int i2 = iVar.f2842b;
        int i3 = iVar2.f2842b;
        while (j3 < this.f2324b) {
            long min = (long) Math.min(iVar.f2843c - i2, iVar2.f2843c - i3);
            int i4 = 0;
            while (((long) i4) < min) {
                int i5 = i2 + 1;
                int i6 = i3 + 1;
                if (iVar.f2841a[i2] != iVar2.f2841a[i3]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i3 = i6;
            }
            if (i2 == iVar.f2843c) {
                iVar = iVar.f2846f;
                i2 = iVar.f2842b;
            }
            if (i3 == iVar2.f2843c) {
                iVar2 = iVar2.f2846f;
                i3 = iVar2.f2842b;
            }
            j3 += min;
        }
        return true;
    }

    public boolean exhausted() {
        return this.f2324b == 0;
    }

    public final i f(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException();
        }
        i iVar = this.f2323a;
        if (iVar == null) {
            i n2 = j.n();
            this.f2323a = n2;
            n2.f2847g = n2;
            n2.f2846f = n2;
            return n2;
        }
        i iVar2 = iVar.f2847g;
        if (iVar2.f2843c + i2 <= 8192 && iVar2.f2845e) {
            return iVar2;
        }
        i n3 = j.n();
        iVar2.b(n3);
        return n3;
    }

    public void flush() {
    }

    public byte getByte(long j2) {
        int i2;
        m.b(this.f2324b, j2, 1);
        long j3 = this.f2324b;
        if (j3 - j2 > j2) {
            i iVar = this.f2323a;
            while (true) {
                int i3 = iVar.f2843c;
                int i4 = iVar.f2842b;
                long j4 = (long) (i3 - i4);
                if (j2 < j4) {
                    return iVar.f2841a[i4 + ((int) j2)];
                }
                j2 -= j4;
                iVar = iVar.f2846f;
            }
        } else {
            long j5 = j2 - j3;
            i iVar2 = this.f2323a;
            do {
                iVar2 = iVar2.f2847g;
                int i5 = iVar2.f2843c;
                i2 = iVar2.f2842b;
                j5 += (long) (i5 - i2);
            } while (j5 < 0);
            return iVar2.f2841a[i2 + ((int) j5)];
        }
    }

    public int hashCode() {
        i iVar = this.f2323a;
        if (iVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = iVar.f2843c;
            for (int i4 = iVar.f2842b; i4 < i3; i4++) {
                i2 = (i2 * 31) + iVar.f2841a[i4];
            }
            iVar = iVar.f2846f;
        } while (iVar != this.f2323a);
        return i2;
    }

    public ByteString hmacSha1(ByteString byteString) {
        return b(byteString, "HmacSHA1");
    }

    public ByteString hmacSha256(ByteString byteString) {
        return b(byteString, DefaultCrypto.HMAC_SHA256);
    }

    public ByteString hmacSha512(ByteString byteString) {
        return b(byteString, "HmacSHA512");
    }

    public long indexOf(byte b2) {
        return indexOf(b2, 0, Long.MAX_VALUE);
    }

    public long indexOf(byte b2, long j2) {
        return indexOf(b2, j2, Long.MAX_VALUE);
    }

    public long indexOf(byte b2, long j2, long j3) {
        i iVar;
        long j4 = 0;
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f2324b), Long.valueOf(j2), Long.valueOf(j3)}));
        }
        long j5 = this.f2324b;
        long j6 = j3 > j5 ? j5 : j3;
        if (j2 == j6 || (iVar = this.f2323a) == null) {
            return -1;
        }
        if (j5 - j2 < j2) {
            while (j5 > j2) {
                iVar = iVar.f2847g;
                j5 -= (long) (iVar.f2843c - iVar.f2842b);
            }
        } else {
            while (true) {
                long j7 = ((long) (iVar.f2843c - iVar.f2842b)) + j4;
                if (j7 >= j2) {
                    break;
                }
                iVar = iVar.f2846f;
                j4 = j7;
            }
            j5 = j4;
        }
        long j8 = j2;
        while (j5 < j6) {
            byte[] bArr = iVar.f2841a;
            int min = (int) Math.min((long) iVar.f2843c, (((long) iVar.f2842b) + j6) - j5);
            for (int i2 = (int) ((((long) iVar.f2842b) + j8) - j5); i2 < min; i2++) {
                if (bArr[i2] == b2) {
                    return ((long) (i2 - iVar.f2842b)) + j5;
                }
            }
            byte b3 = b2;
            j5 += (long) (iVar.f2843c - iVar.f2842b);
            iVar = iVar.f2846f;
            j8 = j5;
        }
        return -1;
    }

    public long indexOf(ByteString byteString) {
        return indexOf(byteString, 0);
    }

    public long indexOf(ByteString byteString, long j2) {
        ByteString byteString2 = byteString;
        if (byteString.size() != 0) {
            long j3 = 0;
            if (j2 >= 0) {
                i iVar = this.f2323a;
                long j4 = -1;
                if (iVar == null) {
                    return -1;
                }
                long j5 = this.f2324b;
                if (j5 - j2 < j2) {
                    while (j5 > j2) {
                        iVar = iVar.f2847g;
                        j5 -= (long) (iVar.f2843c - iVar.f2842b);
                    }
                } else {
                    while (true) {
                        long j6 = ((long) (iVar.f2843c - iVar.f2842b)) + j3;
                        if (j6 >= j2) {
                            break;
                        }
                        iVar = iVar.f2846f;
                        j3 = j6;
                    }
                    j5 = j3;
                }
                byte b2 = byteString2.getByte(0);
                int size = byteString.size();
                long j7 = (this.f2324b - ((long) size)) + 1;
                long j8 = j5;
                long j9 = j2;
                while (j8 < j7) {
                    byte[] bArr = iVar.f2841a;
                    int min = (int) Math.min((long) iVar.f2843c, (((long) iVar.f2842b) + j7) - j8);
                    for (int i2 = (int) ((((long) iVar.f2842b) + j9) - j8); i2 < min; i2++) {
                        if (bArr[i2] == b2 && c(iVar, i2 + 1, byteString2, 1, size)) {
                            return ((long) (i2 - iVar.f2842b)) + j8;
                        }
                    }
                    j8 += (long) (iVar.f2843c - iVar.f2842b);
                    iVar = iVar.f2846f;
                    j9 = j8;
                    j4 = -1;
                }
                return j4;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    public long indexOfElement(ByteString byteString) {
        return indexOfElement(byteString, 0);
    }

    public long indexOfElement(ByteString byteString, long j2) {
        int i2;
        long j3 = 0;
        if (j2 >= 0) {
            i iVar = this.f2323a;
            if (iVar == null) {
                return -1;
            }
            long j4 = this.f2324b;
            if (j4 - j2 < j2) {
                while (j4 > j2) {
                    iVar = iVar.f2847g;
                    j4 -= (long) (iVar.f2843c - iVar.f2842b);
                }
            } else {
                while (true) {
                    long j5 = ((long) (iVar.f2843c - iVar.f2842b)) + j3;
                    if (j5 >= j2) {
                        break;
                    }
                    iVar = iVar.f2846f;
                    j3 = j5;
                }
                j4 = j3;
            }
            if (byteString.size() == 2) {
                byte b2 = byteString.getByte(0);
                byte b3 = byteString.getByte(1);
                while (j4 < this.f2324b) {
                    byte[] bArr = iVar.f2841a;
                    i2 = (int) ((((long) iVar.f2842b) + j2) - j4);
                    int i3 = iVar.f2843c;
                    while (i2 < i3) {
                        byte b4 = bArr[i2];
                        if (!(b4 == b2 || b4 == b3)) {
                            i2++;
                        }
                    }
                    j4 += (long) (iVar.f2843c - iVar.f2842b);
                    iVar = iVar.f2846f;
                    j2 = j4;
                }
                return -1;
            }
            byte[] d2 = byteString.d();
            while (j4 < this.f2324b) {
                byte[] bArr2 = iVar.f2841a;
                int i4 = (int) ((((long) iVar.f2842b) + j2) - j4);
                int i5 = iVar.f2843c;
                while (i2 < i5) {
                    byte b5 = bArr2[i2];
                    int length = d2.length;
                    int i6 = 0;
                    while (i6 < length) {
                        if (b5 != d2[i6]) {
                            i6++;
                        }
                    }
                    i4 = i2 + 1;
                }
                j4 += (long) (iVar.f2843c - iVar.f2842b);
                iVar = iVar.f2846f;
                j2 = j4;
            }
            return -1;
            return ((long) (i2 - iVar.f2842b)) + j4;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public InputStream inputStream() {
        return new d(this, 0);
    }

    public boolean isOpen() {
        return true;
    }

    public ByteString md5() {
        return a("MD5");
    }

    public OutputStream outputStream() {
        return new c(this, 0);
    }

    public boolean rangeEquals(long j2, ByteString byteString) {
        return rangeEquals(j2, byteString, 0, byteString.size());
    }

    public boolean rangeEquals(long j2, ByteString byteString, int i2, int i3) {
        if (j2 < 0 || i2 < 0 || i3 < 0 || this.f2324b - j2 < ((long) i3) || byteString.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (getByte(((long) i4) + j2) != byteString.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    public int read(ByteBuffer byteBuffer) {
        i iVar = this.f2323a;
        if (iVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), iVar.f2843c - iVar.f2842b);
        byteBuffer.put(iVar.f2841a, iVar.f2842b, min);
        int i2 = iVar.f2842b + min;
        iVar.f2842b = i2;
        this.f2324b -= (long) min;
        if (i2 == iVar.f2843c) {
            this.f2323a = iVar.a();
            j.m(iVar);
        }
        return min;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        m.b((long) bArr.length, (long) i2, (long) i3);
        i iVar = this.f2323a;
        if (iVar == null) {
            return -1;
        }
        int min = Math.min(i3, iVar.f2843c - iVar.f2842b);
        System.arraycopy(iVar.f2841a, iVar.f2842b, bArr, i2, min);
        int i4 = iVar.f2842b + min;
        iVar.f2842b = i4;
        this.f2324b -= (long) min;
        if (i4 == iVar.f2843c) {
            this.f2323a = iVar.a();
            j.m(iVar);
        }
        return min;
    }

    public long read(Buffer buffer, long j2) {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 >= 0) {
            long j3 = this.f2324b;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            buffer.write(this, j2);
            return j2;
        } else {
            throw new IllegalArgumentException(a.e("byteCount < 0: ", j2));
        }
    }

    public long readAll(Sink sink) {
        long j2 = this.f2324b;
        if (j2 > 0) {
            sink.write(this, j2);
        }
        return j2;
    }

    public UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe(new UnsafeCursor());
    }

    public UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public byte readByte() {
        long j2 = this.f2324b;
        if (j2 != 0) {
            i iVar = this.f2323a;
            int i2 = iVar.f2842b;
            int i3 = iVar.f2843c;
            int i4 = i2 + 1;
            byte b2 = iVar.f2841a[i2];
            this.f2324b = j2 - 1;
            if (i4 == i3) {
                this.f2323a = iVar.a();
                j.m(iVar);
            } else {
                iVar.f2842b = i4;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public byte[] readByteArray() {
        try {
            return readByteArray(this.f2324b);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public byte[] readByteArray(long j2) {
        m.b(this.f2324b, 0, j2);
        if (j2 <= 2147483647L) {
            byte[] bArr = new byte[((int) j2)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(a.e("byteCount > Integer.MAX_VALUE: ", j2));
    }

    public ByteString readByteString() {
        return new ByteString(readByteArray());
    }

    public ByteString readByteString(long j2) {
        return new ByteString(readByteArray(j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r2 != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r1.readUtf8());
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095 A[EDGE_INSN: B:47:0x0095->B:29:0x0095 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readDecimalLong() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f2324b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b4
            r1 = 0
            r5 = -7
            r6 = r5
            r2 = 0
            r4 = r3
            r3 = 0
        L_0x0011:
            z.i r8 = r0.f2323a
            byte[] r9 = r8.f2841a
            int r10 = r8.f2842b
            int r11 = r8.f2843c
        L_0x0019:
            if (r10 >= r11) goto L_0x0095
            byte r12 = r9[r10]
            r13 = 48
            if (r12 < r13) goto L_0x0069
            r13 = 57
            if (r12 > r13) goto L_0x0069
            int r13 = 48 - r12
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x003f
            if (r16 != 0) goto L_0x0038
            long r14 = (long) r13
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r14 = 10
            long r4 = r4 * r14
            long r12 = (long) r13
            long r4 = r4 + r12
            goto L_0x0074
        L_0x003f:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r1 = r1.writeDecimalLong((long) r4)
            okio.Buffer r1 = r1.writeByte((int) r12)
            if (r2 != 0) goto L_0x0051
            r1.readByte()
        L_0x0051:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Number too large: "
            r3.<init>(r4)
            java.lang.String r1 = r1.readUtf8()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0069:
            r13 = 45
            r14 = 1
            if (r12 != r13) goto L_0x0079
            if (r1 != 0) goto L_0x0079
            r12 = 1
            long r6 = r6 - r12
            r2 = 1
        L_0x0074:
            int r10 = r10 + 1
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0079:
            if (r1 == 0) goto L_0x007d
            r3 = 1
            goto L_0x0095
        L_0x007d:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.<init>(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r12)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0095:
            if (r10 != r11) goto L_0x00a1
            z.i r9 = r8.a()
            r0.f2323a = r9
            z.j.m(r8)
            goto L_0x00a3
        L_0x00a1:
            r8.f2842b = r10
        L_0x00a3:
            if (r3 != 0) goto L_0x00a9
            z.i r8 = r0.f2323a
            if (r8 != 0) goto L_0x0011
        L_0x00a9:
            long r6 = r0.f2324b
            long r8 = (long) r1
            long r6 = r6 - r8
            r0.f2324b = r6
            if (r2 == 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            long r4 = -r4
        L_0x00b3:
            return r4
        L_0x00b4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    public Buffer readFrom(InputStream inputStream) {
        d(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    public Buffer readFrom(InputStream inputStream, long j2) {
        if (j2 >= 0) {
            d(inputStream, j2, false);
            return this;
        }
        throw new IllegalArgumentException(a.e("byteCount < 0: ", j2));
    }

    public void readFully(Buffer buffer, long j2) {
        long j3 = this.f2324b;
        if (j3 >= j2) {
            buffer.write(this, j2);
        } else {
            buffer.write(this, j3);
            throw new EOFException();
        }
    }

    public void readFully(byte[] bArr) {
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = read(bArr, i2, bArr.length - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        r15.f2323a = r6.a();
        z.j.m(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        r6.f2842b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r1 != false) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readHexadecimalUnsignedLong() {
        /*
            r15 = this;
            long r0 = r15.f2324b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a6
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            z.i r6 = r15.f2323a
            byte[] r7 = r6.f2841a
            int r8 = r6.f2842b
            int r9 = r6.f2843c
        L_0x0013:
            if (r8 >= r9) goto L_0x008b
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x006f
            r11 = 70
            if (r10 > r11) goto L_0x006f
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong((long) r4)
            okio.Buffer r0 = r0.writeByte((int) r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006f:
            if (r0 == 0) goto L_0x0073
            r1 = 1
            goto L_0x008b
        L_0x0073:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008b:
            if (r8 != r9) goto L_0x0097
            z.i r7 = r6.a()
            r15.f2323a = r7
            z.j.m(r6)
            goto L_0x0099
        L_0x0097:
            r6.f2842b = r8
        L_0x0099:
            if (r1 != 0) goto L_0x009f
            z.i r6 = r15.f2323a
            if (r6 != 0) goto L_0x000b
        L_0x009f:
            long r1 = r15.f2324b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f2324b = r1
            return r4
        L_0x00a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    public int readInt() {
        long j2 = this.f2324b;
        if (j2 >= 4) {
            i iVar = this.f2323a;
            int i2 = iVar.f2842b;
            int i3 = iVar.f2843c;
            if (i3 - i2 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            int i4 = i2 + 1;
            byte[] bArr = iVar.f2841a;
            int i5 = i4 + 1;
            byte b2 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i6 = i5 + 1;
            byte b3 = b2 | ((bArr[i5] & 255) << 8);
            int i7 = i6 + 1;
            byte b4 = b3 | (bArr[i6] & 255);
            this.f2324b = j2 - 4;
            if (i7 == i3) {
                this.f2323a = iVar.a();
                j.m(iVar);
            } else {
                iVar.f2842b = i7;
            }
            return b4;
        }
        throw new IllegalStateException("size < 4: " + this.f2324b);
    }

    public int readIntLe() {
        int readInt = readInt();
        Charset charset = m.f2858a;
        return ((readInt & MotionEventCompat.ACTION_MASK) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public long readLong() {
        long j2 = this.f2324b;
        if (j2 >= 8) {
            i iVar = this.f2323a;
            int i2 = iVar.f2842b;
            int i3 = iVar.f2843c;
            if (i3 - i2 < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            int i4 = i2 + 1;
            byte[] bArr = iVar.f2841a;
            int i5 = i4 + 1;
            long j3 = (((long) bArr[i4]) & 255) << 48;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            long j4 = j3 | ((((long) bArr[i2]) & 255) << 56) | ((((long) bArr[i5]) & 255) << 40) | ((((long) bArr[i6]) & 255) << 32);
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            long j5 = j4 | ((((long) bArr[i7]) & 255) << 24) | ((((long) bArr[i8]) & 255) << 16);
            int i10 = i9 + 1;
            int i11 = i10 + 1;
            long j6 = j5 | ((((long) bArr[i9]) & 255) << 8) | (((long) bArr[i10]) & 255);
            this.f2324b = j2 - 8;
            if (i11 == i3) {
                this.f2323a = iVar.a();
                j.m(iVar);
            } else {
                iVar.f2842b = i11;
            }
            return j6;
        }
        throw new IllegalStateException("size < 8: " + this.f2324b);
    }

    public long readLongLe() {
        return m.c(readLong());
    }

    public short readShort() {
        long j2 = this.f2324b;
        if (j2 >= 2) {
            i iVar = this.f2323a;
            int i2 = iVar.f2842b;
            int i3 = iVar.f2843c;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i4 = i2 + 1;
            byte[] bArr = iVar.f2841a;
            int i5 = i4 + 1;
            byte b2 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            this.f2324b = j2 - 2;
            if (i5 == i3) {
                this.f2323a = iVar.a();
                j.m(iVar);
            } else {
                iVar.f2842b = i5;
            }
            return (short) b2;
        }
        throw new IllegalStateException("size < 2: " + this.f2324b);
    }

    public short readShortLe() {
        short readShort = readShort();
        Charset charset = m.f2858a;
        short s2 = readShort & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    public String readString(long j2, Charset charset) {
        m.b(this.f2324b, 0, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j2 > 2147483647L) {
            throw new IllegalArgumentException(a.e("byteCount > Integer.MAX_VALUE: ", j2));
        } else if (j2 == 0) {
            return "";
        } else {
            i iVar = this.f2323a;
            int i2 = iVar.f2842b;
            if (((long) i2) + j2 > ((long) iVar.f2843c)) {
                return new String(readByteArray(j2), charset);
            }
            String str = new String(iVar.f2841a, i2, (int) j2, charset);
            int i3 = (int) (((long) iVar.f2842b) + j2);
            iVar.f2842b = i3;
            this.f2324b -= j2;
            if (i3 == iVar.f2843c) {
                this.f2323a = iVar.a();
                j.m(iVar);
            }
            return str;
        }
    }

    public String readString(Charset charset) {
        try {
            return readString(this.f2324b, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public UnsafeCursor readUnsafe() {
        return readUnsafe(new UnsafeCursor());
    }

    public UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = false;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public String readUtf8() {
        try {
            return readString(this.f2324b, m.f2858a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String readUtf8(long j2) {
        return readString(j2, m.f2858a);
    }

    public int readUtf8CodePoint() {
        byte b2;
        int i2;
        byte b3;
        if (this.f2324b != 0) {
            byte b4 = getByte(0);
            int i3 = 1;
            if ((b4 & 128) == 0) {
                b3 = b4 & Byte.MAX_VALUE;
                i2 = 1;
                b2 = 0;
            } else if ((b4 & 224) == 192) {
                b3 = b4 & 31;
                i2 = 2;
                b2 = 128;
            } else if ((b4 & 240) == 224) {
                b3 = b4 & 15;
                i2 = 3;
                b2 = 2048;
            } else if ((b4 & 248) == 240) {
                b3 = b4 & 7;
                i2 = 4;
                b2 = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j2 = (long) i2;
            if (this.f2324b >= j2) {
                while (i3 < i2) {
                    long j3 = (long) i3;
                    byte b5 = getByte(j3);
                    if ((b5 & 192) == 128) {
                        b3 = (b3 << 6) | (b5 & 63);
                        i3++;
                    } else {
                        skip(j3);
                        return 65533;
                    }
                }
                skip(j2);
                if (b3 > 1114111) {
                    return 65533;
                }
                if ((b3 < 55296 || b3 > 57343) && b3 >= b2) {
                    return b3;
                }
                return 65533;
            }
            throw new EOFException("size < " + i2 + ": " + this.f2324b + " (to read code point prefixed 0x" + Integer.toHexString(b4) + ")");
        }
        throw new EOFException();
    }

    @Nullable
    public String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return e(indexOf);
        }
        long j2 = this.f2324b;
        if (j2 != 0) {
            return readUtf8(j2);
        }
        return null;
    }

    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public String readUtf8LineStrict(long j2) {
        if (j2 >= 0) {
            long j3 = Long.MAX_VALUE;
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 + 1;
            }
            long indexOf = indexOf((byte) 10, 0, j3);
            if (indexOf != -1) {
                return e(indexOf);
            }
            if (j3 < size() && getByte(j3 - 1) == 13 && getByte(j3) == 10) {
                return e(j3);
            }
            Buffer buffer = new Buffer();
            copyTo(buffer, 0, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j2) + " content=" + buffer.readByteString().hex() + 8230);
        }
        throw new IllegalArgumentException(a.e("limit < 0: ", j2));
    }

    public boolean request(long j2) {
        return this.f2324b >= j2;
    }

    public void require(long j2) {
        if (this.f2324b < j2) {
            throw new EOFException();
        }
    }

    public int select(Options options) {
        i iVar = this.f2323a;
        if (iVar == null) {
            return options.indexOf(ByteString.EMPTY);
        }
        ByteString[] byteStringArr = options.f2355a;
        int length = byteStringArr.length;
        int i2 = 0;
        while (i2 < length) {
            ByteString byteString = byteStringArr[i2];
            if (this.f2324b < ((long) byteString.size()) || !c(iVar, iVar.f2842b, byteString, 0, byteString.size())) {
                i2++;
            } else {
                try {
                    skip((long) byteString.size());
                    return i2;
                } catch (EOFException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
        return -1;
    }

    public ByteString sha1() {
        return a("SHA-1");
    }

    public ByteString sha256() {
        return a("SHA-256");
    }

    public ByteString sha512() {
        return a("SHA-512");
    }

    public long size() {
        return this.f2324b;
    }

    public void skip(long j2) {
        while (j2 > 0) {
            i iVar = this.f2323a;
            if (iVar != null) {
                int min = (int) Math.min(j2, (long) (iVar.f2843c - iVar.f2842b));
                long j3 = (long) min;
                this.f2324b -= j3;
                j2 -= j3;
                i iVar2 = this.f2323a;
                int i2 = iVar2.f2842b + min;
                iVar2.f2842b = i2;
                if (i2 == iVar2.f2843c) {
                    this.f2323a = iVar2.a();
                    j.m(iVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public ByteString snapshot() {
        long j2 = this.f2324b;
        if (j2 <= 2147483647L) {
            return snapshot((int) j2);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f2324b);
    }

    public ByteString snapshot(int i2) {
        return i2 == 0 ? ByteString.EMPTY : new k(this, i2);
    }

    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i2 = remaining;
            while (i2 > 0) {
                i f2 = f(1);
                int min = Math.min(i2, 8192 - f2.f2843c);
                byteBuffer.get(f2.f2841a, f2.f2843c, min);
                i2 -= min;
                f2.f2843c += min;
            }
            this.f2324b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public Buffer write(ByteString byteString) {
        if (byteString != null) {
            byteString.e(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public Buffer write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public Buffer write(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            long j2 = (long) i3;
            m.b((long) bArr.length, (long) i2, j2);
            int i4 = i3 + i2;
            while (i2 < i4) {
                i f2 = f(1);
                int min = Math.min(i4 - i2, 8192 - f2.f2843c);
                System.arraycopy(bArr, i2, f2.f2841a, f2.f2843c, min);
                i2 += min;
                f2.f2843c += min;
            }
            this.f2324b += j2;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public BufferedSink write(Source source, long j2) {
        while (j2 > 0) {
            long read = source.read(this, j2);
            if (read != -1) {
                j2 -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public void write(Buffer buffer, long j2) {
        i iVar;
        if (buffer == null) {
            throw new IllegalArgumentException("source == null");
        } else if (buffer != this) {
            m.b(buffer.f2324b, 0, j2);
            while (j2 > 0) {
                i iVar2 = buffer.f2323a;
                int i2 = iVar2.f2843c - iVar2.f2842b;
                int i3 = 0;
                if (j2 < ((long) i2)) {
                    i iVar3 = this.f2323a;
                    i iVar4 = iVar3 != null ? iVar3.f2847g : null;
                    if (iVar4 != null && iVar4.f2845e) {
                        if ((((long) iVar4.f2843c) + j2) - ((long) (iVar4.f2844d ? 0 : iVar4.f2842b)) <= 8192) {
                            iVar2.d(iVar4, (int) j2);
                            buffer.f2324b -= j2;
                            this.f2324b += j2;
                            return;
                        }
                    }
                    int i4 = (int) j2;
                    if (i4 <= 0 || i4 > i2) {
                        throw new IllegalArgumentException();
                    }
                    if (i4 >= 1024) {
                        iVar = iVar2.c();
                    } else {
                        iVar = j.n();
                        System.arraycopy(iVar2.f2841a, iVar2.f2842b, iVar.f2841a, 0, i4);
                    }
                    iVar.f2843c = iVar.f2842b + i4;
                    iVar2.f2842b += i4;
                    iVar2.f2847g.b(iVar);
                    buffer.f2323a = iVar;
                }
                i iVar5 = buffer.f2323a;
                long j3 = (long) (iVar5.f2843c - iVar5.f2842b);
                buffer.f2323a = iVar5.a();
                i iVar6 = this.f2323a;
                if (iVar6 == null) {
                    this.f2323a = iVar5;
                    iVar5.f2847g = iVar5;
                    iVar5.f2846f = iVar5;
                } else {
                    iVar6.f2847g.b(iVar5);
                    i iVar7 = iVar5.f2847g;
                    if (iVar7 == iVar5) {
                        throw new IllegalStateException();
                    } else if (iVar7.f2845e) {
                        int i5 = iVar5.f2843c - iVar5.f2842b;
                        int i6 = 8192 - iVar7.f2843c;
                        if (!iVar7.f2844d) {
                            i3 = iVar7.f2842b;
                        }
                        if (i5 <= i6 + i3) {
                            iVar5.d(iVar7, i5);
                            iVar5.a();
                            j.m(iVar5);
                        }
                    }
                }
                buffer.f2324b -= j3;
                this.f2324b += j3;
                j2 -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public long writeAll(Source source) {
        if (source != null) {
            long j2 = 0;
            while (true) {
                long read = source.read(this, 8192);
                if (read == -1) {
                    return j2;
                }
                j2 += read;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public Buffer writeByte(int i2) {
        i f2 = f(1);
        int i3 = f2.f2843c;
        f2.f2843c = i3 + 1;
        f2.f2841a[i3] = (byte) i2;
        this.f2324b++;
        return this;
    }

    public Buffer writeDecimalLong(long j2) {
        boolean z2;
        byte[] bArr;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            return writeByte(48);
        }
        int i3 = 1;
        if (i2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 >= 100000000) {
            i3 = j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i3 = j2 < SearchActionVerificationClientService.MS_TO_NS ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i3 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i3 = 2;
        }
        if (z2) {
            i3++;
        }
        i f2 = f(i3);
        int i4 = f2.f2843c + i3;
        while (true) {
            bArr = f2.f2841a;
            if (j2 == 0) {
                break;
            }
            i4--;
            bArr[i4] = f2322c[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z2) {
            bArr[i4 - 1] = 45;
        }
        f2.f2843c += i3;
        this.f2324b += (long) i3;
        return this;
    }

    public Buffer writeHexadecimalUnsignedLong(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        i f2 = f(numberOfTrailingZeros);
        int i2 = f2.f2843c;
        for (int i3 = (i2 + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            f2.f2841a[i3] = f2322c[(int) (15 & j2)];
            j2 >>>= 4;
        }
        f2.f2843c += numberOfTrailingZeros;
        this.f2324b += (long) numberOfTrailingZeros;
        return this;
    }

    public Buffer writeInt(int i2) {
        i f2 = f(4);
        int i3 = f2.f2843c;
        int i4 = i3 + 1;
        byte[] bArr = f2.f2841a;
        bArr[i3] = (byte) ((i2 >>> 24) & MotionEventCompat.ACTION_MASK);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & MotionEventCompat.ACTION_MASK);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & MotionEventCompat.ACTION_MASK);
        bArr[i6] = (byte) (i2 & MotionEventCompat.ACTION_MASK);
        f2.f2843c = i6 + 1;
        this.f2324b += 4;
        return this;
    }

    public Buffer writeIntLe(int i2) {
        Charset charset = m.f2858a;
        return writeInt(((i2 & MotionEventCompat.ACTION_MASK) << 24) | ((-16777216 & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8));
    }

    public Buffer writeLong(long j2) {
        i f2 = f(8);
        int i2 = f2.f2843c;
        int i3 = i2 + 1;
        byte[] bArr = f2.f2841a;
        bArr[i2] = (byte) ((int) ((j2 >>> 56) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j2 >>> 48) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j2 >>> 40) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j2 >>> 32) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j2 >>> 24) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j2 >>> 16) & 255));
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((int) ((j2 >>> 8) & 255));
        bArr[i9] = (byte) ((int) (j2 & 255));
        f2.f2843c = i9 + 1;
        this.f2324b += 8;
        return this;
    }

    public Buffer writeLongLe(long j2) {
        return writeLong(m.c(j2));
    }

    public Buffer writeShort(int i2) {
        i f2 = f(2);
        int i3 = f2.f2843c;
        int i4 = i3 + 1;
        byte[] bArr = f2.f2841a;
        bArr[i3] = (byte) ((i2 >>> 8) & MotionEventCompat.ACTION_MASK);
        bArr[i4] = (byte) (i2 & MotionEventCompat.ACTION_MASK);
        f2.f2843c = i4 + 1;
        this.f2324b += 2;
        return this;
    }

    public Buffer writeShortLe(int i2) {
        Charset charset = m.f2858a;
        short s2 = ((short) i2) & 65535;
        return writeShort((int) (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8)));
    }

    public Buffer writeString(String str, int i2, int i3, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i2 < 0) {
            throw new IllegalAccessError(a.d("beginIndex < 0: ", i2));
        } else if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        } else if (i3 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(m.f2858a)) {
            return writeUtf8(str, i2, i3);
        } else {
            byte[] bytes = str.substring(i2, i3).getBytes(charset);
            return write(bytes, 0, bytes.length);
        }
    }

    public Buffer writeString(String str, Charset charset) {
        return writeString(str, 0, str.length(), charset);
    }

    public Buffer writeTo(OutputStream outputStream) {
        return writeTo(outputStream, this.f2324b);
    }

    public Buffer writeTo(OutputStream outputStream, long j2) {
        if (outputStream != null) {
            m.b(this.f2324b, 0, j2);
            i iVar = this.f2323a;
            while (j2 > 0) {
                int min = (int) Math.min(j2, (long) (iVar.f2843c - iVar.f2842b));
                outputStream.write(iVar.f2841a, iVar.f2842b, min);
                int i2 = iVar.f2842b + min;
                iVar.f2842b = i2;
                long j3 = (long) min;
                this.f2324b -= j3;
                j2 -= j3;
                if (i2 == iVar.f2843c) {
                    i a2 = iVar.a();
                    this.f2323a = a2;
                    j.m(iVar);
                    iVar = a2;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public Buffer writeUtf8(String str) {
        return writeUtf8(str, 0, str.length());
    }

    public Buffer writeUtf8(String str, int i2, int i3) {
        int i4;
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i2 < 0) {
            throw new IllegalArgumentException(a.d("beginIndex < 0: ", i2));
        } else if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        } else if (i3 <= str.length()) {
            while (i2 < i3) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < 128) {
                    i f2 = f(1);
                    int i5 = f2.f2843c - i2;
                    int min = Math.min(i3, 8192 - i5);
                    int i6 = i2 + 1;
                    byte[] bArr = f2.f2841a;
                    bArr[i2 + i5] = (byte) charAt2;
                    while (true) {
                        i2 = i6;
                        if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                            int i7 = f2.f2843c;
                            int i8 = (i5 + i2) - i7;
                            f2.f2843c = i7 + i8;
                            this.f2324b += (long) i8;
                        } else {
                            i6 = i2 + 1;
                            bArr[i2 + i5] = (byte) charAt;
                        }
                    }
                    int i72 = f2.f2843c;
                    int i82 = (i5 + i2) - i72;
                    f2.f2843c = i72 + i82;
                    this.f2324b += (long) i82;
                } else {
                    if (charAt2 < 2048) {
                        i4 = (charAt2 >> 6) | 192;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        writeByte((charAt2 >> 12) | 224);
                        i4 = ((charAt2 >> 6) & 63) | 128;
                    } else {
                        int i9 = i2 + 1;
                        char charAt3 = i9 < i3 ? str.charAt(i9) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            writeByte(63);
                            i2 = i9;
                        } else {
                            int i10 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                            writeByte((i10 >> 18) | 240);
                            writeByte(((i10 >> 12) & 63) | 128);
                            writeByte(((i10 >> 6) & 63) | 128);
                            writeByte((i10 & 63) | 128);
                            i2 += 2;
                        }
                    }
                    writeByte(i4);
                    writeByte((int) (charAt2 & '?') | 128);
                    i2++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        }
    }

    public Buffer writeUtf8CodePoint(int i2) {
        int i3;
        int i4;
        if (i2 >= 128) {
            if (i2 < 2048) {
                i4 = (i2 >> 6) | 192;
            } else {
                if (i2 < 65536) {
                    if (i2 < 55296 || i2 > 57343) {
                        i3 = (i2 >> 12) | 224;
                    } else {
                        writeByte(63);
                        return this;
                    }
                } else if (i2 <= 1114111) {
                    writeByte((i2 >> 18) | 240);
                    i3 = ((i2 >> 12) & 63) | 128;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i2));
                }
                writeByte(i3);
                i4 = ((i2 >> 6) & 63) | 128;
            }
            writeByte(i4);
            i2 = (i2 & 63) | 128;
        }
        writeByte(i2);
        return this;
    }
}
