package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5wt  reason: invalid class name and case insensitive filesystem */
public class C119315wt {
    public final C16440t3 A00;
    public final C18300wT A01;
    public final AnonymousClass5w5 A02;
    public final C118975vi A03;
    public final JniBridge A04;

    public C119315wt(C16440t3 r1, C18300wT r2, AnonymousClass5w5 r3, C118975vi r4, JniBridge jniBridge) {
        this.A00 = r1;
        this.A04 = jniBridge;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static final String A00(String str, String str2, String str3) {
        JSONObject A0J = C13700nu.A0J();
        A0J.put("clientDeviceID", str);
        if (!TextUtils.isEmpty(str2)) {
            A0J.put("clientReferenceID", str2);
        }
        A0J.put("vProvisionedTokenID", str3);
        return C110115dX.A0f(String.valueOf(new SecureRandom().nextInt(100000)), "nonce", A0J);
    }

    public final String A01(int i2) {
        PrivateKey A002 = this.A03.A00(i2);
        if (A002 == null) {
            return null;
        }
        StringBuilder A0r = AnonymousClass000.A0r("-----BEGIN PRIVATE KEY-----\r\n");
        A0r.append(Base64.encodeToString(A002.getEncoded(), 0));
        return AnonymousClass000.A0h("-----END PRIVATE KEY-----\r\n\u0000", A0r);
    }

    public String A02(AnonymousClass3GH r24, String str) {
        String str2;
        try {
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            byte[] A0E = C004101u.A0E(12);
            String encodeToString = Base64.encodeToString(A0E, 11);
            JSONObject A0J = C13700nu.A0J();
            ECPoint w2 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
            try {
                A0J.put("alg", "ECDH-ES").put("enc", "A256GCM").put("epk", C13700nu.A0J().put("kty", "EC").put("crv", "P-256").put("x", Base64.encodeToString(w2.getAffineX().toByteArray(), 2)).put("y", Base64.encodeToString(w2.getAffineY().toByteArray(), 2)));
            } catch (JSONException e2) {
                Log.e("PAY: BrazilTokenizationHelper/generateEncodedEloHeader failed: ", e2);
            }
            try {
                str2 = Base64.encodeToString(A0J.toString().getBytes(AnonymousClass01S.A08), 11);
            } catch (UnsupportedEncodingException e3) {
                Log.e("PAY: BrazilTokenizationHelper/generateEncodedEloHeader failed: ", e3);
                str2 = "";
            }
            byte[] bArr = new byte[0];
            try {
                bArr = str2.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException e4) {
                Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed generating aad: ", e4);
            }
            try {
                PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(r24.A00));
                if (generatePublic != null) {
                    byte[] bArr2 = new byte[0];
                    try {
                        PrivateKey privateKey = generateKeyPair.getPrivate();
                        KeyAgreement instance2 = KeyAgreement.getInstance("ECDH");
                        instance2.init(privateKey);
                        instance2.doPhase(generatePublic, true);
                        bArr2 = instance2.generateSecret();
                    } catch (InvalidKeyException | NoSuchAlgorithmException e5) {
                        Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed generating sharedSecret: ", e5);
                    }
                    byte[] bArr3 = new byte[0];
                    try {
                        byte[] A022 = C28641Wx.A02(0);
                        byte[] A023 = C28641Wx.A02(0);
                        boolean z2 = true;
                        byte[] A024 = C28641Wx.A02(1);
                        byte[] bytes = "A256GCM".getBytes(AnonymousClass01S.A08);
                        byte[] A025 = C28641Wx.A02(256);
                        int length = A024.length;
                        int length2 = bArr2.length;
                        int i2 = length + length2;
                        int length3 = bytes.length;
                        int length4 = A022.length;
                        int length5 = A023.length;
                        int length6 = A025.length;
                        int length7 = i2 + C28641Wx.A02(length3).length + length3 + length4 + length5 + length6;
                        byte[] bArr4 = new byte[length7];
                        System.arraycopy(A024, 0, bArr4, 0, length);
                        System.arraycopy(bArr2, 0, bArr4, length, length2);
                        System.arraycopy(C28641Wx.A02(length3), 0, bArr4, i2, C28641Wx.A02(length3).length);
                        int length8 = i2 + C28641Wx.A02(length3).length;
                        System.arraycopy(bytes, 0, bArr4, length8, length3);
                        int i3 = length8 + length3;
                        System.arraycopy(A022, 0, bArr4, i3, length4);
                        int i4 = i3 + length4;
                        System.arraycopy(A023, 0, bArr4, i4, length5);
                        int i5 = i4 + length5;
                        System.arraycopy(A025, 0, bArr4, i5, length6);
                        if (i5 + length6 != length7) {
                            z2 = false;
                        }
                        AnonymousClass00B.A0C("length doesn't match", z2);
                        bArr3 = MessageDigest.getInstance("SHA-256").digest(bArr4);
                    } catch (UnsupportedEncodingException | NoSuchAlgorithmException e6) {
                        Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed symmetric key generation: ", e6);
                    }
                    byte[] bArr5 = new byte[0];
                    try {
                        bArr5 = this.A04.WCIAPIGcmAesCreateEncryptedCiphertext(bArr3, A0E, str.getBytes(AnonymousClass01S.A08), bArr, 16);
                    } catch (UnsupportedEncodingException e7) {
                        Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed: ", e7);
                    }
                    if (bArr5 != null) {
                        int length9 = bArr5.length;
                        int i6 = length9 - 16;
                        byte[] copyOfRange = Arrays.copyOfRange(bArr5, 0, i6);
                        AnonymousClass00B.A06(copyOfRange);
                        String encodeToString2 = Base64.encodeToString(copyOfRange, 11);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i6, length9);
                        AnonymousClass00B.A06(copyOfRange2);
                        return TextUtils.join(".", new String[]{str2, "", encodeToString, encodeToString2, Base64.encodeToString(copyOfRange2, 11)});
                    }
                }
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e8) {
                throw new AssertionError(e8);
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e9) {
            Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed generating ephemeral key: ", e9);
        }
        return null;
    }

