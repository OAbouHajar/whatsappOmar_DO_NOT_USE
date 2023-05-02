package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.5xS  reason: invalid class name */
public class AnonymousClass5xS {
    public static String A00(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r5 << 1);
        for (byte b2 : bArr) {
            Object[] A1b = C13680ns.A1b();
            AnonymousClass000.A1M(A1b, b2 & 255, 0);
            sb.append(String.format("%02x", A1b));
        }
        return sb.toString();
    }

    public static byte[] A01(String str) {
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            bArr[i2] = (byte) Integer.parseInt(str.substring(i3, i3 + 2), 16);
        }
        return bArr;
    }

    public static byte[] A02(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes(DefaultCrypto.UTF_8));
            return instance.digest();
        } catch (Exception e2) {
            throw C110115dX.A0Z(e2);
        }
    }

    public static byte[] A03(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Exception e2) {
            throw C110115dX.A0Z(e2);
        }
    }

    public static byte[] A04(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Exception e2) {
            throw C110115dX.A0Z(e2);
        }
    }
}
