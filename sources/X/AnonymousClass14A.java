package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.14A  reason: invalid class name */
public class AnonymousClass14A {
    public C35811mX A00(String str, byte[] bArr) {
        try {
            byte[] bArr2 = new byte[4];
            C003601p.A00().nextBytes(bArr2);
            byte[] bArr3 = new byte[16];
            C003601p.A00().nextBytes(bArr3);
            byte[] bArr4 = new byte[16];
            C003601p.A00().nextBytes(bArr4);
            String encodeToString = Base64.encodeToString(bArr4, 3);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(encodeToString);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A02(bArr2, sb.toString()), "AES/OFB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return new C35811mX(encodeToString, instance.doFinal(bArr), bArr3, bArr2, 2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            Log.e("SymmetricEncryptionUtil/decryptData/issue encrypting", e2);
            return null;
        }
    }

    public byte[] A01(C35811mX r7, String str) {
        if (r7.A00 != 2) {
            Log.e("SymmetricEncryptionUtil/decryptData/invalid type");
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(r7.A01);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A02(r7.A04, sb.toString()), "AES/OFB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
            instance.init(2, secretKeySpec, new IvParameterSpec(r7.A03));
            return instance.doFinal(r7.A02);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            Log.e("SymmetricEncryptionUtil/decryptData/issue decrypting", e2);
            return null;
        }
    }

    public final byte[] A02(byte[] bArr, String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = (char) bytes[i2];
        }
        return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1And8BIT").generateSecret(new PBEKeySpec(cArr, bArr, 16, 128)).getEncoded(), "AES").getEncoded();
    }
}
