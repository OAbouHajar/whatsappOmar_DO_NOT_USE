package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3GH  reason: invalid class name */
public class AnonymousClass3GH implements AnonymousClass5Q5 {
    public final byte[] A00;

    public AnonymousClass3GH(byte[] bArr) {
        this.A00 = bArr;
    }

    public byte[] A8P(byte[] bArr, byte[] bArr2) {
        C31981fL A002 = C31981fL.A00();
        byte[] bArr3 = A002.A02.A01;
        byte[][] A05 = C28641Wx.A05(C40771uf.A01(AnonymousClass48G.A00(A002, new C35891mf(this.A00)), bArr3, (byte[]) null, 64), 32, 32);
        byte[] bArr4 = A05[0];
        byte[] bArr5 = A05[1];
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr4, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            byte[] doFinal = instance.doFinal(bArr);
            try {
                Mac instance2 = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
                instance2.init(new SecretKeySpec(bArr5, DefaultCrypto.HMAC_SHA256));
                instance2.update(bArr2);
                byte[] A04 = C28641Wx.A04(bArr2, bArr3, instance2.doFinal(doFinal), doFinal);
                A002.destroy();
                return A04;
            } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
                throw new AssertionError(e2);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e3) {
            throw new AssertionError(e3);
        }
    }
}
