package X;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.13q  reason: invalid class name and case insensitive filesystem */
public class C213213q {
    public AnonymousClass4MF A00(String str, X509Certificate x509Certificate) {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        SecretKey generateKey = instance.generateKey();
        byte[] bArr = new byte[12];
        C003601p.A00().nextBytes(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        byte[] bytes = str.getBytes();
        Cipher instance2 = Cipher.getInstance("AES/GCM/NoPadding");
        instance2.init(1, generateKey, ivParameterSpec);
        byte[] iv = instance2.getIV();
        byte[] doFinal = instance2.doFinal(bytes);
        int length = doFinal.length;
        int i2 = length - 16;
        byte[] copyOfRange = Arrays.copyOfRange(doFinal, 0, i2);
        byte[] copyOfRange2 = Arrays.copyOfRange(doFinal, i2, length);
        PublicKey publicKey = x509Certificate.getPublicKey();
        Cipher instance3 = Cipher.getInstance("RSA/ECB/OAEPPadding");
        instance3.init(1, publicKey);
        return new AnonymousClass4MF(instance3.doFinal(generateKey.getEncoded()), copyOfRange, copyOfRange2, iv);
    }

    public String A01(AnonymousClass4MF r7, PrivateKey privateKey) {
        byte[] bArr = r7.A01;
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPPadding");
        instance.init(2, privateKey);
        byte[] doFinal = instance.doFinal(bArr);
        byte[] bArr2 = r7.A00;
        byte[] bArr3 = r7.A03;
        int length = bArr2.length;
        int length2 = bArr3.length;
        byte[] copyOf = Arrays.copyOf(bArr2, length + length2);
        System.arraycopy(bArr3, 0, copyOf, length, length2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(doFinal, "AES");
        Cipher instance2 = Cipher.getInstance("AES/GCM/NoPadding");
        instance2.init(2, secretKeySpec, new IvParameterSpec(r7.A02));
        return new String(instance2.doFinal(copyOf), AnonymousClass01S.A08);
    }
}
