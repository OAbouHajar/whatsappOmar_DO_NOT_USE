package X;

import javax.crypto.SecretKey;
import org.spongycastle.crypto.IDxPConverterShape61S0000000_2_I1;

/* renamed from: X.58W  reason: invalid class name */
public class AnonymousClass58W implements SecretKey {
    public final AnonymousClass5SF converter;
    public final char[] password;

    public AnonymousClass58W(AnonymousClass5SF r2, char[] cArr) {
        this.password = C33111hx.A03(cArr);
        this.converter = r2;
    }

    public String getAlgorithm() {
        return "PBKDF2";
    }

    public byte[] getEncoded() {
        AnonymousClass5SF r0 = this.converter;
        char[] cArr = this.password;
        switch (((IDxPConverterShape61S0000000_2_I1) r0).A00) {
            case 0:
                if (cArr == null) {
                    return new byte[0];
                }
                int length = cArr.length;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 != length; i2 = AnonymousClass3K4.A0C(bArr, cArr[i2], i2)) {
                }
                return bArr;
            case 1:
                return cArr != null ? C32941ha.A04(cArr) : new byte[0];
            default:
                return C89194bk.A00(cArr);
        }
    }

    public String getFormat() {
        switch (((IDxPConverterShape61S0000000_2_I1) this.converter).A00) {
            case 0:
                return "ASCII";
            case 1:
                return "UTF8";
            default:
                return "PKCS12";
        }
    }
}
