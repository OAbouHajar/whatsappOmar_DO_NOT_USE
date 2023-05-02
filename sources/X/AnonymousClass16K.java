package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16K  reason: invalid class name */
public final class AnonymousClass16K {
    public final C16300so A00;
    public final AnonymousClass16J A01;
    public final C15860rz A02;
    public final C14710pd A03;
    public final C17190ug A04;

    public AnonymousClass16K(C16300so r2, AnonymousClass16J r3, C15860rz r4, C14710pd r5, C17190ug r6) {
        C18450wi.A0H(r6, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r2, 3);
        C18450wi.A0H(r5, 4);
        C18450wi.A0H(r3, 5);
        this.A04 = r6;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
    }

    public final void A00(C439622f r16, UserJid userJid, String str, String str2, String str3) {
        C15860rz r6 = this.A02;
        UserJid userJid2 = userJid;
        String str4 = userJid2.user;
        StringBuilder sb = new StringBuilder("galaxy_biz_public_key_");
        sb.append(str4);
        String string = ((SharedPreferences) r6.A01.get()).getString(sb.toString(), (String) null);
        if (string == null) {
            Log.w("ExtensionsConnectionManager/generateEncryptionStringFromSignedInfo/Null certificate");
            this.A00.AcB("extensions-failed-to-load-certificate-from-preferences", "", false);
            return;
        }
        C439622f r9 = r16;
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            C18450wi.A0B(instance);
            Certificate generateCertificate = instance.generateCertificate(new ByteArrayInputStream(Base64.decode(string, 2)));
            if (generateCertificate != null) {
                X509Certificate x509Certificate = (X509Certificate) generateCertificate;
                String str5 = str;
                String str6 = str2;
                String str7 = str3;
                if (new Date().getTime() > x509Certificate.getNotAfter().getTime()) {
                    r6.A0o(userJid2.getRawString());
                    A01(r9, userJid2, str5, str6, str7, true);
                    return;
                }
                PublicKey publicKey = x509Certificate.getPublicKey();
                IvParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode(str7, 2));
                byte[] decode = Base64.decode(str6, 2);
                SecretKeySpec secretKeySpec = new SecretKeySpec(decode, 0, decode.length, "AES");
                byte[] bytes = str5.getBytes();
                Cipher instance2 = Cipher.getInstance("AES/GCM/NoPadding");
                instance2.init(1, secretKeySpec, ivParameterSpec);
                byte[] iv = instance2.getIV();
                r9.ARg(userJid2, new AnonymousClass22Y(AnonymousClass16J.A02(publicKey, secretKeySpec), instance2.doFinal(bytes), iv).A00());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (GeneralSecurityException e2) {
            Log.e(C18450wi.A06("ExtensionsConnectionManager/encryptGalaxyFlowData/error while encrypting data", e2.getMessage()));
            r9.ARf("extensions-encryption-failed-exception");
            this.A00.AcB("extensions-encryption-failed-exception", e2.getMessage(), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004f, code lost:
        if (r4 > ((android.content.SharedPreferences) r0.A01.get()).getLong(r0.toString(), 0)) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C439622f r18, com.whatsapp.jid.UserJid r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            r17 = this;
            r0 = 0
            r13 = r19
            X.C18450wi.A0H(r13, r0)
            r6 = r17
            boolean r0 = r6.A02(r13)
            r7 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            if (r0 != 0) goto L_0x006a
            X.0pd r2 = r6.A03
            r1 = 2030(0x7ee, float:2.845E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x006a
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r4 = r0.getTime()
            X.0rz r0 = r6.A02
            java.lang.String r2 = r13.getRawString()
            X.01D r0 = r0.A01
            java.lang.Object r3 = r0.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r1 = "galaxy_business_cert_expired_timestamp_"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 0
            long r1 = r3.getLong(r2, r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
        L_0x0051:
            X.0rz r1 = r6.A02
            java.lang.String r0 = r13.getRawString()
            r1.A0o(r0)
            X.0ug r1 = r6.A04
            X.22a r0 = new X.22a
            r0.<init>(r13, r1)
            X.22g r5 = new X.22g
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A00(r5)
        L_0x0069:
            return
        L_0x006a:
            if (r23 != 0) goto L_0x0051
            X.0rz r0 = r6.A02
            java.lang.String r3 = r13.user
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "galaxy_biz_public_key_"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            if (r0 == 0) goto L_0x0051
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0051
            if (r20 == 0) goto L_0x0069
            if (r18 == 0) goto L_0x0069
            if (r21 == 0) goto L_0x0069
            if (r22 == 0) goto L_0x0069
            r11 = r6
            r12 = r7
            r14 = r8
            r15 = r9
            r16 = r10
            r11.A00(r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16K.A01(X.22f, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final boolean A02(UserJid userJid) {
        String A06 = this.A03.A06(C16620tM.A02, 1695);
        if (A06 != null) {
            try {
                JSONArray jSONArray = new JSONObject(A06).getJSONArray("galaxy_allowed_list");
                int length = jSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    String string = jSONArray.getString(i2);
                    String str = userJid.user;
                    if (string == null) {
                        if (str == null) {
                            return true;
                        }
                    } else if (string.equalsIgnoreCase(str)) {
                        return true;
                    }
                    i2 = i3;
                }
            } catch (JSONException e2) {
                Log.w(C18450wi.A06("ExtensionsConnectionManager/allowedSelfSignedCert/", e2.getMessage()));
            }
        }
        return false;
    }
}
