package X;

import android.util.Base64;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* renamed from: X.16J  reason: invalid class name */
public class AnonymousClass16J {
    public byte[] A00 = null;
    public byte[] A01 = null;

    public static String A00(String str) {
        String[] split = str.split(",");
        StringBuilder sb = new StringBuilder();
        sb.append("CN");
        sb.append("=");
        String obj = sb.toString();
        for (String trim : split) {
            String trim2 = trim.trim();
            if (trim2.startsWith(obj)) {
                return trim2.substring(obj.length());
            }
        }
        return null;
    }

    public static ArrayList A01() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128);
        SecretKey generateKey = instance.generateKey();
        byte[] bArr = new byte[16];
        C003601p.A00().nextBytes(bArr);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Base64.encodeToString(generateKey.getEncoded(), 2));
        arrayList.add(Base64.encodeToString(bArr, 2));
        return arrayList;
    }

    public static byte[] A02(PublicKey publicKey, SecretKey secretKey) {
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        instance.init(1, publicKey, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        return instance.doFinal(secretKey.getEncoded());
    }

    public AnonymousClass22Y A03(String str, PublicKey publicKey) {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128);
        SecretKey generateKey = instance.generateKey();
        byte[] bArr = new byte[16];
        C003601p.A00().nextBytes(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        byte[] bytes = str.getBytes();
        Cipher instance2 = Cipher.getInstance("AES/GCM/NoPadding");
        instance2.init(1, generateKey, ivParameterSpec);
        byte[] iv = instance2.getIV();
        byte[] doFinal = instance2.doFinal(bytes);
        byte[] A02 = A02(publicKey, generateKey);
        this.A00 = generateKey.getEncoded();
        this.A01 = iv;
        return new AnonymousClass22Y(A02, doFinal, iv);
    }
}
