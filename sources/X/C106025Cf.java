package X;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.5Cf  reason: invalid class name and case insensitive filesystem */
public class C106025Cf extends SecretKeyFactorySpi implements AnonymousClass5NP {
    public String A00;
    public C32041fY A01;

    public C106025Cf(String str, C32041fY r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        if (keySpec instanceof SecretKeySpec) {
            return new SecretKeySpec(((SecretKeySpec) keySpec).getEncoded(), this.A00);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }

    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        } else if (secretKey == null) {
            throw new InvalidKeySpecException("key parameter is null");
        } else if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.A00);
        } else {
            try {
                Class<byte[]> cls2 = byte[].class;
                return (KeySpec) AnonymousClass3K4.A0W(secretKey.getEncoded(), AnonymousClass3K4.A0c(cls, cls2, new Class[1], 0), new Object[1], 0);
            } catch (Exception e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        }
    }

    public SecretKey engineTranslateKey(SecretKey secretKey) {
        if (secretKey != null) {
            String algorithm = secretKey.getAlgorithm();
            String str = this.A00;
            if (algorithm.equalsIgnoreCase(str)) {
                return new SecretKeySpec(secretKey.getEncoded(), str);
            }
            StringBuilder A0r = AnonymousClass000.A0r("Key not of type ");
            A0r.append(str);
            throw new InvalidKeyException(AnonymousClass000.A0h(".", A0r));
        }
        throw new InvalidKeyException("key parameter is null");
    }
}
