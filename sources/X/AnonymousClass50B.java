package X;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* renamed from: X.50B  reason: invalid class name */
public class AnonymousClass50B implements AnonymousClass5Q5 {
    public final byte[] A00;

    public AnonymousClass50B(byte[] bArr) {
        this.A00 = bArr;
    }

    public byte[] A8P(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.A00;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length >= length2) {
            try {
                PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr3));
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, generatePublic);
                return instance.doFinal(bArr);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("PAY: RsaKey encrypt: payload length is ");
            A0r.append(length2);
            A0r.append(" bytes while key can encrypt at most ");
            A0r.append(length);
            throw AnonymousClass3K4.A0T(AnonymousClass1Vo.A01("RsaKey", AnonymousClass000.A0h(" bytes", A0r)));
        }
    }
}
