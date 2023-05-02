package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1nK  reason: invalid class name and case insensitive filesystem */
public class C36301nK {
    public static final Object A04 = new Object();
    public final C35971mn A00;
    public final C35971mn A01;
    public final C36461na A02;
    public final C36421nW A03;

    public C36301nK(C35971mn r7, C35971mn r8, C35971mn r9, C36451nZ r10, C36421nW r11) {
        this.A01 = r7;
        this.A00 = r8;
        this.A03 = r11;
        this.A02 = new C36461na(r7, r8, r9, r10, r11);
    }

    public static final Cipher A00(SecretKeySpec secretKeySpec, int i2, int i3) {
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr = new byte[16];
            bArr[3] = (byte) i3;
            bArr[2] = (byte) (i3 >> 8);
            bArr[1] = (byte) (i3 >> 16);
            bArr[0] = (byte) (i3 >> 24);
            instance.init(i2, secretKeySpec, new IvParameterSpec(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.1mz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.1mz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.1mz} */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0120, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0126, code lost:
        throw new java.lang.AssertionError(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0120 A[ExcHandler: BadPaddingException | IllegalBlockSizeException (r1v8 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:5:0x0025] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C36091mz A01(byte[] r21) {
        /*
            r20 = this;
            r0 = r20
            X.1mn r5 = r0.A01
            X.1nW r4 = r0.A03
            X.1nc r3 = r5.A02(r4)
            X.1ni r2 = r3.A01
            X.1no r1 = r2.A04()
            X.4Mr r9 = r1.A00()
            X.1nF r15 = r2.A03()
            X.1mt r0 = r2.A00
            int r8 = r0.A02
            int r6 = r0.A04
            if (r6 != 0) goto L_0x0021
            r6 = 2
        L_0x0021:
            r0 = 3
            r11 = 1
            if (r6 < r0) goto L_0x003a
            javax.crypto.spec.SecretKeySpec r10 = r9.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0120 }
            javax.crypto.spec.IvParameterSpec r7 = r9.A01     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0120 }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0033, BadPaddingException | IllegalBlockSizeException -> 0x0120 }
            r0.init(r11, r10, r7)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0033, BadPaddingException | IllegalBlockSizeException -> 0x0120 }
            goto L_0x0042
        L_0x0033:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0120 }
            r0.<init>(r1)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0120 }
            throw r0     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0120 }
        L_0x003a:
            javax.crypto.spec.SecretKeySpec r7 = r9.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0120 }
            int r0 = r9.A00     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0120 }
            javax.crypto.Cipher r0 = A00(r7, r11, r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0120 }
        L_0x0042:
            r7 = r21
            byte[] r16 = r0.doFinal(r7)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x0120 }
            X.1nL r11 = new X.1nL
            javax.crypto.spec.SecretKeySpec r12 = r9.A03
            int r7 = r1.A00
            X.1nO r13 = r2.A01()
            X.1nO r14 = r2.A02()
            r18 = r7
            r19 = r8
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            X.1mt r9 = r2.A00
            int r8 = r9.A00
            r0 = 128(0x80, float:1.794E-43)
            r8 = r8 & r0
            if (r8 != r0) goto L_0x00bb
            X.1nq r0 = r9.A0C     // Catch:{ 1nJ -> 0x00b4 }
            r10 = r0
            r9 = r0
            if (r0 != 0) goto L_0x0070
            X.1nq r0 = X.C36621nq.A04     // Catch:{ 1nJ -> 0x00b4 }
        L_0x0070:
            int r0 = r0.A00     // Catch:{ 1nJ -> 0x00b4 }
            r8 = 1
            r0 = r0 & 1
            if (r0 != r8) goto L_0x0087
            if (r10 != 0) goto L_0x007b
            X.1nq r9 = X.C36621nq.A04     // Catch:{ 1nJ -> 0x00b4 }
        L_0x007b:
            int r0 = r9.A01     // Catch:{ 1nJ -> 0x00b4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1nJ -> 0x00b4 }
            X.1ng r9 = new X.1ng     // Catch:{ 1nJ -> 0x00b4 }
            r9.<init>(r0)     // Catch:{ 1nJ -> 0x00b4 }
            goto L_0x0089
        L_0x0087:
            X.1ne r9 = X.C36501ne.A00     // Catch:{ 1nJ -> 0x00b4 }
        L_0x0089:
            r0 = r10
            if (r10 != 0) goto L_0x008e
            X.1nq r0 = X.C36621nq.A04     // Catch:{ 1nJ -> 0x00b4 }
        L_0x008e:
            int r8 = r0.A02     // Catch:{ 1nJ -> 0x00b4 }
            if (r10 != 0) goto L_0x0094
            X.1nq r10 = X.C36621nq.A04     // Catch:{ 1nJ -> 0x00b4 }
        L_0x0094:
            X.1Ww r0 = r10.A03     // Catch:{ 1nJ -> 0x00b4 }
            byte[] r0 = r0.A04()     // Catch:{ 1nJ -> 0x00b4 }
            X.1nF r13 = X.C36241nE.A00(r0)     // Catch:{ 1nJ -> 0x00b4 }
            X.1mt r0 = r2.A00
            int r0 = r0.A01
            X.1nO r12 = r2.A01()
            r14 = r11
            X.1nN r11 = new X.1nN
            r15 = r9
            r16 = r6
            r17 = r0
            r18 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00bb
        L_0x00b4:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            byte[] r0 = X.C36601no.A03
            byte[] r6 = r1.A01(r0)
            X.1nl r1 = r1.A01
            int r0 = r7 + 1
            X.1no r8 = new X.1no
            r8.<init>(r1, r6, r0)
            X.2L9 r0 = X.AnonymousClass2L9.A03
            X.1Wr r7 = r0.A0U()
            X.2LB r7 = (X.AnonymousClass2LB) r7
            byte[] r6 = r8.A02
            int r1 = r6.length
            r0 = 0
            X.1Ww r0 = X.C28631Ww.A01(r6, r0, r1)
            r7.A06(r0)
            int r0 = r8.A00
            r7.A05(r0)
            X.1Wm r1 = r7.A02()
            X.2L9 r1 = (X.AnonymousClass2L9) r1
            X.1mt r0 = r2.A00
            X.2L8 r0 = r0.A0A
            if (r0 != 0) goto L_0x00f0
            X.2L8 r0 = X.AnonymousClass2L8.A05
        L_0x00f0:
            X.1Wr r0 = r0.A0U()
            X.2LC r0 = (X.AnonymousClass2LC) r0
            r0.A05(r1)
            X.1Wm r7 = r0.A02()
            X.2L8 r7 = (X.AnonymousClass2L8) r7
            X.1mt r0 = r2.A00
            X.1Wr r6 = r0.A0U()
            r6.A03()
            X.1Wm r1 = r6.A00
            X.1mt r1 = (X.C36031mt) r1
            r1.A0A = r7
            int r0 = r1.A00
            r0 = r0 | 32
            r1.A00 = r0
            X.1Wm r0 = r6.A02()
            X.1mt r0 = (X.C36031mt) r0
            r2.A00 = r0
            r5.A04(r4, r3)
            return r11
        L_0x0120:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36301nK.A01(byte[]):X.1mz");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0230, code lost:
        if (((java.lang.Number) r9.A00()).intValue() != 16777215) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A02(X.C36131n3 r20, X.C36331nN r21) {
        /*
            r19 = this;
            r7 = r19
            X.1mn r6 = r7.A01
            X.1nW r5 = r7.A03
            X.1nc r4 = r6.A02(r5)
            X.1na r1 = r7.A02
            r8 = r21
            X.1nO r3 = r8.A03
            X.1mn r2 = r1.A00
            X.1nW r0 = r1.A04
            r18 = r0
            X.1Yb r10 = X.C31811f4.A00(r18)
            java.lang.String r0 = "axolotl trusting "
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r0 = " key pair"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r10 = r8.A02
            X.1nF r11 = r8.A04
            byte[] r9 = r11.A00()
            X.1ni r0 = r4.A01
            X.1mt r12 = r0.A00
            int r0 = r12.A04
            if (r0 != 0) goto L_0x0041
            r0 = 2
        L_0x0041:
            if (r0 != r10) goto L_0x00a0
            X.1Ww r0 = r12.A05
            byte[] r0 = r0.A04()
            boolean r0 = java.util.Arrays.equals(r9, r0)
            if (r0 == 0) goto L_0x00a0
        L_0x004f:
            java.lang.String r10 = "SessionBuilder"
            java.lang.String r9 = "We've already setup a session for this V3 message, letting bundled message fall through..."
            X.1ij r0 = X.C33541ik.A00
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "SignalProtocolLogger ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r0 = "): "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0070:
            X.1ne r9 = X.C36501ne.A00
        L_0x0072:
            r0 = r18
            r2.A03(r3, r0)
            X.1nL r0 = r8.A05
            byte[] r3 = r7.A04(r0, r4)
            r0 = r20
            r0.AHO(r3)
            r6.A04(r5, r4)
            boolean r0 = r9 instanceof X.C36521ng
            if (r0 == 0) goto L_0x009e
            r0 = 1
        L_0x008a:
            if (r0 == 0) goto L_0x009d
            X.1mn r2 = r7.A00
            java.lang.Object r0 = r9.A00()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.1es r0 = r2.A04
            r0.A02(r1)
        L_0x009d:
            return r3
        L_0x009e:
            r0 = 0
            goto L_0x008a
        L_0x00a0:
            java.util.LinkedList r0 = r4.A00
            r17 = r0
            java.util.Iterator r13 = r17.iterator()
        L_0x00a8:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r13.next()
            X.1ni r0 = (X.C36541ni) r0
            X.1mt r12 = r0.A00
            int r0 = r12.A04
            if (r0 != 0) goto L_0x00bb
            r0 = 2
        L_0x00bb:
            if (r0 != r10) goto L_0x00a8
            X.1Ww r0 = r12.A05
            byte[] r0 = r0.A04()
            boolean r0 = java.util.Arrays.equals(r9, r0)
            if (r0 == 0) goto L_0x00a8
            goto L_0x004f
        L_0x00ca:
            X.1nZ r0 = r1.A03
            int r9 = r8.A01
            X.1eu r0 = r0.A00
            byte[] r0 = r0.A01(r9)
            if (r0 == 0) goto L_0x02a4
            X.1nw r12 = new X.1nw     // Catch:{ IOException -> 0x027e }
            r12.<init>(r0)     // Catch:{ IOException -> 0x027e }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x027e }
            r10.<init>()     // Catch:{ IOException -> 0x027e }
            java.lang.String r0 = "axolotl loaded a signed pre key with id "
            r10.append(r0)     // Catch:{ IOException -> 0x027e }
            r10.append(r9)     // Catch:{ IOException -> 0x027e }
            java.lang.String r0 = r10.toString()     // Catch:{ IOException -> 0x027e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x027e }
            X.1f3 r9 = r12.A00     // Catch:{ 1nJ -> 0x0277 }
            X.1Ww r0 = r9.A04     // Catch:{ 1nJ -> 0x0277 }
            byte[] r0 = r0.A04()     // Catch:{ 1nJ -> 0x0277 }
            X.1nF r10 = X.C36241nE.A00(r0)     // Catch:{ 1nJ -> 0x0277 }
            X.1Ww r0 = r9.A03     // Catch:{ 1nJ -> 0x0277 }
            byte[] r9 = r0.A04()     // Catch:{ 1nJ -> 0x0277 }
            X.1nV r0 = new X.1nV     // Catch:{ 1nJ -> 0x0277 }
            r0.<init>(r9)     // Catch:{ 1nJ -> 0x0277 }
            X.1nd r13 = new X.1nd     // Catch:{ 1nJ -> 0x0277 }
            r13.<init>(r0, r10)     // Catch:{ 1nJ -> 0x0277 }
            X.1nh r14 = r2.A01()
            X.1nf r9 = r8.A06
            boolean r0 = r9 instanceof X.C36521ng
            if (r0 == 0) goto L_0x012e
            r16 = 1
        L_0x0117:
            if (r16 == 0) goto L_0x0154
            X.1mn r1 = r1.A01
            java.lang.Object r0 = r9.A00()
            java.lang.Number r0 = (java.lang.Number) r0
            int r10 = r0.intValue()
            X.1es r12 = r1.A04
            byte[] r1 = r12.A04(r10)
            if (r1 == 0) goto L_0x0254
            goto L_0x0131
        L_0x012e:
            r16 = 0
            goto L_0x0117
        L_0x0131:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0234 }
            r15.<init>()     // Catch:{ IOException -> 0x0234 }
            java.lang.String r0 = "axolotl found a pre key with id "
            r15.append(r0)     // Catch:{ IOException -> 0x0234 }
            r15.append(r10)     // Catch:{ IOException -> 0x0234 }
            java.lang.String r0 = r15.toString()     // Catch:{ IOException -> 0x0234 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0234 }
            X.1nY r0 = new X.1nY     // Catch:{ IOException -> 0x0234 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0234 }
            X.1nd r0 = r0.A00()
            X.1ng r12 = new X.1ng
            r12.<init>(r0)
            goto L_0x0156
        L_0x0154:
            X.1ne r12 = X.C36501ne.A00
        L_0x0156:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0173
            X.1ni r10 = new X.1ni
            r10.<init>()
            X.1ni r1 = r4.A01
            r0 = r17
            r0.addFirst(r1)
            r4.A01 = r10
            int r1 = r17.size()
            r0 = 40
            if (r1 <= r0) goto L_0x0173
            r17.removeLast()
        L_0x0173:
            X.1ni r10 = r4.A01
            if (r3 == 0) goto L_0x026f
            r10.A06()     // Catch:{ IOException -> 0x0268 }
            r10.A0A(r3)     // Catch:{ IOException -> 0x0268 }
            X.1nO r0 = r14.A00     // Catch:{ IOException -> 0x0268 }
            r10.A09(r0)     // Catch:{ IOException -> 0x0268 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0268 }
            r1.<init>()     // Catch:{ IOException -> 0x0268 }
            r0 = 32
            byte[] r15 = new byte[r0]     // Catch:{ IOException -> 0x0268 }
            r0 = -1
            java.util.Arrays.fill(r15, r0)     // Catch:{ IOException -> 0x0268 }
            r1.write(r15)     // Catch:{ IOException -> 0x0268 }
            X.1nF r0 = r3.A00     // Catch:{ IOException -> 0x0268 }
            X.1nV r15 = r13.A00     // Catch:{ IOException -> 0x0268 }
            byte[] r0 = X.C36241nE.A02(r15, r0)     // Catch:{ IOException -> 0x0268 }
            r1.write(r0)     // Catch:{ IOException -> 0x0268 }
            X.1nV r0 = r14.A01     // Catch:{ IOException -> 0x0268 }
            byte[] r0 = X.C36241nE.A02(r0, r11)     // Catch:{ IOException -> 0x0268 }
            r1.write(r0)     // Catch:{ IOException -> 0x0268 }
            byte[] r0 = X.C36241nE.A02(r15, r11)     // Catch:{ IOException -> 0x0268 }
            r1.write(r0)     // Catch:{ IOException -> 0x0268 }
            boolean r0 = r12 instanceof X.C36521ng     // Catch:{ IOException -> 0x0268 }
            if (r0 == 0) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            r0 = 0
            goto L_0x01b5
        L_0x01b4:
            r0 = 1
        L_0x01b5:
            if (r0 == 0) goto L_0x01c6
            java.lang.Object r0 = r12.A00()     // Catch:{ IOException -> 0x0268 }
            X.1nd r0 = (X.C36491nd) r0     // Catch:{ IOException -> 0x0268 }
            X.1nV r0 = r0.A00     // Catch:{ IOException -> 0x0268 }
            byte[] r0 = X.C36241nE.A02(r0, r11)     // Catch:{ IOException -> 0x0268 }
            r1.write(r0)     // Catch:{ IOException -> 0x0268 }
        L_0x01c6:
            byte[] r14 = r1.toByteArray()     // Catch:{ IOException -> 0x0268 }
            X.1nk r15 = new X.1nk     // Catch:{ IOException -> 0x0268 }
            r15.<init>()     // Catch:{ IOException -> 0x0268 }
            java.lang.String r0 = "WhisperText"
            byte[] r12 = r0.getBytes()     // Catch:{ IOException -> 0x0268 }
            r1 = 64
            r0 = 32
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0268 }
            byte[] r1 = r15.A02(r14, r0, r12, r1)     // Catch:{ IOException -> 0x0268 }
            r0 = 32
            byte[][] r1 = X.C36581nm.A01(r1, r0, r0)     // Catch:{ IOException -> 0x0268 }
            r14 = 0
            r0 = r1[r14]     // Catch:{ IOException -> 0x0268 }
            X.1nn r12 = new X.1nn     // Catch:{ IOException -> 0x0268 }
            r12.<init>(r15, r0)     // Catch:{ IOException -> 0x0268 }
            r0 = 1
            r1 = r1[r0]     // Catch:{ IOException -> 0x0268 }
            X.1no r0 = new X.1no     // Catch:{ IOException -> 0x0268 }
            r0.<init>(r15, r1, r14)     // Catch:{ IOException -> 0x0268 }
            X.4JI r1 = new X.4JI     // Catch:{ IOException -> 0x0268 }
            r1.<init>(r0, r12)     // Catch:{ IOException -> 0x0268 }
            X.1no r0 = r1.A00     // Catch:{ IOException -> 0x0268 }
            r10.A0C(r13, r0)     // Catch:{ IOException -> 0x0268 }
            X.1nn r0 = r1.A01     // Catch:{ IOException -> 0x0268 }
            r10.A0D(r0)     // Catch:{ IOException -> 0x0268 }
            X.1ni r1 = r4.A01
            X.11s r0 = r2.A07
            X.1d4 r0 = r0.A07
            int r0 = r0.A01()
            r1.A07(r0)
            X.1ni r1 = r4.A01
            int r0 = r8.A00
            r1.A08(r0)
            X.1ni r1 = r4.A01
            byte[] r0 = r11.A00()
            r1.A0E(r0)
            if (r16 == 0) goto L_0x0070
            java.lang.Object r0 = r9.A00()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r1 == r0) goto L_0x0070
            goto L_0x0072
        L_0x0234:
            r2 = move-exception
            java.lang.String r0 = "error reading prekey "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r0 = "; deleting"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r12.A02(r10)
            X.1nI r0 = new X.1nI
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0254:
            java.lang.String r1 = "No prekey found with id "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = r0.toString()
            X.1nI r0 = new X.1nI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0268:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x026f:
            java.lang.String r1 = "Null value!"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0277:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x027e:
            r2 = move-exception
            java.lang.String r1 = "failed to parse signed pre key record during load for id "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.String r1 = "invalid prekey record with id "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = r0.toString()
            X.1nI r0 = new X.1nI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02a4:
            java.lang.String r1 = "no signed prekey available with id "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = r0.toString()
            X.1nI r0 = new X.1nI
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36301nK.A02(X.1n3, X.1nN):byte[]");
    }

    public byte[] A03(C36131n3 r5, C36311nL r6) {
        C35971mn r3 = this.A01;
        C36421nW r2 = this.A03;
        if (r3.A07.A0d(C31811f4.A00(r2))) {
            C36481nc A022 = r3.A02(r2);
            byte[] A042 = A04(r6, A022);
            r5.AHO(A042);
            r3.A04(r2, A022);
            return A042;
        }
        StringBuilder sb = new StringBuilder("No session for: ");
        sb.append(r2);
        throw new C36141n4(sb.toString());
    }

    public final byte[] A04(C36311nL r7, C36481nc r8) {
        LinkedList linkedList = r8.A00;
        Iterator it = linkedList.iterator();
        LinkedList linkedList2 = new LinkedList();
        try {
            C36541ni r0 = new C36541ni(r8.A01);
            byte[] A05 = A05(r7, r0);
            r8.A01 = r0;
            return A05;
        } catch (C36161n6 e2) {
            while (true) {
                linkedList2.add(e2);
                if (it.hasNext()) {
                    C36541ni r1 = new C36541ni((C36541ni) it.next());
                    byte[] A052 = A05(r7, r1);
                    it.remove();
                    linkedList.addFirst(r8.A01);
                    r8.A01 = r1;
                    if (linkedList.size() > 40) {
                        linkedList.removeLast();
                    }
                    return A052;
                }
                throw new C36161n6((List) linkedList2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x036c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0372, code lost:
        throw new X.C36161n6(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x036c A[ExcHandler: BadPaddingException | IllegalBlockSizeException (r1v39 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:75:0x032c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A05(X.C36311nL r13, X.C36541ni r14) {
        /*
            r12 = this;
            X.1mt r3 = r14.A00
            int r0 = r3.A00
            r2 = 32
            r1 = r0 & 32
            r0 = 0
            if (r1 != r2) goto L_0x000c
            r0 = 1
        L_0x000c:
            if (r0 == 0) goto L_0x03bb
            int r5 = r13.A01
            int r3 = r3.A04
            if (r3 != 0) goto L_0x0015
            r3 = 2
        L_0x0015:
            if (r5 != r3) goto L_0x039e
            X.1nF r4 = r13.A02
            int r7 = r13.A00
            X.1np r0 = r14.A05(r4)     // Catch:{ 1nJ -> 0x0397 }
            if (r0 == 0) goto L_0x0053
            X.1np r0 = r14.A05(r4)     // Catch:{ 1nJ -> 0x0397 }
            java.lang.Object r3 = r0.A00     // Catch:{ 1nJ -> 0x0397 }
            X.2L8 r3 = (X.AnonymousClass2L8) r3     // Catch:{ 1nJ -> 0x0397 }
            if (r3 != 0) goto L_0x002d
            goto L_0x00d7
        L_0x002d:
            X.1mt r0 = r14.A00     // Catch:{ 1nJ -> 0x0397 }
            int r0 = r0.A04     // Catch:{ 1nJ -> 0x0397 }
            if (r0 != 0) goto L_0x0034
            r0 = 2
        L_0x0034:
            X.1nl r2 = X.C36571nl.A00(r0)     // Catch:{ 1nJ -> 0x0397 }
            X.2L9 r0 = r3.A04     // Catch:{ 1nJ -> 0x0397 }
            if (r0 != 0) goto L_0x003e
            X.2L9 r0 = X.AnonymousClass2L9.A03     // Catch:{ 1nJ -> 0x0397 }
        L_0x003e:
            X.1Ww r0 = r0.A02     // Catch:{ 1nJ -> 0x0397 }
            byte[] r1 = r0.A04()     // Catch:{ 1nJ -> 0x0397 }
            X.2L9 r0 = r3.A04     // Catch:{ 1nJ -> 0x0397 }
            if (r0 != 0) goto L_0x004a
            X.2L9 r0 = X.AnonymousClass2L9.A03     // Catch:{ 1nJ -> 0x0397 }
        L_0x004a:
            int r0 = r0.A01     // Catch:{ 1nJ -> 0x0397 }
            X.1no r3 = new X.1no     // Catch:{ 1nJ -> 0x0397 }
            r3.<init>(r2, r1, r0)     // Catch:{ 1nJ -> 0x0397 }
            goto L_0x00d8
        L_0x0053:
            X.1mt r0 = r14.A00     // Catch:{ 1nJ -> 0x0397 }
            int r0 = r0.A04     // Catch:{ 1nJ -> 0x0397 }
            if (r0 != 0) goto L_0x005a
            r0 = 2
        L_0x005a:
            X.1nl r1 = X.C36571nl.A00(r0)     // Catch:{ 1nJ -> 0x0397 }
            X.1mt r0 = r14.A00     // Catch:{ 1nJ -> 0x0397 }
            X.1Ww r0 = r0.A08     // Catch:{ 1nJ -> 0x0397 }
            byte[] r0 = r0.A04()     // Catch:{ 1nJ -> 0x0397 }
            X.1nn r3 = new X.1nn     // Catch:{ 1nJ -> 0x0397 }
            r3.<init>(r1, r0)     // Catch:{ 1nJ -> 0x0397 }
            X.1nF r2 = r14.A03()     // Catch:{ 1nJ -> 0x0397 }
            X.1mt r0 = r14.A00     // Catch:{ 1nJ -> 0x0397 }
            X.2L8 r0 = r0.A0A     // Catch:{ 1nJ -> 0x0397 }
            if (r0 != 0) goto L_0x0077
            X.2L8 r0 = X.AnonymousClass2L8.A05     // Catch:{ 1nJ -> 0x0397 }
        L_0x0077:
            X.1Ww r0 = r0.A01     // Catch:{ 1nJ -> 0x0397 }
            byte[] r0 = r0.A04()     // Catch:{ 1nJ -> 0x0397 }
            X.1nV r1 = new X.1nV     // Catch:{ 1nJ -> 0x0397 }
            r1.<init>(r0)     // Catch:{ 1nJ -> 0x0397 }
            X.1nd r0 = new X.1nd     // Catch:{ 1nJ -> 0x0397 }
            r0.<init>(r1, r2)     // Catch:{ 1nJ -> 0x0397 }
            X.1np r1 = r3.A00(r4, r0)     // Catch:{ 1nJ -> 0x0397 }
            X.1nd r8 = X.C36241nE.A01()     // Catch:{ 1nJ -> 0x0397 }
            java.lang.Object r0 = r1.A00     // Catch:{ 1nJ -> 0x0397 }
            X.1nn r0 = (X.C36591nn) r0     // Catch:{ 1nJ -> 0x0397 }
            X.1np r9 = r0.A00(r4, r8)     // Catch:{ 1nJ -> 0x0397 }
            java.lang.Object r0 = r9.A00     // Catch:{ 1nJ -> 0x0397 }
            X.1nn r0 = (X.C36591nn) r0     // Catch:{ 1nJ -> 0x0397 }
            r14.A0D(r0)     // Catch:{ 1nJ -> 0x0397 }
            java.lang.Object r3 = r1.A01     // Catch:{ 1nJ -> 0x0397 }
            X.1no r3 = (X.C36601no) r3     // Catch:{ 1nJ -> 0x0397 }
            r14.A0B(r4, r3)     // Catch:{ 1nJ -> 0x0397 }
            X.1no r0 = r14.A04()     // Catch:{ 1nJ -> 0x0397 }
            int r0 = r0.A00     // Catch:{ 1nJ -> 0x0397 }
            int r1 = r0 + -1
            r0 = 0
            int r6 = java.lang.Math.max(r1, r0)     // Catch:{ 1nJ -> 0x0397 }
            X.1mt r0 = r14.A00     // Catch:{ 1nJ -> 0x0397 }
            X.1Wr r2 = r0.A0U()     // Catch:{ 1nJ -> 0x0397 }
            r2.A03()     // Catch:{ 1nJ -> 0x0397 }
            X.1Wm r1 = r2.A00     // Catch:{ 1nJ -> 0x0397 }
            X.1mt r1 = (X.C36031mt) r1     // Catch:{ 1nJ -> 0x0397 }
            int r0 = r1.A00     // Catch:{ 1nJ -> 0x0397 }
            r0 = r0 | 16
            r1.A00 = r0     // Catch:{ 1nJ -> 0x0397 }
            r1.A02 = r6     // Catch:{ 1nJ -> 0x0397 }
            X.1Wm r0 = r2.A02()     // Catch:{ 1nJ -> 0x0397 }
            X.1mt r0 = (X.C36031mt) r0     // Catch:{ 1nJ -> 0x0397 }
            r14.A00 = r0     // Catch:{ 1nJ -> 0x0397 }
            java.lang.Object r0 = r9.A01     // Catch:{ 1nJ -> 0x0397 }
            X.1no r0 = (X.C36601no) r0     // Catch:{ 1nJ -> 0x0397 }
            r14.A0C(r8, r0)     // Catch:{ 1nJ -> 0x0397 }
            goto L_0x00d8
        L_0x00d7:
            r3 = 0
        L_0x00d8:
            int r2 = r3.A00
            if (r2 <= r7) goto L_0x01c6
            X.1np r0 = r14.A05(r4)
            java.lang.Object r0 = r0.A00
            X.2L8 r0 = (X.AnonymousClass2L8) r0
            if (r0 == 0) goto L_0x037b
            X.1XE r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x00ec:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x037b
            java.lang.Object r0 = r1.next()
            X.2LA r0 = (X.AnonymousClass2LA) r0
            int r0 = r0.A01
            if (r0 != r7) goto L_0x00ec
            X.1np r4 = r14.A05(r4)
            java.lang.Object r9 = r4.A00
            X.2L8 r9 = (X.AnonymousClass2L8) r9
            r6 = 0
            if (r9 == 0) goto L_0x019a
            X.1XE r0 = r9.A03
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>(r0)
            java.util.Iterator r11 = r8.iterator()
        L_0x0112:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0151
            java.lang.Object r10 = r11.next()
            X.2LA r10 = (X.AnonymousClass2LA) r10
            int r0 = r10.A01
            if (r0 != r7) goto L_0x0112
            X.1Ww r0 = r10.A02
            byte[] r1 = r0.A04()
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            r3.<init>(r1, r0)
            X.1Ww r0 = r10.A04
            byte[] r1 = r0.A04()
            java.lang.String r0 = "HmacSHA256"
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            r2.<init>(r1, r0)
            X.1Ww r0 = r10.A03
            byte[] r0 = r0.A04()
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r0)
            int r0 = r10.A01
            X.4Mr r6 = new X.4Mr
            r6.<init>(r1, r3, r2, r0)
            r11.remove()
        L_0x0151:
            X.1Wr r3 = r9.A0U()
            r3.A03()
            X.1Wm r1 = r3.A00
            X.2L8 r1 = (X.AnonymousClass2L8) r1
            X.2NE r0 = X.AnonymousClass2NE.A01
            r1.A03 = r0
            r3.A03()
            X.1Wm r2 = r3.A00
            X.2L8 r2 = (X.AnonymousClass2L8) r2
            X.1XE r1 = r2.A03
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0176
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A03 = r1
        L_0x0176:
            X.C28591Ws.A01(r8, r1)
            X.1Wm r2 = r3.A02()
            X.2L8 r2 = (X.AnonymousClass2L8) r2
            X.1mt r0 = r14.A00
            X.1Wr r1 = r0.A0U()
            X.1ns r1 = (X.C36641ns) r1
            java.lang.Object r0 = r4.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.A05(r2, r0)
            X.1Wm r0 = r1.A02()
            X.1mt r0 = (X.C36031mt) r0
            r14.A00 = r0
        L_0x019a:
            X.1nO r7 = r14.A02()
            X.1nO r4 = r14.A01()
            javax.crypto.spec.SecretKeySpec r3 = r6.A03
            byte[] r2 = r13.A04
            int r1 = r2.length
            r0 = 8
            int r1 = r1 - r0
            byte[][] r2 = X.C36581nm.A01(r2, r1, r0)
            r0 = 0
            r0 = r2[r0]
            byte[] r1 = X.C36311nL.A00(r3, r7, r4, r0, r5)
            r0 = 1
            r0 = r2[r0]
            boolean r0 = java.security.MessageDigest.isEqual(r1, r0)
            if (r0 == 0) goto L_0x0373
            byte[] r4 = r13.A03
            r0 = 3
            r3 = 2
            if (r5 < r0) goto L_0x0341
            goto L_0x032c
        L_0x01c6:
            int r0 = r7 - r2
            r6 = 2000(0x7d0, float:2.803E-42)
            if (r0 <= r6) goto L_0x01d4
            java.lang.String r1 = "Over 2000 messages into the future!"
            X.1n6 r0 = new X.1n6
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01d4:
            int r8 = r3.A00
            if (r8 >= r7) goto L_0x02c7
            X.4Mr r11 = r3.A00()
            X.1np r10 = r14.A05(r4)
            java.lang.Object r8 = r10.A00
            X.1Wm r8 = (X.C28541Wm) r8
            X.2LA r0 = X.AnonymousClass2LA.A05
            X.1Wr r9 = r0.A0U()
            javax.crypto.spec.SecretKeySpec r0 = r11.A02
            byte[] r2 = r0.getEncoded()
            int r1 = r2.length
            r0 = 0
            X.1Ww r2 = X.C28631Ww.A01(r2, r0, r1)
            r9.A03()
            X.1Wm r1 = r9.A00
            X.2LA r1 = (X.AnonymousClass2LA) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A02 = r2
            javax.crypto.spec.SecretKeySpec r0 = r11.A03
            byte[] r2 = r0.getEncoded()
            int r1 = r2.length
            r0 = 0
            X.1Ww r2 = X.C28631Ww.A01(r2, r0, r1)
            r9.A03()
            X.1Wm r1 = r9.A00
            X.2LA r1 = (X.AnonymousClass2LA) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r1.A04 = r2
            int r2 = r11.A00
            r9.A03()
            X.1Wm r1 = r9.A00
            X.2LA r1 = (X.AnonymousClass2LA) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A01 = r2
            javax.crypto.spec.IvParameterSpec r0 = r11.A01
            byte[] r2 = r0.getIV()
            int r1 = r2.length
            r0 = 0
            X.1Ww r2 = X.C28631Ww.A01(r2, r0, r1)
            r9.A03()
            X.1Wm r1 = r9.A00
            X.2LA r1 = (X.AnonymousClass2LA) r1
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
            r1.A03 = r2
            X.1Wm r9 = r9.A02()
            X.1Wr r8 = r8.A0U()
            r8.A03()
            X.1Wm r2 = r8.A00
            X.2L8 r2 = (X.AnonymousClass2L8) r2
            X.1XE r1 = r2.A03
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x026a
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A03 = r1
        L_0x026a:
            r1.add(r9)
            X.1Wm r0 = r8.A00
            X.2L8 r0 = (X.AnonymousClass2L8) r0
            X.1XE r0 = r0.A03
            int r0 = r0.size()
            if (r0 <= r6) goto L_0x0293
            r8.A03()
            X.1Wm r9 = r8.A00
            X.2L8 r9 = (X.AnonymousClass2L8) r9
            r2 = 0
            X.1XE r1 = r9.A03
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0290
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r9.A03 = r1
        L_0x0290:
            r1.remove(r2)
        L_0x0293:
            X.1mt r0 = r14.A00
            X.1Wr r2 = r0.A0U()
            X.1ns r2 = (X.C36641ns) r2
            java.lang.Object r0 = r10.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.1Wm r0 = r8.A02()
            X.2L8 r0 = (X.AnonymousClass2L8) r0
            r2.A05(r0, r1)
            X.1Wm r0 = r2.A02()
            X.1mt r0 = (X.C36031mt) r0
            r14.A00 = r0
            byte[] r0 = X.C36601no.A03
            byte[] r2 = r3.A01(r0)
            X.1nl r1 = r3.A01
            int r0 = r3.A00
            int r0 = r0 + 1
            X.1no r3 = new X.1no
            r3.<init>(r1, r2, r0)
            goto L_0x01d4
        L_0x02c7:
            byte[] r0 = X.C36601no.A03
            byte[] r2 = r3.A01(r0)
            X.1nl r1 = r3.A01
            int r0 = r8 + 1
            X.1no r8 = new X.1no
            r8.<init>(r1, r2, r0)
            X.1np r6 = r14.A05(r4)
            java.lang.Object r7 = r6.A00
            X.1Wm r7 = (X.C28541Wm) r7
            X.2L9 r0 = X.AnonymousClass2L9.A03
            X.1Wr r4 = r0.A0U()
            X.2LB r4 = (X.AnonymousClass2LB) r4
            byte[] r2 = r8.A02
            int r1 = r2.length
            r0 = 0
            X.1Ww r0 = X.C28631Ww.A01(r2, r0, r1)
            r4.A06(r0)
            int r0 = r8.A00
            r4.A05(r0)
            X.1Wm r1 = r4.A02()
            X.2L9 r1 = (X.AnonymousClass2L9) r1
            X.1Wr r0 = r7.A0U()
            X.2LC r0 = (X.AnonymousClass2LC) r0
            r0.A05(r1)
            X.1Wm r2 = r0.A02()
            X.2L8 r2 = (X.AnonymousClass2L8) r2
            X.1mt r0 = r14.A00
            X.1Wr r1 = r0.A0U()
            X.1ns r1 = (X.C36641ns) r1
            java.lang.Object r0 = r6.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.A05(r2, r0)
            X.1Wm r0 = r1.A02()
            X.1mt r0 = (X.C36031mt) r0
            r14.A00 = r0
            X.4Mr r6 = r3.A00()
            goto L_0x019a
        L_0x032c:
            javax.crypto.spec.SecretKeySpec r2 = r6.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x036c }
            javax.crypto.spec.IvParameterSpec r1 = r6.A01     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x036c }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x033a, BadPaddingException | IllegalBlockSizeException -> 0x036c }
            r0.init(r3, r2, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x033a, BadPaddingException | IllegalBlockSizeException -> 0x036c }
            goto L_0x0349
        L_0x033a:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x036c }
            r0.<init>(r1)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x036c }
            throw r0     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x036c }
        L_0x0341:
            javax.crypto.spec.SecretKeySpec r1 = r6.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x036c }
            int r0 = r6.A00     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x036c }
            javax.crypto.Cipher r0 = A00(r1, r3, r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x036c }
        L_0x0349:
            byte[] r3 = r0.doFinal(r4)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x036c }
            X.1mt r0 = r14.A00
            X.1Wr r2 = r0.A0U()
            r2.A03()
            X.1Wm r1 = r2.A00
            X.1mt r1 = (X.C36031mt) r1
            r0 = 0
            r1.A0C = r0
            int r0 = r1.A00
            r0 = r0 & -129(0xffffffffffffff7f, float:NaN)
            r1.A00 = r0
            X.1Wm r0 = r2.A02()
            X.1mt r0 = (X.C36031mt) r0
            r14.A00 = r0
            return r3
        L_0x036c:
            r1 = move-exception
            X.1n6 r0 = new X.1n6
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0373:
            java.lang.String r1 = "Bad Mac!"
            X.1n6 r0 = new X.1n6
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x037b:
            java.lang.String r0 = "Received message with old counter: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " , "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            X.1n5 r0 = new X.1n5
            r0.<init>(r1)
            throw r0
        L_0x0397:
            r1 = move-exception
            X.1n6 r0 = new X.1n6
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x039e:
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2[r1] = r0
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2[r1] = r0
            java.lang.String r0 = "Message version %d, but session version %d"
            java.lang.String r1 = java.lang.String.format(r0, r2)
            X.1n6 r0 = new X.1n6
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x03bb:
            java.lang.String r1 = "Uninitialized session!"
            X.1n6 r0 = new X.1n6
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36301nK.A05(X.1nL, X.1ni):byte[]");
    }
}
