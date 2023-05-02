package X;

import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5vi  reason: invalid class name and case insensitive filesystem */
public class C118975vi {
    public KeyStore A00;
    public JSONObject A01;
    public boolean A02;
    public final C16980tz A03;
    public final C18300wT A04;
    public final AnonymousClass1Vo A05 = C110105dW.A0Q("PaymentTrustedDeviceManager", "infra");
    public final AnonymousClass0y5 A06;

    public C118975vi(C16980tz r3, C18300wT r4, AnonymousClass0y5 r5) {
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r5;
    }

    public PrivateKey A00(int i2) {
        byte[] bArr;
        byte[] A062;
        A02();
        byte[] bArr2 = null;
        String optString = this.A01.optString(String.valueOf(i2), (String) null);
        if (!TextUtils.isEmpty(optString)) {
            bArr2 = Base64.decode(optString, 3);
        }
        if (bArr2 == null) {
            A02();
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
                instance.initialize(2048);
                PrivateKey privateKey = instance.genKeyPair().getPrivate();
                if (Build.VERSION.SDK_INT >= 18) {
                    byte[] A052 = A05(privateKey.getEncoded());
                    if (A052 != null) {
                        A03(A052, i2);
                        C18300wT r4 = this.A04;
                        if (!r4.A01().getBoolean("payment_trusted_device_credential_use_keystore", false)) {
                            C13680ns.A0z(C110105dW.A06(r4), "payment_trusted_device_credential_use_keystore", true);
                        }
                        Arrays.fill(A052, (byte) 0);
                        return privateKey;
                    }
                    return null;
                }
                A03(privateKey.getEncoded(), i2);
                return privateKey;
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
                this.A05.A05(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("generate RSA key fails: ")));
            }
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    C18300wT r7 = this.A04;
                    if (!r7.A01().getBoolean("payment_trusted_device_credential_use_keystore", false)) {
                        byte[] A053 = A05(bArr2);
                        if (A053 != null) {
                            A03(bArr2, i2);
                            C13680ns.A0z(C110105dW.A06(r7), "payment_trusted_device_credential_use_keystore", true);
                            Arrays.fill(A053, (byte) 0);
                        }
                    } else {
                        try {
                            String string = r7.A01().getString("payment_trusted_device_credential_encrypted_aes", (String) null);
                            if (TextUtils.isEmpty(string) || (bArr = Base64.decode(string, 3)) == null) {
                                bArr = A04();
                            }
                            if (!(bArr == null || (A062 = A06(bArr)) == null)) {
                                byte[] bArr3 = new byte[16];
                                System.arraycopy(bArr2, 0, bArr3, 0, 16);
                                int length = bArr2.length - 16;
                                byte[] bArr4 = new byte[length];
                                System.arraycopy(bArr2, 16, bArr4, 0, length);
                                SecretKeySpec secretKeySpec = new SecretKeySpec(A062, "AES");
                                Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                instance2.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                                bArr2 = instance2.doFinal(bArr4);
                            }
                        } catch (Exception e3) {
                            this.A05.A05(AnonymousClass000.A0h(e3.toString(), AnonymousClass000.A0r("decrypt key fails: ")));
                        }
                        bArr2 = null;
                    }
                }
                if (bArr2 == null) {
                    return null;
                }
                PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr2);
                KeyFactory instance3 = KeyFactory.getInstance("RSA");
                Arrays.fill(bArr2, (byte) 0);
                return instance3.generatePrivate(pKCS8EncodedKeySpec);
            } catch (Exception e4) {
                this.A05.A05(AnonymousClass000.A0h(e4.toString(), AnonymousClass000.A0r("loadRSAKey fails, ")));
                return null;
            }
        }
    }

    public final void A01() {
        if (!C110115dX.A17(this.A04.A01(), "payment_trusted_device_credential_use_keystore")) {
            try {
                Calendar instance = Calendar.getInstance();
                Calendar instance2 = Calendar.getInstance();
                instance2.add(1, 50);
                KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(this.A03.A00).setAlias("payment_trusted_device_key_alias").setSubject(new X500Principal("CN=payment_trusted_device_key_alias")).setSerialNumber(BigInteger.TEN).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                instance3.initialize(build);
                instance3.generateKeyPair();
            } catch (Exception e2) {
                this.A05.A05(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("generate RSA key pairs fails: ")));
            }
            A04();
        }
    }

    public final synchronized void A02() {
        byte[] decode;
        if (!this.A02) {
            if (this.A01 == null) {
                try {
                    String A0E = C13700nu.A0E(this.A04.A01(), "payments_trusted_device_credential_network_map");
                    this.A01 = A0E != null ? C13700nu.A0K(A0E) : C13700nu.A0J();
                } catch (JSONException e2) {
                    this.A05.A05(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("JSONObject instantiation ")));
                    this.A01 = C13700nu.A0J();
                }
            }
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    this.A00 = instance;
                    instance.load((KeyStore.LoadStoreParameter) null);
                    if (!C110115dX.A17(this.A04.A01(), "payment_trusted_device_credential_use_keystore")) {
                        A01();
                    }
                    this.A02 = true;
                } catch (Exception e3) {
                    AnonymousClass1Vo r2 = this.A05;
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("keystore init fails: ");
                    r2.A05(AnonymousClass000.A0h(e3.toString(), A0o));
                }
            } else {
                this.A02 = true;
            }
            String A0E2 = C13700nu.A0E(this.A04.A01(), "payment_trusted_device_credential");
            if (!TextUtils.isEmpty(A0E2) && (decode = Base64.decode(A0E2, 3)) != null) {
                A03(decode, 1);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03(byte[] r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 3
            java.lang.String r2 = android.util.Base64.encodeToString(r4, r0)     // Catch:{ JSONException -> 0x0021 }
            org.json.JSONObject r1 = r3.A01     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x0021 }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x0021 }
            X.0wT r1 = r3.A04     // Catch:{ JSONException -> 0x0021 }
            org.json.JSONObject r0 = r3.A01     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r2 = r0.toString()     // Catch:{ JSONException -> 0x0021 }
            android.content.SharedPreferences$Editor r1 = X.C110105dW.A06(r1)     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r0 = "payments_trusted_device_credential_network_map"
            X.C13680ns.A0y(r1, r0, r2)     // Catch:{ JSONException -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            X.1Vo r1 = r3.A05     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "setNetworkCredential failed"
            r1.A05(r0)     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r3)
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118975vi.A03(byte[], int):void");
    }

    public final byte[] A04() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        byte[] bArr2 = null;
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, ((KeyStore.PrivateKeyEntry) this.A00.getEntry("payment_trusted_device_key_alias", (KeyStore.ProtectionParameter) null)).getCertificate().getPublicKey());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, instance);
            cipherOutputStream.write(bArr);
            cipherOutputStream.close();
            bArr2 = byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            this.A05.A05(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("RSA encrypt fails: ")));
        }
        if (bArr2 != null) {
            C18300wT r1 = this.A04;
            C13680ns.A0y(C110105dW.A06(r1), "payment_trusted_device_credential_encrypted_aes", Base64.encodeToString(bArr2, 3));
        }
        Arrays.fill(bArr, (byte) 0);
        return bArr2;
    }

    public final byte[] A05(byte[] bArr) {
        byte[] bArr2;
        byte[] A062;
        try {
            String string = this.A04.A01().getString("payment_trusted_device_credential_encrypted_aes", (String) null);
            if (TextUtils.isEmpty(string) || (bArr2 = Base64.decode(string, 3)) == null) {
                bArr2 = A04();
            }
            if (bArr2 == null || (A062 = A06(bArr2)) == null) {
                return null;
            }
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A062, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            byte[] doFinal = instance.doFinal(bArr);
            int length = doFinal.length;
            byte[] bArr4 = new byte[(length + 16)];
            System.arraycopy(bArr3, 0, bArr4, 0, 16);
            System.arraycopy(doFinal, 0, bArr4, 16, length);
            return bArr4;
        } catch (Exception e2) {
            this.A05.A05(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("encrypt key fails: ")));
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A06(byte[] r9) {
        /*
            r8 = this;
            r4 = 0
            java.security.KeyStore r1 = r8.A00     // Catch:{ Exception -> 0x0060 }
            java.lang.String r0 = "payment_trusted_device_key_alias"
            java.security.KeyStore$Entry r3 = r1.getEntry(r0, r4)     // Catch:{ Exception -> 0x0060 }
            java.security.KeyStore$PrivateKeyEntry r3 = (java.security.KeyStore.PrivateKeyEntry) r3     // Catch:{ Exception -> 0x0060 }
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x0060 }
            r1 = 2
            java.security.PrivateKey r0 = r3.getPrivateKey()     // Catch:{ Exception -> 0x0060 }
            r2.init(r1, r0)     // Catch:{ Exception -> 0x0060 }
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0060 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x0060 }
            javax.crypto.CipherInputStream r7 = new javax.crypto.CipherInputStream     // Catch:{ all -> 0x005b }
            r7.<init>(r6, r2)     // Catch:{ all -> 0x005b }
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0056 }
        L_0x0027:
            int r1 = r7.read()     // Catch:{ all -> 0x0056 }
            r0 = -1
            if (r1 == r0) goto L_0x0037
            byte r0 = (byte) r1     // Catch:{ all -> 0x0056 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0056 }
            r5.add(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0027
        L_0x0037:
            int r3 = r5.size()     // Catch:{ all -> 0x0056 }
            byte[] r2 = new byte[r3]     // Catch:{ all -> 0x0056 }
            r1 = 0
        L_0x003e:
            if (r1 >= r3) goto L_0x004f
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x0056 }
            java.lang.Byte r0 = (java.lang.Byte) r0     // Catch:{ all -> 0x0056 }
            byte r0 = r0.byteValue()     // Catch:{ all -> 0x0056 }
            r2[r1] = r0     // Catch:{ all -> 0x0056 }
            int r1 = r1 + 1
            goto L_0x003e
        L_0x004f:
            r7.close()     // Catch:{ all -> 0x005b }
            r6.close()     // Catch:{ Exception -> 0x0060 }
            return r2
        L_0x0056:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            r3 = move-exception
            X.1Vo r2 = r8.A05
            java.lang.String r0 = "RSA decrypt fails: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r2.A05(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118975vi.A06(byte[]):byte[]");
    }
}
