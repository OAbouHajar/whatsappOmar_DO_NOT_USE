package X;

import java.math.BigInteger;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.jcajce.provider.symmetric.AES;
import org.spongycastle.jcajce.provider.symmetric.PBEPBKDF2;

/* renamed from: X.5BG  reason: invalid class name */
public abstract class AnonymousClass5BG extends AlgorithmParametersSpi {
    public static boolean A00(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        byte[] bArr;
        if (cls != null) {
            if (this instanceof PBEPBKDF2.AlgParams) {
                PBEPBKDF2.AlgParams algParams = (PBEPBKDF2.AlgParams) this;
                if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                    AnonymousClass5IA r1 = algParams.A00;
                    return new PBEParameterSpec(r1.A02.A00, new BigInteger(r1.A00.A01).intValue());
                }
                throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF2 PBE parameters object.");
            }
            if (this instanceof AES.AlgParamsGCM) {
                AES.AlgParamsGCM algParamsGCM = (AES.AlgParamsGCM) this;
                if (cls == AlgorithmParameterSpec.class || C89784cu.A00 == cls) {
                    if (C89784cu.A00 != null) {
                        return C89784cu.A00(algParamsGCM.A00.Agm());
                    }
                } else if (cls != C106035Cg.class) {
                    if (cls == IvParameterSpec.class) {
                        bArr = algParamsGCM.A00.A01;
                    } else {
                        throw new InvalidParameterSpecException(AnonymousClass000.A0h(cls.getName(), AnonymousClass000.A0r("AlgorithmParameterSpec not recognized: ")));
                    }
                }
                return new C106035Cg(C33111hx.A02(algParamsGCM.A00.A01), algParamsGCM.A00.A00 << 3);
            } else if (this instanceof AES.AlgParamsCCM) {
                AES.AlgParamsCCM algParamsCCM = (AES.AlgParamsCCM) this;
                if (cls == AlgorithmParameterSpec.class || C89784cu.A00 == cls) {
                    if (C89784cu.A00 != null) {
                        return C89784cu.A00(algParamsCCM.A00.Agm());
                    }
                } else if (cls != C106035Cg.class) {
                    if (cls == IvParameterSpec.class) {
                        bArr = algParamsCCM.A00.A01;
                    } else {
                        throw new InvalidParameterSpecException(AnonymousClass000.A0h(cls.getName(), AnonymousClass000.A0r("AlgorithmParameterSpec not recognized: ")));
                    }
                }
                return new C106035Cg(C33111hx.A02(algParamsCCM.A00.A01), algParamsCCM.A00.A00 << 3);
            } else {
                AES.AlgParams algParams2 = (AES.AlgParams) this;
                if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                    return new IvParameterSpec(algParams2.A00);
                }
                throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
            }
            return new IvParameterSpec(C33111hx.A02(bArr));
        }
        throw AnonymousClass000.A0W("argument to getParameterSpec must not be null");
    }
}
