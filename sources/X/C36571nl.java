package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1nl  reason: invalid class name and case insensitive filesystem */
public abstract class C36571nl {
    public static C36571nl A00(int i2) {
        if (i2 == 2) {
            return new AnonymousClass5Ku();
        }
        if (i2 == 3) {
            return new C36561nk();
        }
        StringBuilder sb = new StringBuilder("Unknown version: ");
        sb.append(i2);
        throw new AssertionError(sb.toString());
    }

    public int A01() {
        return 1;
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(new SecretKeySpec(bArr2, DefaultCrypto.HMAC_SHA256));
            byte[] doFinal = instance.doFinal(bArr);
            try {
                int ceil = (int) Math.ceil(((double) i2) / 32.0d);
                byte[] bArr4 = new byte[0];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int A01 = A01();
                int i3 = A01;
                while (A01 < i3 + ceil) {
                    Mac instance2 = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
                    instance2.init(new SecretKeySpec(doFinal, DefaultCrypto.HMAC_SHA256));
                    instance2.update(bArr4);
                    if (bArr3 != null) {
                        instance2.update(bArr3);
                    }
                    instance2.update((byte) A01);
                    bArr4 = instance2.doFinal();
                    int min = Math.min(i2, bArr4.length);
                    byteArrayOutputStream.write(bArr4, 0, min);
                    i2 -= min;
                    A01++;
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