    public String A03(AnonymousClass50C r18, String str) {
        BigInteger bigInteger;
        try {
            String A0f = C110115dX.A0f("PS256", "alg", C13700nu.A0J());
            PrivateKey A002 = this.A03.A00(1);
            String str2 = null;
            if (A002 != null) {
                try {
                    JSONObject put = C13700nu.A0J().put("otp", str).put("certID", AnonymousClass5w5.A00(((RSAKey) A002).getModulus()));
                    AnonymousClass5w5 r1 = this.A02;
                    String obj = put.toString();
                    AnonymousClass50C r8 = r18;
                    try {
                        bigInteger = ((RSAPublicKey) C110115dX.A0h(r8.A06)).getModulus();
                    } catch (Exception e2) {
                        try {
                            Log.w("PAY: JweCompactSerializer/getModulusFromProviderKey failed: ", e2);
                            bigInteger = null;
                        } catch (Exception e3) {
                            Log.w(AnonymousClass000.A0h(e3.toString(), AnonymousClass000.A0r("PAY: JweCompactSerializer/encryptCek")));
                            throw C110115dX.A0Z(e3);
                        } catch (Exception e4) {
                            Log.w("PAY: JweCompactSerializer/generateStepUpJweToken failed: ", e4);
                        }
                    }
                    String obj2 = C13700nu.A0J().put("alg", "RSA-OAEP-256").put("enc", "A256GCM").put("typ", "JOSE").put("kid", AnonymousClass5w5.A00(bigInteger)).toString();
                    String str3 = AnonymousClass01S.A08;
                    String encodeToString = Base64.encodeToString(obj2.getBytes(str3), 11);
                    byte[] bArr = new byte[32];
                    SecureRandom secureRandom = new SecureRandom();
                    secureRandom.nextBytes(bArr);
                    PublicKey A0h = C110115dX.A0h(r8.A06);
                    Cipher instance = Cipher.getInstance("RSA/ECB/OAEPwithSHA-256andMGF1Padding");
                    instance.init(1, A0h);
                    String encodeToString2 = Base64.encodeToString(instance.doFinal(bArr), 11);
                    byte[] bArr2 = new byte[12];
                    secureRandom.nextBytes(bArr2);
                    String encodeToString3 = Base64.encodeToString(bArr2, 11);
                    byte[] bytes = obj.getBytes(str3);
                    byte[] WCIAPIGcmAesCreateEncryptedCiphertext = r1.A00.WCIAPIGcmAesCreateEncryptedCiphertext(bArr, bArr2, bytes, encodeToString.getBytes("US-ASCII"), 16);
                    if (WCIAPIGcmAesCreateEncryptedCiphertext != null) {
                        int length = bytes.length;
                        byte[] copyOfRange = Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, 0, length);
                        byte[] copyOfRange2 = Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, length, WCIAPIGcmAesCreateEncryptedCiphertext.length);
                        String encodeToString4 = Base64.encodeToString(copyOfRange, 11);
                        String encodeToString5 = Base64.encodeToString(copyOfRange2, 11);
                        String[] strArr = new String[5];
                        C13690nt.A1L(encodeToString, encodeToString2, strArr);
                        strArr[2] = encodeToString3;
                        strArr[3] = encodeToString4;
                        strArr[4] = encodeToString5;
                        str2 = TextUtils.join(".", strArr);
                    }
                } catch (JSONException e5) {
                    Log.w("PAY: BrazilTokenizationHelper/generateStepUpJweToken failed: ", e5);
                }
            }
            return A06(A0f, str2);
        } catch (JSONException e6) {
            Log.w("PAY: generateJwsTokenForCode failed: ", e6);
            return null;
        }
    }

    public String A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            String A012 = A01(5);
            if (!TextUtils.isEmpty(A012)) {
                return Base64.encodeToString((byte[]) JniBridge.jvidispatchOOO(9, str.getBytes(), A012.getBytes()), 2);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.A02.A06("Failed to get the wallet_secret");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        com.whatsapp.util.Log.e("PAY: BrazilTokenizationHelper/signEloDataWithWalletSecret failed: ", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094 A[Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6 A[ExcHandler: InvalidKeyException | NoSuchAlgorithmException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A05(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r0 != 0) goto L_0x00ac
            java.lang.String r9 = "SHA-256"
            java.lang.String r4 = ""
            X.0wT r2 = r10.A01     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            android.content.SharedPreferences r1 = r2.A01()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = "payment_trusted_device_elo_wallet_store"
            r8 = 0
            java.lang.String r0 = r1.getString(r0, r3)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            if (r0 == 0) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x002b, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            goto L_0x0024
        L_0x0020:
            org.json.JSONObject r1 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x002b, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
        L_0x0024:
            java.lang.String r0 = "wallet_secret"
            java.lang.String r8 = r1.getString(r0)     // Catch:{ JSONException -> 0x002b, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            goto L_0x0032
        L_0x002b:
            X.1Vo r1 = r2.A02     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = "Failed to get the wallet_secret"
            r1.A06(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
        L_0x0032:
            X.5vi r1 = r10.A03     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            r0 = 5
            java.security.PrivateKey r7 = r1.A00(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            if (r7 == 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "RSA/ECB/OAEPPadding"
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            java.lang.String r5 = "MGF1"
            java.security.spec.MGF1ParameterSpec r2 = new java.security.spec.MGF1ParameterSpec     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            r2.<init>(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            javax.crypto.spec.PSource$PSpecified r0 = javax.crypto.spec.PSource.PSpecified.DEFAULT     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            javax.crypto.spec.OAEPParameterSpec r1 = new javax.crypto.spec.OAEPParameterSpec     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            r1.<init>(r9, r5, r2, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            r0 = 2
            r6.init(r0, r7, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            byte[] r0 = android.util.Base64.decode(r8, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            byte[] r2 = r6.doFinal(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            r1.<init>(r2, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            java.lang.String r0 = "-----BEGIN (.*)-----"
            java.lang.String r1 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            java.lang.String r0 = "-----END (.*)----"
            java.lang.String r1 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            java.lang.String r0 = r0.trim()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085 }
            goto L_0x008c
        L_0x0085:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilTokenizationHelper/fetchEloWalletSecret failed: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
        L_0x008b:
            r0 = 0
        L_0x008c:
            if (r0 != 0) goto L_0x0094
            java.lang.String r0 = "PAY: BrazilTokenizationHelper/signEloDataWithWalletSecret failed because secret is empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            return r3
        L_0x0094:
            r2 = 2
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            byte[] r0 = r11.getBytes()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            byte[] r0 = X.C40481uC.A00(r0, r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            return r0
        L_0x00a6:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilTokenizationHelper/signEloDataWithWalletSecret failed: "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119315wt.A05(java.lang.String):java.lang.String");
    }

    public final String A06(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                String str3 = AnonymousClass01S.A08;
                String join = TextUtils.join(".", new String[]{Base64.encodeToString(str.getBytes(str3), 11), Base64.encodeToString(str2.getBytes(str3), 11)});
                String A012 = A01(1);
                if (!TextUtils.isEmpty(A012)) {
                    StringBuilder A0q = AnonymousClass000.A0q(join);
                    A0q.append(".");
                    return AnonymousClass000.A0h(Base64.encodeToString((byte[]) JniBridge.jvidispatchOOO(7, join.getBytes(), A012.getBytes()), 11), A0q);
                }
            } catch (UnsupportedEncodingException e2) {
                Log.w("PAY: generateJwsToken threw UnsupportedEncoding Exception: ", e2);
            }
        }
        return null;
    }
}
