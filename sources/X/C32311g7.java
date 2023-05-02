package X;

import android.support.v4.view.MotionEventCompat;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLException;

/* renamed from: X.1g7  reason: invalid class name and case insensitive filesystem */
public class C32311g7 {
    public static int A00(byte[] bArr) {
        if (bArr.length == 3) {
            return (bArr[2] & 255) | 0 | ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8);
        }
        throw new C29351aU(new SSLException("Invalid argument. Byte array is null or length != 3"), (byte) 80);
    }

    public static int A01(byte[] bArr) {
        if (bArr == null || bArr.length != 2) {
            throw new C29351aU(new SSLException("Invalid argument. Byte array is null or length != 2"), (byte) 80);
        }
        return (bArr[1] & 255) | 0 | ((bArr[0] & 255) << 8);
    }

    public static long A02(byte[] bArr) {
        if (bArr != null && bArr.length == 4) {
            return (((long) (bArr[0] & 255)) << 24) | (((long) (bArr[1] & 255)) << 16) | (((long) (bArr[2] & 255)) << 8) | ((long) (bArr[3] & 255));
        }
        throw new C29351aU(new SSLException("Invalid argument. byte array is null or length != 4"), (byte) 80);
    }

    public static String A03(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            formatter.format("%02x ", new Object[]{Byte.valueOf(bArr[i2])});
        }
        return formatter.toString();
    }

    public static boolean A04(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || (length = bArr.length) != bArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z3 = false;
            if (bArr[i2] == bArr2[i2]) {
                z3 = true;
            }
            z2 &= z3;
        }
        return z2;
    }

    public static byte[] A05(int i2) {
        if (i2 < 0 || i2 >= 16777216) {
            StringBuilder sb = new StringBuilder("Invalid argument. The supplied int value = ");
            sb.append(i2);
            sb.append(" does not fit in 3 bytes.");
            throw new C29351aU(new SSLException(sb.toString()), (byte) 80);
        }
        return new byte[]{(byte) ((i2 >>> 16) & MotionEventCompat.ACTION_MASK), (byte) ((i2 >>> 8) & MotionEventCompat.ACTION_MASK), (byte) (i2 & MotionEventCompat.ACTION_MASK)};
    }

    public static byte[] A06(int i2) {
        if (i2 < 0 || i2 >= 65536) {
            StringBuilder sb = new StringBuilder("Invalid argument. The supplied int value = ");
            sb.append(i2);
            sb.append(" does not fit in 2 bytes.");
            throw new C29351aU(new SSLException(sb.toString()), (byte) 80);
        }
        return new byte[]{(byte) ((i2 >>> 8) & MotionEventCompat.ACTION_MASK), (byte) (i2 & MotionEventCompat.ACTION_MASK)};
    }

    public static byte[] A07(String str, String str2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("#");
        sb.append(i2);
        sb.append("#");
        sb.append(str2);
        try {
            return sb.toString().getBytes(DefaultCrypto.UTF_8);
        } catch (UnsupportedEncodingException e2) {
            throw new C29351aU(new SSLException(e2), (byte) 80);
        }
    }

    public static byte[] A08(String str, byte[] bArr, int i2) {
        if (bArr != null) {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder("tls13 ");
            sb.append(str);
            try {
                byte[] bytes = sb.toString().getBytes(DefaultCrypto.UTF_8);
                int length2 = bytes.length;
                ByteBuffer allocate = ByteBuffer.allocate(length2 + 1 + 2 + length + 1);
                allocate.put(A06(i2));
                short s2 = (short) length2;
                if (s2 < 0 || s2 >= 256) {
                    StringBuilder sb2 = new StringBuilder("Invalid argument. Short val = ");
                    sb2.append(s2);
                    sb2.append(" cannot fit in single byte");
                    throw new C29351aU(new SSLException(sb2.toString()), (byte) 80);
                }
                allocate.put((byte) (s2 & 255));
                allocate.put(bytes);
                allocate.put((byte) length);
                allocate.put(bArr);
                return allocate.array();
            } catch (UnsupportedEncodingException e2) {
                throw new C29351aU(new SSLException(e2), (byte) 80);
            }
        } else {
            throw new C29351aU(new SSLException("Context cannot be null when generating info"), (byte) 80);
        }
    }

    public static byte[] A09(String str, byte[] bArr, byte[] bArr2) {
        try {
            String replace = str.replace("-", "");
            StringBuilder sb = new StringBuilder();
            sb.append("Hmac");
            sb.append(replace);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Hmac");
            sb2.append(replace);
            Mac instance = Mac.getInstance(sb2.toString());
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (NoSuchAlgorithmException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Hmac");
            sb3.append(str);
            sb3.append(" not found");
            throw new C29351aU(new SSLException(sb3.toString(), e2), (byte) 80);
        } catch (InvalidKeyException e3) {
            throw new C29351aU(new SSLException("Invalid key", e3), (byte) 80);
        }
    }
}
