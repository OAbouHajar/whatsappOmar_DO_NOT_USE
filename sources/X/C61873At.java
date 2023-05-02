package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3At  reason: invalid class name and case insensitive filesystem */
public abstract class C61873At {
    public static C43061zH A00(byte[] bArr) {
        int length = bArr.length;
        if (length == 80) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr, 16, bArr3, 0, 32);
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 48, bArr4, 0, 32);
            return new C43061zH(bArr3, bArr4, bArr2);
        }
        throw new AssertionError(C13680ns.A0c(length, "Invalid length of derived secret; length="));
    }

    public static Cipher A01(byte[] bArr, byte[] bArr2, int i2) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new AssertionError(e2);
        }
    }

    public static Mac A02(byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(new SecretKeySpec(bArr2, DefaultCrypto.HMAC_SHA256));
            instance.update(bArr);
            return instance;
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}
