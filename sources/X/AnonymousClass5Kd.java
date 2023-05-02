package X;

import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.jcajce.provider.symmetric.AES;

/* renamed from: X.5Kd  reason: invalid class name */
public class AnonymousClass5Kd extends C105995Cc implements AnonymousClass5NP {
    public static final Class A0F = C32971hd.A00(AnonymousClass5Kd.class, "javax.crypto.spec.GCMParameterSpec");
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public PBEParameterSpec A06;
    public AnonymousClass5T1 A07;
    public C1053859h A08;
    public C1054259l A09;
    public AES.ECB.AnonymousClass1 A0A;
    public AnonymousClass5TM A0B;
    public boolean A0C;
    public boolean A0D;
    public Class[] A0E;

    public AnonymousClass5Kd(C89424c9 r3, int i2) {
        A05(this, true);
        this.A07 = r3.A01;
        this.A0B = new AnonymousClass5A9(r3);
        this.A0C = true;
        this.A01 = i2 >> 3;
    }

    public AnonymousClass5Kd(AnonymousClass5T1 r2) {
        A04(this);
        this.A07 = r2;
        this.A0B = new AnonymousClass5A9(r2);
    }

    public AnonymousClass5Kd(AnonymousClass5T1 r2, int i2) {
        A05(this, true);
        this.A07 = r2;
        this.A0C = true;
        this.A0B = new AnonymousClass5A9(r2);
        this.A01 = i2 >> 3;
    }

    public AnonymousClass5Kd(AnonymousClass5T1 r2, int i2, int i3, int i4, int i5) {
        A04(this);
        this.A07 = r2;
        this.A03 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A0B = new AnonymousClass5A9(r2);
    }

    public AnonymousClass5Kd(AnonymousClass5VP r2) {
        A04(this);
        AnonymousClass5T1 AGk = r2.AGk();
        this.A07 = AGk;
        this.A01 = AGk.AA7();
        this.A0B = new AnonymousClass5A8(r2);
    }

    public AnonymousClass5Kd(AnonymousClass5VP r2, int i2, boolean z2) {
        A04(this);
        this.A07 = r2.AGk();
        this.A0C = z2;
        this.A01 = i2;
        this.A0B = new AnonymousClass5A8(r2);
    }

    public AnonymousClass5Kd(AES.ECB.AnonymousClass1 r3) {
        A04(this);
        this.A07 = new C1053159a();
        this.A0A = r3;
        this.A0B = new AnonymousClass5A9((AnonymousClass5T1) new C1053159a());
    }

    public static AlgorithmParameters A02(String str, C105995Cc r2) {
        AlgorithmParameters instance = AlgorithmParameters.getInstance(str, ((AnonymousClass5AA) r2.A07).A00);
        r2.A01 = instance;
        return instance;
    }

