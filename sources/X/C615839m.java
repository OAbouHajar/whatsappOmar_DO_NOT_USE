package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.39m  reason: invalid class name and case insensitive filesystem */
public final class C615839m {
    public File A00;
    public final C16200sd A01;
    public final AnonymousClass4WW A02;
    public final AnonymousClass12W A03;
    public final File A04;
    public final Object A05 = C13690nt.A0Y();
    public final String A06;
    public final byte[] A07;

    public C615839m(C16180sb r14, C16200sd r15, AnonymousClass39E r16, C16190sc r17, AnonymousClass12W r18, C16980tz r19, C16260sj r20, File file, String str, String str2) {
        byte[] bArr;
        File file2 = file;
        this.A04 = file2;
        C16200sd r6 = r15;
        this.A01 = r15;
        this.A03 = r18;
        String str3 = str2;
        if (r15.A03.A1f()) {
            String str4 = str;
            if (str != null && str4.startsWith(r16.A04)) {
                try {
                    C16190sc r2 = r17;
                    String A09 = AnonymousClass2GK.A09(r2, r20, file2, file2.length());
                    if (A09 != null) {
                        AnonymousClass4WW r5 = new AnonymousClass4WW(r6, str3, A09, file2.length(), file2.lastModified());
                        this.A02 = r5;
                        String str5 = r5.A03;
                        byte[] A032 = r15.A01.A03();
                        try {
                            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
                            instance.init(new SecretKeySpec(A032, DefaultCrypto.HMAC_SHA256));
                            byte[] bytes = str3.getBytes();
                            MessageDigest instance2 = MessageDigest.getInstance("SHA-256");
                            instance2.update(bytes);
                            instance.update(instance2.digest());
                            bArr = instance.doFinal(AnonymousClass1ZW.A0G(str5));
                        } catch (NoSuchAlgorithmException e2) {
                            throw new AssertionError(e2);
                        } catch (InvalidKeyException | NoSuchAlgorithmException e3) {
                            Log.e("EncBackupManager/getMediaDecryptionHash failed", e3);
                            bArr = null;
                        }
                        this.A07 = bArr;
                        if (bArr != null) {
                            File file3 = r14.A05().A0A;
                            C16180sb.A04(file3, false);
                            StringBuilder A0o = AnonymousClass000.A0o();
                            A0o.append(C004101u.A04(bArr));
                            String A08 = AnonymousClass2GK.A08(r19.A00, r2, C13700nu.A0C(file3, AnonymousClass000.A0h(".mcrypt1", A0o)));
                            if (A08 != null) {
                                this.A06 = A08;
                                return;
                            }
                            throw AnonymousClass000.A0T("Filed to get a new uploadPath");
                        }
                        throw AnonymousClass000.A0V("Filed to get media decryption hash");
                    }
                } catch (C71153iZ e4) {
                    Log.w("gdrive/local-file/calcMd5() failed", e4);
                }
            }
        }
        this.A06 = str3;
    }

    public long A00() {
        return (!this.A01.A03.A1f() || this.A07 == null) ? this.A04.length() : this.A04.length() + 16;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        com.whatsapp.util.Log.w("EncBackupManager/encrypt media failed", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x008a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008f */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095 A[ExcHandler: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r0v15 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:15:0x0059] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A01() {
        /*
            r10 = this;
            X.0sd r3 = r10.A01
            X.0rz r0 = r3.A03
            boolean r0 = r0.A1f()
            if (r0 == 0) goto L_0x00a0
            byte[] r2 = r10.A07
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r4 = r10.A05
            monitor-enter(r4)
            java.io.File r0 = r10.A00     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.exists()     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0099
        L_0x001b:
            X.12W r0 = r10.A03     // Catch:{ all -> 0x009d }
            X.1XH r0 = r0.A00()     // Catch:{ all -> 0x009d }
            r0.A01()     // Catch:{ all -> 0x009d }
            java.io.File r1 = r0.A03     // Catch:{ all -> 0x009d }
            java.lang.String r0 = r10.A06     // Catch:{ all -> 0x009d }
            java.io.File r0 = X.C13700nu.A0D(r0)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x009d }
            java.io.File r7 = X.C13700nu.A0C(r1, r0)     // Catch:{ all -> 0x009d }
            r10.A00 = r7     // Catch:{ all -> 0x009d }
            java.io.File r8 = r10.A04     // Catch:{ all -> 0x009d }
            java.lang.String r5 = "EncBackupManager/encrypt media failed"
            X.0sk r0 = r3.A01     // Catch:{ all -> 0x009d }
            byte[] r1 = r0.A03()     // Catch:{ all -> 0x009d }
            r9 = 0
            if (r1 == 0) goto L_0x0099
            r0 = 48
            byte[] r3 = X.C40771uf.A00(r1, r2, r0)     // Catch:{ all -> 0x009d }
            r2 = 32
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x009d }
            java.lang.System.arraycopy(r3, r9, r1, r9, r2)     // Catch:{ all -> 0x009d }
            r0 = 16
            byte[] r6 = new byte[r0]     // Catch:{ all -> 0x009d }
            java.lang.System.arraycopy(r3, r2, r6, r9, r0)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            r2.<init>(r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            r1.<init>(r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            r0 = 1
            r3.init(r0, r2, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0090, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x0090, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x008b }
            r0.<init>(r7)     // Catch:{ all -> 0x008b }
            javax.crypto.CipherOutputStream r1 = new javax.crypto.CipherOutputStream     // Catch:{ all -> 0x008b }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x008b }
            X.AnonymousClass1XI.A0H(r2, r1)     // Catch:{ all -> 0x0086 }
            r1.close()     // Catch:{ all -> 0x008b }
            r2.close()     // Catch:{ IOException -> 0x0090, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            goto L_0x0099
        L_0x0086:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x008a }
        L_0x008a:
            throw r0     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x008f }
        L_0x008f:
            throw r0     // Catch:{ IOException -> 0x0090, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
        L_0x0090:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)     // Catch:{ all -> 0x009d }
        L_0x0099:
            java.io.File r0 = r10.A00     // Catch:{ all -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x009d }
            return r0
        L_0x009d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009d }
            throw r0
        L_0x00a0:
            java.io.File r0 = r10.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615839m.A01():java.io.File");
    }

    public void A02() {
        synchronized (this.A05) {
            File file = this.A00;
            if (file != null && file.exists() && !this.A00.delete()) {
                Log.w("local-file/cleanup/failed to delete a file");
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C615839m.class != obj.getClass()) {
                return false;
            }
            C615839m r5 = (C615839m) obj;
            if (!this.A04.equals(r5.A04) || !C34901l3.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A04;
        return AnonymousClass000.A0F(this.A02, A1Z, 1);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("LocalFile{file=");
        A0r.append(this.A04);
        A0r.append(", metadata=");
        A0r.append(this.A02);
        return AnonymousClass000.A0k(A0r);
    }
}
