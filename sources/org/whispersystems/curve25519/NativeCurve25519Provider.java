package org.whispersystems.curve25519;

import X.AnonymousClass5Ap;
import X.AnonymousClass5T9;
import X.C47392Iu;

public class NativeCurve25519Provider implements AnonymousClass5T9 {
    public C47392Iu A00 = new C47392Iu();

    public NativeCurve25519Provider() {
        try {
            smokeCheck(31337);
        } catch (UnsatisfiedLinkError e2) {
            throw new AnonymousClass5Ap(e2);
        }
    }

    private native boolean smokeCheck(int i2);

    public byte[] A9P() {
        byte[] bArr = new byte[32];
        this.A00.A00(bArr);
        return generatePrivateKey(bArr);
    }

    public byte[] AFM(int i2) {
        byte[] bArr = new byte[64];
        this.A00.A00(bArr);
        return bArr;
    }

    public native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    public native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] generatePrivateKey(byte[] bArr);

    public native byte[] generatePublicKey(byte[] bArr);

    public native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
