package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1uf  reason: invalid class name and case insensitive filesystem */
public class C40771uf {
    public static byte[] A00(byte[] bArr, byte[] bArr2, int i2) {
        return A01(bArr, new byte[32], bArr2, i2);
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        try {
            byte[] A00 = C40481uC.A00(bArr, bArr2);
            try {
                int ceil = (int) Math.ceil(((double) i2) / 32.0d);
                byte[] bArr4 = new byte[0];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (int i3 = 1; i3 < ceil + 1; i3++) {
                    Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
                    instance.init(new SecretKeySpec(A00, DefaultCrypto.HMAC_SHA256));
                    instance.update(bArr4);
                    if (bArr3 != null) {
                        instance.update(bArr3);
                    }
                    instance.update((byte) i3);
                    bArr4 = instance.doFinal();
                    int min = Math.min(i2, bArr4.length);
                    byteArrayOutputStream.write(bArr4, 0, min);
                    i2 -= min;
                }
                return byteArrayOutputStream.toByteArray();
            } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
                throw new AssertionError(e2);
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        }
    }
}
