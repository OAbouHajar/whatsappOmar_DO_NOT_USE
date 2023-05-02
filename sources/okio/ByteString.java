package okio;

import a.a;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.IOUtils;
import z.j;
import z.m;

/* compiled from: XFMFile */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final ByteString EMPTY = of(new byte[0]);

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f2326d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2327a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f2328b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f2329c;

    public ByteString(byte[] bArr) {
        this.f2327a = bArr;
    }

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r5 = r0 - 1;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okio.ByteString decodeBase64(java.lang.String r15) {
        /*
            if (r15 == 0) goto L_0x00d7
            int r0 = r15.length()
        L_0x0006:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L_0x0025
            int r5 = r0 + -1
            char r6 = r15.charAt(r5)
            r7 = 61
            if (r6 == r7) goto L_0x0023
            if (r6 == r4) goto L_0x0023
            if (r6 == r3) goto L_0x0023
            if (r6 == r2) goto L_0x0023
            if (r6 == r1) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = r5
            goto L_0x0006
        L_0x0025:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0035:
            r12 = 0
            if (r8 >= r0) goto L_0x009e
            char r13 = r15.charAt(r8)
            r14 = 65
            if (r13 < r14) goto L_0x0047
            r14 = 90
            if (r13 > r14) goto L_0x0047
            int r13 = r13 + -65
            goto L_0x007d
        L_0x0047:
            r14 = 97
            if (r13 < r14) goto L_0x0052
            r14 = 122(0x7a, float:1.71E-43)
            if (r13 > r14) goto L_0x0052
            int r13 = r13 + -71
            goto L_0x007d
        L_0x0052:
            r14 = 48
            if (r13 < r14) goto L_0x005d
            r14 = 57
            if (r13 > r14) goto L_0x005d
            int r13 = r13 + 4
            goto L_0x007d
        L_0x005d:
            r14 = 43
            if (r13 == r14) goto L_0x007b
            r14 = 45
            if (r13 != r14) goto L_0x0066
            goto L_0x007b
        L_0x0066:
            r14 = 47
            if (r13 == r14) goto L_0x0078
            r14 = 95
            if (r13 != r14) goto L_0x006f
            goto L_0x0078
        L_0x006f:
            if (r13 == r4) goto L_0x009b
            if (r13 == r3) goto L_0x009b
            if (r13 == r2) goto L_0x009b
            if (r13 != r1) goto L_0x00a3
            goto L_0x009b
        L_0x0078:
            r13 = 63
            goto L_0x007d
        L_0x007b:
            r13 = 62
        L_0x007d:
            int r10 = r10 << 6
            byte r12 = (byte) r13
            r10 = r10 | r12
            int r9 = r9 + 1
            int r12 = r9 % 4
            if (r12 != 0) goto L_0x009b
            int r12 = r11 + 1
            int r13 = r10 >> 16
            byte r13 = (byte) r13
            r5[r11] = r13
            int r11 = r12 + 1
            int r13 = r10 >> 8
            byte r13 = (byte) r13
            r5[r12] = r13
            int r12 = r11 + 1
            byte r13 = (byte) r10
            r5[r11] = r13
            r11 = r12
        L_0x009b:
            int r8 = r8 + 1
            goto L_0x0035
        L_0x009e:
            int r9 = r9 % 4
            r15 = 1
            if (r9 != r15) goto L_0x00a5
        L_0x00a3:
            r5 = r12
            goto L_0x00cf
        L_0x00a5:
            r15 = 2
            if (r9 != r15) goto L_0x00b3
            int r15 = r10 << 12
            int r0 = r11 + 1
            int r15 = r15 >> 16
            byte r15 = (byte) r15
            r5[r11] = r15
            r11 = r0
            goto L_0x00c6
        L_0x00b3:
            r15 = 3
            if (r9 != r15) goto L_0x00c6
            int r15 = r10 << 6
            int r0 = r11 + 1
            int r1 = r15 >> 16
            byte r1 = (byte) r1
            r5[r11] = r1
            int r11 = r0 + 1
            int r15 = r15 >> 8
            byte r15 = (byte) r15
            r5[r0] = r15
        L_0x00c6:
            if (r11 != r6) goto L_0x00c9
            goto L_0x00cf
        L_0x00c9:
            byte[] r15 = new byte[r11]
            java.lang.System.arraycopy(r5, r7, r15, r7, r11)
            r5 = r15
        L_0x00cf:
            if (r5 == 0) goto L_0x00d6
            okio.ByteString r12 = new okio.ByteString
            r12.<init>(r5)
        L_0x00d6:
            return r12
        L_0x00d7:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "base64 == null"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.decodeBase64(java.lang.String):okio.ByteString");
    }

    public static ByteString decodeHex(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) (a(str.charAt(i3 + 1)) + (a(str.charAt(i3)) << 4));
            }
            return of(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
    }

    public static ByteString encodeString(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        } else if (charset != null) {
            return new ByteString(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    public static ByteString encodeUtf8(String str) {
        if (str != null) {
            ByteString byteString = new ByteString(str.getBytes(m.f2858a));
            byteString.f2329c = str;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static ByteString of(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ByteString of(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ByteString of(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            m.b((long) bArr.length, (long) i2, (long) i3);
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return new ByteString(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ByteString read(InputStream inputStream, int i2) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read != -1) {
                    i3 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new ByteString(bArr);
        } else {
            throw new IllegalArgumentException(a.d("byteCount < 0: ", i2));
        }
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.f2327a).asReadOnlyBuffer();
    }

    public final ByteString b(String str) {
        try {
            return of(MessageDigest.getInstance(str).digest(this.f2327a));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public String base64() {
        return j.b(this.f2327a, j.f2854g);
    }

    public String base64Url() {
        return j.b(this.f2327a, j.f2855h);
    }

    public final ByteString c(ByteString byteString, String str) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            return of(instance.doFinal(this.f2327a));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        } catch (InvalidKeyException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public int compareTo(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        int min = Math.min(size, size2);
        for (int i2 = 0; i2 < min; i2++) {
            byte b2 = getByte(i2) & 255;
            byte b3 = byteString.getByte(i2) & 255;
            if (b2 != b3) {
                return b2 < b3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public byte[] d() {
        return this.f2327a;
    }

    public void e(Buffer buffer) {
        byte[] bArr = this.f2327a;
        buffer.write(bArr, 0, bArr.length);
    }

    public final boolean endsWith(ByteString byteString) {
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public final boolean endsWith(byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            byte[] bArr = this.f2327a;
            return size == bArr.length && byteString.rangeEquals(0, bArr, 0, bArr.length);
        }
    }

    public byte getByte(int i2) {
        return this.f2327a[i2];
    }

    public int hashCode() {
        int i2 = this.f2328b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f2327a);
        this.f2328b = hashCode;
        return hashCode;
    }

    public String hex() {
        byte[] bArr = this.f2327a;
        char[] cArr = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = f2326d;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public ByteString hmacSha1(ByteString byteString) {
        return c(byteString, "HmacSHA1");
    }

    public ByteString hmacSha256(ByteString byteString) {
        return c(byteString, DefaultCrypto.HMAC_SHA256);
    }

    public ByteString hmacSha512(ByteString byteString) {
        return c(byteString, "HmacSHA512");
    }

    public final int indexOf(ByteString byteString) {
        return indexOf(byteString.d(), 0);
    }

    public final int indexOf(ByteString byteString, int i2) {
        return indexOf(byteString.d(), i2);
    }

    public final int indexOf(byte[] bArr) {
        return indexOf(bArr, 0);
    }

    public int indexOf(byte[] bArr, int i2) {
        byte[] bArr2 = this.f2327a;
        int length = bArr2.length - bArr.length;
        for (int max = Math.max(i2, 0); max <= length; max++) {
            if (m.a(bArr2, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    public final int lastIndexOf(ByteString byteString) {
        return lastIndexOf(byteString.d(), size());
    }

    public final int lastIndexOf(ByteString byteString, int i2) {
        return lastIndexOf(byteString.d(), i2);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf(bArr, size());
    }

    public int lastIndexOf(byte[] bArr, int i2) {
        byte[] bArr2 = this.f2327a;
        for (int min = Math.min(i2, bArr2.length - bArr.length); min >= 0; min--) {
            if (m.a(bArr2, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public ByteString md5() {
        return b("MD5");
    }

    public boolean rangeEquals(int i2, ByteString byteString, int i3, int i4) {
        return byteString.rangeEquals(i3, this.f2327a, i2, i4);
    }

    public boolean rangeEquals(int i2, byte[] bArr, int i3, int i4) {
        if (i2 >= 0) {
            byte[] bArr2 = this.f2327a;
            return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && m.a(bArr2, i2, bArr, i3, i4);
        }
    }

    public ByteString sha1() {
        return b("SHA-1");
    }

    public ByteString sha256() {
        return b("SHA-256");
    }

    public ByteString sha512() {
        return b("SHA-512");
    }

    public int size() {
        return this.f2327a.length;
    }

    public final boolean startsWith(ByteString byteString) {
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public final boolean startsWith(byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public String string(Charset charset) {
        if (charset != null) {
            return new String(this.f2327a, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public ByteString substring(int i2) {
        return substring(i2, this.f2327a.length);
    }

    public ByteString substring(int i2, int i3) {
        if (i2 >= 0) {
            byte[] bArr = this.f2327a;
            if (i3 <= bArr.length) {
                int i4 = i3 - i2;
                if (i4 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i2 == 0 && i3 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i2, bArr2, 0, i4);
                    return new ByteString(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + bArr.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public ByteString toAsciiLowercase() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f2327a;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 < 65 || b2 > 90) {
                i2++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b3 = bArr2[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i3] = (byte) (b3 + 32);
                    }
                }
                return new ByteString(bArr2);
            }
        }
    }

    public ByteString toAsciiUppercase() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f2327a;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 < 97 || b2 > 122) {
                i2++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b2 - 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b3 = bArr2[i3];
                    if (b3 >= 97 && b3 <= 122) {
                        bArr2[i3] = (byte) (b3 - 32);
                    }
                }
                return new ByteString(bArr2);
            }
        }
    }

    public byte[] toByteArray() {
        return (byte[]) this.f2327a.clone();
    }

    public String toString() {
        byte[] bArr = this.f2327a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String utf8 = utf8();
        int length = utf8.length();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = utf8.length();
                break;
            } else if (i3 == 64) {
                break;
            } else {
                int codePointAt = utf8.codePointAt(i2);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i3++;
                    i2 += Character.charCount(codePointAt);
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            String replace = utf8.substring(0, i2).replace("\\", "\\\\").replace(IOUtils.LINE_SEPARATOR_UNIX, "\\n").replace("\r", "\\r");
            if (i2 < utf8.length()) {
                return "[size=" + bArr.length + " text=" + replace + "…]";
            }
            return "[text=" + replace + "]";
        } else if (bArr.length <= 64) {
            return "[hex=" + hex() + "]";
        } else {
            return "[size=" + bArr.length + " hex=" + substring(0, 64).hex() + "…]";
        }
    }

    public String utf8() {
        String str = this.f2329c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f2327a, m.f2858a);
        this.f2329c = str2;
        return str2;
    }

    public void write(OutputStream outputStream) {
        if (outputStream != null) {
            outputStream.write(this.f2327a);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }
}
