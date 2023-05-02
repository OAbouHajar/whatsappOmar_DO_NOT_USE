package X;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.392  reason: invalid class name */
public class AnonymousClass392 {
    public byte[] A00(byte[] bArr, byte[] bArr2) {
        String replace = "SHA-256".replace("-", "");
        try {
            Mac instance = Mac.getInstance(AnonymousClass000.A0h(replace, AnonymousClass000.A0q("Hmac")));
            instance.init(new SecretKeySpec(bArr, AnonymousClass000.A0h(replace, AnonymousClass000.A0q("Hmac"))));
            return instance.doFinal(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public byte[] A01(byte[] bArr, byte[] bArr2, int i2) {
        String replace = "SHA-256".replace("-", "");
        try {
            int ceil = (int) Math.ceil(((double) i2) / ((double) 32));
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i3 = 1; i3 < ceil + 1; i3++) {
                Mac instance = Mac.getInstance(AnonymousClass000.A0h(replace, AnonymousClass000.A0q("Hmac")));
                instance.init(new SecretKeySpec(bArr, AnonymousClass000.A0h(replace, AnonymousClass000.A0q("Hmac"))));
                instance.update(bArr3);
                if (bArr2 != null) {
                    instance.update(bArr2);
                }
                instance.update((byte) i3);
                bArr3 = instance.doFinal();
                int min = Math.min(i2, bArr3.length);
                byteArrayOutputStream.write(bArr3, 0, min);
                i2 -= min;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}
