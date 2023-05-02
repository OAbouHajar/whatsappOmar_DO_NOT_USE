package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.KeyAgreement;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5ic  reason: invalid class name and case insensitive filesystem */
public class C112515ic extends C118695v6 {
    public String A00;
    public final AnonymousClass5wK A01;
    public final JniBridge A02;
    public final JSONObject A03;
    public final JSONObject A04;
    public final byte[] A05 = C004101u.A0E(12);

    public C112515ic(AnonymousClass5wK r2, JniBridge jniBridge, JSONObject jSONObject, JSONObject jSONObject2) {
        AnonymousClass00B.A0F(AnonymousClass000.A1Q(jSONObject2.length()));
        this.A02 = jniBridge;
        this.A01 = r2;
        this.A04 = jSONObject;
        this.A03 = jSONObject2;
    }

    public C118695v6 A00(PublicKey... publicKeyArr) {
        AnonymousClass00B.A0F(AnonymousClass000.A1W(this.A00));
        super.A00(publicKeyArr);
        try {
            String A002 = C119065vr.A00(this.A04.toString());
            byte[] bArr = this.A05;
            byte[] bArr2 = bArr;
            String encodeToString = Base64.encodeToString(bArr, 11);
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            PublicKey publicKey = generateKeyPair.getPublic();
            JSONObject A0J = C13700nu.A0J();
            JSONObject put = A0J.put("alg", "ECDH-ES").put("enc", "A256GCM");
            List list = this.A00;
            AnonymousClass00B.A06(list);
            Collections.sort(list);
            put.put("apu", C119065vr.A00(TextUtils.join(";", list))).put("apv", C119065vr.A00(C119065vr.A01((PublicKey) null))).put("epk", C13700nu.A0J().put("kty", "EC").put("crv", "P-256").put("der", Base64.encodeToString(publicKey.getEncoded(), 2)));
            String A003 = C119065vr.A00(A0J.toString());
            byte[] bytes = TextUtils.join(".", new String[]{A003, A002}).getBytes();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            KeyAgreement instance2 = KeyAgreement.getInstance("ECDH");
            instance2.init(privateKey);
            instance2.doPhase((Key) null, true);
            byte[] generateSecret = instance2.generateSecret();
            List list2 = this.A00;
            AnonymousClass00B.A06(list2);
            Collections.sort(list2);
            byte[] bytes2 = TextUtils.join(";", list2).getBytes();
            byte[] bytes3 = C119065vr.A01((PublicKey) null).getBytes();
            boolean z2 = true;
            byte[] A022 = C28641Wx.A02(1);
            byte[] bytes4 = "A256GCM".getBytes(AnonymousClass01S.A08);
            byte[] A023 = C28641Wx.A02(256);
            int length = generateSecret.length;
            int i2 = length;
            int i3 = length + 4;
            int i4 = i3 + 4;
            int length2 = bytes4.length;
            int i5 = length2;
            int i6 = i4 + length2;
            int i7 = i6 + 4;
            int length3 = bytes2.length;
            int i8 = i7 + length3;
            int i9 = i8 + 4;
            int length4 = bytes3.length;
            int i10 = i9 + length4;
            int i11 = i10 + 4;
            byte[] bArr3 = new byte[i11];
            System.arraycopy(A022, 0, bArr3, 0, 4);
            System.arraycopy(generateSecret, 0, bArr3, 4, i2);
            System.arraycopy(C28641Wx.A02(i5), 0, bArr3, i3, 4);
            System.arraycopy(bytes4, 0, bArr3, i4, i5);
            System.arraycopy(C28641Wx.A02(length3), 0, bArr3, i6, 4);
            System.arraycopy(bytes2, 0, bArr3, i7, length3);
            System.arraycopy(C28641Wx.A02(length4), 0, bArr3, i8, 4);
            System.arraycopy(bytes3, 0, bArr3, i9, length4);
            System.arraycopy(A023, 0, bArr3, i10, 4);
            if (i11 != i11) {
                z2 = false;
            }
            AnonymousClass00B.A0C("length doesn't match", z2);
            byte[] WCIAPIGcmAesCreateEncryptedCiphertext = this.A02.WCIAPIGcmAesCreateEncryptedCiphertext(MessageDigest.getInstance("SHA-256").digest(bArr3), bArr2, this.A03.toString().getBytes(), bytes, 16);
            if (WCIAPIGcmAesCreateEncryptedCiphertext == null) {
                throw new C115055p2(AnonymousClass000.A0V("cipher failed"));
            }
            int length5 = WCIAPIGcmAesCreateEncryptedCiphertext.length;
            int i12 = length5 - 16;
            AnonymousClass01Q r2 = new AnonymousClass01Q(Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, 0, i12), Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, i12, length5));
            Object obj = r2.A00;
            AnonymousClass00B.A06(obj);
            String encodeToString2 = Base64.encodeToString((byte[]) obj, 11);
            Object obj2 = r2.A01;
            AnonymousClass00B.A06(obj2);
            String encodeToString3 = Base64.encodeToString((byte[]) obj2, 11);
            String[] strArr = new String[6];
            strArr[0] = A002;
            strArr[1] = A003;
            strArr[2] = "";
            strArr[3] = encodeToString;
            AnonymousClass3K4.A12(encodeToString2, encodeToString3, strArr);
            this.A00 = TextUtils.join(".", strArr);
            return this;
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | JSONException e2) {
            Log.w("PAY: EncryptedTrustTokenBuilder/declareSigningKeys", e2);
            throw new C115055p2(e2);
        }
    }
}
