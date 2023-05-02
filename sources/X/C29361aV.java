package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.net.ssl.SSLException;

/* renamed from: X.1aV  reason: invalid class name and case insensitive filesystem */
public class C29361aV implements C29371aW {
    public Cipher A00;
    public SecretKey A01;
    public byte[] A02;

    public byte[] A7k(byte[] bArr, byte[] bArr2, int i2, int i3, long j2) {
        try {
            this.A00.init(2, this.A01, new GCMParameterSpec(128, C29381aX.A00(this.A02, j2)));
            this.A00.updateAAD(bArr);
            return this.A00.doFinal(bArr2, 0, i3);
        } catch (BadPaddingException e2) {
            throw new C29351aU(new SSLException("Bad padding", e2), (byte) 80);
        } catch (IllegalBlockSizeException e3) {
            throw new C29351aU(new SSLException("Illegal block size ", e3), (byte) 80);
        } catch (InvalidAlgorithmParameterException e4) {
            throw new C29351aU(new SSLException("Invalid Algorithm Params", e4), (byte) 80);
        } catch (InvalidKeyException e5) {
            throw new C29351aU(new SSLException(" Invalid Key", e5), (byte) 80);
        }
    }

    public byte[] A8Q(byte[] bArr, byte[] bArr2, int i2, int i3, long j2) {
        try {
            this.A00.init(1, this.A01, new GCMParameterSpec(128, C29381aX.A00(this.A02, j2)));
            this.A00.updateAAD(bArr);
            return this.A00.doFinal(bArr2, 0, i3);
        } catch (BadPaddingException e2) {
            throw new C29351aU(new SSLException("Bad padding", e2), (byte) 80);
        } catch (IllegalBlockSizeException e3) {
            throw new C29351aU(new SSLException("Illegal block size ", e3), (byte) 80);
        } catch (InvalidAlgorithmParameterException e4) {
            throw new C29351aU(new SSLException("Invalid Algorithm Params", e4), (byte) 80);
        } catch (InvalidKeyException e5) {
            throw new C29351aU(new SSLException(" Invalid Key", e5), (byte) 80);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.A00 = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        throw new X.C29351aU(new javax.net.ssl.SSLException("No such padding", r2), (byte) 80);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        throw new X.C29351aU(new javax.net.ssl.SSLException("AES/GCM/NoPadding not found", r2), (byte) 80);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AI0(byte[] r5, byte[] r6) {
        /*
            r4 = this;
            java.lang.String r2 = "AES/GCM/NoPadding"
            r3 = 80
            if (r5 == 0) goto L_0x005f
            int r1 = r5.length
            r0 = 16
            if (r1 != r0) goto L_0x005f
            if (r6 == 0) goto L_0x0052
            int r1 = r6.length
            r0 = 12
            if (r1 != r0) goto L_0x0052
            r4.A02 = r6
            java.lang.String r1 = "AES"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            r0.<init>(r5, r1)
            r4.A01 = r0
            java.lang.String r0 = "AndroidOpenSSL"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r2, r0)     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x0026 }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x0026 }
            return
        L_0x0026:
            java.lang.String r0 = "SC"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r2, r0)     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x002f }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x002f }
            return
        L_0x002f:
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0044, NoSuchPaddingException -> 0x0036 }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException -> 0x0044, NoSuchPaddingException -> 0x0036 }
            return
        L_0x0036:
            r2 = move-exception
            java.lang.String r0 = "No such padding"
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0, r2)
            X.1aU r0 = new X.1aU
            r0.<init>(r1, r3)
            throw r0
        L_0x0044:
            r2 = move-exception
            java.lang.String r0 = "AES/GCM/NoPadding not found"
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0, r2)
            X.1aU r0 = new X.1aU
            r0.<init>(r1, r3)
            throw r0
        L_0x0052:
            java.lang.String r0 = "Invalid iv length."
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0)
            X.1aU r0 = new X.1aU
            r0.<init>(r1, r3)
            throw r0
        L_0x005f:
            java.lang.String r0 = "Invalid key length."
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0)
            X.1aU r0 = new X.1aU
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29361aV.AI0(byte[], byte[]):void");
    }
}
