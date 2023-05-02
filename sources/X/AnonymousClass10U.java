package X;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.10U  reason: invalid class name */
public class AnonymousClass10U {
    public final C15970sD A00;

    public AnonymousClass10U(C15970sD r1) {
        this.A00 = r1;
    }

    public static byte[] A00(byte[] bArr, byte[] bArr2) {
        boolean z2 = true;
        byte[] A0I = C004101u.A0I(bArr, bArr2);
        if (A0I.length < 20) {
            z2 = false;
        }
        AnonymousClass00B.A0F(z2);
        byte[] bArr3 = new byte[20];
        System.arraycopy(A0I, 0, bArr3, 0, 20);
        return bArr3;
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            Cipher cipher = (Cipher) C90374e2.A00(instance, "AES/CBC/PKCS5Padding", instance.getProvider().getName());
            cipher.init(i2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            throw new SecurityException(e2);
        }
    }

    public String A02(C15880s3 r9, String str) {
        if (r9.A03) {
            byte[] decode = Base64.decode(str, 11);
            try {
                byte[][] A06 = C28641Wx.A06(decode, 20, 16, (decode.length - 20) - 16);
                byte[] bArr = A06[0];
                byte[] bArr2 = A06[1];
                byte[] bArr3 = A06[2];
                byte[] A04 = A04(r9);
                if (Arrays.equals(bArr, A00(A04, C28641Wx.A04(bArr2, bArr3)))) {
                    return new String(A01(bArr2, bArr3, A04, 2));
                }
                throw new SecurityException("Data mac corrupt");
            } catch (ParseException e2) {
                throw new SecurityException(e2);
            }
        } else {
            throw new SecurityException("Caller isn't trusted");
        }
    }

    public String A03(C15880s3 r8, String str) {
        if (r8.A03) {
            byte[] A04 = A04(r8);
            byte[] A002 = A00(A04, str.getBytes());
            boolean z2 = false;
            if (A002.length >= 16) {
                z2 = true;
            }
            AnonymousClass00B.A0F(z2);
            byte[] bArr = new byte[16];
            System.arraycopy(A002, 0, bArr, 0, 16);
            byte[] A042 = C28641Wx.A04(bArr, A01(bArr, str.getBytes(), A04, 1));
            return Base64.encodeToString(C28641Wx.A04(A00(A04, A042), A042), 11);
        }
        throw new SecurityException("Caller isn't trusted");
    }

    public final synchronized byte[] A04(C15880s3 r8) {
        String string;
        C15970sD r4 = this.A00;
        String str = r8.A01;
        string = r4.A01().getString(C15970sD.A00(str, "auth/encryption_key"), (String) null);
        if (string == null) {
            try {
                KeyGenerator instance = KeyGenerator.getInstance("AES");
                KeyGenerator keyGenerator = (KeyGenerator) C90374e2.A00(instance, "AES", instance.getProvider().getName());
                SecureRandom A01 = C90374e2.A01();
                byte[] encoded = keyGenerator.generateKey().getEncoded();
                keyGenerator.init(256, A01);
                string = Base64.encodeToString(encoded, 11);
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
                string = null;
            }
            r4.A01().edit().putString(C15970sD.A00(str, "auth/encryption_key"), string).apply();
        }
        return Base64.decode(string, 11);
    }
}
