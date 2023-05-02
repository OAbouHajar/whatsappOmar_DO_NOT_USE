package com.facebook.msys.mci;

import com.obwhatsapp.wamsys.Hex;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class DefaultCrypto implements Crypto {
    public static final int BUFFER_SIZE = 8192;
    public static final String HMAC_SHA256 = "HmacSHA256";
    public static final Class TAG = DefaultCrypto.class;
    public static final String UTF_8 = "UTF-8";
    public static final Crypto mCrypto = new DefaultCrypto();

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ab */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String computeSHA256Impl(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            java.lang.String r3 = "HmacSHA256"
            r4 = r19
            android.net.Uri r1 = com.obwhatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r4)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            java.lang.String r2 = r1.getScheme()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            if (r0 != 0) goto L_0x0127
            java.lang.String r0 = "file"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            if (r0 == 0) goto L_0x0113
            java.lang.String r2 = r1.getPath()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            if (r0 != 0) goto L_0x00ff
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r1.<init>(r2)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            boolean r0 = r1.exists()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            if (r0 == 0) goto L_0x00eb
            java.lang.String r1 = r1.getPath()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ NoSuchAlgorithmException -> 0x00e2, UnsupportedEncodingException -> 0x00d9, InvalidKeyException -> 0x00d0, IOException -> 0x00c7, IllegalStateException -> 0x00be, IllegalArgumentException -> 0x00b5, Exception -> 0x00ac }
            r4.<init>(r1)     // Catch:{ NoSuchAlgorithmException -> 0x00e2, UnsupportedEncodingException -> 0x00d9, InvalidKeyException -> 0x00d0, IOException -> 0x00c7, IllegalStateException -> 0x00be, IllegalArgumentException -> 0x00b5, Exception -> 0x00ac }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00a7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a7 }
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r9]     // Catch:{ all -> 0x00a7 }
            long r16 = r0.length()     // Catch:{ all -> 0x00a7 }
            javax.crypto.Mac r7 = javax.crypto.Mac.getInstance(r3)     // Catch:{ all -> 0x00a7 }
            byte[] r1 = r20.getBytes()     // Catch:{ all -> 0x00a7 }
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ all -> 0x00a7 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x00a7 }
            r7.init(r0)     // Catch:{ all -> 0x00a7 }
            r14 = 0
            r2 = r16
            r12 = 0
            r11 = 1
        L_0x005c:
            r10 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0083
            int r6 = r4.read(r8)     // Catch:{ all -> 0x00a7 }
            r0 = -1
            if (r6 == r0) goto L_0x0083
            r1 = 0
        L_0x0069:
            if (r11 == 0) goto L_0x0076
            if (r1 >= r9) goto L_0x0076
            byte r0 = r8[r1]     // Catch:{ all -> 0x00a7 }
            r11 = 0
            if (r0 != 0) goto L_0x0073
            r11 = 1
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0069
        L_0x0076:
            int r0 = (int) r2     // Catch:{ all -> 0x00a7 }
            int r5 = java.lang.Math.min(r0, r6)     // Catch:{ all -> 0x00a7 }
            r7.update(r8, r10, r5)     // Catch:{ all -> 0x00a7 }
            long r0 = (long) r6     // Catch:{ all -> 0x00a7 }
            long r12 = r12 + r0
            long r0 = (long) r5     // Catch:{ all -> 0x00a7 }
            long r2 = r2 - r0
            goto L_0x005c
        L_0x0083:
            if (r11 != 0) goto L_0x009f
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x009f
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x009f
            byte[] r0 = r7.doFinal()     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = com.obwhatsapp.wamsys.Hex.encodeHex(r0, r10)     // Catch:{ all -> 0x00a7 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ all -> 0x00a7 }
            r4.close()     // Catch:{ NoSuchAlgorithmException -> 0x00e2, UnsupportedEncodingException -> 0x00d9, InvalidKeyException -> 0x00d0, IOException -> 0x00c7, IllegalStateException -> 0x00be, IllegalArgumentException -> 0x00b5, Exception -> 0x00ac }
            return r0
        L_0x009f:
            java.lang.String r1 = "Unable to read all bytes from file"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            throw r0     // Catch:{ NoSuchAlgorithmException -> 0x00e2, UnsupportedEncodingException -> 0x00d9, InvalidKeyException -> 0x00d0, IOException -> 0x00c7, IllegalStateException -> 0x00be, IllegalArgumentException -> 0x00b5, Exception -> 0x00ac }
        L_0x00ac:
            r2 = move-exception
            java.lang.String r1 = "Unexpected exception"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x00b5:
            r2 = move-exception
            java.lang.String r1 = "Invalid arguments"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x00be:
            r2 = move-exception
            java.lang.String r1 = "Couldn't update the hash."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x00c7:
            r2 = move-exception
            java.lang.String r1 = "Couldn't read the content."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x00d0:
            r2 = move-exception
            java.lang.String r1 = "Invalid secret key."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x00d9:
            r2 = move-exception
            java.lang.String r1 = "UTF_8 encoding is not supported."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x00e2:
            r2 = move-exception
            java.lang.String r1 = "HMAC SHA256 algorithm is not found."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x00eb:
            java.lang.String r1 = "File does not exist. Url: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.<init>(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.append(r4)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            java.lang.String r1 = r0.toString()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.<init>(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            throw r0     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
        L_0x00ff:
            java.lang.String r1 = "Invalid input file Url: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.<init>(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.append(r4)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            java.lang.String r1 = r0.toString()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.<init>(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            throw r0     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
        L_0x0113:
            java.lang.String r1 = "Url MUST be of 'file:' scheme. Found: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.<init>(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.append(r2)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            java.lang.String r1 = r0.toString()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.<init>(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            throw r0     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
        L_0x0127:
            java.lang.String r1 = "Invalid fileUrlString: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.<init>(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.append(r4)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            java.lang.String r1 = r0.toString()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            r0.<init>(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
            throw r0     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x013b }
        L_0x013b:
            r2 = move-exception
            java.lang.String r1 = "Exception while parsing fileUrl"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.DefaultCrypto.computeSHA256Impl(java.lang.String, java.lang.String):java.lang.String");
    }

    public static Crypto get() {
        return mCrypto;
    }

    public byte[] computeMd5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            for (int i2 = 0; i2 < length; i2++) {
                sb.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i2])}));
            }
            return sb.toString().getBytes();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("MD5 algorithm was not found. Should not happen", e2);
        }
    }

    public String computeSHA256(String str, String str2) {
        try {
            return computeSHA256Impl(str, str2);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public String computeSHA256(byte[] bArr, String str) {
        if (bArr != null) {
            try {
                Mac instance = Mac.getInstance(HMAC_SHA256);
                instance.init(new SecretKeySpec(str.getBytes(UTF_8), HMAC_SHA256));
                return Hex.encodeHex(instance.doFinal(bArr), false).toLowerCase(Locale.US);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException("HMAC SHA256 algorithm is not found.", e2);
            } catch (UnsupportedEncodingException e3) {
                throw new RuntimeException("UTF_8 encoding is not supported.", e3);
            } catch (InvalidKeyException e4) {
                throw new RuntimeException("Invalid secret key.", e4);
            }
        } else {
            throw new NullPointerException(String.valueOf("file bytes can not be null"));
        }
    }
}
