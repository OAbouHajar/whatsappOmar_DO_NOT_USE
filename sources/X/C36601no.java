package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1no  reason: invalid class name and case insensitive filesystem */
public class C36601no {
    public static final byte[] A03 = {2};
    public static final byte[] A04 = {1};
    public final int A00;
    public final C36571nl A01;
    public final byte[] A02;

    public C36601no(C36571nl r1, byte[] bArr, int i2) {
        this.A01 = r1;
        this.A02 = bArr;
        this.A00 = i2;
    }

    public C84994Mr A00() {
        try {
            byte[][] A022 = C36581nm.A02(this.A01.A02(A01(A04), new byte[32], "WhisperMessageKeys".getBytes(), 80), 32, 32, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A022[0], "AES");
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(A022[1], DefaultCrypto.HMAC_SHA256);
            return new C84994Mr(new IvParameterSpec(A022[2]), secretKeySpec, secretKeySpec2, this.A00);
        } catch (ParseException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] A01(byte[] bArr) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(new SecretKeySpec(this.A02, DefaultCrypto.HMAC_SHA256));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}
