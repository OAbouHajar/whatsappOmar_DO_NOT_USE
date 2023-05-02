package X;

import java.security.cert.CRLException;

/* renamed from: X.5Ja  reason: invalid class name and case insensitive filesystem */
public class C107655Ja extends AnonymousClass5BZ {
    public final byte[] A00;

    public C107655Ja(String str, AnonymousClass5Hs r8, AnonymousClass5NQ r9, byte[] bArr, byte[] bArr2, boolean z2) {
        super(str, r8, r9, bArr, z2);
        this.A00 = bArr2;
    }

    public byte[] getEncoded() {
        byte[] bArr = this.A00;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
