package z;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.charset.Charset;

/* compiled from: XFMFile */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2858a = Charset.forName(DefaultCrypto.UTF_8);

    public static boolean a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}));
        }
    }

    public static long c(long j2) {
        return ((j2 & 255) << 56) | ((-72057594037927936L & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
    }
}
