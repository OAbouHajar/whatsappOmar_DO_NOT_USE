package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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

/* renamed from: X.1Cc  reason: invalid class name and case insensitive filesystem */
public class C23471Cc {
    public static final byte[] A01 = new byte[0];
    public final AnonymousClass1RR A00;

    public C23471Cc(AnonymousClass1RR r1) {
        this.A00 = r1;
    }

    public static final byte[] A00(String str, byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(bArr2, str));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw new AnonymousClass1X5(e2);
        }
    }

    public static final byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i2, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            throw new AnonymousClass1X5(e2);
        }
    }

    public byte[] A02(AnonymousClass1WY r4, String str, byte[] bArr, long j2) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong(j2);
        return A00(DefaultCrypto.HMAC_SHA256, C28641Wx.A04(bArr, order.array(), str.getBytes(AnonymousClass01S.A0A)), this.A00.A00(r4.A00).A02);
    }

    public byte[] A03(AnonymousClass1WY r4, String str, byte[] bArr, byte[] bArr2, long j2) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong(j2);
        return A00(DefaultCrypto.HMAC_SHA256, C28641Wx.A04(bArr2, bArr, order.array(), str.getBytes(AnonymousClass01S.A0A)), this.A00.A00(r4.A00).A01);
    }

    public final byte[] A04(AnonymousClass1WK r8, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] A04 = C28641Wx.A04(bArr, r8.A00);
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong((long) A04.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(A00("HmacSHA512", C28641Wx.A04(A04, bArr3, order.array()), bArr2), 0, bArr4, 0, 32);
        return bArr4;
    }
}
