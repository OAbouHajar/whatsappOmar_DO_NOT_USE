package w;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: XFMFile */
public final class n implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f2740e = Logger.getLogger(Http2.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSource f2741a;

    /* renamed from: b  reason: collision with root package name */
    public final m f2742b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2743c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2744d;

    public n(BufferedSource bufferedSource, boolean z2) {
        this.f2741a = bufferedSource;
        this.f2743c = z2;
        m mVar = new m(bufferedSource);
        this.f2742b = mVar;
        this.f2744d = new a(mVar);
    }

    public static int a(int i2, byte b2, short s2) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s2 <= i2) {
            return (short) (i2 - s2);
        }
        Http2.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i2));
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0254, code lost:
        if (r17 == false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0256, code lost:
        r7.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(boolean r20, w.k r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            r2 = 0
            okio.BufferedSource r3 = r1.f2741a     // Catch:{ IOException -> 0x0283 }
            r4 = 9
            r3.require(r4)     // Catch:{ IOException -> 0x0283 }
            okio.BufferedSource r3 = r1.f2741a
            byte r4 = r3.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            byte r5 = r3.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            r4 = 1
            r5 = 0
            if (r3 < 0) goto L_0x0274
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r6) goto L_0x0274
            okio.BufferedSource r6 = r1.f2741a
            byte r6 = r6.readByte()
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r7 = 4
            if (r20 == 0) goto L_0x004b
            if (r6 != r7) goto L_0x003d
            goto L_0x004b
        L_0x003d:
            java.lang.String r0 = "Expected a SETTINGS frame but was %s"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r6)
            r3[r2] = r4
            okhttp3.internal.http2.Http2.b(r0, r3)
            throw r5
        L_0x004b:
            okio.BufferedSource r8 = r1.f2741a
            byte r8 = r8.readByte()
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            okio.BufferedSource r9 = r1.f2741a
            int r9 = r9.readInt()
            r10 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r10
            java.util.logging.Logger r10 = f2740e
            java.util.logging.Level r11 = java.util.logging.Level.FINE
            boolean r11 = r10.isLoggable(r11)
            if (r11 == 0) goto L_0x006f
            java.lang.String r11 = okhttp3.internal.http2.Http2.a(r4, r9, r3, r6, r8)
            r10.fine(r11)
        L_0x006f:
            r10 = 2
            switch(r6) {
                case 0: goto L_0x012f;
                case 1: goto L_0x0129;
                case 2: goto L_0x0102;
                case 3: goto L_0x0094;
                case 4: goto L_0x008f;
                case 5: goto L_0x008a;
                case 6: goto L_0x0085;
                case 7: goto L_0x0080;
                case 8: goto L_0x007b;
                default: goto L_0x0073;
            }
        L_0x0073:
            okio.BufferedSource r0 = r1.f2741a
            long r2 = (long) r3
            r0.skip(r2)
            goto L_0x012c
        L_0x007b:
            r1.j(r0, r3, r9)
            goto L_0x012c
        L_0x0080:
            r1.d(r0, r3, r9)
            goto L_0x012c
        L_0x0085:
            r1.g(r0, r3, r8, r9)
            goto L_0x012c
        L_0x008a:
            r1.h(r0, r3, r8, r9)
            goto L_0x012c
        L_0x008f:
            r1.i(r0, r3, r8, r9)
            goto L_0x012c
        L_0x0094:
            if (r3 != r7) goto L_0x00f4
            if (r9 == 0) goto L_0x00ec
            okio.BufferedSource r3 = r1.f2741a
            int r3 = r3.readInt()
            okhttp3.internal.http2.ErrorCode r6 = okhttp3.internal.http2.ErrorCode.fromHttp2(r3)
            if (r6 == 0) goto L_0x00de
            java.lang.Object r0 = r0.f2731b
            okhttp3.internal.http2.Http2Connection r0 = (okhttp3.internal.http2.Http2Connection) r0
            r0.getClass()
            if (r9 == 0) goto L_0x00b3
            r3 = r9 & 1
            if (r3 != 0) goto L_0x00b3
            r3 = 1
            goto L_0x00b4
        L_0x00b3:
            r3 = 0
        L_0x00b4:
            if (r3 == 0) goto L_0x00d4
            w.e r3 = new w.e
            java.lang.String r13 = "OkHttp %s Push Reset[%s]"
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.String r5 = r0.f2243d
            r14[r2] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r14[r4] = r2
            r17 = 1
            r11 = r3
            r12 = r0
            r15 = r9
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.e(r3)
            goto L_0x012c
        L_0x00d4:
            okhttp3.internal.http2.Http2Stream r0 = r0.f(r9)
            if (r0 == 0) goto L_0x012c
            r0.f(r6)
            goto L_0x012c
        L_0x00de:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_RST_STREAM unexpected error code: %d"
            okhttp3.internal.http2.Http2.b(r2, r0)
            throw r5
        L_0x00ec:
            java.lang.String r0 = "TYPE_RST_STREAM streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            okhttp3.internal.http2.Http2.b(r0, r2)
            throw r5
        L_0x00f4:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_RST_STREAM length: %d != 4"
            okhttp3.internal.http2.Http2.b(r2, r0)
            throw r5
        L_0x0102:
            r6 = 5
            if (r3 != r6) goto L_0x011b
            if (r9 == 0) goto L_0x0113
            okio.BufferedSource r2 = r1.f2741a
            r2.readInt()
            r2.readByte()
            r21.getClass()
            goto L_0x012c
        L_0x0113:
            java.lang.String r0 = "TYPE_PRIORITY streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            okhttp3.internal.http2.Http2.b(r0, r2)
            throw r5
        L_0x011b:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_PRIORITY length: %d != 5"
            okhttp3.internal.http2.Http2.b(r2, r0)
            throw r5
        L_0x0129:
            r1.f(r0, r3, r8, r9)
        L_0x012c:
            r0 = 1
            goto L_0x0273
        L_0x012f:
            if (r9 == 0) goto L_0x026b
            r6 = r8 & 1
            if (r6 == 0) goto L_0x0138
            r17 = 1
            goto L_0x013a
        L_0x0138:
            r17 = 0
        L_0x013a:
            r6 = r8 & 32
            if (r6 == 0) goto L_0x0140
            r6 = 1
            goto L_0x0141
        L_0x0140:
            r6 = 0
        L_0x0141:
            if (r6 != 0) goto L_0x0263
            r5 = r8 & 8
            if (r5 == 0) goto L_0x0151
            okio.BufferedSource r5 = r1.f2741a
            byte r5 = r5.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            short r5 = (short) r5
            goto L_0x0152
        L_0x0151:
            r5 = 0
        L_0x0152:
            int r3 = a(r3, r8, r5)
            okio.BufferedSource r6 = r1.f2741a
            java.lang.Object r7 = r0.f2731b
            okhttp3.internal.http2.Http2Connection r7 = (okhttp3.internal.http2.Http2Connection) r7
            r7.getClass()
            if (r9 == 0) goto L_0x0167
            r7 = r9 & 1
            if (r7 != 0) goto L_0x0167
            r7 = 1
            goto L_0x0168
        L_0x0167:
            r7 = 0
        L_0x0168:
            if (r7 == 0) goto L_0x01bd
            java.lang.Object r0 = r0.f2731b
            okhttp3.internal.http2.Http2Connection r0 = (okhttp3.internal.http2.Http2Connection) r0
            r0.getClass()
            okio.Buffer r15 = new okio.Buffer
            r15.<init>()
            long r7 = (long) r3
            r6.require(r7)
            r6.read(r15, r7)
            long r11 = r15.size()
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x019f
            w.h r6 = new w.h
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.String r7 = r0.f2243d
            r13[r2] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r13[r4] = r2
            r11 = r6
            r12 = r0
            r14 = r9
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.e(r6)
            goto L_0x01db
        L_0x019f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r4 = r15.size()
            r2.append(r4)
            java.lang.String r4 = " != "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x01bd:
            java.lang.Object r7 = r0.f2731b
            okhttp3.internal.http2.Http2Connection r7 = (okhttp3.internal.http2.Http2Connection) r7
            okhttp3.internal.http2.Http2Stream r7 = r7.c(r9)
            if (r7 != 0) goto L_0x01df
            java.lang.Object r2 = r0.f2731b
            okhttp3.internal.http2.Http2Connection r2 = (okhttp3.internal.http2.Http2Connection) r2
            okhttp3.internal.http2.ErrorCode r7 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            r2.i(r9, r7)
            java.lang.Object r0 = r0.f2731b
            okhttp3.internal.http2.Http2Connection r0 = (okhttp3.internal.http2.Http2Connection) r0
            long r2 = (long) r3
            r0.g(r2)
            r6.skip(r2)
        L_0x01db:
            r16 = r5
            goto L_0x0259
        L_0x01df:
            w.p r0 = r7.f2275h
            long r8 = (long) r3
        L_0x01e2:
            r10 = 0
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x024f
            okhttp3.internal.http2.Http2Stream r3 = r0.f2754f
            monitor-enter(r3)
            boolean r12 = r0.f2753e     // Catch:{ all -> 0x024c }
            okio.Buffer r13 = r0.f2750b     // Catch:{ all -> 0x024c }
            long r13 = r13.size()     // Catch:{ all -> 0x024c }
            long r13 = r13 + r8
            r16 = r5
            long r4 = r0.f2751c     // Catch:{ all -> 0x024c }
            int r18 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r18 <= 0) goto L_0x01fe
            r4 = 1
            goto L_0x01ff
        L_0x01fe:
            r4 = 0
        L_0x01ff:
            monitor-exit(r3)     // Catch:{ all -> 0x024c }
            if (r4 == 0) goto L_0x020d
            r6.skip(r8)
            okhttp3.internal.http2.Http2Stream r0 = r0.f2754f
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
            r0.closeLater(r2)
            goto L_0x0254
        L_0x020d:
            if (r12 == 0) goto L_0x0213
            r6.skip(r8)
            goto L_0x0254
        L_0x0213:
            okio.Buffer r3 = r0.f2749a
            long r3 = r6.read(r3, r8)
            r12 = -1
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0246
            long r8 = r8 - r3
            okhttp3.internal.http2.Http2Stream r3 = r0.f2754f
            monitor-enter(r3)
            okio.Buffer r4 = r0.f2750b     // Catch:{ all -> 0x0243 }
            long r4 = r4.size()     // Catch:{ all -> 0x0243 }
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x022f
            r4 = 1
            goto L_0x0230
        L_0x022f:
            r4 = 0
        L_0x0230:
            okio.Buffer r5 = r0.f2750b     // Catch:{ all -> 0x0243 }
            okio.Buffer r10 = r0.f2749a     // Catch:{ all -> 0x0243 }
            r5.writeAll(r10)     // Catch:{ all -> 0x0243 }
            if (r4 == 0) goto L_0x023e
            okhttp3.internal.http2.Http2Stream r4 = r0.f2754f     // Catch:{ all -> 0x0243 }
            r4.notifyAll()     // Catch:{ all -> 0x0243 }
        L_0x023e:
            monitor-exit(r3)     // Catch:{ all -> 0x0243 }
            r5 = r16
            r4 = 1
            goto L_0x01e2
        L_0x0243:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0243 }
            throw r0
        L_0x0246:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x024c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x024c }
            throw r0
        L_0x024f:
            r16 = r5
            r0.getClass()
        L_0x0254:
            if (r17 == 0) goto L_0x0259
            r7.d()
        L_0x0259:
            okio.BufferedSource r0 = r1.f2741a
            r2 = r16
            long r2 = (long) r2
            r0.skip(r2)
            goto L_0x012c
        L_0x0263:
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            okhttp3.internal.http2.Http2.b(r0, r2)
            throw r5
        L_0x026b:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            okhttp3.internal.http2.Http2.b(r0, r2)
            throw r5
        L_0x0273:
            return r0
        L_0x0274:
            r0 = 1
            java.lang.String r4 = "FRAME_SIZE_ERROR: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            okhttp3.internal.http2.Http2.b(r4, r0)
            throw r5
        L_0x0283:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.b(boolean, w.k):boolean");
    }

    public final void c(k kVar) {
        if (!this.f2743c) {
            ByteString byteString = Http2.f2228a;
            ByteString readByteString = this.f2741a.readByteString((long) byteString.size());
            Level level = Level.FINE;
            Logger logger = f2740e;
            if (logger.isLoggable(level)) {
                logger.fine(Util.format("<< CONNECTION %s", readByteString.hex()));
            }
            if (!byteString.equals(readByteString)) {
                Http2.b("Expected a connection header but was %s", readByteString.utf8());
                throw null;
            }
        } else if (!b(true, kVar)) {
            Http2.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public final void close() {
        this.f2741a.close();
    }

    public final void d(k kVar, int i2, int i3) {
        Http2Stream[] http2StreamArr;
        if (i2 < 8) {
            Http2.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.f2741a.readInt();
            int readInt2 = this.f2741a.readInt();
            int i4 = i2 - 8;
            if (ErrorCode.fromHttp2(readInt2) != null) {
                ByteString byteString = ByteString.EMPTY;
                if (i4 > 0) {
                    byteString = this.f2741a.readByteString((long) i4);
                }
                kVar.getClass();
                byteString.size();
                synchronized (((Http2Connection) kVar.f2731b)) {
                    http2StreamArr = (Http2Stream[]) ((Http2Connection) kVar.f2731b).f2242c.values().toArray(new Http2Stream[((Http2Connection) kVar.f2731b).f2242c.size()]);
                    ((Http2Connection) kVar.f2731b).f2246g = true;
                }
                for (Http2Stream http2Stream : http2StreamArr) {
                    if (http2Stream.getId() > readInt && http2Stream.isLocallyInitiated()) {
                        http2Stream.f(ErrorCode.REFUSED_STREAM);
                        ((Http2Connection) kVar.f2731b).f(http2Stream.getId());
                    }
                }
                return;
            }
            Http2.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            Http2.b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e9, code lost:
        throw new java.io.IOException("Invalid dynamic table size update " + r3.f2692d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList e(int r3, short r4, byte r5, int r6) {
        /*
            r2 = this;
            w.m r0 = r2.f2742b
            r0.f2738e = r3
            r0.f2735b = r3
            r0.f2739f = r4
            r0.f2736c = r5
            r0.f2737d = r6
        L_0x000c:
            w.a r3 = r2.f2744d
            okio.BufferedSource r4 = r3.f2690b
            boolean r5 = r4.exhausted()
            java.util.ArrayList r6 = r3.f2689a
            if (r5 != 0) goto L_0x0128
            byte r4 = r4.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x0120
            r0 = r4 & 128(0x80, float:1.794E-43)
            r1 = 0
            if (r0 != r5) goto L_0x006b
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            r5 = 1
            if (r4 < 0) goto L_0x0039
            okhttp3.internal.http2.Header[] r0 = w.c.f2705a
            int r0 = r0.length
            int r0 = r0 - r5
            if (r4 > r0) goto L_0x0039
            r1 = 1
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            okhttp3.internal.http2.Header[] r3 = w.c.f2705a
            r3 = r3[r4]
            goto L_0x0052
        L_0x0040:
            okhttp3.internal.http2.Header[] r0 = w.c.f2705a
            int r0 = r0.length
            int r0 = r4 - r0
            int r1 = r3.f2694f
            int r1 = r1 + r5
            int r1 = r1 + r0
            if (r1 < 0) goto L_0x0056
            okhttp3.internal.http2.Header[] r3 = r3.f2693e
            int r0 = r3.length
            if (r1 >= r0) goto L_0x0056
            r3 = r3[r1]
        L_0x0052:
            r6.add(r3)
            goto L_0x000c
        L_0x0056:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Header index too large "
            r6.<init>(r0)
            int r4 = r4 + r5
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.<init>(r4)
            throw r3
        L_0x006b:
            r5 = 64
            if (r4 != r5) goto L_0x0083
            okio.ByteString r4 = r3.d()
            w.c.a(r4)
            okio.ByteString r5 = r3.d()
            okhttp3.internal.http2.Header r6 = new okhttp3.internal.http2.Header
            r6.<init>((okio.ByteString) r4, (okio.ByteString) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x0083:
            r0 = r4 & 64
            if (r0 != r5) goto L_0x00a1
            r5 = 63
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            okio.ByteString r4 = r3.b(r4)
            okio.ByteString r5 = r3.d()
            okhttp3.internal.http2.Header r6 = new okhttp3.internal.http2.Header
            r6.<init>((okio.ByteString) r4, (okio.ByteString) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x00a1:
            r5 = r4 & 32
            r0 = 32
            if (r5 != r0) goto L_0x00ea
            r5 = 31
            int r4 = r3.e(r4, r5)
            r3.f2692d = r4
            if (r4 < 0) goto L_0x00d4
            int r5 = r3.f2691c
            if (r4 > r5) goto L_0x00d4
            int r5 = r3.f2696h
            if (r4 >= r5) goto L_0x000c
            if (r4 != 0) goto L_0x00ce
            okhttp3.internal.http2.Header[] r4 = r3.f2693e
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            okhttp3.internal.http2.Header[] r4 = r3.f2693e
            int r4 = r4.length
            int r4 = r4 + -1
            r3.f2694f = r4
            r3.f2695g = r1
            r3.f2696h = r1
            goto L_0x000c
        L_0x00ce:
            int r5 = r5 - r4
            r3.a(r5)
            goto L_0x000c
        L_0x00d4:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid dynamic table size update "
            r5.<init>(r6)
            int r3 = r3.f2692d
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00ea:
            r5 = 16
            if (r4 == r5) goto L_0x010b
            if (r4 != 0) goto L_0x00f1
            goto L_0x010b
        L_0x00f1:
            r5 = 15
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            okio.ByteString r4 = r3.b(r4)
            okio.ByteString r3 = r3.d()
            okhttp3.internal.http2.Header r5 = new okhttp3.internal.http2.Header
            r5.<init>((okio.ByteString) r4, (okio.ByteString) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x010b:
            okio.ByteString r4 = r3.d()
            w.c.a(r4)
            okio.ByteString r3 = r3.d()
            okhttp3.internal.http2.Header r5 = new okhttp3.internal.http2.Header
            r5.<init>((okio.ByteString) r4, (okio.ByteString) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0120:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x0128:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            r6.clear()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.e(int, short, byte, int):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        r2.e(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e7, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e9, code lost:
        r2.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(w.k r17, int r18, byte r19, int r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            r8 = r20
            r9 = 0
            if (r8 == 0) goto L_0x00f0
            r3 = r2 & 1
            r10 = 1
            if (r3 == 0) goto L_0x0012
            r7 = 1
            goto L_0x0013
        L_0x0012:
            r7 = 0
        L_0x0013:
            r3 = r2 & 8
            if (r3 == 0) goto L_0x0021
            okio.BufferedSource r3 = r1.f2741a
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            short r3 = (short) r3
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            r4 = r2 & 32
            if (r4 == 0) goto L_0x0034
            okio.BufferedSource r4 = r1.f2741a
            r4.readInt()
            r4.readByte()
            r17.getClass()
            int r4 = r18 + -5
            goto L_0x0036
        L_0x0034:
            r4 = r18
        L_0x0036:
            int r4 = a(r4, r2, r3)
            java.util.ArrayList r11 = r1.e(r4, r3, r2, r8)
            java.lang.Object r2 = r0.f2731b
            okhttp3.internal.http2.Http2Connection r2 = (okhttp3.internal.http2.Http2Connection) r2
            r2.getClass()
            if (r8 == 0) goto L_0x004d
            r2 = r8 & 1
            if (r2 != 0) goto L_0x004d
            r2 = 1
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            r12 = 2
            if (r2 == 0) goto L_0x0073
            java.lang.Object r0 = r0.f2731b
            okhttp3.internal.http2.Http2Connection r0 = (okhttp3.internal.http2.Http2Connection) r0
            r0.getClass()
            w.g r13 = new w.g     // Catch:{ RejectedExecutionException -> 0x00ec }
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ RejectedExecutionException -> 0x00ec }
            java.lang.String r2 = r0.f2243d     // Catch:{ RejectedExecutionException -> 0x00ec }
            r4[r9] = r2     // Catch:{ RejectedExecutionException -> 0x00ec }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ RejectedExecutionException -> 0x00ec }
            r4[r10] = r2     // Catch:{ RejectedExecutionException -> 0x00ec }
            r2 = r13
            r3 = r0
            r5 = r20
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ RejectedExecutionException -> 0x00ec }
            r0.e(r13)     // Catch:{ RejectedExecutionException -> 0x00ec }
            goto L_0x00ec
        L_0x0073:
            java.lang.Object r2 = r0.f2731b
            r13 = r2
            okhttp3.internal.http2.Http2Connection r13 = (okhttp3.internal.http2.Http2Connection) r13
            monitor-enter(r13)
            java.lang.Object r2 = r0.f2731b     // Catch:{ all -> 0x00ed }
            okhttp3.internal.http2.Http2Connection r2 = (okhttp3.internal.http2.Http2Connection) r2     // Catch:{ all -> 0x00ed }
            okhttp3.internal.http2.Http2Stream r2 = r2.c(r8)     // Catch:{ all -> 0x00ed }
            if (r2 != 0) goto L_0x00e3
            java.lang.Object r2 = r0.f2731b     // Catch:{ all -> 0x00ed }
            r3 = r2
            okhttp3.internal.http2.Http2Connection r3 = (okhttp3.internal.http2.Http2Connection) r3     // Catch:{ all -> 0x00ed }
            boolean r3 = r3.f2246g     // Catch:{ all -> 0x00ed }
            if (r3 == 0) goto L_0x008d
            goto L_0x00e1
        L_0x008d:
            r3 = r2
            okhttp3.internal.http2.Http2Connection r3 = (okhttp3.internal.http2.Http2Connection) r3     // Catch:{ all -> 0x00ed }
            int r3 = r3.f2244e     // Catch:{ all -> 0x00ed }
            if (r8 > r3) goto L_0x0095
            goto L_0x00e1
        L_0x0095:
            int r3 = r8 % 2
            r4 = r2
            okhttp3.internal.http2.Http2Connection r4 = (okhttp3.internal.http2.Http2Connection) r4     // Catch:{ all -> 0x00ed }
            int r4 = r4.f2245f     // Catch:{ all -> 0x00ed }
            int r4 = r4 % r12
            if (r3 != r4) goto L_0x00a0
            goto L_0x00e1
        L_0x00a0:
            okhttp3.internal.http2.Http2Stream r14 = new okhttp3.internal.http2.Http2Stream     // Catch:{ all -> 0x00ed }
            r4 = r2
            okhttp3.internal.http2.Http2Connection r4 = (okhttp3.internal.http2.Http2Connection) r4     // Catch:{ all -> 0x00ed }
            r5 = 0
            r2 = r14
            r3 = r20
            r6 = r7
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00ed }
            java.lang.Object r2 = r0.f2731b     // Catch:{ all -> 0x00ed }
            r3 = r2
            okhttp3.internal.http2.Http2Connection r3 = (okhttp3.internal.http2.Http2Connection) r3     // Catch:{ all -> 0x00ed }
            r3.f2244e = r8     // Catch:{ all -> 0x00ed }
            okhttp3.internal.http2.Http2Connection r2 = (okhttp3.internal.http2.Http2Connection) r2     // Catch:{ all -> 0x00ed }
            java.util.LinkedHashMap r2 = r2.f2242c     // Catch:{ all -> 0x00ed }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x00ed }
            r2.put(r3, r14)     // Catch:{ all -> 0x00ed }
            java.util.concurrent.ThreadPoolExecutor r11 = okhttp3.internal.http2.Http2Connection.f2239u     // Catch:{ all -> 0x00ed }
            w.k r15 = new w.k     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = "OkHttp %s stream %d"
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x00ed }
            java.lang.Object r2 = r0.f2731b     // Catch:{ all -> 0x00ed }
            okhttp3.internal.http2.Http2Connection r2 = (okhttp3.internal.http2.Http2Connection) r2     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = r2.f2243d     // Catch:{ all -> 0x00ed }
            r5[r9] = r2     // Catch:{ all -> 0x00ed }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x00ed }
            r5[r10] = r2     // Catch:{ all -> 0x00ed }
            r7 = 0
            r2 = r15
            r3 = r17
            r6 = r14
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00ed }
            r11.execute(r15)     // Catch:{ all -> 0x00ed }
        L_0x00e1:
            monitor-exit(r13)     // Catch:{ all -> 0x00ed }
            goto L_0x00ec
        L_0x00e3:
            monitor-exit(r13)     // Catch:{ all -> 0x00ed }
            r2.e(r11)
            if (r7 == 0) goto L_0x00ec
            r2.d()
        L_0x00ec:
            return
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00ed }
            throw r0
        L_0x00f0:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r9]
            okhttp3.internal.http2.Http2.b(r0, r2)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.f(w.k, int, byte, int):void");
    }

    public final void g(k kVar, int i2, byte b2, int i3) {
        if (i2 != 8) {
            Http2.b("TYPE_PING length != 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.f2741a.readInt();
            int readInt2 = this.f2741a.readInt();
            boolean z2 = (b2 & 1) != 0;
            kVar.getClass();
            if (z2) {
                synchronized (((Http2Connection) kVar.f2731b)) {
                    Object obj = kVar.f2731b;
                    ((Http2Connection) obj).f2250k = false;
                    ((Http2Connection) obj).notifyAll();
                }
                return;
            }
            try {
                Object obj2 = kVar.f2731b;
                ((Http2Connection) obj2).f2247h.execute(new j((Http2Connection) obj2, true, readInt, readInt2));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            Http2.b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    public final void h(k kVar, int i2, byte b2, int i3) {
        if (i3 != 0) {
            short readByte = (b2 & 8) != 0 ? (short) (this.f2741a.readByte() & 255) : 0;
            int readInt = this.f2741a.readInt() & Integer.MAX_VALUE;
            ArrayList e2 = e(a(i2 - 4, b2, readByte), readByte, b2, i3);
            Http2Connection http2Connection = (Http2Connection) kVar.f2731b;
            synchronized (http2Connection) {
                if (http2Connection.f2259t.contains(Integer.valueOf(readInt))) {
                    http2Connection.i(readInt, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.f2259t.add(Integer.valueOf(readInt));
                try {
                    http2Connection.e(new e(http2Connection, "OkHttp %s Push Request[%s]", new Object[]{http2Connection.f2243d, Integer.valueOf(readInt)}, readInt, e2, 2));
                } catch (RejectedExecutionException unused) {
                }
            }
        } else {
            Http2.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r12v18, types: [java.lang.Object[]] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:38|39|(5:42|(1:44)(1:45)|(2:47|101)(2:48|100)|49|40)|51|52|53|54|(1:63)(4:57|(1:59)|60|(1:62))|64|65) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cc */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(w.k r11, int r12, byte r13, int r14) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            if (r14 != 0) goto L_0x0159
            r14 = 1
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0016
            if (r12 != 0) goto L_0x000e
            r11.getClass()
            return
        L_0x000e:
            java.lang.String r11 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.lang.Object[] r12 = new java.lang.Object[r1]
            okhttp3.internal.http2.Http2.b(r11, r12)
            throw r0
        L_0x0016:
            int r13 = r12 % 6
            if (r13 != 0) goto L_0x014b
            okhttp3.internal.http2.Settings r6 = new okhttp3.internal.http2.Settings
            r6.<init>()
            r13 = 0
        L_0x0020:
            if (r13 >= r12) goto L_0x0078
            okio.BufferedSource r2 = r10.f2741a
            short r2 = r2.readShort()
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            okio.BufferedSource r3 = r10.f2741a
            int r3 = r3.readInt()
            r4 = 2
            if (r2 == r4) goto L_0x0065
            r4 = 3
            r5 = 4
            if (r2 == r4) goto L_0x0063
            if (r2 == r5) goto L_0x0057
            r4 = 5
            if (r2 == r4) goto L_0x003f
            goto L_0x0072
        L_0x003f:
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r3 < r4) goto L_0x0049
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            if (r3 > r4) goto L_0x0049
            goto L_0x0072
        L_0x0049:
            java.lang.String r11 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.lang.Object[] r12 = new java.lang.Object[r14]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r12[r1] = r13
            okhttp3.internal.http2.Http2.b(r11, r12)
            throw r0
        L_0x0057:
            if (r3 < 0) goto L_0x005b
            r2 = 7
            goto L_0x0072
        L_0x005b:
            java.lang.String r11 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.lang.Object[] r12 = new java.lang.Object[r1]
            okhttp3.internal.http2.Http2.b(r11, r12)
            throw r0
        L_0x0063:
            r2 = 4
            goto L_0x0072
        L_0x0065:
            if (r3 == 0) goto L_0x0072
            if (r3 != r14) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            java.lang.String r11 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.lang.Object[] r12 = new java.lang.Object[r1]
            okhttp3.internal.http2.Http2.b(r11, r12)
            throw r0
        L_0x0072:
            r6.b(r2, r3)
            int r13 = r13 + 6
            goto L_0x0020
        L_0x0078:
            java.lang.Object r12 = r11.f2731b
            r13 = r12
            okhttp3.internal.http2.Http2Connection r13 = (okhttp3.internal.http2.Http2Connection) r13
            monitor-enter(r13)
            java.lang.Object r12 = r11.f2731b     // Catch:{ all -> 0x00ad }
            okhttp3.internal.http2.Http2Connection r12 = (okhttp3.internal.http2.Http2Connection) r12     // Catch:{ all -> 0x00ad }
            okhttp3.internal.http2.Settings r12 = r12.f2254o     // Catch:{ all -> 0x00ad }
            int r12 = r12.a()     // Catch:{ all -> 0x00ad }
            java.lang.Object r2 = r11.f2731b     // Catch:{ all -> 0x00ad }
            okhttp3.internal.http2.Http2Connection r2 = (okhttp3.internal.http2.Http2Connection) r2     // Catch:{ all -> 0x00ad }
            okhttp3.internal.http2.Settings r2 = r2.f2254o     // Catch:{ all -> 0x00ad }
            r2.getClass()     // Catch:{ all -> 0x00ad }
            r3 = 0
        L_0x0092:
            r4 = 10
            if (r3 >= r4) goto L_0x00b0
            int r4 = r14 << r3
            int r5 = r6.f2280a     // Catch:{ all -> 0x00ad }
            r4 = r4 & r5
            if (r4 == 0) goto L_0x009f
            r4 = 1
            goto L_0x00a0
        L_0x009f:
            r4 = 0
        L_0x00a0:
            if (r4 != 0) goto L_0x00a3
            goto L_0x00aa
        L_0x00a3:
            int[] r4 = r6.f2281b     // Catch:{ all -> 0x00ad }
            r4 = r4[r3]     // Catch:{ all -> 0x00ad }
            r2.b(r3, r4)     // Catch:{ all -> 0x00ad }
        L_0x00aa:
            int r3 = r3 + 1
            goto L_0x0092
        L_0x00ad:
            r11 = move-exception
            goto L_0x0149
        L_0x00b0:
            java.lang.Object r2 = r11.f2731b     // Catch:{ RejectedExecutionException -> 0x00cc }
            r3 = r2
            okhttp3.internal.http2.Http2Connection r3 = (okhttp3.internal.http2.Http2Connection) r3     // Catch:{ RejectedExecutionException -> 0x00cc }
            java.util.concurrent.ScheduledThreadPoolExecutor r8 = r3.f2247h     // Catch:{ RejectedExecutionException -> 0x00cc }
            w.k r9 = new w.k     // Catch:{ RejectedExecutionException -> 0x00cc }
            java.lang.String r4 = "OkHttp %s ACK Settings"
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ RejectedExecutionException -> 0x00cc }
            okhttp3.internal.http2.Http2Connection r2 = (okhttp3.internal.http2.Http2Connection) r2     // Catch:{ RejectedExecutionException -> 0x00cc }
            java.lang.String r2 = r2.f2243d     // Catch:{ RejectedExecutionException -> 0x00cc }
            r5[r1] = r2     // Catch:{ RejectedExecutionException -> 0x00cc }
            r7 = 1
            r2 = r9
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ RejectedExecutionException -> 0x00cc }
            r8.execute(r9)     // Catch:{ RejectedExecutionException -> 0x00cc }
        L_0x00cc:
            java.lang.Object r2 = r11.f2731b     // Catch:{ all -> 0x00ad }
            okhttp3.internal.http2.Http2Connection r2 = (okhttp3.internal.http2.Http2Connection) r2     // Catch:{ all -> 0x00ad }
            okhttp3.internal.http2.Settings r2 = r2.f2254o     // Catch:{ all -> 0x00ad }
            int r2 = r2.a()     // Catch:{ all -> 0x00ad }
            r3 = -1
            r4 = 0
            if (r2 == r3) goto L_0x0115
            if (r2 == r12) goto L_0x0115
            int r2 = r2 - r12
            long r2 = (long) r2     // Catch:{ all -> 0x00ad }
            java.lang.Object r12 = r11.f2731b     // Catch:{ all -> 0x00ad }
            r6 = r12
            okhttp3.internal.http2.Http2Connection r6 = (okhttp3.internal.http2.Http2Connection) r6     // Catch:{ all -> 0x00ad }
            boolean r6 = r6.f2255p     // Catch:{ all -> 0x00ad }
            if (r6 != 0) goto L_0x00ed
            r6 = r12
            okhttp3.internal.http2.Http2Connection r6 = (okhttp3.internal.http2.Http2Connection) r6     // Catch:{ all -> 0x00ad }
            r6.f2255p = r14     // Catch:{ all -> 0x00ad }
        L_0x00ed:
            okhttp3.internal.http2.Http2Connection r12 = (okhttp3.internal.http2.Http2Connection) r12     // Catch:{ all -> 0x00ad }
            java.util.LinkedHashMap r12 = r12.f2242c     // Catch:{ all -> 0x00ad }
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x00ad }
            if (r12 != 0) goto L_0x0116
            java.lang.Object r12 = r11.f2731b     // Catch:{ all -> 0x00ad }
            okhttp3.internal.http2.Http2Connection r12 = (okhttp3.internal.http2.Http2Connection) r12     // Catch:{ all -> 0x00ad }
            java.util.LinkedHashMap r12 = r12.f2242c     // Catch:{ all -> 0x00ad }
            java.util.Collection r12 = r12.values()     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r11.f2731b     // Catch:{ all -> 0x00ad }
            okhttp3.internal.http2.Http2Connection r0 = (okhttp3.internal.http2.Http2Connection) r0     // Catch:{ all -> 0x00ad }
            java.util.LinkedHashMap r0 = r0.f2242c     // Catch:{ all -> 0x00ad }
            int r0 = r0.size()     // Catch:{ all -> 0x00ad }
            okhttp3.internal.http2.Http2Stream[] r0 = new okhttp3.internal.http2.Http2Stream[r0]     // Catch:{ all -> 0x00ad }
            java.lang.Object[] r12 = r12.toArray(r0)     // Catch:{ all -> 0x00ad }
            r0 = r12
            okhttp3.internal.http2.Http2Stream[] r0 = (okhttp3.internal.http2.Http2Stream[]) r0     // Catch:{ all -> 0x00ad }
            goto L_0x0116
        L_0x0115:
            r2 = r4
        L_0x0116:
            java.util.concurrent.ThreadPoolExecutor r12 = okhttp3.internal.http2.Http2Connection.f2239u     // Catch:{ all -> 0x00ad }
            w.l r6 = new w.l     // Catch:{ all -> 0x00ad }
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ all -> 0x00ad }
            java.lang.Object r7 = r11.f2731b     // Catch:{ all -> 0x00ad }
            okhttp3.internal.http2.Http2Connection r7 = (okhttp3.internal.http2.Http2Connection) r7     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = r7.f2243d     // Catch:{ all -> 0x00ad }
            r14[r1] = r7     // Catch:{ all -> 0x00ad }
            r6.<init>(r11, r14)     // Catch:{ all -> 0x00ad }
            r12.execute(r6)     // Catch:{ all -> 0x00ad }
            monitor-exit(r13)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0148
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0148
            int r12 = r0.length
        L_0x0132:
            if (r1 >= r12) goto L_0x0148
            r13 = r0[r1]
            monitor-enter(r13)
            long r4 = r13.f2269b     // Catch:{ all -> 0x0145 }
            long r4 = r4 + r2
            r13.f2269b = r4     // Catch:{ all -> 0x0145 }
            if (r11 <= 0) goto L_0x0141
            r13.notifyAll()     // Catch:{ all -> 0x0145 }
        L_0x0141:
            monitor-exit(r13)     // Catch:{ all -> 0x0145 }
            int r1 = r1 + 1
            goto L_0x0132
        L_0x0145:
            r11 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0145 }
            throw r11
        L_0x0148:
            return
        L_0x0149:
            monitor-exit(r13)     // Catch:{ all -> 0x00ad }
            throw r11
        L_0x014b:
            java.lang.String r11 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.lang.Object[] r13 = new java.lang.Object[r14]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13[r1] = r12
            okhttp3.internal.http2.Http2.b(r11, r13)
            throw r0
        L_0x0159:
            java.lang.String r11 = "TYPE_SETTINGS streamId != 0"
            java.lang.Object[] r12 = new java.lang.Object[r1]
            okhttp3.internal.http2.Http2.b(r11, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.i(w.k, int, byte, int):void");
    }

    public final void j(k kVar, int i2, int i3) {
        if (i2 == 4) {
            long readInt = ((long) this.f2741a.readInt()) & 2147483647L;
            int i4 = (readInt > 0 ? 1 : (readInt == 0 ? 0 : -1));
            if (i4 == 0) {
                Http2.b("windowSizeIncrement was 0", Long.valueOf(readInt));
                throw null;
            } else if (i3 == 0) {
                synchronized (((Http2Connection) kVar.f2731b)) {
                    Object obj = kVar.f2731b;
                    ((Http2Connection) obj).f2252m += readInt;
                    ((Http2Connection) obj).notifyAll();
                }
            } else {
                Http2Stream c2 = ((Http2Connection) kVar.f2731b).c(i3);
                if (c2 != null) {
                    synchronized (c2) {
                        c2.f2269b += readInt;
                        if (i4 > 0) {
                            c2.notifyAll();
                        }
                    }
                }
            }
        } else {
            Http2.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
            throw null;
        }
    }
}