    public static C46932Gv A03(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, int i2, int i3, int i4, int i5) {
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw AnonymousClass3K4.A0d("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        C89194bk A012 = C90294du.A01(i2, i3);
        byte[] salt = pBEParameterSpec.getSalt();
        int iterationCount = pBEParameterSpec.getIterationCount();
        A012.A01 = bArr;
        A012.A02 = salt;
        A012.A00 = iterationCount;
        C46932Gv A032 = i5 != 0 ? A012.A03(i4, i5) : A012.A02(i4);
        if (str.startsWith("DES")) {
            C46932Gv r0 = A032;
            if (A032 instanceof C1054259l) {
                r0 = ((C1054259l) r0).A00;
            }
            AnonymousClass5JY.A00(((C46922Gu) r0).A00);
        }
        return A032;
    }

    public static void A04(AnonymousClass5Kd r5) {
        r5.A0E = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, A0F, C1047356r.class, IvParameterSpec.class, PBEParameterSpec.class};
        r5.A03 = -1;
        r5.A01 = 0;
        r5.A0C = true;
        r5.A06 = null;
        r5.A05 = null;
        r5.A04 = null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.AnonymousClass5Kd r4, boolean r5) {
        /*
            r0 = 6
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.Class<javax.crypto.spec.RC2ParameterSpec> r0 = javax.crypto.spec.RC2ParameterSpec.class
            r2 = 0
            r3[r2] = r0
            java.lang.Class<javax.crypto.spec.RC5ParameterSpec> r0 = javax.crypto.spec.RC5ParameterSpec.class
            r3[r5] = r0
            java.lang.Class r1 = A0F
            r0 = 2
            r3[r0] = r1
            r1 = 3
            java.lang.Class<X.56r> r0 = X.C1047356r.class
            r3[r1] = r0
            r1 = 4
            java.lang.Class<javax.crypto.spec.IvParameterSpec> r0 = javax.crypto.spec.IvParameterSpec.class
            r3[r1] = r0
            r1 = 5
            java.lang.Class<javax.crypto.spec.PBEParameterSpec> r0 = javax.crypto.spec.PBEParameterSpec.class
            r3[r1] = r0
            r4.A0E = r3
            r0 = -1
            r4.A03 = r0
            r4.A01 = r2
            r4.A0C = r5
            r0 = 0
            r4.A06 = r0
            r4.A05 = r0
            r4.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Kd.A05(X.5Kd, boolean):void");
    }

    public static final boolean A06(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "OCB".equals(str);
    }

    public int engineDoFinal(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        int i5;
        int i6 = i4;
        int i7 = i3;
        byte[] bArr3 = bArr2;
        if (this.A0B.AE9(i3) + i4 <= bArr2.length) {
            if (i3 != 0) {
                try {
                    i5 = this.A0B.Aar(bArr, i2, i7, bArr3, i6);
                } catch (AnonymousClass5JD e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                } catch (AnonymousClass5JI e3) {
                    throw new IllegalBlockSizeException(e3.getMessage());
                }
            } else {
                i5 = 0;
            }
            return i5 + this.A0B.A8A(bArr2, i4 + i5);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    public byte[] engineDoFinal(byte[] bArr, int i2, int i3) {
        int i4 = i3;
        int AE9 = this.A0B.AE9(i3);
        byte[] bArr2 = new byte[AE9];
        int Aar = i3 != 0 ? this.A0B.Aar(bArr, i2, i4, bArr2, 0) : 0;
        try {
            int A8A = Aar + this.A0B.A8A(bArr2, Aar);
            if (A8A == AE9) {
                return bArr2;
            }
            if (A8A <= AE9) {
                byte[] bArr3 = new byte[A8A];
                System.arraycopy(bArr2, 0, bArr3, 0, A8A);
                return bArr3;
            }
            throw new IllegalBlockSizeException("internal buffer overflow");
        } catch (AnonymousClass5JI e2) {
            throw new IllegalBlockSizeException(e2.getMessage());
        }
    }

    public int engineGetBlockSize() {
        AnonymousClass5T1 r0 = this.A07;
        if (r0 == null) {
            return -1;
        }
        return r0.AA7();
    }

    public byte[] engineGetIV() {
        C1053859h r0 = this.A08;
        if (r0 != null) {
            return C33111hx.A02(r0.A03);
        }
        C1054259l r02 = this.A09;
        if (r02 != null) {
            return r02.A01;
        }
        return null;
    }

    public int engineGetOutputSize(int i2) {
        return this.A0B.AE9(i2);
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.A01 == null) {
            if (this.A06 != null) {
                try {
                    A02(this.A05, this).init(this.A06);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.A08 != null) {
                if (this.A07 == null) {
                    try {
                        A02(C32031fX.A0r.A01, this).init(new AnonymousClass5IT(C33111hx.A02(this.A08.A03)).A01());
                    } catch (Exception e2) {
                        throw AnonymousClass000.A0a(e2.toString());
                    }
                } else {
                    A02("GCM", this).init(new AnonymousClass5I8(C33111hx.A02(this.A08.A03), this.A08.A00 / 8).A01());
                }
            } else if (this.A09 != null) {
                String A9q = this.A0B.AGk().A9q();
                int indexOf = A9q.indexOf(47);
                if (indexOf >= 0) {
                    A9q = A9q.substring(0, indexOf);
                }
                A02(A9q, this).init(new IvParameterSpec(this.A09.A01));
            }
        }
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r4, java.security.Key r5, java.security.AlgorithmParameters r6, java.security.SecureRandom r7) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x001d
            java.lang.Class[] r2 = r3.A0E
            java.lang.Class<java.security.spec.AlgorithmParameterSpec> r0 = java.security.spec.AlgorithmParameterSpec.class
            java.security.spec.AlgorithmParameterSpec r0 = r6.getParameterSpec(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x001f
        L_0x000b:
            r1 = 0
        L_0x000c:
            int r0 = r2.length
            if (r1 == r0) goto L_0x0027
            r0 = r2[r1]
            if (r0 == 0) goto L_0x001a
            r0 = r2[r1]     // Catch:{ Exception -> 0x001a }
            java.security.spec.AlgorithmParameterSpec r0 = r6.getParameterSpec(r0)     // Catch:{ Exception -> 0x001a }
            goto L_0x001f
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001d:
            r0 = 0
            goto L_0x0021
        L_0x001f:
            if (r0 == 0) goto L_0x0027
        L_0x0021:
            r3.engineInit((int) r4, (java.security.Key) r5, (java.security.spec.AlgorithmParameterSpec) r0, (java.security.SecureRandom) r7)
            r3.A01 = r6
            return
        L_0x0027:
            java.lang.String r0 = "can't handle parameter "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass3K4.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Kd.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    public void engineInit(int i2, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i2, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new InvalidKeyException(e2.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.59g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: X.59g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.59g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: X.59g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: X.59l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: X.59l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: X.59h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v48, resolved type: X.59f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v49, resolved type: X.59f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: X.59f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v51, resolved type: X.5JZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v52, resolved type: X.5JZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v53, resolved type: X.5JZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v58, resolved type: X.2Gu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v62, resolved type: X.59l} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x035d A[Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:? A[Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r18, java.security.Key r19, java.security.spec.AlgorithmParameterSpec r20, java.security.SecureRandom r21) {
        /*
            r17 = this;
            r1 = r20
            r4 = 0
            r0 = r17
            r0.A06 = r4
            r0.A05 = r4
            r0.A01 = r4
            r0.A08 = r4
            r2 = r19
            boolean r3 = r2 instanceof javax.crypto.SecretKey
            if (r3 != 0) goto L_0x002e
            java.lang.String r0 = "Key for algorithm "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            if (r19 == 0) goto L_0x001f
            java.lang.String r4 = r2.getAlgorithm()
        L_0x001f:
            r1.append(r4)
            java.lang.String r0 = " not suitable for symmetric enryption."
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.String r5 = "RC5-64"
            if (r20 != 0) goto L_0x0047
            X.5T1 r3 = r0.A07
            if (r3 == 0) goto L_0x0047
            java.lang.String r3 = r3.A9q()
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L_0x0047
            java.lang.String r0 = "RC5 requires an RC5ParametersSpec to be passed in."
        L_0x0042:
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass3K4.A0d(r0)
            throw r0
        L_0x0047:
            int r9 = r0.A03
            r4 = 4
            java.lang.String r10 = "Algorithm requires a PBE key"
            r13 = 2
            r3 = 1
            if (r9 == r13) goto L_0x0102
            boolean r6 = r2 instanceof X.AnonymousClass58X
            if (r6 == 0) goto L_0x00ca
            r7 = r2
            X.58X r7 = (X.AnonymousClass58X) r7
            X.AnonymousClass58X.A00(r7)
            X.1fY r6 = r7.oid
            if (r6 == 0) goto L_0x00c5
            X.AnonymousClass58X.A00(r7)
            X.1fY r6 = r7.oid
            java.lang.String r6 = r6.A01
        L_0x0065:
            r0.A05 = r6
            X.AnonymousClass58X.A00(r7)
            X.2Gv r6 = r7.param
            if (r6 == 0) goto L_0x00ad
            X.AnonymousClass58X.A00(r7)
            X.2Gv r8 = r7.param
            r7 = r8
            boolean r6 = r8 instanceof X.C1054259l
            if (r6 == 0) goto L_0x007d
            r6 = r7
            X.59l r6 = (X.C1054259l) r6
            X.2Gv r8 = r6.A00
        L_0x007d:
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x008f
            r6 = r1
            javax.crypto.spec.IvParameterSpec r6 = (javax.crypto.spec.IvParameterSpec) r6
            byte[] r6 = r6.getIV()
            X.59l r7 = new X.59l
            r7.<init>(r8, r6)
            r0.A09 = r7
        L_0x008f:
            boolean r6 = r7 instanceof X.C1054259l
            if (r6 == 0) goto L_0x0098
            r6 = r7
            X.59l r6 = (X.C1054259l) r6
            r0.A09 = r6
        L_0x0098:
            boolean r6 = r1 instanceof X.C106035Cg
            if (r6 == 0) goto L_0x016e
            java.lang.String r2 = r0.A04
            boolean r2 = A06(r2)
            if (r2 != 0) goto L_0x028a
            X.5TM r2 = r0.A0B
            boolean r2 = r2 instanceof X.AnonymousClass5A8
            if (r2 != 0) goto L_0x028a
            java.lang.String r0 = "AEADParameterSpec can only be used with AEAD modes."
            goto L_0x0042
        L_0x00ad:
            boolean r6 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r6 == 0) goto L_0x02fd
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A06 = r6
            X.5TM r6 = r0.A0B
            X.5T1 r6 = r6.AGk()
            java.lang.String r6 = r6.A9q()
            X.2Gv r7 = X.C90294du.A00(r6, r1, r7)
            goto L_0x008f
        L_0x00c5:
            java.lang.String r6 = r7.getAlgorithm()
            goto L_0x0065
        L_0x00ca:
            boolean r6 = r2 instanceof javax.crypto.interfaces.PBEKey
            if (r6 == 0) goto L_0x00ef
            r7 = r2
            javax.crypto.interfaces.PBEKey r7 = (javax.crypto.interfaces.PBEKey) r7
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A06 = r6
            byte[] r8 = r7.getEncoded()
            int r10 = r0.A00
            int r11 = r0.A02
            int r6 = r0.A01
            int r12 = r6 << 3
            javax.crypto.spec.PBEParameterSpec r7 = r0.A06
            X.5TM r6 = r0.A0B
            java.lang.String r6 = r6.A9q()
            X.2Gv r7 = A03(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x008f
        L_0x00ef:
            if (r9 == 0) goto L_0x0391
            if (r9 == r4) goto L_0x0391
            if (r9 == r3) goto L_0x0391
            r6 = 5
            if (r9 == r6) goto L_0x0391
            byte[] r6 = r2.getEncoded()
            X.2Gu r7 = new X.2Gu
            r7.<init>(r6)
            goto L_0x0098
        L_0x0102:
            r9 = r2
            javax.crypto.SecretKey r9 = (javax.crypto.SecretKey) r9     // Catch:{ Exception -> 0x0397 }
            boolean r6 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r6 == 0) goto L_0x010e
            r6 = r1
            javax.crypto.spec.PBEParameterSpec r6 = (javax.crypto.spec.PBEParameterSpec) r6
            r0.A06 = r6
        L_0x010e:
            boolean r11 = r9 instanceof javax.crypto.interfaces.PBEKey
            if (r11 == 0) goto L_0x012e
            javax.crypto.spec.PBEParameterSpec r6 = r0.A06
            if (r6 != 0) goto L_0x012e
            r7 = r9
            javax.crypto.interfaces.PBEKey r7 = (javax.crypto.interfaces.PBEKey) r7
            byte[] r6 = r7.getSalt()
            if (r6 == 0) goto L_0x0301
            byte[] r8 = r7.getSalt()
            int r7 = r7.getIterationCount()
            javax.crypto.spec.PBEParameterSpec r6 = new javax.crypto.spec.PBEParameterSpec
            r6.<init>(r8, r7)
            r0.A06 = r6
        L_0x012e:
            javax.crypto.spec.PBEParameterSpec r6 = r0.A06
            if (r6 != 0) goto L_0x013a
            if (r11 != 0) goto L_0x013a
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r10)
            throw r0
        L_0x013a:
            boolean r6 = r2 instanceof X.AnonymousClass58X
            if (r6 == 0) goto L_0x0154
            r6 = r2
            X.58X r6 = (X.AnonymousClass58X) r6
            X.AnonymousClass58X.A00(r6)
            X.2Gv r7 = r6.param
            boolean r6 = r7 instanceof X.C1054259l
            if (r6 != 0) goto L_0x008f
            if (r7 == 0) goto L_0x0154
            java.lang.String r1 = "Algorithm requires a PBE key suitable for PKCS12"
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        L_0x0154:
            byte[] r12 = r9.getEncoded()
            int r14 = r0.A00
            int r15 = r0.A02
            int r6 = r0.A01
            int r16 = r6 << 3
            javax.crypto.spec.PBEParameterSpec r11 = r0.A06
            X.5TM r6 = r0.A0B
            java.lang.String r10 = r6.A9q()
            X.2Gv r7 = A03(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x008f
        L_0x016e:
            boolean r6 = r1 instanceof javax.crypto.spec.IvParameterSpec
            if (r6 == 0) goto L_0x01ac
            int r2 = r0.A01
            if (r2 == 0) goto L_0x019c
            javax.crypto.spec.IvParameterSpec r1 = (javax.crypto.spec.IvParameterSpec) r1
            byte[] r2 = r1.getIV()
            int r2 = r2.length
            int r5 = r0.A01
            if (r2 == r5) goto L_0x02b6
            X.5TM r2 = r0.A0B
            boolean r2 = r2 instanceof X.AnonymousClass5A8
            if (r2 != 0) goto L_0x02b6
            boolean r2 = r0.A0C
            if (r2 == 0) goto L_0x02b6
            java.lang.String r0 = "IV must be "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r5)
            java.lang.String r0 = " bytes long."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            goto L_0x0042
        L_0x019c:
            java.lang.String r2 = r0.A04
            if (r2 == 0) goto L_0x02ca
            java.lang.String r1 = "ECB"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x02ca
            java.lang.String r0 = "ECB mode does not use an IV"
            goto L_0x0042
        L_0x01ac:
            boolean r6 = r1 instanceof javax.crypto.spec.RC2ParameterSpec
            if (r6 == 0) goto L_0x01d6
            javax.crypto.spec.RC2ParameterSpec r1 = (javax.crypto.spec.RC2ParameterSpec) r1
            byte[] r2 = r2.getEncoded()
            r1.getEffectiveKeyBits()
            X.5JZ r7 = new X.5JZ
            r7.<init>(r2)
            byte[] r2 = r1.getIV()
            if (r2 == 0) goto L_0x02ca
            int r2 = r0.A01
            if (r2 == 0) goto L_0x02ca
            byte[] r2 = r1.getIV()
        L_0x01cc:
            X.59l r1 = new X.59l
            r1.<init>(r7, r2)
            r0.A09 = r1
            r7 = r1
            goto L_0x02ca
        L_0x01d6:
            boolean r6 = r1 instanceof javax.crypto.spec.RC5ParameterSpec
            if (r6 == 0) goto L_0x0258
            javax.crypto.spec.RC5ParameterSpec r1 = (javax.crypto.spec.RC5ParameterSpec) r1
            byte[] r2 = r2.getEncoded()
            r1.getRounds()
            X.59f r7 = new X.59f
            r7.<init>(r2)
            X.5T1 r8 = r0.A07
            java.lang.String r6 = r8.A9q()
            java.lang.String r2 = "RC5"
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L_0x0254
            java.lang.String r6 = r8.A9q()
            java.lang.String r2 = "RC5-32"
            boolean r2 = r6.equals(r2)
            java.lang.String r6 = "."
            if (r2 == 0) goto L_0x021f
            int r5 = r1.getWordSize()
            r2 = 32
            if (r5 == r2) goto L_0x0244
            java.lang.String r0 = "RC5 already set up for a word size of 32 not "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            int r0 = r1.getWordSize()
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r2)
            goto L_0x0042
        L_0x021f:
            java.lang.String r2 = r8.A9q()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0244
            int r5 = r1.getWordSize()
            r2 = 64
            if (r5 == r2) goto L_0x0244
            java.lang.String r0 = "RC5 already set up for a word size of 64 not "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            int r0 = r1.getWordSize()
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r2)
            goto L_0x0042
        L_0x0244:
            byte[] r2 = r1.getIV()
            if (r2 == 0) goto L_0x02ca
            int r2 = r0.A01
            if (r2 == 0) goto L_0x02ca
            byte[] r2 = r1.getIV()
            goto L_0x01cc
        L_0x0254:
            java.lang.String r0 = "RC5 parameters passed to a cipher that is not RC5."
            goto L_0x0042
        L_0x0258:
            java.lang.Class r2 = A0F
            if (r2 == 0) goto L_0x02ac
            boolean r2 = r2.isInstance(r1)
            if (r2 == 0) goto L_0x02ac
            java.lang.String r2 = r0.A04
            boolean r2 = A06(r2)
            if (r2 != 0) goto L_0x0274
            X.5TM r2 = r0.A0B
            boolean r2 = r2 instanceof X.AnonymousClass5A8
            if (r2 != 0) goto L_0x0274
            java.lang.String r0 = "GCMParameterSpec can only be used with AEAD modes."
            goto L_0x0042
        L_0x0274:
            boolean r2 = r7 instanceof X.C1054259l
            if (r2 == 0) goto L_0x027c
            X.59l r7 = (X.C1054259l) r7
            X.2Gv r7 = r7.A00
        L_0x027c:
            X.2Gu r7 = (X.C46922Gu) r7
            X.56n r2 = new X.56n     // Catch:{ Exception -> 0x0305 }
            r2.<init>(r1, r7)     // Catch:{ Exception -> 0x0305 }
            java.lang.Object r7 = java.security.AccessController.doPrivileged(r2)     // Catch:{ Exception -> 0x0305 }
            X.59h r7 = (X.C1053859h) r7     // Catch:{ Exception -> 0x0305 }
            goto L_0x02a7
        L_0x028a:
            X.5Cg r1 = (X.C106035Cg) r1
            boolean r2 = r7 instanceof X.C1054259l
            if (r2 == 0) goto L_0x02aa
            X.59l r7 = (X.C1054259l) r7
            X.2Gv r6 = r7.A00
        L_0x0294:
            X.2Gu r6 = (X.C46922Gu) r6
            int r5 = r1.A00
            byte[] r2 = r1.getIV()
            byte[] r1 = r1.A01
            byte[] r1 = X.C33111hx.A02(r1)
            X.59h r7 = new X.59h
            r7.<init>(r6, r2, r1, r5)
        L_0x02a7:
            r0.A08 = r7
            goto L_0x02ca
        L_0x02aa:
            r6 = r7
            goto L_0x0294
        L_0x02ac:
            if (r20 == 0) goto L_0x02ca
            boolean r1 = r1 instanceof javax.crypto.spec.PBEParameterSpec
            if (r1 != 0) goto L_0x02ca
            java.lang.String r0 = "unknown parameter type."
            goto L_0x0042
        L_0x02b6:
            boolean r2 = r7 instanceof X.C1054259l
            if (r2 == 0) goto L_0x02be
            X.59l r7 = (X.C1054259l) r7
            X.2Gv r7 = r7.A00
        L_0x02be:
            byte[] r2 = r1.getIV()
            X.59l r1 = new X.59l
            r1.<init>(r7, r2)
            r7 = r1
            r0.A09 = r1
        L_0x02ca:
            int r1 = r0.A01
            r6 = 3
            r5 = r18
            r8 = r21
            if (r1 == 0) goto L_0x031b
            boolean r1 = r7 instanceof X.C1054259l
            if (r1 != 0) goto L_0x031b
            boolean r1 = r7 instanceof X.C1053859h
            if (r1 != 0) goto L_0x031b
            if (r21 != 0) goto L_0x02fb
            java.security.SecureRandom r9 = X.C90614eS.A00()
        L_0x02e1:
            if (r5 == r3) goto L_0x030c
            if (r5 == r6) goto L_0x030c
            X.5TM r1 = r0.A0B
            X.5T1 r1 = r1.AGk()
            java.lang.String r2 = r1.A9q()
            java.lang.String r1 = "PGPCFB"
            int r1 = r2.indexOf(r1)
            if (r1 >= 0) goto L_0x031b
            java.lang.String r0 = "no IV set when one expected"
            goto L_0x0042
        L_0x02fb:
            r9 = r8
            goto L_0x02e1
        L_0x02fd:
            java.lang.String r0 = "PBE requires PBE parameters to be set."
            goto L_0x0042
        L_0x0301:
            java.lang.String r0 = "PBEKey requires parameters to specify salt"
            goto L_0x0042
        L_0x0305:
            java.lang.String r0 = "Cannot process GCMParameterSpec."
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass3K4.A0d(r0)
            throw r0
        L_0x030c:
            int r1 = r0.A01
            byte[] r2 = new byte[r1]
            r9.nextBytes(r2)
            X.59l r1 = new X.59l
            r1.<init>(r7, r2)
            r0.A09 = r1
            r7 = r1
        L_0x031b:
            if (r21 == 0) goto L_0x0327
            boolean r1 = r0.A0D
            if (r1 == 0) goto L_0x0327
            X.59g r1 = new X.59g
            r1.<init>(r8, r7)
            r7 = r1
        L_0x0327:
            if (r5 == r3) goto L_0x0347
            if (r5 == r13) goto L_0x034d
            if (r5 == r6) goto L_0x0347
            if (r5 == r4) goto L_0x034d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            java.lang.String r0 = "unknown opmode "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            r1.append(r5)     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            java.lang.String r0 = " passed"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
        L_0x0347:
            X.5TM r1 = r0.A0B     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            r1.AI1(r7, r3)     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            goto L_0x0353
        L_0x034d:
            X.5TM r2 = r0.A0B     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            r1 = 0
            r2.AI1(r7, r1)     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
        L_0x0353:
            X.5TM r2 = r0.A0B     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            boolean r1 = r2 instanceof X.AnonymousClass5A8     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            if (r1 == 0) goto L_0x037a
            X.59h r1 = r0.A08     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            if (r1 != 0) goto L_0x037a
            X.5A8 r2 = (X.AnonymousClass5A8) r2     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            X.5TG r2 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            X.59l r1 = r0.A09     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            X.2Gv r5 = r1.A00     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            X.2Gu r5 = (X.C46922Gu) r5     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            byte[] r1 = r2.ADG()     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            int r1 = r1.length     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            int r4 = r1 << 3
            X.59l r1 = r0.A09     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            byte[] r3 = r1.A01     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            r2 = 0
            X.59h r1 = new X.59h     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            r1.<init>(r5, r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
            r0.A08 = r1     // Catch:{ IllegalArgumentException -> 0x0386, Exception -> 0x037b }
        L_0x037a:
            return
        L_0x037b:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            X.5BI r0 = new X.5BI
            r0.<init>(r1, r2)
            throw r0
        L_0x0386:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            r0.<init>(r1, r2)
            throw r0
        L_0x0391:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r10)
            throw r0
        L_0x0397:
            java.lang.String r1 = "PKCS12 requires a SecretKey/PBEKey"
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Kd.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    public void engineSetMode(String str) {
        AnonymousClass5TM r1;
        AnonymousClass5T1 r2 = this.A07;
        if (r2 != null) {
            String A012 = C32941ha.A01(str);
            this.A04 = A012;
            if (A012.equals("ECB")) {
                this.A01 = 0;
                r1 = new AnonymousClass5A9(r2);
            } else if (A012.equals("CBC")) {
                this.A01 = r2.AA7();
                r1 = new AnonymousClass5A9((AnonymousClass5T1) new AnonymousClass59X(r2));
            } else if (A012.startsWith("OFB")) {
                int AA7 = r2.AA7();
                this.A01 = AA7;
                r1 = A012.length() != 3 ? new AnonymousClass5A9((AnonymousClass5T1) new AnonymousClass5JK(r2, Integer.parseInt(A012.substring(3)))) : new AnonymousClass5A9((AnonymousClass5T1) new AnonymousClass5JK(r2, AA7 << 3));
            } else if (A012.startsWith("CFB")) {
                int AA72 = r2.AA7();
                this.A01 = AA72;
                r1 = A012.length() != 3 ? new AnonymousClass5A9((AnonymousClass5T1) new AnonymousClass5JL(r2, Integer.parseInt(A012.substring(3)))) : new AnonymousClass5A9((AnonymousClass5T1) new AnonymousClass5JL(r2, AA72 << 3));
            } else if (A012.startsWith("PGPCFB")) {
                boolean equals = A012.equals("PGPCFBWITHIV");
                if (equals || A012.length() == 6) {
                    this.A01 = r2.AA7();
                    r1 = new AnonymousClass5A9((AnonymousClass5T1) new AnonymousClass59Z(r2, equals));
                } else {
                    throw new NoSuchAlgorithmException(AnonymousClass000.A0h(A012, AnonymousClass000.A0r("no mode support for ")));
                }
            } else if (A012.equals("OPENPGPCFB")) {
                this.A01 = 0;
                r1 = new AnonymousClass5A9((AnonymousClass5T1) new AnonymousClass59Y(r2));
            } else if (A012.equals("SIC")) {
                int AA73 = r2.AA7();
                this.A01 = AA73;
                if (AA73 >= 16) {
                    this.A0C = false;
                    r1 = new AnonymousClass5A9(new C89424c9(new AnonymousClass5JO(r2)));
                } else {
                    throw AnonymousClass000.A0T("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                }
            } else if (A012.equals("CTR")) {
                this.A01 = r2.AA7();
                this.A0C = false;
                r1 = new AnonymousClass5A9(new C89424c9(new AnonymousClass5JO(r2)));
            } else if (A012.equals("GOFB")) {
                this.A01 = r2.AA7();
                r1 = new AnonymousClass5A9(new C89424c9(new AnonymousClass5JM(r2)));
            } else if (A012.equals("GCFB")) {
                this.A01 = r2.AA7();
                r1 = new AnonymousClass5A9(new C89424c9(new AnonymousClass5JN(r2)));
            } else if (A012.equals("CTS")) {
                this.A01 = r2.AA7();
                r1 = new AnonymousClass5A9((C89424c9) new AnonymousClass5J9(new AnonymousClass59X(r2)));
            } else if (A012.equals("CCM")) {
                this.A01 = 12;
                r1 = new AnonymousClass5A8(new C1054959v(r2));
            } else if (A012.equals("OCB")) {
                if (this.A0A != null) {
                    this.A01 = 15;
                    r1 = new AnonymousClass5A8(new C1055159x(r2, new C1053159a()));
                } else {
                    throw new NoSuchAlgorithmException(AnonymousClass000.A0h(str, AnonymousClass000.A0q("can't support mode ")));
                }
            } else if (A012.equals("EAX")) {
                this.A01 = r2.AA7();
                r1 = new AnonymousClass5A8(new C1055059w(r2));
            } else if (A012.equals("GCM")) {
                this.A01 = r2.AA7();
                r1 = new AnonymousClass5A8(new C1055259y(r2));
            } else {
                throw new NoSuchAlgorithmException(AnonymousClass000.A0h(str, AnonymousClass000.A0q("can't support mode ")));
            }
            this.A0B = r1;
            return;
        }
        throw new NoSuchAlgorithmException("no mode supported for this algorithm");
    }

    public void engineSetPadding(String str) {
        AnonymousClass5A9 r2;
        if (this.A07 != null) {
            String A012 = C32941ha.A01(str);
            if (A012.equals("NOPADDING")) {
                AnonymousClass5TM r1 = this.A0B;
                if (r1.AiB()) {
                    r2 = new AnonymousClass5A9(new C89424c9(r1.AGk()));
                } else {
                    return;
                }
            } else if (A012.equals("WITHCTS") || A012.equals("CTSPADDING") || A012.equals("CS3PADDING")) {
                r2 = new AnonymousClass5A9((C89424c9) new AnonymousClass5J9(this.A0B.AGk()));
            } else {
                this.A0D = true;
                if (A06(this.A04)) {
                    throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
                } else if (A012.equals("PKCS5PADDING") || A012.equals("PKCS7PADDING")) {
                    r2 = new AnonymousClass5A9(this.A0B.AGk());
                } else if (A012.equals("ZEROBYTEPADDING")) {
                    r2 = new AnonymousClass5A9(this.A0B.AGk(), new AnonymousClass5A2());
                } else if (A012.equals("ISO10126PADDING") || A012.equals("ISO10126-2PADDING")) {
                    r2 = new AnonymousClass5A9(this.A0B.AGk(), new AnonymousClass5A3());
                } else if (A012.equals("X9.23PADDING") || A012.equals("X923PADDING")) {
                    r2 = new AnonymousClass5A9(this.A0B.AGk(), new AnonymousClass5A4());
                } else if (A012.equals("ISO7816-4PADDING") || A012.equals("ISO9797-1PADDING")) {
                    r2 = new AnonymousClass5A9(this.A0B.AGk(), new C1055359z());
                } else if (A012.equals("TBCPADDING")) {
                    r2 = new AnonymousClass5A9(this.A0B.AGk(), new AnonymousClass5A1());
                } else {
                    StringBuilder A0r = AnonymousClass000.A0r("Padding ");
                    A0r.append(str);
                    throw new NoSuchPaddingException(AnonymousClass000.A0h(" unknown.", A0r));
                }
            }
            this.A0B = r2;
            return;
        }
        throw new NoSuchPaddingException("no padding supported for this algorithm");
    }

    public int engineUpdate(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        AnonymousClass5TM r2 = this.A0B;
        int i5 = i3;
        int i6 = i4;
        byte[] bArr3 = bArr2;
        if (r2.AGm(i3) + i4 <= bArr2.length) {
            try {
                return r2.Aar(bArr, i2, i5, bArr3, i6);
            } catch (AnonymousClass5JI e2) {
                throw AnonymousClass000.A0V(e2.toString());
            }
        } else {
            throw new ShortBufferException("output buffer too short for input.");
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i2, int i3) {
        AnonymousClass5TM r1 = this.A0B;
        int i4 = i3;
        int AGm = r1.AGm(i3);
        byte[] bArr2 = bArr;
        int i5 = i2;
        if (AGm > 0) {
            byte[] bArr3 = new byte[AGm];
            int Aar = r1.Aar(bArr2, i5, i4, bArr3, 0);
            if (Aar != 0) {
                if (Aar == AGm) {
                    return bArr3;
                }
                byte[] bArr4 = new byte[Aar];
                System.arraycopy(bArr3, 0, bArr4, 0, Aar);
                return bArr4;
            }
        } else {
            r1.Aar(bArr, i2, i3, (byte[]) null, 0);
        }
        return null;
    }

    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            byteBuffer.position(byteBuffer.limit());
        } else if (remaining <= 512) {
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, remaining);
            Arrays.fill(bArr, (byte) 0);
        } else {
            byte[] bArr2 = new byte[512];
            do {
                int min = Math.min(512, remaining);
                byteBuffer.get(bArr2, 0, min);
                engineUpdateAAD(bArr2, 0, min);
                remaining -= min;
            } while (remaining > 0);
            Arrays.fill(bArr2, (byte) 0);
        }
    }

    public void engineUpdateAAD(byte[] bArr, int i2, int i3) {
        this.A0B.AhM(bArr, i2, i3);
    }
}
