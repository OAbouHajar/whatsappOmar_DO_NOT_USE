package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.Enumeration;
import javax.crypto.SecretKey;

/* renamed from: X.1mb  reason: invalid class name and case insensitive filesystem */
public class C35851mb extends C35841ma {
    public KeyStore A00;
    public final C14710pd A01;

    public C35851mb(C16300so r1, C15900s5 r2, C14710pd r3, C17020u3 r4) {
        super(r1, r2, r4);
        this.A01 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C35811mX A00(byte[] r11) {
        /*
            r10 = this;
            java.lang.String r3 = "ged"
            java.security.KeyStore r1 = r10.A04()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            java.lang.String r4 = "aes_auth_key"
            boolean r0 = r1.containsAlias(r4)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            if (r0 == 0) goto L_0x001b
            java.lang.Class<java.security.KeyStore$SecretKeyEntry> r0 = java.security.KeyStore.SecretKeyEntry.class
            boolean r0 = r1.entryInstanceOf(r4, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            if (r0 == 0) goto L_0x001b
            javax.crypto.SecretKey r2 = r10.A05()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            goto L_0x005b
        L_0x001b:
            java.lang.String r1 = "AES"
            java.lang.String r0 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r6 = javax.crypto.KeyGenerator.getInstance(r1, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            r0 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r2 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            r2.<init>(r4, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            r5 = 1
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            java.lang.String r0 = "GCM"
            r4 = 0
            r1[r4] = r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            android.security.keystore.KeyGenParameterSpec$Builder r2 = r2.setBlockModes(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            java.lang.String r0 = "NoPadding"
            r1[r4] = r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r2.setEncryptionPaddings(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r0.setUserAuthenticationRequired(r4)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            boolean r0 = X.C15450qv.A08()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            if (r0 == 0) goto L_0x0050
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setUserConfirmationRequired(r4)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            r0.setUserPresenceRequired(r4)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
        L_0x0050:
            android.security.keystore.KeyGenParameterSpec r0 = r1.build()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            r6.init(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            javax.crypto.SecretKey r2 = r6.generateKey()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
        L_0x005b:
            if (r2 == 0) goto L_0x0078
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            r0 = 1
            r1.init(r0, r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            byte[] r7 = r1.getIV()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            byte[] r6 = r1.doFinal(r11)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            r9 = 0
            r5 = 0
            X.1mX r4 = new X.1mX     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            return r4
        L_0x0078:
            java.lang.String r1 = "could not get key store entry"
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            r0.<init>(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
            throw r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0080, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x008b }
        L_0x0080:
            r2 = move-exception
            java.lang.String r0 = "EncryptedKeyHelperAESKeyStore/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "crypto issue on encryption"
            goto L_0x0095
        L_0x008b:
            r2 = move-exception
            java.lang.String r0 = "EncryptedKeyHelperAESKeyStore/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "key store issue on decryption"
        L_0x0095:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L_0x00a9
            java.lang.Throwable r2 = r2.getCause()
        L_0x00a9:
            r10.A02(r3, r2)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35851mb.A00(byte[]):X.1mX");
    }

    public void A01() {
        try {
            A04().deleteEntry("aes_auth_key");
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            StringBuilder sb = new StringBuilder("EncryptedKeyHelperAESKeyStore/");
            sb.append("failed to clear keyStore");
            Log.e(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A03(X.C35861mc r9, X.C35811mX r10) {
        /*
            r8 = this;
            java.lang.String r3 = "gd-"
            int r0 = r10.A00
            r7 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "EncryptedKeyHelperAESKeyStore/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "getDecrypted invalid type"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r7
        L_0x001b:
            javax.crypto.SecretKey r6 = r8.A05()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
            if (r6 == 0) goto L_0x003b
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
            r4 = 2
            r2 = 128(0x80, float:1.794E-43)
            byte[] r1 = r10.A03     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
            r0.<init>(r2, r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
            r5.init(r4, r6, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
            byte[] r0 = r10.A02     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
            byte[] r0 = r5.doFinal(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
            return r0
        L_0x003b:
            java.lang.String r1 = "could not get key store entry"
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
            r0.<init>(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
            throw r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0043, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x004e }
        L_0x0043:
            r2 = move-exception
            java.lang.String r0 = "EncryptedKeyHelperAESKeyStore/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "crypto issue on decryption"
            goto L_0x0058
        L_0x004e:
            r2 = move-exception
            java.lang.String r0 = "EncryptedKeyHelperAESKeyStore/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "key store issue on decryption"
        L_0x0058:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            int r0 = r9.ordinal()
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = "active"
        L_0x0072:
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L_0x0083
            java.lang.Throwable r2 = r2.getCause()
        L_0x0083:
            r8.A02(r1, r2)
            return r7
        L_0x0087:
            java.lang.String r0 = "selftest"
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35851mb.A03(X.1mc, X.1mX):byte[]");
    }

    public final KeyStore A04() {
        if (this.A00 == null || !this.A01.A0E(C16620tM.A02, 1862)) {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.A00 = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        }
        return this.A00;
    }

    public final SecretKey A05() {
        try {
            return A06(A04());
        } catch (UnrecoverableKeyException e2) {
            e = e2;
            StringBuilder sb = new StringBuilder("EncryptedKeyHelperAESKeyStore/");
            sb.append(" KeyStore error, will wait and retry with new keystore");
            Log.e(sb.toString());
            if (e.getCause() != null) {
                e = e.getCause();
            }
            A02("gd", e);
            SystemClock.sleep(50);
            return A06(A04());
        }
    }

    public final SecretKey A06(KeyStore keyStore) {
        KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry("aes_auth_key", (KeyStore.ProtectionParameter) null);
        if (secretKeyEntry != null) {
            return secretKeyEntry.getSecretKey();
        }
        Enumeration<String> aliases = keyStore.aliases();
        StringBuilder sb = new StringBuilder("Missing key alias ");
        sb.append("aes_auth_key");
        sb.append("; available aliases = ");
        sb.append(TextUtils.join(",", Collections.list(aliases)));
        throw new KeyStoreException(sb.toString());
    }
}
