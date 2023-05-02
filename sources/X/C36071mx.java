package X;

/* renamed from: X.1mx  reason: invalid class name and case insensitive filesystem */
public class C36071mx {
    public static final Object A02 = new Object();
    public final C36041mu A00;
    public final C36061mw A01;

    public C36071mx(C36041mu r1, C36061mw r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01eb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f1, code lost:
        throw new X.C36161n6(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01eb A[ExcHandler: 1nI | 1nJ (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A00(X.C36131n3 r14, byte[] r15) {
        /*
            r13 = this;
            X.1mu r9 = r13.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1mw r7 = r13.A01     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1fF r8 = r9.A00(r7)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            java.util.LinkedList r1 = r8.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            boolean r0 = r1.isEmpty()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 != 0) goto L_0x01d4
            X.1nA r2 = new X.1nA     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r2.<init>(r15)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r4 = r2.A01     // Catch:{ 1nI | 1nJ -> 0x01eb }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x001b:
            boolean r0 = r3.hasNext()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r10 = r3.next()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1o0 r10 = (X.C36721o0) r10     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1o1 r1 = r10.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r0 = r1.A01     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 != r4) goto L_0x001b
            X.1nD r0 = r1.A04     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 != 0) goto L_0x0033
            X.1nD r0 = X.C36231nD.A03     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x0033:
            X.1Ww r0 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x01eb }
            byte[] r0 = r0.A04()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1nF r0 = X.C36241nE.A00(r0)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r2.A00(r0)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r11 = r2.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.4bH r6 = r10.A00()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r3 = r6.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r3 <= r11) goto L_0x00e5
            X.1o1 r0 = r10.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1XE r0 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x01eb }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x0052:
            boolean r0 = r1.hasNext()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r1.next()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.2LG r0 = (X.AnonymousClass2LG) r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r0 = r0.A01     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 != r11) goto L_0x0052
            X.1o1 r0 = r10.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1XE r0 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x01eb }
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r6.<init>(r0)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x006f:
            boolean r0 = r1.hasNext()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r3 = 0
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r5 = r1.next()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.2LG r5 = (X.AnonymousClass2LG) r5     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r0 = r5.A01     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 != r11) goto L_0x006f
            r1.remove()     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x0083:
            X.1o1 r0 = r10.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wr r11 = r0.A0U()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r11.A03()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wm r1 = r11.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1o1 r1 = (X.C36731o1) r1     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.2NE r0 = X.AnonymousClass2NE.A01     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r1.A02 = r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r11.A03()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wm r4 = r11.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1o1 r4 = (X.C36731o1) r4     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1XE r1 = r4.A02     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            boolean r0 = r0.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 != 0) goto L_0x00aa
            X.1XE r1 = X.C28541Wm.A0G(r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r4.A02 = r1     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x00aa:
            X.C28591Ws.A01(r6, r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wm r0 = r11.A02()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1o1 r0 = (X.C36731o1) r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r10.A00 = r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            goto L_0x00b8
        L_0x00b6:
            r5 = r3
            goto L_0x0083
        L_0x00b8:
            if (r5 == 0) goto L_0x018b
            int r1 = r5.A01     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Ww r0 = r5.A02     // Catch:{ 1nI | 1nJ -> 0x01eb }
            byte[] r0 = r0.A04()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1nH r3 = new X.1nH     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r3.<init>(r1, r0)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            goto L_0x018b
        L_0x00c9:
            java.lang.String r0 = "Received message with old counter: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r1.<init>(r0)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r1.append(r3)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            java.lang.String r0 = " , "
            r1.append(r0)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r1.append(r11)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            java.lang.String r1 = r1.toString()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1n5 r0 = new X.1n5     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0.<init>(r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x00e5:
            int r0 = r11 - r3
            r5 = 2000(0x7d0, float:2.803E-42)
            if (r0 <= r5) goto L_0x00f3
            java.lang.String r1 = "Over 2000 messages into the future!"
            X.1n6 r0 = new X.1n6     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0.<init>((java.lang.String) r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x00f3:
            int r0 = r6.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 >= r11) goto L_0x0180
            X.1nH r12 = r6.A01()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.2LG r0 = X.AnonymousClass2LG.A03     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wr r4 = r0.A0U()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r3 = r12.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r4.A03()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wm r1 = r4.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.2LG r1 = (X.AnonymousClass2LG) r1     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r0 = r1.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0 = r0 | 1
            r1.A00 = r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r1.A01 = r3     // Catch:{ 1nI | 1nJ -> 0x01eb }
            byte[] r3 = r12.A03     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r1 = r3.length     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0 = 0
            X.1Ww r3 = X.C28631Ww.A01(r3, r0, r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r4.A03()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wm r1 = r4.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.2LG r1 = (X.AnonymousClass2LG) r1     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r0 = r1.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0 = r0 | 2
            r1.A00 = r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r1.A02 = r3     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wm r4 = r4.A02()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1o1 r0 = r10.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wr r12 = r0.A0U()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r12.A03()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wm r3 = r12.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1o1 r3 = (X.C36731o1) r3     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1XE r1 = r3.A02     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            boolean r0 = r0.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 != 0) goto L_0x0149
            X.1XE r1 = X.C28541Wm.A0G(r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r3.A02 = r1     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x0149:
            r1.add(r4)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wm r0 = r12.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1o1 r0 = (X.C36731o1) r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1XE r0 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x01eb }
            int r0 = r0.size()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 <= r5) goto L_0x0172
            r12.A03()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1Wm r4 = r12.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1o1 r4 = (X.C36731o1) r4     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r3 = 0
            X.1XE r1 = r4.A02     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            boolean r0 = r0.A00     // Catch:{ 1nI | 1nJ -> 0x01eb }
            if (r0 != 0) goto L_0x016f
            X.1XE r1 = X.C28541Wm.A0G(r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r4.A02 = r1     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x016f:
            r1.remove(r3)     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x0172:
            X.1Wm r0 = r12.A02()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1o1 r0 = (X.C36731o1) r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r10.A00 = r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.4bH r6 = r6.A00()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            goto L_0x00f3
        L_0x0180:
            X.4bH r0 = r6.A00()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r10.A01(r0)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1nH r3 = r6.A01()     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x018b:
            byte[] r0 = r3.A02     // Catch:{ 1nI | 1nJ -> 0x01eb }
            byte[] r6 = r3.A01     // Catch:{ 1nI | 1nJ -> 0x01eb }
            byte[] r5 = r2.A02     // Catch:{ 1nI | 1nJ -> 0x01eb }
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x01b9, BadPaddingException | IllegalBlockSizeException -> 0x01b2, 1nI | 1nJ -> 0x01eb }
            r4.<init>(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x01b9, BadPaddingException | IllegalBlockSizeException -> 0x01b2, 1nI | 1nJ -> 0x01eb }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x01b9, BadPaddingException | IllegalBlockSizeException -> 0x01b2, 1nI | 1nJ -> 0x01eb }
            r2 = 2
            java.lang.String r1 = "AES"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x01b9, BadPaddingException | IllegalBlockSizeException -> 0x01b2, 1nI | 1nJ -> 0x01eb }
            r0.<init>(r6, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x01b9, BadPaddingException | IllegalBlockSizeException -> 0x01b2, 1nI | 1nJ -> 0x01eb }
            r3.init(r2, r0, r4)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x01b9, BadPaddingException | IllegalBlockSizeException -> 0x01b2, 1nI | 1nJ -> 0x01eb }
            byte[] r0 = r3.doFinal(r5)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x01b9, BadPaddingException | IllegalBlockSizeException -> 0x01b2, 1nI | 1nJ -> 0x01eb }
            r14.AHO(r0)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r9.A01(r7, r8)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            return r0
        L_0x01b2:
            r1 = move-exception
            X.1n6 r0 = new X.1n6     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x01b9:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0.<init>(r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x01c0:
            java.lang.String r1 = "No keys for: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0.<init>(r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0.append(r4)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            java.lang.String r1 = r0.toString()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1nI r0 = new X.1nI     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0.<init>((java.lang.String) r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x01d4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r1.<init>()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            java.lang.String r0 = "No sender key for: "
            r1.append(r0)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r1.append(r7)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            java.lang.String r1 = r1.toString()     // Catch:{ 1nI | 1nJ -> 0x01eb }
            X.1n4 r0 = new X.1n4     // Catch:{ 1nI | 1nJ -> 0x01eb }
            r0.<init>((java.lang.String) r1)     // Catch:{ 1nI | 1nJ -> 0x01eb }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x01eb }
        L_0x01eb:
            r1 = move-exception
            X.1n6 r0 = new X.1n6
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36071mx.A00(X.1n3, byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068 A[SYNTHETIC, Splitter:B:19:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084 A[Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x008c, 1nI -> 0x009b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A01(byte[] r13) {
        /*
            r12 = this;
            X.1mu r7 = r12.A00     // Catch:{ 1nI -> 0x009b }
            X.1mw r6 = r12.A01     // Catch:{ 1nI -> 0x009b }
            X.1fF r5 = r7.A00(r6)     // Catch:{ 1nI -> 0x009b }
            java.util.LinkedList r1 = r5.A00     // Catch:{ 1nI -> 0x009b }
            boolean r0 = r1.isEmpty()     // Catch:{ 1nI -> 0x009b }
            if (r0 != 0) goto L_0x0093
            r0 = 0
            java.lang.Object r4 = r1.get(r0)     // Catch:{ 1nI -> 0x009b }
            X.1o0 r4 = (X.C36721o0) r4     // Catch:{ 1nI -> 0x009b }
            X.4bH r0 = r4.A00()     // Catch:{ 1nI -> 0x009b }
            X.1nH r9 = r0.A01()     // Catch:{ 1nI -> 0x009b }
            X.1o1 r2 = r4.A00     // Catch:{ 1nI -> 0x009b }
            int r0 = r2.A00     // Catch:{ 1nI -> 0x009b }
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x0039
            X.1nD r0 = r2.A04     // Catch:{ 1nI -> 0x009b }
            r2 = r0
            if (r0 != 0) goto L_0x002f
            X.1nD r0 = X.C36231nD.A03     // Catch:{ 1nI -> 0x009b }
        L_0x002f:
            int r0 = r0.A00     // Catch:{ 1nI -> 0x009b }
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0039
            if (r2 != 0) goto L_0x003d
            goto L_0x003b
        L_0x0039:
            r8 = 0
            goto L_0x0048
        L_0x003b:
            X.1nD r2 = X.C36231nD.A03     // Catch:{ 1nI -> 0x009b }
        L_0x003d:
            X.1Ww r0 = r2.A01     // Catch:{ 1nI -> 0x009b }
            byte[] r0 = r0.A04()     // Catch:{ 1nI -> 0x009b }
            X.1nV r8 = new X.1nV     // Catch:{ 1nI -> 0x009b }
            r8.<init>(r0)     // Catch:{ 1nI -> 0x009b }
        L_0x0048:
            byte[] r0 = r9.A02     // Catch:{ 1nI -> 0x009b }
            byte[] r11 = r9.A01     // Catch:{ 1nI -> 0x009b }
            javax.crypto.spec.IvParameterSpec r10 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x008c }
            r10.<init>(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x008c }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x008c }
            r2 = 1
            java.lang.String r1 = "AES"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x008c }
            r0.<init>(r11, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x008c }
            r3.init(r2, r0, r10)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x008c }
            byte[] r3 = r3.doFinal(r13)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x008c }
            if (r8 == 0) goto L_0x0084
            X.1o1 r0 = r4.A00     // Catch:{ 1nI -> 0x009b }
            int r2 = r0.A01     // Catch:{ 1nI -> 0x009b }
            int r0 = r9.A00     // Catch:{ 1nI -> 0x009b }
            X.1nA r1 = new X.1nA     // Catch:{ 1nI -> 0x009b }
            r1.<init>(r8, r3, r2, r0)     // Catch:{ 1nI -> 0x009b }
            X.4bH r0 = r4.A00()     // Catch:{ 1nI -> 0x009b }
            X.4bH r0 = r0.A00()     // Catch:{ 1nI -> 0x009b }
            r4.A01(r0)     // Catch:{ 1nI -> 0x009b }
            r7.A01(r6, r5)     // Catch:{ 1nI -> 0x009b }
            byte[] r0 = r1.A03     // Catch:{ 1nI -> 0x009b }
            return r0
        L_0x0084:
            java.lang.String r1 = "Session missing signature key!"
            X.1nJ r0 = new X.1nJ     // Catch:{ 1nI -> 0x009b }
            r0.<init>(r1)     // Catch:{ 1nI -> 0x009b }
            throw r0     // Catch:{ 1nI -> 0x009b }
        L_0x008c:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ 1nI -> 0x009b }
            r0.<init>(r1)     // Catch:{ 1nI -> 0x009b }
            throw r0     // Catch:{ 1nI -> 0x009b }
        L_0x0093:
            java.lang.String r1 = "No key state in record!"
            X.1nI r0 = new X.1nI     // Catch:{ 1nI -> 0x009b }
            r0.<init>((java.lang.String) r1)     // Catch:{ 1nI -> 0x009b }
            throw r0     // Catch:{ 1nI -> 0x009b }
        L_0x009b:
            r1 = move-exception
            X.1n4 r0 = new X.1n4
            r0.<init>((java.lang.Exception) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36071mx.A01(byte[]):byte[]");
    }
}
