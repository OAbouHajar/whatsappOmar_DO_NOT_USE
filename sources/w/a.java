package w;

import android.support.v4.view.MotionEventCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Header;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* compiled from: XFMFile */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2689a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final BufferedSource f2690b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2691c = 4096;

    /* renamed from: d  reason: collision with root package name */
    public int f2692d = 4096;

    /* renamed from: e  reason: collision with root package name */
    public Header[] f2693e = new Header[8];

    /* renamed from: f  reason: collision with root package name */
    public int f2694f = 7;

    /* renamed from: g  reason: collision with root package name */
    public int f2695g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2696h = 0;

    public a(m mVar) {
        this.f2690b = Okio.buffer((Source) mVar);
    }

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        if (i2 > 0) {
            int length = this.f2693e.length;
            while (true) {
                length--;
                i3 = this.f2694f;
                if (length < i3 || i2 <= 0) {
                    Header[] headerArr = this.f2693e;
                    System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i4, this.f2695g);
                    this.f2694f += i4;
                } else {
                    int i5 = this.f2693e[length].f2227a;
                    i2 -= i5;
                    this.f2696h -= i5;
                    this.f2695g--;
                    i4++;
                }
            }
            Header[] headerArr2 = this.f2693e;
            System.arraycopy(headerArr2, i3 + 1, headerArr2, i3 + 1 + i4, this.f2695g);
            this.f2694f += i4;
        }
        return i4;
    }

    public final ByteString b(int i2) {
        Header header;
        if (i2 >= 0 && i2 <= c.f2705a.length - 1) {
            header = c.f2705a[i2];
        } else {
            int length = this.f2694f + 1 + (i2 - c.f2705a.length);
            if (length >= 0) {
                Header[] headerArr = this.f2693e;
                if (length < headerArr.length) {
                    header = headerArr[length];
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }
        return header.name;
    }

    public final void c(Header header) {
        this.f2689a.add(header);
        int i2 = this.f2692d;
        int i3 = header.f2227a;
        if (i3 > i2) {
            Arrays.fill(this.f2693e, (Object) null);
            this.f2694f = this.f2693e.length - 1;
            this.f2695g = 0;
            this.f2696h = 0;
            return;
        }
        a((this.f2696h + i3) - i2);
        int i4 = this.f2695g + 1;
        Header[] headerArr = this.f2693e;
        if (i4 > headerArr.length) {
            Header[] headerArr2 = new Header[(headerArr.length * 2)];
            System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
            this.f2694f = this.f2693e.length - 1;
            this.f2693e = headerArr2;
        }
        int i5 = this.f2694f;
        this.f2694f = i5 - 1;
        this.f2693e[i5] = header;
        this.f2695g++;
        this.f2696h += i3;
    }

    public final ByteString d() {
        int i2;
        BufferedSource bufferedSource = this.f2690b;
        byte readByte = bufferedSource.readByte() & 255;
        boolean z2 = (readByte & 128) == 128;
        int e2 = e(readByte, 127);
        if (!z2) {
            return bufferedSource.readByteString((long) e2);
        }
        t tVar = t.f2769d;
        byte[] readByteArray = bufferedSource.readByteArray((long) e2);
        tVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        s sVar = tVar.f2770a;
        s sVar2 = sVar;
        byte b2 = 0;
        int i3 = 0;
        for (byte b3 : readByteArray) {
            b2 = (b2 << 8) | (b3 & 255);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = i3 - 8;
                sVar2 = sVar2.f2764a[(b2 >>> i4) & MotionEventCompat.ACTION_MASK];
                if (sVar2.f2764a == null) {
                    byteArrayOutputStream.write(sVar2.f2765b);
                    i3 -= sVar2.f2766c;
                    sVar2 = sVar;
                } else {
                    i3 = i4;
                }
            }
        }
        while (i3 > 0) {
            s sVar3 = sVar2.f2764a[(b2 << (8 - i3)) & MotionEventCompat.ACTION_MASK];
            if (sVar3.f2764a != null || (i2 = sVar3.f2766c) > i3) {
                break;
            }
            byteArrayOutputStream.write(sVar3.f2765b);
            i3 -= i2;
            sVar2 = sVar;
        }
        return ByteString.of(byteArrayOutputStream.toByteArray());
    }

    public final int e(int i2, int i3) {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        while (true) {
            byte readByte = this.f2690b.readByte() & 255;
            if ((readByte & 128) == 0) {
                return i3 + (readByte << i5);
            }
            i3 += (readByte & Byte.MAX_VALUE) << i5;
            i5 += 7;
        }
    }
}
