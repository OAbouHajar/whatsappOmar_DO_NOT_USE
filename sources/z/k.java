package z;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Buffer;
import okio.ByteString;

/* compiled from: XFMFile */
public final class k extends ByteString {

    /* renamed from: e  reason: collision with root package name */
    public final transient byte[][] f2856e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int[] f2857f;

    public k(Buffer buffer, int i2) {
        super((byte[]) null);
        m.b(buffer.f2324b, 0, (long) i2);
        i iVar = buffer.f2323a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = iVar.f2843c;
            int i7 = iVar.f2842b;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                iVar = iVar.f2846f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f2856e = new byte[i5][];
        this.f2857f = new int[(i5 * 2)];
        i iVar2 = buffer.f2323a;
        int i8 = 0;
        while (i3 < i2) {
            byte[][] bArr = this.f2856e;
            bArr[i8] = iVar2.f2841a;
            int i9 = iVar2.f2843c;
            int i10 = iVar2.f2842b;
            int i11 = (i9 - i10) + i3;
            i3 = i11 > i2 ? i2 : i11;
            int[] iArr = this.f2857f;
            iArr[i8] = i3;
            iArr[bArr.length + i8] = i10;
            iVar2.f2844d = true;
            i8++;
            iVar2 = iVar2.f2846f;
        }
    }

    public final ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    public final String base64() {
        return g().base64();
    }

    public final String base64Url() {
        return g().base64Url();
    }

    public final byte[] d() {
        return toByteArray();
    }

    public final void e(Buffer buffer) {
        byte[][] bArr = this.f2856e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f2857f;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            i iVar = new i(bArr[i2], i4, (i4 + i5) - i3, true, false);
            i iVar2 = buffer.f2323a;
            if (iVar2 == null) {
                iVar.f2847g = iVar;
                iVar.f2846f = iVar;
                buffer.f2323a = iVar;
            } else {
                iVar2.f2847g.b(iVar);
            }
            i2++;
            i3 = i5;
        }
        buffer.f2324b += (long) i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            return byteString.size() == size() && rangeEquals(0, byteString, 0, size());
        }
    }

    public final int f(int i2) {
        int binarySearch = Arrays.binarySearch(this.f2857f, 0, this.f2856e.length, i2 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public final ByteString g() {
        return new ByteString(toByteArray());
    }

    public final byte getByte(int i2) {
        byte[][] bArr = this.f2856e;
        int[] iArr = this.f2857f;
        m.b((long) iArr[bArr.length - 1], (long) i2, 1);
        int f2 = f(i2);
        return bArr[f2][(i2 - (f2 == 0 ? 0 : iArr[f2 - 1])) + iArr[bArr.length + f2]];
    }

    public final int hashCode() {
        int i2 = this.f2328b;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f2856e;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < length) {
            byte[] bArr2 = bArr[i3];
            int[] iArr = this.f2857f;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i4) + i6;
            while (i6 < i8) {
                i5 = (i5 * 31) + bArr2[i6];
                i6++;
            }
            i3++;
            i4 = i7;
        }
        this.f2328b = i5;
        return i5;
    }

    public final String hex() {
        return g().hex();
    }

    public final ByteString hmacSha1(ByteString byteString) {
        return g().hmacSha1(byteString);
    }

    public final ByteString hmacSha256(ByteString byteString) {
        return g().hmacSha256(byteString);
    }

    public final int indexOf(byte[] bArr, int i2) {
        return g().indexOf(bArr, i2);
    }

    public final int lastIndexOf(byte[] bArr, int i2) {
        return g().lastIndexOf(bArr, i2);
    }

    public final ByteString md5() {
        return g().md5();
    }

    public final boolean rangeEquals(int i2, ByteString byteString, int i3, int i4) {
        if (i2 < 0 || i2 > size() - i4) {
            return false;
        }
        int f2 = f(i2);
        while (i4 > 0) {
            int[] iArr = this.f2857f;
            int i5 = f2 == 0 ? 0 : iArr[f2 - 1];
            int min = Math.min(i4, ((iArr[f2] - i5) + i5) - i2);
            byte[][] bArr = this.f2856e;
            if (!byteString.rangeEquals(i3, bArr[f2], (i2 - i5) + iArr[bArr.length + f2], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            f2++;
        }
        return true;
    }

    public final boolean rangeEquals(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > size() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int f2 = f(i2);
        while (i4 > 0) {
            int[] iArr = this.f2857f;
            int i5 = f2 == 0 ? 0 : iArr[f2 - 1];
            int min = Math.min(i4, ((iArr[f2] - i5) + i5) - i2);
            byte[][] bArr2 = this.f2856e;
            if (!m.a(bArr2[f2], (i2 - i5) + iArr[bArr2.length + f2], bArr, i3, min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            f2++;
        }
        return true;
    }

    public final ByteString sha1() {
        return g().sha1();
    }

    public final ByteString sha256() {
        return g().sha256();
    }

    public final int size() {
        return this.f2857f[this.f2856e.length - 1];
    }

    public final String string(Charset charset) {
        return g().string(charset);
    }

    public final ByteString substring(int i2) {
        return g().substring(i2);
    }

    public final ByteString substring(int i2, int i3) {
        return g().substring(i2, i3);
    }

    public final ByteString toAsciiLowercase() {
        return g().toAsciiLowercase();
    }

    public final ByteString toAsciiUppercase() {
        return g().toAsciiUppercase();
    }

    public final byte[] toByteArray() {
        byte[][] bArr = this.f2856e;
        int[] iArr = this.f2857f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            System.arraycopy(bArr[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    public final String toString() {
        return g().toString();
    }

    public final String utf8() {
        return g().utf8();
    }

    public final void write(OutputStream outputStream) {
        if (outputStream != null) {
            byte[][] bArr = this.f2856e;
            int length = bArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int[] iArr = this.f2857f;
                int i4 = iArr[length + i2];
                int i5 = iArr[i2];
                outputStream.write(bArr[i2], i4, i5 - i3);
                i2++;
                i3 = i5;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }
}
