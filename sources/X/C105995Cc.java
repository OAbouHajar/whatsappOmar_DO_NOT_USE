package X;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.5Cc  reason: invalid class name and case insensitive filesystem */
public abstract class C105995Cc extends CipherSpi implements AnonymousClass5NP {
    public int A00;
    public AlgorithmParameters A01;
    public C109575Sr A02;
    public AnonymousClass402 A03;
    public boolean A04;
    public byte[] A05;
    public Class[] A06;
    public final AnonymousClass5NQ A07 = A01(this);

    public C105995Cc() {
    }

    public C105995Cc(C109575Sr r2, int i2) {
        this.A02 = r2;
        this.A00 = i2;
    }

    public static AnonymousClass59X A00() {
        return new AnonymousClass59X(new C1053159a());
    }

    public static AnonymousClass5AA A01(C105995Cc r3) {
        r3.A06 = new Class[]{AnonymousClass56s.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        r3.A01 = null;
        r3.A02 = null;
        r3.A03 = null;
        return new AnonymousClass5AA();
    }

    public int engineDoFinal(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        byte[] bArr3;
        AnonymousClass402 r0 = this.A03;
        if (r0 != null) {
            r0.write(bArr, i2, i3);
            try {
                if (this.A04) {
                    C109575Sr r2 = this.A02;
                    AnonymousClass402 r02 = this.A03;
                    bArr3 = r2.AiA(r02.A01(), 0, r02.size());
                } else {
                    C109575Sr r22 = this.A02;
                    AnonymousClass402 r03 = this.A03;
                    bArr3 = r22.AhF(r03.A01(), 0, r03.size());
                }
                int length = bArr3.length;
                if (length + i4 <= bArr2.length) {
                    System.arraycopy(bArr3, 0, bArr2, i4, length);
                    this.A03.A00();
                    return length;
                }
                throw new ShortBufferException("output buffer too short for input.");
            } catch (AnonymousClass5JC e2) {
                throw new BadPaddingException(e2.getMessage());
            } catch (Exception e3) {
                throw new IllegalBlockSizeException(e3.getMessage());
            } catch (Throwable th) {
                this.A03.A00();
                throw th;
            }
        } else {
            throw AnonymousClass000.A0V("not supported in a wrapping mode");
        }
    }

    public byte[] engineDoFinal(byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        AnonymousClass402 r0 = this.A03;
        if (r0 != null) {
            if (bArr != null) {
                r0.write(bArr, i2, i3);
            }
            try {
                if (this.A04) {
                    C109575Sr r2 = this.A02;
                    AnonymousClass402 r02 = this.A03;
                    bArr2 = r2.AiA(r02.A01(), 0, r02.size());
                } else {
                    C109575Sr r22 = this.A02;
                    AnonymousClass402 r03 = this.A03;
                    bArr2 = r22.AhF(r03.A01(), 0, r03.size());
                }
                this.A03.A00();
                return bArr2;
            } catch (AnonymousClass5JC e2) {
                throw new BadPaddingException(e2.getMessage());
            } catch (Exception e3) {
                throw new IllegalBlockSizeException(e3.getMessage());
            } catch (Throwable th) {
                this.A03.A00();
                throw th;
            }
        } else {
            throw AnonymousClass000.A0V("not supported in a wrapping mode");
        }
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        return C33111hx.A02(this.A05);
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length << 3;
    }

    public int engineGetOutputSize(int i2) {
        return -1;
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.A01 == null && this.A05 != null) {
            String A9q = this.A02.A9q();
            int indexOf = A9q.indexOf(47);
            if (indexOf >= 0) {
                A9q = A9q.substring(0, indexOf);
            }
            try {
                AnonymousClass5Kd.A02(A9q, this).init(new IvParameterSpec(this.A05));
            } catch (Exception e2) {
                throw AnonymousClass000.A0a(e2.toString());
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
            java.lang.Class[] r2 = r3.A06
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
            r3.A01 = r6
            r3.engineInit((int) r4, (java.security.Key) r5, (java.security.spec.AlgorithmParameterSpec) r0, (java.security.SecureRandom) r7)
            return
        L_0x0027:
            java.lang.String r0 = "can't handle parameter "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass3K4.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105995Cc.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    public void engineInit(int i2, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i2, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new AnonymousClass5BI(e2.getMessage(), e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r10 != null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r7, java.security.Key r8, java.security.spec.AlgorithmParameterSpec r9, java.security.SecureRandom r10) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.AnonymousClass58X
            if (r0 == 0) goto L_0x0066
            X.58X r8 = (X.AnonymousClass58X) r8
            boolean r0 = r9 instanceof javax.crypto.spec.PBEParameterSpec
            if (r0 == 0) goto L_0x0059
            X.5Sr r0 = r6.A02
            java.lang.String r0 = r0.A9q()
            X.2Gv r3 = X.C90294du.A00(r0, r9, r8)
        L_0x0014:
            boolean r0 = r9 instanceof javax.crypto.spec.IvParameterSpec
            if (r0 == 0) goto L_0x0026
            javax.crypto.spec.IvParameterSpec r9 = (javax.crypto.spec.IvParameterSpec) r9
            byte[] r1 = r9.getIV()
            r6.A05 = r1
            X.59l r0 = new X.59l
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0026:
            boolean r0 = r3 instanceof X.C46922Gu
            r5 = 3
            r4 = 1
            if (r0 == 0) goto L_0x0056
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0056
            if (r7 == r5) goto L_0x0034
            if (r7 != r4) goto L_0x0056
        L_0x0034:
            byte[] r0 = new byte[r0]
            r6.A05 = r0
            r10.nextBytes(r0)
            byte[] r1 = r6.A05
            X.59l r0 = new X.59l
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0043:
            X.59g r0 = new X.59g
            r0.<init>(r10, r3)
            r3 = r0
        L_0x0049:
            if (r7 == r4) goto L_0x008f
            r0 = 2
            r2 = 0
            if (r7 == r0) goto L_0x0078
            r1 = 0
            if (r7 == r5) goto L_0x009c
            r0 = 4
            if (r7 != r0) goto L_0x0070
            goto L_0x0085
        L_0x0056:
            if (r10 == 0) goto L_0x0049
            goto L_0x0043
        L_0x0059:
            X.AnonymousClass58X.A00(r8)
            X.2Gv r0 = r8.param
            if (r0 == 0) goto L_0x00b1
            X.AnonymousClass58X.A00(r8)
            X.2Gv r3 = r8.param
            goto L_0x0014
        L_0x0066:
            byte[] r0 = r8.getEncoded()
            X.2Gu r3 = new X.2Gu
            r3.<init>(r0)
            goto L_0x0014
        L_0x0070:
            java.lang.String r1 = "Unknown mode parameter passed to init."
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch:{ Exception -> 0x00a6 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00a6 }
            throw r0     // Catch:{ Exception -> 0x00a6 }
        L_0x0078:
            X.5Sr r0 = r6.A02     // Catch:{ Exception -> 0x00a6 }
            r0.AI1(r3, r2)     // Catch:{ Exception -> 0x00a6 }
            X.402 r0 = new X.402     // Catch:{ Exception -> 0x00a6 }
            r0.<init>()     // Catch:{ Exception -> 0x00a6 }
            r6.A03 = r0     // Catch:{ Exception -> 0x00a6 }
            goto L_0x008c
        L_0x0085:
            X.5Sr r0 = r6.A02     // Catch:{ Exception -> 0x00a6 }
            r0.AI1(r3, r2)     // Catch:{ Exception -> 0x00a6 }
            r6.A03 = r1     // Catch:{ Exception -> 0x00a6 }
        L_0x008c:
            r6.A04 = r2     // Catch:{ Exception -> 0x00a6 }
            return
        L_0x008f:
            X.5Sr r0 = r6.A02     // Catch:{ Exception -> 0x00a6 }
            r0.AI1(r3, r4)     // Catch:{ Exception -> 0x00a6 }
            X.402 r0 = new X.402     // Catch:{ Exception -> 0x00a6 }
            r0.<init>()     // Catch:{ Exception -> 0x00a6 }
            r6.A03 = r0     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00a3
        L_0x009c:
            X.5Sr r0 = r6.A02     // Catch:{ Exception -> 0x00a6 }
            r0.AI1(r3, r4)     // Catch:{ Exception -> 0x00a6 }
            r6.A03 = r1     // Catch:{ Exception -> 0x00a6 }
        L_0x00a3:
            r6.A04 = r4     // Catch:{ Exception -> 0x00a6 }
            return
        L_0x00a6:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            X.5BI r0 = new X.5BI
            r0.<init>(r1, r2)
            throw r0
        L_0x00b1:
            java.lang.String r0 = "PBE requires PBE parameters to be set."
            java.security.InvalidAlgorithmParameterException r0 = X.AnonymousClass3K4.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105995Cc.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    public void engineSetMode(String str) {
        throw new NoSuchAlgorithmException(AnonymousClass000.A0h(str, AnonymousClass000.A0r("can't support mode ")));
    }

    public void engineSetPadding(String str) {
        StringBuilder A0r = AnonymousClass000.A0r("Padding ");
        A0r.append(str);
        throw new NoSuchPaddingException(AnonymousClass000.A0h(" unknown.", A0r));
    }

    public Key engineUnwrap(byte[] bArr, String str, int i2) {
        try {
            C109575Sr r2 = this.A02;
            byte[] engineDoFinal = r2 == null ? engineDoFinal(bArr, 0, bArr.length) : r2.AhF(bArr, 0, bArr.length);
            if (i2 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            if (!str.equals("") || i2 != 2) {
                try {
                    KeyFactory instance = KeyFactory.getInstance(str, ((AnonymousClass5AA) this.A07).A00);
                    if (i2 == 1) {
                        return instance.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                    }
                    if (i2 == 2) {
                        return instance.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                    }
                    throw new InvalidKeyException(C13680ns.A0i("Unknown key type ", AnonymousClass000.A0o(), i2));
                } catch (NoSuchProviderException e2) {
                    throw new InvalidKeyException(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0q("Unknown key type ")));
                } catch (InvalidKeySpecException e3) {
                    throw new InvalidKeyException(AnonymousClass000.A0h(e3.getMessage(), AnonymousClass000.A0q("Unknown key type ")));
                }
            } else {
                try {
                    C32041fY r22 = (engineDoFinal instanceof AnonymousClass5Hk ? (AnonymousClass5Hk) engineDoFinal : new AnonymousClass5Hk(C32411gJ.A00(engineDoFinal))).A04.A01;
                    Map map = AnonymousClass1UN.A00;
                    synchronized (map) {
                        try {
                            map.get(r22);
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("algorithm ");
                    A0o.append(r22);
                    th = new InvalidKeyException(AnonymousClass000.A0h(" not supported", A0o));
                    throw th;
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
        } catch (AnonymousClass5JC e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (BadPaddingException e5) {
            throw new InvalidKeyException(e5.getMessage());
        } catch (IllegalBlockSizeException e6) {
            throw new InvalidKeyException(e6.getMessage());
        }
    }

    public int engineUpdate(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        AnonymousClass402 r0 = this.A03;
        if (r0 != null) {
            r0.write(bArr, i2, i3);
            return 0;
        }
        throw AnonymousClass000.A0V("not supported in a wrapping mode");
    }

    public byte[] engineUpdate(byte[] bArr, int i2, int i3) {
        AnonymousClass402 r0 = this.A03;
        if (r0 != null) {
            r0.write(bArr, i2, i3);
            return null;
        }
        throw AnonymousClass000.A0V("not supported in a wrapping mode");
    }

    public byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                C109575Sr r2 = this.A02;
                return r2 == null ? engineDoFinal(encoded, 0, encoded.length) : r2.AiA(encoded, 0, encoded.length);
            } catch (BadPaddingException e2) {
                throw new IllegalBlockSizeException(e2.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }
}
