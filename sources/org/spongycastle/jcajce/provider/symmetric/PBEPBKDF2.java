package org.spongycastle.jcajce.provider.symmetric;

import X.AnonymousClass000;
import X.AnonymousClass3K3;
import X.AnonymousClass43H;
import X.AnonymousClass58W;
import X.AnonymousClass58X;
import X.AnonymousClass5BG;
import X.AnonymousClass5IA;
import X.C106025Cf;
import X.C109715Th;
import X.C32031fX;
import X.C32051fZ;
import X.C32081fc;
import X.C32351gB;
import X.C32411gJ;
import X.C33001hh;
import X.C46932Gv;
import X.C89194bk;
import X.C90294du;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class PBEPBKDF2 {
    public static final Map A00;

    public class Mappings extends C33001hh {
        public static final String A00 = PBEPBKDF2.class.getName();
    }

    public class AlgParams extends AnonymousClass5BG {
        public AnonymousClass5IA A00;

        public byte[] engineGetEncoded() {
            try {
                return this.A00.A02("DER");
            } catch (IOException e2) {
                throw AnonymousClass000.A0a(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("Oooops! ")));
            }
        }

        public byte[] engineGetEncoded(String str) {
            if (AnonymousClass5BG.A00(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.A00 = new AnonymousClass5IA(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                return;
            }
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
        }

        public void engineInit(byte[] bArr) {
            C32051fZ A02 = C32051fZ.A02(bArr);
            this.A00 = A02 != null ? new AnonymousClass5IA(C32411gJ.A00(A02)) : null;
        }

        public void engineInit(byte[] bArr, String str) {
            if (AnonymousClass5BG.A00(str)) {
                engineInit(bArr);
                return;
            }
            throw AnonymousClass3K3.A0e("Unknown parameters format in PBKDF2 parameters object");
        }

        public String engineToString() {
            return "PBKDF2 Parameters";
        }
    }

    public class BasePBKDF2 extends C106025Cf {
        public int A00;
        public int A01;

        public BasePBKDF2(int i2, String str, int i3) {
            super(str, C32031fX.A0G);
            this.A01 = i2;
            this.A00 = i3;
        }

        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            KeySpec keySpec2 = keySpec;
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec2;
                if (pBEKeySpec.getSalt() == null) {
                    return new AnonymousClass58W(this.A01 == 1 ? AnonymousClass43H.A01 : AnonymousClass43H.A02, pBEKeySpec.getPassword());
                } else if (pBEKeySpec.getIterationCount() <= 0) {
                    throw new InvalidKeySpecException(AnonymousClass000.A0l(AnonymousClass000.A0r("positive iteration count required: "), pBEKeySpec.getIterationCount()));
                } else if (pBEKeySpec.getKeyLength() <= 0) {
                    throw new InvalidKeySpecException(AnonymousClass000.A0l(AnonymousClass000.A0r("positive key length required: "), pBEKeySpec.getKeyLength()));
                } else if (pBEKeySpec.getPassword().length != 0) {
                    int i2 = this.A00;
                    int keyLength = pBEKeySpec.getKeyLength();
                    int i3 = this.A01;
                    C89194bk A012 = C90294du.A01(i3, i2);
                    byte[] A02 = C90294du.A02(pBEKeySpec, i3);
                    byte[] salt = pBEKeySpec.getSalt();
                    int iterationCount = pBEKeySpec.getIterationCount();
                    A012.A01 = A02;
                    A012.A02 = salt;
                    A012.A00 = iterationCount;
                    C46932Gv A013 = A012.A01(keyLength);
                    for (int i4 = 0; i4 != A02.length; i4++) {
                        A02[i4] = 0;
                    }
                    return new AnonymousClass58X(this.A00, pBEKeySpec, this.A01, A013, i3, i2, keyLength, -1);
                } else {
                    throw AnonymousClass000.A0T("password empty");
                }
            } else {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }
    }

    public class PBKDF2with8BIT extends BasePBKDF2 {
        public PBKDF2with8BIT() {
            super(1, "PBKDF2", 1);
        }
    }

    public class PBKDF2withGOST3411 extends BasePBKDF2 {
        public PBKDF2withGOST3411() {
            super(5, "PBKDF2", 6);
        }
    }

    public class PBKDF2withSHA224 extends BasePBKDF2 {
        public PBKDF2withSHA224() {
            super(5, "PBKDF2", 7);
        }
    }

    public class PBKDF2withSHA256 extends BasePBKDF2 {
        public PBKDF2withSHA256() {
            super(5, "PBKDF2", 4);
        }
    }

    public class PBKDF2withSHA384 extends BasePBKDF2 {
        public PBKDF2withSHA384() {
            super(5, "PBKDF2", 8);
        }
    }

    public class PBKDF2withSHA3_224 extends BasePBKDF2 {
        public PBKDF2withSHA3_224() {
            super(5, "PBKDF2", 10);
        }
    }

    public class PBKDF2withSHA3_256 extends BasePBKDF2 {
        public PBKDF2withSHA3_256() {
            super(5, "PBKDF2", 11);
        }
    }

    public class PBKDF2withSHA3_384 extends BasePBKDF2 {
        public PBKDF2withSHA3_384() {
            super(5, "PBKDF2", 12);
        }
    }

    public class PBKDF2withSHA3_512 extends BasePBKDF2 {
        public PBKDF2withSHA3_512() {
            super(5, "PBKDF2", 13);
        }
    }

    public class PBKDF2withSHA512 extends BasePBKDF2 {
        public PBKDF2withSHA512() {
            super(5, "PBKDF2", 9);
        }
    }

    public class PBKDF2withSM3 extends BasePBKDF2 {
        public PBKDF2withSM3() {
            super(5, "PBKDF2", 14);
        }
    }

    public class PBKDF2withUTF8 extends BasePBKDF2 {
        public PBKDF2withUTF8() {
            super(5, "PBKDF2", 1);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A00 = hashMap;
        hashMap.put(C32081fc.A0J, 6);
        hashMap.put(C32031fX.A1E, 1);
        hashMap.put(C32031fX.A1G, 4);
        hashMap.put(C32031fX.A1F, 7);
        hashMap.put(C32031fX.A1H, 8);
        hashMap.put(C32031fX.A1I, 9);
        hashMap.put(C32351gB.A0g, 11);
        hashMap.put(C32351gB.A0f, 10);
        hashMap.put(C32351gB.A0h, 12);
        hashMap.put(C32351gB.A0i, 13);
        hashMap.put(C109715Th.A00, 14);
    }
}
