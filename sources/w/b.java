package w;

import java.util.Arrays;
import java.util.List;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okio.Buffer;
import okio.ByteString;

/* compiled from: XFMFile */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Buffer f2697a;

    /* renamed from: b  reason: collision with root package name */
    public int f2698b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2699c;

    /* renamed from: d  reason: collision with root package name */
    public int f2700d = 4096;

    /* renamed from: e  reason: collision with root package name */
    public Header[] f2701e = new Header[8];

    /* renamed from: f  reason: collision with root package name */
    public int f2702f = 7;

    /* renamed from: g  reason: collision with root package name */
    public int f2703g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2704h = 0;

    public b(Buffer buffer) {
        this.f2697a = buffer;
    }

    public final void a(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f2701e.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f2702f;
                if (length < i3 || i2 <= 0) {
                    Header[] headerArr = this.f2701e;
                    int i5 = i3 + 1;
                    System.arraycopy(headerArr, i5, headerArr, i5 + i4, this.f2703g);
                    Header[] headerArr2 = this.f2701e;
                    int i6 = this.f2702f + 1;
                    Arrays.fill(headerArr2, i6, i6 + i4, (Object) null);
                    this.f2702f += i4;
                } else {
                    int i7 = this.f2701e[length].f2227a;
                    i2 -= i7;
                    this.f2704h -= i7;
                    this.f2703g--;
                    i4++;
                    length--;
                }
            }
            Header[] headerArr3 = this.f2701e;
            int i52 = i3 + 1;
            System.arraycopy(headerArr3, i52, headerArr3, i52 + i4, this.f2703g);
            Header[] headerArr22 = this.f2701e;
            int i62 = this.f2702f + 1;
            Arrays.fill(headerArr22, i62, i62 + i4, (Object) null);
            this.f2702f += i4;
        }
    }

    public final void b(Header header) {
        int i2 = this.f2700d;
        int i3 = header.f2227a;
        if (i3 > i2) {
            Arrays.fill(this.f2701e, (Object) null);
            this.f2702f = this.f2701e.length - 1;
            this.f2703g = 0;
            this.f2704h = 0;
            return;
        }
        a((this.f2704h + i3) - i2);
        int i4 = this.f2703g + 1;
        Header[] headerArr = this.f2701e;
        if (i4 > headerArr.length) {
            Header[] headerArr2 = new Header[(headerArr.length * 2)];
            System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
            this.f2702f = this.f2701e.length - 1;
            this.f2701e = headerArr2;
        }
        int i5 = this.f2702f;
        this.f2702f = i5 - 1;
        this.f2701e[i5] = header;
        this.f2703g++;
        this.f2704h += i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(okio.ByteString r12) {
        /*
            r11 = this;
            w.t r0 = w.t.f2769d
            r0.getClass()
            r0 = 0
            r2 = 0
            r4 = r0
            r3 = 0
        L_0x000a:
            int r6 = r12.size()
            r7 = 255(0xff, float:3.57E-43)
            if (r3 >= r6) goto L_0x0020
            byte r6 = r12.getByte(r3)
            r6 = r6 & r7
            byte[] r7 = w.t.f2768c
            byte r6 = r7[r6]
            long r6 = (long) r6
            long r4 = r4 + r6
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0020:
            r8 = 7
            long r4 = r4 + r8
            r3 = 3
            long r3 = r4 >> r3
            int r4 = (int) r3
            int r3 = r12.size()
            okio.Buffer r5 = r11.f2697a
            r6 = 127(0x7f, float:1.78E-43)
            if (r4 >= r3) goto L_0x007e
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            w.t r4 = w.t.f2769d
            r4.getClass()
            r4 = 0
        L_0x003c:
            int r8 = r12.size()
            if (r2 >= r8) goto L_0x0063
            byte r8 = r12.getByte(r2)
            r8 = r8 & r7
            int[] r9 = w.t.f2767b
            r9 = r9[r8]
            byte[] r10 = w.t.f2768c
            byte r8 = r10[r8]
            long r0 = r0 << r8
            long r9 = (long) r9
            long r0 = r0 | r9
            int r4 = r4 + r8
        L_0x0053:
            r8 = 8
            if (r4 < r8) goto L_0x0060
            int r4 = r4 + -8
            long r8 = r0 >> r4
            int r9 = (int) r8
            r3.writeByte(r9)
            goto L_0x0053
        L_0x0060:
            int r2 = r2 + 1
            goto L_0x003c
        L_0x0063:
            if (r4 <= 0) goto L_0x0070
            int r12 = 8 - r4
            long r0 = r0 << r12
            int r12 = r7 >>> r4
            long r7 = (long) r12
            long r0 = r0 | r7
            int r12 = (int) r0
            r3.writeByte(r12)
        L_0x0070:
            okio.ByteString r12 = r3.readByteString()
            int r0 = r12.size()
            r1 = 128(0x80, float:1.794E-43)
            r11.e(r0, r6, r1)
            goto L_0x0085
        L_0x007e:
            int r0 = r12.size()
            r11.e(r0, r6, r2)
        L_0x0085:
            r5.write((okio.ByteString) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b.c(okio.ByteString):void");
    }

    public final void d(List list) {
        int i2;
        int i3;
        if (this.f2699c) {
            int i4 = this.f2698b;
            if (i4 < this.f2700d) {
                e(i4, 31, 32);
            }
            this.f2699c = false;
            this.f2698b = Integer.MAX_VALUE;
            e(this.f2700d, 31, 32);
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Header header = (Header) list.get(i5);
            ByteString asciiLowercase = header.name.toAsciiLowercase();
            ByteString byteString = header.value;
            Integer num = (Integer) c.f2706b.get(asciiLowercase);
            if (num != null) {
                i3 = num.intValue() + 1;
                if (i3 > 1 && i3 < 8) {
                    Header[] headerArr = c.f2705a;
                    if (Util.equal(headerArr[i3 - 1].value, byteString)) {
                        i2 = i3;
                    } else if (Util.equal(headerArr[i3].value, byteString)) {
                        i2 = i3;
                        i3++;
                    }
                }
                i2 = i3;
                i3 = -1;
            } else {
                i3 = -1;
                i2 = -1;
            }
            if (i3 == -1) {
                int i6 = this.f2702f + 1;
                int length = this.f2701e.length;
                while (true) {
                    if (i6 >= length) {
                        break;
                    }
                    if (Util.equal(this.f2701e[i6].name, asciiLowercase)) {
                        if (Util.equal(this.f2701e[i6].value, byteString)) {
                            i3 = c.f2705a.length + (i6 - this.f2702f);
                            break;
                        } else if (i2 == -1) {
                            i2 = (i6 - this.f2702f) + c.f2705a.length;
                        }
                    }
                    i6++;
                }
            }
            if (i3 != -1) {
                e(i3, 127, 128);
            } else {
                if (i2 == -1) {
                    this.f2697a.writeByte(64);
                    c(asciiLowercase);
                } else if (!asciiLowercase.startsWith(Header.PSEUDO_PREFIX) || Header.TARGET_AUTHORITY.equals(asciiLowercase)) {
                    e(i2, 63, 64);
                } else {
                    e(i2, 15, 0);
                    c(byteString);
                }
                c(byteString);
                b(header);
            }
        }
    }

    public final void e(int i2, int i3, int i4) {
        Buffer buffer = this.f2697a;
        if (i2 < i3) {
            buffer.writeByte(i2 | i4);
            return;
        }
        buffer.writeByte(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            buffer.writeByte(128 | (i5 & 127));
            i5 >>>= 7;
        }
        buffer.writeByte(i5);
    }
}
