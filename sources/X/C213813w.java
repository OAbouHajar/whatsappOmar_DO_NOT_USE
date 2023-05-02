package X;

import android.support.v4.view.MotionEventCompat;
import android.util.Base64;
import com.facebook.redex.IDxRCallbackShape13S0300000_2_I0;
import java.io.ByteArrayOutputStream;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;

/* renamed from: X.13w  reason: invalid class name and case insensitive filesystem */
public final class C213813w {
    public final C16440t3 A00;
    public final C213213q A01;
    public final C17190ug A02;

    public C213813w(C16440t3 r2, C213213q r3, C17190ug r4) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r3, 3);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final String A00(String str, PublicKey publicKey, int i2) {
        C18450wi.A0H(str, 0);
        Integer valueOf = Integer.valueOf(i2);
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
        int i3 = length - 16;
        byte[] copyOfRange = Arrays.copyOfRange(doFinal, 0, i3);
        byte[] copyOfRange2 = Arrays.copyOfRange(doFinal, i3, length);
        byte byteValue = valueOf.byteValue();
        Cipher instance3 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance3.init(1, publicKey);
        byte[] doFinal2 = instance3.doFinal(generateKey.getEncoded());
        short length2 = (short) doFinal2.length;
        byte[] bArr2 = {(byte) (length2 & 255), (byte) ((length2 >> 8) & MotionEventCompat.ACTION_MASK)};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(byteValue);
        byteArrayOutputStream.write(iv);
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(doFinal2);
        byteArrayOutputStream.write(copyOfRange2);
        byteArrayOutputStream.write(copyOfRange);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        String encodeToString = Base64.encodeToString(byteArray, 11);
        C18450wi.A0B(encodeToString);
        StringBuilder sb = new StringBuilder("#PWD_WA:11:");
        sb.append(this.A00.A00() / 1000);
        sb.append(':');
        sb.append(encodeToString);
        return sb.toString();
    }

    public final JSONObject A01(String str, String str2) {
        C18450wi.A0H(str2, 1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("timestamp", this.A00.A00() / 1000);
        jSONObject.put("password", str2);
        jSONObject.put("client_pub_key", str);
        jSONObject.put("client_pub_key_type", "RSA 2048");
        return jSONObject;
    }

    public final void A02(AnonymousClass5SY r9, C28371Vv r10, String str, AnonymousClass22J r12, AnonymousClass22J r13) {
        this.A02.A0G(new IDxRCallbackShape13S0300000_2_I0(r12, r13, r9, 5), r10, str, 264, 32000);
    }
}
