package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.4bH  reason: invalid class name and case insensitive filesystem */
public class C88904bH {
    public static final byte[] A02 = {2};
    public static final byte[] A03 = {1};
    public final int A00;
    public final byte[] A01;

    public C88904bH(int i2, byte[] bArr) {
        this.A00 = i2;
        this.A01 = bArr;
    }

    public C88904bH A00() {
        int i2 = this.A00 + 1;
        byte[] bArr = A02;
        byte[] bArr2 = this.A01;
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(new SecretKeySpec(bArr2, DefaultCrypto.HMAC_SHA256));
            return new C88904bH(i2, instance.doFinal(bArr));
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }

    public C36271nH A01() {
        int i2 = this.A00;
        byte[] bArr = A03;
        byte[] bArr2 = this.A01;
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(new SecretKeySpec(bArr2, DefaultCrypto.HMAC_SHA256));
            return new C36271nH(i2, instance.doFinal(bArr));
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }
}
