package X;

import java.security.cert.CertificateEncodingException;

/* renamed from: X.5Jc  reason: invalid class name and case insensitive filesystem */
public class C107675Jc extends C105785Be {
    public final byte[] encoding;

    public C107675Jc(String str, C33091hv r9, AnonymousClass5I2 r10, AnonymousClass5NQ r11, byte[] bArr, byte[] bArr2, boolean[] zArr) {
        super(str, r9, r10, r11, bArr, zArr);
        this.encoding = bArr2;
    }

    public byte[] getEncoded() {
        byte[] bArr = this.encoding;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException();
    }
}
