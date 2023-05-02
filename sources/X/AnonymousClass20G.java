package X;

/* renamed from: X.20G  reason: invalid class name */
public class AnonymousClass20G {
    public final long A00;
    public final C43061zH A01;
    public final byte[] A02;

    public AnonymousClass20G(C43061zH r3, byte[] bArr, long j2) {
        this.A01 = r3;
        this.A02 = bArr;
        this.A00 = j2 - 10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.io.InputStream r21, java.io.OutputStream r22, int r23, long r24, long r26) {
        /*
            r20 = this;
            r11 = 0
            r1 = 0
            r4 = r24
            int r0 = (r24 > r11 ? 1 : (r24 == r11 ? 0 : -1))
            r14 = r20
            r19 = r21
            if (r0 != 0) goto L_0x009b
            X.1zH r9 = r14.A01
            byte[] r3 = r9.A01
        L_0x0011:
            byte[] r0 = r9.A02
            javax.crypto.Mac r17 = X.C61873At.A02(r3, r0)
            long r6 = r14.A00
            int r0 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0076
            r9 = 0
        L_0x001e:
            r8 = 0
        L_0x001f:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r0]
            r2 = r26
        L_0x0025:
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            r18 = r22
            if (r0 <= 0) goto L_0x00b8
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)
            int r11 = (int) r0
            long r0 = (long) r11
            long r2 = r2 - r0
            r13 = 0
        L_0x0035:
            if (r13 >= r11) goto L_0x0044
            int r15 = r11 - r13
            r12 = r19
            int r12 = r12.read(r10, r13, r15)
            r15 = -1
            if (r12 == r15) goto L_0x00b0
            int r13 = r13 + r12
            goto L_0x0035
        L_0x0044:
            r13 = 0
            r12 = r17
            r12.update(r10, r13, r11)
            long r12 = r26 - r2
            long r15 = r24 + r12
            int r12 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x0055
            long r15 = r15 - r6
            long r0 = r0 - r15
            int r11 = (int) r0
        L_0x0055:
            if (r11 <= 0) goto L_0x0069
            java.lang.String r0 = "cipher should not be null"
            X.AnonymousClass00B.A07(r9, r0)
            r12 = 0
            byte[] r11 = r9.update(r10, r12, r11)
            if (r11 == 0) goto L_0x006c
            int r1 = r11.length
            r0 = r18
            r0.write(r11, r12, r1)
        L_0x0069:
            r11 = 0
            goto L_0x0025
        L_0x006c:
            if (r8 != 0) goto L_0x0069
            java.lang.String r1 = "decryption failed"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0076:
            long r1 = r24 + r26
            r8 = 2
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            byte[] r2 = r9.A00
            if (r0 < 0) goto L_0x0085
            javax.crypto.Cipher r9 = X.C61873At.A01(r3, r2, r8)
            r8 = 1
            goto L_0x001f
        L_0x0085:
            java.lang.String r0 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r9 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x011a }
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x011a }
            r1.<init>(r2, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x011a }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x011a }
            r0.<init>(r3)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x011a }
            r9.init(r8, r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x011a }
            goto L_0x001e
        L_0x009b:
            r2 = 16
            byte[] r3 = new byte[r2]
            r0 = r19
            int r1 = r0.read(r3, r1, r2)
            r0 = 0
            if (r1 != r2) goto L_0x00a9
            r0 = 1
        L_0x00a9:
            X.AnonymousClass00B.A0G(r0)
            X.1zH r9 = r14.A01
            goto L_0x0011
        L_0x00b0:
            java.lang.String r1 = "Stream unexpectedly closed!"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x00b8:
            if (r8 == 0) goto L_0x00de
            if (r9 == 0) goto L_0x00de
            byte[] r1 = r9.doFinal()     // Catch:{ IllegalBlockSizeException -> 0x00d2, BadPaddingException -> 0x00c6 }
            r0 = r18
            r0.write(r1)     // Catch:{ IllegalBlockSizeException -> 0x00d2, BadPaddingException -> 0x00c6 }
            goto L_0x00de
        L_0x00c6:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
            java.lang.String r1 = "Bad padding!"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
            java.lang.String r1 = "Bad block size!"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x00de:
            byte[] r3 = r17.doFinal()
            r1 = 10
            byte[] r2 = new byte[r1]
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r2, r0, r1)
            byte[] r1 = r14.A02
            r3 = r23
            int r0 = r23 + 10
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            boolean r0 = java.security.MessageDigest.isEqual(r0, r2)
            if (r0 == 0) goto L_0x00fb
            return
        L_0x00fb:
            java.lang.String r0 = "ChunkCipherDecrypter/match failed at byte_offset="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = ", end_of_payload="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.20H r0 = new X.20H
            r0.<init>()
            throw r0
        L_0x011a:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass20G.A00(java.io.InputStream, java.io.OutputStream, int, long, long):void");
    }
}
