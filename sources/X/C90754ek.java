package X;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4ek  reason: invalid class name and case insensitive filesystem */
public class C90754ek {
    public static final Map A00;
    public static final AnonymousClass5IV A01 = C107275Hc.A00;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A00 = A0x;
        A0x.put(AnonymousClass5TY.A00, "Ed25519");
        A0x.put(AnonymousClass5TY.A01, "Ed448");
        A0x.put(C32341gA.A05, "SHA1withDSA");
        A0x.put(C32331g9.A0g, "SHA1withDSA");
    }

    public static String A00(C32041fY r4) {
        String A0e = C13690nt.A0e(r4, AnonymousClass4AH.A00);
        if (A0e == null) {
            A0e = r4.A01;
        }
        int indexOf = A0e.indexOf(45);
        if (indexOf <= 0 || A0e.startsWith("SHA3")) {
            return A0e;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K3.A1M(A0e, A0o, 0, indexOf);
        return AnonymousClass000.A0h(A0e.substring(indexOf + 1), A0o);
    }

    public static String A01(AnonymousClass5II r5) {
        AnonymousClass5IV r1;
        StringBuilder A0o;
        String str;
        C32071fb r2 = r5.A00;
        if (!(r2 == null || (r1 = A01) == r2 || r1.A09(r2.Agm()))) {
            C32041fY r12 = r5.A01;
            if (r12.A04(C32031fX.A0I)) {
                AnonymousClass5IB r22 = r2 instanceof AnonymousClass5IB ? (AnonymousClass5IB) r2 : new AnonymousClass5IB(C32411gJ.A00(r2));
                A0o = AnonymousClass000.A0o();
                A0o.append(A00(r22.A02.A01));
                str = "withRSAandMGF1";
            } else if (r12.A04(C32331g9.A0Y)) {
                C32411gJ A002 = C32411gJ.A00(r2);
                A0o = AnonymousClass000.A0o();
                A0o.append(A00((C32041fY) AnonymousClass3K3.A0u(A002)));
                str = "withECDSA";
            }
            return AnonymousClass000.A0h(str, A0o);
        }
        Map map = A00;
        C32041fY r52 = r5.A01;
        String A0e = C13690nt.A0e(r52, map);
        if (A0e != null) {
            return A0e;
        }
        Provider provider = Security.getProvider("SC");
        if (provider != null) {
            String property = provider.getProperty(AnonymousClass000.A0g("Alg.Alias.Signature.", r52));
            if (property != null) {
                return property;
            }
            String property2 = provider.getProperty(AnonymousClass000.A0g("Alg.Alias.Signature.OID.", r52));
            if (property2 != null) {
                return property2;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i2 = 0; i2 != providers.length; i2++) {
            if (provider != providers[i2]) {
                Provider provider2 = providers[i2];
                String property3 = provider2.getProperty(AnonymousClass000.A0g("Alg.Alias.Signature.", r52));
                if (property3 != null) {
                    return property3;
                }
                String property4 = provider2.getProperty(AnonymousClass000.A0g("Alg.Alias.Signature.OID.", r52));
                if (property4 != null) {
                    return property4;
                }
            }
        }
        return r52.A01;
    }

    public static void A02(String str, StringBuffer stringBuffer, byte[] bArr) {
        int length = bArr.length;
        stringBuffer.append("            Signature: ");
        if (length > 20) {
            stringBuffer.append(C32941ha.A02(C90584eP.A03(bArr, 0, 20)));
            stringBuffer.append(str);
            int i2 = 20;
            do {
                int i3 = length - 20;
                stringBuffer.append("                       ");
                stringBuffer.append(C32941ha.A02(i2 < i3 ? C90584eP.A03(bArr, i2, 20) : C90584eP.A03(bArr, i2, length - i2)));
                stringBuffer.append(str);
                i2 += 20;
            } while (i2 < length);
            return;
        }
        stringBuffer.append(C90584eP.A00(bArr));
        stringBuffer.append(str);
    }

    public static void A03(Signature signature, C32071fb r4) {
        AnonymousClass5IV r1;
        if (r4 != null && (r1 = A01) != r4 && !r1.A09(r4.Agm())) {
            AlgorithmParameters instance = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                instance.init(r4.Agm().A01());
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(instance.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e2) {
                        throw new SignatureException(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Exception extracting parameters: ")));
                    }
                }
            } catch (IOException e3) {
                throw new SignatureException(AnonymousClass000.A0h(e3.getMessage(), AnonymousClass000.A0r("IOException decoding parameters: ")));
            }
        }
    }
}
