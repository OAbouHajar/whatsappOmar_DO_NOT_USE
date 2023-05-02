package X;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: X.4du  reason: invalid class name and case insensitive filesystem */
public class C90294du {
    public static C46932Gv A00(String str, AlgorithmParameterSpec algorithmParameterSpec, AnonymousClass58X r6) {
        C46932Gv A02;
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw AnonymousClass000.A0T("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        AnonymousClass58X.A00(r6);
        int i2 = r6.type;
        AnonymousClass58X.A00(r6);
        C89194bk A01 = A01(i2, r6.digest);
        byte[] encoded = r6.getEncoded();
        if (r6.tryWrong) {
            encoded = new byte[2];
        }
        byte[] salt = pBEParameterSpec.getSalt();
        int iterationCount = pBEParameterSpec.getIterationCount();
        A01.A01 = encoded;
        A01.A02 = salt;
        A01.A00 = iterationCount;
        AnonymousClass58X.A00(r6);
        int i3 = r6.ivSize;
        AnonymousClass58X.A00(r6);
        if (i3 != 0) {
            int i4 = r6.keySize;
            AnonymousClass58X.A00(r6);
            A02 = A01.A03(i4, r6.ivSize);
        } else {
            A02 = A01.A02(r6.keySize);
        }
        if (str.startsWith("DES")) {
            C46932Gv r0 = A02;
            if (A02 instanceof C1054259l) {
                r0 = ((C1054259l) r0).A00;
            }
            AnonymousClass5JY.A00(((C46922Gu) r0).A00);
        }
        return A02;
    }

    public static C89194bk A01(int i2, int i3) {
        String str;
        if (i2 == 0 || i2 == 4) {
            if (i3 == 0) {
                return new AnonymousClass5JF(new AnonymousClass5JS());
            }
            if (i3 == 1) {
                return new AnonymousClass5JF(new AnonymousClass5JR());
            }
            if (i3 == 5) {
                return new AnonymousClass5JF(new AnonymousClass5AD());
            }
            str = "PKCS5 scheme 1 only supports MD2, MD5 and SHA1.";
        } else if (i2 == 1 || i2 == 5) {
            switch (i3) {
                case 0:
                    return new AnonymousClass5JH(new AnonymousClass5JS());
                case 1:
                    return new AnonymousClass5JH(new AnonymousClass5JR());
                case 2:
                    return new AnonymousClass5JH(new AnonymousClass5JQ());
                case 3:
                    return new AnonymousClass5JH(new AnonymousClass5AF());
                case 4:
                    return new AnonymousClass5JH(new AnonymousClass5JU());
                case 5:
                    return new AnonymousClass5JH(new AnonymousClass5AD());
                case 6:
                    return new AnonymousClass5JH(new AnonymousClass5AE());
                case 7:
                    return new AnonymousClass5JH(new AnonymousClass5JT());
                case 8:
                    return new AnonymousClass5JH(new AnonymousClass5JV());
                case 9:
                    return new AnonymousClass5JH(new AnonymousClass5JW());
                case 10:
                    return new AnonymousClass5JH(new AnonymousClass59m(224));
                case 11:
                    return new AnonymousClass5JH(new AnonymousClass59m(256));
                case 12:
                    return new AnonymousClass5JH(new AnonymousClass59m(384));
                case 13:
                    return new AnonymousClass5JH(new AnonymousClass59m(512));
                case 14:
                    return new AnonymousClass5JH(new AnonymousClass5JP());
                default:
                    str = "unknown digest scheme for PBE PKCS5S2 encryption.";
                    break;
            }
        } else if (i2 == 2) {
            switch (i3) {
                case 0:
                    return new AnonymousClass5JG(new AnonymousClass5JS());
                case 1:
                    return new AnonymousClass5JG(new AnonymousClass5JR());
                case 2:
                    return new AnonymousClass5JG(new AnonymousClass5JQ());
                case 3:
                    return new AnonymousClass5JG(new AnonymousClass5AF());
                case 4:
                    return new AnonymousClass5JG(new AnonymousClass5JU());
                case 5:
                    return new AnonymousClass5JG(new AnonymousClass5AD());
                case 6:
                    return new AnonymousClass5JG(new AnonymousClass5AE());
                case 7:
                    return new AnonymousClass5JG(new AnonymousClass5JT());
                case 8:
                    return new AnonymousClass5JG(new AnonymousClass5JV());
                case 9:
                    return new AnonymousClass5JG(new AnonymousClass5JW());
                default:
                    str = "unknown digest scheme for PBE encryption.";
                    break;
            }
        } else {
            return new AnonymousClass5JE();
        }
        throw AnonymousClass000.A0V(str);
    }

    public static byte[] A02(PBEKeySpec pBEKeySpec, int i2) {
        if (i2 == 2) {
            return C89194bk.A00(pBEKeySpec.getPassword());
        }
        if (i2 == 5 || i2 == 4) {
            char[] password = pBEKeySpec.getPassword();
            return password != null ? C32941ha.A04(password) : new byte[0];
        }
        char[] password2 = pBEKeySpec.getPassword();
        if (password2 == null) {
            return new byte[0];
        }
        int length = password2.length;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 != length; i3 = AnonymousClass3K4.A0C(bArr, password2[i3], i3)) {
        }
        return bArr;
    }
}
